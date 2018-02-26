package com.bpplatform.howlfragmentlifecycle

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by myeongsic on 2018. 2. 26..
 */

class MyFragment  : Fragment(){
    //시작 할때
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater!!.inflate(R.layout.myfragment,container,false)
        return view
    }
    //프래그먼트가 뷰에 나타나기 전에
    override fun onStart() {
        super.onStart()
    }
    //프래그먼트가 뷰에 나타난 상태
    override fun onResume() {
        super.onResume()
    }
    //프래그먼트 반만 가려진 상태
    override fun onPause() {
        super.onPause()
    }
    //프래그먼트 정지
    override fun onStop() {
        super.onStop()
    }
    //프래그먼트가 제거
    override fun onDetach() {
        super.onDetach()
    }
}