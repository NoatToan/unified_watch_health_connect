package com.huawei.openalliance.ad.download.app;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.constant.ClickDestination;
import com.huawei.openalliance.ad.constant.EventType;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.download.DownloadTask;
import com.huawei.openalliance.ad.dr;
import com.huawei.openalliance.ad.dt;
import com.huawei.openalliance.ad.ew;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.IAd;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.inter.data.RewardVerifyConfig;
import com.huawei.openalliance.ad.inter.listeners.AppDownloadListenerV1;
import com.huawei.openalliance.ad.js;
import com.huawei.openalliance.ad.pc;
import com.huawei.openalliance.ad.pl;
import com.huawei.openalliance.ad.pq;
import com.huawei.openalliance.ad.rc;
import com.huawei.openalliance.ad.sw;
import com.huawei.openalliance.ad.tp;
import com.huawei.openalliance.ad.utils.cb;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.views.AppDownloadButton;
import com.huawei.openalliance.ad.views.PPSNativeView;
import com.huawei.openalliance.ad.views.PPSPlacementView;

/* JADX INFO: loaded from: classes12.dex */
public class m implements com.huawei.openalliance.ad.download.app.interfaces.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f18583a;
    private String d;
    private AppDownloadListenerV1 e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f18584b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f18585c = 6;
    private final j f = new j();

    @Override // com.huawei.openalliance.ad.download.app.interfaces.a
    public AppStatus f(Context context, IAd iAd) {
        if (!h(context, iAd)) {
            return AppStatus.DOWNLOAD;
        }
        AppInfo appInfo = iAd.getAppInfo();
        if (appInfo == null) {
            hw.c("PPSAppDownloadManager", "appInfo is null.");
            return AppStatus.DOWNLOAD;
        }
        if (com.huawei.openalliance.ad.utils.k.a(context, appInfo.getPackageName())) {
            hw.b("PPSAppDownloadManager", "app installed");
            return AppStatus.INSTALLED;
        }
        if (!b(appInfo)) {
            return AppStatus.DOWNLOAD;
        }
        AppDownloadTask appDownloadTaskD = this.f18583a.d(appInfo);
        b(context, iAd, appDownloadTaskD);
        if (appDownloadTaskD == null) {
            return AppStatus.DOWNLOAD;
        }
        appDownloadTaskD.m(iAd.getContentId());
        return com.huawei.openalliance.ad.utils.l.a(appDownloadTaskD);
    }

    @Override // com.huawei.openalliance.ad.download.app.interfaces.a
    public int e(Context context, IAd iAd) {
        if (!g(context, iAd)) {
            return 0;
        }
        AppDownloadTask appDownloadTaskD = this.f18583a.d(iAd.getAppInfo());
        if (appDownloadTaskD != null) {
            return appDownloadTaskD.l();
        }
        hw.b("PPSAppDownloadManager", "task is not exist.");
        return 0;
    }

    @Override // com.huawei.openalliance.ad.download.app.interfaces.a
    public void d(Context context, IAd iAd) {
        Integer num;
        if (g(context, iAd)) {
            if (!this.f.a(context, iAd, false)) {
                hw.b("PPSAppDownloadManager", "cancelDownload has not permission");
                return;
            }
            AppInfo appInfo = iAd.getAppInfo();
            if (appInfo == null) {
                hw.c("PPSAppDownloadManager", "appInfo is null.");
                return;
            }
            AppDownloadTask appDownloadTaskA = this.f18583a.a(appInfo.getPackageName());
            if (appDownloadTaskA == null || appDownloadTaskA.i() == com.huawei.openalliance.ad.download.e.INSTALLING) {
                return;
            }
            a(context, iAd, appDownloadTaskA);
            a(iAd, appDownloadTaskA);
            if (this.f18583a.b(appInfo) && (num = this.f18585c) != null) {
                if (num.intValue() == 14 || this.f18585c.intValue() == 10005) {
                    b(context, appInfo);
                }
            }
        }
    }

    @Override // com.huawei.openalliance.ad.download.app.interfaces.a
    public int c(Context context, IAd iAd) {
        if (!g(context, iAd)) {
            return -1;
        }
        if (m(context, iAd)) {
            hw.b("PPSAppDownloadManager", "open landing page action");
            return -4;
        }
        if (!this.f.a(context, iAd, false)) {
            hw.b("PPSAppDownloadManager", "pauseDownload has not permission");
            return -2;
        }
        AppInfo appInfo = iAd.getAppInfo();
        if (appInfo == null) {
            hw.c("PPSAppDownloadManager", "appInfo is null.");
            return -1;
        }
        AppDownloadTask appDownloadTaskA = this.f18583a.a(appInfo.getPackageName());
        if (hw.a()) {
            hw.a("PPSAppDownloadManager", "pauseDownload, taskAppInfoId: %s", (appDownloadTaskA == null || appDownloadTaskA.B() == null) ? null : appDownloadTaskA.B().getUniqueId());
            hw.a("PPSAppDownloadManager", "pauseDownload, adUniqueId: %s", iAd.getUniqueId());
        }
        b(context, iAd, appDownloadTaskA);
        if (appDownloadTaskA == null) {
            return 1;
        }
        a(context, iAd, appDownloadTaskA);
        a(iAd, appDownloadTaskA);
        this.f18583a.b(appDownloadTaskA);
        return 1;
    }

    @Override // com.huawei.openalliance.ad.download.app.interfaces.a
    public void b() {
        this.f18583a.k();
    }

    public int b(final Context context, js jsVar, final IAd iAd) {
        AppInfo appInfo = iAd.getAppInfo();
        this.f18583a.a(appInfo);
        pc pcVarL = l(context, iAd);
        if (pcVarL == null) {
            return -1;
        }
        AppDownloadTask appDownloadTaskA = a(iAd, pcVarL);
        if (appDownloadTaskA == null) {
            hw.b("PPSAppDownloadManager", "failed when create task");
            return -1;
        }
        a(iAd, appDownloadTaskA);
        if (!c()) {
            g(context, jsVar, iAd);
            a(context, pcVarL, appInfo);
        }
        this.f18583a.b(appDownloadTaskA);
        i.a(context);
        i.a().a(appDownloadTaskA, new i.b() { // from class: com.huawei.openalliance.ad.download.app.m.5
            @Override // com.huawei.openalliance.ad.download.app.i.b
            public void a(AppDownloadTask appDownloadTask) {
                if (appDownloadTask == null || appDownloadTask.i() == com.huawei.openalliance.ad.download.e.INSTALLED || !appDownloadTask.J()) {
                    return;
                }
                m.this.a(context, (js) null, iAd, false);
            }
        });
        return 0;
    }

    @Override // com.huawei.openalliance.ad.download.app.interfaces.a
    public int b(Context context, IAd iAd) {
        if (m(context, iAd)) {
            hw.b("PPSAppDownloadManager", "open landing page action");
            return -4;
        }
        int iB = b(context, iAd, false);
        return iB != 0 ? iB : a(context, (js) null, iAd, true);
    }

    @Override // com.huawei.openalliance.ad.download.app.interfaces.a
    public boolean a(Context context, IAd iAd, boolean z) {
        if (z) {
            return g(context, iAd) && n(context, iAd);
        }
        return n(context, iAd);
    }

    @Override // com.huawei.openalliance.ad.download.app.interfaces.a
    public void a(Integer num) {
        this.f18585c = num;
    }

    @Override // com.huawei.openalliance.ad.download.app.interfaces.a
    public void a(AppDownloadButton.OnResolutionRequiredListener onResolutionRequiredListener) {
        if (onResolutionRequiredListener == null) {
            return;
        }
        this.f18583a.a(onResolutionRequiredListener);
    }

    @Override // com.huawei.openalliance.ad.download.app.interfaces.a
    public void a(final Context context, final IAd iAd, final int i) {
        if (context == null || iAd == null) {
            hw.c("PPSAppDownloadManager", "param err");
        } else {
            com.huawei.openalliance.ad.utils.o.h(new Runnable() { // from class: com.huawei.openalliance.ad.download.app.m.8
                @Override // java.lang.Runnable
                public void run() {
                    new com.huawei.openalliance.ad.analysis.c(context).a(context, iAd, i);
                }
            });
        }
    }

    @Override // com.huawei.openalliance.ad.download.app.interfaces.a
    public void a(int i) {
        this.f18584b = i;
    }

    @Override // com.huawei.openalliance.ad.download.app.interfaces.a
    public void a() {
        this.f18583a.j();
    }

    @Override // com.huawei.openalliance.ad.download.app.interfaces.a
    public int a(Context context, js jsVar, IAd iAd) {
        if (n(context, iAd)) {
            hw.b("PPSAppDownloadManager", "app is installed, open it.");
            return 0;
        }
        int iC = c(context, jsVar, iAd);
        if (iC == 0) {
            return d(context, jsVar, iAd);
        }
        if (iAd != null) {
            a(AppStatusV1.PRE_CHECK_FAILED, -1000, iAd.getAppInfo());
        }
        return iC;
    }

    @Override // com.huawei.openalliance.ad.download.app.interfaces.a
    public int a(Context context, IAd iAd) {
        if (n(context, iAd)) {
            hw.b("PPSAppDownloadManager", "app is installed, open it.");
            return 0;
        }
        if (m(context, iAd)) {
            hw.b("PPSAppDownloadManager", "open landing page action");
            return -4;
        }
        int iB = b(context, iAd, a(iAd));
        if (iB == 0) {
            return d(context, null, iAd);
        }
        if (iAd != null) {
            a(AppStatusV1.PRE_CHECK_FAILED, -1000, iAd.getAppInfo());
        }
        return iB;
    }

    private boolean n(Context context, IAd iAd) {
        String str;
        if (iAd == null || iAd.getAppInfo() == null) {
            str = "param is empty";
        } else {
            pc pcVarL = l(context, iAd);
            if (pcVarL == null) {
                str = "event processor failed when open app";
            } else {
                AppInfo appInfo = iAd.getAppInfo();
                if (iAd instanceof com.huawei.openalliance.ad.inter.data.j) {
                    com.huawei.openalliance.ad.inter.data.j jVar = (com.huawei.openalliance.ad.inter.data.j) iAd;
                    if (!TextUtils.isEmpty(jVar.b())) {
                        appInfo.v(jVar.b());
                    }
                }
                if (com.huawei.openalliance.ad.utils.k.a(context, appInfo.getPackageName())) {
                    com.huawei.openalliance.ad.utils.dcservice.c.a aVar = new com.huawei.openalliance.ad.utils.dcservice.c.a();
                    aVar.a(iAd.getContentId()).b(iAd.getTaskId()).a(appInfo);
                    boolean zA = com.huawei.openalliance.ad.utils.k.a(context, appInfo.getPackageName(), appInfo.getIntentUri(), aVar.a());
                    MaterialClickInfo materialClickInfo = new MaterialClickInfo();
                    materialClickInfo.h(1);
                    com.huawei.openalliance.ad.processor.eventbeans.b.a aVar2 = new com.huawei.openalliance.ad.processor.eventbeans.b.a();
                    aVar2.b("app").a((Integer) 6).a(materialClickInfo).d(com.huawei.openalliance.ad.utils.b.a(context));
                    if (zA) {
                        a(context, appInfo);
                        pcVarL.a(EventType.INTENTSUCCESS, (Integer) 1, (Integer) null);
                        if (!c()) {
                            pcVarL.a(aVar2.a());
                            g(context, null, iAd);
                        }
                        return true;
                    }
                    hw.b("PPSAppDownloadManager", "handleClick, openAppIntent failed");
                    pcVarL.a(EventType.INTENTFAIL, (Integer) 1, (Integer) 2);
                    if (com.huawei.openalliance.ad.utils.k.a(context, appInfo.getPackageName(), aVar.a())) {
                        pcVarL.a((Integer) 6);
                        a(context, appInfo);
                        if (!c()) {
                            pcVarL.a(aVar2.a());
                            g(context, null, iAd);
                        }
                        return true;
                    }
                    str = "handleClick, openAppMainPage failed";
                } else {
                    str = "app not installed, need download";
                }
            }
        }
        hw.b("PPSAppDownloadManager", str);
        return false;
    }

    private boolean m(Context context, IAd iAd) {
        if (context == null || iAd == null) {
            return false;
        }
        AppInfo appInfo = iAd.getAppInfo();
        if (appInfo == null) {
            hw.b("PPSAppDownloadManager", "failed to get app info when open landing page");
            return false;
        }
        if ("21".equals(appInfo.a()) || com.huawei.openalliance.ad.utils.c.b(context, b(iAd))) {
            return new tp(context, b(iAd), true, iAd instanceof com.huawei.openalliance.ad.inter.data.e ? ((com.huawei.openalliance.ad.inter.data.e) iAd).ap() : null).a();
        }
        return false;
    }

    private pc l(Context context, IAd iAd) {
        ContentRecord contentRecordB = b(iAd);
        if (contentRecordB == null) {
            hw.b("PPSAppDownloadManager", "contentRecord is empty when convert from nativeAd");
            return null;
        }
        pc pcVar = new pc(context, sw.a(context, contentRecordB.f()));
        pcVar.a(contentRecordB);
        return pcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int k(Context context, IAd iAd) {
        if (n(context, iAd)) {
            hw.b("PPSAppDownloadManager", "app is installed, open it.");
            return 0;
        }
        hw.b("PPSAppDownloadManager", "preWifiDownload");
        AppDownloadTask appDownloadTaskB = b(context, b(iAd), iAd.getAppInfo());
        b(context, iAd, appDownloadTaskB);
        if (appDownloadTaskB == null) {
            appDownloadTaskB = a(iAd, l(context, iAd));
            this.f18583a.b(appDownloadTaskB);
        }
        if (appDownloadTaskB != null) {
            appDownloadTaskB.a(DownloadTask.a.WAITING_WIFI_DOWNLOAD);
        }
        AppStatus appStatusF = f(context, iAd);
        if (appStatusF != AppStatus.DOWNLOAD && appStatusF != AppStatus.WAITING_FOR_WIFI && appStatusF != AppStatus.PAUSE) {
            return -1;
        }
        this.f18583a.e(appDownloadTaskB);
        return 0;
    }

    private int j(Context context, IAd iAd) {
        AppDownloadTask appDownloadTaskD = this.f18583a.d(iAd.getAppInfo());
        if (hw.a()) {
            hw.a("PPSAppDownloadManager", "resumeDownload, taskAppInfoId: %s", (appDownloadTaskD == null || appDownloadTaskD.B() == null) ? null : appDownloadTaskD.B().getUniqueId());
            hw.a("PPSAppDownloadManager", "resumeDownload, adUniqueId: %s", iAd.getUniqueId());
        }
        b(context, iAd, appDownloadTaskD);
        if (appDownloadTaskD == null) {
            hw.b("PPSAppDownloadManager", "app download info is empty, must first invoke startDownload method");
            return -1;
        }
        a(context, iAd, appDownloadTaskD);
        appDownloadTaskD.a(iAd.getAppInfo().isAllowedNonWifiNetwork());
        a(iAd, appDownloadTaskD);
        return this.f18583a.a(appDownloadTaskD, true) ? 0 : -1;
    }

    private boolean i(Context context, IAd iAd) {
        AppInfo appInfo = iAd.getAppInfo();
        if (appInfo != null) {
            return appInfo.w() && appInfo.isPermPromptForCard() && f(context, iAd) == AppStatus.DOWNLOAD;
        }
        hw.c("PPSAppDownloadManager", "appInfo is null.");
        return false;
    }

    private boolean h(Context context, IAd iAd) {
        String str;
        if (context == null || iAd == null) {
            return false;
        }
        boolean z = iAd instanceof com.huawei.openalliance.ad.inter.data.j;
        if (!(iAd instanceof com.huawei.openalliance.ad.inter.data.e) && !(iAd instanceof com.huawei.openalliance.ad.inter.data.h) && !z) {
            str = "ad is not native or placement ad when start download";
        } else {
            if (iAd.isAdIdInWhiteList() || z) {
                return true;
            }
            str = "download has not permission, please add white list";
        }
        hw.b("PPSAppDownloadManager", str);
        return false;
    }

    private boolean g(Context context, IAd iAd) {
        return h(context, iAd) && b(iAd.getAppInfo());
    }

    private void g(Context context, js jsVar, IAd iAd) {
        if (jsVar != null) {
            if (jsVar instanceof PPSNativeView) {
                ((PPSNativeView) jsVar).a((Integer) 6);
            }
            if (jsVar instanceof PPSPlacementView) {
                ((PPSPlacementView) jsVar).a((Integer) 6);
                return;
            }
            return;
        }
        if (iAd != null) {
            String showId = iAd instanceof com.huawei.openalliance.ad.inter.data.j ? ((com.huawei.openalliance.ad.inter.data.j) iAd).getShowId() : null;
            if (showId == null || !showId.equals(this.d)) {
                this.d = showId;
                ContentRecord contentRecordB = b(iAd);
                pc pcVar = new pc(context, sw.a(context, contentRecordB.f()));
                contentRecordB.c(iAd.getShowId());
                pcVar.a(contentRecordB);
                com.huawei.openalliance.ad.processor.eventbeans.a.C0229a c0229a = new com.huawei.openalliance.ad.processor.eventbeans.a.C0229a();
                c0229a.a(Long.valueOf(iAd.getMinEffectiveShowTime())).a(Integer.valueOf(iAd.getMinEffectiveShowRatio())).b((Integer) 6).a(com.huawei.openalliance.ad.utils.b.a(context));
                pcVar.a(c0229a.a());
            }
        }
    }

    private int f(Context context, js jsVar, IAd iAd) {
        AppInfo appInfo = iAd.getAppInfo();
        AppDownloadTask appDownloadTaskD = this.f18583a.d(appInfo);
        b(context, iAd, appDownloadTaskD);
        if (appDownloadTaskD != null) {
            appDownloadTaskD.a(appInfo.isAllowedNonWifiNetwork());
            a(iAd, appDownloadTaskD);
            a(context, iAd, appDownloadTaskD);
            return this.f18583a.a(appDownloadTaskD, true) ? 0 : -1;
        }
        pc pcVarL = l(context, iAd);
        if (pcVarL == null) {
            return -1;
        }
        AppDownloadTask appDownloadTaskA = a(iAd, pcVarL);
        if (appDownloadTaskA == null) {
            hw.b("PPSAppDownloadManager", "failed when create task");
            return -1;
        }
        appDownloadTaskA.a(appInfo.isAllowedNonWifiNetwork());
        a(iAd, appDownloadTaskA);
        if (!c()) {
            g(context, jsVar, iAd);
            a(context, pcVarL, appInfo);
        }
        return this.f18583a.c(appDownloadTaskA) ? 0 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int e(Context context, js jsVar, IAd iAd) {
        return a(iAd) ? b(context, jsVar, iAd) : a(context, jsVar, iAd, false);
    }

    private int d(final Context context, final js jsVar, final IAd iAd) {
        if (!i(context, iAd)) {
            return e(context, jsVar, iAd);
        }
        h.a(context, iAd.getAppInfo(), new h.a() { // from class: com.huawei.openalliance.ad.download.app.m.2
            @Override // com.huawei.openalliance.ad.download.app.h.a
            public void a(int i) {
            }

            @Override // com.huawei.openalliance.ad.download.app.h.a
            public void a() {
                m.this.e(context, jsVar, iAd);
            }
        });
        return -3;
    }

    private boolean c(AppInfo appInfo) {
        if (appInfo == null) {
            return false;
        }
        return appInfo.a(this.f18585c);
    }

    private boolean c() {
        return this.f18585c.intValue() == 14 || this.f18585c.intValue() == 10005;
    }

    private int c(IAd iAd) {
        if (iAd instanceof com.huawei.openalliance.ad.inter.data.e) {
            return 3;
        }
        return iAd instanceof com.huawei.openalliance.ad.inter.data.h ? 60 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c(Context context, js jsVar, IAd iAd, boolean z) {
        if (!n(context, iAd)) {
            return z ? j(context, iAd) : f(context, jsVar, iAd);
        }
        hw.b("PPSAppDownloadManager", "app is installed, open it.");
        return 0;
    }

    private int c(Context context, js jsVar, IAd iAd) {
        String str;
        if (context != null && iAd != null && jsVar != null && (jsVar instanceof com.huawei.openalliance.ad.views.interfaces.f)) {
            com.huawei.openalliance.ad.views.interfaces.f fVar = (com.huawei.openalliance.ad.views.interfaces.f) jsVar;
            if (fVar.getAd() == null || fVar.getAd() != iAd) {
                str = "make sure the registered ad of view is same";
            } else {
                if (fVar.d()) {
                    return b(context, iAd, a(iAd));
                }
                str = "make sure ad view is visibility";
            }
            hw.b("PPSAppDownloadManager", str);
        }
        return -1;
    }

    private boolean b(AppInfo appInfo) {
        String str;
        if (com.huawei.openalliance.ad.utils.l.a(appInfo, this.f18585c)) {
            str = "appInfo is invalid";
        } else {
            if (this.f18583a != null) {
                return true;
            }
            str = "download manager is not init";
        }
        hw.b("PPSAppDownloadManager", str);
        return false;
    }

    private void b(final Context context, IAd iAd, AppDownloadTask appDownloadTask) {
        if (context == null || appDownloadTask == null || appDownloadTask.B() == null || !(iAd instanceof com.huawei.openalliance.ad.inter.data.j)) {
            return;
        }
        final com.huawei.openalliance.ad.inter.data.j jVar = (com.huawei.openalliance.ad.inter.data.j) iAd;
        String uniqueId = appDownloadTask.B().getUniqueId();
        if (TextUtils.equals(uniqueId, jVar.b())) {
            return;
        }
        jVar.a(uniqueId);
        hw.b("PPSAppDownloadManager", "update uniqueId according to appInfo.");
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.download.app.m.4
            @Override // java.lang.Runnable
            public void run() {
                ew.a(context).b(jVar.a());
            }
        });
    }

    public static void b(Context context, final AppInfo appInfo) {
        if (appInfo == null) {
            hw.b("PPSAppDownloadManager", "appInfo is empty.");
        } else {
            com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.download.app.m.7
                @Override // java.lang.Runnable
                public void run() {
                    d dVarA = d.a();
                    if (dVarA != null) {
                        dVarA.onUserCancel(appInfo);
                    }
                }
            });
        }
    }

    private AppDownloadTask b(Context context, ContentRecord contentRecord, AppInfo appInfo) {
        AppDownloadTask appDownloadTaskD = this.f18583a.d(appInfo);
        if (appDownloadTaskD != null) {
            if (contentRecord != null) {
                appDownloadTaskD.k(contentRecord.n());
                appDownloadTaskD.l(contentRecord.aa());
                appDownloadTaskD.m(contentRecord.o());
                appDownloadTaskD.n(contentRecord.l());
                appDownloadTaskD.r(contentRecord.bv());
            }
            if (appDownloadTaskD.C() == null && contentRecord != null) {
                pc pcVar = new pc(context, sw.a(context, contentRecord.f()));
                pcVar.a(contentRecord);
                appDownloadTaskD.a(pcVar);
            }
        }
        return appDownloadTaskD;
    }

    private ContentRecord b(IAd iAd) {
        if (iAd instanceof com.huawei.openalliance.ad.inter.data.j) {
            return ((com.huawei.openalliance.ad.inter.data.j) iAd).a();
        }
        int iC = c(iAd);
        if (iC != 3) {
            return iC != 60 ? new ContentRecord() : pq.a((com.huawei.openalliance.ad.inter.data.h) iAd);
        }
        return pl.a((com.huawei.openalliance.ad.inter.data.e) iAd);
    }

    private int b(final Context context, final js jsVar, final IAd iAd, final boolean z) {
        AppInfo appInfo = iAd.getAppInfo();
        int iF = com.huawei.openalliance.ad.utils.k.f(context, "com.huawei.appmarket");
        if (c(appInfo) && iF >= 100300300) {
            return c(context, jsVar, iAd, z);
        }
        ContentRecord contentRecordB = b(iAd);
        AppDownloadTask appDownloadTaskB = b(context, contentRecordB, appInfo);
        b(context, iAd, appDownloadTaskB);
        if ((appDownloadTaskB != null && appDownloadTaskB.o()) || appInfo.isAllowedNonWifiNetwork()) {
            appInfo.setAllowedNonWifiNetwork(true);
            return c(context, jsVar, iAd, z);
        }
        dt dtVar = new dt(context);
        dtVar.a(new dr.a() { // from class: com.huawei.openalliance.ad.download.app.m.3
            @Override // com.huawei.openalliance.ad.dr.a
            public void c(AppInfo appInfo2) {
                m.this.k(context, iAd);
            }

            @Override // com.huawei.openalliance.ad.dr.a
            public void b(AppInfo appInfo2) {
                m.this.a(AppStatusV1.PRE_CHECK_FAILED, 1003, appInfo2);
            }

            @Override // com.huawei.openalliance.ad.dr.a
            public void a(AppInfo appInfo2) {
                appInfo2.setAllowedNonWifiNetwork(true);
                m.this.c(context, jsVar, iAd, z);
            }
        });
        dtVar.a(appInfo, contentRecordB, a(context, contentRecordB, appInfo));
        return -3;
    }

    private int b(final Context context, IAd iAd, boolean z) {
        if (!z && !cb.e(context)) {
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.download.app.m.1
                @Override // java.lang.Runnable
                public void run() {
                    Toast.makeText(context, R.string.hiad_network_no_available, 0).show();
                }
            });
            return -1;
        }
        if (context == null || iAd == null) {
            return -1;
        }
        boolean z2 = iAd instanceof com.huawei.openalliance.ad.inter.data.j;
        if (!(iAd instanceof com.huawei.openalliance.ad.inter.data.e) && !(iAd instanceof com.huawei.openalliance.ad.inter.data.h) && !z2) {
            hw.b("PPSAppDownloadManager", "ad is not native or placement ad when start download");
            return -1;
        }
        if (this.f.a(context, iAd, true)) {
            return !b(iAd.getAppInfo()) ? -1 : 0;
        }
        hw.b("PPSAppDownloadManager", "download has not permission, please add white list");
        return -2;
    }

    private boolean a(IAd iAd) {
        return (iAd == null || iAd.getAppInfo() == null || !"11".equals(iAd.getAppInfo().z())) ? false : true;
    }

    private boolean a(AppInfo appInfo) {
        if (appInfo == null) {
            return false;
        }
        String strB = appInfo.b(this.f18585c);
        return (TextUtils.isEmpty(strB) || TextUtils.isEmpty(appInfo.getPackageName()) || !strB.equals("6")) ? false : true;
    }

    private void a(IAd iAd, AppDownloadTask appDownloadTask) {
        RewardVerifyConfig rewardVerifyConfig = iAd.getRewardVerifyConfig();
        if (rewardVerifyConfig != null) {
            appDownloadTask.g(rewardVerifyConfig.getData());
            appDownloadTask.h(rewardVerifyConfig.getUserId());
            ContentRecord contentRecordS = appDownloadTask.S();
            if (contentRecordS != null) {
                contentRecordS.G(rewardVerifyConfig.getData());
                contentRecordS.H(rewardVerifyConfig.getUserId());
            }
        }
        appDownloadTask.a(this.f18585c);
        appDownloadTask.b(this.f18585c);
        appDownloadTask.c(Integer.valueOf(this.f18584b));
        appDownloadTask.m(iAd.getContentId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppStatusV1 appStatusV1, int i, AppInfo appInfo) {
        if (this.e != null) {
            hw.b("PPSAppDownloadManager", "task status:" + appStatusV1 + ", code:" + i);
            this.e.onNewStatusChanged(appStatusV1, i, appInfo);
        }
    }

    private void a(Context context, rc rcVar, AppInfo appInfo) {
        if (rcVar == null || appInfo == null) {
            return;
        }
        String str = a(appInfo) ? ClickDestination.AGMINIMARKET : "download";
        if ("11".equals(appInfo.z())) {
            str = "restore";
        }
        MaterialClickInfo materialClickInfo = new MaterialClickInfo();
        materialClickInfo.h(1);
        com.huawei.openalliance.ad.processor.eventbeans.b.a aVar = new com.huawei.openalliance.ad.processor.eventbeans.b.a();
        aVar.b(str).a((Integer) 6).a(materialClickInfo).d(com.huawei.openalliance.ad.utils.b.a(context));
        rcVar.a(aVar.a());
    }

    private void a(Context context, IAd iAd, AppDownloadTask appDownloadTask) {
        if (context == null || appDownloadTask == null || iAd == null) {
            return;
        }
        rc rcVarC = appDownloadTask.C();
        if (rcVarC != null) {
            ContentRecord contentRecordA = rcVarC.a();
            if (contentRecordA != null) {
                contentRecordA.c(iAd.getShowId());
            }
        } else {
            appDownloadTask.a(l(context, iAd));
        }
        appDownloadTask.n(iAd.getShowId());
    }

    public static void a(Context context, final AppInfo appInfo) {
        if (appInfo == null) {
            hw.b("PPSAppDownloadManager", "appInfo is empty.");
        } else {
            com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.download.app.m.6
                @Override // java.lang.Runnable
                public void run() {
                    d dVarA = d.a();
                    if (dVarA != null) {
                        dVarA.onAppOpen(appInfo);
                    }
                }
            });
        }
    }

    private AppDownloadTask a(IAd iAd, pc pcVar) {
        AppInfo appInfo = iAd.getAppInfo();
        AppDownloadTask appDownloadTaskA = new AppDownloadTask.a().a(true).a(appInfo).a(this.f18583a.e(appInfo)).b(this.f18583a.f(appInfo)).a(pcVar).a();
        if (appDownloadTaskA != null) {
            appDownloadTaskA.a(this.f18585c);
            appDownloadTaskA.c(Integer.valueOf(this.f18584b));
            ContentRecord contentRecordA = pcVar.a();
            appDownloadTaskA.m(iAd.getContentId());
            if (contentRecordA != null) {
                appDownloadTaskA.l(contentRecordA.aa());
                appDownloadTaskA.k(contentRecordA.n());
                appDownloadTaskA.n(iAd.getShowId());
            }
        }
        return appDownloadTaskA;
    }

    private long a(Context context, ContentRecord contentRecord, AppInfo appInfo) {
        if (appInfo == null) {
            return 0L;
        }
        AppDownloadTask appDownloadTaskB = b(context, contentRecord, appInfo);
        long fileSize = appInfo.getFileSize();
        if (appDownloadTaskB != null) {
            long fileSize2 = appInfo.getFileSize() - appDownloadTaskB.g();
            if (fileSize2 > 0) {
                return fileSize2;
            }
        }
        return fileSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(Context context, js jsVar, IAd iAd, boolean z) {
        return !cb.c(context) ? b(context, jsVar, iAd, z) : c(context, jsVar, iAd, z);
    }

    public m() {
        e eVarH = e.h();
        this.f18583a = eVarH;
        this.e = eVarH.i();
    }
}
