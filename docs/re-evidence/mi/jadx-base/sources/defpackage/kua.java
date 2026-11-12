package defpackage;

import androidx.annotation.RequiresApi;
import androidx.arch.core.util.Function;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class kua<V> implements lhe<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lhe<V> f24296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public cb3.a<V> f24297b;

    public class a implements cb3.c<V> {
        public a() {
        }

        @Override // cb3.c
        public Object a(cb3.a<V> aVar) {
            g6i.j(kua.this.f24297b == null, "The result can only set once!");
            kua.this.f24297b = aVar;
            return "FutureChain[" + kua.this + "]";
        }
    }

    public kua(lhe<V> lheVar) {
        this.f24296a = (lhe) g6i.g(lheVar);
    }

    public static <V> kua<V> a(lhe<V> lheVar) {
        return lheVar instanceof kua ? (kua) lheVar : new kua<>(lheVar);
    }

    @Override // defpackage.lhe
    public void addListener(Runnable runnable, Executor executor) {
        this.f24296a.addListener(runnable, executor);
    }

    public boolean b(V v) {
        cb3.a<V> aVar = this.f24297b;
        if (aVar != null) {
            return aVar.c(v);
        }
        return false;
    }

    public boolean c(Throwable th) {
        cb3.a<V> aVar = this.f24297b;
        if (aVar != null) {
            return aVar.f(th);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f24296a.cancel(z);
    }

    public final <T> kua<T> d(Function<? super V, T> function, Executor executor) {
        return (kua) oua.o(this, function, executor);
    }

    public final <T> kua<T> e(fl1<? super V, T> fl1Var, Executor executor) {
        return (kua) oua.p(this, fl1Var, executor);
    }

    @Override // java.util.concurrent.Future
    public V get() throws ExecutionException, InterruptedException {
        return this.f24296a.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f24296a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f24296a.isDone();
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f24296a.get(j, timeUnit);
    }

    public kua() {
        this.f24296a = cb3.a(new a());
    }
}
