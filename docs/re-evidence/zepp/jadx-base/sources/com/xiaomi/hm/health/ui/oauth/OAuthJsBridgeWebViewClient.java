package com.xiaomi.hm.health.ui.oauth;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.huami.discovery.bridge.jsbridge.JsBridgeWebView;
import com.huami.discovery.bridge.jsbridge.JsBridgeWebViewClient;
import com.huami.passport.auth.AuthorizeLoader;
import com.huami.passport.auth.IError;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.ui.oauth.OAuthJsBridgeWebViewClient;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public class OAuthJsBridgeWebViewClient extends JsBridgeWebViewClient {
    private AuthorizeLoader d;

    public OAuthJsBridgeWebViewClient(JsBridgeWebView webView, AuthorizeLoader loader) {
        super(webView);
        this.d = loader;
    }

    private void e(IError error) {
        AuthorizeLoader authorizeLoader = this.d;
        if (authorizeLoader != null) {
            authorizeLoader.onError(error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f(String str) {
        return "onPageFinished " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g(String str) {
        return "onPageStarted " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h(String str) {
        return "shouldOverrideUrlLoading " + str;
    }

    @Override // com.huami.discovery.bridge.jsbridge.JsBridgeWebViewClient, android.webkit.WebViewClient
    public void onPageFinished(WebView view, final String url) {
        HMLog.debug(new Function0() { // from class: wh5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OAuthJsBridgeWebViewClient.f(url);
            }
        });
        super.onPageFinished(view, url);
    }

    @Override // com.huami.discovery.bridge.jsbridge.JsBridgeWebViewClient, android.webkit.WebViewClient
    public void onPageStarted(WebView view, final String url, Bitmap favicon) {
        HMLog.debug(new Function0() { // from class: xh5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OAuthJsBridgeWebViewClient.g(url);
            }
        });
        super.onPageStarted(view, url, favicon);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        super.onReceivedError(view, errorCode, description, failingUrl);
        e(IError.EC_10005);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        super.onReceivedSslError(view, handler, error);
        e(IError.EC_10005);
    }

    @Override // com.huami.discovery.bridge.jsbridge.JsBridgeWebViewClient, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, final String url) {
        HMLog.debug(new Function0() { // from class: yh5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OAuthJsBridgeWebViewClient.h(url);
            }
        });
        try {
            if (!url.contains(this.d.getRedirectUri())) {
                return super.shouldOverrideUrlLoading(view, url);
            }
            this.d.onSuccess(url);
            return true;
        } catch (Exception unused) {
            e(IError.EC_10002);
            return true;
        }
    }
}
