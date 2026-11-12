package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import defpackage.ekp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Runnable {
    public static final ThreadLocal<k> e = new ThreadLocal<>();
    public static Comparator<c> f = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2932b;
    public long c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<RecyclerView> f2931a = new ArrayList<>();
    public ArrayList<c> d = new ArrayList<>();

    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.d;
            if ((recyclerView == null) != (cVar2.d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z = cVar.f2935a;
            if (z != cVar2.f2935a) {
                return z ? -1 : 1;
            }
            int i = cVar2.f2936b - cVar.f2936b;
            if (i != 0) {
                return i;
            }
            int i2 = cVar.c - cVar2.c;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    }

    @SuppressLint({"VisibleForTests"})
    public static class b implements RecyclerView.o.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2934b;
        public int[] c;
        public int d;

        @Override // androidx.recyclerview.widget.RecyclerView.o.c
        public void a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.d;
            int i4 = i3 * 2;
            int[] iArr = this.c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[i3 * 4];
                this.c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.c;
            iArr4[i4] = i;
            iArr4[i4 + 1] = i2;
            this.d++;
        }

        public void b() {
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.d = 0;
        }

        public void c(RecyclerView recyclerView, boolean z) {
            this.d = 0;
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || oVar == null || !oVar.isItemPrefetchEnabled()) {
                return;
            }
            if (z) {
                if (!recyclerView.mAdapterHelper.p()) {
                    oVar.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                oVar.collectAdjacentPrefetchPositions(this.f2933a, this.f2934b, recyclerView.mState, this);
            }
            int i = this.d;
            if (i > oVar.mPrefetchMaxCountObserved) {
                oVar.mPrefetchMaxCountObserved = i;
                oVar.mPrefetchMaxObservedInInitialPrefetch = z;
                recyclerView.mRecycler.P();
            }
        }

        public boolean d(int i) {
            if (this.c != null) {
                int i2 = this.d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void e(int i, int i2) {
            this.f2933a = i;
            this.f2934b = i2;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2935a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2936b;
        public int c;
        public RecyclerView d;
        public int e;

        public void a() {
            this.f2935a = false;
            this.f2936b = 0;
            this.c = 0;
            this.d = null;
            this.e = 0;
        }
    }

    public static boolean e(RecyclerView recyclerView, int i) {
        int iJ = recyclerView.mChildHelper.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            RecyclerView.d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.i(i2));
            if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    public void a(RecyclerView recyclerView) {
        if (RecyclerView.sDebugAssertionsEnabled && this.f2931a.contains(recyclerView)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        this.f2931a.add(recyclerView);
    }

    public final void b() {
        c cVar;
        int size = this.f2931a.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f2931a.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.c(recyclerView, false);
                i += recyclerView.mPrefetchRegistry.d;
            }
        }
        this.d.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f2931a.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.mPrefetchRegistry;
                int iAbs = Math.abs(bVar.f2933a) + Math.abs(bVar.f2934b);
                for (int i5 = 0; i5 < bVar.d * 2; i5 += 2) {
                    if (i3 >= this.d.size()) {
                        cVar = new c();
                        this.d.add(cVar);
                    } else {
                        cVar = this.d.get(i3);
                    }
                    int[] iArr = bVar.c;
                    int i6 = iArr[i5 + 1];
                    cVar.f2935a = i6 <= iAbs;
                    cVar.f2936b = iAbs;
                    cVar.c = i6;
                    cVar.d = recyclerView2;
                    cVar.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.d, f);
    }

    public final void c(c cVar, long j) {
        RecyclerView.d0 d0VarI = i(cVar.d, cVar.e, cVar.f2935a ? Long.MAX_VALUE : j);
        if (d0VarI == null || d0VarI.mNestedRecyclerView == null || !d0VarI.isBound() || d0VarI.isInvalid()) {
            return;
        }
        h(d0VarI.mNestedRecyclerView.get(), j);
    }

    public final void d(long j) {
        for (int i = 0; i < this.d.size(); i++) {
            c cVar = this.d.get(i);
            if (cVar.d == null) {
                return;
            }
            c(cVar, j);
            cVar.a();
        }
    }

    public void f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.sDebugAssertionsEnabled && !this.f2931a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f2932b == 0) {
                this.f2932b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.mPrefetchRegistry.e(i, i2);
    }

    public void g(long j) {
        b();
        d(j);
    }

    public final void h(RecyclerView recyclerView, long j) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.j() != 0) {
            recyclerView.removeAndRecycleViews();
        }
        b bVar = recyclerView.mPrefetchRegistry;
        bVar.c(recyclerView, true);
        if (bVar.d != 0) {
            try {
                ekp.a("RV Nested Prefetch");
                recyclerView.mState.g(recyclerView.mAdapter);
                for (int i = 0; i < bVar.d * 2; i += 2) {
                    i(recyclerView, bVar.c[i], j);
                }
                ekp.b();
            } catch (Throwable th) {
                ekp.b();
                throw th;
            }
        }
    }

    public final RecyclerView.d0 i(RecyclerView recyclerView, int i, long j) {
        if (e(recyclerView, i)) {
            return null;
        }
        RecyclerView.u uVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.d0 d0VarN = uVar.N(i, false, j);
            if (d0VarN != null) {
                if (!d0VarN.isBound() || d0VarN.isInvalid()) {
                    uVar.a(d0VarN, false);
                } else {
                    uVar.G(d0VarN.itemView);
                }
            }
            return d0VarN;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    public void j(RecyclerView recyclerView) {
        boolean zRemove = this.f2931a.remove(recyclerView);
        if (RecyclerView.sDebugAssertionsEnabled && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ekp.a("RV Prefetch");
            if (!this.f2931a.isEmpty()) {
                int size = this.f2931a.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f2931a.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.c);
                }
            }
        } finally {
            this.f2932b = 0L;
            ekp.b();
        }
    }
}
