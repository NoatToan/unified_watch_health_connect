package defpackage;

import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class vge<V> implements lhe<List<V>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<? extends lhe<? extends V>> f36870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<V> f36871b;
    public final boolean c;
    public final AtomicInteger d;
    public final lhe<List<V>> e = cb3.a(new a());
    public cb3.a<List<V>> f;

    public class a implements cb3.c<List<V>> {
        public a() {
        }

        @Override // cb3.c
        public Object a(cb3.a<List<V>> aVar) {
            g6i.j(vge.this.f == null, "The result can only set once!");
            vge.this.f = aVar;
            return "ListFuture[" + this + "]";
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            vge vgeVar = vge.this;
            vgeVar.f36871b = null;
            vgeVar.f36870a = null;
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f36874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lhe f36875b;

        public c(int i, lhe lheVar) {
            this.f36874a = i;
            this.f36875b = lheVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            vge.this.e(this.f36874a, this.f36875b);
        }
    }

    public vge(List<? extends lhe<? extends V>> list, boolean z, Executor executor) {
        this.f36870a = (List) g6i.g(list);
        this.f36871b = new ArrayList(list.size());
        this.c = z;
        this.d = new AtomicInteger(list.size());
        d(executor);
    }

    public final void a() throws InterruptedException {
        List<? extends lhe<? extends V>> list = this.f36870a;
        if (list == null || isDone()) {
            return;
        }
        for (lhe<? extends V> lheVar : list) {
            while (!lheVar.isDone()) {
                try {
                    lheVar.get();
                } catch (Error e) {
                    throw e;
                } catch (InterruptedException e2) {
                    throw e2;
                } catch (Throwable unused) {
                    if (this.c) {
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.lhe
    public void addListener(Runnable runnable, Executor executor) {
        this.e.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public List<V> get() throws ExecutionException, InterruptedException {
        a();
        return this.e.get();
    }

    @Override // java.util.concurrent.Future
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public List<V> get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.e.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        List<? extends lhe<? extends V>> list = this.f36870a;
        if (list != null) {
            Iterator<? extends lhe<? extends V>> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(z);
            }
        }
        return this.e.cancel(z);
    }

    public final void d(Executor executor) {
        addListener(new b(), li3.a());
        if (this.f36870a.isEmpty()) {
            this.f.c(new ArrayList(this.f36871b));
            return;
        }
        for (int i = 0; i < this.f36870a.size(); i++) {
            this.f36871b.add(null);
        }
        List<? extends lhe<? extends V>> list = this.f36870a;
        for (int i2 = 0; i2 < list.size(); i2++) {
            lhe<? extends V> lheVar = list.get(i2);
            lheVar.addListener(new c(i2, lheVar), executor);
        }
    }

    public void e(int i, Future<? extends V> future) {
        List<V> list;
        cb3.a<List<V>> aVar;
        ArrayList arrayList;
        List<V> list2;
        List<V> list3;
        List<V> list4;
        List<V> list5;
        List<V> list6 = this.f36871b;
        if (isDone() || list6 == null) {
            g6i.j(this.c, "Future was done before all dependencies completed");
            return;
        }
        try {
            g6i.j(future.isDone(), "Tried to set value from future which is not done");
            list6.set(i, (V) oua.e(future));
            int iDecrementAndGet = this.d.decrementAndGet();
            g6i.j(iDecrementAndGet >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet == 0) {
                if (list5 != null) {
                    aVar = this.f;
                    arrayList = new ArrayList(list5);
                    aVar.c(arrayList);
                }
            }
        } catch (RuntimeException e) {
            if (this.c) {
                this.f.f(e);
            }
            int iDecrementAndGet2 = this.d.decrementAndGet();
            g6i.j(iDecrementAndGet2 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet2 == 0) {
                if (list4 != null) {
                    aVar = this.f;
                    arrayList = new ArrayList(list4);
                }
            }
        } catch (ExecutionException e2) {
            if (this.c) {
                this.f.f(e2.getCause());
            }
            int iDecrementAndGet3 = this.d.decrementAndGet();
            g6i.j(iDecrementAndGet3 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet3 == 0) {
                if (list3 != null) {
                    aVar = this.f;
                    arrayList = new ArrayList(list3);
                }
            }
        } catch (Error e3) {
            this.f.f(e3);
            int iDecrementAndGet4 = this.d.decrementAndGet();
            g6i.j(iDecrementAndGet4 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet4 == 0) {
                if (list2 != null) {
                    aVar = this.f;
                    arrayList = new ArrayList(list2);
                }
            }
        } catch (CancellationException unused) {
            if (this.c) {
                cancel(false);
            }
            int iDecrementAndGet5 = this.d.decrementAndGet();
            g6i.j(iDecrementAndGet5 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet5 == 0) {
                if (list != null) {
                    aVar = this.f;
                    arrayList = new ArrayList(list);
                }
            }
        } finally {
            int iDecrementAndGet6 = this.d.decrementAndGet();
            g6i.j(iDecrementAndGet6 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet6 == 0) {
                List<V> list7 = this.f36871b;
                if (list7 != null) {
                    this.f.c(new ArrayList(list7));
                } else {
                    g6i.i(isDone());
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.e.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.e.isDone();
    }
}
