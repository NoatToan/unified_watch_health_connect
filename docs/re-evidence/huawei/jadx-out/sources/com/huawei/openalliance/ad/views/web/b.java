package com.huawei.openalliance.ad.views.web;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.dk;
import com.huawei.openalliance.ad.dn;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.jn;
import com.huawei.openalliance.ad.od;
import com.huawei.openalliance.ad.sl;
import com.huawei.openalliance.ad.sn;
import com.huawei.openalliance.ad.so;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dy;
import com.huawei.openalliance.ad.utils.o;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class b implements jn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f21410a = new byte[0];
    private static b h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WebView f21411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private jn f21412c;
    private String e;
    private final int f;
    private Map<String, Integer> d = new HashMap(5);
    private boolean g = false;

    public void a(String str, boolean z) {
        if (dg.b(str)) {
            return;
        }
        this.g = z;
        hw.b("PreloadWebView", "preLoad begin: %s", Boolean.valueOf(z));
        this.e = str;
        this.f21411b.loadUrl(str);
        this.f21412c.a();
        this.f21412c.b();
    }

    @Override // com.huawei.openalliance.ad.jn.a
    public void a() {
        WebView webView = this.f21411b;
        if (webView != null) {
            webView.destroy();
        }
        this.f21411b = null;
        this.f21412c = null;
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final Context context, final String str) {
        final dn dnVarA = dk.a(context, Constants.WEBVIEW_CACHE);
        dnVarA.a(100);
        dnVarA.a(Math.max(dnVarA.c(), Constants.WEB_VIEW_CACHE_TOTAL_MAX_SIZE));
        o.e(new Runnable() { // from class: com.huawei.openalliance.ad.views.web.b.1
            @Override // java.lang.Runnable
            public void run() {
                sn snVar = new sn();
                snVar.b(false);
                snVar.c(true);
                snVar.e(Constants.WEBVIEW_CACHE);
                snVar.a(2000);
                snVar.b(2000);
                snVar.d(str);
                so soVarA = new sl(context, snVar).a();
                if (soVarA != null) {
                    String strA = soVarA.a();
                    if (TextUtils.isEmpty(strA)) {
                        return;
                    }
                    hw.a("PreloadWebView", "download url is : %s , filePath is : %s", str, dnVarA.c(strA));
                }
            }
        });
    }

    private static void b() {
        synchronized (f21410a) {
            h = null;
        }
    }

    /* JADX INFO: renamed from: com.huawei.openalliance.ad.views.web.b$b, reason: collision with other inner class name */
    class C0245b extends WebViewClient {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f21417b = 0;

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            long jC = as.c();
            this.f21417b = jC;
            hw.a("PreloadWebView", "on page start, start time : %s", Long.valueOf(jC));
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            long jC = as.c();
            hw.a("PreloadWebView", "on page finished, end time : %s", Long.valueOf(jC));
            if (b.this.g) {
                new com.huawei.openalliance.ad.analysis.c(webView.getContext()).b(this.f21417b, jC, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            hw.a("PreloadWebView", " onLoadResource url is :" + str);
            int iIntValue = b.this.d.get(b.this.e) != null ? ((Integer) b.this.d.get(b.this.e)).intValue() : 0;
            if (!dy.a(str) || iIntValue >= b.this.f) {
                hw.a("PreloadWebView", "don't download url :" + str);
            } else {
                b.this.d.put(b.this.e, Integer.valueOf(iIntValue + 1));
                b.b(webView.getContext(), str);
            }
            super.onLoadResource(webView, str);
        }

        C0245b() {
        }
    }

    static class a {
        @JavascriptInterface
        public boolean isPreload() {
            hw.a("PreloadWebView", "isPreload:true");
            return true;
        }

        private a() {
        }
    }

    public static b a(Context context) {
        b bVar;
        synchronized (f21410a) {
            if (h == null) {
                h = new b(context);
            }
            bVar = h;
        }
        return bVar;
    }

    private b(Context context) {
        com.huawei.openalliance.ad.utils.dk.h(context);
        this.f21412c = new jn(this);
        WebView webView = new WebView(context);
        this.f21411b = webView;
        webView.setWebViewClient(new C0245b());
        this.f21411b.addJavascriptInterface(new a(), Constants.PPS_JS_NAME);
        od.b(this.f21411b);
        this.f21411b.getSettings().setJavaScriptEnabled(false);
        this.f = fp.b(context).r();
    }
}
