package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class h0 extends RecyclerView.m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10476g = true;

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean a(RecyclerView.f0 f0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i14;
        int i15;
        if (cVar != null && ((i14 = cVar.f10320a) != (i15 = cVar2.f10320a) || cVar.f10321b != cVar2.f10321b)) {
            return o(f0Var, i14, cVar.f10321b, i15, cVar2.f10321b);
        }
        m(f0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean b(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i14;
        int i15 = cVar.f10320a;
        int i16 = cVar.f10321b;
        if (f0Var2.shouldIgnore()) {
            i14 = cVar.f10320a;
        } else {
            i14 = cVar2.f10320a;
            cVar = cVar2;
        }
        return n(f0Var, f0Var2, i15, i16, i14, cVar.f10321b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean c(RecyclerView.f0 f0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i14 = cVar.f10320a;
        int i15 = cVar.f10321b;
        View view2 = f0Var.itemView;
        int left = cVar2 == null ? view2.getLeft() : cVar2.f10320a;
        int top = cVar2 == null ? view2.getTop() : cVar2.f10321b;
        if (f0Var.isRemoved() || (i14 == left && i15 == top)) {
            p(f0Var);
            return true;
        }
        view2.layout(left, top, view2.getWidth() + left, view2.getHeight() + top);
        return o(f0Var, i14, i15, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean d(RecyclerView.f0 f0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i14 = cVar.f10320a;
        int i15 = cVar2.f10320a;
        if (i14 != i15 || cVar.f10321b != cVar2.f10321b) {
            return o(f0Var, i14, cVar.f10321b, i15, cVar2.f10321b);
        }
        h(f0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean f(RecyclerView.f0 f0Var) {
        return !this.f10476g || f0Var.isInvalid();
    }

    @SuppressLint({"UnknownNullness"})
    public abstract void m(RecyclerView.f0 f0Var);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean n(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i14, int i15, int i16, int i17);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean o(RecyclerView.f0 f0Var, int i14, int i15, int i16, int i17);

    @SuppressLint({"UnknownNullness"})
    public abstract void p(RecyclerView.f0 f0Var);
}
