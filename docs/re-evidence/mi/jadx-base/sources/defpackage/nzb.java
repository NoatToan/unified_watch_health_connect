package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.health.sleep.view.wm.SleepRegularView;

/* JADX INFO: loaded from: classes9.dex */
public class nzb extends mzb {
    public static final ViewDataBinding.i J;
    public static final SparseIntArray K;
    public long I;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(8);
        J = iVar;
        iVar.a(0, new String[]{"layout_common_icon_title"}, new int[]{1}, new int[]{jui.v6});
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(eri.mk, 2);
        sparseIntArray.put(eri.nk, 3);
        sparseIntArray.put(eri.qk, 4);
        sparseIntArray.put(eri.rk, 5);
        sparseIntArray.put(eri.vl, 6);
        sparseIntArray.put(eri.ig, 7);
    }

    public nzb(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (a7e) objArr[1], (ConstraintLayout) objArr[0], (SleepRegularView) objArr[7], (TextView) objArr[2], (TextView) objArr[3], (TextView) objArr[4], (TextView) objArr[5], (TextView) objArr[6]);
        this.I = -1L;
        k0(this.A);
        this.B.setTag(null);
        o0(view);
        H();
    }

    private boolean A0(a7e a7eVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.I |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.I != 0) {
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
            this.I = 2L;
        }
        this.A.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((a7e) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.A.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.I = 0L;
        }
        ViewDataBinding.r(this.A);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public nzb(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 8, J, K));
    }
}
