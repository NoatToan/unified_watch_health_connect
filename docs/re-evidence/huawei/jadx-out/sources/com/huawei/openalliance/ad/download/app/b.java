package com.huawei.openalliance.ad.download.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.Toast;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.activity.PPSFullScreenNotifyActivity;
import com.huawei.openalliance.ad.activity.PPSInstallAuthorActivity;
import com.huawei.openalliance.ad.beans.inner.DownloadBlockInfo;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.download.DownloadTask;
import com.huawei.openalliance.ad.download.app.interfaces.AutoOpenListener;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.listeners.AppDownloadListener;
import com.huawei.openalliance.ad.inter.listeners.AppDownloadListenerV1;
import com.huawei.openalliance.ad.ln;
import com.huawei.openalliance.ad.lt;
import com.huawei.openalliance.ad.nb;
import com.huawei.openalliance.ad.pa;
import com.huawei.openalliance.ad.pe;
import com.huawei.openalliance.ad.rc;
import com.huawei.openalliance.ad.utils.ai;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bf;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.bu;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.dq;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes12.dex */
public class b implements com.huawei.openalliance.ad.download.a<AppDownloadTask>, i.c {
    private static Map<DownloadTask.b, Integer> k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f18490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private pe f18491b;
    private AppDownloadListener d;
    private AppDownloadListenerV1 f;
    private long g;
    private AutoOpenListener h;
    private a i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Set<com.huawei.openalliance.ad.download.l>> f18492c = new ConcurrentHashMap();
    private String e = Constants.TIMEOUT_TASK_ID + hashCode();
    private BroadcastReceiver j = new BroadcastReceiver() { // from class: com.huawei.openalliance.ad.download.app.b.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            StringBuilder sb;
            if (intent == null) {
                return;
            }
            try {
                String action = intent.getAction();
                hw.b("AppDownloadDelegate", "itRe action: %s", action);
                String dataString = intent.getDataString();
                if (TextUtils.isEmpty(dataString)) {
                    hw.c("AppDownloadDelegate", "itRe dataString is empty, " + action);
                } else {
                    final String strSubstring = dataString.substring(8);
                    b.this.a(action, strSubstring);
                    if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
                        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.download.app.b.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                b.this.p(e.h().a(strSubstring));
                            }
                        });
                    }
                }
            } catch (IllegalStateException e) {
                e = e;
                sb = new StringBuilder("itRe:");
                sb.append(e.getClass().getSimpleName());
                hw.c("AppDownloadDelegate", sb.toString());
            } catch (Exception e2) {
                e = e2;
                sb = new StringBuilder("itRe:");
                sb.append(e.getClass().getSimpleName());
                hw.c("AppDownloadDelegate", sb.toString());
            }
        }
    };

    @Override // com.huawei.openalliance.ad.download.app.i.c
    public void l(AppDownloadTask appDownloadTask) {
        if (appDownloadTask == null) {
            return;
        }
        n(appDownloadTask);
        onDownloadProgress(appDownloadTask);
    }

    @Override // com.huawei.openalliance.ad.download.app.i.c
    public void k(AppDownloadTask appDownloadTask) {
        if (appDownloadTask == null || appDownloadTask.i() != com.huawei.openalliance.ad.download.e.INSTALLED) {
            return;
        }
        n(appDownloadTask);
        p(appDownloadTask);
    }

    @Override // com.huawei.openalliance.ad.download.app.i.c
    public void j(AppDownloadTask appDownloadTask) {
        if (appDownloadTask != null) {
            if (appDownloadTask.i() == com.huawei.openalliance.ad.download.e.INSTALLING || appDownloadTask.i() == com.huawei.openalliance.ad.download.e.DOWNLOADING) {
                AppStatus appStatus = appDownloadTask.i() == com.huawei.openalliance.ad.download.e.INSTALLING ? AppStatus.INSTALLING : AppStatus.DOWNLOADING;
                AppStatusV1 appStatusV1 = appDownloadTask.i() == com.huawei.openalliance.ad.download.e.INSTALLING ? AppStatusV1.START_INSTALL : AppStatusV1.START_DOWNLOAD;
                n(appDownloadTask);
                if (appStatus == AppStatus.DOWNLOADING) {
                    onDownloadProgress(appDownloadTask);
                }
                a(appStatus, appDownloadTask.B());
                a(appStatusV1, 1000, appDownloadTask.B());
            }
        }
    }

    public boolean i(AppDownloadTask appDownloadTask) {
        return e.h().d(appDownloadTask);
    }

    @Override // com.huawei.openalliance.ad.download.a
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onDownloadFail(final AppDownloadTask appDownloadTask) {
        Runnable runnable;
        rc rcVarC = appDownloadTask.C();
        if (rcVarC != null) {
            DownloadTask.b bVarJ = appDownloadTask.j();
            if (bVarJ == null) {
                bVarJ = DownloadTask.b.NONE;
            }
            rcVarC.a(appDownloadTask.F(), appDownloadTask.E(), bVarJ.a(), appDownloadTask.x(), appDownloadTask.h().a(), appDownloadTask.P(), appDownloadTask.Q(), appDownloadTask.G());
        }
        if (i(appDownloadTask)) {
            return;
        }
        n(appDownloadTask);
        if (appDownloadTask.j() != DownloadTask.b.NO_SPACE) {
            if (appDownloadTask.j() == DownloadTask.b.FILE_SIZE_ERROR || appDownloadTask.j() == DownloadTask.b.FILE_SHA256_ERROR) {
                runnable = new Runnable() { // from class: com.huawei.openalliance.ad.download.app.b.7
                    @Override // java.lang.Runnable
                    public void run() {
                        Toast.makeText(b.this.f18490a, b.this.f18490a.getString(R.string.hiad_download_failed_toast_content, appDownloadTask.B().getAppName()), 0).show();
                    }
                };
            }
            a(AppStatus.DOWNLOADFAILED, appDownloadTask.B());
            a(AppStatusV1.DOWNLOAD_FAILED, a(appDownloadTask.j()), appDownloadTask.B());
        }
        runnable = new Runnable() { // from class: com.huawei.openalliance.ad.download.app.b.6
            @Override // java.lang.Runnable
            public void run() {
                Toast.makeText(b.this.f18490a, R.string.hiad_download_no_space, 0).show();
            }
        };
        dq.a(runnable);
        a(AppStatus.DOWNLOADFAILED, appDownloadTask.B());
        a(AppStatusV1.DOWNLOAD_FAILED, a(appDownloadTask.j()), appDownloadTask.B());
    }

    @Override // com.huawei.openalliance.ad.download.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void b(final AppDownloadTask appDownloadTask) {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.download.app.b.5
            @Override // java.lang.Runnable
            public void run() {
                Toast.makeText(b.this.f18490a, b.this.f18490a.getString(R.string.hiad_download_retry_toast_content, appDownloadTask.B().getAppName()), 0).show();
            }
        });
    }

    public void f(AppDownloadTask appDownloadTask) {
        com.huawei.openalliance.ad.download.e eVar;
        String str;
        hw.a("AppDownloadDelegate", "onAppStartInstall start");
        try {
            rc rcVarC = appDownloadTask.C();
            if (rcVarC != null) {
                ContentRecord contentRecordA = rcVarC.a();
                if (contentRecordA == null) {
                    str = "contentRecord is null! continue install.";
                } else if (bf.a(appDownloadTask, this.f18490a)) {
                    if (dk.o(this.f18490a)) {
                        hw.b("AppDownloadDelegate", "start InstallAuthorActivity!");
                        a(contentRecordA);
                        if (contentRecordA.ag().E() == 1) {
                            eVar = com.huawei.openalliance.ad.download.e.DOWNLOADED;
                            appDownloadTask.a(eVar);
                            n(appDownloadTask);
                            return;
                        }
                    } else if (pa.D(contentRecordA.X())) {
                        hw.b("AppDownloadDelegate", "app is background, stop install!");
                        eVar = com.huawei.openalliance.ad.download.e.DOWNLOADED;
                        appDownloadTask.a(eVar);
                        n(appDownloadTask);
                        return;
                    }
                }
                o(appDownloadTask);
            }
            str = "eventProcessor is null! continue install.";
            hw.b("AppDownloadDelegate", str);
            o(appDownloadTask);
        } catch (Throwable th) {
            hw.c("AppDownloadDelegate", "onAppStartInstall err: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.download.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onDownloadSuccess(AppDownloadTask appDownloadTask) {
        rc rcVarC = appDownloadTask.C();
        this.g = fp.b(this.f18490a).f();
        if (rcVarC != null) {
            rcVarC.b(appDownloadTask.F(), appDownloadTask.E(), appDownloadTask.x(), appDownloadTask.h().a(), appDownloadTask.P(), appDownloadTask.Q(), appDownloadTask.G());
        }
        a();
        a(AppStatus.DOWNLOADED, appDownloadTask.B());
        a(AppStatusV1.DOWNLOAD_SUCCESS, 1000, appDownloadTask.B());
        f(appDownloadTask);
    }

    @Override // com.huawei.openalliance.ad.download.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onDownloadProgress(AppDownloadTask appDownloadTask) {
        m(appDownloadTask);
        AppDownloadListener appDownloadListener = this.d;
        if (appDownloadListener != null) {
            appDownloadListener.onDownloadProgress(appDownloadTask.B(), appDownloadTask.l());
        } else {
            hw.b("AppDownloadDelegate", "progress listener empty");
        }
    }

    @Override // com.huawei.openalliance.ad.download.a
    public void c(AppDownloadTask appDownloadTask, boolean z) {
        AppStatusV1 appStatusV1;
        rc rcVarC;
        if (z && (rcVarC = appDownloadTask.C()) != null) {
            rcVarC.b(appDownloadTask.F(), appDownloadTask.E(), appDownloadTask.h().a(), appDownloadTask.P(), appDownloadTask.Q(), appDownloadTask.G());
        }
        int i = 1000;
        if (z) {
            appStatusV1 = AppStatusV1.USER_RESUME;
        } else {
            i = (appDownloadTask.p() == DownloadTask.c.WAITING_WIFI_DOWNLOAD || appDownloadTask.p() == DownloadTask.c.NETWORK_CHANGED) ? 1017 : 1000;
            appStatusV1 = AppStatusV1.RESUME;
        }
        a(appStatusV1, i, appDownloadTask.B());
        appDownloadTask.a(DownloadTask.c.NONE);
        n(appDownloadTask);
        a(AppStatus.RESUME, appDownloadTask.B());
    }

    @Override // com.huawei.openalliance.ad.download.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onDownloadStart(AppDownloadTask appDownloadTask) {
        rc rcVarC = appDownloadTask.C();
        if (rcVarC != null && appDownloadTask.g() <= 0) {
            rcVarC.a(appDownloadTask.F(), appDownloadTask.E(), appDownloadTask.h().a(), appDownloadTask.P(), appDownloadTask.Q(), appDownloadTask.G());
        }
        n(appDownloadTask);
        a(AppStatus.DOWNLOADING, appDownloadTask.B());
        if (appDownloadTask.l() > 0 || appDownloadTask.g() > 0) {
            return;
        }
        a(AppStatusV1.PRE_CHECK_SUCCESS, 1000, appDownloadTask.B());
        a(AppStatusV1.START_DOWNLOAD, 1000, appDownloadTask.B());
    }

    public void b(String str, com.huawei.openalliance.ad.download.l lVar) {
        synchronized (this) {
            Set<com.huawei.openalliance.ad.download.l> set = this.f18492c.get(str);
            if (set != null && set.size() > 0) {
                set.remove(lVar);
                if (set.size() <= 0) {
                    this.f18492c.remove(str);
                }
            }
        }
    }

    @Override // com.huawei.openalliance.ad.download.a
    public void b(AppDownloadTask appDownloadTask, boolean z) {
        AppStatusV1 appStatusV1;
        int i;
        rc rcVarC = appDownloadTask.C();
        DownloadTask.c cVarP = appDownloadTask.p();
        if (rcVarC != null) {
            DownloadBlockInfo downloadBlockInfoX = appDownloadTask.x();
            if (downloadBlockInfoX != null) {
                downloadBlockInfoX.b(as.c());
                appDownloadTask.y();
            }
            rcVarC.a(appDownloadTask);
        }
        n(appDownloadTask);
        a(AppStatus.PAUSE, appDownloadTask.B());
        if (z) {
            appStatusV1 = AppStatusV1.USER_PAUSE;
            i = 1000;
        } else if (cVarP == null || DownloadTask.c.NETWORK_CHANGED != cVarP) {
            appStatusV1 = AppStatusV1.PAUSE;
            i = 1016;
        } else {
            appStatusV1 = AppStatusV1.PAUSE;
            i = 1015;
        }
        a(appStatusV1, i, appDownloadTask.B());
    }

    @Override // com.huawei.openalliance.ad.download.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(AppDownloadTask appDownloadTask) {
        n(appDownloadTask);
        a(AppStatus.WAITING_FOR_WIFI, appDownloadTask.B());
        a(AppStatusV1.WAITING_FOR_WIFI, 1000, appDownloadTask.B());
    }

    public void a(String str, com.huawei.openalliance.ad.download.l lVar) {
        synchronized (this) {
            Set<com.huawei.openalliance.ad.download.l> copyOnWriteArraySet = this.f18492c.get(str);
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = new CopyOnWriteArraySet<>();
                this.f18492c.put(str, copyOnWriteArraySet);
            }
            copyOnWriteArraySet.add(lVar);
        }
    }

    public void a(AppDownloadListenerV1 appDownloadListenerV1) {
        this.f = appDownloadListenerV1;
    }

    public void a(AppDownloadListener appDownloadListener) {
        this.d = appDownloadListener;
    }

    public void a(AutoOpenListener autoOpenListener) {
        this.h = autoOpenListener;
    }

    @Override // com.huawei.openalliance.ad.download.a
    public void a(AppDownloadTask appDownloadTask, boolean z) {
        rc rcVarC;
        boolean z2 = z && appDownloadTask.i() != com.huawei.openalliance.ad.download.e.DOWNLOADED;
        if (z2 && (rcVarC = appDownloadTask.C()) != null) {
            DownloadBlockInfo downloadBlockInfoX = appDownloadTask.x();
            if (downloadBlockInfoX != null) {
                downloadBlockInfoX.b(as.c());
                appDownloadTask.y();
            }
            rcVarC.a(appDownloadTask.F(), appDownloadTask.E(), downloadBlockInfoX, appDownloadTask.h().a(), appDownloadTask.P(), appDownloadTask.Q(), appDownloadTask.G());
        }
        appDownloadTask.b(0);
        appDownloadTask.b(0L);
        appDownloadTask.c(0L);
        appDownloadTask.a(com.huawei.openalliance.ad.download.e.FAILED);
        if (z2) {
            a(AppStatus.DOWNLOADFAILED, appDownloadTask.B());
            a(AppStatusV1.CANCEL_DOWNLOAD, 1000, appDownloadTask.B());
        }
        n(appDownloadTask);
    }

    @Override // com.huawei.openalliance.ad.download.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onDownloadWaiting(AppDownloadTask appDownloadTask) {
        n(appDownloadTask);
        a(AppStatus.WAITING, appDownloadTask.B());
        a(AppStatusV1.WAITING, 1000, appDownloadTask.B());
    }

    public void a(Context context, ContentRecord contentRecord, AppDownloadTask appDownloadTask) {
        try {
            if (a(contentRecord, appDownloadTask)) {
                b(context, contentRecord, appDownloadTask);
            } else {
                hw.b("AppDownloadDelegate", "not show InstalledNotifyActivity");
            }
        } catch (Throwable th) {
            hw.c("AppDownloadDelegate", "start installed notify activity error: %s", th.getClass().getSimpleName());
        }
    }

    public void a() {
        hw.b("AppDownloadDelegate", "registerAppInstReceiver");
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        as.a(this.f18490a, this.j, intentFilter);
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(AppDownloadTask appDownloadTask) {
        if (appDownloadTask == null || appDownloadTask.L() != AppDownloadTask.b.DOWN_LOAD_MODE_FROM_SELF) {
            hw.b("AppDownloadDelegate", "task is empty");
            return;
        }
        appDownloadTask.a(com.huawei.openalliance.ad.download.e.INSTALLED);
        final rc rcVarC = appDownloadTask.C();
        if (rcVarC != null) {
            rcVarC.a(Integer.valueOf(appDownloadTask.D()), appDownloadTask.F(), appDownloadTask.P(), appDownloadTask.Q(), appDownloadTask.G());
            new com.huawei.openalliance.ad.analysis.c(this.f18490a).a(rcVarC.a(), (String) null, appDownloadTask);
        }
        final AppInfo appInfoB = appDownloadTask.B();
        if (appInfoB == null) {
            return;
        }
        String packageName = appInfoB.getPackageName();
        e.h().c(appDownloadTask);
        final String strE = appDownloadTask.E();
        a(packageName, strE, appInfoB);
        a(rcVarC, appInfoB);
        if (!com.huawei.openalliance.ad.utils.l.a(this.f18490a, packageName, appDownloadTask)) {
            hw.b("AppDownloadDelegate", "onAppInstalled, popNotify: %s", Integer.valueOf(appInfoB.o()));
            hw.b("AppDownloadDelegate", "onAppInstalled, fullScrnNotify: %s", Integer.valueOf(appInfoB.p()));
            if (appInfoB.o() == 1 && appDownloadTask.U()) {
                a(appDownloadTask, appInfoB);
            }
            if (rcVarC != null && appInfoB.p() != 0 && cc.b(this.f18490a)) {
                a(this.f18490a, rcVarC.a(), appDownloadTask);
            }
        } else {
            hw.b("AppDownloadDelegate", "auto open app");
            a(packageName, appDownloadTask, appInfoB);
        }
        if (rcVarC != null) {
            com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.download.app.b.8
                @Override // java.lang.Runnable
                public void run() {
                    new com.huawei.openalliance.ad.analysis.c(b.this.f18490a).a(rcVarC.a(), appInfoB.g(), strE);
                }
            });
        }
        a(AppStatus.INSTALLED, appDownloadTask.B());
        a(AppStatusV1.INSTALL_SUCCESS, 1000, appDownloadTask.B());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(final AppDownloadTask appDownloadTask) {
        hw.a("AppDownloadDelegate", "installApp start");
        a(AppStatusV1.START_INSTALL, 1000, appDownloadTask.B());
        this.f18491b.a(appDownloadTask.B(), appDownloadTask, new pe.a() { // from class: com.huawei.openalliance.ad.download.app.b.4
            @Override // com.huawei.openalliance.ad.pe.a
            public void b() {
                hw.c("AppDownloadDelegate", "onSystemInstallStart");
                appDownloadTask.a(com.huawei.openalliance.ad.download.e.DOWNLOADED);
                b.this.n(appDownloadTask);
                b.this.a(AppStatus.INSTALL, appDownloadTask.B());
            }

            @Override // com.huawei.openalliance.ad.pe.a
            public void a(int i) {
                b bVar;
                AppStatus appStatus;
                hw.c("AppDownloadDelegate", "install apk failed, reason: %s", Integer.valueOf(i));
                b.this.a(AppStatusV1.INSTALL_FAILED, -1000, appDownloadTask.B());
                if (i != 1 && b.this.i(appDownloadTask)) {
                    return;
                }
                appDownloadTask.a(com.huawei.openalliance.ad.download.e.DOWNLOADED);
                if (b.this.d != null) {
                    if (ai.b(appDownloadTask.d())) {
                        bVar = b.this;
                        appStatus = AppStatus.INSTALL;
                    } else {
                        appDownloadTask.b(0);
                        appDownloadTask.b(0L);
                        appDownloadTask.c(0L);
                        appDownloadTask.a(com.huawei.openalliance.ad.download.e.FAILED);
                        bVar = b.this;
                        appStatus = AppStatus.DOWNLOAD;
                    }
                    bVar.a(appStatus, appDownloadTask.B());
                }
                b.this.n(appDownloadTask);
            }

            @Override // com.huawei.openalliance.ad.pe.a
            public void a() {
                hw.c("AppDownloadDelegate", "onSilentInstallStart");
                appDownloadTask.a(com.huawei.openalliance.ad.download.e.INSTALLING);
                b.this.n(appDownloadTask);
                b.this.a(AppStatus.INSTALLING, appDownloadTask.B());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(AppDownloadTask appDownloadTask) {
        Set<com.huawei.openalliance.ad.download.l> setA = a(appDownloadTask.B());
        if (setA == null || setA.size() <= 0) {
            return;
        }
        for (com.huawei.openalliance.ad.download.l lVar : setA) {
            if (lVar != null) {
                lVar.b(appDownloadTask);
            }
        }
    }

    private void m(AppDownloadTask appDownloadTask) {
        Set<com.huawei.openalliance.ad.download.l> setA = a(appDownloadTask.B());
        if (setA == null || setA.size() <= 0) {
            return;
        }
        for (com.huawei.openalliance.ad.download.l lVar : setA) {
            if (lVar != null) {
                lVar.a(appDownloadTask);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        hw.b("AppDownloadDelegate", "unRegisterAppInstReceiver");
        this.f18490a.unregisterReceiver(this.j);
    }

    private void c() {
        bu.a(this.e);
        bu.a(new RunnableC0203b(this), this.e, this.g);
    }

    private void b(final Context context, final String str, final AppDownloadTask appDownloadTask) {
        if (context == null || dg.b(str) || appDownloadTask == null) {
            hw.b("AppDownloadDelegate", "param invalid");
            return;
        }
        if (appDownloadTask.B() == null || dg.b(appDownloadTask.B().getAppName())) {
            hw.b("AppDownloadDelegate", "no AppName, directly open app");
            a(context, str, appDownloadTask);
        } else {
            final String string = context.getString(R.string.hiad_auto_open_app_prompt_msg, appDownloadTask.B().getAppName());
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.download.app.b.2
                @Override // java.lang.Runnable
                public void run() {
                    Toast.makeText(context, string, 0).show();
                    dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.download.app.b.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (!dk.o(context)) {
                                hw.b("AppDownloadDelegate", "after hint, Current in background.");
                            } else {
                                hw.b("AppDownloadDelegate", "after hint, Current in foreground, auto open app.");
                                b.this.a(context, str, appDownloadTask);
                            }
                        }
                    }, 2000L);
                }
            });
        }
    }

    private void b(Context context, ContentRecord contentRecord, AppDownloadTask appDownloadTask) {
        Intent intent = new Intent(context, (Class<?>) PPSFullScreenNotifyActivity.class);
        intent.setFlags(HiUserInfo.DATA_CLOUD);
        intent.putExtra(Constants.CONTENT_KEY, bk.b(contentRecord));
        intent.putExtra("unique_id", (appDownloadTask == null || appDownloadTask.B() == null || appDownloadTask.B().getUniqueId() == null) ? "" : appDownloadTask.B().getUniqueId());
        if (appDownloadTask != null) {
            intent.putExtra("download_source", appDownloadTask.F());
        }
        intent.setClipData(Constants.CLIP_DATA);
        context.startActivity(intent);
    }

    private void b() {
        this.i = new a();
        as.a(this.f18490a, this.i, new IntentFilter("com.huawei.hms.pps.action.PPS_APP_OPEN"), Constants.PERMISSION_PPS_DOWNLOAD, (Handler) null);
    }

    private boolean a(ContentRecord contentRecord, AppDownloadTask appDownloadTask) {
        String str;
        if (appDownloadTask != null && appDownloadTask.D() == 2) {
            hw.b("AppDownloadDelegate", "not show fullScreen dialog: install source is 2");
            return false;
        }
        com.huawei.openalliance.ad.analysis.c cVar = new com.huawei.openalliance.ad.analysis.c(this.f18490a);
        if (!HiAd.getInstance(this.f18490a).isAppInstalledNotify()) {
            hw.b("AppDownloadDelegate", "not show fullScreen dialog: media not allow show dialog");
            cVar.a(contentRecord, "6", (com.huawei.openalliance.ad.analysis.a) null);
            return false;
        }
        if (dk.o(this.f18490a)) {
            str = "show fullScreen dialog: app status is Foreground and media allow show dialog";
        } else {
            if (HiAd.a(this.f18490a).l() == null || !HiAd.a(this.f18490a).l().isForeground()) {
                hw.b("AppDownloadDelegate", "not show fullScreen dialog: app status is not Foreground and Callback is false");
                cVar.a(contentRecord, "7", (com.huawei.openalliance.ad.analysis.a) null);
                return false;
            }
            str = "show fullScreen dialog: get the app status is Foreground Through Callback";
        }
        hw.b("AppDownloadDelegate", str);
        return true;
    }

    private void a(final String str, String str2, final AppInfo appInfo) {
        if (appInfo == null || TextUtils.isEmpty(appInfo.g()) || !"3".equalsIgnoreCase(str2)) {
            return;
        }
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.download.app.b.10
            @Override // java.lang.Runnable
            public void run() {
                nb.a(b.this.f18490a).a(str, appInfo.g(), appInfo.h());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        Set<com.huawei.openalliance.ad.download.l> setA = a(str2);
        if (setA != null && setA.size() > 0) {
            if ("android.intent.action.PACKAGE_ADDED".equals(str)) {
                for (com.huawei.openalliance.ad.download.l lVar : setA) {
                    if (lVar != null) {
                        lVar.a(str2);
                    }
                }
            } else if ("android.intent.action.PACKAGE_REMOVED".equals(str)) {
                for (com.huawei.openalliance.ad.download.l lVar2 : setA) {
                    if (lVar2 != null) {
                        lVar2.b(str2);
                    }
                }
            }
        }
        if ("android.intent.action.PACKAGE_REMOVED".equals(str)) {
            if (this.d == null) {
                hw.b("AppDownloadDelegate", "listener empty");
                return;
            }
            AppInfo appInfo = new AppInfo();
            appInfo.a(str2);
            this.d.onStatusChanged(AppStatus.DOWNLOAD, appInfo);
        }
    }

    private void a(String str, AppDownloadTask appDownloadTask, AppInfo appInfo) {
        Context context = this.f18490a;
        if (context == null || TextUtils.isEmpty(context.getPackageName()) || !Constants.HW_BROWSER_PACKAGE.equals(this.f18490a.getPackageName())) {
            hw.b("AppDownloadDelegate", "auto open app from other");
        } else {
            hw.b("AppDownloadDelegate", "auto open app from browser");
            AutoOpenListener autoOpenListener = this.h;
            if (autoOpenListener != null && !autoOpenListener.isNeedAutoOpen(appInfo)) {
                return;
            }
        }
        b(this.f18490a, str, appDownloadTask);
    }

    private void a(rc rcVar, AppInfo appInfo) {
        if (appInfo == null || TextUtils.isEmpty(appInfo.getPackageName()) || rcVar == null || fp.b(this.f18490a).bT() != 1) {
            return;
        }
        dq.a(new AnonymousClass9(appInfo, rcVar), 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppStatusV1 appStatusV1, int i, AppInfo appInfo) {
        if (this.f == null) {
            hw.b("AppDownloadDelegate", "listener v1 empty");
            return;
        }
        hw.b("AppDownloadDelegate", "task status:" + appStatusV1 + ", code:" + i);
        this.f.onNewStatusChanged(appStatusV1, i, appInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppStatus appStatus, AppInfo appInfo) {
        if (this.d == null) {
            hw.b("AppDownloadDelegate", "app status empty");
            return;
        }
        hw.b("AppDownloadDelegate", "task status:" + appStatus);
        this.d.onStatusChanged(appStatus, appInfo);
    }

    private void a(AppDownloadTask appDownloadTask, AppInfo appInfo) {
        if (TextUtils.isEmpty(appInfo.f())) {
            hw.b("AppDownloadDelegate", "popUpAfterInstallText is blank");
        } else {
            new ln(this.f18490a, appDownloadTask).b();
        }
    }

    private void a(ContentRecord contentRecord) {
        hw.b("AppDownloadDelegate", "startInstallAuthorActivity");
        try {
            Intent intent = new Intent(this.f18490a, (Class<?>) PPSInstallAuthorActivity.class);
            intent.setFlags(HiUserInfo.DATA_CLOUD);
            intent.putExtra(Constants.CONTENT_KEY, bk.b(contentRecord));
            PPSInstallAuthorActivity.a(new com.huawei.openalliance.ad.views.interfaces.g() { // from class: com.huawei.openalliance.ad.download.app.b.3
                @Override // com.huawei.openalliance.ad.views.interfaces.g
                public void a(AppDownloadTask appDownloadTask) {
                    if (appDownloadTask != null) {
                        b.this.o(appDownloadTask);
                    }
                }
            });
            intent.setClipData(Constants.CLIP_DATA);
            this.f18490a.startActivity(intent);
        } catch (Throwable th) {
            hw.b("AppDownloadDelegate", "startInstallAuthorActivity failed %s", th.getClass().getSimpleName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, AppDownloadTask appDownloadTask) {
        f fVar = new f();
        hw.b("AppDownloadDelegate", "sdk auto open app package sdk target %s.", str);
        boolean zA = fVar.a(context, appDownloadTask.B(), appDownloadTask.C(), appDownloadTask.F(), false);
        AppInfo appInfoB = appDownloadTask.B();
        if (appInfoB == null || appInfoB.c() != 1) {
            return;
        }
        com.huawei.openalliance.ad.analysis.e eVar = new com.huawei.openalliance.ad.analysis.e(2);
        eVar.a(appInfoB);
        eVar.a(appDownloadTask);
        eVar.a(appDownloadTask.S());
        eVar.a(zA);
        new com.huawei.openalliance.ad.analysis.c(context).a(eVar);
    }

    private Set<com.huawei.openalliance.ad.download.l> a(String str) {
        Set<com.huawei.openalliance.ad.download.l> set;
        synchronized (this) {
            set = this.f18492c.get(str);
        }
        return set;
    }

    static class a extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            hw.b("AppDownloadDelegate", "onReceive.");
            if (intent == null) {
                return;
            }
            try {
                if ("com.huawei.hms.pps.action.PPS_APP_OPEN".equals(intent.getAction())) {
                    AppInfo appInfo = (AppInfo) bk.b(intent.getStringExtra("appInfo"), AppInfo.class, new Class[0]);
                    if (appInfo == null) {
                        hw.b("AppDownloadDelegate", "appInfo is null");
                        return;
                    }
                    d dVarA = d.a();
                    if (dVarA != null) {
                        dVarA.onAppOpen(appInfo);
                    }
                }
            } catch (Throwable th) {
                hw.c("AppDownloadDelegate", "exception: %s", th.getClass().getSimpleName());
            }
        }

        private a() {
        }
    }

    private Set<com.huawei.openalliance.ad.download.l> a(AppInfo appInfo) {
        synchronized (this) {
            if (appInfo != null) {
                if (!TextUtils.isEmpty(appInfo.getPackageName())) {
                    return a(appInfo.getPackageName());
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.huawei.openalliance.ad.download.app.b$9, reason: invalid class name */
    class AnonymousClass9 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AppInfo f18514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ rc f18515b;

        @Override // java.lang.Runnable
        public void run() {
            com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.download.app.b.9.1
                @Override // java.lang.Runnable
                public void run() {
                    nb.a(b.this.f18490a).a(AnonymousClass9.this.f18514a.getPackageName(), new nb.a() { // from class: com.huawei.openalliance.ad.download.app.b.9.1.1
                        @Override // com.huawei.openalliance.ad.nb.a
                        public void a(String str, String str2) {
                            new com.huawei.openalliance.ad.analysis.c(b.this.f18490a).a(AnonymousClass9.this.f18515b.a(), AnonymousClass9.this.f18514a.g(), str2, AnonymousClass9.this.f18514a.getPackageName());
                        }
                    });
                }
            });
        }

        AnonymousClass9(AppInfo appInfo, rc rcVar) {
            this.f18514a = appInfo;
            this.f18515b = rcVar;
        }
    }

    /* JADX INFO: renamed from: com.huawei.openalliance.ad.download.app.b$b, reason: collision with other inner class name */
    static class RunnableC0203b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<b> f18519a;

        @Override // java.lang.Runnable
        public void run() {
            b bVar = this.f18519a.get();
            if (bVar == null) {
                return;
            }
            bVar.d();
        }

        public RunnableC0203b(b bVar) {
            this.f18519a = new WeakReference<>(bVar);
        }
    }

    private int a(DownloadTask.b bVar) {
        Integer num = k.get(bVar);
        if (num == null) {
            return -1000;
        }
        return num.intValue();
    }

    public b(Context context) {
        String str;
        Context applicationContext = context.getApplicationContext();
        this.f18490a = applicationContext;
        try {
            this.f18491b = pe.a(applicationContext);
            lt.a(context).a();
            b();
        } catch (IllegalStateException unused) {
            str = "registerReceiver IllegalStateException";
            hw.c("AppDownloadDelegate", str);
        } catch (Exception unused2) {
            str = "registerReceiver Exception";
            hw.c("AppDownloadDelegate", str);
        }
    }

    static {
        HashMap map = new HashMap();
        k = map;
        map.put(DownloadTask.b.NO_SPACE, 1010);
        k.put(DownloadTask.b.CONN_FAILED, 1011);
        k.put(DownloadTask.b.FILE_SIZE_ERROR, 1012);
        k.put(DownloadTask.b.FILE_SHA256_ERROR, 1013);
        k.put(DownloadTask.b.MOBILE_NETWORK, 1014);
    }
}
