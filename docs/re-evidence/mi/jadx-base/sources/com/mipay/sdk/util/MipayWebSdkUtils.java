package com.mipay.sdk.util;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.webkit.CookieManager;
import com.xiaomi.onetrack.util.z;
import java.net.URI;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MipayWebSdkUtils {
    public static void clearAllCookies(List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        for (String str : list) {
            try {
                String[] strArrSplit = new URI(str).getHost().split(z.f14007a);
                if (strArrSplit.length < 2) {
                    return;
                }
                StringBuilder sb = new StringBuilder(".");
                sb.append(strArrSplit[strArrSplit.length - 1]);
                for (int length = strArrSplit.length - 2; length >= 0; length--) {
                    sb.insert(0, strArrSplit[length]);
                    if (length > 0) {
                        sb.insert(0, ".");
                    }
                    String string = sb.toString();
                    String cookie = cookieManager.getCookie(string);
                    if (!TextUtils.isEmpty(cookie)) {
                        for (String str2 : cookie.split(";")) {
                            String strTrim = str2.split("=")[0].trim();
                            cookieManager.setCookie(str, String.format("%s=; Expires=Thu, 01 Jan 1970 00:00:00 GMT; domain=%s; path=/", strTrim, string));
                            if (length == 0) {
                                cookieManager.setCookie(str, String.format("%s=; Expires=Thu, 01 Jan 1970 00:00:00 GMT;", strTrim));
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        cookieManager.flush();
    }

    public static int getDisplayWidthDp(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (int) (displayMetrics.widthPixels / displayMetrics.density);
    }

    public static boolean isNightMode(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
