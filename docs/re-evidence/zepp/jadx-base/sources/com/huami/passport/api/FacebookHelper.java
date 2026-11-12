package com.huami.passport.api;

import android.text.TextUtils;
import com.facebook.AccessToken;

/* JADX INFO: loaded from: classes12.dex */
public class FacebookHelper {
    public static boolean verifyAccessToken(AccessToken accessToken) {
        return (accessToken == null || TextUtils.isEmpty(accessToken.getToken()) || TextUtils.isEmpty(accessToken.getUserId())) ? false : true;
    }
}
