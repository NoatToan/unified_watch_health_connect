package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class u implements Runnable {
    public final /* synthetic */ Task a;
    public final /* synthetic */ v b;

    public u(v vVar, Task task) {
        this.b = vVar;
        this.a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task taskThen = this.b.b.then(this.a.getResult());
            if (taskThen == null) {
                this.b.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = TaskExecutors.a;
            taskThen.addOnSuccessListener(executor, this.b);
            taskThen.addOnFailureListener(executor, this.b);
            taskThen.addOnCanceledListener(executor, this.b);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.b.onFailure((Exception) e.getCause());
            } else {
                this.b.onFailure(e);
            }
        } catch (CancellationException unused) {
            this.b.onCanceled();
        } catch (Exception e2) {
            this.b.onFailure(e2);
        }
    }
}
