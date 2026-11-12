package com.huawei.secure.android.common.webview;

import android.util.Log;
import android.webkit.WebView;
import com.huawei.secure.android.common.util.b;
import com.huawei.secure.android.common.util.c;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes42.dex */
public class SafeGetUrl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f22953c = "SafeGetUrl";
    private static final long d = 200;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f22954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WebView f22955b;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f22956a;

        a(CountDownLatch countDownLatch) {
            this.f22956a = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            SafeGetUrl safeGetUrl = SafeGetUrl.this;
            safeGetUrl.setUrl(safeGetUrl.f22955b.getUrl());
            this.f22956a.countDown();
        }
    }

    public SafeGetUrl() {
    }

    public String getUrlMethod() {
        if (this.f22955b == null) {
            return "";
        }
        if (b.a()) {
            return this.f22955b.getUrl();
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        c.a(new a(countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            Log.e(f22953c, "getUrlMethod: InterruptedException " + e.getMessage(), e);
        }
        return this.f22954a;
    }

    public WebView getWebView() {
        return this.f22955b;
    }

    public void setUrl(String str) {
        this.f22954a = str;
    }

    public void setWebView(WebView webView) {
        this.f22955b = webView;
    }

    public SafeGetUrl(WebView webView) {
        this.f22955b = webView;
    }
}
