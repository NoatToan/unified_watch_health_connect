package yc;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.f0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@o13.e
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u0005B\u0017\b\u0014\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tB\u0017\b\u0014\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lyc/r2;", "", "T", "Landroidx/recyclerview/widget/RecyclerView$f0;", "VH", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/o$f;", "diffCallback", "<init>", "(Landroidx/recyclerview/widget/o$f;)V", "Landroidx/recyclerview/widget/c;", "config", "(Landroidx/recyclerview/widget/c;)V", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class r2<T, VH extends RecyclerView.f0> extends RecyclerView.h<VH> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e<T> f196366a;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "T", "Landroidx/recyclerview/widget/RecyclerView$f0;", "VH", "Lyc/m2;", "previousList", "currentList", "", "invoke", "(Lyc/m2;Lyc/m2;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends p005kotlin.jvm.internal.w implements e23.p<m2<T>, m2<T>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r2<T, VH> f196367a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r2<T, VH> r2Var) {
            super(2);
            this.f196367a = r2Var;
        }

        @Override // e23.p
        public final Unit invoke(Object obj, Object obj2) {
            this.f196367a.getClass();
            return Unit.INSTANCE;
        }
    }

    public r2(androidx.recyclerview.widget.c<T> cVar) {
        cVar.getClass();
        a aVar = new a(this);
        e<T> eVar = new e<>(new androidx.recyclerview.widget.b(this), cVar);
        this.f196366a = eVar;
        eVar.f195861c.add(new e.a(aVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f196366a.a();
    }

    public final T r(int i14) {
        e<T> eVar = this.f196366a;
        m2<T> m2Var = eVar.f195863e;
        m2<T> m2Var2 = eVar.f195862d;
        if (m2Var != null) {
            return m2Var.f196223d.get(i14);
        }
        if (m2Var2 != null) {
            m2Var2.j(i14);
            return m2Var2.f196223d.get(i14);
        }
        org.apache.commons.lang3.e.v("Item count is zero, getItem() call is invalid");
        return null;
    }

    public final void t(m2<T> m2Var) {
        e<T> eVar = this.f196366a;
        e.d dVar = eVar.f195865g;
        e.c cVar = eVar.f195866h;
        e.C3648e c3648e = eVar.f195868j;
        int i14 = eVar.f195864f + 1;
        eVar.f195864f = i14;
        m2<T> l4Var = eVar.f195862d;
        if (m2Var == l4Var) {
            return;
        }
        if (l4Var != null && (m2Var instanceof p0)) {
            c3648e.getClass();
            p13.d0.B(new p2(c3648e), l4Var.f196226g);
            cVar.getClass();
            p13.d0.B(new q2(cVar), l4Var.f196227h);
            dVar.b(c1.REFRESH, z0.b.f196664b);
            dVar.b(c1.PREPEND, new z0.c(false));
            dVar.b(c1.APPEND, new z0.c(false));
            return;
        }
        m2<T> m2Var2 = eVar.f195863e;
        m2<T> m2Var3 = m2Var2 == null ? l4Var : m2Var2;
        if (m2Var == null) {
            int iA = eVar.a();
            if (l4Var != null) {
                c3648e.getClass();
                p13.d0.B(new p2(c3648e), l4Var.f196226g);
                cVar.getClass();
                p13.d0.B(new q2(cVar), l4Var.f196227h);
                eVar.f195862d = null;
            } else if (eVar.f195863e != null) {
                eVar.f195863e = null;
            }
            eVar.b().a(0, iA);
            eVar.c(m2Var3, null);
            return;
        }
        if (m2Var2 == null) {
            m2Var2 = l4Var;
        }
        if (m2Var2 == null) {
            eVar.f195862d = m2Var;
            cVar.getClass();
            ArrayList arrayList = m2Var.f196227h;
            p13.d0.B(n2.f196275a, arrayList);
            arrayList.add(new WeakReference(cVar));
            m2Var.d(cVar);
            m2Var.c(c3648e);
            eVar.b().c(0, m2Var.f196223d.getSize());
            eVar.c(null, m2Var);
            return;
        }
        if (l4Var != null) {
            c3648e.getClass();
            p13.d0.B(new p2(c3648e), l4Var.f196226g);
            cVar.getClass();
            p13.d0.B(new q2(cVar), l4Var.f196227h);
            if (!l4Var.getF196152k()) {
                l4Var = new l4(l4Var);
            }
            eVar.f195863e = l4Var;
            eVar.f195862d = null;
        }
        m2<T> m2Var4 = eVar.f195863e;
        if (m2Var4 == null || eVar.f195862d != null) {
            vb.h.z("must be in snapshot state to diff");
            return;
        }
        m2<T> l4Var2 = m2Var.getF196152k() ? m2Var : new l4(m2Var);
        m3 m3Var = new m3();
        m2Var.c(m3Var);
        eVar.f195860b.f10414b.execute(new la2.d(m2Var4, l4Var2, i14, eVar, m2Var, m3Var, 1));
    }

    public r2(androidx.recyclerview.widget.o.f<T> fVar) {
        fVar.getClass();
        a aVar = new a(this);
        e<T> eVar = new e<>(this, fVar);
        this.f196366a = eVar;
        eVar.f195861c.add(new e.a(aVar));
    }
}
