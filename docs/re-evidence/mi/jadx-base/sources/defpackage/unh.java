package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes9.dex */
public class unh extends tnh {
    public static final ViewDataBinding.i D;
    public static final SparseIntArray E;
    public final ConstraintLayout B;
    public long C;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(2);
        D = iVar;
        iVar.a(0, new String[]{"pay_order_other_right_arrow_single_line_text_view"}, new int[]{1}, new int[]{uui.m});
        E = null;
    }

    public unh(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (aoh) objArr[1]);
        this.C = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.B = constraintLayout;
        constraintLayout.setTag(null);
        k0(this.A);
        o0(view);
        H();
    }

    public final boolean A0(aoh aohVar, int i) {
        if (i != jv1.f23164a) {
            return false;
        }
        synchronized (this) {
            this.C |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.C != 0) {
                    return true;
                }
                return this.A.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.C = 2L;
        }
        this.A.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((aoh) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.A.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.C = 0L;
        }
        ViewDataBinding.r(this.A);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public unh(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 2, D, E));
    }
}
