package com.huawei.hms.iapfull.webpay;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.webkit.ProxyConfig;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hms.iapfull.R;
import com.huawei.hms.iapfull.a1;
import com.huawei.hms.iapfull.bean.PayRequest;
import com.huawei.hms.iapfull.bean.PayResult;
import com.huawei.hms.iapfull.bean.WebProductPayRequest;
import com.huawei.hms.iapfull.n0;
import com.huawei.hms.iapfull.p1;
import com.huawei.hms.iapfull.q1;
import com.huawei.hms.iapfull.webpay.thirdpay.IAPPaypalSDK;
import com.huawei.hms.iapfull.widget.actionbar.CustomActionBar;
import com.huawei.hms.iapfull.y0;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.secure.android.common.detect.RootDetect;
import com.huawei.secure.android.common.intent.SafeBundle;
import com.huawei.secure.android.common.intent.SafeIntent;
import com.huawei.secure.android.common.ssl.WebViewSSLCheck;
import com.huawei.secure.android.common.webview.SafeWebView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class WebViewActivity extends n0 implements q1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected SafeWebView f13780c;
    private CustomActionBar d;
    private PayRequest e;
    private WebProductPayRequest f;
    private com.huawei.hms.iapfull.webpay.b h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ProgressBar f13779b = null;
    private PayResult g = new PayResult();
    private b i = new b();
    private boolean j = false;

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        PayResult payResult;
        if (TextUtils.isEmpty(str)) {
            y0.b("WebViewActivity", "webview shouldOverrideUrl null ");
            return true;
        }
        if (str.startsWith("http") || str.startsWith(ProxyConfig.MATCH_HTTPS)) {
            y0.b("WebViewActivity", "thirdPaymentHandled no third pay, continue");
            if (!str.startsWith("https://webpay.cloud.huawei.com")) {
                return false;
            }
            y0.b("WebViewActivity", "webview handlerRedirectUrl result");
            String[] strArrSplit = str.split("\\?");
            if (strArrSplit.length > 1) {
                com.huawei.hms.iapfull.b.a(this, "iap_full_web_pay_finish", this.j ? this.h.a(this.f) : this.h.a(this.e));
                HashMap map = (HashMap) a1.a(strArrSplit[1], "&", b());
                if (map.isEmpty()) {
                    payResult = new PayResult(30099, "payresult is null");
                } else {
                    PayResult payResult2 = new PayResult();
                    payResult2.setReturnCode((String) map.get("returnCode"));
                    payResult2.setErrMsg((String) map.get("errMsg"));
                    payResult2.setOrderID((String) map.get("orderID"));
                    payResult2.setAmount((String) map.get(HwPayConstant.KEY_AMOUNT));
                    payResult2.setCurrency((String) map.get(HwPayConstant.KEY_CURRENCY));
                    payResult2.setCountry((String) map.get("country"));
                    payResult2.setTime((String) map.get("time"));
                    payResult2.setRequestId((String) map.get("requestId"));
                    payResult2.setUserName((String) map.get(HwPayConstant.KEY_USER_NAME));
                    payResult2.setSign((String) map.get(HwPayConstant.KEY_SIGN));
                    payResult2.setSignatureAlgorithm((String) map.get("signatureAlgorithm"));
                    payResult2.setInAppPurchaseData((String) map.get("inAppPurchaseData"));
                    payResult2.setInAppDataSignature((String) map.get("inAppDataSignature"));
                    try {
                        payResult2.setMicrosAmount(Long.parseLong((String) map.get("microsAmount")));
                    } catch (NumberFormatException unused) {
                        y0.a("WebViewActivity", "parsePayResult microsAmount NumberFormatException");
                    }
                    payResult2.setProductNo((String) map.get(HwPayConstant.KEY_PRODUCT_NO));
                    payResult = payResult2;
                }
                y0.b("WebViewActivity", "result code " + payResult.getReturnCode());
                Intent intent = new Intent();
                intent.putExtras(payResult.toBundle());
                setResult(-1, intent);
                finish();
            } else {
                a(-1, "payresult is null");
            }
        } else {
            y0.b("WebViewActivity", "safeStartThirdActivity to third pay");
            try {
                startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str)));
            } catch (ActivityNotFoundException unused2) {
                y0.a("WebViewActivity", "safeStartThirdActivity ActivityNotFoundException");
            }
        }
        return true;
    }

    static int e(WebViewActivity webViewActivity) {
        return webViewActivity.b() ? 60000 : 30000;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        y0.b("WebViewActivity", "showExitDialog");
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        int i = R.string.hwpay_check_to_cancel_pay;
        if (b() && this.f.isSubscribeReq()) {
            i = R.string.hwpay_subscribe_leave_notice;
        }
        builder.setMessage(i);
        builder.setPositiveButton(R.string.hwpay_exitpay_yes, new f(this));
        builder.setNegativeButton(R.string.hwpay_exitpay_no, new g(this));
        builder.create().show();
    }

    @Override // com.huawei.hms.iapfull.n0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setSoftInputMode(16);
        setContentView(R.layout.activity_webpay);
        if (getIntent() == null) {
            y0.a("WebViewActivity", "receivePayRequestFromIntent getIntent is null");
        } else {
            SafeBundle safeBundle = new SafeBundle(new SafeIntent(getIntent()).getExtras());
            if (WebProductPayRequest.TYPE_WEB_PRODUCT_PAY.equals(safeBundle.getString(WebProductPayRequest.PRODUCTPAY_BUNDLE_KEY))) {
                this.j = true;
                WebProductPayRequest webProductPayRequest = new WebProductPayRequest();
                this.f = webProductPayRequest;
                webProductPayRequest.fromBundle(safeBundle);
            } else {
                this.j = false;
                PayRequest payRequest = new PayRequest();
                this.e = payRequest;
                payRequest.fromBundle(safeBundle);
            }
        }
        CustomActionBar customActionBar = (CustomActionBar) findViewById(R.id.action_bar);
        this.d = customActionBar;
        customActionBar.setOnBackClickListener(new a());
        this.f13779b = (ProgressBar) findViewById(R.id.webview_progressbar);
        SafeWebView safeWebView = (SafeWebView) findViewById(R.id.uri_webview);
        this.f13780c = safeWebView;
        safeWebView.setBackgroundColor(getResources().getColor(R.color.emui_color_bg));
        this.f13780c.getSettings().setAllowContentAccess(false);
        this.f13780c.getSettings().setJavaScriptEnabled(true);
        this.f13780c.getSettings().setDomStorageEnabled(true);
        this.f13780c.addJavascriptInterface(new p1(this), "screenUtil");
        WebProductPayRequest webProductPayRequest2 = this.f;
        if (webProductPayRequest2 != null) {
            this.f13780c.addJavascriptInterface(new com.huawei.hms.iapfull.webpay.thirdpay.a(this, webProductPayRequest2.getPackageName()), "IAPFullSDK");
        } else {
            this.f13780c.addJavascriptInterface(new IAPPaypalSDK(this), "IAPFullSDK");
        }
        this.f13780c.setWebChromeClient(new e(this));
        this.f13780c.setWebViewClient(this.i, false);
        if (!RootDetect.isRoot()) {
            com.huawei.hms.iapfull.webpay.b bVar = this.j ? new com.huawei.hms.iapfull.webpay.b(this.f, this) : new com.huawei.hms.iapfull.webpay.b(this.e, this);
            this.h = bVar;
            bVar.b();
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage(R.string.hwpay_pay_root_tips_new);
            builder.setPositiveButton(R.string.hwpay_continue, new c(this));
            builder.setNegativeButton(R.string.hwpay_exitpay_no, new d(this));
            builder.create().show();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f13780c.canGoBack()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f13780c.goBack();
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i == 10001) {
                this.f13780c.loadUrl("javascript:alipaySignResult(\"ok\")");
                str = "send alipay sign result to web";
            } else {
                if (i != 10002) {
                    if (i == 10003) {
                        String stringExtra = intent != null ? intent.getStringExtra("paypal_sign_result") : "{\"result\":\"fail\",\"error\":\"NullException\"}";
                        y0.b("WebViewActivity", "send paypal sign result to web");
                        this.f13780c.loadUrl(String.format("javascript:paypalAppSignResult('%s')", stringExtra));
                        return;
                    }
                    return;
                }
                this.f13780c.loadUrl("javascript:wechatAppSignResult(\"ok\")");
                str = "send wechat sign result to web";
            }
            y0.b("WebViewActivity", str);
        }
    }

    public void a(PayResult payResult) {
        if (this.e != null) {
            y0.b("WebViewActivity", "exitPay with pay request");
            payResult.createPayResult(this.e);
        }
        Intent intent = new Intent();
        intent.putExtras(payResult.toBundle());
        setResult(-1, intent);
        finish();
    }

    private boolean b() {
        WebProductPayRequest webProductPayRequest = this.f;
        return webProductPayRequest != null && webProductPayRequest.isWebPayPmsVer4();
    }

    class b extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            y0.b("WebViewActivity", "onPageFinished");
            WebViewActivity webViewActivity = WebViewActivity.this;
            webViewActivity.f13779b.setProgress(0);
            y0.b("WebViewActivity", "showWebView");
            webViewActivity.f13780c.setVisibility(0);
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return WebViewActivity.this.b(str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            y0.a("WebViewActivity", "onReceivedSslError ");
            WebViewSSLCheck.checkServerCertificateNew(sslErrorHandler, sslError, WebViewActivity.this);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            y0.a("WebViewActivity", "onReceivedHttpError ");
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            y0.a("WebViewActivity", "onReceivedError ");
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            y0.b("WebViewActivity", "onPageStarted");
            super.onPageStarted(webView, str, bitmap);
        }

        b() {
        }
    }

    class a implements CustomActionBar.OnBackClickListener {
        @Override // com.huawei.hms.iapfull.widget.actionbar.CustomActionBar.OnBackClickListener
        public void onBackClick() {
            WebViewActivity.this.onBackPressed();
        }

        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str) {
        y0.b("WebViewActivity", "exitPay return code " + i);
        this.g.setErrMsg(str);
        this.g.setReturnCode(i);
        Intent intent = new Intent();
        intent.putExtras(this.g.toBundle());
        setResult(-1, intent);
        finish();
    }
}
