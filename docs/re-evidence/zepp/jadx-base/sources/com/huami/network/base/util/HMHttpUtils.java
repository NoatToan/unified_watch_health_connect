package com.huami.network.base.util;

import android.os.Looper;
import com.alipay.sdk.m.u.i;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.huami.tools.log.HMLog;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes6.dex */
public class HMHttpUtils {
    public static final String TAG = "HMHttpUtils";
    private static String[] a = {"application/", "text/", "audio/", "video/", "image/"};
    private static Gson b;

    public static String decodeJson(String str) {
        try {
            str = URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            HMLog.e(TAG, "decode failed", new Object[0]);
        }
        HMLog.i(TAG, "decode:" + str, new Object[0]);
        return str;
    }

    public static Gson getGson() {
        if (b == null) {
            synchronized (HMHttpUtils.class) {
                if (b == null) {
                    b = new GsonBuilder().create();
                }
            }
        }
        return b;
    }

    public static boolean isContentType(String str) {
        for (String str2 : a) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static String purgeJson(String str) {
        return str.replace("\"[", "[").replace("]\"", "]").replace("}\"", i.d).replace("\"{", "{").replace("\\\"", "\"").replace("\\/", FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
    }
}
