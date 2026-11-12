package com.huawei.openalliance.ad.activity;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.widget.PopupMenu;
import android.widget.Toast;
import androidx.core.view.GravityCompat;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.analysis.i;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.ce;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.constant.MapNameConstants;
import com.huawei.openalliance.ad.df;
import com.huawei.openalliance.ad.download.app.AppStatus;
import com.huawei.openalliance.ad.download.app.h;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.gk;
import com.huawei.openalliance.ad.gy;
import com.huawei.openalliance.ad.gz;
import com.huawei.openalliance.ad.hg;
import com.huawei.openalliance.ad.hh;
import com.huawei.openalliance.ad.hm;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.inter.data.AdLandingPageData;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.IAd;
import com.huawei.openalliance.ad.inter.data.LinkedSplashAd;
import com.huawei.openalliance.ad.inter.data.g;
import com.huawei.openalliance.ad.js;
import com.huawei.openalliance.ad.nt;
import com.huawei.openalliance.ad.pa;
import com.huawei.openalliance.ad.pn;
import com.huawei.openalliance.ad.utils.aa;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.ay;
import com.huawei.openalliance.ad.utils.az;
import com.huawei.openalliance.ad.utils.ba;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dj;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.utils.dr;
import com.huawei.openalliance.ad.views.AppDownloadButton;
import com.huawei.openalliance.ad.views.PPSAppDetailView;
import com.huawei.openalliance.ad.views.PPSExpandButtonDetailView;
import com.huawei.openalliance.ad.views.PPSWebView;
import com.huawei.openalliance.ad.views.VideoView;
import com.huawei.openalliance.ad.views.ac;
import com.huawei.openalliance.ad.views.interfaces.z;
import com.huawei.openalliance.ad.views.u;
import com.huawei.ui.commonui.base.BaseDialog;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes12.dex */
public class PPSActivity extends com.huawei.openalliance.ad.activity.b implements com.huawei.openalliance.ad.views.d.a {
    private com.huawei.openalliance.ad.linked.view.c A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    hg f18134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PPSWebView f18135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private gy f18136c;
    private ActionBar d;
    private AdLandingPageData e;
    private ClipboardManager f;
    private gk g;
    private Boolean h;
    private PopupMenu i;
    private PPSAppDetailView j;
    private Integer k;
    private PPSExpandButtonDetailView l;
    private AppInfo m;
    private com.huawei.openalliance.ad.activity.b.a n;
    private Handler o;
    private az q;
    private u r;
    private AppDownloadButton t;
    private ba u;
    private long v;
    private boolean z;
    private boolean s = false;
    private boolean w = false;
    private z x = new z() { // from class: com.huawei.openalliance.ad.activity.PPSActivity.1
        @Override // com.huawei.openalliance.ad.views.interfaces.z
        public void a(final int i) {
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.activity.PPSActivity.1.2
                @Override // java.lang.Runnable
                public void run() {
                    if (i == 100) {
                        PPSActivity.this.a(false);
                    }
                }
            });
        }

        @Override // com.huawei.openalliance.ad.views.interfaces.z
        public void a() {
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.activity.PPSActivity.1.1
                @Override // java.lang.Runnable
                public void run() {
                    PPSActivity.this.a(true);
                }
            });
        }
    };
    private com.huawei.openalliance.ad.views.interfaces.c y = new com.huawei.openalliance.ad.views.interfaces.c() { // from class: com.huawei.openalliance.ad.activity.PPSActivity.5
        @Override // com.huawei.openalliance.ad.views.interfaces.c
        public void a(com.huawei.openalliance.ad.views.interfaces.b bVar) {
            if (bVar == null || bVar.e() == null) {
                hw.c("PPSActivity", "click action invalid");
                return;
            }
            Integer numE = bVar.e();
            int iIntValue = numE.intValue();
            hw.b("PPSActivity", "click action: %d", numE);
            if (iIntValue != 1) {
                return;
            }
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.activity.PPSActivity.5.1
                @Override // java.lang.Runnable
                public void run() {
                    PPSActivity.this.a(true);
                }
            });
        }
    };

    public interface b {
        void a(boolean z);
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    protected void onStop() {
        if (hw.a()) {
            hw.a("PPSActivity", "onStop");
        }
        super.onStop();
        PPSWebView pPSWebView = this.f18135b;
        if (pPSWebView != null) {
            pPSWebView.onStop();
        }
        if (v()) {
            hw.b("PPSActivity", "checkFinish true");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onResume() {
        if (hw.a()) {
            hw.a("PPSActivity", BaseDialog.LIFE_CYCLE_ON_RESUME);
        }
        super.onResume();
        PPSWebView pPSWebView = this.f18135b;
        if (pPSWebView != null) {
            pPSWebView.onResume();
        }
        gy gyVar = this.f18136c;
        if (gyVar != null) {
            gyVar.d();
            this.f18136c.e();
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        hw.a("PPSActivity", "requestPermissions, requestCode=%d, result= %s", Integer.valueOf(i), Arrays.toString(iArr));
        a(i, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onPause() {
        hg hgVarA;
        if (hw.a()) {
            hw.a("PPSActivity", BaseDialog.LIFE_CYCLE_ON_PAUSE);
        }
        super.onPause();
        IAd iAdD = df.d();
        if (iAdD instanceof LinkedSplashAd) {
            LinkedSplashAd linkedSplashAd = (LinkedSplashAd) iAdD;
            if (linkedSplashAd.getVideoInfo() != null && (hgVarA = hh.a()) != null) {
                linkedSplashAd.getVideoInfo().e(hgVarA.d());
                linkedSplashAd.getVideoInfo().e(hgVarA.c());
                hh.a((hg) null);
            }
            if (linkedSplashAd.getListener() != null) {
                linkedSplashAd.getListener().onAdDetailClosed(linkedSplashAd);
            }
        }
        gy gyVar = this.f18136c;
        if (gyVar != null) {
            gyVar.b();
            this.f18136c.c();
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return a(menuItem);
    }

    @Override // com.huawei.openalliance.ad.views.d.a
    public void onMenuBtnClick(View view) {
        a(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onDestroy() {
        if (hw.a()) {
            hw.a("PPSActivity", "onDestroy");
        }
        super.onDestroy();
        z();
        y();
        c((Context) this);
        com.huawei.openalliance.ad.linked.view.c cVar = this.A;
        if (cVar != null) {
            cVar.f();
            this.A = null;
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater;
        int i;
        MenuItem menuItemFindItem;
        MenuItem menuItemFindItem2;
        if (this.e == null) {
            return false;
        }
        AppInfo appInfo = this.m;
        if (appInfo == null || !appInfo.w()) {
            menuInflater = getMenuInflater();
            i = R.menu.hiad_land_page_menu;
        } else {
            menuInflater = getMenuInflater();
            i = R.menu.hiad_land_page_expand_menu;
        }
        menuInflater.inflate(i, menu);
        if (k() && (menuItemFindItem2 = menu.findItem(R.id.hiad_menu_item_privacy_policy)) != null) {
            menuItemFindItem2.setVisible(true);
        }
        if (!HiAd.a(getApplicationContext()).k() && (menuItemFindItem = menu.findItem(R.id.hiad_menu_item_open_in_browser)) != null) {
            menuItemFindItem.setVisible(false);
        }
        return x() && !w();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.b, com.huawei.openalliance.ad.activity.e, com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        StringBuilder sb;
        AdLandingPageData adLandingPageData;
        if (w()) {
            setTheme(R.style.HiAdThemeNoActionBar);
        }
        dk.h(this);
        if (hw.a()) {
            hw.a("PPSActivity", "onCreate");
        }
        super.onCreate(bundle);
        HiAd.getInstance(this);
        Intent intent = getIntent();
        try {
            boolean booleanExtra = intent.getBooleanExtra(MapKeyNames.FROM_LIFECYCLE_LISTENER, false);
            this.w = booleanExtra;
            hw.b("PPSActivity", "isFromLifecycle: %s", Boolean.valueOf(booleanExtra));
            this.d = getActionBar();
            this.e = (AdLandingPageData) intent.getSerializableExtra(MapNameConstants.AD_LANDING_PAGE_DATA);
            a(intent);
        } catch (ClassCastException unused) {
            str = "fail to get contentRecord, class cast exception";
            hw.d("PPSActivity", str);
        } catch (Throwable unused2) {
            str = "fail to get contentRecord";
            hw.d("PPSActivity", str);
        }
        AdLandingPageData adLandingPageData2 = this.e;
        if (adLandingPageData2 == null) {
            hw.b("PPSActivity", "content record null, don't show ad detail web page");
            finish();
            return;
        }
        try {
            this.m = adLandingPageData2.getAppInfo();
            this.g = fp.b(this);
            if (this.d == null || !a((Context) this)) {
                ActionBar actionBar = this.d;
                if (actionBar != null) {
                    actionBar.hide();
                    this.d = null;
                }
            } else {
                i();
            }
            if (this.d != null && aa.a(this).b()) {
                this.d.hide();
            }
            this.f = (ClipboardManager) getSystemService("clipboard");
            n();
            d();
            b((Context) this);
            if (this.f18135b != null && this.e.getAdType() == 7) {
                this.f18135b.setRealOpenTime(System.currentTimeMillis());
            }
            o();
        } catch (AndroidRuntimeException e) {
            e = e;
            sb = new StringBuilder("onCreate error: ");
            sb.append(e.getClass().getSimpleName());
            hw.c("PPSActivity", sb.toString());
        } catch (Throwable th) {
            e = th;
            sb = new StringBuilder("onCreate: ");
            sb.append(e.getClass().getSimpleName());
            hw.c("PPSActivity", sb.toString());
        }
        if (dk.g() && (adLandingPageData = this.e) != null && "3".equalsIgnoreCase(adLandingPageData.n())) {
            Toast.makeText(getApplicationContext(), R.string.hiad_third_party_page_hint, 0).show();
        }
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        if (configuration == null) {
            return;
        }
        super.onConfigurationChanged(configuration);
        int i = configuration.uiMode & 48;
        hw.b("PPSActivity", "currentNightMode=" + i);
        a(32 == i ? 2 : 0);
        a(configuration);
    }

    @Override // com.huawei.openalliance.ad.views.d.a
    public void c() {
        hw.b("PPSActivity", "onClose");
        finish();
    }

    @Override // com.huawei.openalliance.ad.activity.b
    protected void b() {
        Handler handler = this.o;
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: com.huawei.openalliance.ad.activity.PPSActivity.2
                @Override // java.lang.Runnable
                public void run() {
                    hw.b("PPSActivity", "finishSelfDelayed");
                    PPSActivity.this.finish();
                }
            }, 300L);
        }
    }

    @Override // com.huawei.openalliance.ad.activity.e
    protected void a() {
        setRequestedOrientation(1);
        setContentView(R.layout.hiad_activity_landing_page);
        this.p = (ViewGroup) findViewById(R.id.hiad_landing_layout);
    }

    private void z() {
        gy gyVar = this.f18136c;
        if (gyVar != null) {
            gyVar.a();
        }
    }

    private void y() {
        PPSWebView pPSWebView = this.f18135b;
        if (pPSWebView != null) {
            pPSWebView.destroy();
        }
        PPSAppDetailView pPSAppDetailView = this.j;
        if (pPSAppDetailView != null) {
            pPSAppDetailView.d();
            this.j = null;
        }
        PPSExpandButtonDetailView pPSExpandButtonDetailView = this.l;
        if (pPSExpandButtonDetailView != null) {
            pPSExpandButtonDetailView.d();
            this.l = null;
        }
    }

    private boolean x() {
        if (this.h == null) {
            this.h = (Boolean) dj.a(new Callable<Boolean>() { // from class: com.huawei.openalliance.ad.activity.PPSActivity.12
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Boolean call() {
                    return Boolean.valueOf(PPSActivity.this.g.bl());
                }
            }, false);
        }
        return this.h.booleanValue();
    }

    private boolean w() {
        return !a((Context) this);
    }

    private boolean v() {
        AdLandingPageData adLandingPageData;
        if (isFinishing() || (adLandingPageData = this.e) == null) {
            return false;
        }
        return pa.r(adLandingPageData.f());
    }

    private void u() {
        if (this.f18135b != null) {
            az azVar = new az(this, pn.a(this.e), this.f18135b);
            this.q = azVar;
            this.f18135b.addJavascriptInterface(azVar, Constants.APPOINT_JS_NAME);
            this.f18135b.addJavascriptInterface(new ay(this, pn.a(this.e)), Constants.LANDING_JS_NAME);
        }
    }

    private void t() {
        if (this.w || this.e.s() != 7) {
            PPSAppDetailView pPSAppDetailView = (this.z || !g()) ? this.j : this.l;
            a(pPSAppDetailView);
            b(this.t);
            if (this.z) {
                a((PPSAppDetailView) this.l);
                this.l.a(2);
                this.l.setBtnSource(61);
                this.l.setNonBtnSource(61);
                pPSAppDetailView.setBtnSource(59);
                pPSAppDetailView.setNonBtnSource(60);
            }
        }
    }

    private boolean s() {
        AppDownloadButton appDownloadButton;
        if (this.e == null || (appDownloadButton = this.t) == null) {
            return false;
        }
        AppStatus status = appDownloadButton.getStatus();
        if (status == AppStatus.DOWNLOAD || status == AppStatus.INSTALLED) {
            return true;
        }
        hw.a("PPSActivity", "current app status not support scan animation.");
        return false;
    }

    private boolean r() {
        return s() && pa.x(this.e.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q() {
        return s() && !pa.w(this.e.f());
    }

    private void p() {
        if (this.r == null) {
            u uVar = new u(this, 0);
            this.r = uVar;
            uVar.setPopUpClickListener(new com.huawei.openalliance.ad.views.interfaces.aa() { // from class: com.huawei.openalliance.ad.activity.PPSActivity.9
                @Override // com.huawei.openalliance.ad.views.interfaces.aa
                public void c() {
                }

                @Override // com.huawei.openalliance.ad.views.interfaces.aa
                public void b() {
                    PPSActivity.this.b("129");
                    PPSActivity.this.t.f();
                    PPSActivity.this.r.b();
                    PPSActivity.this.r = null;
                    PPSActivity.this.s = false;
                }

                @Override // com.huawei.openalliance.ad.views.interfaces.aa
                public void a() {
                    PPSActivity.this.b("128");
                    PPSActivity.this.t.setSource(5);
                    PPSActivity.this.t.a(PPSActivity.this.r.getClickInfo());
                    PPSActivity.this.t.performClick();
                    PPSActivity.this.r.b();
                    PPSActivity.this.r = null;
                    PPSActivity.this.s = false;
                }
            });
            this.r.getDialog().setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.huawei.openalliance.ad.activity.PPSActivity.10
                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    PPSActivity.this.s = false;
                    PPSActivity.this.r = null;
                    PPSActivity.this.b("130");
                }
            });
        }
    }

    private void o() {
        if (pa.B(this.e.f()) != 2) {
            hw.a("PPSActivity", "no need popup strategy %s.", Integer.valueOf(pa.B(this.e.f())));
            return;
        }
        if (this.m == null || this.e.n() == null) {
            hw.a("PPSActivity", "app or pageType para error.");
            return;
        }
        if (f()) {
            hw.a("PPSActivity", "no need popup auto download.");
            return;
        }
        if (!"1".equals(this.e.n()) && !"2".equals(this.e.n())) {
            hw.a("PPSActivity", "landing type no need pop.");
            return;
        }
        long jD = this.m.D();
        if (jD < 0) {
            hw.c("PPSActivity", "delay time error:%s", Long.valueOf(jD));
        } else {
            hw.b("PPSActivity", "show app download dialog start delayTime %s", Long.valueOf(jD));
            dq.a(new a(this), jD);
        }
    }

    private void n() {
        try {
            this.A = new com.huawei.openalliance.ad.linked.view.c(this);
            gz gzVar = new gz(this, this.e, this.f18134a);
            PPSWebView pPSWebView = new PPSWebView(this, this.d, this, new g(this.e, x(), gzVar.l() && !dk.a((Activity) this)));
            this.f18135b = pPSWebView;
            pPSWebView.setIsInLandingpage(true);
            this.f18135b.setPPSWebEventCallback(nt.a());
            a(this.f18135b);
            u();
            gy gyVar = new gy(gzVar, this.A, this.f18135b);
            this.f18136c = gyVar;
            gyVar.a(new b() { // from class: com.huawei.openalliance.ad.activity.PPSActivity.8
                @Override // com.huawei.openalliance.ad.activity.PPSActivity.b
                public void a(boolean z) {
                }
            });
            ((ViewGroup) findViewById(R.id.hiad_landing_webview_layout)).addView(this.f18136c.a(this));
        } catch (Throwable th) {
            hw.c("PPSActivity", "init webview failed " + th.getClass().getSimpleName());
        }
        boolean zH = h();
        this.z = zH;
        this.j = zH ? this.f18135b.getTopDetailView() : (PPSAppDetailView) findViewById(R.id.hiad_landing_app_detail);
        this.l = (PPSExpandButtonDetailView) findViewById(R.id.hiad_landing_expand_button_detail);
        hw.b("PPSActivity", "ctrlSwitchs:" + this.e.f());
        t();
        Resources resources = getResources();
        if (resources != null) {
            if (resources.getConfiguration() != null) {
                this.k = Integer.valueOf(resources.getConfiguration().screenWidthDp);
            }
            onConfigurationChanged(resources.getConfiguration());
        }
    }

    private void m() {
        PPSWebView pPSWebView = this.f18135b;
        if (pPSWebView != null) {
            pPSWebView.loadPage();
        }
    }

    private void l() {
        ClipData clipDataNewPlainText = ClipData.newPlainText("text", this.e.getLandingUrl());
        ClipboardManager clipboardManager = this.f;
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(clipDataNewPlainText);
            Toast.makeText(getApplicationContext(), R.string.hiad_link_already_copied, 1).show();
        }
    }

    private boolean k() {
        AdLandingPageData adLandingPageData = this.e;
        return (adLandingPageData == null || this.m == null || TextUtils.isEmpty(adLandingPageData.r())) ? false : true;
    }

    private String j() {
        if (this.e.isShowPageTitle()) {
            return as.a(this.e) ? dg.e(this.e.getAppInfo().getAppName()) : getString(R.string.hiad_detail);
        }
        return " ";
    }

    private void i() {
        ActionBar actionBar = this.d;
        if (actionBar == null) {
            return;
        }
        actionBar.setTitle(j());
        ce.a(this).a(this.d, true, null, new View.OnClickListener() { // from class: com.huawei.openalliance.ad.activity.PPSActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PPSActivity.this.c();
            }
        });
    }

    private boolean h() {
        return pa.f(this.e.f()) == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        return as.n(this) || pa.f(this.e.f()) == 2;
    }

    private boolean f() {
        AdLandingPageData adLandingPageData = this.e;
        return adLandingPageData != null && this.m != null && adLandingPageData.l() && pa.h(this.e.f());
    }

    private void e() {
        a(this.l, 15);
        a(this.j, 15);
    }

    private void d() {
        if (!f()) {
            hw.b("PPSActivity", "do not auto download app");
            return;
        }
        hw.b("PPSActivity", "auto download app");
        AppDownloadButton appDownloadButton = this.t;
        if (appDownloadButton == null) {
            hw.c("PPSActivity", "there is no download button");
            return;
        }
        if (AppStatus.DOWNLOAD == appDownloadButton.getStatus()) {
            e();
            this.t.performClick();
        }
    }

    private void c(Context context) {
        com.huawei.openalliance.ad.activity.b.a aVar = this.n;
        if (aVar != null) {
            context.unregisterReceiver(aVar);
            this.n = null;
        }
    }

    private void b(boolean z) {
        try {
            PPSAppDetailView pPSAppDetailView = this.j;
            if (pPSAppDetailView != null && pPSAppDetailView.getVisibility() == 0) {
                View viewInflate = getLayoutInflater().inflate(R.layout.hiad_landing_app_detail, (ViewGroup) null, false);
                if (viewInflate == null) {
                    return;
                }
                hw.a("PPSActivity", "start replace appDetailView");
                a(this.j, viewInflate);
                AppDownloadButton appDownloadButton = this.j.getAppDownloadButton();
                if (appDownloadButton != null) {
                    a(appDownloadButton, z);
                    a(appDownloadButton);
                }
                this.j.setAdLandingData(this.e);
            }
            PPSExpandButtonDetailView pPSExpandButtonDetailView = this.l;
            if (pPSExpandButtonDetailView == null || pPSExpandButtonDetailView.getVisibility() != 0) {
                return;
            }
            PPSExpandButtonDetailView pPSExpandButtonDetailView2 = new PPSExpandButtonDetailView(this);
            if (this.z) {
                pPSExpandButtonDetailView2.a(2);
            }
            hw.a("PPSActivity", "start replace expandButtonDetailView");
            a(this.l, pPSExpandButtonDetailView2);
            AppDownloadButton appDownloadButton2 = this.l.getAppDownloadButton();
            if (appDownloadButton2 != null) {
                a(appDownloadButton2);
            }
            this.l.setAdLandingData(this.e);
        } catch (Throwable unused) {
            hw.c("PPSActivity", "rebuild failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        hw.b("PPSActivity", "report Type is " + str);
        new i(this).a(this.e, str);
    }

    private void b(AppDownloadButton appDownloadButton) {
        PPSWebView pPSWebView = this.f18135b;
        if (pPSWebView != null) {
            ba baVar = new ba(this, this.e, appDownloadButton, pPSWebView, this.x);
            this.u = baVar;
            this.f18135b.addJavascriptInterface(baVar, Constants.PPS_JS_NAME);
        }
    }

    private void b(Context context) {
        if (Constants.HW_INTELLIEGNT_PACKAGE.equalsIgnoreCase(context.getPackageName())) {
            this.o = new Handler(Looper.myLooper());
            this.n = new com.huawei.openalliance.ad.activity.b.a();
            as.a(context, this.n, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"), "android.permission.WRITE_SECURE_SETTINGS", (Handler) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.hiad_menu_item_refresh) {
            m();
            return true;
        }
        if (itemId == R.id.hiad_menu_item_copy_link) {
            l();
            return true;
        }
        if (itemId == R.id.hiad_menu_item_open_in_browser) {
            a(this.e.getLandingUrl());
            return true;
        }
        if (itemId == R.id.hiad_menu_item_permission) {
            h.a(this, this.m);
            return true;
        }
        if (itemId != R.id.hiad_menu_item_privacy_policy) {
            return false;
        }
        a(this.e.r());
        return false;
    }

    private boolean a(Context context) {
        return as.a(context) >= 3 || cc.e(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        ba baVar;
        if (z && !pa.v(this.e.f())) {
            hw.b("PPSActivity", "not allow confirm");
            return;
        }
        AppDownloadButton appDownloadButton = this.t;
        if (appDownloadButton == null || appDownloadButton.d() || this.s || this.t.getStatus() != AppStatus.DOWNLOAD) {
            return;
        }
        this.s = true;
        if (!z && (baVar = this.u) != null) {
            if (baVar.a()) {
                return;
            } else {
                this.u.a(true);
            }
        }
        p();
        this.r.setAdPopupData(this.e);
        this.r.a();
        b("127");
    }

    private void a(String str) {
        try {
            Intent intent = new Intent();
            intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
            intent.setData(Uri.parse(str + "#" + System.currentTimeMillis()));
            intent.setFlags(268468224);
            startActivity(intent);
        } catch (Throwable th) {
            hw.c("PPSActivity", "openLinkInBrowser " + th.getClass().getSimpleName());
        }
    }

    private void a(PPSWebView pPSWebView) {
        if (pPSWebView == null) {
            return;
        }
        pPSWebView.setScrollListener(new View.OnScrollChangeListener() { // from class: com.huawei.openalliance.ad.activity.PPSActivity.11
            @Override // android.view.View.OnScrollChangeListener
            public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                if (PPSActivity.this.B() || !PPSActivity.this.q()) {
                    return;
                }
                if (PPSActivity.this.l != null && PPSActivity.this.g()) {
                    PPSActivity.this.l.c();
                }
                if (PPSActivity.this.j == null || PPSActivity.this.g()) {
                    return;
                }
                PPSActivity.this.j.c();
            }
        });
    }

    private void a(PPSAppDetailView pPSAppDetailView, int i) {
        if (pPSAppDetailView != null) {
            pPSAppDetailView.setBtnSource(i);
            pPSAppDetailView.setNonBtnSource(i);
        }
    }

    private void a(PPSAppDetailView pPSAppDetailView) {
        pPSAppDetailView.setVisibility(0);
        pPSAppDetailView.setNeedShowDspInfo(true);
        pPSAppDetailView.setNeedPerBeforDownload(true);
        pPSAppDetailView.setAdLandingData(this.e);
        pPSAppDetailView.setDetailViewType(1);
        pPSAppDetailView.setAppDetailClickListener(this.y);
        AppDownloadButton appDownloadButton = pPSAppDetailView.getAppDownloadButton();
        this.t = appDownloadButton;
        if (appDownloadButton != null) {
            appDownloadButton.setSource(2);
        }
        if (this.t == null || !r()) {
            return;
        }
        this.t.setAppDownloadButtonStyle(new ac(this));
    }

    private void a(AppDownloadButton appDownloadButton, boolean z) {
        int i = z ? R.dimen.hiad_72_dp : R.dimen.hiad_192_dp;
        Resources resources = getResources();
        if (resources == null) {
            return;
        }
        appDownloadButton.setMaxWidth(resources.getDimensionPixelSize(i));
    }

    private void a(AppDownloadButton appDownloadButton) {
        ViewGroup.LayoutParams layoutParams = appDownloadButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        appDownloadButton.setLayoutParamsSkipSizeReset(layoutParams);
    }

    private void a(View view, View view2) {
        dr.a(view.findViewById(R.id.app_detail_root), view2.findViewById(R.id.app_detail_root));
    }

    private void a(View view) {
        MenuItem menuItemFindItem;
        MenuInflater menuInflater;
        int i;
        if (this.i == null) {
            this.i = new PopupMenu(dk.d(this), view, GravityCompat.END);
            AppInfo appInfo = this.m;
            if (appInfo == null || !appInfo.w()) {
                menuInflater = this.i.getMenuInflater();
                i = R.menu.hiad_land_page_menu;
            } else {
                menuInflater = this.i.getMenuInflater();
                i = R.menu.hiad_land_page_expand_menu;
            }
            menuInflater.inflate(i, this.i.getMenu());
            this.i.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.huawei.openalliance.ad.activity.PPSActivity.7
                @Override // android.widget.PopupMenu.OnMenuItemClickListener
                public boolean onMenuItemClick(MenuItem menuItem) {
                    return PPSActivity.this.a(menuItem);
                }
            });
        }
        if (k() && (menuItemFindItem = this.i.getMenu().findItem(R.id.hiad_menu_item_privacy_policy)) != null) {
            menuItemFindItem.setVisible(true);
        }
        this.i.show();
    }

    private void a(Configuration configuration) {
        hw.a("PPSActivity", "onConfigurationChanged newConfig.screenWidthDp=" + configuration.screenWidthDp + ", this.screenWidthDp=" + this.k);
        if (this.k == null || configuration.screenWidthDp == this.k.intValue()) {
            return;
        }
        hw.a("PPSActivity", "onConfigurationChanged rebuildDetailView()");
        b(configuration.screenWidthDp < this.k.intValue());
        this.k = Integer.valueOf(configuration.screenWidthDp);
        C();
    }

    private void a(Intent intent) {
        if (intent == null) {
            return;
        }
        SafeIntent safeIntent = new SafeIntent(intent);
        hw.b("PPSActivity", "parseLinkedAdConfig");
        this.f18134a = new hg();
        String stringExtra = safeIntent.getStringExtra(MapKeyNames.LINKED_AD_DATA);
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f18134a = (hg) bk.b(stringExtra, hg.class, new Class[0]);
    }

    private void a(int i, int[] iArr) {
        if (i == 11 || i == 12) {
            if (iArr.length > 0 && iArr[0] == 0) {
                az azVar = this.q;
                if (azVar != null) {
                    if (i == 11) {
                        azVar.a(true, true);
                        return;
                    } else {
                        azVar.b(true, true);
                        return;
                    }
                }
                return;
            }
            if (!shouldShowRequestPermissionRationale("android.permission.WRITE_CALENDAR")) {
                a(i, i == 11 ? R.string.hiad_calender_permission_appoint_message : R.string.hiad_calender_permission_cancel_message);
                return;
            }
            az azVar2 = this.q;
            if (azVar2 != null) {
                if (i == 11) {
                    azVar2.a(false, true);
                } else {
                    azVar2.b(false, true);
                }
            }
        }
    }

    private void a(final int i, int i2) {
        new AlertDialog.Builder(this).setTitle(R.string.hiad_calender_permission_dialog).setMessage(i2).setPositiveButton(R.string.hiad_calender_set, new DialogInterface.OnClickListener() { // from class: com.huawei.openalliance.ad.activity.PPSActivity.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i3) {
                PPSActivity.this.A();
                dialogInterface.dismiss();
                if (PPSActivity.this.q != null) {
                    if (i == 11) {
                        PPSActivity.this.q.a(false, false);
                    } else {
                        PPSActivity.this.q.b(false, false);
                    }
                }
            }
        }).setNegativeButton(R.string.hiad_dialog_cancel, new DialogInterface.OnClickListener() { // from class: com.huawei.openalliance.ad.activity.PPSActivity.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i3) {
                dialogInterface.dismiss();
                if (PPSActivity.this.q != null) {
                    if (i == 11) {
                        PPSActivity.this.q.a(false, true);
                    } else {
                        PPSActivity.this.q.b(false, true);
                    }
                }
            }
        }).show();
    }

    private void a(int i) {
        PPSWebView pPSWebView;
        WebSettings settings;
        if (Build.VERSION.SDK_INT < 29 || (pPSWebView = this.f18135b) == null || (settings = pPSWebView.getSettings()) == null) {
            return;
        }
        settings.setForceDark(i);
    }

    private VideoView a(hm hmVar, Float f, int i) {
        VideoView videoView = hmVar.getVideoView();
        float f2 = i / 1.7777778f;
        float fFloatValue = f.floatValue();
        ViewGroup.LayoutParams layoutParams = videoView.getLayoutParams();
        layoutParams.width = (int) (fFloatValue * f2);
        layoutParams.height = (int) f2;
        videoView.setLayoutParams(layoutParams);
        return videoView;
    }

    private void C() {
        hw.b("PPSActivity", "resetLinkedNativeVideoView start");
        hg hgVar = this.f18134a;
        if (hgVar == null || hgVar.a() == null || this.f18134a.a().m() == null) {
            hw.b("PPSActivity", "getVideoInfo is null");
            return;
        }
        Float fM = this.f18134a.a().m();
        int iB = com.huawei.openalliance.ad.utils.d.b(this);
        if (fM.floatValue() >= 1.0f) {
            if (hw.a()) {
                hw.a("PPSActivity", "no need resetLinkedNativeVideoView");
                return;
            }
            return;
        }
        js jsVarF = this.f18136c.f();
        if (hw.a()) {
            hw.a("PPSActivity", "iView is %s", jsVarF.getClass().getSimpleName());
        }
        if (jsVarF instanceof com.huawei.openalliance.ad.linked.view.c) {
            com.huawei.openalliance.ad.linked.view.c cVar = (com.huawei.openalliance.ad.linked.view.c) jsVarF;
            if (cVar.getLinkedNativeVideoView() != null) {
                hm linkedNativeVideoView = cVar.getLinkedNativeVideoView();
                linkedNativeVideoView.setVideoView(a(linkedNativeVideoView, fM, iB));
                this.f18136c.a(linkedNativeVideoView);
                hw.b("PPSActivity", "reset LinkedLandView end");
                return;
            }
        }
        if (!(jsVarF instanceof com.huawei.openalliance.ad.linked.view.b)) {
            if (hw.a()) {
                hw.a("PPSActivity", "not resetLinkedNativeVideoView");
            }
        } else {
            com.huawei.openalliance.ad.linked.view.b bVar = (com.huawei.openalliance.ad.linked.view.b) jsVarF;
            bVar.setVideoView(a((hm) jsVarF, fM, iB));
            this.f18136c.a(bVar);
            hw.b("PPSActivity", "reset ILinkedNativeView end");
        }
    }

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<PPSActivity> f18155a;

        @Override // java.lang.Runnable
        public void run() {
            PPSActivity pPSActivity = this.f18155a.get();
            if (pPSActivity == null) {
                return;
            }
            pPSActivity.a(false);
        }

        public a(PPSActivity pPSActivity) {
            this.f18155a = new WeakReference<>(pPSActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean B() {
        if (System.currentTimeMillis() - this.v < 500) {
            return true;
        }
        this.v = System.currentTimeMillis();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", getPackageName(), null));
        startActivity(intent);
    }
}
