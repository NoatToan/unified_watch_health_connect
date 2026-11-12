package com.huawei.health.superrule;

import android.content.Context;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.huawei.operation.utils.Constants;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public class SuperRule {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10230b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WebView f10231c;
    private Context d;
    private FireCallback<String> e;

    public SuperRule(Context context) {
        this.d = context;
        WebView webView = new WebView(context);
        this.f10231c = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f10231c.addJavascriptInterface(this, "jsbridge");
    }

    public void a(String str) {
        if (!this.f10230b) {
            this.f10231c.evaluateJavascript(e("node-rules.min.js"), null);
            this.f10231c.evaluateJavascript(e("SuperRule.js"), null);
            this.f10230b = true;
        }
        this.f10231c.evaluateJavascript(str, null);
    }

    public void c(String str, FireCallback<String> fireCallback) {
        this.e = fireCallback;
        this.f10231c.evaluateJavascript("javascript:fire(" + str + Constants.RIGHT_BRACKET_ONLY, null);
    }

    @JavascriptInterface
    public void setRuleResult(String str) {
        FireCallback<String> fireCallback = this.e;
        if (fireCallback != null) {
            fireCallback.onReceiveValue(str);
        }
    }

    private String e(String str) {
        String str2;
        try {
            InputStream inputStreamOpen = this.d.getAssets().open(str);
            try {
                byte[] bArr = new byte[inputStreamOpen.available()];
                inputStreamOpen.read(bArr);
                str2 = new String(bArr, "utf8");
                if (inputStreamOpen == null) {
                    return str2;
                }
                try {
                    inputStreamOpen.close();
                    return str2;
                } catch (IOException e) {
                    e = e;
                    Log.e("SuperRule", "assertFile2String() IOException" + e.getMessage());
                    return str2;
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        } catch (IOException e2) {
            e = e2;
            str2 = "";
        }
    }
}
