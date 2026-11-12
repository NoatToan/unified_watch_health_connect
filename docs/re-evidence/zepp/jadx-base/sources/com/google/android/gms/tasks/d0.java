package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
final class d0 implements Runnable {
    public final /* synthetic */ c0 a;
    public final /* synthetic */ Callable b;

    public d0(c0 c0Var, Callable callable) {
        this.a = c0Var;
        this.b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.b(this.b.call());
        } catch (Exception e) {
            this.a.a(e);
        } catch (Throwable th) {
            this.a.a(new RuntimeException(th));
        }
    }
}
