package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes7.dex */
public class lzh extends kzh {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(wqi.x, 1);
        sparseIntArray.put(wqi.M, 2);
        sparseIntArray.put(wqi.Q, 3);
        sparseIntArray.put(wqi.N, 4);
        sparseIntArray.put(wqi.R, 5);
        sparseIntArray.put(wqi.i1, 6);
        sparseIntArray.put(wqi.o1, 7);
    }

    public lzh(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (Guideline) objArr[1], (ImageView) objArr[2], (ImageView) objArr[4], (ImageView) objArr[3], (ImageView) objArr[5], (ConstraintLayout) objArr[0], (TextView) objArr[6], (TextView) objArr[7]);
        this.I = -1L;
        this.F.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.I != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.I = 1L;
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
            this.I = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public lzh(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 8, J, K));
    }
}
