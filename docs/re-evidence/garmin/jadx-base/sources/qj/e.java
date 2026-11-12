package qj;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f144968a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f144969b;

    public class a implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            m.f().post(runnable);
        }
    }

    public class b implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            m.f().postAtFrontOfQueue(runnable);
        }
    }

    public class c implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }

    static {
        new b();
        f144969b = new c();
    }

    private e() {
    }
}
