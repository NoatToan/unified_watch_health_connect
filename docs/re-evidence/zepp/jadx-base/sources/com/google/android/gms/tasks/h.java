package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes3.dex */
final class h implements Runnable {
    public final /* synthetic */ Task a;
    public final /* synthetic */ i b;

    public h(i iVar, Task task) {
        this.b = iVar;
        this.a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.isCanceled()) {
            this.b.c.c();
            return;
        }
        try {
            this.b.c.b(this.b.b.then(this.a));
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.b.c.a((Exception) e.getCause());
            } else {
                this.b.c.a(e);
            }
        } catch (Exception e2) {
            this.b.c.a(e2);
        }
    }
}
