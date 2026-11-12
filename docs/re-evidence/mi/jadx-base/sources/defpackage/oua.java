package defpackage;

import androidx.annotation.RequiresApi;
import androidx.arch.core.util.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class oua {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Function<?, ?> f29685a = new b();

    /* JADX INFO: Add missing generic type declarations: [I, O] */
    public class a<I, O> implements fl1<I, O> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function f29686a;

        public a(Function function) {
            this.f29686a = function;
        }

        @Override // defpackage.fl1
        public lhe<O> apply(I i) {
            return oua.h(this.f29686a.apply(i));
        }
    }

    public class b implements Function<Object, Object> {
        @Override // androidx.arch.core.util.Function
        public Object apply(Object obj) {
            return obj;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class c<I> implements jua<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ cb3.a f29687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function f29688b;

        public c(cb3.a aVar, Function function) {
            this.f29687a = aVar;
            this.f29688b = function;
        }

        @Override // defpackage.jua
        public void onFailure(Throwable th) {
            this.f29687a.f(th);
        }

        @Override // defpackage.jua
        public void onSuccess(I i) {
            try {
                this.f29687a.c(this.f29688b.apply(i));
            } catch (Throwable th) {
                this.f29687a.f(th);
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ lhe f29689a;

        public d(lhe lheVar) {
            this.f29689a = lheVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29689a.cancel(true);
        }
    }

    public static final class e<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Future<V> f29690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final jua<? super V> f29691b;

        public e(Future<V> future, jua<? super V> juaVar) {
            this.f29690a = future;
            this.f29691b = juaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f29691b.onSuccess(oua.d(this.f29690a));
            } catch (Error e) {
                e = e;
                this.f29691b.onFailure(e);
            } catch (RuntimeException e2) {
                e = e2;
                this.f29691b.onFailure(e);
            } catch (ExecutionException e3) {
                this.f29691b.onFailure(e3.getCause());
            }
        }

        public String toString() {
            return e.class.getSimpleName() + "," + this.f29691b;
        }
    }

    public static <V> void b(lhe<V> lheVar, jua<? super V> juaVar, Executor executor) {
        g6i.g(juaVar);
        lheVar.addListener(new e(lheVar, juaVar), executor);
    }

    public static <V> lhe<List<V>> c(Collection<? extends lhe<? extends V>> collection) {
        return new vge(new ArrayList(collection), true, li3.a());
    }

    public static <V> V d(Future<V> future) throws ExecutionException {
        g6i.j(future.isDone(), "Future was expected to be done, " + future);
        return (V) e(future);
    }

    public static <V> V e(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    public static <V> lhe<V> f(Throwable th) {
        return new l6d.a(th);
    }

    public static <V> ScheduledFuture<V> g(Throwable th) {
        return new l6d.b(th);
    }

    public static <V> lhe<V> h(V v) {
        return v == null ? l6d.a() : new l6d.c(v);
    }

    public static /* synthetic */ Object i(lhe lheVar, cb3.a aVar) throws Exception {
        m(false, lheVar, f29685a, aVar, li3.a());
        return "nonCancellationPropagating[" + lheVar + "]";
    }

    public static <V> lhe<V> j(final lhe<V> lheVar) {
        g6i.g(lheVar);
        return lheVar.isDone() ? lheVar : cb3.a(new cb3.c() { // from class: nua
            @Override // cb3.c
            public final Object a(cb3.a aVar) {
                return oua.i(lheVar, aVar);
            }
        });
    }

    public static <V> void k(lhe<V> lheVar, cb3.a<V> aVar) {
        l(lheVar, f29685a, aVar, li3.a());
    }

    public static <I, O> void l(lhe<I> lheVar, Function<? super I, ? extends O> function, cb3.a<O> aVar, Executor executor) {
        m(true, lheVar, function, aVar, executor);
    }

    public static <I, O> void m(boolean z, lhe<I> lheVar, Function<? super I, ? extends O> function, cb3.a<O> aVar, Executor executor) {
        g6i.g(lheVar);
        g6i.g(function);
        g6i.g(aVar);
        g6i.g(executor);
        b(lheVar, new c(aVar, function), executor);
        if (z) {
            aVar.a(new d(lheVar), li3.a());
        }
    }

    public static <V> lhe<List<V>> n(Collection<? extends lhe<? extends V>> collection) {
        return new vge(new ArrayList(collection), false, li3.a());
    }

    public static <I, O> lhe<O> o(lhe<I> lheVar, Function<? super I, ? extends O> function, Executor executor) {
        g6i.g(function);
        return p(lheVar, new a(function), executor);
    }

    public static <I, O> lhe<O> p(lhe<I> lheVar, fl1<? super I, ? extends O> fl1Var, Executor executor) {
        ct3 ct3Var = new ct3(fl1Var, lheVar);
        lheVar.addListener(ct3Var, executor);
        return ct3Var;
    }
}
