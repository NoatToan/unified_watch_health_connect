package com.huawei.openalliance.ad.download.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.download.DownloadTask;
import com.huawei.openalliance.ad.download.app.interfaces.AutoOpenListener;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.listeners.AppDownloadListener;
import com.huawei.openalliance.ad.inter.listeners.AppDownloadListenerV1;
import com.huawei.openalliance.ad.ti;
import com.huawei.openalliance.ad.utils.ai;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.cb;
import com.huawei.openalliance.ad.utils.dd;
import com.huawei.openalliance.ad.utils.dj;
import com.huawei.openalliance.ad.views.AppDownloadButton;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes12.dex */
public class e extends com.huawei.openalliance.ad.download.b<AppDownloadTask> {
    private static final byte[] f = new byte[0];
    private static e g;
    private a h;
    private AppDownloadListenerV1 i;
    private AutoOpenListener j;
    private b k;
    private BroadcastReceiver l;

    public void k() {
        com.huawei.openalliance.ad.download.ag.d.a(this.f18609a).d();
    }

    public void j() {
        com.huawei.openalliance.ad.download.ag.d.a(this.f18609a).c();
    }

    public AppDownloadListenerV1 i() {
        return this.i;
    }

    public String f(AppInfo appInfo) {
        if (TextUtils.isEmpty(this.f18610b)) {
            this.f18610b = (String) dj.b(new Callable<String>() { // from class: com.huawei.openalliance.ad.download.app.e.5
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public String call() {
                    return e.c(e.this.f18609a);
                }
            });
        }
        return this.f18610b + File.separator + "tmp" + File.separator + appInfo.getPackageName() + ".apk";
    }

    public String e(AppInfo appInfo) {
        if (TextUtils.isEmpty(this.f18610b)) {
            this.f18610b = (String) dj.b(new Callable<String>() { // from class: com.huawei.openalliance.ad.download.app.e.4
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public String call() {
                    return e.c(e.this.f18609a);
                }
            });
        }
        return this.f18610b + File.separator + appInfo.getPackageName() + ".apk";
    }

    public boolean d(AppDownloadTask appDownloadTask) {
        String strH = appDownloadTask.H();
        if (!g(appDownloadTask)) {
            return false;
        }
        a(strH, appDownloadTask);
        return c(appDownloadTask);
    }

    public AppDownloadTask d(final AppInfo appInfo) {
        if (!i(appInfo)) {
            if (g(appInfo)) {
                return null;
            }
            AppDownloadTask appDownloadTaskA = a(appInfo.getPackageName());
            return appDownloadTaskA == null ? (AppDownloadTask) dj.b(new Callable<AppDownloadTask>() { // from class: com.huawei.openalliance.ad.download.app.e.3
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public AppDownloadTask call() {
                    return e.this.j(appInfo);
                }
            }) : appDownloadTaskA;
        }
        AppDownloadTask appDownloadTaskB = com.huawei.openalliance.ad.download.ag.d.a(this.f18609a).b(appInfo);
        if (appDownloadTaskB == null && "11".equals(appInfo.getPriorInstallWay())) {
            appDownloadTaskB = a(appInfo.getPackageName());
        }
        if (appDownloadTaskB != null) {
            a(appInfo, appDownloadTaskB);
            appDownloadTaskB.a(appInfo);
        }
        return appDownloadTaskB;
    }

    public boolean c(AppDownloadTask appDownloadTask) {
        if (appDownloadTask == null) {
            return false;
        }
        if (!appDownloadTask.K()) {
            return a(appDownloadTask, false, true, true);
        }
        com.huawei.openalliance.ad.download.ag.d.a(this.f18609a).b(appDownloadTask);
        a(appDownloadTask, false, true, false);
        return true;
    }

    public String c(AppInfo appInfo) {
        AppDownloadTask appDownloadTaskD = d(appInfo);
        if (appInfo == null || appDownloadTaskD == null || appDownloadTaskD.B() == null) {
            return null;
        }
        return appDownloadTaskD.B().getUniqueId();
    }

