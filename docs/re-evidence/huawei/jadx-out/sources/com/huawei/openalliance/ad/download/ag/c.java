package com.huawei.openalliance.ad.download.ag;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.huawei.openalliance.ad.activity.AgProtocolActivity;
import com.huawei.openalliance.ad.activity.SafeIntent;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.constant.WhiteListPkgList;
import com.huawei.openalliance.ad.download.DownloadTask;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.download.app.AppStatus;
import com.huawei.openalliance.ad.download.app.AppStatusV1;
import com.huawei.openalliance.ad.download.app.interfaces.AutoOpenListener;
import com.huawei.openalliance.ad.download.l;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.listeners.AppDownloadListener;
import com.huawei.openalliance.ad.inter.listeners.AppDownloadListenerV1;
import com.huawei.openalliance.ad.ln;
import com.huawei.openalliance.ad.lt;
import com.huawei.openalliance.ad.rc;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.bu;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.utils.k;
import com.huawei.openalliance.ad.utils.o;
import com.huawei.openalliance.ad.views.AppDownloadButton;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes12.dex */
public class c implements com.huawei.openalliance.ad.download.a<AppDownloadTask> {
    private static Map<String, Method> h = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f18438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f18439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f18440c;
    private AppDownloadListener e;
    private AppDownloadListenerV1 f;
    private AutoOpenListener g;
    private AppDownloadButton.OnResolutionRequiredListener j;
    private long k;
    private Map<String, Set<l>> d = new ConcurrentHashMap();
    private Map<String, Set<AppDownloadButton.OnResolutionRequiredListener>> i = new ConcurrentHashMap();
    private String l = Constants.TIMEOUT_TASK_ID + hashCode();
    private BroadcastReceiver m = new BroadcastReceiver() { // from class: com.huawei.openalliance.ad.download.ag.c.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            StringBuilder sb;
            if (intent == null) {
                return;
            }
            try {
                String action = intent.getAction();
                hw.a("AgDe", "appRe action: %s", action);
                c.this.a(intent, action);
            } catch (IllegalStateException e) {
                e = e;
                sb = new StringBuilder("appRe ");
                sb.append(e.getClass().getSimpleName());
                hw.c("AgDe", sb.toString());
            } catch (Exception e2) {
                e = e2;
                sb = new StringBuilder("appRe ");
                sb.append(e.getClass().getSimpleName());
                hw.c("AgDe", sb.toString());
            }
        }
    };
    private BroadcastReceiver n = new BroadcastReceiver() { // from class: com.huawei.openalliance.ad.download.ag.c.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(final Context context, Intent intent) {
            StringBuilder sb;
            if (intent == null) {
                return;
            }
            try {
                String action = intent.getAction();
                hw.b("AgDe", "itRe action: %s", action);
                String dataString = intent.getDataString();
                if (TextUtils.isEmpty(dataString)) {
                    hw.c("AgDe", "itRe dataString is empty, " + action);
                } else {
                    final String strSubstring = dataString.substring(8);
                    c.this.a(action, strSubstring);
                    if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
                        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.download.ag.c.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                c.this.onAppInstalled(d.a(context).a(strSubstring));
                            }
                        });
                    }
                }
            } catch (IllegalStateException e) {
                e = e;
                sb = new StringBuilder("itRe:");
                sb.append(e.getClass().getSimpleName());
                hw.c("AgDe", sb.toString());
            } catch (Exception e2) {
                e = e2;
                sb = new StringBuilder("itRe:");
                sb.append(e.getClass().getSimpleName());
                hw.c("AgDe", sb.toString());
            }
        }
    };
    private BroadcastReceiver o = new BroadcastReceiver() { // from class: com.huawei.openalliance.ad.download.ag.c.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(final Context context, Intent intent) {
            try {
                if ("android.intent.action.PACKAGE_DATA_CLEARED".equals(new SafeIntent(intent).getAction())) {
                    String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
                    if (TextUtils.isEmpty(schemeSpecificPart)) {
                        hw.b("AgDe", "a bad intent");
                    } else if (schemeSpecificPart.equals(k.e(context))) {
                        hw.b("AgDe", "on hms data cleared.");
                        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.download.ag.c.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                d.a(context).b();
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                hw.c("AgDe", "on data clear received ex: %s", th.getClass().getSimpleName());
            }
        }
    };
    private BroadcastReceiver p = new BroadcastReceiver() { // from class: com.huawei.openalliance.ad.download.ag.c.4
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            hw.b("AgDe", "app remove from hms");
            try {
                String stringExtra = intent.getStringExtra("package_name");
                if (TextUtils.isEmpty(stringExtra)) {
                    hw.b("AgDe", "a bad removed intent");
                } else {
                    c.this.a(context, stringExtra);
                }
            } catch (Throwable th) {
                hw.c("AgDe", "appRemovedReceiver err, %s", th.getClass().getSimpleName());
            }
        }
    };
    private BroadcastReceiver q = new BroadcastReceiver() { // from class: com.huawei.openalliance.ad.download.ag.c.6
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AppInfo appInfoB;
            boolean z;
            try {
                hw.b("AgDe", "get check is need auto open app");
                if (intent == null) {
                    return;
                }
                String stringExtra = intent.getStringExtra("packageName");
                if (!TextUtils.isEmpty(stringExtra)) {
                    AppDownloadTask appDownloadTaskB = d.a(context).a(stringExtra);
                    if (appDownloadTaskB == null || appDownloadTaskB.B() == null) {
                        hw.b("AgDe", "task is remove");
                        AppInfo appInfo = new AppInfo();
                        appInfo.a(stringExtra);
                        appInfoB = appInfo;
                    } else {
                        appInfoB = appDownloadTaskB.B();
                    }
                    if (c.this.g == null || c.this.g.isNeedAutoOpen(appInfoB)) {
                        hw.b("AgDe", " need auto open");
                    } else {
                        hw.b("AgDe", "no need auto open");
                        z = false;
                    }
                    Intent intent2 = new Intent();
                    intent2.setAction("huawei.intent.action.AUTO_OPEN_APP");
                    intent2.putExtra("autoOpen", z);
                    intent2.setPackage(k.e(context));
                    context.sendBroadcast(intent2);
                    hw.b("AgDe", "send auto open");
                }
                z = true;
                Intent intent3 = new Intent();
                intent3.setAction("huawei.intent.action.AUTO_OPEN_APP");
                intent3.putExtra("autoOpen", z);
                intent3.setPackage(k.e(context));
                context.sendBroadcast(intent3);
                hw.b("AgDe", "send auto open");
            } catch (Throwable th) {
                hw.c("AgDe", "autoOpenRec err: " + th.getClass().getSimpleName());
            }
        }
    };

    @Override // com.huawei.openalliance.ad.download.a
    public void b(AppDownloadTask appDownloadTask) {
    }

    public void onSystemInstallStart(AppDownloadTask appDownloadTask) {
        h(appDownloadTask);
        e(appDownloadTask);
        a(AppStatus.INSTALL, appDownloadTask);
        a(AppStatusV1.START_INSTALL, 1000, appDownloadTask);
    }

    public void onSilentInstallSuccess(AppDownloadTask appDownloadTask) {
        e(appDownloadTask);
        a(AppStatus.INSTALLED, appDownloadTask);
        a(AppStatusV1.INSTALL_SUCCESS, 1000, appDownloadTask);
    }

    public void onSilentInstallStart(AppDownloadTask appDownloadTask) {
        h(appDownloadTask);
        e(appDownloadTask);
        a(AppStatus.INSTALLING, appDownloadTask);
        a(AppStatusV1.START_INSTALL, 1000, appDownloadTask);
    }

    public void onSilentInstallFailed(AppDownloadTask appDownloadTask) {
        AppStatus appStatus;
        if (c(appDownloadTask)) {
            return;
        }
        e(appDownloadTask);
        if (appDownloadTask.i() == com.huawei.openalliance.ad.download.e.FAILED) {
            g(appDownloadTask);
            appStatus = AppStatus.DOWNLOAD;
        } else {
            appStatus = AppStatus.INSTALL;
        }
        a(appStatus, appDownloadTask);
        a(AppStatusV1.INSTALL_FAILED, -1000, appDownloadTask);
    }

    @Override // com.huawei.openalliance.ad.download.a
    public void onDownloadWaiting(AppDownloadTask appDownloadTask) {
        e(appDownloadTask);
        a(AppStatus.WAITING, appDownloadTask);
        a(AppStatusV1.WAITING, 1000, appDownloadTask);
    }

    @Override // com.huawei.openalliance.ad.download.a
    public void onDownloadSuccess(AppDownloadTask appDownloadTask) {
        hw.b("AgDe", "down success: %s", appDownloadTask == null ? null : appDownloadTask.n());
        this.k = fp.b(this.f18438a).f();
        a(AppStatus.DOWNLOADED, appDownloadTask);
        a(AppStatusV1.DOWNLOAD_SUCCESS, 1000, appDownloadTask);
        d();
        c();
    }

    @Override // com.huawei.openalliance.ad.download.a
    public void onDownloadStart(AppDownloadTask appDownloadTask) {
        AppStatusV1 appStatusV1;
        e(appDownloadTask);
        a(AppStatus.DOWNLOADING, appDownloadTask);
        if (appDownloadTask.l() > 0 || appDownloadTask.g() > 0) {
            appStatusV1 = AppStatusV1.RESUME;
        } else {
            a(AppStatusV1.PRE_CHECK_SUCCESS, 1000, appDownloadTask);
            appStatusV1 = AppStatusV1.START_DOWNLOAD;
        }
        a(appStatusV1, 1000, appDownloadTask);
    }

    public void onDownloadResumed(AppDownloadTask appDownloadTask) {
        e(appDownloadTask);
        a(AppStatus.RESUME, appDownloadTask);
        a(AppStatusV1.RESUME, 1000, appDownloadTask);
    }

    @Override // com.huawei.openalliance.ad.download.a
    public void onDownloadProgress(AppDownloadTask appDownloadTask) {
        d(appDownloadTask);
        AppDownloadListener appDownloadListener = this.e;
        if (appDownloadListener != null) {
            appDownloadListener.onDownloadProgress(appDownloadTask.B(), appDownloadTask.l());
        }
    }

    public void onDownloadPaused(AppDownloadTask appDownloadTask) {
        e(appDownloadTask);
        a(AppStatus.PAUSE, appDownloadTask);
        a(AppStatusV1.PAUSE, appDownloadTask.T(), appDownloadTask);
    }

    @Override // com.huawei.openalliance.ad.download.a
    public void onDownloadFail(AppDownloadTask appDownloadTask) {
        if (appDownloadTask != null) {
            hw.b("AgDe", "onDownloadFail, current way: %s", appDownloadTask.H());
        }
        if (c(appDownloadTask)) {
            return;
        }
        appDownloadTask.b(0);
        appDownloadTask.b(0L);
        g(appDownloadTask);
        e(appDownloadTask);
        a(AppStatus.DOWNLOADFAILED, appDownloadTask);
        a(AppStatusV1.DOWNLOAD_FAILED, appDownloadTask.T(), appDownloadTask);
    }

    public void onDownloadDeleted(AppDownloadTask appDownloadTask) {
        appDownloadTask.b(0);
        appDownloadTask.b(0L);
        appDownloadTask.a(com.huawei.openalliance.ad.download.e.FAILED);
        g(appDownloadTask);
        e(appDownloadTask);
        a(f() ? AppStatus.DOWNLOADCANCELLED : AppStatus.DOWNLOADFAILED, appDownloadTask);
        if (a(appDownloadTask, System.currentTimeMillis())) {
            a(AppStatusV1.CANCEL_DOWNLOAD, appDownloadTask.T(), appDownloadTask);
        }
    }

    public void onAppUnInstalled(AppDownloadTask appDownloadTask) {
        if (appDownloadTask != null) {
            String packageName = appDownloadTask.B().getPackageName();
            Set<l> setA = a(packageName);
            if (setA != null && setA.size() > 0) {
                Iterator<l> it = setA.iterator();
                while (it.hasNext()) {
                    it.next().b(packageName);
                }
            }
            a(AppStatus.DOWNLOAD, appDownloadTask);
        }
    }

    public void onAppInstalled(AppDownloadTask appDownloadTask) {
        if (appDownloadTask == null) {
            hw.a("AgDe", "task is null onAppInstalled");
            return;
        }
        if (appDownloadTask.L() == AppDownloadTask.b.DOWN_LOAD_MODE_FROM_SELF) {
            hw.a("AgDe", "task download from self");
            return;
        }
        hw.a("AgDe", "task is installed and patter is %s", appDownloadTask.L());
        appDownloadTask.a(com.huawei.openalliance.ad.download.e.INSTALLED);
        a(AppStatus.INSTALLED, appDownloadTask);
        a(AppStatusV1.INSTALL_SUCCESS, 1000, appDownloadTask);
        e(appDownloadTask);
        if (f(appDownloadTask)) {
            new ln(this.f18438a, appDownloadTask).b();
        }
        new g(this.f18438a, appDownloadTask).a();
    }

    public boolean c(AppDownloadTask appDownloadTask) {
        return com.huawei.openalliance.ad.download.app.e.h().d(appDownloadTask);
    }

    @Override // com.huawei.openalliance.ad.download.a
    public void c(AppDownloadTask appDownloadTask, boolean z) {
        onDownloadResumed(appDownloadTask);
        a(z ? AppStatusV1.USER_RESUME : AppStatusV1.RESUME, 1000, appDownloadTask);
    }

    public void b(String str, AppDownloadButton.OnResolutionRequiredListener onResolutionRequiredListener) {
        synchronized (this) {
            Set<AppDownloadButton.OnResolutionRequiredListener> set = this.i.get(str);
            if (!bm.a(set)) {
                set.remove(onResolutionRequiredListener);
                if (set.size() <= 0) {
                    this.i.remove(str);
                }
            }
        }
    }

    public void b(String str, l lVar) {
        synchronized (this) {
            Set<l> set = this.d.get(str);
            if (set != null && set.size() > 0) {
                set.remove(lVar);
                if (set.size() <= 0) {
                    this.d.remove(str);
                }
            }
        }
    }

    @Override // com.huawei.openalliance.ad.download.a
    public void b(AppDownloadTask appDownloadTask, boolean z) {
        onDownloadPaused(appDownloadTask);
    }

    public void b() {
        hw.b("AgDe", "remove all OnResolutionRequiredListener");
        this.j = null;
        this.i.clear();
    }

    public void a(String str, AppDownloadButton.OnResolutionRequiredListener onResolutionRequiredListener) {
        synchronized (this) {
            Set<AppDownloadButton.OnResolutionRequiredListener> hashSet = this.i.get(str);
            if (hashSet == null) {
                hashSet = new HashSet<>();
                this.i.put(str, hashSet);
            }
            hashSet.add(onResolutionRequiredListener);
        }
    }

    public void a(String str, l lVar) {
        synchronized (this) {
            Set<l> copyOnWriteArraySet = this.d.get(str);
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = new CopyOnWriteArraySet<>();
                this.d.put(str, copyOnWriteArraySet);
            }
            copyOnWriteArraySet.add(lVar);
        }
    }

    public void a(AppDownloadButton.OnResolutionRequiredListener onResolutionRequiredListener) {
        this.j = onResolutionRequiredListener;
    }

    public void a(AppDownloadListenerV1 appDownloadListenerV1) {
        this.f = appDownloadListenerV1;
    }

    public void a(AppDownloadListener appDownloadListener) {
        this.e = appDownloadListener;
    }

    public void a(AutoOpenListener autoOpenListener) {
        this.g = autoOpenListener;
    }

    @Override // com.huawei.openalliance.ad.download.a
    public void a(AppDownloadTask appDownloadTask, boolean z) {
        onDownloadDeleted(appDownloadTask);
    }

    @Override // com.huawei.openalliance.ad.download.a
    public void a(AppDownloadTask appDownloadTask) {
        a(AppStatusV1.WAITING_FOR_WIFI, 1000, appDownloadTask);
    }

    public void a() {
        this.j = null;
    }

    private void h(AppDownloadTask appDownloadTask) {
        Context context;
        boolean z;
        if (appDownloadTask == null || appDownloadTask.B() == null) {
            return;
        }
        if (this.g == null || com.huawei.openalliance.ad.download.app.d.a().b() == null || com.huawei.openalliance.ad.download.app.d.a().b().size() == 0) {
            hw.b("AgDe", " no setting auto open Listener");
            context = this.f18438a;
            z = false;
        } else {
            hw.b("AgDe", " setting auto open Listener");
            context = this.f18438a;
            z = true;
        }
        f.a(context, z, String.class);
    }

    private void g(AppDownloadTask appDownloadTask) {
        d.a(this.f18438a).b(appDownloadTask);
    }

    private static void g() {
        try {
            for (Method method : c.class.getDeclaredMethods()) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0].isAssignableFrom(AppDownloadTask.class)) {
                    h.put(method.getName(), method);
                }
            }
        } catch (IllegalArgumentException e) {
            hw.a("AgDe", "transport=%s", e.getMessage());
            hw.d("AgDe", "transport=" + e.getClass().getSimpleName());
        }
    }

    private boolean f(AppDownloadTask appDownloadTask) {
        AppInfo appInfoB = appDownloadTask.B();
        if (appInfoB == null) {
            hw.a("AgDe", "appInfo is null");
            return false;
        }
        if (appInfoB.o() != 1) {
            hw.a("AgDe", "appInfo's popNotify is not popup immediate, popNotify is %s", Integer.valueOf(appInfoB.o()));
            return false;
        }
        if (TextUtils.isEmpty(appInfoB.f())) {
            hw.a("AgDe", "appInfo's popUpAfterInstall is null.");
            return false;
        }
        if (!appDownloadTask.U()) {
            hw.a("AgDe", "this is not task starter");
            return false;
        }
        if (!com.huawei.openalliance.ad.utils.l.a(this.f18438a, appInfoB.getPackageName(), appDownloadTask)) {
            return true;
        }
        hw.a("AgDe", "can auto open,no send notification");
        return false;
    }

    private boolean f() {
        String packageName;
        Context context = this.f18438a;
        if (context == null || (packageName = context.getPackageName()) == null) {
            return false;
        }
        return WhiteListPkgList.isHwBrowserPkgName(packageName);
    }

    private void e(AppDownloadTask appDownloadTask) {
        Set<l> setA = a(appDownloadTask.B());
        if (setA == null || setA.size() <= 0) {
            return;
        }
        Iterator<l> it = setA.iterator();
        while (it.hasNext()) {
            it.next().b(appDownloadTask);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        hw.b("AgDe", "unRegisterAppInstReceiver");
        this.f18438a.unregisterReceiver(this.n);
    }

    private void d(AppDownloadTask appDownloadTask) {
        Set<l> setA = a(appDownloadTask.B());
        if (setA == null || setA.size() <= 0) {
            return;
        }
        Iterator<l> it = setA.iterator();
        while (it.hasNext()) {
            it.next().a(appDownloadTask);
        }
    }

    private void d() {
        hw.b("AgDe", "registerAppInstReceiver");
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        as.a(this.f18438a, this.n, intentFilter);
    }

    private Set<AppDownloadButton.OnResolutionRequiredListener> d(String str) {
        Set<AppDownloadButton.OnResolutionRequiredListener> set;
        synchronized (this) {
            set = this.i.get(str);
        }
        return set;
    }

    private void c(String str) {
        Set<AppDownloadButton.OnResolutionRequiredListener> setD = d(str);
        if (!bm.a(setD)) {
            for (AppDownloadButton.OnResolutionRequiredListener onResolutionRequiredListener : setD) {
                AppInfo appInfo = new AppInfo();
                appInfo.a(str);
                onResolutionRequiredListener.onResolutionRequired(appInfo, new Bundle());
            }
        }
        if (this.j != null) {
            AppInfo appInfo2 = new AppInfo();
            appInfo2.a(str);
            this.j.onResolutionRequired(appInfo2, new Bundle());
        }
    }

    private void c() {
        bu.a(this.l);
        bu.a(new a(this), this.l, this.k);
    }

    private void b(String str) {
        if (TextUtils.isEmpty(str)) {
            hw.b("AgDe", " packageName is empty.");
            return;
        }
        Set<l> setA = a(str);
        if (setA == null || setA.size() <= 0) {
            return;
        }
        hw.a("AgDe", " findAndRefreshTask list:%s", setA.toString());
        Iterator<l> it = setA.iterator();
        while (it.hasNext()) {
            it.next().c(str);
        }
    }

    private boolean a(AppDownloadTask appDownloadTask, long j) {
        if (appDownloadTask == null || appDownloadTask.B() == null || TextUtils.isEmpty(appDownloadTask.B().getPackageName())) {
            return true;
        }
        if (!TextUtils.isEmpty(this.f18439b)) {
            long j2 = this.f18440c;
            if (j2 != 0 && this.f18439b.equals(appDownloadTask.B().getPackageName()) && j - j2 < 500) {
                this.f18439b = null;
                this.f18440c = 0L;
                hw.b("AgDe", " repeat cancel");
                return false;
            }
        }
        this.f18439b = appDownloadTask.B().getPackageName();
        this.f18440c = j;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        Set<l> setA = a(str2);
        if (setA == null || setA.size() <= 0 || !"android.intent.action.PACKAGE_ADDED".equals(str)) {
            return;
        }
        for (l lVar : setA) {
            if (lVar != null) {
                lVar.a(str2);
            }
        }
    }

    private void a(AppStatusV1 appStatusV1, int i, AppDownloadTask appDownloadTask) {
        AppDownloadListenerV1 appDownloadListenerV1 = this.f;
        if (appDownloadListenerV1 != null) {
            appDownloadListenerV1.onNewStatusChanged(appStatusV1, i, appDownloadTask.B());
        }
    }

    private void a(AppStatus appStatus, AppDownloadTask appDownloadTask) {
        AppDownloadListener appDownloadListener = this.e;
        if (appDownloadListener != null) {
            appDownloadListener.onStatusChanged(appStatus, appDownloadTask.B());
        }
    }

    private void a(AppDownloadTask appDownloadTask, Intent intent) {
        SafeIntent safeIntent = new SafeIntent(intent);
        appDownloadTask.a(com.huawei.openalliance.ad.download.e.a(safeIntent.getIntExtra(UpdateKey.MARKET_DLD_STATUS, com.huawei.openalliance.ad.download.e.IDLE.a())));
        hw.a("AgDe", "download status=%s", appDownloadTask.i());
        appDownloadTask.b(safeIntent.getIntExtra("downloadProgress", 0));
        int intExtra = safeIntent.getIntExtra("pauseReason", DownloadTask.c.NONE.a());
        hw.a("AgDe", " pauseReason=%d", Integer.valueOf(intExtra));
        appDownloadTask.a(DownloadTask.c.a(intExtra));
        a(appDownloadTask, appDownloadTask.l());
    }

    private void a(AppDownloadTask appDownloadTask, int i) {
        appDownloadTask.b((appDownloadTask.f() * ((long) i)) / 100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Intent intent, String str) {
        try {
            Intent intent2 = new Intent(intent);
            if (!"huawei.intent.action.DOWNLOAD".equals(str)) {
                if (!"huawei.intent.action.OPEN".equals(str)) {
                    if ("huawei.intent.action.PENDINGINTENT".equals(str)) {
                        hw.b("AgDe", " request intent");
                        a(intent2);
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("appPackageName");
                AppDownloadListener appDownloadListener = this.e;
                if (appDownloadListener != null) {
                    appDownloadListener.onAppOpen(stringExtra);
                    return;
                }
                return;
            }
            String stringExtra2 = intent2.getStringExtra("appPackageName");
            AppDownloadTask appDownloadTaskB = d.a(this.f18438a).a(stringExtra2);
            if (appDownloadTaskB == null) {
                hw.b("AgDe", " task is null, pkg=" + stringExtra2);
                b(stringExtra2);
                return;
            }
            String stringExtra3 = intent2.getStringExtra("appInfo");
            if (!TextUtils.isEmpty(stringExtra3)) {
                AppInfo appInfo = (AppInfo) bk.b(stringExtra3, AppInfo.class, new Class[0]);
                AppInfo appInfoB = appDownloadTaskB.B();
                if (appInfo != null && appInfoB != null) {
                    hw.b("AgDe", "update appInfo from remote task.");
                    appInfoB.v(appInfo.getUniqueId());
                }
            }
            appDownloadTaskB.f(intent2.getIntExtra("agFailedReason", -1000));
            a(appDownloadTaskB, intent2);
            String stringExtra4 = intent2.getStringExtra("appDownloadMethod");
            if (TextUtils.isEmpty(stringExtra4)) {
                return;
            }
            if (stringExtra4.equals("onDownloadDeleted")) {
                d.a(this.f18438a).c(appDownloadTaskB);
                return;
            }
            if (stringExtra4.equals("onDownloadStart")) {
                String stringExtra5 = intent2.getStringExtra("agd_event_reason");
                String stringExtra6 = intent2.getStringExtra("agd_install_type");
                if (!dg.b(stringExtra5)) {
                    appDownloadTaskB.o(stringExtra5);
                }
                if (!dg.b(stringExtra6)) {
                    appDownloadTaskB.p(stringExtra6);
                }
            }
            Method method = h.get(stringExtra4);
            if (method != null) {
                try {
                    hw.b("AgDe", "methodName:%s", stringExtra4);
                    method.invoke(this, appDownloadTaskB);
                } catch (IllegalAccessException unused) {
                    hw.c("AgDe", "ilex=%s", stringExtra4);
                } catch (InvocationTargetException unused2) {
                    hw.c("AgDe", "itex=%s", stringExtra4);
                } catch (Exception e) {
                    hw.c("AgDe", "Exception=%s", e.getClass().getSimpleName());
                }
            }
        } catch (Throwable th) {
            hw.c("AgDe", "notifyListener Err: " + th.getClass().getSimpleName());
        }
    }

    private void a(Intent intent) {
        String stringExtra;
        int intExtra;
        String stringExtra2;
        try {
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(BaseGmsClient.KEY_PENDING_INTENT);
            if (pendingIntent != null) {
                Intent intent2 = new Intent();
                intent2.setClass(this.f18438a, AgProtocolActivity.class);
                intent2.putExtra(BaseGmsClient.KEY_PENDING_INTENT, pendingIntent);
                intExtra = intent.getIntExtra("pendingIntent.type", 6);
                intent2.putExtra("pendingIntent.type", intExtra);
                stringExtra = intent.getStringExtra("task.pkg");
                intent2.putExtra("task.pkg", stringExtra);
                stringExtra2 = intent.getStringExtra(MapKeyNames.AG_ACTION_NAME);
                intent2.putExtra(MapKeyNames.AG_ACTION_NAME, stringExtra2);
                intent2.setClipData(Constants.CLIP_DATA);
                Activity curActivity = HiAd.getInstance(this.f18438a).getCurActivity();
                if (curActivity == null || curActivity.isFinishing()) {
                    intent2.addFlags(268435456);
                    this.f18438a.startActivity(intent2);
                } else {
                    curActivity.startActivity(intent2);
                }
                c(stringExtra);
            } else {
                stringExtra = null;
                intExtra = -1;
                stringExtra2 = null;
            }
            a(this.f18438a, intExtra, stringExtra, stringExtra2);
        } catch (Throwable unused) {
            hw.b("AgDe", " requestAgProtocol error");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Context context, final String str) {
        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.download.ag.c.5
            @Override // java.lang.Runnable
            public void run() {
                AppDownloadTask appDownloadTaskB = d.a(context).a(str);
                if (appDownloadTaskB == null || appDownloadTaskB.L() == AppDownloadTask.b.DOWN_LOAD_MODE_FROM_SELF) {
                    return;
                }
                d.a(c.this.f18438a).b(appDownloadTaskB);
            }
        });
    }

    private void a(final Context context, final int i, final String str, final String str2) {
        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.download.ag.c.7
            @Override // java.lang.Runnable
            public void run() {
                rc rcVarC;
                AppDownloadTask appDownloadTaskB = d.a(context).a(str);
                new com.huawei.openalliance.ad.analysis.c(context).a(str, (appDownloadTaskB == null || (rcVarC = appDownloadTaskB.C()) == null) ? null : rcVarC.a(), i, str2, "reqAgPendingIntent");
            }
        });
    }

    private Set<l> a(String str) {
        Set<l> set;
        synchronized (this) {
            set = this.d.get(str);
        }
        return set;
    }

    private Set<l> a(AppInfo appInfo) {
        synchronized (this) {
            if (appInfo != null) {
                if (!TextUtils.isEmpty(appInfo.getPackageName())) {
                    return a(appInfo.getPackageName());
                }
            }
            return null;
        }
    }

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<c> f18457a;

        @Override // java.lang.Runnable
        public void run() {
            c cVar = this.f18457a.get();
            if (cVar == null) {
                return;
            }
            cVar.e();
        }

        public a(c cVar) {
            this.f18457a = new WeakReference<>(cVar);
        }
    }

    public c(Context context) {
        String str;
        this.f18438a = context.getApplicationContext();
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("huawei.intent.action.DOWNLOAD");
            intentFilter.addAction("huawei.intent.action.OPEN");
            intentFilter.addAction("huawei.intent.action.PENDINGINTENT");
            as.a(this.f18438a, this.m, intentFilter, Constants.PERMISSION_PPS_DOWNLOAD, (Handler) null);
            IntentFilter intentFilter2 = new IntentFilter("android.intent.action.PACKAGE_DATA_CLEARED");
            intentFilter2.addDataScheme("package");
            as.a(this.f18438a, this.o, intentFilter2);
            IntentFilter intentFilter3 = new IntentFilter();
            intentFilter3.addAction("huawei.intent.action.CHECK_AUTO_OPEN_APP");
            as.a(this.f18438a, this.q, intentFilter3, Constants.PERMISSION_PPS_DOWNLOAD, (Handler) null);
            as.a(this.f18438a, this.p, new IntentFilter("huawei.intent.action.APP.REMOVE"), Constants.PERMISSION_PPS_DOWNLOAD, (Handler) null);
            lt.a(context).a();
            g();
        } catch (IllegalStateException unused) {
            str = "registerReceiver IllegalStateException";
            hw.c("AgDe", str);
        } catch (Exception unused2) {
            str = "registerReceiver Exception";
            hw.c("AgDe", str);
        }
    }
}
