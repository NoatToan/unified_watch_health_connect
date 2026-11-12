package com.huami.watch.companion.account;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.huami.watch.util.Box;
import com.huami.watch.util.Log;
import com.xiaomi.hm.health.keeper.HMWebKeeper;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;

/* JADX INFO: loaded from: classes16.dex */
public class UserInfoManager {
    public static final String TAG = "UserInfo-Manager";
    private static UserInfo a;

    public static void clear() {
        Log.w(TAG, "Clear!!", new Object[0]);
        a = null;
        Box.putUserInfo(null);
    }

    public static UserInfo get() {
        if (a == null) {
            a = new UserInfo();
        }
        HMUserInfo userInfo = HMPersonInfo.getInstance().getUserInfo();
        if (userInfo == null) {
            UserInfo userInfo2 = new UserInfo();
            a = userInfo2;
            return userInfo2;
        }
        a.setAvatar(userInfo.getAvatarPath());
        a.setAvatarLocalUri(userInfo.getAvatar());
        a.setGender(userInfo.getGender());
        a.setHeight(userInfo.getHeight());
        a.setNickname(userInfo.getNickname());
        a.setWeight(userInfo.getWeight());
        a.setBirthday(new UserInfo.Birthday(userInfo.getBirthday()));
        a.setCountry(HMWebKeeper.getLastSelectAreaCode());
        return a;
    }

    public static boolean hasEmptyInfo(UserInfo userInfo) {
        return userInfo.getGender() == -1 || TextUtils.isEmpty(userInfo.getNickname()) || userInfo.getBirthday().isEmpty() || userInfo.getHeight() == -1 || userInfo.getWeight() == -1.0f;
    }

    public static void reset() {
        a = null;
    }

    public static void save(UserInfo userInfo) {
        Log.d(TAG, "Save : " + userInfo, new Object[0]);
        a = userInfo;
        Box.putUserInfo(new Gson().toJson(userInfo));
    }
}
