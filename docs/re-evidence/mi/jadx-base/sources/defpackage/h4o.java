package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public class h4o extends g4o {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final ConstraintLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(xri.z0, 1);
        sparseIntArray.put(xri.S4, 2);
        sparseIntArray.put(xri.n1, 3);
        sparseIntArray.put(xri.b2, 4);
        sparseIntArray.put(xri.b1, 5);
        sparseIntArray.put(xri.c1, 6);
        sparseIntArray.put(xri.c2, 7);
        sparseIntArray.put(xri.m1, 8);
        sparseIntArray.put(xri.m7, 9);
        sparseIntArray.put(xri.f1, 10);
    }

    public h4o(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageFilterView) objArr[1], (ImageFilterView) objArr[5], (ImageFilterView) objArr[6], (TextView) objArr[10], (Group) objArr[8], (View) objArr[3], (ImageFilterView) objArr[4], (ImageFilterView) objArr[7], (TextView) objArr[2], (TextView) objArr[9]);
        this.L = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.K = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.L != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.L = 1L;
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
            this.L = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public h4o(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
