package com.huawei.openalliance.ad.views.web;

import android.content.Context;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.dq;

/* JADX INFO: loaded from: classes12.dex */
public class d extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f21421a = "d";

    protected void a(WebView webView) {
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return true;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(final WebView webView, final SslErrorHandler sslErrorHandler, final SslError sslError) {
        String str = f21421a;
        hw.c(str, "onReceivedSslError %s", sslError);
        if (webView == null) {
            return;
        }
        try {
            hw.b(str, "WebView ssl check");
            f.a(sslErrorHandler, sslError, sslError.getUrl(), webView.getContext().getApplicationContext(), new g.a() { // from class: com.huawei.openalliance.ad.views.web.d.1
                @Override // com.huawei.openalliance.ad.views.web.g.a
                public void b(Context context, String str2) {
                    hw.a(d.f21421a, "onCancel:%s", str2);
                    dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.web.d.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            d.this.a(webView, sslErrorHandler, sslError);
                        }
                    });
                }

                @Override // com.huawei.openalliance.ad.views.web.g.a
                public void a(Context context, String str2) {
                    hw.a(d.f21421a, "onProceed:%s", str2);
                    dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.web.d.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (sslErrorHandler != null) {
                                sslErrorHandler.proceed();
                            }
                        }
                    });
                }
            });
        } catch (Exception | NoClassDefFoundError e) {
            hw.c(f21421a, e.getClass().getSimpleName());
            if (sslErrorHandler != null) {
                sslErrorHandler.cancel();
            }
        }
    }

    protected void a(final WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        hw.a(f21421a, "handleSslError");
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.web.d.2
            @Override // java.lang.Runnable
            public void run() {
                d.this.a(webView);
            }
        });
    }
}
