package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public class o4g extends n4g {
    public static final ViewDataBinding.i Q = null;
    public static final SparseIntArray R;
    public final ConstraintLayout O;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(lri.d1, 1);
        sparseIntArray.put(lri.t1, 2);
        sparseIntArray.put(lri.o, 3);
        sparseIntArray.put(lri.K0, 4);
        sparseIntArray.put(lri.A0, 5);
        sparseIntArray.put(lri.E0, 6);
        sparseIntArray.put(lri.D0, 7);
        sparseIntArray.put(lri.B0, 8);
        sparseIntArray.put(lri.C0, 9);
        sparseIntArray.put(lri.F0, 10);
        sparseIntArray.put(lri.J0, 11);
        sparseIntArray.put(lri.I0, 12);
        sparseIntArray.put(lri.G0, 13);
        sparseIntArray.put(lri.H0, 14);
    }

    public o4g(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[3], (ConstraintLayout) objArr[5], (ImageView) objArr[8], (TextView) objArr[9], (TextView) objArr[7], (LinearLayout) objArr[6], (ConstraintLayout) objArr[10], (ImageView) objArr[13], (TextView) objArr[14], (TextView) objArr[12], (LinearLayout) objArr[11], (ConstraintLayout) objArr[4], (ConstraintLayout) objArr[1], (ImageView) objArr[2]);
        this.P = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.O = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.P != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.P = 1L;
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
            this.P = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public o4g(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 15, Q, R));
    }
}
