package com.example.viewpagerfragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

     //뷰 페이저 에서 프레그먼트들 연결할라고 FragmentAdapter는 프래그먼트 담을수 있다.
class FragmentAdapter(fm: FragmentManager, behavior: Int) : FragmentPagerAdapter(fm, behavior) {

    var fragmentList = listOf<Fragment>()  //안에 있는 fragment타입은 내가 fragment파일로 만든것들 인거 같다

    override fun getItem(position: Int): Fragment {
         //이 메소드는 현제 페이지의 position이 파라미터로 넘어옴
        return fragmentList.get(position)
    }

    override fun getCount(): Int {
        //어댑터가 화면에 보여줄 전제 프래그먼트의 개수를 반환해야 합니다.
        return fragmentList.size
    }


}