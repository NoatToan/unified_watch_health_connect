package com.huami.watch.companion.cloud.api;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.watch.companion.account.Account;
import com.huami.watch.companion.account.UserInfo;
import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.companion.cloud.CloudClient;
import com.huami.watch.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Response;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class UserInfoAPI {
    private static final String a = "Cloud-API-UserInfo";

    public static final class GetUserInfoResult {
        public UserInfo info;
        public boolean isNewUser;
        public boolean isSuccess;

        public String toString() {
            return "<IsSuccess : " + this.isSuccess + ", isNewUser : " + this.isNewUser + ", Info : " + this.info + SearchCriteria.GT;
        }
    }

    public static final class PostUserInfoResult {
        public String avatarUrl;
        public boolean success;

        public String toString() {
            return "<Success : " + this.success + ", AvatarUrl : " + this.avatarUrl + SearchCriteria.GT;
        }
    }

    private UserInfoAPI() {
    }

    private static boolean a(UserInfo userInfo) {
        return !TextUtils.isEmpty(userInfo.getAvatarLocalUri()) && TextUtils.isEmpty(userInfo.getAvatar());
    }

    private static String b(String str, UserInfo userInfo, String str2, Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userId", str);
            jSONObject.put("applicationName", map.get("appname"));
            jSONObject.put("applicationPlatform", map.get("appplatform"));
            jSONObject.put("country", map.get("country"));
            jSONObject.put("birthday", userInfo.getBirthday().format());
            jSONObject.put("gender", String.valueOf(userInfo.getGender()));
            jSONObject.put("height", String.valueOf(userInfo.getHeight()));
            jSONObject.put("weight", String.valueOf(userInfo.getWeight()));
            jSONObject.put("nickName", userInfo.getNickname());
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("iconUrl", str2);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    private static String c(Context context, UserInfo userInfo) {
        File file;
        if (TextUtils.isEmpty(userInfo.getAvatarLocalUri())) {
            file = null;
        } else {
            String path = Uri.parse(userInfo.getAvatarLocalUri()).getPath();
            if (TextUtils.isEmpty(path)) {
                file = null;
            } else {
                file = new File(path);
            }
        }
        String strUploadPicture = file != null ? FileUploadAPI.uploadPicture(context, file) : null;
        Log.d(a, "Upload UserInfo Avatar Result : " + strUploadPicture, new Object[0]);
        return strUploadPicture;
    }

    @NonNull
    public static GetUserInfoResult getUserInfo(Context context) {
        GetUserInfoResult getUserInfoResult = new GetUserInfoResult();
        UserInfo userInfo = null;
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newGet(Cloud.urlUserInfoAPI(Account.getUID(context))));
            String strResponseBodyString = CloudClient.responseBodyString(responseDoRequest);
            if (responseDoRequest.isSuccessful()) {
                getUserInfoResult.isSuccess = true;
                if (!TextUtils.isEmpty(strResponseBodyString)) {
                    try {
                        userInfo = parseUserInfo(new JSONObject(strResponseBodyString));
                    } catch (JSONException e) {
                        e.printStackTrace();
                        Log.w(a, "Get UserInfo Failed!!", e, new Object[0]);
                    }
                }
            } else if (responseDoRequest.code() == 404) {
                getUserInfoResult.isSuccess = true;
                getUserInfoResult.isNewUser = true;
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            Log.w(a, "Get UserInfo Failed!!", e2, new Object[0]);
        }
        getUserInfoResult.info = userInfo;
        Log.d(a, "Get UserInfo Result : " + getUserInfoResult, new Object[0]);
        return getUserInfoResult;
    }

    public static UserInfo parseUserInfo(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        UserInfo userInfo = new UserInfo();
        userInfo.setNickname(jSONObject.optString("nickName"));
        userInfo.setGender(jSONObject.optInt("gender", -1));
        userInfo.setAvatar(jSONObject.optString("iconUrl"));
        if (TextUtils.isEmpty(userInfo.getAvatar())) {
            userInfo.setAvatar(jSONObject.optString("originalAvatar"));
        }
        userInfo.setHeight(jSONObject.optInt("height", -1));
        userInfo.setWeight((float) jSONObject.optDouble("weight", -1.0d));
        userInfo.setBirthday(new UserInfo.Birthday(jSONObject.optString("birthday")));
        userInfo.setLastUpdateTime(jSONObject.optLong("lastUpdateTime", 0L));
        return userInfo;
    }

    @NonNull
    public static PostUserInfoResult postUserInfo(Context context, @Nullable UserInfo userInfo) {
        String avatar;
        PostUserInfoResult postUserInfoResult = new PostUserInfoResult();
        Log.d(a, "UserInfo : " + userInfo, new Object[0]);
        if (userInfo == null) {
            Log.w(a, "UserInfo is NULL!!", new Object[0]);
            return postUserInfoResult;
        }
        if (a(userInfo)) {
            avatar = c(context, userInfo);
            if (TextUtils.isEmpty(avatar)) {
                Log.w(a, "Upload UserInfo Avatar Failed!!", new Object[0]);
                return postUserInfoResult;
            }
            postUserInfoResult.avatarUrl = avatar;
        } else {
            avatar = userInfo.getAvatar();
        }
        String strB = b(Account.getUID(context), userInfo, avatar, Cloud.SysParams.get(context));
        Log.d(a, "Post UserInfo Body : " + strB, new Object[0]);
        HashMap map = new HashMap();
        map.put("Content-Type", "application/json");
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newPost(Cloud.urlUserInfoAPI(), map, strB, "application/json"));
            CloudClient.responseBodyString(responseDoRequest);
            if (responseDoRequest.isSuccessful()) {
                postUserInfoResult.success = true;
            } else {
                Log.w(a, "Post UserInfo Failed!!", new Object[0]);
            }
        } catch (IOException e) {
            e.printStackTrace();
            Log.w(a, "Post UserInfo Error!!", e, new Object[0]);
        }
        Log.d(a, "Result : " + postUserInfoResult, new Object[0]);
        return postUserInfoResult;
    }
}
