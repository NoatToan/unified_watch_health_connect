package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes10.dex */
public class lrp extends krp {
    public static final ViewDataBinding.i T;
    public static final SparseIntArray U;
    public final ConstraintLayout R;
    public long S;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(18);
        T = iVar;
        iVar.a(0, new String[]{"trail_total_diving"}, new int[]{1}, new int[]{ivi.I2});
        SparseIntArray sparseIntArray = new SparseIntArray();
        U = sparseIntArray;
        sparseIntArray.put(bsi.common_layout, 2);
        sparseIntArray.put(bsi.x7, 3);
        sparseIntArray.put(bsi.J0, 4);
        sparseIntArray.put(bsi.N4, 5);
        sparseIntArray.put(bsi.M4, 6);
        sparseIntArray.put(bsi.z1, 7);
        sparseIntArray.put(bsi.c, 8);
        sparseIntArray.put(bsi.M1, 9);
        sparseIntArray.put(bsi.y3, 10);
        sparseIntArray.put(bsi.M7, 11);
        sparseIntArray.put(bsi.N7, 12);
        sparseIntArray.put(bsi.g6, 13);
        sparseIntArray.put(bsi.O7, 14);
        sparseIntArray.put(bsi.P7, 15);
        sparseIntArray.put(bsi.f4566k, 16);
        sparseIntArray.put(bsi.z6, 17);
    }

    public lrp(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (TextView) objArr[8], new ixq((ViewStub) objArr[16]), (LinearLayout) objArr[2], (LinearLayout) objArr[4], (DividerView) objArr[7], (TextView) objArr[9], (LinearLayout) objArr[10], (TextView) objArr[5], (TextView) objArr[6], (LinearLayout) objArr[13], new ixq((ViewStub) objArr[17]), (TextView) objArr[3], (mrp) objArr[1], (TextView) objArr[11], (TextView) objArr[12], (TextView) objArr[14], (TextView) objArr[15]);
        this.S = -1L;
        this.B.j(this);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.R = constraintLayout;
        constraintLayout.setTag(null);
        this.K.j(this);
        k0(this.M);
        o0(view);
        H();
    }

    public final boolean A0(mrp mrpVar, int i) {
        if (i != qv1.f31871a) {
            return false;
        }
        synchronized (this) {
            this.S |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.S != 0) {
                    return true;
                }
                return this.M.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.S = 2L;
        }
        this.M.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((mrp) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.M.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.S = 0L;
        }
        ViewDataBinding.r(this.M);
        if (this.B.g() != null) {
            ViewDataBinding.r(this.B.g());
        }
        if (this.K.g() != null) {
            ViewDataBinding.r(this.K.g());
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public lrp(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 18, T, U));
    }
}
