package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
abstract class f {
    private static volatile Handler d;
    private final z0 a;
    private final Runnable b;
    private volatile long c;

    public f(z0 z0Var) {
        Preconditions.checkNotNull(z0Var);
        this.a = z0Var;
        this.b = new e(this, z0Var);
    }

    private final Handler f() {
        Handler handler;
        if (d != null) {
            return d;
        }
        synchronized (f.class) {
            if (d == null) {
                d = new com.google.android.gms.internal.measurement.zzby(this.a.zzau().getMainLooper());
            }
            handler = d;
        }
        return handler;
    }

    public final void b() {
        this.c = 0L;
        f().removeCallbacks(this.b);
    }

    public abstract void c();

    public final void d(long j) {
        b();
        if (j >= 0) {
            this.c = this.a.zzav().currentTimeMillis();
            if (f().postDelayed(this.b, j)) {
                return;
            }
            this.a.zzay().zzd().zzb("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    public final boolean e() {
        return this.c != 0;
    }
}
