package com.example.todomvvm.ui.deleteallcompleted

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.todomvvm.data.TaskDao
import com.example.todomvvm.di.ApplicationScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

class DeleteAllCompletedViewModel @ViewModelInject constructor(
    val taskDao: TaskDao,
    @ApplicationScope val applicationScope: CoroutineScope
) : ViewModel() {
    fun onConfirmClick()= applicationScope.launch {
        taskDao.deleteCompletedTask()
    }
}