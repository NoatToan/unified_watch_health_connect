package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes5.dex */
public final class c8g {

    public class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Executor f5048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t00 f5049b;

        public a(Executor executor, t00 t00Var) {
            this.f5048a = executor;
            this.f5049b = t00Var;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                this.f5048a.execute(runnable);
            } catch (RejectedExecutionException e) {
                this.f5049b.C(e);
            }
        }
    }

    public static Executor a() {
        return vx6.INSTANCE;
    }

    public static Executor b(Executor executor, t00<?> t00Var) {
        c6i.o(executor);
        c6i.o(t00Var);
        return executor == a() ? executor : new a(executor, t00Var);
    }
}
