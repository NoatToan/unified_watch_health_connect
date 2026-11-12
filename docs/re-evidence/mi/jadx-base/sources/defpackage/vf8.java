package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class vf8 {

    public static class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f36841a;

        public a(Handler handler) {
            this.f36841a = (Handler) g6i.g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f36841a.post((Runnable) g6i.g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f36841a + " is shutting down");
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
