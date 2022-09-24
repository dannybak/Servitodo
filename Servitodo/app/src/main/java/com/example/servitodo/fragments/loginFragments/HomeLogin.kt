package com.example.servitodo.fragments.loginFragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.servitodo.R
import com.example.servitodo.viewModels.loginViewModels.HomeLoginViewModel

class HomeLogin : Fragment() {

    lateinit var v : View

    companion object {
        fun newInstance() = HomeLogin()
    }

    private lateinit var viewModel: HomeLoginViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.fragment_home_login, container, false)



        return v
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HomeLoginViewModel::class.java)
        // TODO: Use the ViewModel
    }

}