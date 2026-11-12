package com.huawei.sim.multisim;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Environment;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import androidx.core.content.FileProvider;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import com.huawei.sim.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import defpackage.lon;
import defpackage.pxl;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.xjt;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public class MultiSimWebView extends BaseActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CustomTitleBar f23113c;
    private Uri e;
    private ValueCallback<Uri[]> i;
    private HealthProgressBar j;
    private RelativeLayout k;
    private HealthButton o;
    private WebView p;
    private String l = "";
    private String h = "";
    private String n = "";
    private String m = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f23112b = "image";
    private String r = "video";
    private boolean g = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f23111a = "";
    private List<String> t = new ArrayList(16);
    private boolean d = false;
    private WebViewClient s = new WebViewClient() { // from class: com.huawei.sim.multisim.MultiSimWebView.2
        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            LogUtil.d("MultiSimWebView", "shouldOverrideUrlLoading, url:", str);
            return super.shouldOverrideUrlLoading(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            LogUtil.d("MultiSimWebView", "shouldOverrideUrlLoading");
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            MultiSimWebView.this.j.setVisibility(0);
            super.onPageStarted(webView, str, bitmap);
            LogUtil.d("MultiSimWebView", "onPageStarted, url:", str, ",mCookie:", MultiSimWebView.this.h);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            LogUtil.d("MultiSimWebView", "onReceivedError");
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webView == null) {
                return;
            }
            webView.stopLoading();
            webView.removeAllViews();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            LogUtil.d("MultiSimWebView", "onReceivedError");
            super.onReceivedError(webView, i, str, str2);
            LogUtil.d("MultiSimWebView", "onReceivedError-end");
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            LogUtil.d("MultiSimWebView", "onPageFinished, url:", str);
            MultiSimWebView.this.j.setVisibility(8);
            webView.loadUrl("javascript:window.local_obj.showSource('<html>'+document.getElementsByTagName('html')[0].innerHTML+'</html>');");
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            LogUtil.d("MultiSimWebView", "shouldInterceptRequest url", str);
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            LogUtil.d("MultiSimWebView", "shouldInterceptRequest");
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            LogUtil.d("MultiSimWebView", "onReceivedHttpError");
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            LogUtil.d("MultiSimWebView", "onReceivedHttpError-end");
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            LogUtil.d("MultiSimWebView", "onReceivedSslError");
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            LogUtil.d("MultiSimWebView", "onReceivedSslError-end");
        }

        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(WebView webView, String str) {
            LogUtil.d("MultiSimWebView", "shouldInterceptRequest");
            super.onPageCommitVisible(webView, str);
            LogUtil.d("MultiSimWebView", "onPageCommitVisible end");
        }

        @Override // android.webkit.WebViewClient
        public void onTooManyRedirects(WebView webView, Message message, Message message2) {
            LogUtil.d("MultiSimWebView", "onTooManyRedirects");
            super.onTooManyRedirects(webView, message, message2);
            LogUtil.d("MultiSimWebView", "onTooManyRedirects-end");
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
            LogUtil.d("MultiSimWebView", "shouldOverrideKeyEvent");
            return super.shouldOverrideKeyEvent(webView, keyEvent);
        }

        @Override // android.webkit.WebViewClient
        public void onFormResubmission(WebView webView, Message message, Message message2) {
            LogUtil.d("MultiSimWebView", "onFormResubmission");
            super.onFormResubmission(webView, message, message2);
            LogUtil.d("MultiSimWebView", "onFormResubmission-end");
        }

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
            LogUtil.d("MultiSimWebView", "doUpdateVisitedHistory");
            super.doUpdateVisitedHistory(webView, str, z);
            LogUtil.d("MultiSimWebView", "doUpdateVisitedHistory-end");
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            LogUtil.d("MultiSimWebView", "shouldInterceptRequest");
            super.onLoadResource(webView, str);
            LogUtil.d("MultiSimWebView", "onLoadResource end");
        }

        @Override // android.webkit.WebViewClient
        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
            LogUtil.d("MultiSimWebView", "onUnhandledKeyEvent");
            super.onUnhandledKeyEvent(webView, keyEvent);
            LogUtil.d("MultiSimWebView", "onUnhandledKeyEvent-end");
        }

        @Override // android.webkit.WebViewClient
        public void onScaleChanged(WebView webView, float f, float f2) {
            LogUtil.d("MultiSimWebView", "onScaleChanged");
            super.onScaleChanged(webView, f, f2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
            LogUtil.d("MultiSimWebView", "onReceivedLoginRequest");
            super.onReceivedLoginRequest(webView, str, str2, str3);
        }
    };
    private final BroadcastReceiver f = new BroadcastReceiver() { // from class: com.huawei.sim.multisim.MultiSimWebView.4
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null) {
                LogUtil.j("MultiSimWebView", "mNetBroadcastReceiver intent is null or action is null");
                return;
            }
            LogUtil.a("MultiSimWebView", "mNetBroadcastReceiver action = ", intent.getAction());
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                MultiSimWebView.this.runOnUiThread(new Runnable() { // from class: com.huawei.sim.multisim.MultiSimWebView.4.2
                    @Override // java.lang.Runnable
                    public void run() {
                        MultiSimWebView.this.i();
                    }
                });
            }
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        qrs.a((Activity) this);
        LogUtil.a("MultiSimWebView", "onCreate");
        Intent intent = getIntent();
        if (intent == null) {
            xjt.q("intent is null");
            return;
        }
        this.l = intent.getStringExtra("url");
        this.n = intent.getStringExtra("post_data");
        this.m = intent.getStringExtra("req_type");
        this.d = intent.getBooleanExtra("is_logout", false);
        LogUtil.a("MultiSimWebView", "onCreate mType:", this.m, ",mUrl:", this.l, ",mPostData:", this.n);
        setContentView(R.layout.activity_multi_sim_web_view);
        a();
        WebSettings settings = this.p.getSettings();
        settings.setSupportZoom(true);
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setGeolocationEnabled(false);
        settings.setAllowContentAccess(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setPluginState(WebSettings.PluginState.ON);
        this.p.addJavascriptInterface(this, "DataActivationController");
        b();
        this.p.setVisibility(0);
        this.p.requestFocus();
        setResult(1);
        i();
        c();
    }

    private void a() {
        this.j = (HealthProgressBar) qsp.a(this, R.id.load_url_progress);
        this.k = (RelativeLayout) findViewById(R.id.no_net_work_layout);
        this.o = (HealthButton) findViewById(R.id.no_net_work_btn);
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.multi_sim_config_title_bar);
        this.f23113c = customTitleBar;
        if (this.d) {
            customTitleBar.setTitleText(getResources().getString(R.string.IDS_esim_account_management));
        } else {
            customTitleBar.setTitleText(getResources().getString(R.string.IDS_plugin_multi_sim_config_title));
        }
        this.o.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.sim.multisim.MultiSimWebView.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CommonUtil.t(MultiSimWebView.this);
            }
        });
        this.p = (WebView) findViewById(R.id.web_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (pxl.b(this)) {
            this.j.setVisibility(0);
            this.k.setVisibility(8);
            this.p.setVisibility(0);
            d();
            return;
        }
        this.j.setVisibility(8);
        this.k.setVisibility(0);
        this.p.setVisibility(8);
    }

    private void d() {
        ThreadPoolManager.c().a("MultiSimWebView", new Runnable() { // from class: com.huawei.sim.multisim.MultiSimWebView.1
            @Override // java.lang.Runnable
            public void run() {
                final String strD = lon.c().d("domain_yihaoduozhongduan");
                final String strD2 = lon.c().d("domain_zdnlpz_yhdzd_chinamobile");
                final String strD3 = lon.c().d("domain_esim_yhdzd_chinamobile");
                final String strD4 = lon.c().d("domain_open_10086_cn");
                final String strD5 = lon.c().d("domain_url_array");
                MultiSimWebView.this.runOnUiThread(new Runnable() { // from class: com.huawei.sim.multisim.MultiSimWebView.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        MultiSimWebView.this.t.add(strD + ":8088/yhdzd/yhdzdLogin");
                        MultiSimWebView.this.t.add(strD + ":8088/yhdzd/");
                        MultiSimWebView.this.t.add(strD2 + ":9191");
                        MultiSimWebView.this.t.add(strD3 + ":8015");
                        MultiSimWebView.this.t.add(strD4 + "/websheet/signup");
                        MultiSimWebView.this.b(strD5);
                        MultiSimWebView.this.a(MultiSimWebView.this.l, MultiSimWebView.this.n, MultiSimWebView.this.m);
                        LogUtil.a("MultiSimWebView", "validUrlArray size is:", Integer.valueOf(MultiSimWebView.this.t.size()));
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("MultiSimWebView", "validUrlArray is empty");
            xjt.q("validUrlArray is empty");
            return;
        }
        String[] strArrSplit = str.split(",");
        if (strArrSplit == null || strArrSplit.length <= 0) {
            return;
        }
        this.t.addAll(Arrays.asList(strArrSplit));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, String str3) {
        if (a(str)) {
            d(str, str2, str3);
            return;
        }
        ReleaseLogUtil.e("DEVMGR_MultiSimWebView", "this url is illegal:", str);
        xjt.q("this url is illegal:" + str);
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (Pattern.compile("[<>]").matcher(Normalizer.normalize(str, Normalizer.Form.NFKC)).find()) {
            LogUtil.j("MultiSimWebView", "multi sim url is illegal");
            return false;
        }
        LogUtil.a("MultiSimWebView", "multi sim url is correct");
        return c(str);
    }

    private boolean c(String str) {
        for (int i = 0; i < this.t.size(); i++) {
            if (str.startsWith(this.t.get(i))) {
                return true;
            }
        }
        return false;
    }

    @JavascriptInterface
    public void doneSelected() {
        LogUtil.d("MultiSimWebView", "doneSelected, mUrl:", this.l);
        if (this.g) {
            setResult(2);
        }
        finish();
    }

    @JavascriptInterface
    public void dataPlanAccountUpdatedWithInfo(String str) {
        LogUtil.d("MultiSimWebView", "json:", str);
        this.g = true;
    }

    private void b() {
        this.p.setWebViewClient(this.s);
        this.p.setWebChromeClient(new WebChromeClient() { // from class: com.huawei.sim.multisim.MultiSimWebView.5
            @Override // android.webkit.WebChromeClient
            public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                LogUtil.a("MultiSimWebView", "onShowFileChooser()");
                if (fileChooserParams == null || fileChooserParams.getAcceptTypes() == null || fileChooserParams.getAcceptTypes().length == 0) {
                    ReleaseLogUtil.a("MultiSimWebView", "fileChooserParams is error.");
                    xjt.q("fileChooserParams is error.");
                    return false;
                }
                MultiSimWebView.this.f23111a = fileChooserParams.getAcceptTypes()[0];
                ReleaseLogUtil.d("DEVMGR_MultiSimWebView", "acceptType = ", MultiSimWebView.this.f23111a);
                MultiSimWebView.this.i = valueCallback;
                MultiSimWebView.this.e();
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                MultiSimWebView.this.j.setProgress(i);
                webView.requestFocus();
            }

            @Override // android.webkit.WebChromeClient
            public void onPermissionRequest(final PermissionRequest permissionRequest) {
                LogUtil.a("MultiSimWebView", "onPermissionRequest()");
                MultiSimWebView.this.runOnUiThread(new Runnable() { // from class: com.huawei.sim.multisim.MultiSimWebView.5.2
                    @Override // java.lang.Runnable
                    public void run() {
                        PermissionRequest permissionRequest2 = permissionRequest;
                        permissionRequest2.grant(permissionRequest2.getResources());
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Intent intent;
        if (TextUtils.isEmpty(this.f23111a)) {
            LogUtil.j("MultiSimWebView", "acceptType is empty.");
            return;
        }
        if (this.f23111a.contains(this.f23112b)) {
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
            c(intent, "jpg");
        } else if (this.f23111a.contains(this.r)) {
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
            intent.putExtra("android.intent.extra.videoQuality", 1);
            intent.putExtra("android.intent.extra.durationLimit", 6);
            c(intent, "mp4");
        } else {
            LogUtil.j("MultiSimWebView", "acceptType is error.");
            return;
        }
        startActivityForResult(intent, 1);
    }

    private void c(Intent intent, String str) {
        File file = new File(getExternalFilesDir(Environment.DIRECTORY_PICTURES), "imageCapture" + System.currentTimeMillis() + "." + str);
        StringBuilder sb = new StringBuilder();
        sb.append(getPackageName());
        sb.append(".fileprovider");
        Uri uriForFile = FileProvider.getUriForFile(this, sb.toString(), new File(file.getPath()));
        this.e = uriForFile;
        LogUtil.a("MultiSimWebView", "captureUri = ", uriForFile);
        intent.putExtra("output", this.e);
        intent.addFlags(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        PermissionUtil.d(this, PermissionUtil.PermissionType.CAMERA, new CustomPermissionAction(this) { // from class: com.huawei.sim.multisim.MultiSimWebView.10
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                LogUtil.a("MultiSimWebView", "enterVideoPage() onGranted");
                MultiSimWebView.this.g();
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                LogUtil.a("MultiSimWebView", "enterVideoPage() onDenied");
                MultiSimWebView.this.j();
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                LogUtil.a("MultiSimWebView", "enterVideoPage() onForeverDenied");
                MultiSimWebView.this.j();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        qrs.b(this, PermissionUtil.PermissionType.CAMERA, new View.OnClickListener() { // from class: pwr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.c(view);
            }
        }, new View.OnClickListener() { // from class: pwn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f45910c.b(view);
            }
        });
    }

    public /* synthetic */ void c(View view) {
        qrs.al(this);
        finish();
    }

    public /* synthetic */ void b(View view) {
        finish();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x010f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0113  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        ValueCallback<Uri[]> valueCallback;
        super.onActivityResult(i, i2, intent);
        ReleaseLogUtil.d("DEVMGR_MultiSimWebView", "resultCode = ", Integer.valueOf(i2), "requestCode = ", Integer.valueOf(i));
        if (i == 1) {
            try {
                if (i2 != -1) {
                    valueCallback = this.i;
                    if (valueCallback == null) {
                    } else {
                        valueCallback.onReceiveValue(new Uri[]{Uri.parse("")});
                    }
                } else if (this.i == null) {
                    LogUtil.j("MultiSimWebView", "mFilePathCallback is null.");
                    xjt.q("mFilePathCallback is null.");
                    ValueCallback<Uri[]> valueCallback2 = this.i;
                    if (valueCallback2 == null) {
                    } else {
                        valueCallback2.onReceiveValue(new Uri[]{Uri.parse("")});
                    }
                } else {
                    LogUtil.a("MultiSimWebView", "acceptType = ", this.f23111a);
                    if (!TextUtils.isEmpty(this.f23111a) && this.f23111a.contains(this.f23112b)) {
                        LogUtil.a("MultiSimWebView", "captureUri" + this.e);
                        this.i.onReceiveValue(new Uri[]{this.e});
                    } else if (TextUtils.isEmpty(this.f23111a) || !this.f23111a.contains(this.r)) {
                        LogUtil.a("MultiSimWebView", "acceptType is invalid");
                    } else if (intent != null) {
                        LogUtil.a("MultiSimWebView", "data : " + intent.getData());
                        this.i.onReceiveValue(new Uri[]{intent.getData()});
                    }
                    this.i = null;
                    valueCallback = this.i;
                    if (valueCallback == null) {
                    } else {
                        valueCallback.onReceiveValue(new Uri[]{Uri.parse("")});
                    }
                }
            } catch (Exception e) {
                LogUtil.e("MultiSimWebView", TrackConstants$Events.EXCEPTION + ExceptionUtils.c(e));
                ValueCallback<Uri[]> valueCallback3 = this.i;
                if (valueCallback3 != null) {
                    valueCallback3.onReceiveValue(new Uri[]{Uri.parse("")});
                }
            } finally {
                ValueCallback<Uri[]> valueCallback4 = this.i;
                if (valueCallback4 != null) {
                    valueCallback4.onReceiveValue(new Uri[]{Uri.parse("")});
                    this.i = null;
                }
            }
        } else {
            valueCallback = this.i;
            if (valueCallback == null) {
            } else {
                valueCallback.onReceiveValue(new Uri[]{Uri.parse("")});
            }
        }
    }

    public void d(String str, String str2, String str3) {
        LogUtil.d("MultiSimWebView", "loadUrl type:", str3);
        try {
            if ("WS".equals(str3)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("carrierPostData", str2);
                String string = jSONObject.toString();
                this.p.loadUrl(str + "?param=" + URLEncoder.encode(string, "utf-8"));
                return;
            }
            this.p.loadUrl(str + "?carrierPostData=" + URLEncoder.encode(str2, "utf-8"));
        } catch (UnsupportedEncodingException unused) {
            LogUtil.e("MultiSimWebView", "UnsupportedEncodingException");
        } catch (JSONException unused2) {
            LogUtil.e("MultiSimWebView", "JSONException");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        f();
    }

    private void c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(this.f, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void f() {
        try {
            LogUtil.a("MultiSimWebView", "unregisterNetBroadcast");
            unregisterReceiver(this.f);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("MultiSimWebView", "unregisterNetBroadcast IllegalArgumentException");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
