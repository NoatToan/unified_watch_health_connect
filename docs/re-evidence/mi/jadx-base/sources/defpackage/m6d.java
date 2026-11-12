package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
public class m6d<V> implements lhe<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final lhe<?> f25806b = new m6d(null);
    public static final Logger c = Logger.getLogger(m6d.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V f25807a;

    public m6d(V v) {
        this.f25807a = v;
    }

    @Override // defpackage.lhe
    public void addListener(Runnable runnable, Executor executor) {
        c6i.p(runnable, "Runnable was null.");
        c6i.p(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = c;
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 57 + strValueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(strValueOf);
            sb.append(" with executor ");
            sb.append(strValueOf2);
            logger.log(level, sb.toString(), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.f25807a;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    public String toString() {
        String string = super.toString();
        String strValueOf = String.valueOf(this.f25807a);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 27 + strValueOf.length());
        sb.append(string);
        sb.append("[status=SUCCESS, result=[");
        sb.append(strValueOf);
        sb.append("]]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws ExecutionException {
        c6i.o(timeUnit);
        return get();
    }
}
