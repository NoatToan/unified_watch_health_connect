package com.xiaomi.smarthome.library.http.util;

import android.text.TextUtils;
import java.net.CookieManager;
import java.net.HttpCookie;
import java.net.URI;
import java.net.URISyntaxException;
import okhttp3.Response;

/* JADX INFO: loaded from: classes2.dex */
public class CookieUtil {
    public static void addCookie(CookieManager cookieManager, String str, String str2, String str3, String str4, String str5) {
        if (cookieManager == null) {
            return;
        }
        try {
            cookieManager.getCookieStore().add(new URI(str), createCookie(str2, str3, str4, str5));
        } catch (URISyntaxException unused) {
        }
    }

    public static void clearAllCookie(CookieManager cookieManager) {
        if (cookieManager == null) {
            return;
        }
        cookieManager.getCookieStore().removeAll();
    }

    public static HttpCookie createCookie(String str, String str2, String str3, String str4) {
        HttpCookie httpCookie = new HttpCookie(str, str2);
        httpCookie.setDomain(str3);
        httpCookie.setPath(str4);
        return httpCookie;
    }

    public static void distinctAddCookie(CookieManager cookieManager, String str, String str2, String str3, String str4, String str5) {
        removeCookie(cookieManager, str, str2, str4, str5);
        addCookie(cookieManager, str, str2, str3, str4, str5);
    }

    public static HttpCookie getCookie(CookieManager cookieManager, String str) {
        if (cookieManager != null && !TextUtils.isEmpty(str)) {
            for (HttpCookie httpCookie : cookieManager.getCookieStore().getCookies()) {
                if (str.equals(httpCookie.getName())) {
                    return httpCookie;
                }
            }
        }
        return null;
    }

    public static String parseServiceTokenFromResponse(Response response) {
        for (String str : response.headers("Set-Cookie")) {
            if (!TextUtils.isEmpty(str)) {
                for (String str2 : str.split(";")) {
                    if (str2.contains("serviceToken")) {
                        int iIndexOf = str2.indexOf("=");
                        return iIndexOf == -1 ? "" : str2.substring(iIndexOf + 1, str2.length());
                    }
                }
            }
        }
        return "";
    }

    public static void removeCookie(CookieManager cookieManager, String str, String str2, String str3, String str4) {
        try {
            HttpCookie httpCookie = new HttpCookie(str2, "");
            httpCookie.setPath(str4);
            httpCookie.setDomain(str3);
            cookieManager.getCookieStore().remove(new URI(str), httpCookie);
        } catch (URISyntaxException unused) {
        }
    }

    public static void saveCookie(CookieManager cookieManager, WebViewCookieManager webViewCookieManager) {
        if (webViewCookieManager == null) {
            return;
        }
        for (HttpCookie httpCookie : cookieManager.getCookieStore().getCookies()) {
            webViewCookieManager.setCookie(httpCookie.getName(), httpCookie.getValue(), httpCookie.getDomain());
        }
    }

    public static HttpCookie getCookie(CookieManager cookieManager, String str, String str2) {
        if (cookieManager != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            for (HttpCookie httpCookie : cookieManager.getCookieStore().getCookies()) {
                if (str.equals(httpCookie.getName()) && str2.equals(httpCookie.getDomain())) {
                    return httpCookie;
                }
            }
        }
        return null;
    }

    public static HttpCookie getCookie(CookieManager cookieManager, String str, String str2, String str3) {
        if (cookieManager != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            for (HttpCookie httpCookie : cookieManager.getCookieStore().getCookies()) {
                if (str.equals(httpCookie.getName()) && str2.equals(httpCookie.getDomain()) && str3.equals(httpCookie.getPath())) {
                    return httpCookie;
                }
            }
        }
        return null;
    }
}
