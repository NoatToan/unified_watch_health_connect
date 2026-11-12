package com.huawei.openalliance.ad;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import com.huawei.openalliance.ad.download.DownloadTask;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes12.dex */
public class dw extends com.huawei.openalliance.ad.download.b<dx> {
    private static dw f;
    private static final byte[] g = new byte[0];
    private dv h;
    private dn i;
    private a j;
    private BroadcastReceiver k;

    public void j() {
        List<dx> listC = this.e.c();
        if (hw.a()) {
            hw.a("VideoDownloadManager", "resumeAllTask, task.size: %d", Integer.valueOf(listC.size()));
        }
        if (listC.size() <= 0) {
            return;
        }
        a(listC);
    }

    public void i() {
        a(DownloadTask.c.HW_VIDEO);
    }

    public void b(DownloadTask.c cVar) {
        List<dx> listC = this.e.c();
        if (hw.a()) {
            hw.a("VideoDownloadManager", "resumeAllTask, task.size: %d", Integer.valueOf(listC.size()));
        }
        if (listC.size() <= 0) {
            return;
        }
        Collections.sort(listC);
        for (dx dxVar : listC) {
            if (dxVar.p() == cVar) {
                a(dxVar, false);
            }
        }
    }

    public String b(String str) {
        if (TextUtils.isEmpty(this.f18610b)) {
            this.f18610b = (String) com.huawei.openalliance.ad.utils.dj.b(new Callable<String>() { // from class: com.huawei.openalliance.ad.dw.2
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public String call() {
                    return dw.c(dw.this.f18609a);
                }
            });
        }
        return this.f18610b + File.separator + "tmp" + File.separator + str + ".tmp";
    }

    public boolean a(dx dxVar, boolean z) {
        return a(dxVar, false, z, true);
    }

