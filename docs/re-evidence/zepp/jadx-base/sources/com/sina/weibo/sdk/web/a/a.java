package com.sina.weibo.sdk.web.a;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.sina.weibo.sdk.auth.AccessTokenHelper;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.auth.WbAuthListener;
import com.sina.weibo.sdk.b.e;
import com.sina.weibo.sdk.common.UiError;

/* JADX INFO: loaded from: classes18.dex */
public final class a extends b {
    public a(Activity activity, com.sina.weibo.sdk.web.a aVar, com.sina.weibo.sdk.web.b.b bVar) {
        super(activity, aVar, bVar);
    }

    private boolean m(String str) {
        Bundle bundleH;
        AuthInfo authInfoB = this.ay.y().b();
        return (authInfoB == null || !str.startsWith(authInfoB.getRedirectUrl()) || (bundleH = e.h(str)) == null || TextUtils.isEmpty(bundleH.getString("access_token"))) ? false : true;
    }

    @Override // com.sina.weibo.sdk.web.a.b, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        AuthInfo authInfoB = this.ay.y().b();
        if (authInfoB == null || !str.startsWith(authInfoB.getRedirectUrl())) {
            return;
        }
        String strV = this.ay.y().v();
        if (!TextUtils.isEmpty(strV)) {
            WbAuthListener wbAuthListenerB = this.av.b(strV);
            this.az = wbAuthListenerB;
            if (wbAuthListenerB != null) {
                Bundle bundleH = e.h(str);
                if (bundleH != null) {
                    String string = bundleH.getString("error");
                    String string2 = bundleH.getString("error_code");
                    String string3 = bundleH.getString("error_description");
                    if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2)) {
                        Oauth2AccessToken accessToken = Oauth2AccessToken.parseAccessToken(bundleH);
                        AccessTokenHelper.writeAccessToken(this.aw, accessToken);
                        this.az.onComplete(accessToken);
                    } else {
                        this.az.onError(new UiError(-1, string2, string3));
                    }
                } else {
                    this.az.onError(new UiError(-1, "bundle is null", "parse url error"));
                }
                this.av.c(strV);
            }
        }
        com.sina.weibo.sdk.web.a aVar = this.ax;
        if (aVar != null) {
            aVar.u();
        }
    }

    @Override // com.sina.weibo.sdk.web.a.b, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // com.sina.weibo.sdk.web.a.b, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m(webResourceRequest.getUrl().toString());
        }
        return false;
    }

    @Override // com.sina.weibo.sdk.web.a.b
    public final void u() {
        super.u();
        String strV = this.ay.y().v();
        if (!TextUtils.isEmpty(strV)) {
            WbAuthListener wbAuthListenerB = this.av.b(strV);
            this.az = wbAuthListenerB;
            if (wbAuthListenerB != null) {
                wbAuthListenerB.onCancel();
            }
            this.av.c(strV);
        }
        com.sina.weibo.sdk.web.a aVar = this.ax;
        if (aVar != null) {
            aVar.u();
        }
    }

    @Override // com.sina.weibo.sdk.web.a.b
    public final boolean w() {
        u();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return m(str);
    }
}
