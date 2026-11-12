package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
public abstract class bct implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f4070a;

    public bct() {
        this.f4070a = null;
    }

    public abstract void a();

    public final TaskCompletionSource b() {
        return this.f4070a;
    }

    public final void c(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f4070a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            c(e);
        }
    }

    public bct(TaskCompletionSource taskCompletionSource) {
        this.f4070a = taskCompletionSource;
    }
}
