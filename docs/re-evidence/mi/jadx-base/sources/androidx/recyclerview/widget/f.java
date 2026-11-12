package androidx.recyclerview.widget;

import android.view.ViewGroup;
import defpackage.g6i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f implements q.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcatAdapter f2881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f2882b;
    public List<WeakReference<RecyclerView>> c = new ArrayList();
    public final IdentityHashMap<RecyclerView.d0, q> d = new IdentityHashMap<>();
    public List<q> e = new ArrayList();
    public a f = new a();
    public final ConcatAdapter.Config.StableIdMode g;
    public final y h;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public q f2883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2884b;
        public boolean c;
    }

    public f(ConcatAdapter concatAdapter, ConcatAdapter.Config config) {
        this.f2881a = concatAdapter;
        if (config.f2783a) {
            this.f2882b = new b0.a();
        } else {
            this.f2882b = new b0.b();
        }
        ConcatAdapter.Config.StableIdMode stableIdMode = config.f2784b;
        this.g = stableIdMode;
        if (stableIdMode == ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS) {
            this.h = new y.b();
        } else if (stableIdMode == ConcatAdapter.Config.StableIdMode.ISOLATED_STABLE_IDS) {
            this.h = new y.a();
        } else {
            if (stableIdMode != ConcatAdapter.Config.StableIdMode.SHARED_STABLE_IDS) {
                throw new IllegalArgumentException("unknown stable id mode");
            }
            this.h = new y.c();
        }
    }

    public void A(RecyclerView.d0 d0Var) {
        r(d0Var).c.onViewAttachedToWindow(d0Var);
    }

    public void B(RecyclerView.d0 d0Var) {
        r(d0Var).c.onViewDetachedFromWindow(d0Var);
    }

    public void C(RecyclerView.d0 d0Var) {
        q qVar = this.d.get(d0Var);
        if (qVar != null) {
            qVar.c.onViewRecycled(d0Var);
            this.d.remove(d0Var);
            return;
        }
        throw new IllegalStateException("Cannot find wrapper for " + d0Var + ", seems like it is not bound by this adapter: " + this);
    }

    public final void D(a aVar) {
        aVar.c = false;
        aVar.f2883a = null;
        aVar.f2884b = -1;
        this.f = aVar;
    }

    @Override // androidx.recyclerview.widget.q.b
    public void a(q qVar, int i, int i2, Object obj) {
        this.f2881a.notifyItemRangeChanged(i + k(qVar), i2, obj);
    }

    @Override // androidx.recyclerview.widget.q.b
    public void b(q qVar, int i, int i2) {
        int iK = k(qVar);
        this.f2881a.notifyItemMoved(i + iK, i2 + iK);
    }

    @Override // androidx.recyclerview.widget.q.b
    public void c(q qVar) {
        i();
    }

    @Override // androidx.recyclerview.widget.q.b
    public void d(q qVar, int i, int i2) {
        this.f2881a.notifyItemRangeRemoved(i + k(qVar), i2);
    }

    @Override // androidx.recyclerview.widget.q.b
    public void e(q qVar, int i, int i2) {
        this.f2881a.notifyItemRangeInserted(i + k(qVar), i2);
    }

    @Override // androidx.recyclerview.widget.q.b
    public void f(q qVar) {
        this.f2881a.notifyDataSetChanged();
        i();
    }

    public boolean g(int i, RecyclerView.Adapter<RecyclerView.d0> adapter) {
        if (i < 0 || i > this.e.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + this.e.size() + ". Given:" + i);
        }
        if (s()) {
            g6i.b(adapter.hasStableIds(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
        } else {
            adapter.hasStableIds();
        }
        if (m(adapter) != null) {
            return false;
        }
        q qVar = new q(adapter, this, this.f2882b, this.h.a());
        this.e.add(i, qVar);
        Iterator<WeakReference<RecyclerView>> it = this.c.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = it.next().get();
            if (recyclerView != null) {
                adapter.onAttachedToRecyclerView(recyclerView);
            }
        }
        if (qVar.a() > 0) {
            this.f2881a.notifyItemRangeInserted(k(qVar), qVar.a());
        }
        i();
        return true;
    }

    public boolean h(RecyclerView.Adapter<RecyclerView.d0> adapter) {
        return g(this.e.size(), adapter);
    }

    public final void i() {
        RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicyJ = j();
        if (stateRestorationPolicyJ != this.f2881a.getStateRestorationPolicy()) {
            this.f2881a.j(stateRestorationPolicyJ);
        }
    }

    public final RecyclerView.Adapter.StateRestorationPolicy j() {
        for (q qVar : this.e) {
            RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy = qVar.c.getStateRestorationPolicy();
            RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy2 = RecyclerView.Adapter.StateRestorationPolicy.PREVENT;
            if (stateRestorationPolicy == stateRestorationPolicy2) {
                return stateRestorationPolicy2;
            }
            if (stateRestorationPolicy == RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY && qVar.a() == 0) {
                return stateRestorationPolicy2;
            }
        }
        return RecyclerView.Adapter.StateRestorationPolicy.ALLOW;
    }

    public final int k(q qVar) {
        q next;
        Iterator<q> it = this.e.iterator();
        int iA = 0;
        while (it.hasNext() && (next = it.next()) != qVar) {
            iA += next.a();
        }
        return iA;
    }

    public final a l(int i) {
        a aVar = this.f;
        if (aVar.c) {
            aVar = new a();
        } else {
            aVar.c = true;
        }
        int iA = i;
        for (q qVar : this.e) {
            if (qVar.a() > iA) {
                aVar.f2883a = qVar;
                aVar.f2884b = iA;
                break;
            }
            iA -= qVar.a();
        }
        if (aVar.f2883a != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Cannot find wrapper for " + i);
    }

    public final q m(RecyclerView.Adapter<RecyclerView.d0> adapter) {
        int iT = t(adapter);
        if (iT == -1) {
            return null;
        }
        return this.e.get(iT);
    }

    public long n(int i) {
        a aVarL = l(i);
        long jB = aVarL.f2883a.b(aVarL.f2884b);
        D(aVarL);
        return jB;
    }

    public int o(int i) {
        a aVarL = l(i);
        int iC = aVarL.f2883a.c(aVarL.f2884b);
        D(aVarL);
        return iC;
    }

    public int p(RecyclerView.Adapter<? extends RecyclerView.d0> adapter, RecyclerView.d0 d0Var, int i) {
        q qVar = this.d.get(d0Var);
        if (qVar == null) {
            return -1;
        }
        int iK = i - k(qVar);
        int itemCount = qVar.c.getItemCount();
        if (iK >= 0 && iK < itemCount) {
            return qVar.c.findRelativeAdapterPositionIn(adapter, d0Var, iK);
        }
        throw new IllegalStateException("Detected inconsistent adapter updates. The local position of the view holder maps to " + iK + " which is out of bounds for the adapter with size " + itemCount + ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:" + d0Var + "adapter:" + adapter);
    }

    public int q() {
        Iterator<q> it = this.e.iterator();
        int iA = 0;
        while (it.hasNext()) {
            iA += it.next().a();
        }
        return iA;
    }

    public final q r(RecyclerView.d0 d0Var) {
        q qVar = this.d.get(d0Var);
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("Cannot find wrapper for " + d0Var + ", seems like it is not bound by this adapter: " + this);
    }

    public boolean s() {
        return this.g != ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS;
    }

    public final int t(RecyclerView.Adapter<RecyclerView.d0> adapter) {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            if (this.e.get(i).c == adapter) {
                return i;
            }
        }
        return -1;
    }

    public final boolean u(RecyclerView recyclerView) {
        Iterator<WeakReference<RecyclerView>> it = this.c.iterator();
        while (it.hasNext()) {
            if (it.next().get() == recyclerView) {
                return true;
            }
        }
        return false;
    }

    public void v(RecyclerView recyclerView) {
        if (u(recyclerView)) {
            return;
        }
        this.c.add(new WeakReference<>(recyclerView));
        Iterator<q> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().c.onAttachedToRecyclerView(recyclerView);
        }
    }

    public void w(RecyclerView.d0 d0Var, int i) {
        a aVarL = l(i);
        this.d.put(d0Var, aVarL.f2883a);
        aVarL.f2883a.d(d0Var, aVarL.f2884b);
        D(aVarL);
    }

    public RecyclerView.d0 x(ViewGroup viewGroup, int i) {
        return this.f2882b.a(i).e(viewGroup, i);
    }

    public void y(RecyclerView recyclerView) {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            WeakReference<RecyclerView> weakReference = this.c.get(size);
            if (weakReference.get() != null) {
                if (weakReference.get() == recyclerView) {
                    this.c.remove(size);
                    break;
                }
            } else {
                this.c.remove(size);
            }
        }
        Iterator<q> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().c.onDetachedFromRecyclerView(recyclerView);
        }
    }

    public boolean z(RecyclerView.d0 d0Var) {
        q qVar = this.d.get(d0Var);
        if (qVar != null) {
            boolean zOnFailedToRecycleView = qVar.c.onFailedToRecycleView(d0Var);
            this.d.remove(d0Var);
            return zOnFailedToRecycleView;
        }
        throw new IllegalStateException("Cannot find wrapper for " + d0Var + ", seems like it is not bound by this adapter: " + this);
    }
}
