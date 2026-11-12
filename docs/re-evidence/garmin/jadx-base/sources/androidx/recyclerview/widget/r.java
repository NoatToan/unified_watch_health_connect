package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadLocal<r> f10618e = new ThreadLocal<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f10619f = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f10621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10622c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<RecyclerView> f10620a = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<c> f10623d = new ArrayList<>();

    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        public final int compare(c cVar, c cVar2) {
            c cVar3 = cVar;
            c cVar4 = cVar2;
            RecyclerView recyclerView = cVar3.f10631d;
            if ((recyclerView == null) == (cVar4.f10631d == null)) {
                boolean z14 = cVar3.f10628a;
                if (z14 == cVar4.f10628a) {
                    int i14 = cVar4.f10629b - cVar3.f10629b;
                    if (i14 != 0) {
                        return i14;
                    }
                    int i15 = cVar3.f10630c - cVar4.f10630c;
                    if (i15 != 0) {
                        return i15;
                    }
                    return 0;
                }
                if (z14) {
                    return -1;
                }
            } else if (recyclerView != null) {
                return -1;
            }
            return 1;
        }
    }

    @SuppressLint({"VisibleForTests"})
    public static class b implements RecyclerView.p.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int[] f10626c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f10627d;

        public final void a(int i14, int i15) {
            if (i14 < 0) {
                vb.h.s("Layout positions must be non-negative");
                return;
            }
            if (i15 < 0) {
                vb.h.s("Pixel distance must be non-negative");
                return;
            }
            int i16 = this.f10627d;
            int i17 = i16 * 2;
            int[] iArr = this.f10626c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f10626c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i17 >= iArr.length) {
                int[] iArr3 = new int[i16 * 4];
                this.f10626c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f10626c;
            iArr4[i17] = i14;
            iArr4[i17 + 1] = i15;
            this.f10627d++;
        }

        public final void b(RecyclerView recyclerView, boolean z14) {
            this.f10627d = 0;
            int[] iArr = this.f10626c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.p pVar = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || pVar == null || !pVar.isItemPrefetchEnabled()) {
                return;
            }
            if (z14) {
                if (!recyclerView.mAdapterHelper.g()) {
                    pVar.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                pVar.collectAdjacentPrefetchPositions(this.f10624a, this.f10625b, recyclerView.mState, this);
            }
            int i14 = this.f10627d;
            if (i14 > pVar.mPrefetchMaxCountObserved) {
                pVar.mPrefetchMaxCountObserved = i14;
                pVar.mPrefetchMaxObservedInInitialPrefetch = z14;
                recyclerView.mRecycler.p();
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f10628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10630c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RecyclerView f10631d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f10632e;
    }

    public static RecyclerView.f0 c(RecyclerView recyclerView, int i14, long j8) {
        int iH = recyclerView.mChildHelper.h();
        for (int i15 = 0; i15 < iH; i15++) {
            RecyclerView.f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.g(i15));
            if (childViewHolderInt.mPosition == i14 && !childViewHolderInt.isInvalid()) {
                return null;
            }
        }
        RecyclerView.w wVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.f0 f0VarN = wVar.n(i14, j8);
            if (f0VarN != null) {
                if (!f0VarN.isBound() || f0VarN.isInvalid()) {
                    wVar.a(f0VarN, false);
                } else {
                    wVar.k(f0VarN.itemView);
                }
            }
            return f0VarN;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i14, int i15) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.sDebugAssertionsEnabled && !this.f10620a.contains(recyclerView)) {
                vb.h.z("attempting to post unregistered view!");
                return;
            } else if (this.f10621b == 0) {
                this.f10621b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        b bVar = recyclerView.mPrefetchRegistry;
        bVar.f10624a = i14;
        bVar.f10625b = i15;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00cd  */
    public final void b(long j8) {
        c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        c cVar2;
        ArrayList<RecyclerView> arrayList = this.f10620a;
        int size = arrayList.size();
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            RecyclerView recyclerView3 = arrayList.get(i15);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.mPrefetchRegistry.b(recyclerView3, false);
                i14 += recyclerView3.mPrefetchRegistry.f10627d;
            }
        }
        ArrayList<c> arrayList2 = this.f10623d;
        arrayList2.ensureCapacity(i14);
        int i16 = 0;
        for (int i17 = 0; i17 < size; i17++) {
            RecyclerView recyclerView4 = arrayList.get(i17);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar = recyclerView4.mPrefetchRegistry;
                int iAbs = Math.abs(bVar.f10625b) + Math.abs(bVar.f10624a);
                for (int i18 = 0; i18 < bVar.f10627d * 2; i18 += 2) {
                    if (i16 >= arrayList2.size()) {
                        cVar2 = new c();
                        arrayList2.add(cVar2);
                    } else {
                        cVar2 = arrayList2.get(i16);
                    }
                    int[] iArr = bVar.f10626c;
                    int i19 = iArr[i18 + 1];
                    cVar2.f10628a = i19 <= iAbs;
                    cVar2.f10629b = iAbs;
                    cVar2.f10630c = i19;
                    cVar2.f10631d = recyclerView4;
                    cVar2.f10632e = iArr[i18];
                    i16++;
                }
            }
        }
        Collections.sort(arrayList2, f10619f);
        for (int i24 = 0; i24 < arrayList2.size() && (recyclerView = (cVar = arrayList2.get(i24)).f10631d) != null; i24++) {
            RecyclerView.f0 f0VarC = c(recyclerView, cVar.f10632e, cVar.f10628a ? Long.MAX_VALUE : j8);
            if (f0VarC != null && f0VarC.mNestedRecyclerView != null && f0VarC.isBound() && !f0VarC.isInvalid() && (recyclerView2 = f0VarC.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.mDataSetHasChangedAfterLayout && recyclerView2.mChildHelper.h() != 0) {
                    recyclerView2.removeAndRecycleViews();
                }
                b bVar2 = recyclerView2.mPrefetchRegistry;
                bVar2.b(recyclerView2, true);
                if (bVar2.f10627d != 0) {
                    try {
                        int i25 = h7.j.f82330a;
                        Trace.beginSection("RV Nested Prefetch");
                        RecyclerView.b0 b0Var = recyclerView2.mState;
                        RecyclerView.h hVar = recyclerView2.mAdapter;
                        b0Var.f10288d = 1;
                        b0Var.f10289e = hVar.getItemCount();
                        b0Var.f10291g = false;
                        b0Var.f10292h = false;
                        b0Var.f10293i = false;
                        for (int i26 = 0; i26 < bVar2.f10627d * 2; i26 += 2) {
                            c(recyclerView2, bVar2.f10626c[i26], j8);
                        }
                        Trace.endSection();
                    } catch (Throwable th3) {
                        int i27 = h7.j.f82330a;
                        Trace.endSection();
                        throw th3;
                    }
                }
            }
            cVar.f10628a = false;
            cVar.f10629b = 0;
            cVar.f10630c = 0;
            cVar.f10631d = null;
            cVar.f10632e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<RecyclerView> arrayList = this.f10620a;
        try {
            int i14 = h7.j.f82330a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i15 = 0; i15 < size; i15++) {
                    RecyclerView recyclerView = arrayList.get(i15);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f10622c);
                }
            }
            this.f10621b = 0L;
        } finally {
            this.f10621b = 0L;
            int i16 = h7.j.f82330a;
            Trace.endSection();
        }
    }
}
