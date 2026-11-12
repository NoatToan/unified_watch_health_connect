package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public class iv4 extends hv4 {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(oqi.o1, 2);
        sparseIntArray.put(oqi.Z1, 3);
        sparseIntArray.put(oqi.a2, 4);
        sparseIntArray.put(oqi.Y0, 5);
        sparseIntArray.put(oqi.U1, 6);
        sparseIntArray.put(oqi.T1, 7);
        sparseIntArray.put(oqi.S1, 8);
        sparseIntArray.put(oqi.g2, 9);
    }

    public iv4(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ConstraintLayout) objArr[0], (FrameLayout) objArr[1], (RecyclerView) objArr[5], (View) objArr[2], (TextView) objArr[8], (TextView) objArr[7], (TextView) objArr[6], (TextView) objArr[3], (TextView) objArr[4], (TextView) objArr[9]);
        this.K = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.K = 1L;
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
            this.K = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public iv4(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 10, L, M));
    }
}
