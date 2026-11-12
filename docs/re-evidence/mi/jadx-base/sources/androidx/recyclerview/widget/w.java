package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class w extends RecyclerView.l {
    public boolean g = true;

    @SuppressLint({"UnknownNullness"})
    public abstract boolean B(RecyclerView.d0 d0Var);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean C(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i, int i2, int i3, int i4);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean D(RecyclerView.d0 d0Var, int i, int i2, int i3, int i4);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean E(RecyclerView.d0 d0Var);

    @SuppressLint({"UnknownNullness"})
    public final void F(RecyclerView.d0 d0Var) {
        N(d0Var);
        h(d0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void G(RecyclerView.d0 d0Var) {
        O(d0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void H(RecyclerView.d0 d0Var, boolean z) {
        P(d0Var, z);
        h(d0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void I(RecyclerView.d0 d0Var, boolean z) {
        Q(d0Var, z);
    }

    @SuppressLint({"UnknownNullness"})
    public final void J(RecyclerView.d0 d0Var) {
        R(d0Var);
        h(d0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void K(RecyclerView.d0 d0Var) {
        S(d0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void L(RecyclerView.d0 d0Var) {
        T(d0Var);
        h(d0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void M(RecyclerView.d0 d0Var) {
        U(d0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public void N(RecyclerView.d0 d0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void O(RecyclerView.d0 d0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void P(RecyclerView.d0 d0Var, boolean z) {
    }

    @SuppressLint({"UnknownNullness"})
    public void Q(RecyclerView.d0 d0Var, boolean z) {
    }

    @SuppressLint({"UnknownNullness"})
    public void R(RecyclerView.d0 d0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void S(RecyclerView.d0 d0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void T(RecyclerView.d0 d0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void U(RecyclerView.d0 d0Var) {
    }

    public void V(boolean z) {
        this.g = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean a(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i;
        int i2;
        return (cVar == null || ((i = cVar.f2809a) == (i2 = cVar2.f2809a) && cVar.f2810b == cVar2.f2810b)) ? B(d0Var) : D(d0Var, i, cVar.f2810b, i2, cVar2.f2810b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean b(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f2809a;
        int i4 = cVar.f2810b;
        if (d0Var2.shouldIgnore()) {
            int i5 = cVar.f2809a;
            i2 = cVar.f2810b;
            i = i5;
        } else {
            i = cVar2.f2809a;
            i2 = cVar2.f2810b;
        }
        return C(d0Var, d0Var2, i3, i4, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean c(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i = cVar.f2809a;
        int i2 = cVar.f2810b;
        View view = d0Var.itemView;
        int left = cVar2 == null ? view.getLeft() : cVar2.f2809a;
        int top = cVar2 == null ? view.getTop() : cVar2.f2810b;
        if (d0Var.isRemoved() || (i == left && i2 == top)) {
            return E(d0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return D(d0Var, i, i2, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean d(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i = cVar.f2809a;
        int i2 = cVar2.f2809a;
        if (i != i2 || cVar.f2810b != cVar2.f2810b) {
            return D(d0Var, i, cVar.f2810b, i2, cVar2.f2810b);
        }
        J(d0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean f(RecyclerView.d0 d0Var) {
        return !this.g || d0Var.isInvalid();
    }
}
