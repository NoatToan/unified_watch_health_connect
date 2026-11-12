package com.garmin.android.apps.connectmobile.connectiq;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.connectiq.exception.InvalidStateException;
import com.garmin.android.connectiq.exception.ServiceUnavailableException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31837a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s0 f31840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f31841e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f31838b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f31839c = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ReentrantLock f31842f = new ReentrantLock();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile CountDownLatch f31843g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c1 f31844h = new c1(new cd0.h0(this, 6));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f31845i = new a();

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public final void onBindingDied(ComponentName componentName) {
            i2.n("CompanionAppServiceManager", "Binder service binding died: " + componentName.flattenToShortString());
            c.this.f31842f.lock();
            try {
                c cVar = c.this;
                cVar.f31840d = null;
                cVar.f31838b = false;
                if (c.this.f31844h.a()) {
                    i2.d("CompanionAppServiceManager", "Stopping 60 second timer due to binding death");
                    c.this.f31844h.c();
                }
            } finally {
                c.this.f31842f.unlock();
            }
        }

        @Override // android.content.ServiceConnection
        public final void onNullBinding(ComponentName componentName) {
            i2.i("CompanionAppServiceManager", "Binder service null binding: " + componentName.flattenToShortString());
            c.this.f31842f.lock();
            try {
                c cVar = c.this;
                cVar.f31840d = null;
                cVar.f31838b = false;
                c.this.f31839c = true;
                if (c.this.f31843g != null) {
                    c.this.f31843g.countDown();
                }
            } finally {
                c.this.f31842f.unlock();
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            i2.d("CompanionAppServiceManager", "Binder service connected: " + componentName.flattenToShortString());
            c.this.f31842f.lock();
            try {
                c.this.f31840d = s0.a.asInterface(iBinder);
                c.this.f31838b = true;
                c.this.f31839c = false;
                if (c.this.f31843g != null) {
                    c.this.f31843g.countDown();
                }
            } finally {
                c.this.f31842f.unlock();
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            i2.d("CompanionAppServiceManager", "Binder service disconnected: " + componentName.flattenToShortString());
            c.this.f31842f.lock();
            try {
                c cVar = c.this;
                cVar.f31840d = null;
                cVar.f31838b = false;
                if (c.this.f31844h.a()) {
                    i2.d("CompanionAppServiceManager", "Stopping 60 second timer due to service disconnection");
                    c.this.f31844h.c();
                }
            } finally {
                c.this.f31842f.unlock();
            }
        }
    }

    public c(String str) {
        i2.d("CompanionAppServiceManager", "Creating CompanionAppServiceManager with action: " + str);
        this.f31837a = str;
    }

    public final void a(Context context, String str) {
        i2.d("CompanionAppServiceManager", "Binding service with action: " + this.f31837a + " for package: " + str);
        this.f31842f.lock();
        try {
            if (this.f31838b) {
                i2.d("CompanionAppServiceManager", "Service already bound, resetting 60 second timer");
                c1 c1Var = this.f31844h;
                synchronized (c1Var) {
                    c1Var.b();
                }
            } else {
                this.f31841e = context;
                Intent intent = new Intent(this.f31837a);
                intent.setPackage(str);
                try {
                    o0 o0Var = o0.f31930a;
                    Context context2 = this.f31841e;
                    o0Var.getClass();
                    context2.getClass();
                    str.getClass();
                    if (!o0.a(context2, str)) {
                        com.garmin.proto.generated.a.h("Untrusted package: ".concat(str));
                    }
                    this.f31841e.bindService(intent, this.f31845i, 1);
                    this.f31843g = new CountDownLatch(1);
                    i2.d("CompanionAppServiceManager", "New bindingLatch created, waiting for service to bind");
                } catch (SecurityException e4) {
                    i2.i("CompanionAppServiceManager", "SecurityException while binding to service: " + e4.getMessage());
                    this.f31841e.unbindService(this.f31845i);
                }
            }
            this.f31842f.unlock();
        } catch (Throwable th3) {
            this.f31842f.unlock();
            throw th3;
        }
    }

    public final void b() {
        i2.d("CompanionAppServiceManager", "Shutting down CompanionAppServiceManager");
        this.f31842f.lock();
        try {
            if (this.f31843g != null) {
                this.f31843g.countDown();
            }
            this.f31842f.unlock();
            d();
            if (this.f31844h.a()) {
                i2.d("CompanionAppServiceManager", "Stopping 60 second timer due to instance shutdown");
                this.f31844h.c();
            }
            this.f31844h.f31849a.shutdown();
        } catch (Throwable th3) {
            this.f31842f.unlock();
            throw th3;
        }
    }

    public final String c(String str) {
        CountDownLatch countDownLatch = this.f31843g;
        if (!this.f31838b && countDownLatch != null) {
            i2.d("CompanionAppServiceManager", "Service not bound, waiting for service to bind");
            Thread thread = new Thread(new cd0.f(5, this, countDownLatch));
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException unused) {
                i2.i("CompanionAppServiceManager", "Thread interrupted while waiting for binding to complete");
                throw new InvalidStateException("Thread interrupted while waiting for binding to complete");
            }
        } else if (this.f31838b && countDownLatch != null) {
            this.f31842f.lock();
            try {
                i2.d("CompanionAppServiceManager", "Service bound, resetting bindingLatch");
                if (this.f31843g != null) {
                    this.f31843g.countDown();
                    this.f31843g = null;
                }
                this.f31842f.unlock();
            } catch (Throwable th3) {
                this.f31842f.unlock();
                throw th3;
            }
        }
        if (this.f31839c) {
            i2.i("CompanionAppServiceManager", "Service binding resulted in null binding");
            throw new InvalidStateException("Service binding resulted in null binding");
        }
        this.f31842f.lock();
        try {
            try {
                if (!this.f31838b) {
                    i2.i("CompanionAppServiceManager", "Service is not bound, cannot transfer data");
                    throw new InvalidStateException("Service is not bound, cannot transfer data");
                }
                i2.d("CompanionAppServiceManager", "Transferring data to companion app service");
                String strTransferData = this.f31840d.transferData(str);
                this.f31842f.unlock();
                return strTransferData;
            } catch (RemoteException e4) {
                i2.i("CompanionAppServiceManager", "RemoteException while transferring data: " + e4.getMessage());
                throw new ServiceUnavailableException(e4.getMessage());
            }
        } catch (Throwable th4) {
            this.f31842f.unlock();
            throw th4;
        }
    }

    public final void d() {
        this.f31842f.lock();
        try {
            if (this.f31838b) {
                i2.d("CompanionAppServiceManager", "Service bound. Unbinding service");
                this.f31841e.unbindService(this.f31845i);
                this.f31838b = false;
            }
        } finally {
            this.f31842f.unlock();
        }
    }
}
