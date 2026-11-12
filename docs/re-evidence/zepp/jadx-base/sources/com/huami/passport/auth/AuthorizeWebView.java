package com.huami.passport.auth;

import android.content.Context;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes12.dex */
public class AuthorizeWebView extends LollipopFixedWebView {
    public AuthorizeWebView(Context context) {
        super(context);
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        if (!(webViewClient instanceof AuthorizeLoader.AuthorizeWebViewClient)) {
            throw new IllegalArgumentException("The client must be AuthorizeWebViewClient object");
        }
        super.setWebViewClient(webViewClient);
    }
}
