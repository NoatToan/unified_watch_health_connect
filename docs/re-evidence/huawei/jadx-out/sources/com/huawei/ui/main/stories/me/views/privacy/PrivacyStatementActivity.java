package com.huawei.ui.main.stories.me.views.privacy;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.me.js.JsInteraction;
import defpackage.vwc;
import health.compact.a.CloudImpl;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes43.dex */
public class PrivacyStatementActivity extends ServiceItemActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ArrayList<String> f28573a = new ArrayList<>(Arrays.asList("file:///android_asset/defaultPrivacyStatement/privacy-statement-zh-hk.htm", "file:///android_asset/defaultPrivacyStatement/privacy-statement-vi-vn.htm", "file:///android_asset/defaultPrivacyStatement/privacy-statement-th-th.htm", "file:///android_asset/defaultPrivacyStatement/privacy-statement-ko-kr.htm", "file:///android_asset/defaultPrivacyStatement/privacy-statement-ja-jp.htm", "file:///android_asset/defaultPrivacyStatement/privacy-statement-in-id.htm", "file:///android_asset/defaultPrivacyStatement/privacy-statement-es-us.htm", "file:///android_asset/defaultPrivacyStatement/privacy-statement-en-us.htm", "file:///android_asset/defaultPrivacyStatement/privacy-statement-ar-eg.htm", "file:///android_asset/defaultPrivacyStatement/privacy-statement-uk-ua.htm", "file:///android_asset/defaultPrivacyStatement/privacy-statement-tr-tr.htm", "file:///android_asset/defaultPrivacyStatement/privacy-statement-ro-ro.htm", "file:///android_asset/defaultPrivacyStatement/privacy-statement-pl-pl.htm", "file:///android_asset/defaultPrivacyStatement/privacy-statement-it-it.htm", "file:///android_asset/defaultPrivacyStatement/privacy-statement-fr-fr.htm", "file:///android_asset/defaultPrivacyStatement/privacy-statement-es-es.htm", "file:///android_asset/defaultPrivacyStatement/privacy-statement-en-gb.htm", "file:///android_asset/defaultPrivacyStatement/privacy-statement-de-de.htm", "file:///android_asset/defaultPrivacyStatement/privacy-statement-cs-cz.htm", "file:///android_asset/defaultPrivacyStatement/privacy-statement-ru-ru.htm", "file:///android_asset/defaultPrivacyStatement/privacy-statement-zh-cn.htm", "file:///android_asset/defaultPrivacyStatement/privacy-statement-en-cn.htm", "file:///android_asset/defaultPrivacyStatement/privacy-statement-bo-cn.htm", "file:///android_asset/defaultPrivacyStatement/privacy-statement-ug-cn.htm", "file:///android_asset/defaultPrivacyStatement/privacy-statement-zh-cht.htm"));
    private Context e;

    @Override // com.huawei.ui.main.stories.me.views.privacy.ServiceItemActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (!CommonUtil.y(this)) {
            SystemBarHelper.b(getWindow());
        }
        this.e = this;
        super.onCreate(bundle);
        i();
    }

    @Override // com.huawei.ui.main.stories.me.views.privacy.ServiceItemActivity
    protected void c(final WebView webView) {
        LogUtil.a("PrivacyStatementActivity", "loadWebViewUrl");
        if (webView == null) {
            LogUtil.j("PrivacyStatementActivity", "loadWebViewUrl webView is null");
            return;
        }
        if (CommonUtil.y(this.e)) {
            JsInteraction jsInteraction = new JsInteraction(this.e);
            webView.addJavascriptInterface(jsInteraction, "JsInteraction");
            webView.addJavascriptInterface(jsInteraction, "checkMore");
            ThreadPoolManager.c().execute(new Runnable() { // from class: vxr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51683b.a(webView);
                }
            });
            return;
        }
        String strB = b();
        WebSettings settings = webView.getSettings();
        if (settings != null) {
            settings.setGeolocationEnabled(false);
            settings.setAllowFileAccess(false);
            settings.setAllowContentAccess(false);
        }
        webView.loadUrl(strB);
    }

    public /* synthetic */ void a(final WebView webView) {
        this.f28576c = GRSManager.c(this.e).getNoCheckUrl("domainPrivacyLegalCloudHuawei", e());
        if (this.d == null) {
            LogUtil.j("PrivacyStatementActivity", "loadWebViewUrl mHandler is null");
        } else {
            this.d.post(new Runnable() { // from class: vxu
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.d(webView);
                }
            });
        }
    }

    public /* synthetic */ void d(WebView webView) {
        String strD = d();
        WebSettings settings = webView.getSettings();
        if (settings != null) {
            settings.setGeolocationEnabled(false);
            settings.setAllowFileAccess(false);
            settings.setAllowContentAccess(false);
            settings.setJavaScriptEnabled(vwc.a(strD));
        }
        webView.loadUrl(strD);
    }

    protected String b() {
        String strZ = CommonUtil.z();
        String str = "file:///android_asset/defaultPrivacyStatement/privacy-statement-" + strZ.toLowerCase(Locale.ENGLISH) + ".htm";
        LogUtil.a("PrivacyStatementActivity", "getLocalHealthPrivacyPath countryAndLanguage is ", strZ);
        if (!f28573a.contains(str)) {
            String country = Locale.getDefault().getCountry();
            int siteIdByCountry = CloudImpl.e(this.e).getSiteIdByCountry(country);
            LogUtil.a("PrivacyStatementActivity", "getLocalHealthPrivacyPath country is ", country, ", siteId is ", Integer.valueOf(siteIdByCountry));
            if (siteIdByCountry == 1) {
                str = "file:///android_asset/defaultPrivacyStatement/privacy-statement-zh-cn.htm";
            } else if (siteIdByCountry == 5) {
                str = "file:///android_asset/defaultPrivacyStatement/privacy-statement-en-us.htm";
            } else if (siteIdByCountry == 8) {
                str = "file:///android_asset/defaultPrivacyStatement/privacy-statement-ru-ru.htm";
            } else {
                str = "file:///android_asset/defaultPrivacyStatement/privacy-statement-en-gb.htm";
            }
        }
        LogUtil.a("PrivacyStatementActivity", "getLocalHealthPrivacyPath url is ", str);
        return str;
    }

    @Override // com.huawei.ui.main.stories.me.views.privacy.ServiceItemActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
