package com.huawei.hms.iapfull.webpay.thirdpay;

import android.content.Intent;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.huawei.hms.iapfull.webpay.WebViewActivity;
import com.huawei.hms.iapfull.y0;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<WebViewActivity> f13800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13801b;

    @JavascriptInterface
    public void wechatAppSign(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            y0.a("IAPFullSDK", "wechatAppSign sign params error");
            return;
        }
        WebViewActivity webViewActivity = this.f13800a.get();
        if (webViewActivity == null) {
            y0.a("IAPFullSDK", "wechatAppSign activity null");
            return;
        }
        Intent intent = new Intent(webViewActivity, (Class<?>) ThirdPayActivity.class);
        intent.putExtra("wechat_sign_appId", str2);
        intent.putExtra("wechat_sign_preEntrustwebId", str);
        webViewActivity.startActivityForResult(intent, 10002);
    }

    @JavascriptInterface
    public void paypalSign(String str) {
        if (TextUtils.isEmpty(str)) {
            y0.a("IAPFullSDK", "paypalSign sign params error");
            return;
        }
        WebViewActivity webViewActivity = this.f13800a.get();
        if (webViewActivity == null) {
            y0.a("IAPFullSDK", "paypalSign activity null");
            return;
        }
        Intent intent = new Intent(webViewActivity, (Class<?>) PaypalActivity.class);
        intent.putExtra("paypal_sign_token", str);
        webViewActivity.startActivityForResult(intent, 10003);
    }

    @JavascriptInterface
    public String getReturnUrl4ChannelSign(String str) {
        y0.b("IAPFullSDK", "getReturnUrl4ChannelSign " + str);
        if (!Objects.equals(str, String.valueOf(5))) {
            return "";
        }
        return "iapfull://" + this.f13801b + "/alipaysignresult";
    }

    @JavascriptInterface
    public void alipaySign(String str) {
        if (TextUtils.isEmpty(str)) {
            y0.a("IAPFullSDK", "alipaySign sign params error");
            return;
        }
        WebViewActivity webViewActivity = this.f13800a.get();
        if (webViewActivity == null) {
            y0.a("IAPFullSDK", "alipaySign activity null");
            return;
        }
        Intent intent = new Intent(webViewActivity, (Class<?>) ThirdPayActivity.class);
        intent.putExtra("alipay_sign_url", str);
        webViewActivity.startActivityForResult(intent, 10001);
    }

    public a(WebViewActivity webViewActivity, String str) {
        this.f13800a = new WeakReference<>(webViewActivity);
        this.f13801b = str;
    }
}
