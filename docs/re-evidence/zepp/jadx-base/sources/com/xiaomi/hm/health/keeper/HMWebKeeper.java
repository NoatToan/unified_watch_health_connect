package com.xiaomi.hm.health.keeper;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.google.gson.reflect.TypeToken;
import com.huami.network.base.util.HMHttpUtils;
import com.huami.network.hmnetwork.model.account.LoginData;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class HMWebKeeper {
    public static final String KEY_LAST_SELECT_AREA = "KEY_LAST_SELECT_AREA";
    public static final String KEY_LAST_SELECT_AREA_CODE = "KEY_LAST_SELECT_AREA_CDOE";
    private static SharedPreferences a = null;
    private static final long b = -1;
    private static final String c = "huami_uid";
    private static final String d = "third_uid";
    private static final String e = "uid";
    private static final String f = "security";
    private static final String g = "security_encrypt";
    private static final String h = "need_update_running";
    public static final String i = "XIAOMI_TOKEN_SAVE_TIME";
    public static final String j = "XIAOMI_REFRESH_TOKEN";
    public static final String k = "XIAOMI_ACCESS_TOKEN";
    public static final String l = "XIAOMI_USER_ID";
    public static final String m = "XIAOMI_USER_EXPIRES_IN";
    public static final String n = "XIAOMI_HAS_IOT";

    public class a extends TypeToken<List<String>> {
    }

    public static long getExpiresIn() {
        return a.getLong(m, 0L);
    }

    public static String getLastSelectArea() {
        return a.getString(KEY_LAST_SELECT_AREA, "");
    }

    public static String getLastSelectAreaCode() {
        return a.getString(KEY_LAST_SELECT_AREA_CODE, "");
    }

    public static boolean getNeedUpdateRunning() {
        return a.getBoolean(h, true);
    }

    public static String getUrl(String str) {
        return a.getString(str, "");
    }

    public static List<String> getUrlList(String str) {
        return (List) HMHttpUtils.getGson().fromJson(a.getString(str, ""), new a().getType());
    }

    public static String getXiaomiAccessToken() {
        return a.getString(k, null);
    }

    public static String getXiaomiRefreshToken() {
        return a.getString(j, null);
    }

    public static long getXiaomiTokenSaveTime() {
        return a.getLong(i, 0L);
    }

    public static String getXiaomiUserId() {
        return a.getString(l, null);
    }

    public static boolean hasIoT() {
        return a.getBoolean(n, false);
    }

    public static void init(SharedPreferences sharedPreferences) {
        a = sharedPreferences;
    }

    public static void keepLoginData(String str, String str2, String str3) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString(c, str);
        editorEdit.putString(d, str2);
        editorEdit.putLong("uid", -1L);
        editorEdit.putString("security", null);
        if (!TextUtils.isEmpty(str3)) {
            str3 = Base64.encodeToString(str3.getBytes(), 2);
        }
        editorEdit.putString(g, str3);
        editorEdit.apply();
    }

    public static LoginData readLoginData() {
        LoginData loginData = new LoginData();
        long j2 = a.getLong("uid", -1L);
        String string = a.getString(c, null);
        String string2 = a.getString(d, null);
        String string3 = a.getString("security", null);
        String string4 = a.getString(g, null);
        SharedPreferences.Editor editorEdit = a.edit();
        if (j2 > -1 && TextUtils.isEmpty(string2)) {
            string2 = String.valueOf(j2);
            editorEdit.putLong("uid", -1L);
            editorEdit.putString(d, string2);
        }
        if (TextUtils.isEmpty(string3)) {
            string3 = TextUtils.isEmpty(string4) ? string4 : new String(Base64.decode(string4, 2));
        } else {
            editorEdit.putString("security", null);
            editorEdit.putString(g, TextUtils.isEmpty(string3) ? string3 : Base64.encodeToString(string3.getBytes(), 2));
        }
        editorEdit.apply();
        loginData.setHuamiUid(string);
        loginData.setThirdUid(string2);
        loginData.setSecurity(string3);
        return loginData;
    }

    public static void saveXiaomiToken(String str, String str2, String str3, long j2, boolean z) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putLong(i, System.currentTimeMillis());
        editorEdit.putString(j, str);
        editorEdit.putString(k, str2);
        editorEdit.putString(l, str3);
        editorEdit.putLong(m, j2);
        editorEdit.putBoolean(n, z);
        editorEdit.apply();
    }

    public static void setLastSelectArea(String str) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString(KEY_LAST_SELECT_AREA, str);
        editorEdit.apply();
    }

    public static void setLastSelectAreaCode(String str) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString(KEY_LAST_SELECT_AREA_CODE, str);
        editorEdit.apply();
    }

    public static void setNeedUpdateRunning(boolean z) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean(h, z);
        editorEdit.apply();
    }

    public static void setUrl(String str, String str2) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public static void setUrlList(String str, List<String> list) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString(str, HMHttpUtils.getGson().toJson(list));
        editorEdit.apply();
    }
}
