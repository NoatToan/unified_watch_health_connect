package com.alipay.sdk.m.a0;

import android.app.Activity;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f2084c = "v1";
    public static final String d = "v2";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f2085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2086b;

    public c(Activity activity, String str) {
        super(activity);
        this.f2085a = activity;
        this.f2086b = str;
    }

    public abstract void a(String str);

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        CookieSyncManager.createInstance(this.f2085a.getApplicationContext()).sync();
        CookieManager.getInstance().setCookie(str, str2);
        CookieSyncManager.getInstance().sync();
    }

    public abstract boolean b();

    public abstract void c();

    public boolean a() {
        return "v1".equals(this.f2086b);
    }

    public static void a(WebView webView) {
        if (webView != null) {
            try {
                webView.resumeTimers();
            } catch (Throwable unused) {
            }
        }
    }
}
