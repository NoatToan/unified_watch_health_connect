package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes9.dex */
public class una extends tna {
    public static final ViewDataBinding.i D;
    public static final SparseIntArray E;
    public final FrameLayout B;
    public long C;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(2);
        D = iVar;
        iVar.a(0, new String[]{"health_weight_evaluation_detail_item"}, new int[]{1}, new int[]{jui.Y5});
        E = null;
    }

    public una(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (z3c) objArr[1]);
        this.C = -1L;
        k0(this.A);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.B = frameLayout;
        frameLayout.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(z3c z3cVar, int i) {
        if (i != cv1.f14763a) {
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
        return A0((z3c) obj, i2);
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

    public una(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 2, D, E));
    }
}
