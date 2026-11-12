package com.huawei.multisimsdk.odsa.view;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hihealth.model.SampleEvent;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.multisimsdk.multidevicemanager.R;
import com.huawei.multisimsdk.odsa.response.OdsaResponseParam;
import defpackage.obm;
import defpackage.oco;
import defpackage.ocq;
import defpackage.oeb;
import defpackage.oec;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.apache.http.util.EncodingUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes12.dex */
public class BaseWebActivity extends Activity implements ILoginView, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PermissionRequest f18048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f18049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f18050c;
    private String d;
    private View e;
    private ProgressBar f;
    private int g;
    private d i;
    private WebView j;

    @Override // com.huawei.multisimsdk.odsa.view.ILoginView
    public void finishView() {
    }

    @Override // com.huawei.multisimsdk.odsa.view.ILoginView
    public Context getAppContext() {
        return null;
    }

    @Override // com.huawei.multisimsdk.odsa.view.ILoginView
    public void startAuthActivity(Intent intent, int i) {
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        ocq.e("BaseWebActivity", "onCreate start for no title.");
        requestWindowFeature(1);
        super.onCreate(bundle);
        setContentView(R.layout.sign_web);
        this.j = (WebView) findViewById(R.id.sign_webView);
        this.f = (ProgressBar) findViewById(R.id.progress_bar);
        this.f18050c = getApplicationContext();
        e();
        a();
        Intent intent = getIntent();
        if (intent == null) {
            ocq.c("BaseWebActivity", "intent is null");
            return;
        }
        Bundle bundle2 = (Bundle) intent.getParcelableExtra("OdsaResponseParam");
        OdsaResponseParam odsaResponseParam = (OdsaResponseParam) bundle2.getParcelable("OdsaResponseParamBundle");
        this.d = bundle2.getString("companion_terminal_service");
        if (odsaResponseParam == null) {
            ocq.c("BaseWebActivity", "BaseWebActivity odsaResponseParam is null");
            return;
        }
        String operationType = odsaResponseParam.getOperationType();
        String str = odsaResponseParam.getsubscriptionServiceContentsType();
        ocq.e("BaseWebActivity", odsaResponseParam.toString());
        if (oeb.f44225a[2].equals(operationType)) {
            e(odsaResponseParam.getNotEnabledUrl(), odsaResponseParam.getNotEnabledUserData(), str);
        } else if (oeb.f44225a[1].equals(operationType)) {
            e(odsaResponseParam.getSubscriptionServiceUrl(), odsaResponseParam.getSubscriptionServiceUserData(), str);
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ocq.e("BaseWebActivity", "onRequestPermissionsResult enter");
        if (i != 1) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            PermissionRequest permissionRequest = this.f18048a;
            if (permissionRequest != null) {
                permissionRequest.grant(new String[]{"android.webkit.resource.VIDEO_CAPTURE"});
            }
        } else {
            PermissionRequest permissionRequest2 = this.f18048a;
            if (permissionRequest2 != null) {
                permissionRequest2.deny();
            }
        }
        this.f18048a = null;
    }

    private void e(String str, String str2, String str3) {
        if (oco.b("ODSA_CUCC_DIFF_NUMBER_SUPPORT", (Boolean) false).booleanValue()) {
            ocq.e("BaseWebActivity", "autoSelectGetOrPostMethod mCompanionTerminalService: " + this.d);
            if (this.d.equals("DiffNumber")) {
                e(str, str2);
                return;
            }
        }
        if (oco.b("ODSA_SUPPORT_SEND_DATA_DIRECTLY", (Boolean) false).booleanValue()) {
            a(str, str2);
            return;
        }
        if (!oco.b("ODSA_SUPPORT_DYNAMIC_LOAD_WEBVIEW", (Boolean) false).booleanValue()) {
            c(str, str2);
        } else if (TextUtils.isEmpty(str3)) {
            e(str, str2);
        } else {
            c(str, str2);
        }
    }

    private void e() {
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        this.f18049b = new BigDecimal(point.y).divide(new BigDecimal("3"), 0, 4).intValue();
        View viewFindViewById = findViewById(R.id.sign_webView);
        this.e = viewFindViewById;
        viewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int height = this.e.getRootView().getHeight() - this.e.getHeight();
        ocq.e("BaseWebActivity", "mPreHeight:" + this.g + " heightDiff:" + height);
        if (this.g == height) {
            return;
        }
        this.g = height;
        if (height > this.f18049b) {
            ocq.e("BaseWebActivity", "hide activity");
            getWindow().addFlags(8192);
        } else {
            ocq.e("BaseWebActivity", "show activity");
            getWindow().clearFlags(8192);
        }
    }

    private void c() {
        WebSettings settings = this.j.getSettings();
        settings.setSupportZoom(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(2);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDatabaseEnabled(true);
        settings.setCacheMode(-1);
        settings.setAllowFileAccess(false);
        settings.setGeolocationEnabled(false);
        settings.setAllowContentAccess(true);
        settings.setDefaultTextEncodingName("UTF-8");
    }

    private void a() {
        ocq.b("BaseWebActivity", "initWebView");
        c();
        this.j.addJavascriptInterface(new a(), "ODSAServiceFlow");
        ocq.e("BaseWebActivity", "initWebView, currentUserAgent = " + this.j.getSettings().getUserAgentString());
        d dVar = new d();
        this.i = dVar;
        this.j.setWebViewClient(dVar);
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.removeAllCookies(null);
        cookieManager.flush();
        cookieManager.setAcceptCookie(true);
        cookieManager.setAcceptThirdPartyCookies(this.j, true);
        this.j.setWebChromeClient(new WebChromeClient() { // from class: com.huawei.multisimsdk.odsa.view.BaseWebActivity.1
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                ocq.a("BaseWebActivity", "onProgressChanged newProgress = " + i);
                if (i > 80) {
                    BaseWebActivity.this.e(false);
                }
                super.onProgressChanged(webView, i);
                webView.requestFocus();
            }

            @Override // android.webkit.WebChromeClient
            public void onPermissionRequest(PermissionRequest permissionRequest) {
                BaseWebActivity.this.b(permissionRequest);
            }
        });
    }

    @Override // com.huawei.multisimsdk.odsa.view.ILoginView
    public void loadUrl(final String str) {
        ocq.b("BaseWebActivity", "loadUrl:" + str);
        if (this.j != null) {
            ocq.b("BaseWebActivity", "loadUrl: begin " + str);
            this.j.post(new Runnable() { // from class: com.huawei.multisimsdk.odsa.view.BaseWebActivity.3
                @Override // java.lang.Runnable
                public void run() {
                    BaseWebActivity.this.j.loadUrl(str);
                }
            });
        }
    }

    public void e(String str, String str2) {
        final String str3;
        String string;
        if (oco.b("ODSA_CUCC_DIFF_NUMBER_SUPPORT", (Boolean) false).booleanValue()) {
            JSONObject jSONObjectE = e(str2);
            if (jSONObjectE != null) {
                try {
                    string = jSONObjectE.getString("carrierPostData");
                } catch (JSONException unused) {
                    ocq.b("BaseWebActivity", "Error getting carrierPostData");
                    string = "";
                }
                str3 = str + string;
            } else {
                ocq.b("BaseWebActivity", "jsonObject is null");
            }
            string = "";
            str3 = str + string;
        } else {
            str3 = str + "?" + str2;
            ocq.e("BaseWebActivity", "base web load default url");
        }
        ocq.b("BaseWebActivity", "loadUrl load Url = " + str3);
        WebView webView = this.j;
        if (webView != null) {
            webView.post(new Runnable() { // from class: com.huawei.multisimsdk.odsa.view.BaseWebActivity.2
                @Override // java.lang.Runnable
                public void run() {
                    BaseWebActivity.this.j.loadUrl(str3);
                }
            });
        }
    }

    private JSONObject e(String str) {
        if (str == null || str.isEmpty()) {
            ocq.c("BaseWebActivity", "subscriberData is null or empty");
            return null;
        }
        String[] strArrSplit = str.split("=", 2);
        if (strArrSplit.length < 2) {
            ocq.c("BaseWebActivity", "base64Data length < MIN_ARRAY_LENGTH: " + strArrSplit.length);
            return null;
        }
        if ("encodedValue".equals(strArrSplit[0])) {
            byte[] bArrDecode = Base64.decode(strArrSplit[1], 0);
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDecode) {
                sb.append((char) b2);
            }
            try {
                Object objNextValue = new JSONTokener(sb.toString()).nextValue();
                if (!(objNextValue instanceof JSONObject)) {
                    ocq.c("BaseWebActivity", "json doesn't instanceof JSONObject nor JSONArray");
                    return null;
                }
                return (JSONObject) objNextValue;
            } catch (JSONException unused) {
                ocq.b("BaseWebActivity", "JSONException");
                return null;
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(strArrSplit[0], strArrSplit[1]);
            return jSONObject;
        } catch (JSONException unused2) {
            ocq.b("BaseWebActivity", "JSONException");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(PermissionRequest permissionRequest) {
        ocq.e("BaseWebActivity", "onPermissionsRequest enter");
        for (String str : permissionRequest.getResources()) {
            ocq.e("BaseWebActivity", "onPermissionsRequest permission = " + str);
            if (str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                if (!obm.c("android.permission.CAMERA", this)) {
                    ocq.e("BaseWebActivity", "requestPermission permission for camera");
                    obm.a(this, new String[]{"android.permission.CAMERA"}, 1);
                    this.f18048a = permissionRequest;
                    return;
                } else {
                    ocq.e("BaseWebActivity", "already have permission");
                    permissionRequest.grant(new String[]{"android.webkit.resource.VIDEO_CAPTURE"});
                    return;
                }
            }
        }
    }

    private void a(final String str, final String str2) {
        WebView webView = this.j;
        if (webView != null) {
            webView.post(new Runnable() { // from class: com.huawei.multisimsdk.odsa.view.BaseWebActivity.5
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        BaseWebActivity.this.i.a(str2);
                        BaseWebActivity.this.j.postUrl(str, str2.getBytes("UTF-8"));
                    } catch (UnsupportedEncodingException unused) {
                        ocq.c("BaseWebActivity", "postUrlDirectly UnsupportedEncodingException");
                    }
                }
            });
        }
    }

    public void c(final String str, String str2) {
        JSONArray jSONArray;
        String[] strArrSplit = str2 != null ? str2.split("=", 2) : new String[0];
        if (strArrSplit.length < 2) {
            ocq.c("BaseWebActivity", "base64Data.length < MIN_ARRAY_LENGTH");
            return;
        }
        JSONObject jSONObject = null;
        if ("encodedValue".equals(strArrSplit[0])) {
            byte[] bArrDecode = Base64.decode(strArrSplit[1], 0);
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDecode) {
                sb.append((char) b2);
            }
            try {
                Object objNextValue = new JSONTokener(sb.toString()).nextValue();
                if (objNextValue instanceof JSONObject) {
                    jSONObject = (JSONObject) objNextValue;
                    jSONArray = null;
                } else if (objNextValue instanceof JSONArray) {
                    jSONArray = (JSONArray) objNextValue;
                } else {
                    ocq.c("BaseWebActivity", "json doesn't instanceof JSONObject nor JSONArray");
                    return;
                }
            } catch (JSONException unused) {
                ocq.b("BaseWebActivity", "JSONException");
                jSONArray = null;
            }
        } else {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(strArrSplit[0], strArrSplit[1]);
            } catch (JSONException unused2) {
                ocq.b("BaseWebActivity", "JSONException");
            }
            jSONArray = null;
            jSONObject = jSONObject2;
        }
        final String strD = d(jSONObject, jSONArray);
        if (strD == null) {
            ocq.e("BaseWebActivity", "postUrl: json is null");
            return;
        }
        WebView webView = this.j;
        if (webView != null) {
            webView.post(new Runnable() { // from class: com.huawei.multisimsdk.odsa.view.BaseWebActivity.4
                @Override // java.lang.Runnable
                public void run() {
                    BaseWebActivity.this.i.a(strD);
                    BaseWebActivity.this.j.postUrl(str, EncodingUtils.getBytes(strD, "BASE64"));
                }
            });
        }
    }

    private static String d(JSONObject jSONObject, JSONArray jSONArray) {
        String string;
        if (jSONObject == null && jSONArray == null) {
            return null;
        }
        if (jSONObject == null) {
            string = "";
        } else {
            string = jSONObject.toString();
        }
        if (jSONArray != null) {
            string = jSONArray.toString();
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    class a {
        a() {
        }

        @JavascriptInterface
        public void profileReadyWithDefaultSmdp(String str, String str2) {
            ocq.c("BaseWebActivity", "JS profileReadyWithDefaultSmdp defaultSmdpAddress=" + str + ", iccid=", str2);
            Intent intent = BaseWebActivity.this.getIntent();
            intent.putExtra("ActivationCode", "LPA:1$" + str + SampleEvent.SEPARATOR);
            BaseWebActivity.this.setResult(1, intent);
            BaseWebActivity.this.d();
        }

        @JavascriptInterface
        public void profileReadyWithActivationCode(String str) {
            ocq.c("BaseWebActivity", "JS profileReadyWithActivationCode activationCode=", str);
            Intent intent = BaseWebActivity.this.getIntent();
            intent.putExtra("ActivationCode", str);
            BaseWebActivity.this.setResult(1, intent);
            BaseWebActivity.this.d();
        }

        @JavascriptInterface
        public void dismissFlow() {
            BaseWebActivity.this.finish();
            ocq.e("BaseWebActivity", "JS dismissFlow");
        }

        @JavascriptInterface
        public void finishFlow() {
            BaseWebActivity.this.finish();
            ocq.e("BaseWebActivity", "JS finishFlow");
        }

        @JavascriptInterface
        public void checkProfileServiceStatus() {
            BaseWebActivity.this.setResult(2, BaseWebActivity.this.getIntent());
            ocq.e("BaseWebActivity", "JS checkProfileServiceStatus");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (oco.b("ODSA_SUPPORT_AUTO_FINISH_WEBVIEW", (Boolean) true).booleanValue()) {
            finish();
        }
    }

    class d extends WebViewClient {
        private String d;

        d() {
        }

        public void a(String str) {
            this.d = str;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            ocq.b("BaseWebActivity", "onPageStarted url = " + str);
            super.onPageStarted(webView, str, bitmap);
            BaseWebActivity.this.e(true);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            ocq.b("BaseWebActivity", "onPageFinished url = " + str);
            Log.e("BaseWebActivity", "onPageFinished Cookies = " + CookieManager.getInstance().getCookie(str));
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            ocq.a("BaseWebActivity", "onReceivedError error =" + webResourceError.getErrorCode() + ", des = " + ((Object) webResourceError.getDescription()));
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webView == null) {
                return;
            }
            webView.removeAllViews();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            ocq.a("BaseWebActivity", "onReceivedSslError error =" + sslError.toString());
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x002d A[Catch: ActivityNotFoundException -> 0x0039, TryCatch #1 {ActivityNotFoundException -> 0x0039, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0015, B:11:0x002d, B:13:0x0033, B:8:0x0025), top: B:21:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:13:0x0033 A[Catch: ActivityNotFoundException -> 0x0039, TRY_LEAVE, TryCatch #1 {ActivityNotFoundException -> 0x0039, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0015, B:11:0x002d, B:13:0x0033, B:8:0x0025), top: B:21:0x0007 }] */
        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Intent intent;
            try {
                try {
                    if (!TextUtils.isEmpty(str)) {
                        if (str.startsWith("chinaunicom")) {
                            intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                            intent.setData(Uri.parse(str));
                            intent.setFlags(268435456);
                        }
                        if (intent != null) {
                            BaseWebActivity.this.startActivity(intent);
                            return true;
                        }
                        ocq.h("BaseWebActivity", "intent is null");
                        return super.shouldOverrideUrlLoading(webView, str);
                    }
                    ocq.h("BaseWebActivity", "url is null");
                    intent = null;
                    if (intent != null) {
                        BaseWebActivity.this.startActivity(intent);
                        return true;
                    }
                    ocq.h("BaseWebActivity", "intent is null");
                    return super.shouldOverrideUrlLoading(webView, str);
                } catch (ActivityNotFoundException e) {
                    ocq.c("BaseWebActivity", "start browser failed:" + e);
                }
            } catch (ActivityNotFoundException unused) {
                ocq.h("BaseWebActivity", "chinaunicom app not exist, jump to download");
                Intent intent2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                intent2.setFlags(268435456);
                intent2.setData(Uri.parse("https://appgallery.huawei.com/app/C10059351"));
                BaseWebActivity.this.startActivity(intent2);
                return true;
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            ocq.a("BaseWebActivity", "shouldOverrideUrlLoading request = " + webResourceRequest);
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            String string = webResourceRequest.getUrl().toString();
            ocq.e("BaseWebActivity", "shouldInterceptRequest , request.getUrl=" + webResourceRequest.getUrl());
            if (this.d == null) {
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }
            try {
                OkHttpClient okHttpClientBuild = new OkHttpClient.Builder().cookieJar(new oec()).build();
                RequestBody requestBodyCreate = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), this.d);
                ocq.e("BaseWebActivity", "shouldInterceptRequest body:" + requestBodyCreate.toString());
                this.d = null;
                Response responseExecute = okHttpClientBuild.newCall(new Request.Builder().url(string).addHeader("METHOD", "POST").post(requestBodyCreate).build()).execute();
                Headers headers = responseExecute.headers();
                for (int i = 0; i < headers.size(); i++) {
                    ocq.b("BaseWebActivity", "shouldInterceptRequest i=" + i + ", name=" + headers.name(i) + ", value=" + headers.value(i));
                }
                ocq.b("BaseWebActivity", "shouldInterceptRequest response.header:" + responseExecute.header("Set-cookie"));
                ocq.e("BaseWebActivity", "response.body=" + responseExecute.body().byteStream());
                return new WebResourceResponse("text/html", responseExecute.header("content-encoding", "utf-8"), responseExecute.body().byteStream());
            } catch (IOException e) {
                ocq.a("BaseWebActivity", "occur an IOException:", e);
                return super.shouldInterceptRequest(webView, webResourceRequest);
            } catch (Exception e2) {
                ocq.a("BaseWebActivity", "occur an exception:", e2);
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        if (z) {
            this.j.setVisibility(8);
            this.f.setVisibility(0);
        } else {
            this.j.setVisibility(0);
            this.f.setVisibility(8);
        }
    }

    private void b() {
        WebView webView = this.j;
        if (webView != null) {
            webView.clearHistory();
            this.j.clearCache(true);
            this.j.removeAllViews();
            this.j.destroy();
            this.j = null;
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        b();
        ocq.e("BaseWebActivity", "destroy web view");
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
