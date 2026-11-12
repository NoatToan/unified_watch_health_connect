package com.huawei.openalliance.ad.download.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.openalliance.ad.activity.SafeIntent;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.bu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes12.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f18556a = new Object();
    private static i e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, n> f18557b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f18558c;
    private final Context d;
    private c f;

    public interface b {
        void a(AppDownloadTask appDownloadTask);
    }

    public interface c {
        void j(AppDownloadTask appDownloadTask);

        void k(AppDownloadTask appDownloadTask);

        void l(AppDownloadTask appDownloadTask);
    }

    interface d {
        void a();
    }

    public void b(AppDownloadTask appDownloadTask) {
        n nVar;
        if (appDownloadTask == null || (nVar = this.f18557b.get(appDownloadTask.n())) == null) {
            return;
        }
        nVar.c();
        bu.a(nVar.a());
        bu.a(nVar);
    }

    public void a(AppInfo appInfo) {
        if (appInfo == null) {
            return;
        }
        a(appInfo.getPackageName());
        this.f18557b.remove(appInfo.getPackageName());
    }

    public void a(c cVar) {
        this.f = cVar;
    }

    public void a(AppDownloadTask appDownloadTask, b bVar) {
        synchronized (this) {
            if (appDownloadTask != null) {
                if (appDownloadTask.B() != null) {
                    if (!com.huawei.openalliance.ad.utils.m.a().a(this.d)) {
                        appDownloadTask.a(com.huawei.openalliance.ad.download.e.FAILED);
                        if (bVar != null) {
                            bVar.a(appDownloadTask);
                        }
                        return;
                    } else if (this.f18557b.containsKey(appDownloadTask.n())) {
                        hw.c("AppRestoreHandler", "task already in restore processing");
                        return;
                    } else {
                        b(appDownloadTask, bVar);
                        return;
                    }
                }
            }
            hw.c("AppRestoreHandler", "task cant be null");
        }
    }

    public void a(AppDownloadTask appDownloadTask) {
        if (appDownloadTask == null) {
            return;
        }
        a(appDownloadTask.n());
    }

    private void d(final AppDownloadTask appDownloadTask) {
        if (this.f == null) {
            return;
        }
        if (appDownloadTask.i() == com.huawei.openalliance.ad.download.e.INSTALLED) {
            appDownloadTask.d(11);
            this.f.k(appDownloadTask);
        } else if (appDownloadTask.i() == com.huawei.openalliance.ad.download.e.DOWNLOADING || appDownloadTask.i() == com.huawei.openalliance.ad.download.e.INSTALLING) {
            bu.a(new Runnable() { // from class: com.huawei.openalliance.ad.download.app.i.3
                @Override // java.lang.Runnable
                public void run() {
                    if (i.this.f != null) {
                        i.this.f.j(appDownloadTask);
                    }
                }
            }, 50L);
        } else {
            this.f.l(appDownloadTask);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(AppDownloadTask appDownloadTask) {
        appDownloadTask.a(com.huawei.openalliance.ad.download.e.DOWNLOADING);
        appDownloadTask.b(50);
        d(appDownloadTask);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(n nVar, AppDownloadTask appDownloadTask) {
        a(appDownloadTask.B().getPackageName(), nVar);
        appDownloadTask.a(com.huawei.openalliance.ad.download.e.INSTALLING);
        d(appDownloadTask);
    }

    private void b(final AppDownloadTask appDownloadTask, final b bVar) {
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.download.app.i.1
            @Override // java.lang.Runnable
            public void run() {
                i.this.c(appDownloadTask);
                n nVar = new n(appDownloadTask.n(), new n.a() { // from class: com.huawei.openalliance.ad.download.app.i.1.1
                    @Override // com.huawei.openalliance.ad.download.app.n.a
                    public void b(n nVar2) {
                        i.this.a(nVar2, appDownloadTask);
                    }

                    @Override // com.huawei.openalliance.ad.download.app.n.a
                    public void a(n nVar2) {
                        i.this.b(nVar2, appDownloadTask);
                    }

                    @Override // com.huawei.openalliance.ad.download.app.n.a
                    public void a(int i) {
                        i.this.a(i, appDownloadTask, bVar);
                    }
                });
                i.this.f18557b.put(appDownloadTask.n(), nVar);
                bu.a(nVar, nVar.a(), 2500L);
            }
        });
    }

    private void b(int i, AppDownloadTask appDownloadTask, b bVar) {
        appDownloadTask.a(i == 0 ? com.huawei.openalliance.ad.download.e.INSTALLED : com.huawei.openalliance.ad.download.e.WAITING);
        appDownloadTask.b(0);
        if (bVar != null) {
            bVar.a(appDownloadTask);
        }
        d(appDownloadTask);
    }

    static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<Context> f18569c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f18567a = "appInstallListener-task";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final BroadcastReceiver f18568b = new BroadcastReceiver() { // from class: com.huawei.openalliance.ad.download.app.i.a.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                StringBuilder sb;
                Uri data;
                if (intent == null) {
                    return;
                }
                try {
                    SafeIntent safeIntent = new SafeIntent(intent);
                    String action = safeIntent.getAction();
                    hw.b("AppRestoreHandler", "itRe action: %s", action);
                    if ("android.intent.action.PACKAGE_ADDED".equals(action) && (data = safeIntent.getData()) != null) {
                        String schemeSpecificPart = data.getSchemeSpecificPart();
                        if (a.this.d.containsKey(schemeSpecificPart)) {
                            a.this.b(schemeSpecificPart);
                        }
                    }
                } catch (IllegalStateException e) {
                    e = e;
                    sb = new StringBuilder("itRe:");
                    sb.append(e.getClass().getSimpleName());
                    hw.c("AppRestoreHandler", sb.toString());
                } catch (Exception e2) {
                    e = e2;
                    sb = new StringBuilder("itRe:");
                    sb.append(e.getClass().getSimpleName());
                    hw.c("AppRestoreHandler", sb.toString());
                }
            }
        };
        private final Map<String, List<d>> d = new ConcurrentHashMap();

        public void a(String str, d dVar) {
            if (TextUtils.isEmpty(str) || dVar == null) {
                return;
            }
            List<d> arrayList = this.d.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(dVar);
            this.d.put(str, arrayList);
            a();
            d();
        }

        public void a(String str) {
            this.d.remove(str);
            if (this.d.isEmpty()) {
                c();
                b();
            }
        }

        private void d() {
            c();
            bu.a(new Runnable() { // from class: com.huawei.openalliance.ad.download.app.i.a.3
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b();
                }
            }, "appInstallListener-task", 6000L);
        }

        private void c() {
            bu.a("appInstallListener-task");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(final String str) {
            com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.download.app.i.a.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        List list = (List) a.this.d.get(str);
                        if (bm.a(list)) {
                            return;
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((d) it.next()).a();
                        }
                    } catch (Throwable unused) {
                        hw.c("AppRestoreHandler", "run callback task failed");
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            try {
                Context context = this.f18569c.get();
                if (context == null) {
                    return;
                }
                context.unregisterReceiver(this.f18568b);
            } catch (Throwable unused) {
                hw.c("AppRestoreHandler", "unregister receiver failed");
            }
        }

        private void a() {
            Context context = this.f18569c.get();
            if (context == null) {
                return;
            }
            hw.b("AppRestoreHandler", "registerAppInstReceiver");
            IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter.addDataScheme("package");
            as.a(context, this.f18568b, intentFilter);
        }

        public a(Context context) {
            this.f18569c = new WeakReference<>(context);
        }
    }

    private void a(String str, final n nVar) {
        this.f18558c.a(str, new d() { // from class: com.huawei.openalliance.ad.download.app.i.2
            @Override // com.huawei.openalliance.ad.download.app.i.d
            public void a() {
                n nVar2 = nVar;
                if (nVar2 != null) {
                    nVar2.a(0);
                }
            }
        });
    }

    private void a(String str) {
        n nVar = this.f18557b.get(str);
        if (nVar == null) {
            return;
        }
        nVar.b();
        bu.a(nVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(n nVar, AppDownloadTask appDownloadTask) {
        int iA = com.huawei.openalliance.ad.utils.m.a().a(this.d, appDownloadTask);
        hw.b("AppRestoreHandler", "remote ret:%s", Integer.valueOf(iA));
        if (nVar != null) {
            nVar.a(iA);
        }
    }

    public static void a(Context context) {
        synchronized (f18556a) {
            if (e == null) {
                e = new i(context);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, AppDownloadTask appDownloadTask, b bVar) {
        try {
            try {
                hw.b("AppRestoreHandler", "restore finished, result:%s", Integer.valueOf(i));
                this.f18558c.a(appDownloadTask.B().getPackageName());
                b(i, appDownloadTask, bVar);
            } finally {
                this.f18557b.remove(appDownloadTask.n());
            }
        } catch (Throwable unused) {
            hw.c("AppRestoreHandler", "handle restore result has exception");
        }
    }

    public static i a() {
        i iVar;
        synchronized (f18556a) {
            iVar = e;
            if (iVar == null) {
                throw new com.huawei.openalliance.ad.exception.b("AppRestoreHandler instance is not init!");
            }
        }
        return iVar;
    }

    private i(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            throw new com.huawei.openalliance.ad.exception.b("AppRestoreHandler init failed");
        }
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext;
        this.f18558c = new a(applicationContext);
    }
}
