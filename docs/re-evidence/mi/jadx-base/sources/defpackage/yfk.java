package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.DividerView;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes9.dex */
public class yfk extends xfk {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final ConstraintLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(qri.o, 1);
        sparseIntArray.put(qri.f31772b, 2);
        sparseIntArray.put(qri.M, 3);
        sparseIntArray.put(qri.Q, 4);
        sparseIntArray.put(qri.j0, 5);
        sparseIntArray.put(qri.t, 6);
        sparseIntArray.put(qri.h, 7);
        sparseIntArray.put(qri.x, 8);
        sparseIntArray.put(qri.C, 9);
        sparseIntArray.put(qri.F, 10);
    }

    public yfk(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ConstraintLayout) objArr[2], (ImageView) objArr[7], (ConstraintLayout) objArr[1], (DividerView) objArr[6], (TextView) objArr[8], (ImageView) objArr[9], (TextView) objArr[10], (RoundImageView) objArr[3], (TextView) objArr[4], (TextView) objArr[5]);
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

    public yfk(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
