package com.huami.passport.user;

import android.content.Context;
import com.huami.passport.entity.LoginInfo;

/* JADX INFO: loaded from: classes12.dex */
public class Keeper {
    public static final String USER_LOGIN_KEY = "ulk";
    private static volatile LoginInfo mUserLoginCache;

    public static synchronized LoginInfo getLoginInfo(Context context) {
        if (mUserLoginCache == null) {
            mUserLoginCache = (LoginInfo) com.huami.passport.Keeper.readEntity(context, USER_LOGIN_KEY, LoginInfo.class);
        }
        return mUserLoginCache;
    }

    public static synchronized boolean setLoginInfo(Context context, LoginInfo loginInfo) {
        if (loginInfo == null) {
            return false;
        }
        if (!com.huami.passport.Keeper.writeEntity(context, USER_LOGIN_KEY, loginInfo)) {
            return false;
        }
        mUserLoginCache = loginInfo;
        return true;
    }
}
