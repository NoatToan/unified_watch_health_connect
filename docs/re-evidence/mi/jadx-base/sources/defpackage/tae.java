package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public class tae extends sae {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(xri.u, 1);
        sparseIntArray.put(xri.n7, 2);
        sparseIntArray.put(xri.B0, 3);
        sparseIntArray.put(xri.C3, 4);
        sparseIntArray.put(xri.C4, 5);
        sparseIntArray.put(xri.D3, 6);
        sparseIntArray.put(xri.B3, 7);
        sparseIntArray.put(xri.A3, 8);
        sparseIntArray.put(xri.E0, 9);
        sparseIntArray.put(xri.F0, 10);
    }

    public tae(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (CardView) objArr[1], (LinearLayout) objArr[9], (CardView) objArr[10], (LinearLayout) objArr[3], (View) objArr[8], (ImageView) objArr[7], (CardView) objArr[4], (LinearLayout) objArr[6], (ImageView) objArr[5], (ConstraintLayout) objArr[0], (CardView) objArr[2]);
        this.L = -1L;
        this.J.setTag(null);
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

    public tae(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