    public boolean b(AppInfo appInfo) {
        return a(appInfo, true);
    }

    public void b(AppInfo appInfo, AppDownloadButton.OnResolutionRequiredListener onResolutionRequiredListener) {
        if (appInfo == null || TextUtils.isEmpty(appInfo.getPackageName()) || onResolutionRequiredListener == null) {
            return;
        }
        com.huawei.openalliance.ad.download.ag.d.a(this.f18609a).b(appInfo.getPackageName(), onResolutionRequiredListener);
    }

    public void b(AppInfo appInfo, com.huawei.openalliance.ad.download.l lVar) {
        if (appInfo != null) {
            com.huawei.openalliance.ad.download.ag.d.a(this.f18609a).b(appInfo.getPackageName(), lVar);
            this.k.b(appInfo.getPackageName(), lVar);
        }
        if (com.huawei.openalliance.ad.utils.l.a(appInfo)) {
            com.huawei.openalliance.ad.download.ag.e.a(this.f18609a).b(appInfo.J(), lVar);
        }
    }

    public void b(AppDownloadTask appDownloadTask) {
        if (appDownloadTask == null) {
            return;
        }
        if (appDownloadTask.K()) {
            com.huawei.openalliance.ad.download.ag.d.a(this.f18609a).b(appDownloadTask);
            return;
        }
        if (appDownloadTask.i() == com.huawei.openalliance.ad.download.e.INSTALLING || appDownloadTask.i() == com.huawei.openalliance.ad.download.e.DOWNLOADED) {
            hw.b("AppDownloadManager", " can not pause, status=" + appDownloadTask.i());
        } else {
            if (e(appDownloadTask)) {
                i.a().a(appDownloadTask);
            }
            a(appDownloadTask, DownloadTask.c.USER_CLICK);
        }
    }

