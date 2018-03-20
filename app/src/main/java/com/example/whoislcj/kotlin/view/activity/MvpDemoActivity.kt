package com.example.whoislcj.kotlin.view.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.whoislcj.kotlin.model.bean.UserInfo
import com.example.whoislcj.kotlin.presenter.impl.LoadDataPresenter
import com.example.whoislcj.kotlin.view.interfaces.ILoadDataView
import com.example.whoislcj.testproject.R

class MvpDemoActivity : AppCompatActivity() ,ILoadDataView<UserInfo> {
    lateinit var userInfoTv:TextView;
    lateinit var loadDataPresenter: LoadDataPresenter;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvp_demo)
        loadDataPresenter= LoadDataPresenter(this);

        userInfoTv =findViewById(R.id.text_user_info);

        userInfoTv.setOnClickListener {
            loadDataPresenter.loadData();
        }
    }

    override fun startLoading() {
    }

    override fun finishLoading() {
    }

    override fun loadSuccess(result: UserInfo) {
        userInfoTv.text=String.format("name:%s age:%d",result.name,result.age);
    }

    override fun loadFailed() {
    }
}
