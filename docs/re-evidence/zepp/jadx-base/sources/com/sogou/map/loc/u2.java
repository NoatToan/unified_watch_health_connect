package com.sogou.map.loc;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes18.dex */
final class u2 implements ServiceConnection {
    private /* synthetic */ t2 a;

    public u2(t2 t2Var) {
        this.a = t2Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.a) {
            try {
                r0.b("Service connection established");
                this.a.c.c(((e) iBinder).a);
                this.a.b = true;
            } catch (Exception unused) {
                this.a.b = true;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        r0.b("Service connection lost");
        synchronized (this.a) {
            this.a.c = null;
            this.a.b = false;
        }
    }
}
