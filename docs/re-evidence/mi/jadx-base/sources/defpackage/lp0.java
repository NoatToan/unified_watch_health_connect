package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public class lp0 extends kp0 {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(xri.N3, 1);
        sparseIntArray.put(xri.t5, 2);
        sparseIntArray.put(xri.e8, 3);
        sparseIntArray.put(xri.i5, 4);
        sparseIntArray.put(xri.f5, 5);
        sparseIntArray.put(xri.J, 6);
    }

    public lp0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, null, (View) objArr[6], null, (TextView) objArr[1], (ImageView) objArr[5], (ConstraintLayout) objArr[0], (TextView) objArr[2], (TextView) objArr[4], (TextView) objArr[3]);
        this.J = -1L;
        this.F.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.J != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.J = 1L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.J = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public lp0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, K, L));
    }
}
