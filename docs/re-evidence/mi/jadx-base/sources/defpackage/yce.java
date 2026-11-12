package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.view.widget.CircularProgressLayout;

/* JADX INFO: loaded from: classes10.dex */
public class yce extends xce {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final ConstraintLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(xri.Q1, 1);
        sparseIntArray.put(xri.L1, 2);
        sparseIntArray.put(xri.J1, 3);
        sparseIntArray.put(xri.M1, 4);
        sparseIntArray.put(xri.P1, 5);
        sparseIntArray.put(xri.p6, 6);
        sparseIntArray.put(xri.B6, 7);
        sparseIntArray.put(xri.W, 8);
        sparseIntArray.put(xri.k3, 9);
        sparseIntArray.put(xri.X, 10);
    }

    public yce(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (FrameLayout) objArr[8], (ImageView) objArr[10], (CircularProgressLayout) objArr[3], (ImageView) objArr[2], (ImageView) objArr[4], (FrameLayout) objArr[5], (FrameLayout) objArr[1], (CircularProgressLayout) objArr[9], (ImageView) objArr[6], (ImageView) objArr[7]);
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

    public yce(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
