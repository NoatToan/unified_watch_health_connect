package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class j implements Runnable {
    public final /* synthetic */ Task a;
    public final /* synthetic */ k b;

    public j(k kVar, Task task) {
        this.b = kVar;
        this.a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task task = (Task) this.b.b.then(this.a);
            if (task == null) {
                this.b.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = TaskExecutors.a;
            task.addOnSuccessListener(executor, this.b);
            task.addOnFailureListener(executor, this.b);
            task.addOnCanceledListener(executor, this.b);
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
