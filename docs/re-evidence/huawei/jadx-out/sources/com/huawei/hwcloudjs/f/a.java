package com.huawei.hwcloudjs.f;

import android.text.TextUtils;
import android.webkit.WebView;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes10.dex */
final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String[] f17106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ WebView f17107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ CountDownLatch f17108c;

    @Override // java.lang.Runnable
    public void run() {
        d.c("DeviceUtils", "webView getUrl", true);
        this.f17106a[0] = this.f17107b.getUrl();
        if (TextUtils.isEmpty(this.f17106a[0])) {
            d.b("DeviceUtils", "webView getUrl isEmpty", true);
        }
        this.f17108c.countDown();
    }

    a(String[] strArr, WebView webView, CountDownLatch countDownLatch) {
        this.f17106a = strArr;
        this.f17107b = webView;
        this.f17108c = countDownLatch;
    }
}