    @Override // com.huawei.openalliance.ad.download.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AppDownloadTask a(String str) {
        DownloadTask downloadTaskA = super.a(str);
        return downloadTaskA instanceof AppDownloadTask ? (AppDownloadTask) downloadTaskA : com.huawei.openalliance.ad.download.ag.d.a(this.f18609a).a(str);
    }

    public boolean a(AppInfo appInfo) {
        return a(appInfo, false);
    }

    @Override // com.huawei.openalliance.ad.download.b
    public boolean a(AppDownloadTask appDownloadTask, boolean z) {
        if (appDownloadTask == null) {
            return false;
        }
        if (e(appDownloadTask)) {
            i.a().b(appDownloadTask);
            return true;
        }
        if (appDownloadTask.K()) {
            com.huawei.openalliance.ad.download.ag.d.a(this.f18609a).c(appDownloadTask);
            a(appDownloadTask, z, true, false);
            return true;
        }
        if (appDownloadTask.i() == com.huawei.openalliance.ad.download.e.INSTALLING) {
            hw.b("AppDownloadManager", appDownloadTask.B().getPackageName() + " is installing!");
            return false;
        }
        if (appDownloadTask.i() != com.huawei.openalliance.ad.download.e.DOWNLOADED || !ai.b(appDownloadTask.d())) {
            return super.a(appDownloadTask, z);
        }
        hw.b("AppDownloadManager", appDownloadTask.B().getPackageName() + " is downloaded!");
        f(appDownloadTask);
        return true;
    }

    @Override // com.huawei.openalliance.ad.download.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean c(AppDownloadTask appDownloadTask) {
        if (appDownloadTask == null) {
            hw.c("AppDownloadManager", "cannot add task, task is null");
            return false;
        }
        if (hw.a()) {
            hw.a("AppDownloadManager", "addTask, package:%s", appDownloadTask.n());
        }
        appDownloadTask.e(true);
        if (e(appDownloadTask)) {
            b(appDownloadTask);
            i.a().a(appDownloadTask, (i.b) null);
            return true;
        }
        if (appDownloadTask.K()) {
            com.huawei.openalliance.ad.download.ag.d.a(this.f18609a).a(appDownloadTask);
            a(appDownloadTask, false, true, false);
            return true;
        }
        if (appDownloadTask.I()) {
            AppInfo appInfoB = appDownloadTask.B();
            if (appInfoB != null && !TextUtils.isEmpty(appInfoB.t()) && h(appDownloadTask)) {
                return true;
            }
            hw.b("AppDownloadManager", "can not open Ag detail");
            return d(appDownloadTask);
        }
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.download.app.e.2
            @Override // java.lang.Runnable
            public void run() {
                e.this.m();
            }
        });
        if (g(appDownloadTask.B())) {
            return d(appDownloadTask);
        }
        if (appDownloadTask.i() == com.huawei.openalliance.ad.download.e.INSTALLING) {
            hw.b("AppDownloadManager", appDownloadTask.B().getPackageName() + " is installing.");
            return true;
        }
        if (appDownloadTask.i() != com.huawei.openalliance.ad.download.e.DOWNLOADED || !ai.b(appDownloadTask.d())) {
            return super.c(appDownloadTask);
        }
        hw.b("AppDownloadManager", appDownloadTask.B().getPackageName() + " is downloaded.");
        f(appDownloadTask);
        return true;
    }

    public void a(AppDownloadButton.OnResolutionRequiredListener onResolutionRequiredListener) {
        com.huawei.openalliance.ad.download.ag.d.a(this.f18609a).a(onResolutionRequiredListener);
    }

    public void a(AppDownloadListenerV1 appDownloadListenerV1) {
        this.i = appDownloadListenerV1;
        this.k.a(appDownloadListenerV1);
        com.huawei.openalliance.ad.download.ag.d.a(this.f18609a).a(appDownloadListenerV1);
    }

    public void a(AppDownloadListener appDownloadListener) {
        this.k.a(appDownloadListener);
        com.huawei.openalliance.ad.download.ag.d.a(this.f18609a).a(appDownloadListener);
    }

    public void a(AppInfo appInfo, AppDownloadButton.OnResolutionRequiredListener onResolutionRequiredListener) {
        if (appInfo == null || TextUtils.isEmpty(appInfo.getPackageName()) || onResolutionRequiredListener == null) {
            return;
        }
        com.huawei.openalliance.ad.download.ag.d.a(this.f18609a).a(appInfo.getPackageName(), onResolutionRequiredListener);
    }

    public void a(AppInfo appInfo, com.huawei.openalliance.ad.download.l lVar) {
        if (appInfo != null) {
            com.huawei.openalliance.ad.download.ag.d.a(this.f18609a).a(appInfo.getPackageName(), lVar);
        }
        if (!g(appInfo)) {
            this.k.a(appInfo.getPackageName(), lVar);
        }
        if (com.huawei.openalliance.ad.utils.l.a(appInfo)) {
            com.huawei.openalliance.ad.download.ag.e.a(this.f18609a).a(appInfo.J(), lVar);
        }
    }

    public void a(AutoOpenListener autoOpenListener) {
        this.j = autoOpenListener;
        this.k.a(autoOpenListener);
        com.huawei.openalliance.ad.download.ag.d.a(this.f18609a).a(this.j);
    }

    protected void a(DownloadTask.c cVar) {
        List<AppDownloadTask> listD = this.e.d();
        if (hw.a()) {
            hw.a("AppDownloadManager", "pauseAllTask.begin, task.size:%d", Integer.valueOf(listD.size()));
        }
        for (AppDownloadTask appDownloadTask : listD) {
            if (appDownloadTask.i() == com.huawei.openalliance.ad.download.e.INSTALLING || appDownloadTask.i() == com.huawei.openalliance.ad.download.e.DOWNLOADED) {
                hw.b("AppDownloadManager", " can not pause task, status=" + appDownloadTask.i());
            } else {
                a(appDownloadTask, cVar);
            }
        }
        if (hw.a()) {
            hw.a("AppDownloadManager", "pauseAllTask.end, task.size:%d", Integer.valueOf(listD.size()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        String str;
        try {
            String str2 = this.f18610b + File.separator + "tmp" + File.separator;
            String[] list = new File(str2).list();
            if (list != null && list.length > 0) {
                a(str2, list);
            }
        } catch (RuntimeException unused) {
            str = "deleteTimeoutFile RuntimeException";
            hw.c("AppDownloadManager", str);
        } catch (Exception unused2) {
            str = "deleteTimeoutFile exception";
            hw.c("AppDownloadManager", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        List<AppDownloadTask> listC = this.e.c();
        if (hw.a()) {
            hw.a("AppDownloadManager", "resumeAllTask, task.size:%d", Integer.valueOf(listC.size()));
        }
        if (listC.size() <= 0) {
            return;
        }
        a(listC);
    }

    private AppDownloadTask k(AppInfo appInfo) {
        return new AppDownloadTask.a().a(false).a(appInfo).a(e(appInfo)).b(f(appInfo)).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AppDownloadTask j(AppInfo appInfo) {
        AppDownloadTask appDownloadTaskK;
        boolean z;
        if (appInfo == null || (appDownloadTaskK = k(appInfo)) == null) {
            return null;
        }
        File file = new File(appDownloadTaskK.d());
        if (file.exists()) {
            z = false;
        } else {
            file = new File(appDownloadTaskK.e());
            if (!file.exists()) {
                return null;
            }
            z = true;
        }
        return a(appInfo, appDownloadTaskK, file, z);
    }

    private boolean i(AppInfo appInfo) {
        AppDownloadTask appDownloadTaskA;
        return (appInfo == null || (appDownloadTaskA = a(appInfo.getPackageName())) == null || !appDownloadTaskA.K()) ? false : true;
    }

    private static boolean h(AppInfo appInfo) {
        if (appInfo == null) {
            return true;
        }
        return appInfo.isCheckSha256() && TextUtils.isEmpty(appInfo.getSha256());
    }

    private boolean h(AppDownloadTask appDownloadTask) {
        ContentRecord contentRecordS = appDownloadTask.S();
        if (contentRecordS != null) {
            return new ti(this.f18609a, contentRecordS).a();
        }
        return false;
    }

    public static e h() {
        e eVar;
        synchronized (f) {
            eVar = g;
            if (eVar == null) {
                throw new com.huawei.openalliance.ad.exception.b("AppDownloadManager instance is not init!");
            }
        }
        return eVar;
    }

    private static boolean g(AppInfo appInfo) {
        if (appInfo == null) {
            return true;
        }
        if ("11".equals(appInfo.getPriorInstallWay())) {
            return false;
        }
        return TextUtils.isEmpty(appInfo.getPackageName()) || TextUtils.isEmpty(appInfo.getDownloadUrl()) || h(appInfo) || appInfo.getFileSize() <= 0;
    }

    private boolean g(AppDownloadTask appDownloadTask) {
        if (appDownloadTask == null) {
            return false;
        }
        while (appDownloadTask.J()) {
            hw.b("AppDownloadManager", "switch next install way succ, curInstallWay:%s", appDownloadTask.H());
            if (!appDownloadTask.K() || as.c(this.f18609a)) {
                return true;
            }
        }
        hw.b("AppDownloadManager", "switch next install way fail, curInstallWay:%s", appDownloadTask.H());
        return false;
    }

    private void f(AppDownloadTask appDownloadTask) {
        b bVar = this.k;
        if (bVar != null) {
            bVar.f(appDownloadTask);
        }
    }

    private boolean e(AppDownloadTask appDownloadTask) {
        return "11".equals(appDownloadTask.H());
    }

    private String d(String str) {
        int iIndexOf = str.indexOf(".apk");
        if (iIndexOf > 0) {
            return str.substring(0, iIndexOf);
        }
        return null;
    }

    private boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals("8") || str.equals("6") || str.equals("5");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(Context context) {
        return dd.c(context) + File.separator + Constants.PPS_ROOT_PATH + File.separator + "apk";
    }

    private boolean a(AppInfo appInfo, boolean z) {
        i.a().a(appInfo);
        if (i(appInfo)) {
            com.huawei.openalliance.ad.download.ag.d.a(this.f18609a).a(appInfo);
            a(a(appInfo.getPackageName()), z, true, false);
            return true;
        }
        if (g(appInfo)) {
            return false;
        }
        return a(a(appInfo.getPackageName()), z, true, true);
    }

    private void a(List<AppDownloadTask> list) {
        Collections.sort(list);
        for (AppDownloadTask appDownloadTask : list) {
            hw.b("AppDownloadManager", " task pause reason:" + appDownloadTask.p());
            if (appDownloadTask.p() == DownloadTask.c.NETWORK_CHANGED || appDownloadTask.p() == DownloadTask.c.WAITING_WIFI_DOWNLOAD) {
                a(appDownloadTask, false);
            }
        }
    }

    private void a(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (str2.endsWith(".apk")) {
                File file = new File(str + str2);
                if (!file.isDirectory() && System.currentTimeMillis() - file.lastModified() > Constants.ANALYSIS_EVENT_KEEP_TIME) {
                    hw.b("AppDownloadManager", "remove timeout file");
                    AppDownloadTask appDownloadTaskA = a(d(str2));
                    if (appDownloadTaskA != null) {
                        c(appDownloadTaskA);
                    } else {
                        ai.e(file);
                    }
                }
            }
        }
    }

    private void a(String str, AppDownloadTask appDownloadTask) {
        if (appDownloadTask == null) {
            return;
        }
        if (c(str)) {
            com.huawei.openalliance.ad.download.ag.d.a(this.f18609a).b(appDownloadTask);
        } else {
            if (g(appDownloadTask.B())) {
                return;
            }
            d(appDownloadTask);
        }
    }

    private void a(AppInfo appInfo, AppDownloadTask appDownloadTask) {
        AppInfo appInfoB = appDownloadTask.B();
        if (appInfoB != null) {
            hw.b("AppDownloadManager", "update appInfo from remote task.");
            appInfo.v(appInfoB.getUniqueId());
        }
    }

    public static void a(Context context) {
        synchronized (f) {
            if (g == null) {
                g = new e(context);
            }
        }
    }

    class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f18537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ConnectivityManager.NetworkCallback f18538c = new ConnectivityManager.NetworkCallback() { // from class: com.huawei.openalliance.ad.download.app.e.a.1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                super.onLost(network);
                final Context applicationContext = a.this.f18537b.getApplicationContext();
                if (hw.a()) {
                    hw.a("AppDownloadManager", "net onLost, active netType: %s, [0:UNKNOWN, 1:ETHERNET, 2:WIFI, 4/5/6/7:2G/3G/4G/5G]", Integer.valueOf(cb.d(applicationContext)));
                }
                if (fp.b(applicationContext).bf()) {
                    com.huawei.openalliance.ad.utils.o.g(new Runnable() { // from class: com.huawei.openalliance.ad.download.app.e.a.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (cb.e(applicationContext) && cb.c(applicationContext)) {
                                e.this.l();
                            } else {
                                if (cb.e(applicationContext) && cb.c(applicationContext)) {
                                    return;
                                }
                                e.this.a(DownloadTask.c.NETWORK_CHANGED);
                            }
                        }
                    });
                } else {
                    hw.b("AppDownloadManager", "user info is not enabled");
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                super.onAvailable(network);
                final Context applicationContext = a.this.f18537b.getApplicationContext();
                if (hw.a()) {
                    hw.a("AppDownloadManager", "net onAvailable, active netType: %s, [0:UNKNOWN, 1:ETHERNET, 2:WIFI, 4/5/6/7:2G/3G/4G/5G]", Integer.valueOf(cb.d(applicationContext)));
                }
                if (fp.b(applicationContext).bf()) {
                    com.huawei.openalliance.ad.utils.o.g(new Runnable() { // from class: com.huawei.openalliance.ad.download.app.e.a.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (cb.e(applicationContext) && cb.c(applicationContext)) {
                                e.this.l();
                            } else {
                                if (cb.e(applicationContext) && cb.c(applicationContext)) {
                                    return;
                                }
                                e.this.a(DownloadTask.c.NETWORK_CHANGED);
                            }
                        }
                    });
                } else {
                    hw.b("AppDownloadManager", "user info is not enabled");
                }
            }
        };

        public void a() {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f18537b.getSystemService("connectivity");
                NetworkRequest.Builder builder = new NetworkRequest.Builder();
                builder.addTransportType(0).addTransportType(3).addTransportType(1);
                connectivityManager.registerNetworkCallback(builder.build(), this.f18538c);
            } catch (Throwable unused) {
                hw.c("AppDownloadManager", "register all network callback exception.");
            }
        }

        public a(Context context) {
            this.f18537b = context;
        }
    }

    private AppDownloadTask a(AppInfo appInfo, AppDownloadTask appDownloadTask, File file, boolean z) {
        com.huawei.openalliance.ad.download.e eVar;
        long length = file.length();
        if (appInfo.getFileSize() == length) {
            if (appInfo.isCheckSha256() && !ai.a(appInfo.getSha256(), file)) {
                ai.a(file);
                return null;
            }
            if (z && !ai.a(this.f18609a, file, appDownloadTask.d(), "normal")) {
                ai.a(file);
                return null;
            }
            appDownloadTask.b(100);
            appDownloadTask.b(appInfo.getFileSize());
            if (!b(appDownloadTask)) {
                return null;
            }
            eVar = com.huawei.openalliance.ad.download.e.DOWNLOADED;
        } else {
            if (appInfo.getFileSize() <= length) {
                ai.a(file);
                return null;
            }
            appDownloadTask.b((int) ((100 * length) / appInfo.getFileSize()));
            appDownloadTask.b(length);
            if (!b(appDownloadTask)) {
                return null;
            }
            eVar = com.huawei.openalliance.ad.download.e.IDLE;
        }
        appDownloadTask.a(eVar);
        return appDownloadTask;
    }

    private e(final Context context) {
        String str;
        super(context);
        this.l = new BroadcastReceiver() { // from class: com.huawei.openalliance.ad.download.app.e.6
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (hw.a()) {
                    hw.a("AppDownloadManager", "netReceiver.onReceive, action:%s", intent.getAction());
                }
                final Context applicationContext = context2.getApplicationContext();
                if (fp.b(applicationContext).bf()) {
                    com.huawei.openalliance.ad.utils.o.g(new Runnable() { // from class: com.huawei.openalliance.ad.download.app.e.6.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (cb.e(applicationContext) && cb.c(applicationContext)) {
                                e.this.l();
                            } else {
                                if (cb.e(applicationContext) && cb.c(applicationContext)) {
                                    return;
                                }
                                e.this.a(DownloadTask.c.NETWORK_CHANGED);
                            }
                        }
                    });
                } else {
                    hw.b("AppDownloadManager", "user info is not enabled");
                }
            }
        };
        try {
            super.a();
            b bVar = new b(context);
            this.k = bVar;
            super.a(bVar);
            i.a(context);
            i.a().a(this.k);
            com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.download.app.e.1
                @Override // java.lang.Runnable
                public void run() {
                    e.this.f18610b = e.c(context);
                }
            });
            a aVar = new a(this.f18609a);
            this.h = aVar;
            aVar.a();
        } catch (IllegalStateException unused) {
            str = "init IllegalStateException";
            hw.c("AppDownloadManager", str);
        } catch (Exception unused2) {
            str = "init exception";
            hw.c("AppDownloadManager", str);
        }
    }
}
