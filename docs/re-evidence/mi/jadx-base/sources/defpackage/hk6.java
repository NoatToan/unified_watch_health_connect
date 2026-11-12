package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public class hk6 extends gk6 {
    public static final ViewDataBinding.i Q = null;
    public static final SparseIntArray R;
    public final ConstraintLayout O;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(zqi.C5, 1);
        sparseIntArray.put(zqi.L9, 2);
        sparseIntArray.put(zqi.y2, 3);
        sparseIntArray.put(zqi.U0, 4);
        sparseIntArray.put(zqi.N8, 5);
        sparseIntArray.put(zqi.i2, 6);
        sparseIntArray.put(zqi.e8, 7);
        sparseIntArray.put(zqi.a1, 8);
        sparseIntArray.put(zqi.da, 9);
        sparseIntArray.put(zqi.C6, 10);
        sparseIntArray.put(zqi.I, 11);
        sparseIntArray.put(zqi.I6, 12);
        sparseIntArray.put(zqi.W0, 13);
        sparseIntArray.put(zqi.aa, 14);
    }

    public hk6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ConstraintLayout) objArr[11], (TextView) objArr[4], (TextView) objArr[13], (ImageView) objArr[8], (View) objArr[6], (TextView) objArr[3], (TextView) objArr[1], (ImageView) objArr[10], (SeekBar) objArr[12], (ImageView) objArr[7], (TextView) objArr[5], (TextView) objArr[2], (TextView) objArr[14], (ImageView) objArr[9]);
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

    public hk6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 15, Q, R));
    }
}
