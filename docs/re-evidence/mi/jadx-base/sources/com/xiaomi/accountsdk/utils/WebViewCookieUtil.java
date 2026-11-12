package com.xiaomi.accountsdk.utils;

import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class WebViewCookieUtil extends AbstractAccountWebViewSingleCookieUtil {
    @Override // com.xiaomi.accountsdk.utils.AbstractAccountWebViewSingleCookieUtil
    public String getCookieName() {
        return "";
    }

    @Override // com.xiaomi.accountsdk.utils.AbstractAccountWebViewSingleCookieUtil
    public String getCookieValue() {
        return "";
    }

    public void setupCookiesForAccountWeb(WebView webView, Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        CookieSyncManager.createInstance(webView.getContext());
        CookieManager cookieManager = CookieManager.getInstance();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            AbstractAccountWebViewSingleCookieUtil.setAccountCookie(cookieManager, entry.getKey(), entry.getValue());
        }
        CookieSyncManager.getInstance().sync();
    }
}
