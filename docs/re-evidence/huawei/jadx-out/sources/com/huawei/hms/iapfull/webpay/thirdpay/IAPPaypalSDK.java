package com.huawei.hms.iapfull.webpay.thirdpay;

import android.content.Intent;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.huawei.hms.iapfull.webpay.WebViewActivity;
import com.huawei.hms.iapfull.y0;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public class IAPPaypalSDK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<WebViewActivity> f13792a;

    @JavascriptInterface
    public void paypalSign(String str) {
        if (TextUtils.isEmpty(str)) {
            y0.a("IAPFullSDK", "paypalSign sign params error");
            return;
        }
        WebViewActivity webViewActivity = this.f13792a.get();
        if (webViewActivity == null || webViewActivity.isFinishing() || webViewActivity.isDestroyed()) {
            y0.a("IAPFullSDK", "paypalSign activity null");
            return;
        }
        Intent intent = new Intent(webViewActivity, (Class<?>) PaypalActivity.class);
        intent.putExtra("paypal_sign_token", str);
        webViewActivity.startActivityForResult(intent, 10003);
    }

    public IAPPaypalSDK(WebViewActivity webViewActivity) {
        this.f13792a = new WeakReference<>(webViewActivity);
    }
}
