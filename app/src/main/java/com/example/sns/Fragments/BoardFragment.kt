package com.example.sns.Fragments


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sns.R
import com.example.sns.databinding.FragmentBoardBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.Query
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase


class BoardFragment : Fragment() {
    private var binding: FragmentBoardBinding? = null
    private lateinit var auth: FirebaseAuth
    val db = Firebase.firestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?,
//    ) {
//        Log.d("lifecycletest", "onCreateView")
//
//        binding = FragmentBoardBinding.inflate(inflater, container, false)
//
//
//
//        }










    //글 작성후에 다시 프래그먼트로 돌아왔을 때 새로 그리기
    override fun onResume() {
        super.onResume()
        Log.d("lifecycletest", "onResume")




    }



    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("lifecycletest", "onDestroyView")


        binding = null
    }


}