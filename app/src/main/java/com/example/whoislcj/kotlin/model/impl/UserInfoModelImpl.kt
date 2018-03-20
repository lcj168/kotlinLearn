package com.example.whoislcj.kotlin.model.impl

import com.example.whoislcj.kotlin.model.bean.UserInfo
import com.example.whoislcj.kotlin.model.interfaces.GetUserInfoListener
import com.example.whoislcj.kotlin.model.interfaces.IUserInfoModel
import java.util.logging.Handler

/**
 * Created by whoislcj on 2018/3/20.
 */
class UserInfoModelImpl : IUserInfoModel {


    override fun getUserInfo(listener: GetUserInfoListener) {
        android.os.Handler().postDelayed({
            val userInfo = UserInfo();
            userInfo.age = 28;
            userInfo.name = "lcj";
            listener.onGetUserInfo(userInfo);
        },5000)
    }


}