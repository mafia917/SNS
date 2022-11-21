package com.example.sns

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

import com.example.sns.databinding.ActivityLoginBinding
import com.example.sns.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityLoginBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        /*
        replacement(1)

        //#########Fragment 화면전환
        binding.btBoard.setOnClickListener { replacement(1) }
        binding.btHome.setOnClickListener { replacement(2) }
        binding.btTodo.setOnClickListener { replacement(3) }
        binding.btTip.setOnClickListener { replacement(4) }


         */

    }

    //뒤로가기 버튼 경고메세지 2초 텀
    var mBackWait: Long = 0

    override fun onBackPressed() {
        if (System.currentTimeMillis() - mBackWait >= 2000) {
            mBackWait = System.currentTimeMillis()
            Toast.makeText(this, "뒤로가기 버튼을 한번 더 누르면 종료됩니다.", Toast.LENGTH_LONG).show()
        } else {
            finish()
        }
    }

    /*
    //프레그먼트 전환
    fun replacement(number: Int) {
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            when (number) {
                1 -> replace<BoardFragment>(R.id.main_my_fragment)
                2 -> replace<HomeFragment>(R.id.main_my_fragment)
                3 -> replace<TodoFragment>(R.id.main_my_fragment)
                4 -> replace<TipFragment>(R.id.main_my_fragment)
                else -> return@commit
            }
            if(number == 2){
                val loading = LoadingDialog(this@MainActivity)
                loading.startLoading()
                val handler = Handler()
                handler.postDelayed(object : Runnable{
                    override fun run() {
                        loading.isDismiss()
                    }
                },2000)
            }
            addToBackStack(null)
        }

    }



    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.userinfo -> {
                val intent = Intent(this, UserInfoActivity::class.java)
                startActivity(intent)
            }

            R.id.logout -> {
                AlertDialog.Builder(this)
                    .setTitle("로그아웃")
                    .setMessage("정말 로그아웃 하시겠습니까?")
                    .setNegativeButton("로그아웃"){_,_->
                        auth.signOut()
                        val intent = Intent(this, LoginActivity::class.java)
                        startActivity(intent)
                        finish()
                    }
                    .setPositiveButton("취소"){_,_->}
                    .create()
                    .show()
            }
        }
        return super.onContextItemSelected(item)
    }
    */



}