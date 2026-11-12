package k13;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import java.util.concurrent.Callable;
import q03.q;
import u03.d;
import w03.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile d<? super Throwable> f102397a;

    private a() {
        throw new IllegalStateException("No instances!");
    }

    public static q a(Callable<q> callable) {
        try {
            q qVarCall = callable.call();
            b.a(qVarCall, "Scheduler Callable result can't be null");
            return qVarCall;
        } catch (Throwable th3) {
            throw i13.d.b(th3);
        }
    }

    public static void b(Throwable th3) {
        d<? super Throwable> dVar = f102397a;
        if (th3 == null) {
            th3 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!(th3 instanceof OnErrorNotImplementedException) && !(th3 instanceof MissingBackpressureException) && !(th3 instanceof IllegalStateException) && !(th3 instanceof NullPointerException) && !(th3 instanceof IllegalArgumentException) && !(th3 instanceof CompositeException)) {
            th3 = new UndeliverableException(th3);
        }
        if (dVar != null) {
            try {
                dVar.accept(th3);
                return;
            } catch (Throwable th4) {
                th4.printStackTrace();
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th4);
            }
        }
        th3.printStackTrace();
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th3);
    }
}
