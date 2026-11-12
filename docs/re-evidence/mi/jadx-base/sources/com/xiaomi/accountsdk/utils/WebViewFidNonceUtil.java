package com.xiaomi.accountsdk.utils;

import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class WebViewFidNonceUtil {

    public static final class ServerTimeAlignedListenerImpl implements ServerTimeUtil.ServerTimeAlignedListener {
        private final WeakReference<WebView> webViewWeakReference;

        public ServerTimeAlignedListenerImpl(WebView webView) {
            this.webViewWeakReference = new WeakReference<>(webView);
        }

        @Override // com.xiaomi.accountsdk.utils.ServerTimeUtil.ServerTimeAlignedListener
        public void onServerTimeAligned() {
            WebView webView = this.webViewWeakReference.get();
            if (webView != null) {
                new WebViewFidNonceUtil().setupFidNonceForAccountWeb(webView);
            }
        }
    }

    public final void setFidNonceCookie(FidNonce fidNonce, CookieManager cookieManager) {
        AbstractAccountWebViewSingleCookieUtil.setAccountCookie(cookieManager, "fidNonce", fidNonce.plain);
        AbstractAccountWebViewSingleCookieUtil.setAccountCookie(cookieManager, "fidNonceSign", fidNonce.sign);
    }

    public final void setupFidNonceForAccountWeb(WebView webView) {
        FidNonce fidNonceBuild;
        if (webView == null || (fidNonceBuild = new FidNonce.Builder().build(FidNonce.Type.WEB_VIEW)) == null) {
            return;
        }
        CookieSyncManager.createInstance(webView.getContext());
        setFidNonceCookie(fidNonceBuild, CookieManager.getInstance());
        CookieSyncManager.getInstance().sync();
    }
}
