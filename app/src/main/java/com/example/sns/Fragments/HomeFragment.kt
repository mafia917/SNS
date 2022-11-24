package com.example.sns.Fragments


import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.sns.Data.LoadingDialog
import com.example.sns.MainActivity
import com.example.sns.R
import com.example.sns.databinding.FragmentHomeBinding
import kotlinx.coroutines.*
import java.lang.Runnable


class HomeFragment : Fragment() {

    private var binding: FragmentHomeBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {


        binding = FragmentHomeBinding.inflate(inflater, container, false)
        val activity = context as MainActivity

        val Main = context as MainActivity




        Log.d("HomeFragment", "onCreateView")



        return binding!!.root
    }

    fun refreshFragment() {
        val mainActivity = (activity as MainActivity)
        mainActivity.supportFragmentManager.commit {
            setReorderingAllowed(true)
            replace<HomeFragment>(R.id.main_my_fragment)
        }

        Log.d("Fragment", "Replace")
    }
}
