package com.huawei.watchface;

import android.os.Looper;
import android.webkit.WebView;
import com.huawei.watchface.utils.HwLog;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes20.dex */
public class w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f30642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WebView f30643b;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f30644a;

        public a(CountDownLatch countDownLatch) {
            this.f30644a = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            w3 w3Var = w3.this;
            w3Var.a(w3Var.f30643b.getUrl());
            this.f30644a.countDown();
        }
    }

    public w3(WebView webView) {
        this.f30643b = webView;
    }

    public String a() {
        if (this.f30643b == null) {
            return "";
        }
        if (b()) {
            return this.f30643b.getUrl();
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        p4.a(new a(countDownLatch));
        try {
            if (!countDownLatch.await(2000L, TimeUnit.MILLISECONDS)) {
                HwLog.w("SafeGetUrlUtil", "getUrlMethod time out!");
            }
        } catch (InterruptedException e) {
            HwLog.e("SafeGetUrlUtil", "getUrlMethod: InterruptedException " + HwLog.printException((Exception) e));
        }
        return this.f30642a;
    }

    public boolean b() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public void a(String str) {
        this.f30642a = str;
    }
}
