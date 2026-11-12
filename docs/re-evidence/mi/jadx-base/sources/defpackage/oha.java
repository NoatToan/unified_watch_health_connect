package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.health.threetarget.model.ThreeTargetView;
import com.xiaomi.fitness.health.threetarget.view.TargetWeekBarView;

/* JADX INFO: loaded from: classes9.dex */
public class oha extends nha {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final ConstraintLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(eri.K2, 1);
        sparseIntArray.put(eri.pi, 2);
        sparseIntArray.put(eri.Ti, 3);
        sparseIntArray.put(eri.qd, 4);
        sparseIntArray.put(eri.l1, 5);
        sparseIntArray.put(eri.ph, 6);
        sparseIntArray.put(eri.b1, 7);
        sparseIntArray.put(eri.p, 8);
        sparseIntArray.put(eri.ch, 9);
        sparseIntArray.put(eri.H2, 10);
    }

    public oha(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (FrameLayout) objArr[8], (FrameLayout) objArr[7], (FrameLayout) objArr[5], (TextView) objArr[10], (LinearLayout) objArr[1], (RecyclerView) objArr[4], (FrameLayout) objArr[9], (FrameLayout) objArr[6], (TargetWeekBarView) objArr[2], (ThreeTargetView) objArr[3]);
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

    public oha(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
