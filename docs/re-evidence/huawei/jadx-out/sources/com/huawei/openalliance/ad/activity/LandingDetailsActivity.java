package com.huawei.openalliance.ad.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.cr;
import com.huawei.openalliance.ad.df;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AdLandingPageData;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.IAd;
import com.huawei.openalliance.ad.inter.data.INativeAd;
import com.huawei.openalliance.ad.inter.data.IPlacementAd;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.inter.data.i;
import com.huawei.openalliance.ad.or;
import com.huawei.openalliance.ad.pf;
import com.huawei.openalliance.ad.pw;
import com.huawei.openalliance.ad.rc;
import com.huawei.openalliance.ad.tz;
import com.huawei.openalliance.ad.utils.ab;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.ax;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.dr;
import com.huawei.openalliance.ad.views.AppDownloadButton;
import com.huawei.openalliance.ad.views.AppDownloadButtonStyle;
import com.huawei.openalliance.ad.views.ExtandAppDownloadButtonStyle;
import com.huawei.openalliance.ad.views.ExtandAppDownloadButtonStyleHm;
import com.huawei.openalliance.ad.views.PPSWebView;
import com.huawei.openalliance.ad.views.an;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public class LandingDetailsActivity extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AppDownloadButton f18128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RelativeLayout f18129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PPSWebView f18130c;
    private ImageView d;
    private cr e;
    private IAd f;
    private AdLandingPageData g;
    private MaterialClickInfo h;
    private boolean i;
    private MaterialClickInfo j;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.g = null;
        this.f = null;
        df.a((com.huawei.openalliance.ad.inter.data.d) null);
        PPSWebView pPSWebView = this.f18130c;
        if (pPSWebView != null) {
            pPSWebView.destroy();
        }
        a(2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.e, com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (c()) {
            try {
                hw.b("LandingDetailActivity", "onCreate start.");
                d();
                f();
                dk.A(this);
                i();
                h();
                b();
                if (this.i) {
                    this.f18128a.setAdLandingPageData(this.g);
                    this.f18130c.setAdLandingPageData(this.g);
                    or webDetailPresenter = this.f18130c.getWebDetailPresenter();
                    if (webDetailPresenter != null) {
                        webDetailPresenter.a((rc) null);
                    }
                    this.f18130c.a(this.g.getAppInfo().getAppDetailUrl());
                    return;
                }
                hw.b("LandingDetailActivity", "adLandingPageData is null.");
                IAd iAd = this.f;
                if (iAd instanceof INativeAd) {
                    this.f18128a.setNativeAd((INativeAd) iAd);
                }
                IAd iAd2 = this.f;
                if (iAd2 instanceof IPlacementAd) {
                    this.f18128a.setPlacementAd((IPlacementAd) iAd2);
                }
                IAd iAd3 = this.f;
                if (iAd3 instanceof i) {
                    this.f18128a.setAdLandingPageData(new AdLandingPageData(pw.a((i) iAd3), getApplicationContext(), true));
                }
                IAd iAd4 = this.f;
                if (iAd4 instanceof com.huawei.openalliance.ad.inter.data.d) {
                    this.f18128a.setAdLandingPageData(new AdLandingPageData(pf.a((com.huawei.openalliance.ad.inter.data.d) iAd4), getApplicationContext(), true));
                }
                AdLandingPageData adLandingPageData = new AdLandingPageData();
                this.g = adLandingPageData;
                this.f18130c.setAdLandingPageData(adLandingPageData);
                or webDetailPresenter2 = this.f18130c.getWebDetailPresenter();
                if (webDetailPresenter2 != null) {
                    webDetailPresenter2.a((rc) null);
                }
                this.f18130c.a(this.f.getAppInfo().getAppDetailUrl());
                a(1);
                return;
            } catch (Throwable th) {
                hw.c("LandingDetailActivity", "onCreate ex: %s", th.getClass().getSimpleName());
            }
        } else {
            hw.c("LandingDetailActivity", "parse ad data ex, skip open app detail activity.");
        }
        finish();
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        hw.b("LandingDetailActivity", "onConfigurationChanged.");
        g();
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void finish() {
        hw.b("LandingDetailActivity", "landing detail activity is finish.");
        if (this.p != null) {
            this.p.setBackgroundColor(getResources().getColor(R.color.hiad_0_percent_black));
        }
        super.finish();
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            int iA = tz.a(motionEvent);
            if (iA == 0 && this.p != null) {
                MaterialClickInfo materialClickInfoA = tz.a(this.p, motionEvent);
                this.h = materialClickInfoA;
                AppDownloadButton appDownloadButton = this.f18128a;
                if ((appDownloadButton != null && this.j == null) || (appDownloadButton != null && (materialClickInfoA = this.j) != null)) {
                    appDownloadButton.a(materialClickInfoA);
                }
            }
            if (1 == iA && this.p != null) {
                tz.a(this.p, motionEvent, null, this.h);
                AppDownloadButton appDownloadButton2 = this.f18128a;
                if (appDownloadButton2 != null && this.j == null) {
                    appDownloadButton2.a(this.h);
                }
            }
        } catch (Throwable th) {
            hw.c("LandingDetailActivity", "dispatchTouchEvent exception : %s", th.getClass().getSimpleName());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void a(int i) {
        SafeIntent safeIntent = new SafeIntent(new Intent("com.huawei.android.hms.LAND_DETAIL_STATE"));
        safeIntent.setPackage(getPackageName());
        safeIntent.putExtra("detail_state", i);
        sendBroadcast(safeIntent);
    }

    @Override // com.huawei.openalliance.ad.activity.e
    protected void a() {
        int i;
        if (ab.n(this)) {
            i = R.layout.hiad_interstitial_landing_details;
        } else {
            i = (ab.q(this) && ab.r(this)) ? R.layout.hiad_interstitial_foldable_landing_details : R.layout.hiad_activity_landing_details;
        }
        setContentView(i);
    }

    private AppInfo j() {
        AdLandingPageData adLandingPageData;
        if (this.i && (adLandingPageData = this.g) != null) {
            return adLandingPageData.getAppInfo();
        }
        IAd iAd = this.f;
        if (iAd != null) {
            return iAd.getAppInfo();
        }
        return null;
    }

    private void i() {
        PPSWebView pPSWebView = this.f18130c;
        if (pPSWebView == null) {
            hw.b("LandingDetailActivity", "set force dark ppsWebView is null.");
            return;
        }
        an webView = pPSWebView.getWebView();
        if (webView == null) {
            hw.b("LandingDetailActivity", "set force dark webView is null.");
            this.f18130c.setVisibility(8);
            findViewById(R.id.landing_load_fail_view).setVisibility(0);
            return;
        }
        webView.setLayerType(1, null);
        webView.setBackgroundColor(getResources().getColor(R.color.hiad_landing_details_btn_bg));
        webView.setVerticalScrollBarEnabled(false);
        this.f18130c.getSettings().setDomStorageEnabled(true);
        if (webView instanceof com.huawei.openalliance.ad.views.linkscroll.e) {
            float fA = as.a(this, 24.0f);
            float[] fArr = {fA, fA, fA, fA, 0.0f, 0.0f, 0.0f, 0.0f};
            com.huawei.openalliance.ad.views.linkscroll.e eVar = (com.huawei.openalliance.ad.views.linkscroll.e) webView;
            eVar.setRadiusArray(fArr);
            eVar.setSupportWebViewRadius(true);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            WebSettings settings = webView.getSettings();
            if (32 == (getResources().getConfiguration().uiMode & 48)) {
                settings.setForceDark(2);
            } else {
                settings.setForceDark(0);
            }
        }
    }

    private void h() {
        this.f18130c.addJavascriptInterface(new ax(this, j()), Constants.PPS_LANDING_DETAILS);
    }

    private void g() {
        Resources resources;
        int i;
        if (ab.n(this)) {
            a(0.72f, 0.74f, false);
            resources = getResources();
            i = R.dimen.hiad_274_dp;
        } else if (ab.q(this) && ab.r(this)) {
            a(0.72f, 0.74f, true);
            resources = getResources();
            i = R.dimen.hiad_228_dp;
        } else {
            a(1.0f, 0.84f, false);
            resources = getResources();
            i = R.dimen.hiad_200_dp;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        AppDownloadButton appDownloadButton = this.f18128a;
        if (appDownloadButton == null || dimensionPixelSize <= 0) {
            return;
        }
        appDownloadButton.setMinWidth(dimensionPixelSize);
        this.f18128a.setMaxWidth(dimensionPixelSize);
    }

    private void f() {
        AppDownloadButton appDownloadButton;
        AppDownloadButtonStyle extandAppDownloadButtonStyle;
        if (this.f18128a == null) {
            hw.b("LandingDetailActivity", "appDownloadButton is null.");
            return;
        }
        cr crVarA = cc.a(this);
        this.e = crVarA;
        if (crVarA.g()) {
            appDownloadButton = this.f18128a;
            extandAppDownloadButtonStyle = new ExtandAppDownloadButtonStyleHm(this);
        } else {
            appDownloadButton = this.f18128a;
            extandAppDownloadButtonStyle = new ExtandAppDownloadButtonStyle(this);
        }
        appDownloadButton.setAppDownloadButtonStyle(extandAppDownloadButtonStyle);
        this.f18128a.setFixedWidth(false);
        g();
    }

    private void e() {
        try {
            int iF = dk.f(this);
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.app_download_container);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.height += iF;
            viewGroup.setLayoutParams(layoutParams);
        } catch (Throwable th) {
            hw.b("LandingDetailActivity", "match bar err: %s", th.getClass().getSimpleName());
        }
    }

    private void d() {
        this.p = (ViewGroup) findViewById(R.id.landing_activity_root);
        this.f18129b = (RelativeLayout) findViewById(R.id.landing_detail_parent);
        this.f18130c = (PPSWebView) findViewById(R.id.landing_details_webView);
        this.d = (ImageView) findViewById(R.id.landing_close_image_view);
        this.f18128a = (AppDownloadButton) findViewById(R.id.app_download_btn_detail);
        e();
        this.p.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.activity.LandingDetailsActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LandingDetailsActivity.this.finish();
            }
        });
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.activity.LandingDetailsActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LandingDetailsActivity.this.finish();
            }
        });
    }

    private boolean c() {
        try {
            SafeIntent safeIntent = new SafeIntent(getIntent());
            MaterialClickInfo materialClickInfo = (MaterialClickInfo) bk.b(safeIntent.getStringExtra("click_info"), MaterialClickInfo.class, new Class[0]);
            if (materialClickInfo != null && dg.r(materialClickInfo.f()) && materialClickInfo.b() != null) {
                this.j = materialClickInfo;
                hw.a("LandingDetailActivity", "orgClickInfo: %s", materialClickInfo.toString());
            }
            Serializable serializableExtra = safeIntent.getSerializableExtra(MapKeyNames.APP_DETAIL_DATA);
            if (serializableExtra instanceof AdLandingPageData) {
                this.g = (AdLandingPageData) serializableExtra;
                this.i = true;
                return true;
            }
            if (serializableExtra instanceof IAd) {
                this.f = (IAd) serializableExtra;
                this.i = false;
                return true;
            }
            com.huawei.openalliance.ad.inter.data.d dVarA = df.a();
            if (dVarA != null) {
                this.f = dVarA;
                this.i = false;
                return true;
            }
            hw.c("LandingDetailActivity", "start app detail activity, ad content is empty.");
            return false;
        } catch (Throwable th) {
            hw.c("LandingDetailActivity", "parse ad data ex: %s", th.getClass().getSimpleName());
        }
    }

    private void b() {
        this.f18128a.setSource(5);
    }

    private void a(float f, float f2, boolean z) {
        RelativeLayout.LayoutParams layoutParams;
        RelativeLayout relativeLayout = this.f18129b;
        if (relativeLayout == null || (layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams()) == null) {
            return;
        }
        int iC = z ? dr.c(this) : dr.c(this) + as.h(this);
        layoutParams.width = (int) (dr.b(this) * f);
        layoutParams.height = (int) (iC * f2);
        this.f18129b.setLayoutParams(layoutParams);
    }
}
