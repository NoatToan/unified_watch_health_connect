package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutionException;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
final class f implements e {
    private final Object a = new Object();
    private final int b;
    private final c0<Void> c;

    @GuardedBy("mLock")
    private int d;

    @GuardedBy("mLock")
    private int e;

    @GuardedBy("mLock")
    private int f;

    @GuardedBy("mLock")
    private Exception g;

    @GuardedBy("mLock")
    private boolean h;

    public f(int i, c0<Void> c0Var) {
        this.b = i;
        this.c = c0Var;
    }

    @GuardedBy("mLock")
    private final void a() {
        if (this.d + this.e + this.f == this.b) {
            if (this.g == null) {
                if (this.h) {
                    this.c.c();
                    return;
                } else {
                    this.c.b(null);
                    return;
                }
            }
            c0<Void> c0Var = this.c;
            int i = this.e;
            int i2 = this.b;
            StringBuilder sb = new StringBuilder(54);
            sb.append(i);
            sb.append(" out of ");
            sb.append(i2);
            sb.append(" underlying tasks failed");
            c0Var.a(new ExecutionException(sb.toString(), this.g));
        }
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        synchronized (this.a) {
            this.f++;
            this.h = true;
            a();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(@NonNull Exception exc) {
        synchronized (this.a) {
            this.e++;
            this.g = exc;
            a();
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        synchronized (this.a) {
            this.d++;
            a();
        }
    }
}
