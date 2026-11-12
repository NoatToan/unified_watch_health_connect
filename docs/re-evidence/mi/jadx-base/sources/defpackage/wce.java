package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes10.dex */
public class wce extends vce {
    public static final ViewDataBinding.i D;
    public static final SparseIntArray E;
    public final ConstraintLayout B;
    public long C;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(2);
        D = iVar;
        iVar.a(0, new String[]{"sport_command_view"}, new int[]{1}, new int[]{dvi.T});
        E = null;
    }

    public wce(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (pbn) objArr[1]);
        this.C = -1L;
        k0(this.A);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.B = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(pbn pbnVar, int i) {
        if (i != nv1.f28390a) {
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
        return A0((pbn) obj, i2);
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

    public wce(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 2, D, E));
    }
}
