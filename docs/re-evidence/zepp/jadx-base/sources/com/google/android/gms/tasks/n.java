package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes3.dex */
final class n implements Runnable {
    public final /* synthetic */ Task a;
    public final /* synthetic */ o b;

    public n(o oVar, Task task) {
        this.b = oVar;
        this.a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.b) {
            o oVar = this.b;
            if (oVar.c != null) {
                oVar.c.onComplete(this.a);
            }
        }
    }
}
