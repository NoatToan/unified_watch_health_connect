package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes9.dex */
public class xae extends wae {
    public static final ViewDataBinding.i E;
    public static final SparseIntArray F;
    public final LinearLayout C;
    public long D;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(3);
        E = iVar;
        iVar.a(0, new String[]{"layout_current_running_indicator", "layout_training_suggestion"}, new int[]{1, 2}, new int[]{jui.w6, jui.a8});
        F = null;
    }

    public xae(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 2, (g7e) objArr[1], (sde) objArr[2]);
        this.D = -1L;
        k0(this.A);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.C = linearLayout;
        linearLayout.setTag(null);
        k0(this.B);
        o0(view);
        H();
    }

    public final boolean A0(g7e g7eVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.D |= 2;
        }
        return true;
    }

    public final boolean B0(sde sdeVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.D |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.D != 0) {
                    return true;
                }
                return this.A.F() || this.B.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.D = 4L;
        }
        this.A.H();
        this.B.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return B0((sde) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return A0((g7e) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.A.l0(lifecycleOwner);
        this.B.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.D = 0L;
        }
        ViewDataBinding.r(this.A);
        ViewDataBinding.r(this.B);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public xae(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 3, E, F));
    }
}
