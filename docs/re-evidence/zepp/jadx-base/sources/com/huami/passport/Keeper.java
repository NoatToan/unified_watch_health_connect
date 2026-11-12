package com.huami.passport;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.gson.GsonBuilder;
import com.huami.passport.entity.CompatEntity;
import com.huami.passport.entity.LoginToken;
import java.util.UUID;

/* JADX INFO: loaded from: classes12.dex */
public class Keeper {
    public static final String DEVICE_UUID = "device_uuid";
    public static final String DOMAIN_DEBUG_MAPPING_KEY = "domain_debug_mapping_key";
    public static final String DOMAIN_KEY = "domain_key";
    public static final String DOMAIN_MAPPING_KEY = "domain_mapping_key";
    public static final String LOGIN_TOKEN = "ti";
    public static final String OLD_LOGIN_TOKEN = "login_token";
    private static final String PREFERENCES_NAME = "hm_id_sdk_android";
    private static volatile LoginToken mTokenCache;

    public static String buildKeyForDomainCache(String str, String str2) {
        return str + ":" + str2;
    }

    public static boolean clearEntity(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return context.getSharedPreferences(PREFERENCES_NAME, 32768).edit().remove(str).commit();
    }

    public static synchronized boolean clearToken(Context context) {
        mTokenCache = null;
        return clearEntity(context, LOGIN_TOKEN);
    }

    public static void compatCheck(Context context) {
        CompatEntity compatEntity;
        if (!isEntityExist(context, "login_token") || (compatEntity = (CompatEntity) readEntity(context, "login_token", CompatEntity.class)) == null) {
            return;
        }
        saveToken(context, compatEntity.buildLoginToken());
        clearEntity(context, "login_token");
    }

    public static String getLoginToken(Context context) {
        try {
            return new GsonBuilder().create().toJson(getTokenCache(context));
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static synchronized LoginToken getTokenCache(Context context) {
        if (mTokenCache == null) {
            mTokenCache = (LoginToken) readEntity(context.getApplicationContext(), LOGIN_TOKEN, LoginToken.class);
        }
        return mTokenCache;
    }

    public static boolean isEntityExist(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return !TextUtils.isEmpty(context.getSharedPreferences(PREFERENCES_NAME, 32768).getString(str, ""));
    }

    public static synchronized String readDeviceUuid(Context context) {
        String string;
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES_NAME, 0);
        string = sharedPreferences.getString(DEVICE_UUID, "");
        if (TextUtils.isEmpty(string)) {
            string = UUID.randomUUID().toString();
            sharedPreferences.edit().putString(DEVICE_UUID, string).apply();
        }
        return string;
    }

    public static <T> T readEntity(Context context, String str, Class<T> cls) {
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        String string = context.getSharedPreferences(PREFERENCES_NAME, 32768).getString(str, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return (T) new GsonBuilder().create().fromJson(string, (Class) cls);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String readString(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return context.getSharedPreferences(PREFERENCES_NAME, 32768).getString(str, "");
    }

    public static boolean saveLoginToken(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return saveToken(context, (LoginToken) new GsonBuilder().create().fromJson(str, LoginToken.class));
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static synchronized boolean saveToken(Context context, LoginToken loginToken) {
        if (!writeEntity(context, LOGIN_TOKEN, loginToken)) {
            return false;
        }
        mTokenCache = loginToken;
        return true;
    }

    public static <T> boolean writeEntity(Context context, String str, T t) {
        if (t != null && context != null && !TextUtils.isEmpty(str)) {
            try {
                String json = new GsonBuilder().create().toJson(t);
                SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREFERENCES_NAME, 32768).edit();
                editorEdit.putString(str, json);
                return editorEdit.commit();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean writeString(Context context, String str, String str2) {
        if (str2 == null || context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREFERENCES_NAME, 32768).edit();
        editorEdit.putString(str, str2);
        return editorEdit.commit();
    }
}
