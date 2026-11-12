package com.alipay.sdk.widget;

import android.app.Activity;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f5899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5900b;

    public c(Activity activity, String str) {
        super(activity);
        this.f5899a = activity;
        this.f5900b = str;
    }

    public static void k(WebView webView) {
        if (webView != null) {
            try {
                webView.resumeTimers();
            } catch (Throwable unused) {
            }
        }
    }

    public abstract void j();

    public void l(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        CookieSyncManager.createInstance(this.f5899a.getApplicationContext()).sync();
        CookieManager.getInstance().setCookie(str, str2);
        CookieSyncManager.getInstance().sync();
    }

    public abstract boolean m();

    public boolean n() {
        return "v1".equals(this.f5900b);
    }
}
