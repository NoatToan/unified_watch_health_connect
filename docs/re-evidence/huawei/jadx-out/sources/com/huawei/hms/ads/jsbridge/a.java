package com.huawei.hms.ads.jsbridge;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.huawei.hms.ads.jsb.IWebView;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile String f12832a;

    public String a(IWebView iWebView) {
        if (iWebView == null) {
            return null;
        }
        String str = this.f12832a;
        return str != null ? str : b(iWebView);
    }

    public String a(WebView webView) {
        if (webView == null) {
            return null;
        }
        String str = this.f12832a;
        if (str != null) {
            return str;
        }
        b.a("securityExtSetFrameUrl is null ,get url from native");
        return b(webView);
    }

    private static String b(IWebView iWebView) {
        try {
            return a(new FutureTask(new CallableC0096a(iWebView))).get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            b.b("Exception will waiting: " + e.getMessage());
            b.b("exception or timeout while waiting for url");
            return null;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.ads.jsbridge.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes33.dex */
    static class CallableC0096a implements Callable<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private IWebView f12833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WebView f12834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f12835c;

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            if (this.f12835c) {
                IWebView iWebView = this.f12833a;
                if (iWebView != null) {
                    return iWebView.getUrl();
                }
                return null;
            }
            WebView webView = this.f12834b;
            if (webView != null) {
                return webView.getUrl();
            }
            return null;
        }

        CallableC0096a(IWebView iWebView) {
            this.f12835c = true;
            this.f12833a = iWebView;
        }

        CallableC0096a(WebView webView) {
            this.f12834b = webView;
        }
    }

    private static String b(WebView webView) {
        try {
            return a(new FutureTask(new CallableC0096a(webView))).get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            b.b("Exception will waiting: " + e.getMessage());
            b.b("exception or timeout while waiting for url");
            return null;
        }
    }

    public static void a(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    private static Future<String> a(FutureTask futureTask) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            futureTask.run();
            return futureTask;
        }
        new Handler(Looper.getMainLooper()).post(futureTask);
        return futureTask;
    }
}
