package com.example.loginlogictest_200806

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        로그인 버튼이 눌렸을때 => 검사 수행
        loginBtn.setOnClickListener {

//            아이디에 입력된 값 (코틀린에서 xml속성접근) / 비번에 입력된값저장(변수)
            val inputId = idEdt.text.toString()
            val inputPw = pwEdt.text.toString()

//            저장된 값들 검사 => 상황에 따른 행동 (조건문)
            if (inputId == "admin@test.com" && inputPw == "qwer"){
                Toast.makeText(this,"관리자입니다",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"로그인 실패",Toast.LENGTH_SHORT).show()
            }

        }

    }
}