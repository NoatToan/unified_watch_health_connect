package com.xiaomi.fitness.webview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class CustomWebView extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f13433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13434b;

    public CustomWebView(Context context) {
        this(context, null);
    }

    @SuppressLint({"ClickableViewAccessibility", "SetJavaScriptEnabled"})
    public final void b() {
        CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
        clearCache(true);
        setBackgroundColor(0);
        setOverScrollMode(2);
        setFadingEdgeLength(0);
        setFitsSystemWindows(true);
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setMixedContentMode(1);
        settings.setBuiltInZoomControls(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setCacheMode(2);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setDisplayZoomControls(false);
        settings.setTextZoom(100);
        settings.setLoadsImagesAutomatically(true);
        String userAgentString = settings.getUserAgentString();
        if (!TextUtils.isEmpty(userAgentString)) {
            settings.setUserAgentString(String.format("%s region/%s", String.format("%s PassportSDK/PassportHybridView/%s XiaoMi/HybridView/", String.format("%s wearable/%s", userAgentString, AppUtil.getVersionName()), Long.valueOf(AppUtil.getVersionCode())), RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().toLowerCase(Locale.US)));
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: qe5
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f31430a.e(view, motionEvent);
            }
        });
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public boolean c() {
        return this.f13434b;
    }

    public boolean d() {
        return this.f13433a;
    }

    public final /* synthetic */ boolean e(View view, MotionEvent motionEvent) {
        if (this.f13434b) {
            return true;
        }
        this.f13433a = true;
        return false;
    }

    public void f() {
        loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
        setWebViewClient(null);
        setWebChromeClient(null);
        clearCache(true);
        clearHistory();
        removeAllViews();
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        destroy();
    }

    public void setIsLoading(boolean z) {
        this.f13434b = z;
    }

    public void setTouchFlag(boolean z) {
        this.f13433a = z;
    }

    public CustomWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CustomWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13433a = true;
        this.f13434b = false;
        b();
    }
}
