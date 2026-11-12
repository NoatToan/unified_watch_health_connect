package com.sogou.map.loc;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

/* JADX INFO: loaded from: classes18.dex */
final class t2 {
    private Context a;
    private boolean b;
    private k2 c;
    private ServiceConnection d;

    private t2(Context context) {
        this.b = false;
        this.c = null;
        this.d = new u2(this);
        this.a = context;
    }

    public final synchronized k2 a() {
        k2 k2Var = this.c;
        if (k2Var == null || k2Var.g()) {
            this.c = new k2();
            if (!this.a.bindService(new Intent(this.a, (Class<?>) SGLocService.class), this.d, 1)) {
                r0.a(6, "locate", "Failed to bindService(" + SGLocService.class.getCanonicalName() + "), check configs in AndroidManifest.xml");
                this.c.f(null);
            }
        }
        return this.c;
    }

    public final synchronized void e() {
        if (this.b) {
            this.a.unbindService(this.d);
            this.b = false;
        }
    }

    public /* synthetic */ t2(Context context, byte b) {
        this(context);
    }
}
