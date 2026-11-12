package ef;

import android.os.Handler;
import android.os.Looper;
import df.r;
import gl1.y;
import java.util.concurrent.Executor;
import o53.z;

/* JADX INFO: loaded from: classes7.dex */
public class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f63931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f63932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f63933c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f63934d = new a();

    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.this.f63933c.post(runnable);
        }
    }

    public c(Executor executor) {
        r rVar = new r(executor);
        this.f63931a = rVar;
        this.f63932b = y.o(rVar);
    }

    @Override // ef.b
    public final z a() {
        return this.f63932b;
    }

    @Override // ef.b
    public final a c() {
        return this.f63934d;
    }

    @Override // ef.b
    public final r d() {
        return this.f63931a;
    }
}
