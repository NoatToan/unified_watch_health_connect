package com.huawei.openalliance.ad.views.web;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.or;
import com.huawei.openalliance.ad.views.interfaces.q;
import com.huawei.operation.utils.Constants;

/* JADX INFO: loaded from: classes12.dex */
public class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected q f21418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ProgressBar f21419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WebViewClient f21420c;
    private or d;

    @Override // com.huawei.openalliance.ad.views.web.d, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        q qVar = this.f21418a;
        if (qVar != null) {
            qVar.b(str);
        }
        try {
            or orVar = this.d;
            if (orVar != null && orVar.a(webView, Uri.parse(str))) {
                return true;
            }
        } catch (Exception unused) {
            hw.c("PureWebViewClient", "shouldOverrideUrlLoading Exception");
        }
        WebViewClient webViewClient = this.f21420c;
        return webViewClient != null ? webViewClient.shouldOverrideUrlLoading(webView, str) : super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        or orVar;
        if (this.f21418a != null && webResourceRequest != null && webResourceRequest.getUrl() != null) {
            this.f21418a.b(webResourceRequest.getUrl().toString());
        }
        if (webResourceRequest != null && (orVar = this.d) != null && orVar.a(webView, webResourceRequest.getUrl())) {
            return true;
        }
        WebViewClient webViewClient = this.f21420c;
        return webViewClient != null ? webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest) : super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        hw.a("PureWebViewClient", "onReceivedError error:%s", webResourceError.getDescription());
        a(webView);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        hw.a("PureWebViewClient", "onReceivedError description:%s", str);
        a(webView);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        hw.a("PureWebViewClient", "onPageStarted url=%s", str);
        ProgressBar progressBar = this.f21419b;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        WebViewClient webViewClient = this.f21420c;
        if (webViewClient != null) {
            webViewClient.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        if (!webView.getSettings().getLoadsImagesAutomatically()) {
            webView.getSettings().setLoadsImagesAutomatically(true);
        }
        ProgressBar progressBar = this.f21419b;
        if (progressBar != null) {
            progressBar.setVisibility(4);
            this.f21419b.setProgress(100);
        }
        b();
        WebViewClient webViewClient = this.f21420c;
        if (webViewClient != null) {
            webViewClient.onPageFinished(webView, str);
        }
    }

    public void a(or orVar) {
        this.d = orVar;
    }

    public void a(WebViewClient webViewClient) {
        this.f21420c = webViewClient;
    }

    @Override // com.huawei.openalliance.ad.views.web.d
    protected void a(WebView webView) {
        hw.b("PureWebViewClient", "onReceivedError");
        webView.loadUrl(Constants.ABOUT_BLANK);
        ProgressBar progressBar = this.f21419b;
        if (progressBar != null && progressBar.getVisibility() == 0) {
            this.f21419b.setVisibility(4);
        }
        q qVar = this.f21418a;
        if (qVar != null) {
            qVar.a();
        }
    }

    private void b() {
        hw.b("PureWebViewClient", "onPageFinished");
        this.f21418a.c();
    }

    public c(q qVar) {
        this.f21418a = qVar;
    }
}
