package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.huawei.openalliance.ad.beans.metadata.AppDownloadStatus;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.db.bean.EncryptionField;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.download.app.AppStatus;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AdLandingPageData;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.pa;
import com.huawei.openalliance.ad.views.AppDownloadButton;
import com.huawei.openalliance.ad.views.PPSWebView;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class ba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    AppStatus f20460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    AppDownloadTask f20461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AppDownloadButton f20462c;
    private final Context d;
    private ContentRecord e;
    private AppInfo f;
    private final PPSWebView g;
    private String h;
    private com.huawei.openalliance.ad.views.interfaces.z i;
    private String j;
    private String m;
    private boolean k = false;
    private int l = 0;
    private int n = 0;

    @JavascriptInterface
    public String queryInteractionCfg() {
        ContentRecord contentRecord;
        hw.c("IPPSJs", "queryInteractionCfg");
        if (!h() || (contentRecord = this.e) == null) {
            return null;
        }
        return contentRecord.aI();
    }

    @JavascriptInterface
    public String queryDownloadStatus() {
        String str;
        this.n++;
        AppDownloadStatus appDownloadStatus = new AppDownloadStatus();
        if (dk.a(this.d)) {
            if (!b(false)) {
                str = "check permission fail";
            } else {
                if (this.f != null) {
                    AppDownloadButton appDownloadButton = this.f20462c;
                    if (appDownloadButton != null) {
                        AppStatus status = appDownloadButton.getStatus();
                        this.f20460a = status;
                        appDownloadStatus = a(status);
                        String strA = appDownloadStatus.a();
                        if (!dg.e(this.m, strA)) {
                            this.m = strA;
                            hw.b("IPPSJs", "queryDownloadStatus from js status: %s, times:%s.", strA, Integer.valueOf(this.n));
                        }
                    }
                    return bk.b(appDownloadStatus);
                }
                str = "app info is null";
            }
            hw.c("IPPSJs", str);
        } else {
            hw.a("IPPSJs", "isScreenInteractive off, don't queryDownloadStatus.");
            appDownloadStatus = a(this.f20460a);
        }
        return bk.b(appDownloadStatus);
    }

    @JavascriptInterface
    public int privacyStyle() {
        return this.l;
    }

    @JavascriptInterface
    public void pause() {
        hw.b("IPPSJs", "call pause from js");
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ba.3
            @Override // java.lang.Runnable
            public void run() {
                if (!ba.this.b(true)) {
                    hw.c("IPPSJs", "check permission fail");
                    return;
                }
                if (ba.this.e()) {
                    hw.b("IPPSJs", "mini pause download");
                    ba.this.f();
                } else if (ba.this.f20462c != null) {
                    ba baVar = ba.this;
                    baVar.f20460a = baVar.f20462c.getStatus();
                    if (AppStatus.DOWNLOADING == ba.this.f20460a) {
                        ba.this.f();
                    }
                }
            }
        });
    }

    @JavascriptInterface
    public void openApp() {
        hw.b("IPPSJs", "call openApp from js");
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ba.4
            @Override // java.lang.Runnable
            public void run() {
                if (!ba.this.b(true)) {
                    hw.c("IPPSJs", "check permission fail");
                    return;
                }
                if (ba.this.f == null || ba.this.f20462c == null) {
                    return;
                }
                ba baVar = ba.this;
                baVar.f20460a = baVar.f20462c.getStatus();
                if (AppStatus.INSTALLED == ba.this.f20460a) {
                    ba.this.f();
                }
            }
        });
    }

    @JavascriptInterface
    public boolean isPreload() {
        hw.b("IPPSJs", "isPreload: false");
        return false;
    }

    @JavascriptInterface
    public void download(String str, int i) {
        hw.b("IPPSJs", "call download from js with area:" + i);
        try {
            if (100 == i) {
                if (!c() || this.i == null) {
                    return;
                }
                hw.c("IPPSJs", "allow area 100 download in pps landingPage");
                this.i.a(100);
                return;
            }
            if (i != 0 && 1 != i && 2 != i) {
                hw.c("IPPSJs", "area %s is invalid", Integer.valueOf(i));
                return;
            }
            if (h() || 1 != i) {
                ContentRecord contentRecord = this.e;
                if (contentRecord != null && !dg.b(contentRecord.aI())) {
                    if (!Arrays.asList(this.e.aI().split("\\|")).contains(String.valueOf(i))) {
                        hw.c("IPPSJs", "not allow area %s download", Integer.valueOf(i));
                    }
                    a(str);
                    return;
                } else {
                    if (i != 0 && 1 != i) {
                        hw.c("IPPSJs", "not allow area %s download", Integer.valueOf(i));
                    }
                    a(str);
                    return;
                }
            }
            hw.c("IPPSJs", "only allow area 1 download in pps landingPage");
            b();
        } catch (Throwable th) {
            hw.c("IPPSJs", "download for Area: %s err, %s", Integer.valueOf(i), th.getClass().getSimpleName());
        }
    }

    @JavascriptInterface
    public void download(String str) {
        hw.b("IPPSJs", "call download from js");
        a(str);
    }

    @JavascriptInterface
    public void download() {
        hw.b("IPPSJs", "call download from js");
        a((String) null);
    }

    public boolean a() {
        return this.k;
    }

    public void a(boolean z) {
        this.k = z;
    }

    public void a(int i) {
        this.l = i;
    }

    private boolean h() {
        return "2".equals(this.e.af()) || "1".equals(this.e.af());
    }

    private boolean g() {
        ContentRecord contentRecord = this.e;
        if (contentRecord == null) {
            return false;
        }
        return pa.e(contentRecord.X());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.f20462c != null) {
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ba.5
                @Override // java.lang.Runnable
                public void run() {
                    ba.this.f20462c.performClick();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        AppInfo appInfo = this.f;
        if (appInfo == null) {
            return false;
        }
        String strB = appInfo.b((Integer) 4);
        return (TextUtils.isEmpty(strB) || TextUtils.isEmpty(this.f.getPackageName()) || !strB.equals("6")) ? false : true;
    }

    private boolean d() {
        ContentRecord contentRecord = this.e;
        return (contentRecord == null || contentRecord.ag() == null || this.g.getWebHasShownTime() < this.e.ag().D()) ? false : true;
    }

    private boolean c(boolean z) {
        PPSWebView pPSWebView;
        String currentPageUrl;
        EncryptionField<String> encryptionFieldAd;
        if (this.e == null || (pPSWebView = this.g) == null) {
            return false;
        }
        if (z) {
            com.huawei.openalliance.ad.views.an webView = pPSWebView.getWebView();
            currentPageUrl = webView != null ? webView.getUrl() : null;
        } else {
            currentPageUrl = pPSWebView.getCurrentPageUrl();
        }
        if (TextUtils.isEmpty(this.h) && (encryptionFieldAd = this.e.ad()) != null) {
            this.h = encryptionFieldAd.a(this.d);
        }
        return dg.d(currentPageUrl, this.h);
    }

    private boolean c() {
        return h() && !this.k && pa.A(this.j) && d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(boolean z) {
        String str;
        if (h()) {
            return true;
        }
        if (!g()) {
            str = "h5 download is not enable and is not pps landing page";
        } else {
            if (c(z)) {
                return true;
            }
            str = "page is not in white list";
        }
        hw.c("IPPSJs", str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        com.huawei.openalliance.ad.views.interfaces.z zVar = this.i;
        if (zVar != null) {
            zVar.a();
        }
    }

    /* JADX INFO: loaded from: classes41.dex */
    static class a implements ac.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f20471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AppDownloadButton f20472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ContentRecord f20473c;
        private final Context d;

        @Override // com.huawei.openalliance.ad.utils.ac.a
        public void a(boolean z) {
            new com.huawei.openalliance.ad.analysis.i(this.d).d(this.f20473c);
            AppDownloadButton appDownloadButton = this.f20472b;
            if (appDownloadButton != null) {
                appDownloadButton.f();
            }
        }

        @Override // com.huawei.openalliance.ad.utils.ac.a
        public void a() {
            if (this.f20472b != null) {
                dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ba.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.f20472b.setSource(4);
                        a.this.f20472b.setNeedShowPermision(false);
                        a.this.f20472b.setNeedShowConfirmDialog(false);
                        if (a.this.f20471a) {
                            a.this.f20472b.setAllowedNonWifiNetwork(true);
                            a.this.f20472b.setOnNonWifiDownloadListener(new AppDownloadButton.OnNonWifiDownloadListener() { // from class: com.huawei.openalliance.ad.utils.ba.a.1.1
                                @Override // com.huawei.openalliance.ad.views.AppDownloadButton.OnNonWifiDownloadListener
                                public boolean onNonWifiDownload(AppInfo appInfo, long j) {
                                    a.this.f20472b.setAllowedNonWifiNetwork(true);
                                    return true;
                                }
                            });
                        }
                        a.this.f20472b.performClick();
                    }
                });
            }
            new com.huawei.openalliance.ad.analysis.i(this.d).e(this.f20473c);
        }

        public a(Context context, boolean z, AppDownloadButton appDownloadButton, ContentRecord contentRecord) {
            this.d = context;
            this.f20471a = z;
            this.f20472b = appDownloadButton;
            this.f20473c = contentRecord;
        }
    }

    private void a(final String str) {
        if (!pa.u(this.j)) {
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ba.2
                @Override // java.lang.Runnable
                public void run() {
                    if (ba.this.b(true)) {
                        if (ba.this.f == null || k.a(ba.this.d, ba.this.f.getPackageName())) {
                            hw.c("IPPSJs", "app info is null or app is installed");
                            return;
                        }
                        if (ba.this.f20462c == null) {
                            hw.c("IPPSJs", "there is no download button");
                            return;
                        }
                        ba.this.f20462c.setVenusExt(str);
                        if (!ba.this.e()) {
                            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ba.2.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    ba.this.f20460a = ba.this.f20462c.getStatus();
                                    if (AppStatus.DOWNLOAD != ba.this.f20460a) {
                                        if (AppStatus.PAUSE == ba.this.f20460a || AppStatus.INSTALL == ba.this.f20460a || AppStatus.WAITING_FOR_WIFI == ba.this.f20460a) {
                                            hw.b("IPPSJs", "resume download");
                                            ba.this.f();
                                            return;
                                        }
                                        return;
                                    }
                                    hw.b("IPPSJs", "start download");
                                    if (!pa.g(ba.this.e.X())) {
                                        ba.this.f20462c.setSource(4);
                                        ba.this.f20462c.setNeedShowPermision(false);
                                        ba.this.f();
                                    } else {
                                        ba.this.k = true;
                                        if (cb.c(ba.this.d)) {
                                            com.huawei.openalliance.ad.download.app.c.a(ba.this.d, new a(ba.this.d, false, ba.this.f20462c, ba.this.e));
                                        } else {
                                            com.huawei.openalliance.ad.download.app.c.b(ba.this.d, new a(ba.this.d, true, ba.this.f20462c, ba.this.e));
                                        }
                                    }
                                }
                            });
                            return;
                        }
                        hw.b("IPPSJs", "mini download");
                        ba.this.f20462c.setSource(4);
                        ba.this.f20462c.setNeedShowPermision(false);
                        ba.this.f();
                        return;
                    }
                    hw.c("IPPSJs", "check permission fail");
                    ba.this.b();
                }
            });
        } else {
            hw.b("IPPSJs", "js download forbidden");
            b();
        }
    }

    private AppDownloadStatus a(AppStatus appStatus) {
        AppDownloadStatus appDownloadStatus = new AppDownloadStatus();
        if (appStatus != null) {
            AppDownloadTask appDownloadTaskD = com.huawei.openalliance.ad.download.app.e.h().d(this.f);
            this.f20461b = appDownloadTaskD;
            int iL = appDownloadTaskD == null ? 0 : appDownloadTaskD.l();
            appDownloadStatus.a(appStatus);
            appDownloadStatus.a(iL);
        }
        return appDownloadStatus;
    }

    public ba(final Context context, AdLandingPageData adLandingPageData, AppDownloadButton appDownloadButton, PPSWebView pPSWebView, com.huawei.openalliance.ad.views.interfaces.z zVar) {
        this.f20462c = appDownloadButton;
        this.d = context;
        this.i = zVar;
        if (adLandingPageData != null) {
            this.e = adLandingPageData.z();
            this.f = adLandingPageData.getAppInfo();
            this.j = adLandingPageData.f();
        }
        this.g = pPSWebView;
        if (this.e != null) {
            o.f(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ba.1
                @Override // java.lang.Runnable
                public void run() {
                    EncryptionField<String> encryptionFieldAd = ba.this.e.ad();
                    if (encryptionFieldAd != null) {
                        ba.this.h = encryptionFieldAd.a(context);
                    }
                }
            });
        }
    }
}
