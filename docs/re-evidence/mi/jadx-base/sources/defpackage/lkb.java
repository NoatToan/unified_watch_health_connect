package defpackage;

import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes7.dex */
public class lkb implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f25166a;

    public lkb(Handler handler) {
        Objects.requireNonNull(handler);
        this.f25166a = handler;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (this.f25166a.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(this.f25166a + " is shutting down");
    }
}
