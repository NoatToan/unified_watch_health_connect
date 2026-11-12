package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.huawei.openalliance.ad.dn;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.or;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.utils.ds;
import com.huawei.openalliance.ad.utils.dy;
import com.huawei.operation.utils.Constants;
import com.huawei.uikit.phone.hwprogressbar.widget.HwProgressBar;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
class y extends com.huawei.openalliance.ad.views.web.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f21445a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f21446b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f21447c;
    private or d;
    private WebViewClient e;
    private com.huawei.openalliance.ad.views.interfaces.w f;
    private boolean g;
    private long h;
    private final dn i;

    @Override // com.huawei.openalliance.ad.views.web.d, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.f != null) {
            if (a(str, webView.getContext())) {
                return true;
            }
            this.f.b(str);
        }
        try {
            or orVar = this.d;
            if (orVar != null && orVar.a(webView, Uri.parse(str))) {
                return true;
            }
        } catch (Exception unused) {
            hw.c("PPSWebViewClient", "shouldOverrideUrlLoading Exception");
        }
        WebViewClient webViewClient = this.e;
        return webViewClient != null ? webViewClient.shouldOverrideUrlLoading(webView, str) : super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        or orVar;
        if (this.f != null && webResourceRequest != null && webResourceRequest.getUrl() != null) {
            if (a(webResourceRequest.getUrl().toString(), webView.getContext())) {
                return true;
            }
            this.f.b(webResourceRequest.getUrl().toString());
        }
        if (webResourceRequest != null && (orVar = this.d) != null && orVar.a(webView, webResourceRequest.getUrl())) {
            return true;
        }
        WebViewClient webViewClient = this.e;
        return webViewClient != null ? webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest) : super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient webViewClient = this.e;
        return webViewClient != null ? webViewClient.shouldOverrideKeyEvent(webView, keyEvent) : super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        hw.a("PPSWebViewClient", "url is : %s, diskCache url is : %s", str, dn.d(str));
        try {
            if (dy.a(str) && this.i.f(dn.d(str))) {
                return b(str);
            }
            hw.a("PPSWebViewClient", "url not cache: %s", str);
            WebViewClient webViewClient = this.e;
            return webViewClient != null ? webViewClient.shouldInterceptRequest(webView, str) : super.shouldInterceptRequest(webView, str);
        } catch (Exception unused) {
            hw.c("PPSWebViewClient", "getLocalCacheFile error: %s", ds.a(str));
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String string = webResourceRequest.getUrl().toString();
        hw.a("PPSWebViewClient", "url is : %s, diskCache url is : %s", string, dn.d(string));
        try {
            if (dy.a(string) && this.i.f(dn.d(string))) {
                hw.a("PPSWebViewClient", "url cache: %s", string);
                return b(string);
            }
            hw.a("PPSWebViewClient", "url not cache: %s", string);
            WebViewClient webViewClient = this.e;
            return webViewClient != null ? webViewClient.shouldInterceptRequest(webView, webResourceRequest) : super.shouldInterceptRequest(webView, webResourceRequest);
        } catch (IOException unused) {
            hw.c("PPSWebViewClient", "getLocalCacheFile io exception: %s", ds.a(string));
        } catch (Exception unused2) {
            hw.c("PPSWebViewClient", "getLocalCacheFile exception: %s", ds.a(string));
        }
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient webViewClient = this.e;
        if (webViewClient != null) {
            webViewClient.onUnhandledKeyEvent(webView, keyEvent);
        } else {
            super.onUnhandledKeyEvent(webView, keyEvent);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        WebViewClient webViewClient = this.e;
        if (webViewClient != null) {
            webViewClient.onTooManyRedirects(webView, message, message2);
        } else {
            super.onTooManyRedirects(webView, message, message2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f, float f2) {
        WebViewClient webViewClient = this.e;
        if (webViewClient != null) {
            webViewClient.onScaleChanged(webView, f, f2);
        } else {
            super.onScaleChanged(webView, f, f2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        WebViewClient webViewClient = this.e;
        if (webViewClient != null) {
            webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
        } else {
            super.onReceivedLoginRequest(webView, str, str2, str3);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, final WebResourceRequest webResourceRequest, final WebResourceResponse webResourceResponse) {
        final boolean zIsForMainFrame = webResourceRequest.isForMainFrame();
        hw.c("PPSWebViewClient", "onReceivedHttpError, isForMainFrame:" + zIsForMainFrame + ", ReasonPhrase:" + webResourceResponse.getReasonPhrase());
        if (zIsForMainFrame) {
            c(webView);
        }
        WebViewClient webViewClient = this.e;
        if (webViewClient != null) {
            webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        } else if (zIsForMainFrame) {
            a(webView, zIsForMainFrame);
        } else {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.y.5
            @Override // java.lang.Runnable
            public void run() {
                if (y.this.f != null) {
                    y.this.f.a(String.valueOf(webResourceRequest.getUrl()), "onReceivedHttpError", "mainframe:" + String.valueOf(zIsForMainFrame) + ", statusCode:" + webResourceResponse.getStatusCode() + ", reasonPhrase:" + webResourceResponse.getReasonPhrase());
                }
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        WebViewClient webViewClient = this.e;
        if (webViewClient != null) {
            webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        } else {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, final WebResourceRequest webResourceRequest, final WebResourceError webResourceError) {
        final boolean zIsForMainFrame = webResourceRequest.isForMainFrame();
        hw.c("PPSWebViewClient", "onReceivedError, isForMainFrame:" + zIsForMainFrame + ", description:" + ((Object) webResourceError.getDescription()));
        if (zIsForMainFrame) {
            c(webView);
        }
        WebViewClient webViewClient = this.e;
        if (webViewClient != null) {
            webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
        } else if (zIsForMainFrame) {
            a(webView, zIsForMainFrame);
        } else {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.y.4
            @Override // java.lang.Runnable
            public void run() {
                if (y.this.f != null) {
                    y.this.f.a(String.valueOf(webResourceRequest.getUrl()), "onReceivedError", "mainframe:" + String.valueOf(zIsForMainFrame) + ", errorCode:" + webResourceError.getErrorCode() + ", desc:" + String.valueOf(webResourceError.getDescription()));
                }
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, final int i, final String str, final String str2) {
        hw.c("PPSWebViewClient", "onReceivedError, errorCode: %d description: %s", Integer.valueOf(i), str);
        c(webView);
        WebViewClient webViewClient = this.e;
        if (webViewClient != null) {
            webViewClient.onReceivedError(webView, i, str, str2);
        } else {
            a(webView, true);
        }
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.y.3
            @Override // java.lang.Runnable
            public void run() {
                if (y.this.f != null) {
                    y.this.f.a(str2, "onReceivedError", "mainframe:true, errorCode:" + i + ", desc:" + str);
                }
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        WebViewClient webViewClient = this.e;
        if (webViewClient != null) {
            webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
        } else {
            super.onReceivedClientCertRequest(webView, clientCertRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.h = jCurrentTimeMillis;
        hw.a("PPSWebViewClient", "onPageFinished, load start time is: %d", Long.valueOf(jCurrentTimeMillis));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.huawei.openalliance.ad.views.interfaces.w wVar = this.f;
        if (wVar != null) {
            wVar.b(str);
        }
        if (Uri.parse(str) != null) {
            String strM = dg.m(str);
            if (!TextUtils.isEmpty(strM) && fp.b(webView.getContext()).j(strM)) {
                if (this.d != null) {
                    hw.c("PPSWebViewClient", "url is blocked");
                    this.d.c();
                }
                com.huawei.openalliance.ad.views.interfaces.w wVar2 = this.f;
                if (wVar2 != null) {
                    wVar2.b();
                    return;
                }
                return;
            }
        }
        WebViewClient webViewClient = this.e;
        if (webViewClient != null) {
            webViewClient.onPageStarted(webView, str, bitmap);
            return;
        }
        View view = this.f21447c;
        if (view != null) {
            view.setVisibility(0);
            if (this.g) {
                ((HwProgressBar) this.f21447c).setProgress(0);
            } else {
                ((e) this.f21447c).a();
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(final WebView webView, String str) {
        hw.a("PPSWebViewClient", "on page load finished");
        if (!webView.getSettings().getLoadsImagesAutomatically()) {
            webView.getSettings().setLoadsImagesAutomatically(true);
        }
        View view = this.f21447c;
        if (view != null) {
            view.setVisibility(8);
            if (this.g) {
                ((HwProgressBar) this.f21447c).setProgress(100, true);
            } else {
                ((e) this.f21447c).setProgress(100);
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.d != null && a(str)) {
            if (hw.a()) {
                hw.a("PPSWebViewClient", "onPageFinished, load finish time is: %d", Long.valueOf(jCurrentTimeMillis));
                hw.a("PPSWebViewClient", "onPageFinished, load time is: %d", Long.valueOf(jCurrentTimeMillis - this.h));
            }
            this.d.b();
        }
        new com.huawei.openalliance.ad.analysis.c(webView.getContext()).c(this.h, jCurrentTimeMillis, str);
        if (hw.a()) {
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.y.1
                @Override // java.lang.Runnable
                public void run() {
                    y.this.b(webView);
                }
            }, 2000L);
        }
        WebViewClient webViewClient = this.e;
        if (webViewClient != null) {
            webViewClient.onPageFinished(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        WebViewClient webViewClient = this.e;
        if (webViewClient != null) {
            webViewClient.onPageCommitVisible(webView, str);
        } else {
            super.onPageCommitVisible(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        WebViewClient webViewClient = this.e;
        if (webViewClient != null) {
            webViewClient.onLoadResource(webView, str);
        } else {
            super.onLoadResource(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        WebViewClient webViewClient = this.e;
        if (webViewClient != null) {
            webViewClient.onFormResubmission(webView, message, message2);
        } else {
            super.onFormResubmission(webView, message, message2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        WebViewClient webViewClient = this.e;
        if (webViewClient != null) {
            webViewClient.doUpdateVisitedHistory(webView, str, z);
        } else {
            super.doUpdateVisitedHistory(webView, str, z);
        }
    }

    public void a(or orVar) {
        this.d = orVar;
    }

    public void a(WebViewClient webViewClient) {
        this.e = webViewClient;
    }

    @Override // com.huawei.openalliance.ad.views.web.d
    public void a(WebView webView, SslErrorHandler sslErrorHandler, final SslError sslError) {
        final boolean zEquals;
        if (this.f != null) {
            zEquals = TextUtils.equals(dg.c(sslError.getUrl(), "/"), dg.c(this.f.getCurrentPageUrl(), "/"));
            if (zEquals) {
                c(webView);
            }
        } else {
            zEquals = false;
        }
        WebViewClient webViewClient = this.e;
        if (webViewClient != null) {
            webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
        } else if (zEquals) {
            a(webView, true);
        }
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.y.6
            @Override // java.lang.Runnable
            public void run() {
                if (y.this.f != null) {
                    y.this.f.a(sslError.getUrl(), "onReceivedSslError", "mainframe:" + zEquals + ", SSL error: " + String.valueOf(sslError));
                }
            }
        });
    }

    public void a(View view, boolean z) {
        this.f21447c = view;
        this.g = z;
        if (dk.c()) {
            hw.b("PPSWebViewClient", "rtl language, set rtl direction.");
            if (z) {
                view.setRotation(180.0f);
            } else {
                view.setLayoutDirection(1);
            }
        }
    }

    private void c(WebView webView) {
        hw.b("PPSWebViewClient", "processError");
        this.f21446b = true;
        View view = this.f21447c;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        this.f21447c.setVisibility(8);
        if (this.g) {
            ((HwProgressBar) this.f21447c).setProgress(0);
        } else {
            ((e) this.f21447c).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(WebView webView) {
        if (hw.a()) {
            if (webView == null) {
                hw.a("PPSWebViewClient", "webView is empty");
            } else {
                webView.evaluateJavascript("(function() { var timing = performance.getEntriesByType(\"navigation\")[0]; return JSON.stringify(timing);})()", new ValueCallback<String>() { // from class: com.huawei.openalliance.ad.views.y.2
                    @Override // android.webkit.ValueCallback
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void onReceiveValue(String str) {
                        hw.a("PPSWebViewClient", "WebView Timing: %s", str.replace("\\", ""));
                    }
                });
            }
        }
    }

    private WebResourceResponse b(String str) {
        return new WebResourceResponse(dy.b(str), "UTF-8", new FileInputStream(new File(this.i.c(dn.d(str)))));
    }

    private boolean a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!fp.b(context).j(dg.m(str))) {
            return false;
        }
        hw.b("PPSWebViewClient", "url is blocked");
        or orVar = this.d;
        if (orVar == null) {
            return true;
        }
        orVar.c();
        return true;
    }

    private boolean a(String str) {
        if (this.d == null || str == null || TextUtils.equals(Constants.ABOUT_BLANK, str)) {
            return false;
        }
        if (this.f21446b) {
            this.f21446b = false;
            return false;
        }
        if (this.f21445a) {
            return false;
        }
        this.f21445a = true;
        return true;
    }

    private void a(WebView webView, boolean z) {
        if (z) {
            webView.loadUrl(Constants.ABOUT_BLANK);
            com.huawei.openalliance.ad.views.interfaces.w wVar = this.f;
            if (wVar != null) {
                wVar.a();
            }
        }
    }

    public y(com.huawei.openalliance.ad.views.interfaces.w wVar) {
        this.f = wVar;
        this.i = com.huawei.openalliance.ad.dk.a(wVar.getContext(), com.huawei.openalliance.ad.constant.Constants.WEBVIEW_CACHE);
    }
}
