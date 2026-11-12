package com.huawei.hwcloudjs.core;

import android.webkit.WebView;
import com.huawei.hwcloudjs.support.enables.INoProguard;
import java.lang.ref.WeakReference;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class JsCallback implements INoProguard {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f17046a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f17047b = 9999;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f17048c = "JsCallback";
    private static final String d = "javascript:%s.callback(%s,%s,%d);";
    private final String e;
    private WeakReference<WebView> f;
    private String g;
    private String h;

    private String a(String str) {
        return str;
    }

    public final void success(String str) {
        a(a(str), 0);
    }

    public final void success(Object obj) {
        a(new b().a(obj), 0);
    }

    public final void success() {
        success("{}");
    }

    public String getwebviewId() {
        return this.g;
    }

    public WebView getWebView() {
        return this.f.get();
    }

    public final void failure(String str) {
        failure(9999, str);
    }

    public final void failure(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", i);
            jSONObject.put("message", str);
        } catch (JSONException unused) {
            com.huawei.hwcloudjs.f.d.b(f17048c, "failure put json error", true);
        }
        a(a(jSONObject.toString()), i);
    }

    public final void failure(int i) {
        failure(i, "");
    }

    public final void failure() {
        failure(9999);
    }

    private void a(String str, int i) {
        WebView webView = getWebView();
        if (webView == null) {
            return;
        }
        a(webView, String.format(Locale.ENGLISH, d, "hbs", this.e, str, Integer.valueOf(i)));
    }

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WebView f17049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f17050b;

        @Override // java.lang.Runnable
        public void run() {
            this.f17049a.getSettings().setSavePassword(false);
            this.f17049a.loadUrl(this.f17050b);
        }

        public a(WebView webView, String str) {
            this.f17049a = webView;
            this.f17050b = str;
        }
    }

    private void a(WebView webView, String str) {
        webView.post(new a(webView, str));
    }

    public JsCallback(WebView webView, String str, String str2) {
        this.g = str2;
        this.f = new WeakReference<>(webView);
        this.e = "\"" + str + "\"";
        this.h = str;
    }
}
