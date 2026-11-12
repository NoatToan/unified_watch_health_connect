package com.xiaomi.smarthome.library.securecompact;

import android.content.ContentResolver;
import android.provider.Settings;
import android.text.TextUtils;
import com.tencent.mmkv.MMKV;
import com.xiaomi.smarthome.library.MiJiaEnvironment;

/* JADX INFO: loaded from: classes2.dex */
public class SettingsSecureCompat {
    private static final String CACHE_NAME = "smart.android.id.data.info";
    private static final String TAG = "AndroidIdCompat";

    public static synchronized String getAndroidId() {
        return getString(MiJiaEnvironment.getAppContext().getContentResolver(), "android_id");
    }

    private static String getCacheAndroidId() {
        return MMKV.G(CACHE_NAME, 2).k("cache_android_id", "");
    }

    public static synchronized String getString(ContentResolver contentResolver, String str) {
        if (!TextUtils.equals(str, "android_id")) {
            return Settings.Secure.getString(contentResolver, str);
        }
        String cacheAndroidId = getCacheAndroidId();
        TextUtils.isEmpty(cacheAndroidId);
        if (TextUtils.isEmpty(cacheAndroidId)) {
            cacheAndroidId = refreshAndSaveAndroidId();
        }
        return cacheAndroidId;
    }

    public static synchronized String refreshAndSaveAndroidId() {
        String string;
        MMKV mmkvG = MMKV.G(CACHE_NAME, 2);
        string = Settings.Secure.getString(MiJiaEnvironment.getAppContext().getContentResolver(), "android_id");
        mmkvG.u("cache_android_id", string);
        return string;
    }
}
