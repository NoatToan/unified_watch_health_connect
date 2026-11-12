package com.twitter.sdk.android.core.internal;

import android.net.Uri;
import android.os.Build;
import io.netty.util.internal.StringUtil;
import java.text.Normalizer;

/* JADX INFO: loaded from: classes18.dex */
public class TwitterApi {
    public static final String BASE_HOST = "api.twitter.com";
    public static final String BASE_HOST_URL = "https://api.twitter.com";
    private final String a;

    public TwitterApi() {
        this("https://api.twitter.com");
    }

    public static String a(String str) {
        return b(Normalizer.normalize(str, Normalizer.Form.NFD));
    }

    public static String b(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt > 31 && cCharAt < 127) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public static String buildUserAgent(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append('/');
        sb.append(str2);
        sb.append(StringUtil.SPACE);
        String str3 = Build.MODEL;
        sb.append(str3);
        sb.append('/');
        sb.append(Build.VERSION.RELEASE);
        sb.append(" (");
        sb.append(Build.MANUFACTURER);
        sb.append(';');
        sb.append(str3);
        sb.append(';');
        sb.append(Build.BRAND);
        sb.append(';');
        sb.append(Build.PRODUCT);
        sb.append(')');
        return a(sb.toString());
    }

    public Uri.Builder buildUponBaseHostUrl(String... strArr) {
        Uri.Builder builderBuildUpon = Uri.parse(getBaseHostUrl()).buildUpon();
        if (strArr != null) {
            for (String str : strArr) {
                builderBuildUpon.appendPath(str);
            }
        }
        return builderBuildUpon;
    }

    public String getBaseHostUrl() {
        return this.a;
    }

    public TwitterApi(String str) {
        this.a = str;
    }
}
