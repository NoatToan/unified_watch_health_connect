package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class n implements ServiceConnection, zzs {
    private final Map<ServiceConnection, ServiceConnection> a = new HashMap();
    private int b = 2;
    private boolean c;

    @Nullable
    private IBinder d;
    private final zzn e;
    private ComponentName f;
    public final /* synthetic */ p g;

    public n(p pVar, zzn zznVar) {
        this.g = pVar;
        this.e = zznVar;
    }

    public final int a() {
        return this.b;
    }

    public final ComponentName b() {
        return this.f;
    }

    @Nullable
    public final IBinder c() {
        return this.d;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.a.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, @Nullable Executor executor) {
        this.b = 3;
        p pVar = this.g;
        boolean zZza = pVar.j.zza(pVar.g, str, this.e.zzc(pVar.g), this, this.e.zza(), executor);
        this.c = zZza;
        if (zZza) {
            this.g.h.sendMessageDelayed(this.g.h.obtainMessage(1, this.e), this.g.l);
        } else {
            this.b = 2;
            try {
                p pVar2 = this.g;
                pVar2.j.unbindService(pVar2.g, this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.a.remove(serviceConnection);
    }

    public final void g(String str) {
        this.g.h.removeMessages(1, this.e);
        p pVar = this.g;
        pVar.j.unbindService(pVar.g, this);
        this.c = false;
        this.b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.a.isEmpty();
    }

    public final boolean j() {
        return this.c;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.g.f) {
            this.g.h.removeMessages(1, this.e);
            this.d = iBinder;
            this.f = componentName;
            Iterator<ServiceConnection> it2 = this.a.values().iterator();
            while (it2.hasNext()) {
                it2.next().onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.g.f) {
            this.g.h.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            Iterator<ServiceConnection> it2 = this.a.values().iterator();
            while (it2.hasNext()) {
                it2.next().onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }
}
