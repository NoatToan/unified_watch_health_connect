package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public class pf6 extends of6 {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final ConstraintLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(zqi.U9, 1);
        sparseIntArray.put(zqi.L9, 2);
        sparseIntArray.put(zqi.B4, 3);
        sparseIntArray.put(zqi.O2, 4);
        sparseIntArray.put(zqi.N2, 5);
        sparseIntArray.put(zqi.B6, 6);
        sparseIntArray.put(zqi.I6, 7);
        sparseIntArray.put(zqi.X0, 8);
        sparseIntArray.put(zqi.w2, 9);
        sparseIntArray.put(zqi.C6, 10);
    }

    public pf6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[8], (TextView) objArr[9], (ImageView) objArr[5], (ConstraintLayout) objArr[4], (RecyclerView) objArr[3], (ConstraintLayout) objArr[6], (ImageView) objArr[10], (SeekBar) objArr[7], (TextView) objArr[2], (TextView) objArr[1]);
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

    public pf6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
