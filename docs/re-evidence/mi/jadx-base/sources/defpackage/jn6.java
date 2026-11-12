package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes8.dex */
public class jn6 extends in6 {
    public static final ViewDataBinding.i F;
    public static final SparseIntArray G;
    public final CoordinatorLayout D;
    public long E;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(4);
        F = iVar;
        iVar.a(1, new String[]{"device_settings_widget_select_title"}, new int[]{2}, new int[]{eui.j2});
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(zqi.I4, 3);
    }

    public jn6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (LinearLayout) objArr[3], (ConstraintLayout) objArr[1], (kn6) objArr[2]);
        this.E = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.D = coordinatorLayout;
        coordinatorLayout.setTag(null);
        this.B.setTag(null);
        k0(this.C);
        o0(view);
        H();
    }

    private boolean A0(kn6 kn6Var, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.E |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.E != 0) {
                    return true;
                }
                return this.C.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.E = 2L;
        }
        this.C.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((kn6) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.C.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.E = 0L;
        }
        ViewDataBinding.r(this.C);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public jn6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 4, F, G));
    }
}
