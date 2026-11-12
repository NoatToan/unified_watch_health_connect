package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class cg8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Executor f5303a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Executor f5304b = new b();

    public class a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            ulq.v(runnable);
        }
    }

    public class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return f5304b;
    }

    public static Executor b() {
        return f5303a;
    }
}
