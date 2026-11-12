package com.twitter.sdk.android.core.identity;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.twitter.sdk.android.core.internal.network.UrlUtils;
import java.net.URI;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes18.dex */
class e extends WebViewClient {
    private final String a;
    private final a b;

    public interface a {
        void a(WebView webView, String str);

        void b(g gVar);

        void onSuccess(Bundle bundle);
    }

    public e(String str, a aVar) {
        this.a = str;
        this.b = aVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.b.a(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        this.b.b(new g(i, str, str2));
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        this.b.b(new g(sslError.getPrimaryError(), null, null));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!str.startsWith(this.a)) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        TreeMap<String, String> queryParams = UrlUtils.getQueryParams(URI.create(str), false);
        Bundle bundle = new Bundle(queryParams.size());
        for (Map.Entry<String, String> entry : queryParams.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        this.b.onSuccess(bundle);
        return true;
    }
}
