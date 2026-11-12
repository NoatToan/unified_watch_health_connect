package com.huawei.ui.device.activity.watchface;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.R;
import com.huawei.operation.activity.UserAgreementWebViewClient;
import com.huawei.operation.utils.WebViewUtils;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.qqs;
import defpackage.qsp;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.util.Locale;

/* JADX INFO: loaded from: classes43.dex */
public class WatchfaceUrlActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f24859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f24860b = new Handler() { // from class: com.huawei.ui.device.activity.watchface.WatchfaceUrlActivity.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.j("WatchfaceUrlActivity", "handleMessage(), message is null");
                return;
            }
            super.handleMessage(message);
            if (message.what == 1) {
                WatchfaceUrlActivity.this.b();
            }
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f24861c;
    private CustomTitleBar d;
    private Context e;
    private HealthProgressBar f;
    private LinearLayout g;
    private String h;
    private LinearLayout i;
    private String j;
    private String k;
    private RelativeLayout l;
    private String m;
    private HealthButton n;
    private WebView o;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.e = this;
        if (getIntent() == null) {
            finish();
            return;
        }
        if (!Utils.o()) {
            this.f24861c = "CN";
        }
        if (LoginInit.getInstance(this.e).getIsLogined()) {
            this.f24861c = LoginInit.getInstance(this.e).getAccountInfo(1010);
        }
        this.m = getIntent().getStringExtra("Agreement_key");
        if (CommonUtil.ac(this.e.getApplicationContext())) {
            setContentView(R.layout.fragment_web_view_error_1);
            a();
        } else {
            setContentView(R.layout.activity_watchface_url_item);
            LogUtil.a("WatchfaceUrlActivity", "onCreate()");
            e();
            d();
        }
    }

    private void d() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.device.activity.watchface.WatchfaceUrlActivity.1
            @Override // java.lang.Runnable
            public void run() {
                String commonCountryCode = GRSManager.c(WatchfaceUrlActivity.this.e).getCommonCountryCode();
                WatchfaceUrlActivity watchfaceUrlActivity = WatchfaceUrlActivity.this;
                watchfaceUrlActivity.j = GRSManager.c(watchfaceUrlActivity.e).getNoCheckUrl("domainPrivacyLegalCloudHuawei", commonCountryCode);
                if (TextUtils.isEmpty(WatchfaceUrlActivity.this.j)) {
                    LogUtil.j("WatchfaceUrlActivity", "loadWebViewUrl mHwConsumerUrl is empty");
                } else if (!WatchfaceUrlActivity.this.isFinishing() && !WatchfaceUrlActivity.this.isDestroyed()) {
                    WatchfaceUrlActivity.this.f24860b.sendEmptyMessage(1);
                } else {
                    LogUtil.j("WatchfaceUrlActivity", "loadWebViewUrl isFinishing or isDestroyed");
                }
            }
        });
    }

    private void a() {
        LogUtil.a("WatchfaceUrlActivity", "ServiceItemActivity.isErrorWebView");
        ((HealthButton) findViewById(R.id.btn_go_setting)).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.watchface.WatchfaceUrlActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("WatchfaceUrlActivity", "ServiceItemActivity.uninstallApk");
                try {
                    CommonUtil.p(WatchfaceUrlActivity.this.e, "com.google.android.webview");
                } catch (Exception unused) {
                    LogUtil.e("WatchfaceUrlActivity", "ServiceItemActivity test");
                }
            }
        });
        CustomTitleBar customTitleBar = (CustomTitleBar) qsp.a(this, R.id.mini_shop__webview_titlebar);
        this.d = customTitleBar;
        customTitleBar.setTitleText(this.e.getString(R.string.IDS_hw_watchface_secret_dialog_content_user_agreement));
    }

    private void e() {
        LogUtil.a("WatchfaceUrlActivity", "initView()");
        WebView webView = (WebView) findViewById(R.id.hw_health_user_agreement_webview);
        this.o = webView;
        qqs.c(this.e, webView);
        this.f24859a = (HealthTextView) findViewById(R.id.check_more);
        if (CommonUtil.cd()) {
            this.f24859a.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.watchface.WatchfaceUrlActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Intent intent = new Intent();
                    intent.setClassName("com.huawei.systemmanager", "com.huawei.dataprivacycenter.MainActivity");
                    WatchfaceUrlActivity.this.startActivity(intent);
                }
            });
        } else {
            this.f24859a.setVisibility(8);
        }
        this.i = (LinearLayout) findViewById(R.id.service_layout_loading);
        this.g = (LinearLayout) findViewById(R.id.service_item_linear);
        this.l = (RelativeLayout) findViewById(R.id.reload_layout);
        this.n = (HealthButton) findViewById(R.id.btn_no_net_work);
        this.i.setVisibility(0);
        HealthProgressBar healthProgressBar = (HealthProgressBar) this.i.findViewById(R.id.service_info_loading);
        this.f = healthProgressBar;
        healthProgressBar.setVisibility(0);
        this.n.setOnClickListener(this);
        i();
    }

    private void i() {
        if (CommonUtil.ab(this.e.getApplicationContext())) {
            return;
        }
        this.l.setVisibility(0);
        this.g.setVisibility(8);
        this.i.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.d = (CustomTitleBar) qsp.a(this, R.id.hw_health_service_title_layout);
        this.h = this.j + "/terms/scope/huawei/themes/terms.htm?country=";
        if ("termsurl".equals(this.m)) {
            this.h = this.j + "/terms/scope/huawei/themes/terms.htm?country=";
            this.k = this.e.getString(R.string.IDS_hw_watchface_secret_dialog_content_user_agreement);
        }
        if ("privacyurl".equals(this.m)) {
            this.h = this.j + "/terms/scope/huawei/themes/privacy-statement.htm?country=";
            this.k = this.e.getString(R.string.IDS_hw_watchface_secret_dialog_content_privacy_statement);
        }
        this.d.setTitleText(this.k);
        WebViewUtils.setWebSettings(this.e, this.o, false);
        this.o.loadUrl(g());
        this.o.setWebViewClient(new UserAgreementWebViewClient(this.e, this.f, this.i, "WatchfaceUrlActivity"));
    }

    private String g() {
        String str;
        String strA = LanguageUtil.a(Locale.getDefault());
        String script = Locale.getDefault().getScript();
        if (TextUtils.isEmpty(this.f24861c)) {
            String strE = SharedPreferenceManager.e(this.e, Integer.toString(PrebakedEffectId.RT_SNIPER_RIFLE), "select_country");
            this.f24861c = strE;
            if (TextUtils.isEmpty(strE)) {
                this.f24861c = "GB";
            }
        }
        String country = Locale.getDefault().getCountry();
        if (TextUtils.isEmpty(script)) {
            str = strA + "_" + country;
        } else {
            str = strA + "_" + script + "_" + country;
        }
        return this.h + this.f24861c + Constants.LANGUAGE + str;
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        LogUtil.a("WatchfaceUrlActivity", "onRestart()");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LogUtil.a("WatchfaceUrlActivity", "onResume()");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        LogUtil.a("WatchfaceUrlActivity", "onPause()");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        c();
        LogUtil.a("WatchfaceUrlActivity", "onDestroy");
        super.onDestroy();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view != null && view == this.n) {
            CommonUtil.t(this.e);
        }
    }

    private void c() {
        LogUtil.a("WatchfaceUrlActivity", "destroyWebView");
        if (this.o != null) {
            LogUtil.a("WatchfaceUrlActivity", "onDestroy destroyWebView");
            ViewParent parent = this.o.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.o);
            }
            try {
                this.o.destroy();
            } catch (Exception unused) {
                LogUtil.e("WatchfaceUrlActivity", "destroyWebView exception");
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
