package com.xiaomi.accountsdk.utils;

import android.webkit.CookieManager;
import android.webkit.WebView;
import com.xiaomi.accountsdk.account.XMPassportSettings;
import com.xiaomi.accountsdk.hasheddeviceidlib.HashedDeviceIdUtil;

/* JADX INFO: loaded from: classes6.dex */
public final class WebViewDeviceIdUtil extends AbstractAccountWebViewSingleCookieUtil {
    @Override // com.xiaomi.accountsdk.utils.AbstractAccountWebViewSingleCookieUtil
    public String getCookieName() {
        return "deviceId";
    }

    @Override // com.xiaomi.accountsdk.utils.AbstractAccountWebViewSingleCookieUtil
    public String getCookieValue() {
        return new HashedDeviceIdUtil(XMPassportSettings.getApplicationContext()).getHashedDeviceIdNoThrow();
    }

    public void setDeviceIdCookie(String str, CookieManager cookieManager) {
        super.setAccountCookie(cookieManager, str);
    }

    public void setupDeviceIdForAccountWeb(WebView webView) {
        super.setupNonNullCookieForAccountWeb(webView);
    }
}
