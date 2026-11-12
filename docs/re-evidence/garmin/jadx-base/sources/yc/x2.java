package yc;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.f0;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u0005B+\b\u0007\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fB!\b\u0017\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000eB+\b\u0017\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\r\u0012\b\b\u0002\u0010\n\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lyc/x2;", "", "T", "Landroidx/recyclerview/widget/RecyclerView$f0;", "VH", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/o$f;", "diffCallback", "Lt13/g;", "mainDispatcher", "workerDispatcher", "<init>", "(Landroidx/recyclerview/widget/o$f;Lt13/g;Lt13/g;)V", "Lo53/z;", "(Landroidx/recyclerview/widget/o$f;Lo53/z;)V", "(Landroidx/recyclerview/widget/o$f;Lo53/z;Lo53/z;)V", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class x2<T, VH extends RecyclerView.f0> extends RecyclerView.h<VH> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f196613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f<T> f196614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r53.i<s> f196615c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"yc/x2$a", "Landroidx/recyclerview/widget/RecyclerView$j;", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends RecyclerView.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x2<T, VH> f196616a;

        public a(x2<T, VH> x2Var) {
            this.f196616a = x2Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeInserted(int i14, int i15) {
            x2<T, VH> x2Var = this.f196616a;
            if (x2Var.getStateRestorationPolicy() == RecyclerView.h.a.PREVENT && !x2Var.f196613a) {
                x2Var.setStateRestorationPolicy(RecyclerView.h.a.ALLOW);
            }
            x2Var.unregisterAdapterDataObserver(this);
            super.onItemRangeInserted(i14, i15);
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"yc/x2$b", "Lkotlin/Function1;", "Lyc/s;", "", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements e23.l<s, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f196617a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x2<T, VH> f196618b;

        public b(x2<T, VH> x2Var) {
            this.f196618b = x2Var;
        }

        @Override // e23.l
        public final Unit invoke(s sVar) {
            e23.l<s, Unit> lVar;
            s sVar2 = sVar;
            sVar2.getClass();
            if (this.f196617a) {
                this.f196617a = false;
            } else if (sVar2.f196388d.f195769a instanceof z0.c) {
                x2<T, VH> x2Var = this.f196618b;
                if (x2Var.getStateRestorationPolicy() == RecyclerView.h.a.PREVENT && !x2Var.f196613a) {
                    x2Var.setStateRestorationPolicy(RecyclerView.h.a.ALLOW);
                }
                f<T> fVar = x2Var.f196614b;
                fVar.getClass();
                CopyOnWriteArrayList<e23.l<s, Unit>> copyOnWriteArrayList = fVar.f195914l;
                copyOnWriteArrayList.remove(this);
                if (copyOnWriteArrayList.isEmpty() && (lVar = fVar.f195913k.get()) != null) {
                    f.e eVar = fVar.f195910h;
                    eVar.getClass();
                    j1 j1Var = eVar.f195740e;
                    j1Var.getClass();
                    j1Var.f196089a.remove(lVar);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "T", "Landroidx/recyclerview/widget/RecyclerView$f0;", "VH", "Lyc/s;", "loadStates", "", "invoke", "(Lyc/s;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.l<s, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a1<?> f196619a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a1<?> a1Var) {
            super(1);
            this.f196619a = a1Var;
        }

        @Override // e23.l
        public final Unit invoke(s sVar) {
            s sVar2 = sVar;
            sVar2.getClass();
            this.f196619a.x(sVar2.f196387c);
            return Unit.INSTANCE;
        }
    }

    public x2(androidx.recyclerview.widget.o.f<T> fVar, t13.g gVar, t13.g gVar2) {
        fVar.getClass();
        gVar.getClass();
        gVar2.getClass();
        f<T> fVar2 = new f<>(fVar, new androidx.recyclerview.widget.b(this), gVar, gVar2);
        this.f196614b = fVar2;
        super.setStateRestorationPolicy(RecyclerView.h.a.PREVENT);
        registerAdapterDataObserver(new a(this));
        r(new b(this));
        this.f196615c = fVar2.f195912j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        f<T> fVar = this.f196614b;
        k3<T> k3Var = fVar.f195909g.get();
        return k3Var != null ? k3Var.getSize() : fVar.f195910h.f195739d.getSize();
    }

    public final void r(e23.l<? super s, Unit> lVar) {
        f<T> fVar = this.f196614b;
        fVar.getClass();
        AtomicReference<e23.l<s, Unit>> atomicReference = fVar.f195913k;
        if (atomicReference.get() == null) {
            f.c cVar = fVar.f195915m;
            cVar.getClass();
            atomicReference.set(cVar);
            f.e eVar = fVar.f195910h;
            eVar.getClass();
            j1 j1Var = eVar.f195740e;
            j1Var.getClass();
            j1Var.f196089a.add(cVar);
            s sVar = (s) j1Var.f196090b.getValue();
            if (sVar != null) {
                cVar.invoke(sVar);
            }
        }
        fVar.f195914l.add(lVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void setHasStableIds(boolean z14) {
        throw new UnsupportedOperationException("Stable ids are unsupported on PagingDataAdapter.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void setStateRestorationPolicy(RecyclerView.h.a aVar) {
        aVar.getClass();
        this.f196613a = true;
        super.setStateRestorationPolicy(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T t(int i14) {
        Object value;
        Object value2;
        T tB;
        Object value3;
        f<T> fVar = this.f196614b;
        r53.p2 p2Var = fVar.f195907e;
        do {
            try {
                value2 = p2Var.getValue();
                ((Boolean) value2).getClass();
            } catch (Throwable th3) {
                do {
                    value = p2Var.getValue();
                    ((Boolean) value).getClass();
                } while (!p2Var.b(value, Boolean.FALSE));
                throw th3;
            }
        } while (!p2Var.b(value2, Boolean.TRUE));
        fVar.f195908f = i14;
        k3<T> k3Var = fVar.f195909g.get();
        if (k3Var != null) {
            if (i14 < 0 || i14 >= k3Var.getSize()) {
                l2.j(k3Var.getSize(), b71.i.i(i14, "Index: ", ", Size: "));
            } else {
                int f196448b = i14 - k3Var.getF196448b();
                if (f196448b >= 0 && f196448b < k3Var.getF196452f()) {
                    tB = k3Var.getItem(f196448b);
                }
            }
            tB = null;
        } else {
            tB = fVar.f195910h.b(i14);
        }
        do {
            value3 = p2Var.getValue();
            ((Boolean) value3).getClass();
        } while (!p2Var.b(value3, Boolean.FALSE));
        return tB;
    }

    public final r0<T> u() {
        f<T> fVar = this.f196614b;
        k3<T> k3Var = fVar.f195909g.get();
        if (k3Var == null) {
            return fVar.f195910h.d();
        }
        int f196452f = k3Var.getF196452f() - 1;
        ArrayList arrayList = new ArrayList();
        if (f196452f >= 0) {
            int i14 = 0;
            while (true) {
                arrayList.add(k3Var.getItem(i14));
                if (i14 == f196452f) {
                    break;
                }
                i14++;
            }
        }
        return new r0<>(k3Var.getF196448b(), k3Var.getF196449c(), arrayList);
    }

    public final Object x(v2<T> v2Var, t13.d<? super Unit> dVar) {
        f<T> fVar = this.f196614b;
        fVar.f195911i.incrementAndGet();
        f.e eVar = fVar.f195910h;
        i4 i4Var = eVar.f195742g;
        c3 c3Var = new c3(eVar, v2Var, null);
        int i14 = i4.f196065b;
        Object objA = i4Var.a(0, c3Var, dVar);
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        if (objA != aVar) {
            objA = Unit.INSTANCE;
        }
        if (objA != aVar) {
            objA = Unit.INSTANCE;
        }
        return objA == aVar ? objA : Unit.INSTANCE;
    }

    public final androidx.recyclerview.widget.g z(a1<?> a1Var) {
        a1Var.getClass();
        r(new c(a1Var));
        return new androidx.recyclerview.widget.g((RecyclerView.h<? extends RecyclerView.f0>[]) new RecyclerView.h[]{this, a1Var});
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x2(androidx.recyclerview.widget.o.f<T> fVar, t13.g gVar) {
        this(fVar, gVar, (t13.g) null, 4, (p005kotlin.jvm.internal.j) null);
        fVar.getClass();
        gVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @o13.e
    public x2(androidx.recyclerview.widget.o.f fVar, o53.z zVar) {
        this(fVar, (t13.g) zVar, (t13.g) o53.s0.f129406a);
        fVar.getClass();
        zVar.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x2(androidx.recyclerview.widget.o.f fVar, t13.g gVar, t13.g gVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 2) != 0) {
            x53.c cVar = o53.s0.f129406a;
            gVar = u53.o.f168762a;
        }
        this(fVar, gVar, (i14 & 4) != 0 ? o53.s0.f129406a : gVar2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x2(androidx.recyclerview.widget.o.f<T> fVar) {
        this(fVar, (t13.g) null, (t13.g) null, 6, (p005kotlin.jvm.internal.j) null);
        fVar.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x2(androidx.recyclerview.widget.o.f fVar, o53.z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 2) != 0) {
            x53.c cVar = o53.s0.f129406a;
            zVar = u53.o.f168762a;
        }
        this(fVar, zVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x2(androidx.recyclerview.widget.o.f fVar, o53.z zVar, o53.z zVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 2) != 0) {
            x53.c cVar = o53.s0.f129406a;
            zVar = u53.o.f168762a;
        }
        this(fVar, zVar, (i14 & 4) != 0 ? o53.s0.f129406a : zVar2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @o13.e
    public /* synthetic */ x2(androidx.recyclerview.widget.o.f fVar, o53.z zVar, o53.z zVar2) {
        this(fVar, (t13.g) zVar, (t13.g) zVar2);
        fVar.getClass();
        zVar.getClass();
        zVar2.getClass();
    }
}
