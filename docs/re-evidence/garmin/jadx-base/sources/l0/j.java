package l0;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f107810a = new a();

    public class a implements p.a<Object, Object> {
        @Override // p.a, u03.f
        /* JADX INFO: renamed from: apply */
        public final Object mo330apply(Object obj) {
            return obj;
        }
    }

    public static final class b<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Future<V> f107811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c<? super V> f107812b;

        public b(Future<V> future, c<? super V> cVar) {
            this.f107811a = future;
            this.f107812b = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c<? super V> cVar = this.f107812b;
            try {
                cVar.onSuccess((Object) j.c(this.f107811a));
            } catch (Error e4) {
                e = e4;
                cVar.onFailure(e);
            } catch (RuntimeException e14) {
                e = e14;
                cVar.onFailure(e);
            } catch (ExecutionException e15) {
                Throwable cause = e15.getCause();
                if (cause == null) {
                    cVar.onFailure(e15);
                } else {
                    cVar.onFailure(cause);
                }
            }
        }

        public final String toString() {
            return b.class.getSimpleName() + "," + this.f107812b;
        }
    }

    private j() {
    }

    public static <V> void a(ListenableFuture<V> listenableFuture, c<? super V> cVar, Executor executor) {
        cVar.getClass();
        listenableFuture.addListener(new b(listenableFuture, cVar), executor);
    }

    public static n b(List list) {
        return new n(new ArrayList(list), true, k0.b.a());
    }

    public static <V> V c(Future<V> future) {
        k7.h.f(future.isDone(), "Future was expected to be done, " + future);
        return (V) d(future);
    }

    public static <V> V d(Future<V> future) {
        V v14;
        boolean z14 = false;
        while (true) {
            try {
                v14 = future.get();
                break;
            } catch (InterruptedException unused) {
                z14 = true;
            } catch (Throwable th3) {
                if (z14) {
                    Thread.currentThread().interrupt();
                }
                throw th3;
            }
        }
        if (z14) {
            Thread.currentThread().interrupt();
        }
        return v14;
    }

    public static m.c e(Object obj) {
        return obj == null ? m.c.f107817b : new m.c(obj);
    }

    public static <V> ListenableFuture<V> f(ListenableFuture<V> listenableFuture) {
        listenableFuture.getClass();
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        androidx.concurrent.futures.b.a aVar = new androidx.concurrent.futures.b.a();
        androidx.concurrent.futures.b.d dVar = new androidx.concurrent.futures.b.d(aVar);
        aVar.f6080b = dVar;
        aVar.f6079a = v.h.class;
        try {
            h(false, listenableFuture, f107810a, aVar, k0.b.a());
            aVar.f6079a = "nonCancellationPropagating[" + listenableFuture + "]";
        } catch (Exception e4) {
            dVar.a(e4);
        }
        return dVar;
    }

    public static <V> void g(ListenableFuture<V> listenableFuture, androidx.concurrent.futures.b.a<V> aVar) {
        h(true, listenableFuture, f107810a, aVar, k0.b.a());
    }

    public static void h(boolean z14, ListenableFuture listenableFuture, p.a aVar, androidx.concurrent.futures.b.a aVar2, k0.c cVar) {
        listenableFuture.getClass();
        aVar.getClass();
        aVar2.getClass();
        cVar.getClass();
        a(listenableFuture, new k(aVar2, aVar), cVar);
        if (z14) {
            aVar2.a(new l(listenableFuture), k0.b.a());
        }
    }

    public static n i(ArrayList arrayList) {
        return new n(new ArrayList(arrayList), false, k0.b.a());
    }

    public static l0.b j(ListenableFuture listenableFuture, l0.a aVar, Executor executor) {
        l0.b bVar = new l0.b(aVar, listenableFuture);
        listenableFuture.addListener(bVar, executor);
        return bVar;
    }
}
