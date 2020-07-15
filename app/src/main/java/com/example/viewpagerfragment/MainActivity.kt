package com.example.viewpagerfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentList = listOf(FragmentA(), FragmentB(), FragmentC())
            //support녀석은 어떤 동작했을때 그 fragment쪽으로 가게 도와주는 역활
        val adapter = FragmentAdapter(supportFragmentManager,1) //이런 내용 해야지 연결해주는 역활 한다고 생각하기
        adapter.fragmentList = fragmentList
        viewPager.adapter = adapter

    }
}