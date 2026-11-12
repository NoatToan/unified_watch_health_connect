package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
final class p implements Runnable {
    public final /* synthetic */ Task a;
    public final /* synthetic */ q b;

    public p(q qVar, Task task) {
        this.b = qVar;
        this.a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.b) {
            q qVar = this.b;
            if (qVar.c != null) {
                qVar.c.onFailure((Exception) Preconditions.checkNotNull(this.a.getException()));
            }
        }
    }
}
