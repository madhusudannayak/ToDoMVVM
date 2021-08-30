package com.example.todomvvm.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.todomvvm.ui.addedittask.AddEditTaskViewModel


abstract class BaseFragment<v : ViewDataBinding> : Fragment() {

    lateinit var binding: v


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
                inflater,
                getFragmentView(),
                container,
                false
        )


        return binding.root
    }

    abstract fun getFragmentView(): Int
}