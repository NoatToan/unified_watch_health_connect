package com.huawei.wearengine.auth;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import defpackage.yit;
import defpackage.yiv;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes46.dex */
public class WearEngineServiceClient {
    private Context d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f30758c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f30757b = new Object();
    private AuthListenerManager e = null;
    private AtomicBoolean i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f30759a = false;
    private ServiceConnection g = new ServiceConnection() { // from class: com.huawei.wearengine.auth.WearEngineServiceClient.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            yit.e("WearEngineServiceClient", "onServiceConnected success!");
            WearEngineServiceClient.this.e = AuthListenerManager.Stub.asInterface(iBinder);
            WearEngineServiceClient.this.i.getAndSet(true);
            synchronized (WearEngineServiceClient.f30757b) {
                WearEngineServiceClient.this.f30759a = true;
                WearEngineServiceClient.f30757b.notifyAll();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            yit.e("WearEngineServiceClient", "onServiceDisconnected success!");
            WearEngineServiceClient.this.e = null;
            WearEngineServiceClient.this.i.getAndSet(false);
            synchronized (WearEngineServiceClient.f30757b) {
                WearEngineServiceClient.this.f30759a = true;
                WearEngineServiceClient.f30757b.notifyAll();
            }
        }

        @Override // android.content.ServiceConnection
        public void onBindingDied(ComponentName componentName) {
            yit.a("WearEngineServiceClient", "onBindingDied!");
            WearEngineServiceClient.this.e = null;
            WearEngineServiceClient.this.i.getAndSet(false);
            synchronized (WearEngineServiceClient.f30757b) {
                WearEngineServiceClient.this.f30759a = true;
                WearEngineServiceClient.f30757b.notifyAll();
            }
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName componentName) {
            yit.a("WearEngineServiceClient", "onNullBinding!");
            WearEngineServiceClient.this.e = null;
            WearEngineServiceClient.this.i.getAndSet(false);
            synchronized (WearEngineServiceClient.f30757b) {
                WearEngineServiceClient.this.f30759a = true;
                WearEngineServiceClient.f30757b.notifyAll();
            }
        }
    };

    public WearEngineServiceClient(Context context) {
        this.d = context;
    }

    public void d() {
        synchronized (f30758c) {
            if (this.e != null) {
                yit.a("WearEngineServiceClient", "Already binder the WearEngineService.");
            } else {
                yit.e("WearEngineServiceClient", "Start to bind service.");
                b();
            }
        }
    }

    public AuthListenerManager e() {
        return this.e;
    }

    private void b() {
        synchronized (f30758c) {
            Intent intent = new Intent();
            intent.setPackage("com.huawei.health");
            intent.setClassName("com.huawei.health", "com.huawei.wearengine.service.WearEngineExtendService");
            intent.setAction("com.huawei.wearengine.action.AUTH_LISTENER_MANAGER");
            Intent intentD = yiv.d(intent);
            if (intentD == null) {
                return;
            }
            yit.e("WearEngineServiceClient", "explicitIntent != null, bindService");
            this.d.bindService(intentD, this.g, 1);
            g();
        }
    }

    private void g() {
        synchronized (f30757b) {
            yit.a("WearEngineServiceClient", "binder Lock enter!");
            while (!this.f30759a) {
                try {
                    yit.a("WearEngineServiceClient", "start Wait");
                    f30757b.wait(30000L);
                    this.f30759a = true;
                    yit.a("WearEngineServiceClient", "wait end");
                } catch (InterruptedException unused) {
                    yit.b("WearEngineServiceClient", "QUERY_LOCK wait error");
                }
            }
        }
    }

    public void c() {
        if (this.i.get()) {
            this.i.getAndSet(false);
            synchronized (f30758c) {
                try {
                    this.d.unbindService(this.g);
                } catch (IllegalArgumentException unused) {
                    yit.b("WearEngineServiceClient", "unBindService IllegalArgumentException");
                }
            }
        }
    }
}
