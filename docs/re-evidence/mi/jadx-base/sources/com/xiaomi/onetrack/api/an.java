package com.xiaomi.onetrack.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.RemoteException;
import com.xiaomi.onetrack.Configuration;
import defpackage.vzc;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public class an {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f13740a = "com.miui.analytics";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f13741b = "com.miui.analytics.onetrack.OneTrackService";
    private static final String c = "ServiceConnectManager";
    private static final int g = 1;
    private static final int h = 2;
    private vzc d;
    private AtomicBoolean e;
    private Context f;
    private c i;
    private ServiceConnection j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CopyOnWriteArrayList<b> f13742k;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static an f13743a = new an();

        private a() {
        }
    }

    public interface b {
        void a();
    }

    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                an.this.d();
            } else if (i == 2) {
                an.this.b();
            }
        }
    }

    private an() {
        this.e = new AtomicBoolean(false);
        this.j = new ServiceConnection() { // from class: com.xiaomi.onetrack.api.ServiceConnectionManager$1
            @Override // android.content.ServiceConnection
            public void onBindingDied(ComponentName componentName) {
                try {
                    this.f13712a.d = null;
                    this.f13712a.e.set(false);
                    try {
                        this.f13712a.f.unbindService(this.f13712a.j);
                    } catch (Exception e) {
                        com.xiaomi.onetrack.util.p.a("ServiceConnectManager", "unbindService error: " + e.toString());
                    }
                } catch (Throwable th) {
                    com.xiaomi.onetrack.util.p.a("ServiceConnectManager", "onBindingDied throwable:" + th.getMessage());
                }
            }

            @Override // android.content.ServiceConnection
            public void onNullBinding(ComponentName componentName) {
                try {
                    this.f13712a.d = null;
                    this.f13712a.e.set(false);
                } catch (Throwable th) {
                    com.xiaomi.onetrack.util.p.a("ServiceConnectManager", "onNullBinding throwable:" + th.getMessage());
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                try {
                    int i = 0;
                    this.f13712a.e.set(false);
                    this.f13712a.d = vzc.a.s2(iBinder);
                    this.f13712a.e();
                    StringBuilder sb = new StringBuilder();
                    sb.append("onServiceConnected  mConnecting ");
                    sb.append(this.f13712a.e);
                    sb.append(" mIOneTrackService ");
                    if (this.f13712a.d != null) {
                        i = 1;
                    }
                    sb.append(i);
                    sb.append(" pid:");
                    sb.append(Process.myPid());
                    sb.append(" tid:");
                    sb.append(Process.myTid());
                    com.xiaomi.onetrack.util.p.a("ServiceConnectManager", sb.toString());
                } catch (Throwable th) {
                    com.xiaomi.onetrack.util.p.a("ServiceConnectManager", "onServiceConnected throwable:" + th.getMessage());
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                try {
                    this.f13712a.d = null;
                    int i = 0;
                    this.f13712a.e.set(false);
                    StringBuilder sb = new StringBuilder();
                    sb.append("onServiceDisconnected:  mConnecting ");
                    sb.append(this.f13712a.e);
                    sb.append(" mIOneTrackService ");
                    if (this.f13712a.d != null) {
                        i = 1;
                    }
                    sb.append(i);
                    com.xiaomi.onetrack.util.p.a("ServiceConnectManager", sb.toString());
                } catch (Throwable th) {
                    com.xiaomi.onetrack.util.p.a("ServiceConnectManager", "onServiceDisconnected throwable:" + th.getMessage());
                }
            }
        };
        this.f13742k = new CopyOnWriteArrayList<>();
        this.f = com.xiaomi.onetrack.f.a.b();
        this.i = new c(Looper.getMainLooper());
        b();
    }

    private void c() {
        try {
            Intent intent = new Intent();
            intent.setClassName("com.miui.analytics", f13741b);
            boolean zBindService = this.f.bindService(intent, this.j, 1);
            if (zBindService) {
                this.e.set(true);
            } else {
                this.e.set(false);
                this.f.unbindService(this.j);
            }
            com.xiaomi.onetrack.util.p.a(c, "bindService:  mConnecting: " + this.e + " bindResult:" + zBindService);
        } catch (Exception e) {
            try {
                this.e.set(false);
                this.f.unbindService(this.j);
            } catch (Exception e2) {
                StringBuilder sb = new StringBuilder();
                sb.append("bindService e1: ");
                sb.append(e2.toString());
            }
            com.xiaomi.onetrack.util.p.b(c, "bindService e: " + e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            if (this.d != null) {
                this.f.unbindService(this.j);
                this.d = null;
            }
        } catch (Exception e) {
            com.xiaomi.onetrack.util.p.a(c, "unBindService: " + e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Iterator<b> it = this.f13742k.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void b(String str, String str2, Configuration configuration, boolean z) {
        try {
            String appId = configuration.getAppId();
            if (z) {
                appId = configuration.getAdEventAppId();
            }
            this.d.f3(appId, com.xiaomi.onetrack.f.a.e(), str, str2);
        } catch (Exception e) {
            com.xiaomi.onetrack.util.p.b(c, "trackCacheData error:" + e.toString());
        }
    }

    public static an a() {
        return a.f13743a;
    }

    public boolean a(String str, String str2, Configuration configuration, boolean z) {
        if (this.d != null) {
            try {
                String appId = configuration.getAppId();
                if (z) {
                    appId = configuration.getAdEventAppId();
                }
                this.d.f3(appId, com.xiaomi.onetrack.f.a.e(), str, str2);
                return true;
            } catch (RemoteException e) {
                d();
                this.e.set(false);
                com.xiaomi.onetrack.util.p.a(c, "track error: " + e.toString());
                return false;
            } catch (NullPointerException unused) {
                return false;
            }
        }
        this.i.sendEmptyMessage(2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        com.xiaomi.onetrack.util.p.a(c, "ensureService start...");
        if (!this.e.get() && this.d == null) {
            c();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ensureService mConnecting: ");
        sb.append(this.e.get());
        sb.append(" mAnalytics: ");
        sb.append(this.d == null ? 0 : 1);
        com.xiaomi.onetrack.util.p.a(c, sb.toString());
    }

    public void a(b bVar) {
        if (this.f13742k.contains(bVar)) {
            return;
        }
        this.f13742k.add(bVar);
    }

    public void a(int i) {
        if (i == 2) {
            this.i.sendEmptyMessageDelayed(1, 5000L);
        } else if (this.i.hasMessages(1)) {
            this.i.removeMessages(1);
        }
    }
}