    @Override // com.huawei.openalliance.ad.download.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean c(dx dxVar) {
        if (dxVar == null) {
            hw.c("VideoDownloadManager", "cannot add task, task is null");
            return false;
        }
        if (hw.a()) {
            hw.a("VideoDownloadManager", "addTask, taskid: %s", com.huawei.openalliance.ad.utils.ds.a(dxVar.n()));
        }
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.dw.3
            @Override // java.lang.Runnable
            public void run() {
                dw.this.k();
            }
        });
        return super.c(dxVar);
    }

    void a(DownloadTask.c cVar) {
        List listD = this.e.d();
        if (hw.a()) {
            hw.a("VideoDownloadManager", "pauseAllTask.begin, task.size: %d", Integer.valueOf(listD.size()));
        }
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            a((dx) it.next(), cVar);
        }
        if (hw.a()) {
            hw.a("VideoDownloadManager", "pauseAllTask.end, task.size: %d", Integer.valueOf(listD.size()));
        }
    }

    public dx a(du duVar) {
        if (TextUtils.isEmpty(duVar.a())) {
            hw.c("VideoDownloadManager", "downloadVideo - empty video url");
            return null;
        }
        a(duVar.e());
        dx dxVarA = a(com.huawei.openalliance.ad.utils.db.a(duVar.a()));
        dx dxVarB = dxVarA instanceof dx ? dxVarA : null;
        if (dxVarB == null) {
            dxVarB = b(duVar.a(), duVar.b(), duVar.c(), duVar.d(), duVar.h(), duVar.i());
            if (dxVarB == null) {
                return null;
            }
            b(duVar, dxVarB);
            if (dxVarB.l() >= 100) {
                ey.a(this.f18609a).a(a(duVar, dxVarB), "normal");
                Integer numM = duVar.m();
                if (numM == null) {
                    numM = Integer.valueOf(dm.a(dxVarB.G()));
                }
                this.i.a(dxVarB.d(), numM.intValue());
                h(dxVarB);
            } else {
                c(dxVarB);
            }
        } else {
            hw.b("VideoDownloadManager", "downloadVideo - task %s is already in queue, resume it", com.huawei.openalliance.ad.utils.ds.a(dxVarA.n()));
            b(duVar, dxVarB);
            a(dxVarB, false);
        }
        dxVarB.a(duVar.g());
        dxVarB.e(duVar.l());
        return dxVarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        String str;
        try {
            String str2 = this.f18610b + File.separator + "tmp" + File.separator;
            String[] list = new File(str2).list();
            if (list != null && list.length > 0) {
                a(str2, list);
            }
        } catch (IllegalStateException unused) {
            str = "deleteTimeoutFile IllegalStateException";
            hw.c("VideoDownloadManager", str);
        } catch (Exception unused2) {
            str = "deleteTimeoutFile exception";
            hw.c("VideoDownloadManager", str);
        }
    }

    public static dw h() {
        dw dwVar;
        synchronized (g) {
            dwVar = f;
            if (dwVar == null) {
                throw new com.huawei.openalliance.ad.exception.b("VideoDownloadManager inst is not initialize!");
            }
        }
        return dwVar;
    }

    private static String c(String str) {
        int iIndexOf = str.indexOf(".tmp");
        if (iIndexOf > 0) {
            return str.substring(0, iIndexOf);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(Context context) {
        File cacheDir;
        if (context == null || (cacheDir = context.getCacheDir()) == null) {
            return null;
        }
        return com.huawei.openalliance.ad.utils.ai.h(cacheDir) + File.separator + Constants.PPS_ROOT_PATH + File.separator + "placement";
    }

    private void b(du duVar, dx dxVar) {
        dxVar.a(duVar.f());
        dxVar.d(duVar.j());
        dxVar.a(a(duVar, dxVar));
    }

    private dx b(String str, int i, boolean z, String str2, String str3, String str4) {
        File file;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        dx dxVarA = a(str, i, z, str2, str3, str4);
        String strC = this.i.c(dxVarA.d());
        File file2 = strC != null ? new File(strC) : null;
        if (file2 == null || !file2.exists()) {
            File file3 = new File(dxVarA.e());
            if (!file3.exists()) {
                return dxVarA;
            }
            file = file3;
        } else {
            file = file2;
        }
        return a(dxVarA, i, z, str2, file);
    }

    private void a(List<dx> list) {
        Collections.sort(list);
        for (dx dxVar : list) {
            DownloadTask.c cVarP = dxVar.p();
            if (cVarP == DownloadTask.c.NETWORK_CHANGED || cVarP == DownloadTask.c.HW_VIDEO) {
                a(dxVar, false);
            }
        }
    }

    private void a(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (str2.endsWith(".tmp")) {
                File file = new File(str + str2);
                if (!file.isDirectory() && System.currentTimeMillis() - file.lastModified() > Constants.ANALYSIS_EVENT_KEEP_TIME) {
                    hw.b("VideoDownloadManager", "remove timeout file");
                    dx dxVarA = a(c(str2));
                    if (dxVarA == null || !(dxVarA instanceof dx)) {
                        com.huawei.openalliance.ad.utils.ai.e(file);
                    } else {
                        a(dxVarA, true);
                    }
                }
            }
        }
    }

    public static void a(Context context) {
        synchronized (g) {
            if (f == null) {
                f = new dw(context);
            }
        }
    }

    public static dx a(String str, int i, boolean z, String str2, String str3, String str4) {
        dx dxVarA = new dx.a().a(true).a(str).a(i).b(str2).c(str3).d(str4).a();
        dxVarA.d(z);
        return dxVarA;
    }

    private dx a(dx dxVar, int i, boolean z, String str, File file) {
        long length = file.length();
        dxVar.b(length);
        long j = i;
        if (length != j && i != 0) {
            if (length < j) {
                dxVar.b((int) ((length * 100) / j));
                return dxVar;
            }
            com.huawei.openalliance.ad.utils.ai.e(file);
            dxVar.b(0);
            dxVar.b(0L);
            return dxVar;
        }
        if (!z || com.huawei.openalliance.ad.utils.ai.a(str, file)) {
            dxVar.b(100);
            dxVar.a(com.huawei.openalliance.ad.download.e.DOWNLOADED);
            return dxVar;
        }
        dxVar.b(0L);
        dxVar.b(0);
        com.huawei.openalliance.ad.utils.ai.e(file);
        return dxVar;
    }

    class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f18662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ConnectivityManager.NetworkCallback f18663c = new ConnectivityManager.NetworkCallback() { // from class: com.huawei.openalliance.ad.dw.a.1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                super.onLost(network);
                final Context applicationContext = a.this.f18662b.getApplicationContext();
                if (hw.a()) {
                    hw.a("VideoDownloadManager", "net onLost, active netType: %s, [0:UNKNOWN, 1:ETHERNET, 2:WIFI, 4/5/6/7:2G/3G/4G/5G]", Integer.valueOf(com.huawei.openalliance.ad.utils.cb.d(applicationContext)));
                }
                if (fp.b(applicationContext).bf()) {
                    com.huawei.openalliance.ad.utils.o.g(new Runnable() { // from class: com.huawei.openalliance.ad.dw.a.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (com.huawei.openalliance.ad.utils.cb.e(applicationContext) && com.huawei.openalliance.ad.utils.cb.c(applicationContext)) {
                                dw.this.j();
                            } else {
                                if (com.huawei.openalliance.ad.utils.cb.e(applicationContext) && com.huawei.openalliance.ad.utils.cb.c(applicationContext)) {
                                    return;
                                }
                                dw.this.a(DownloadTask.c.NETWORK_CHANGED);
                            }
                        }
                    });
                } else {
                    hw.b("VideoDownloadManager", "user info is not enabled");
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                super.onAvailable(network);
                final Context applicationContext = a.this.f18662b.getApplicationContext();
                if (hw.a()) {
                    hw.a("VideoDownloadManager", "net onAvailable, active netType: %s, [0:UNKNOWN, 1:ETHERNET, 2:WIFI, 4/5/6/7:2G/3G/4G/5G]", Integer.valueOf(com.huawei.openalliance.ad.utils.cb.d(applicationContext)));
                }
                if (fp.b(applicationContext).bf()) {
                    com.huawei.openalliance.ad.utils.o.g(new Runnable() { // from class: com.huawei.openalliance.ad.dw.a.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (com.huawei.openalliance.ad.utils.cb.e(applicationContext) && com.huawei.openalliance.ad.utils.cb.c(applicationContext)) {
                                dw.this.j();
                            } else {
                                if (com.huawei.openalliance.ad.utils.cb.e(applicationContext) && com.huawei.openalliance.ad.utils.cb.c(applicationContext)) {
                                    return;
                                }
                                dw.this.a(DownloadTask.c.NETWORK_CHANGED);
                            }
                        }
                    });
                } else {
                    hw.b("VideoDownloadManager", "user info is not enabled");
                }
            }
        };

        public void a() {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f18662b.getSystemService("connectivity");
                NetworkRequest.Builder builder = new NetworkRequest.Builder();
                builder.addTransportType(0).addTransportType(3).addTransportType(1);
                connectivityManager.registerNetworkCallback(builder.build(), this.f18663c);
            } catch (Throwable unused) {
                hw.c("VideoDownloadManager", "register all network callback exception.");
            }
        }

        public a(Context context) {
            this.f18662b = context;
        }
    }

    private ContentResource a(du duVar, dx dxVar) {
        if (dxVar == null || TextUtils.isEmpty(dxVar.B())) {
            return null;
        }
        ContentResource contentResource = new ContentResource();
        contentResource.a(dxVar.G());
        Integer numM = duVar.m();
        if (numM == null) {
            numM = Integer.valueOf(dm.a(dxVar.G()));
        }
        contentResource.b(numM.intValue());
        contentResource.c(dxVar.B());
        contentResource.b(dxVar.C());
        contentResource.a(dxVar.n());
        contentResource.c(!duVar.k() ? 1 : 0);
        contentResource.d(duVar.k() ? 3 : 2);
        return contentResource;
    }

    private dw(final Context context) {
        String str;
        super(context);
        this.k = new BroadcastReceiver() { // from class: com.huawei.openalliance.ad.dw.4
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (hw.a()) {
                    hw.a("VideoDownloadManager", "networkReceiver.onReceive, action: %s", intent.getAction());
                }
                final Context applicationContext = context2.getApplicationContext();
                if (fp.b(applicationContext).bf()) {
                    com.huawei.openalliance.ad.utils.o.g(new Runnable() { // from class: com.huawei.openalliance.ad.dw.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (!com.huawei.openalliance.ad.utils.cb.e(applicationContext) || !com.huawei.openalliance.ad.utils.cb.c(applicationContext)) {
                                dw.this.a(DownloadTask.c.NETWORK_CHANGED);
                            } else if (com.huawei.openalliance.ad.utils.cb.c(applicationContext)) {
                                dw.this.b(DownloadTask.c.NETWORK_CHANGED);
                            }
                        }
                    });
                } else {
                    hw.b("VideoDownloadManager", "user info is not enabled");
                }
            }
        };
        try {
            super.a();
            dv dvVar = new dv(context);
            this.h = dvVar;
            super.a(dvVar);
            com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.dw.1
                @Override // java.lang.Runnable
                public void run() {
                    dw.this.f18610b = dw.c(context);
                }
            });
            a aVar = new a(this.f18609a);
            this.j = aVar;
            aVar.a();
            this.i = dk.a(context, "normal");
        } catch (IllegalStateException unused) {
            str = "initialize IllegalStateException";
            hw.c("VideoDownloadManager", str);
        } catch (Exception unused2) {
            str = "initialize exception";
            hw.c("VideoDownloadManager", str);
        }
    }
}
