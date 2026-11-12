package l0;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ListenableFuture f107828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f107829c;

    public p(n nVar, int i14, ListenableFuture listenableFuture) {
        this.f107829c = nVar;
        this.f107827a = i14;
        this.f107828b = listenableFuture;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        androidx.concurrent.futures.b.a aVar;
        ArrayList arrayList;
        int i14 = this.f107827a;
        ListenableFuture listenableFuture = this.f107828b;
        n nVar = this.f107829c;
        boolean z14 = nVar.f107821c;
        AtomicInteger atomicInteger = nVar.f107822d;
        ArrayList arrayList2 = nVar.f107820b;
        if (nVar.isDone() || arrayList2 == null) {
            k7.h.f(z14, "Future was done before all dependencies completed");
            return;
        }
        try {
            try {
                try {
                    k7.h.f(listenableFuture.isDone(), "Tried to set value from future which is not done");
                    arrayList2.set(i14, j.d(listenableFuture));
                    int iDecrementAndGet = atomicInteger.decrementAndGet();
                    k7.h.f(iDecrementAndGet >= 0, "Less than 0 remaining futures");
                    if (iDecrementAndGet == 0) {
                        ArrayList arrayList3 = nVar.f107820b;
                        if (arrayList3 != null) {
                            nVar.f107824f.b(new ArrayList(arrayList3));
                        } else {
                            k7.h.f(nVar.isDone(), null);
                        }
                    }
                } catch (RuntimeException e4) {
                    if (z14) {
                        nVar.f107824f.d(e4);
                    }
                    int iDecrementAndGet2 = atomicInteger.decrementAndGet();
                    k7.h.f(iDecrementAndGet2 >= 0, "Less than 0 remaining futures");
                    if (iDecrementAndGet2 == 0) {
                        ArrayList arrayList4 = nVar.f107820b;
                        if (arrayList4 != null) {
                            aVar = nVar.f107824f;
                            arrayList = new ArrayList(arrayList4);
                            aVar.b(arrayList);
                            return;
                        }
                        k7.h.f(nVar.isDone(), null);
                    }
                } catch (ExecutionException e14) {
                    if (z14) {
                        nVar.f107824f.d(e14.getCause());
                    }
                    int iDecrementAndGet3 = atomicInteger.decrementAndGet();
                    k7.h.f(iDecrementAndGet3 >= 0, "Less than 0 remaining futures");
                    if (iDecrementAndGet3 == 0) {
                        ArrayList arrayList5 = nVar.f107820b;
                        if (arrayList5 != null) {
                            aVar = nVar.f107824f;
                            arrayList = new ArrayList(arrayList5);
                            aVar.b(arrayList);
                            return;
                        }
                        k7.h.f(nVar.isDone(), null);
                    }
                }
            } catch (Error e15) {
                nVar.f107824f.d(e15);
                int iDecrementAndGet4 = atomicInteger.decrementAndGet();
                k7.h.f(iDecrementAndGet4 >= 0, "Less than 0 remaining futures");
                if (iDecrementAndGet4 == 0) {
                    ArrayList arrayList6 = nVar.f107820b;
                    if (arrayList6 != null) {
                        aVar = nVar.f107824f;
                        arrayList = new ArrayList(arrayList6);
                        aVar.b(arrayList);
                        return;
                    }
                    k7.h.f(nVar.isDone(), null);
                }
            } catch (CancellationException unused) {
                if (z14) {
                    nVar.cancel(false);
                }
                int iDecrementAndGet5 = atomicInteger.decrementAndGet();
                k7.h.f(iDecrementAndGet5 >= 0, "Less than 0 remaining futures");
                if (iDecrementAndGet5 == 0) {
                    ArrayList arrayList7 = nVar.f107820b;
                    if (arrayList7 != null) {
                        aVar = nVar.f107824f;
                        arrayList = new ArrayList(arrayList7);
                        aVar.b(arrayList);
                        return;
                    }
                    k7.h.f(nVar.isDone(), null);
                }
            }
        } catch (Throwable th3) {
            int iDecrementAndGet6 = atomicInteger.decrementAndGet();
            k7.h.f(iDecrementAndGet6 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet6 == 0) {
                ArrayList arrayList8 = nVar.f107820b;
                if (arrayList8 != null) {
                    nVar.f107824f.b(new ArrayList(arrayList8));
                } else {
                    k7.h.f(nVar.isDone(), null);
                }
            }
            throw th3;
        }
    }
}
