package com.huawei.ui.main.stories.me.views.privacy;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.api.DeviceGeneralSettingApi;
import com.huawei.health.device.callback.DeleteDeviceCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcloudmodel.agreement.AgrConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.utils.WebViewUtils;
import com.huawei.secure.android.common.ssl.WebViewSSLCheck;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.me.js.JsInteraction;
import com.huawei.ui.main.stories.me.views.privacy.ServiceItemActivity;
import defpackage.iox;
import defpackage.mgg;
import defpackage.mii;
import defpackage.qop;
import defpackage.qqs;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.vvz;
import defpackage.vwc;
import defpackage.vxc;
import defpackage.wmi;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
public class ServiceItemActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static List<String> f28574a = new ArrayList();
    private static Set<String> e = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f28575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f28576c;
    private CustomTitleBar g;
    private vvz h;
    private wmi j;
    private LinearLayout k;
    private HealthProgressBar l;
    private boolean m;
    private LinearLayout n;
    private qop p;
    private RelativeLayout r;
    private HealthButton s;
    private int t;
    private WebView u;
    private String w;
    private LinearLayout x;
    protected Handler d = new Handler();
    private String f = "";
    private String i = "";
    private String o = "";
    private Runnable q = new Runnable() { // from class: com.huawei.ui.main.stories.me.views.privacy.ServiceItemActivity.2
        @Override // java.lang.Runnable
        public void run() {
            String str = Locale.getDefault().getLanguage() + Constants.LINK + Locale.getDefault().getCountry() + ".html";
            String str2 = "file:///android_asset/healthUserAgreement/" + str;
            String str3 = Locale.getDefault().getLanguage() + ".html";
            String str4 = "file:///android_asset/healthUserAgreement/" + str3;
            LogUtil.d("ServiceItemActivity", "User_agreementAll = ", str, ", User_agreement = ", str3);
            if (ServiceItemActivity.this.u != null) {
                WebSettings settings = ServiceItemActivity.this.u.getSettings();
                if (settings != null) {
                    settings.setGeolocationEnabled(false);
                    settings.setAllowFileAccess(false);
                    settings.setAllowContentAccess(false);
                }
                if (ServiceItemActivity.this.d(str)) {
                    ServiceItemActivity.this.u.loadUrl(str2);
                } else if (ServiceItemActivity.this.d(str3)) {
                    ServiceItemActivity.this.u.loadUrl(str4);
                } else {
                    ServiceItemActivity.this.u.loadUrl("file:///android_asset/healthUserAgreement/en-US.html");
                }
            }
        }
    };

    public static /* synthetic */ boolean d(View view) {
        return true;
    }

    static {
        f28574a.add("3rdshare");
        f28574a.add("3rdsdk");
        f28574a.add("di");
        e.add("VmallUserAgreement");
        e.add("VmallPrivacy");
        e.add("SagaPrivacyStatement");
        e.add("SagaPersonalInfoCollection");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f28575b = this;
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        this.j = new wmi(this.f28575b, this, null);
        try {
            this.w = intent.getStringExtra("Agreement_key");
            this.m = intent.getBooleanExtra("Is_show_cancel_key", true);
            this.f = intent.getStringExtra("device_id");
            this.i = intent.getStringExtra("device_name");
            this.t = intent.getIntExtra("product_type", 0);
            this.o = intent.getStringExtra("wear_legal_come_from");
        } catch (Exception unused) {
            LogUtil.e("ServiceItemActivity", "onCreate getStringExtra error!");
        }
        if (CommonUtil.ac(this.f28575b.getApplicationContext())) {
            setContentView(R.layout.fragment_web_view_error_1);
            ab();
            return;
        }
        try {
            setContentView(R.layout.hw_show_settings_about_serviceitem);
            ac();
            z();
        } catch (RuntimeException unused2) {
            LogUtil.e("ServiceItemActivity", "onCreate setContentView webview error.");
            finish();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void loadApplicationTheme() {
        loadTheme("EmergencyTheme");
    }

    private void ab() {
        LogUtil.a("ServiceItemActivity", "initErrorView ServiceItemActivity.isErrorWebView");
        ((Button) findViewById(R.id.btn_go_setting)).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.views.privacy.ServiceItemActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("ServiceItemActivity", "initErrorView ServiceItemActivity.uninstallApk");
                try {
                    CommonUtil.p(ServiceItemActivity.this.f28575b, "com.google.android.webview");
                } catch (Exception unused) {
                    LogUtil.e("ServiceItemActivity", "initErrorView test");
                }
            }
        });
        this.g = (CustomTitleBar) qsp.a(this, R.id.mini_shop__webview_titlebar);
    }

    private void ac() {
        LogUtil.a("ServiceItemActivity", "initView()");
        WebView webView = (WebView) findViewById(R.id.hw_health_user_agreement_webview);
        this.u = webView;
        webView.setBackgroundColor(0);
        qqs.a(this.f28575b, this.u);
        this.n = (LinearLayout) findViewById(R.id.service_layout_loading);
        this.k = (LinearLayout) findViewById(R.id.service_item_linear);
        this.x = (LinearLayout) findViewById(R.id.stop_service_layout);
        ((HealthButton) findViewById(R.id.stop_service)).setOnClickListener(this);
        this.r = (RelativeLayout) findViewById(R.id.reload_layout);
        this.s = (HealthButton) findViewById(R.id.btn_no_net_work);
        this.n.setVisibility(0);
        HealthProgressBar healthProgressBar = (HealthProgressBar) this.n.findViewById(R.id.service_info_loading);
        this.l = healthProgressBar;
        healthProgressBar.setVisibility(0);
        this.s.setOnClickListener(this);
        this.g = (CustomTitleBar) qsp.a(this, R.id.hw_health_service_title_layout);
        b(this.w);
        this.g.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.views.privacy.ServiceItemActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ServiceItemActivity.this.u != null && ServiceItemActivity.this.u.canGoBack()) {
                    ServiceItemActivity.this.u.goBack();
                    ServiceItemActivity.this.ae();
                } else {
                    ServiceItemActivity.this.finish();
                }
            }
        });
        if (CommonUtil.y(this.f28575b)) {
            return;
        }
        this.u.setOnLongClickListener(new View.OnLongClickListener() { // from class: vxs
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ServiceItemActivity.d(view);
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    private void b(String str) {
        if (str == null) {
        }
        switch (str) {
            case "HealthUserPrivacyStatement":
                this.g.setTitleText(this.f28575b.getString(R.string.IDS_setting_wearhome_privacy_BG_statement));
                break;
            case "SagaPersonalInfoCollection":
                this.g.setTitleText(this.f28575b.getString(R.string.IDS_hwh_personal_info));
                break;
            case "WatchHealthUserAgreement":
                this.g.setTitleText(this.f28575b.getString(R.string.IDS_setting_wearhome_end_user_agreement));
                break;
            case "WatchHealthHarmonyOSAgreement":
                this.g.setTitleText(this.f28575b.getString(R.string.IDS_setting_wearhome_harmony_os_agreement));
                break;
            case "3rdshare":
                this.g.setTitleText(this.f28575b.getString(R.string.IDS_hw_health_list_third_shared_msg));
                break;
            case "3rdsdk":
                this.g.setTitleText(this.f28575b.getString(R.string.IDS_hwh_third_party_sdk));
                break;
            case "di":
                this.g.setTitleText(this.f28575b.getString(R.string.IDS_hw_health_privacy_statement_abstract));
                break;
            case "SagaPrivacyStatement":
            default:
                LogUtil.j("ServiceItemActivity", "updateTitleText default");
                break;
        }
    }

    private void af() {
        if (CommonUtil.ab(this.f28575b.getApplicationContext()) || !CommonUtil.y(this.f28575b)) {
            return;
        }
        this.r.setVisibility(0);
        this.k.setVisibility(8);
        this.n.setVisibility(8);
    }

    private void z() {
        if (CommonUtil.ca() && !f28574a.contains(this.w)) {
            this.d.postDelayed(this.q, 100L);
            this.l.setVisibility(4);
            this.n.setVisibility(8);
            return;
        }
        af();
        WebSettings settings = this.u.getSettings();
        settings.setGeolocationEnabled(false);
        settings.setAllowContentAccess(false);
        if (CommonUtil.ab(this.f28575b)) {
            settings.setCacheMode(-1);
        } else {
            settings.setCacheMode(1);
        }
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(true);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowFileAccess(false);
        if (CommonUtil.y(this.f28575b) && !e.contains(this.w) && this.m && !SharedPreferenceManager.b(Integer.toString(PrebakedEffectId.RT_FLY), "is_base_service_model", false)) {
            this.g.setRightButtonVisibility(0);
            this.g.setRightButtonDrawable(getResources().getDrawable(R.drawable.ic_more_normal_black), qre.f(R.string.accessibility_more_item));
            this.g.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.views.privacy.ServiceItemActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ServiceItemActivity.this.ai();
                }
            });
        }
        ae();
        c(this.u);
        d(this.u);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        WebView webView = this.u;
        if (webView != null && webView.canGoBack()) {
            this.u.goBack();
            if (this.u.canGoBack()) {
                LogUtil.a("ServiceItemActivity", "mUserAgreement can go back, don't need show stop");
                return;
            } else {
                ae();
                return;
            }
        }
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ae() {
        if (("HealthUserAgreement".equals(this.w) || "HealthPrivacy".equals(this.w)) && this.m) {
            this.x.setVisibility(0);
        } else {
            this.x.setVisibility(8);
        }
    }

    private void d(WebView webView) {
        webView.setWebViewClient(new WebViewClient() { // from class: com.huawei.ui.main.stories.me.views.privacy.ServiceItemActivity.1
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView2, String str) {
                super.onPageFinished(webView2, str);
                ServiceItemActivity.this.l.setVisibility(4);
                ServiceItemActivity.this.n.setVisibility(8);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedSslError(WebView webView2, SslErrorHandler sslErrorHandler, SslError sslError) {
                LogUtil.e("ServiceItemActivity", "on received ssl error");
                if (sslError != null) {
                    WebViewSSLCheck.checkServerCertificateNew(sslErrorHandler, sslError, ServiceItemActivity.this.f28575b);
                }
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                return ServiceItemActivity.this.b(webView2, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(WebView webView, String str) {
        if (!CommonUtil.y(this.f28575b)) {
            LogUtil.a("ServiceItemActivity", "loadOverrideUrl is OOBE");
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("ServiceItemActivity", "loadOverrideUrl url is null");
            return true;
        }
        qqs.a(this.f28575b, webView);
        if (!e(str)) {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str).normalizeScheme());
            ComponentName componentNameResolveActivity = intent.resolveActivity(getPackageManager());
            if (componentNameResolveActivity != null) {
                qrs.c(intent, componentNameResolveActivity.getPackageName(), this, qre.f(com.huawei.ui.commonui.R.string.IDS_browser_app_name));
            }
            return true;
        }
        if (vwc.b(str)) {
            c(str);
            return true;
        }
        if (str.contains("minisite/cloudservice/health") && this.m) {
            this.x.setVisibility(0);
        } else {
            this.x.setVisibility(8);
        }
        int iIndexOf = str.indexOf("minisite/legal/privacy/statement.htm");
        if (iIndexOf < 0) {
            return false;
        }
        webView.loadUrl(str.substring(0, iIndexOf + 36) + ("?country=" + e() + u()));
        return true;
    }

    private void c(String str) {
        try {
            Intent uri = Intent.parseUri(str, 1);
            if (getPackageManager().resolveActivity(uri, 0) == null) {
                return;
            }
            try {
                startActivity(uri);
            } catch (ActivityNotFoundException e2) {
                LogUtil.e("ServiceItemActivity", "shouldOverrideUrlByDeepLink ActivityNotFoundException: ", e2.getMessage());
            }
        } catch (URISyntaxException e3) {
            LogUtil.e("ServiceItemActivity", "shouldOverrideUrlByDeepLink URISyntaxException: ", e3.getMessage());
        }
    }

    protected void c(final WebView webView) {
        LogUtil.a("ServiceItemActivity", "loadWebViewUrl");
        if (webView == null) {
            LogUtil.j("ServiceItemActivity", "loadWebViewUrl webView is null");
            return;
        }
        if ("HealthPrivacy".equals(this.w) && !CommonUtil.az()) {
            JsInteraction jsInteraction = new JsInteraction(this.f28575b);
            webView.addJavascriptInterface(jsInteraction, "JsInteraction");
            webView.addJavascriptInterface(jsInteraction, "checkMore");
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.me.views.privacy.ServiceItemActivity.10
            @Override // java.lang.Runnable
            public void run() {
                ServiceItemActivity.this.aa();
                if (TextUtils.isEmpty(ServiceItemActivity.this.f28576c)) {
                    LogUtil.j("ServiceItemActivity", "loadWebViewUrl mDomaniUrl is empty");
                    return;
                }
                if (ServiceItemActivity.this.isFinishing() || ServiceItemActivity.this.isDestroyed()) {
                    LogUtil.j("ServiceItemActivity", "loadWebViewUrl isFinishing or isDestroyed");
                } else if (ServiceItemActivity.this.d != null) {
                    final String strReplaceSpace = WebViewUtils.replaceSpace(ServiceItemActivity.this.w());
                    ServiceItemActivity.this.d.post(new Runnable() { // from class: com.huawei.ui.main.stories.me.views.privacy.ServiceItemActivity.10.3
                        @Override // java.lang.Runnable
                        public void run() {
                            WebSettings settings = webView.getSettings();
                            if (settings != null) {
                                settings.setJavaScriptEnabled(ServiceItemActivity.this.e(strReplaceSpace));
                            }
                            webView.loadUrl(strReplaceSpace);
                        }
                    });
                } else {
                    LogUtil.j("ServiceItemActivity", "loadWebViewUrl mHandler is null");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(String str) {
        if ("SagaPrivacyStatement".equals(this.w) || "SagaPersonalInfoCollection".equals(this.w) || "WatchHealthUserAgreement".equals(this.w) || "BetaUserAgreement".equals(this.w) || "HealthUserPrivacyStatement".equals(this.w) || "WatchHealthHarmonyOSAgreement".equals(this.w)) {
            return true;
        }
        return vwc.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:68:0x00d0  */
    public void aa() {
        if (this.w == null) {
            this.w = "";
        }
        String str = this.w;
        str.hashCode();
        switch (str) {
            case "SagaPersonalInfoCollection":
            case "SagaPrivacyStatement":
            case "BetaUserAgreement":
            case "WatchHealthHarmonyOSAgreement":
            case "WatchHealthUserAgreement":
                String noCheckUrl = GRSManager.c(this.f28575b).getNoCheckUrl("domainLegalCloudHuawei", e());
                this.f28576c = noCheckUrl;
                if (TextUtils.isEmpty(noCheckUrl)) {
                    this.f28576c = GRSManager.c(this.f28575b).getNoCheckUrl("domainPrivacyConsumerHuawei", e());
                    break;
                }
                break;
            case "LocationInfoTerms":
            case "/terms/scope/huawei/vmall/privacy-statement.htm?country=CN&language=zh_Hans_CN":
            case "3rdshare":
            case "di":
            case "LocationServiceTerms":
            case "VmallPrivacy":
            case "HealthPrivacy":
            case "3rdsdk":
            case "HealthUserAgreement":
                this.f28576c = GRSManager.c(this.f28575b).getNoCheckUrl("domainPrivacyLegalCloudHuawei", e());
                break;
            case "HealthUserPrivacyStatement":
                this.f28576c = GRSManager.c(this.f28575b).getNoCheckUrl("userAgreementDomain", e());
                break;
            default:
                this.f28576c = GRSManager.c(this.f28575b).getNoCheckUrl("domainConsumerHuawei", e());
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ai() {
        View viewInflate = LayoutInflater.from(this.f28575b).inflate(R.layout.disagree_with_this_service, (ViewGroup) null);
        qop qopVar = new qop(this.f28575b, viewInflate);
        this.p = qopVar;
        qopVar.e(this.g, 17);
        viewInflate.findViewById(R.id.disagree_service).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.views.privacy.ServiceItemActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ServiceItemActivity.this.p != null) {
                    ServiceItemActivity.this.p.e();
                }
                ServiceItemActivity.this.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (("HealthUserPrivacyStatement".equals(this.w) || "WatchHealthUserAgreement".equals(this.w) || "WatchHealthHarmonyOSAgreement".equals(this.w)) && !TextUtils.isEmpty(this.f)) {
            if ("ARKUIX".equals(this.o)) {
                g();
                return;
            }
            vvz vvzVar = new vvz(this.f, this.i, this);
            this.h = vvzVar;
            vvzVar.e();
            return;
        }
        this.j.j();
    }

    private void g() {
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.a("ServiceItemActivity", "deleteDeviceFromArkUi api is null");
        } else {
            deviceGeneralSettingApi.deleteDevice(this.f, this.i, true, new AnonymousClass7());
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.me.views.privacy.ServiceItemActivity$7, reason: invalid class name */
    public class AnonymousClass7 implements DeleteDeviceCallback {
        AnonymousClass7() {
        }

        @Override // com.huawei.health.device.callback.DeleteDeviceCallback
        public void onSuccess() {
            LogUtil.a("ServiceItemActivity", "deleteDevice onSuccess");
            ServiceItemActivity.this.runOnUiThread(new Runnable() { // from class: vxv
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.e();
                }
            });
        }

        public /* synthetic */ void e() {
            ServiceItemActivity.this.c();
        }

        @Override // com.huawei.health.device.callback.DeleteDeviceCallback
        public void onFail(String str) {
            LogUtil.a("ServiceItemActivity", "deleteDevice onFail");
        }
    }

    public void c() {
        Activity[] activityArrE = BaseApplication.e();
        if (activityArrE == null) {
            return;
        }
        for (Activity activity : activityArrE) {
            String className = activity.getComponentName().getClassName();
            LogUtil.a("ServiceItemActivity", "finishActivity :", className);
            if (!"com.huawei.health.MainActivity".equals(className)) {
                activity.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:57:0x00c0  */
    public String w() {
        if (getIntent() == null) {
            return s();
        }
        if (this.w == null) {
            this.w = "default";
        }
        switch (this.w) {
            case "VmallUserAgreement":
                return this.f28576c + "/terms/scope/huawei/vmall/terms.htm?country=CN&language=zh_Hans_CN";
            case "VmallPrivacy":
                return this.f28576c + "/terms/scope/huawei/vmall/privacy-statement.htm?country=CN&language=zh_Hans_CN";
            case "HealthUserAgreement":
                return s();
            case "HealthUserPrivacyStatement":
                return r();
            case "SagaPrivacyStatement":
                return k();
            case "SagaPersonalInfoCollection":
                return m();
            case "WatchHealthUserAgreement":
                return ad();
            case "WatchHealthHarmonyOSAgreement":
                return x();
            case "BetaUserAgreement":
                return j();
            case "3rdshare":
            case "3rdsdk":
            case "di":
                return v();
            case "LocationServiceTerms":
                return d("/terms/scope/huawei/health-location/location-service-terms.htm?code=", e());
            case "LocationInfoTerms":
                return d("/terms/scope/huawei/health-location/location-info-terms.htm?code=", e());
            case "HealthPrivacy":
            default:
                return d();
        }
    }

    private String j() {
        String strE = e();
        LogUtil.a("ServiceItemActivity", "getBetaUserAgreementUrl: serviceCountry" + strE, " getUrlLanguage ", u());
        if (TextUtils.isEmpty(strE)) {
            return this.f28576c + "/terms/scope/huawei/health-beta/beta-terms.htm?&code=cn" + u();
        }
        return this.f28576c + "/terms/scope/huawei/health-beta/beta-terms.htm?&code=" + strE + u();
    }

    private String k() {
        int i = this.t;
        if (i == 80) {
            return y();
        }
        if (i == 107) {
            return t();
        }
        return "";
    }

    private String t() {
        String strE = e();
        if (TextUtils.isEmpty(strE)) {
            strE = "cn";
        }
        return this.f28576c + "/terms/scope/huawei/huawei-watch-buds/privacy-statement.htm?code=" + strE + u() + a() + "&branchid=0" + h();
    }

    private String y() {
        String strE = e();
        if (TextUtils.isEmpty(strE)) {
            return this.f28576c + "/legal/huawei-watch-buds/privacy-statement.htm?country=cn" + u() + h();
        }
        return this.f28576c + "/legal/huawei-watch-buds/privacy-statement.htm?country=" + strE + u() + h();
    }

    private String m() {
        int i = this.t;
        if (i == 80) {
            return p();
        }
        if (i == 107) {
            return q();
        }
        return "";
    }

    private String q() {
        return t() + "&contenttag=di";
    }

    private String p() {
        return y() + "&contenttag=di";
    }

    private String v() {
        return this.f28576c + "/terms/scope/huawei/health/privacy-statement.htm?code=CN&language=zh_Hans_CN&contenttag=" + this.w + n();
    }

    private String ad() {
        String strC = vxc.c(this.t, "user_agreement");
        if (!TextUtils.isEmpty(strC)) {
            return vxc.a(this.t, strC, e(), iox.b());
        }
        return this.f28576c + "/legal/wearable-eula/terms.htm?code=" + e() + u();
    }

    private String x() {
        String strB;
        if (mii.d(this.f)) {
            String strE = mii.e(this.f);
            if (TextUtils.isEmpty(strE)) {
                ReleaseLogUtil.d("R_ServiceItemActivity", "getWatchHealthHarmonyOSAgreementUrl use backup url.");
                return this.f28576c + "/terms/scope/huawei/smartwatch-hmos/terms.htm?code=" + e() + u();
            }
            return this.f28576c + strE + "&code=" + e() + u();
        }
        DeviceInfo deviceInfoC = mgg.c(this.f, "ServiceItemActivity");
        if (deviceInfoC == null) {
            strB = "";
        } else {
            strB = vxc.b(this.t, deviceInfoC.getHiLinkDeviceId());
        }
        return this.f28576c + (TextUtils.isEmpty(strB) ? "/terms/scope/huawei/smartwatch-hmos/terms.htm?code=" : strB) + e() + u();
    }

    private String r() {
        String strE = e();
        if (TextUtils.isEmpty(strE)) {
            return this.f28576c + "/legal/privacy/statement.htm?branchid=0&version=latest&contenttag=default&code=cn" + u();
        }
        return this.f28576c + "/legal/privacy/statement.htm?branchid=0&version=latest&contenttag=default&code=" + strE + u();
    }

    protected String d() {
        String strE = e();
        if (TextUtils.isEmpty(strE)) {
            return o();
        }
        return d("/terms/scope/huawei/health/privacy-statement.htm?code=", strE);
    }

    private String d(String str, String str2) {
        return this.f28576c + str + str2 + u() + n();
    }

    private String u() {
        return Constants.LANGUAGE + iox.b();
    }

    private String h() {
        if (qqs.e(this)) {
            return "&bgmode=dark";
        }
        return "&bgmode=light";
    }

    private String n() {
        return "&clientVersion=" + AgrConstant.getClientVersionByHuaweiHealth();
    }

    public String a() {
        return "&clientVersion=huawei-watch-buds 60.2.1.1";
    }

    protected void i() {
        CustomTitleBar customTitleBar = this.g;
        if (customTitleBar == null) {
            LogUtil.j("ServiceItemActivity", "hindOobeMenuView mCustomTitleBar is null");
        } else {
            customTitleBar.setRightButtonVisibility(8);
            this.m = false;
        }
    }

    private String o() {
        return this.f28576c + "/terms/scope/huawei/health/privacy-statement.htm?code=cn" + u();
    }

    private String s() {
        return this.f28576c + "/terms/scope/huawei/health/terms.htm?code=" + e() + u() + n();
    }

    protected String e() {
        String strL = l();
        if (!TextUtils.isEmpty(strL)) {
            ReleaseLogUtil.d("R_ServiceItemActivity", "getServiceCountry country = ", strL);
            return strL;
        }
        Context context = com.huawei.hwcommonmodel.application.BaseApplication.getContext();
        String strE = SharedPreferenceManager.e(context, Integer.toString(PrebakedEffectId.RT_SNIPER_RIFLE), "key_privacy_notice_state");
        String strE2 = SharedPreferenceManager.e(context, Integer.toString(PrebakedEffectId.RT_SNIPER_RIFLE), "select_country");
        if (TextUtils.isEmpty(strE2)) {
            strE2 = Locale.getDefault().getCountry();
            if (TextUtils.isEmpty(strE2)) {
                strE2 = "GB";
            }
            SharedPreferenceManager.e(context, Integer.toString(PrebakedEffectId.RT_SNIPER_RIFLE), "select_country", strE2, null);
        }
        ReleaseLogUtil.d("R_ServiceItemActivity", "getServiceCountry state = ", strE, ", country = ", strE2);
        if (!"privacy_notice_state_before_login".equals(strE)) {
            String accountInfo = LoginInit.getInstance(context).getAccountInfo(1010);
            ReleaseLogUtil.d("R_ServiceItemActivity", "getServiceCountry loginCountry = ", accountInfo);
            if (!Utils.k() || !TextUtils.isEmpty(accountInfo)) {
                return accountInfo;
            }
        }
        return strE2;
    }

    private static String l() {
        if (LoginInit.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).isKoreaCountry()) {
            return LoginInit.KOREA;
        }
        if (!Utils.o()) {
            return "CN";
        }
        return "";
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        LogUtil.a("ServiceItemActivity", "onRestart()");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LogUtil.a("ServiceItemActivity", "onResume()");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        LogUtil.a("ServiceItemActivity", "onPause()");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        qop qopVar = this.p;
        if (qopVar != null) {
            qopVar.e();
        }
        this.p = null;
        f();
        LogUtil.a("ServiceItemActivity", "onDestroy");
        super.onDestroy();
        vvz vvzVar = this.h;
        if (vvzVar != null) {
            vvzVar.c();
        }
        Handler handler = this.d;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            return;
        }
        if (qrs.c(500)) {
            LogUtil.a("ServiceItemActivity", "isFastClick");
            return;
        }
        if (view == this.s) {
            CommonUtil.t(this.f28575b);
        } else if (view.getId() == R.id.stop_service) {
            this.j.j();
        } else {
            LogUtil.a("ServiceItemActivity", "error click!");
        }
    }

    private void f() {
        LogUtil.a("ServiceItemActivity", "destroyWebView");
        if (this.u != null) {
            LogUtil.a("ServiceItemActivity", "onDestroy destroyWebView");
            ViewParent parent = this.u.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.u);
            }
            try {
                this.u.destroy();
            } catch (Throwable unused) {
                LogUtil.e("ServiceItemActivity", "destroyWebView Throwable");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(String str) {
        try {
            return Arrays.asList(getResources().getAssets().list("HealthUserAgreement")).contains(str);
        } catch (IOException unused) {
            LogUtil.e("ServiceItemActivity", "isFileExists IOException");
            return false;
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.j.d(i, i2);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
