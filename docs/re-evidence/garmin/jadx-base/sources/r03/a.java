package r03;

import android.os.Handler;
import android.os.Looper;
import i13.d;
import j20.x;
import java.util.concurrent.Callable;
import q03.q;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f148953a;

    /* JADX INFO: renamed from: r03.a$a, reason: collision with other inner class name */
    public static class CallableC2809a implements Callable<q> {
        @Override // java.util.concurrent.Callable
        public final q call() {
            return b.f148954a;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r03.b f148954a = new r03.b(new Handler(Looper.getMainLooper()), false);

        private b() {
        }
    }

    static {
        new CallableC2809a();
        try {
            r03.b bVar = b.f148954a;
            if (bVar == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
            f148953a = bVar;
        } catch (Throwable th3) {
            throw d.b(th3);
        }
    }

    private a() {
        throw new AssertionError("No instances.");
    }

    public static q a() {
        q qVar = f148953a;
        if (qVar != null) {
            return qVar;
        }
        x.l("scheduler == null");
        return null;
    }
}
