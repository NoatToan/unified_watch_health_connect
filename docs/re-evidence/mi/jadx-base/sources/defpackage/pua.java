package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes5.dex */
public final class pua extends jab {

    public static final class a<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Future<V> f30787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final iua<? super V> f30788b;

        public a(Future<V> future, iua<? super V> iuaVar) {
            this.f30787a = future;
            this.f30788b = iuaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable thA;
            Future<V> future = this.f30787a;
            if ((future instanceof yed) && (thA = zed.a((yed) future)) != null) {
                this.f30788b.onFailure(thA);
                return;
            }
            try {
                this.f30788b.onSuccess(pua.b(this.f30787a));
            } catch (Error e) {
                e = e;
                this.f30788b.onFailure(e);
            } catch (RuntimeException e2) {
                e = e2;
                this.f30788b.onFailure(e);
            } catch (ExecutionException e3) {
                this.f30788b.onFailure(e3.getCause());
            }
        }

        public String toString() {
            return d8g.b(this).j(this.f30788b).toString();
        }
    }

    public static <V> void a(lhe<V> lheVar, iua<? super V> iuaVar, Executor executor) {
        c6i.o(iuaVar);
        lheVar.addListener(new a(lheVar, iuaVar), executor);
    }

    public static <V> V b(Future<V> future) throws ExecutionException {
        c6i.w(future.isDone(), "Future was expected to be done: %s", future);
        return (V) l9q.a(future);
    }

    public static <V> lhe<V> c(V v) {
        return v == null ? (lhe<V>) m6d.f25806b : new m6d(v);
    }

    public static <I, O> lhe<O> d(lhe<I> lheVar, dua<? super I, ? extends O> duaVar, Executor executor) {
        return w10.F(lheVar, duaVar, executor);
    }
}
