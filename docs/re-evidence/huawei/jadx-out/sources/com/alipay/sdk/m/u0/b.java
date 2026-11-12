package com.alipay.sdk.m.u0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.alipay.sdk.m.t0.a;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f2134a = "OpenDeviceId library";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f2135b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ServiceConnection f2136c;
    public a d;
    public Context e = null;
    public InterfaceC0022b j = null;

    /* JADX INFO: renamed from: com.alipay.sdk.m.u0.b$b, reason: collision with other inner class name */
    public interface InterfaceC0022b<T> {
        void a(T t, b bVar);
    }

    public class c implements ServiceConnection {
        public c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (this) {
                b.this.d = a.AbstractBinderC0021a.a(iBinder);
                if (b.this.j != null) {
                    b.this.j.a("Deviceid Service Connected", b.this);
                }
                b.this.b("Service onServiceConnected");
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            b.this.d = null;
            b.this.b("Service onServiceDisconnected");
        }
    }

    public String a() {
        if (this.e == null) {
            e("Context is null.");
            throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
        }
        try {
            a aVar = this.d;
            if (aVar != null) {
                return aVar.a();
            }
            return null;
        } catch (RemoteException e) {
            e("getOAID error, RemoteException!");
            e.printStackTrace();
            return null;
        }
    }

    public boolean e() {
        try {
            if (this.d == null) {
                return false;
            }
            b("Device support opendeviceid");
            return this.d.c();
        } catch (RemoteException unused) {
            e("isSupport error, RemoteException!");
            return false;
        }
    }

    public int c(Context context, InterfaceC0022b<String> interfaceC0022b) {
        if (context != null) {
            this.e = context;
            this.j = interfaceC0022b;
            this.f2136c = new c();
            Intent intent = new Intent();
            intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
            if (this.e.bindService(intent, this.f2136c, 1)) {
                b("bindService Successful!");
                return 1;
            }
            b("bindService Failed!");
            return -1;
        }
        throw new NullPointerException("Context can not be null.");
    }

    public final void b(String str) {
        if (f2135b) {
            Log.i(f2134a, str);
        }
    }

    public final void e(String str) {
        if (f2135b) {
            Log.e(f2134a, str);
        }
    }
}
