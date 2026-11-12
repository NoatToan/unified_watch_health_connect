package l0;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class n<V> implements ListenableFuture<List<V>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<? extends ListenableFuture<? extends V>> f107819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f107820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f107821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicInteger f107822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.concurrent.futures.b.d f107823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.concurrent.futures.b.a<List<V>> f107824f;

    public class a implements androidx.concurrent.futures.b.c<List<V>> {
        public a() {
        }

        @Override // androidx.concurrent.futures.b.c
        public final Object d(androidx.concurrent.futures.b.a<List<V>> aVar) {
            n nVar = n.this;
            k7.h.f(nVar.f107824f == null, "The result can only set once!");
            nVar.f107824f = aVar;
            return "ListFuture[" + this + "]";
        }
    }

    public n(List<? extends ListenableFuture<? extends V>> list, boolean z14, Executor executor) {
        list.getClass();
        this.f107819a = list;
        this.f107820b = new ArrayList(list.size());
        this.f107821c = z14;
        this.f107822d = new AtomicInteger(list.size());
        this.f107823e = androidx.concurrent.futures.b.a(new a());
        addListener(new o(this), k0.b.a());
        if (this.f107819a.isEmpty()) {
            this.f107824f.b(new ArrayList(this.f107820b));
            return;
        }
        for (int i14 = 0; i14 < this.f107819a.size(); i14++) {
            this.f107820b.add(null);
        }
        List<? extends ListenableFuture<? extends V>> list2 = this.f107819a;
        for (int i15 = 0; i15 < list2.size(); i15++) {
            ListenableFuture<? extends V> listenableFuture = list2.get(i15);
            listenableFuture.addListener(new p(this, i15, listenableFuture), executor);
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.f107823e.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z14) {
        List<? extends ListenableFuture<? extends V>> list = this.f107819a;
        if (list != null) {
            Iterator<? extends ListenableFuture<? extends V>> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(z14);
            }
        }
        return this.f107823e.cancel(z14);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        List<? extends ListenableFuture<? extends V>> list = this.f107819a;
        if (list != null && !isDone()) {
            loop0: for (ListenableFuture<? extends V> listenableFuture : list) {
                while (!listenableFuture.isDone()) {
                    try {
                        listenableFuture.get();
                    } catch (Error e4) {
                        throw e4;
                    } catch (InterruptedException e14) {
                        throw e14;
                    } catch (Throwable unused) {
                        if (this.f107821c) {
                            return (List) this.f107823e.f6084b.get();
                        }
                    }
                }
            }
        }
        return (List) this.f107823e.f6084b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f107823e.f6084b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f107823e.f6084b.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) {
        return (List) this.f107823e.f6084b.get(j8, timeUnit);
    }
}
