package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.health.threetarget.model.ThreeTargetView;
import com.xiaomi.fitness.health.threetarget.view.TargetWeekBarView;

/* JADX INFO: loaded from: classes9.dex */
public class pha extends nha {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final LinearLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(eri.pi, 1);
        sparseIntArray.put(eri.Ti, 2);
        sparseIntArray.put(eri.qd, 3);
        sparseIntArray.put(eri.l1, 4);
        sparseIntArray.put(eri.ph, 5);
        sparseIntArray.put(eri.p, 6);
        sparseIntArray.put(eri.ch, 7);
    }

    public pha(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (FrameLayout) objArr[6], null, (FrameLayout) objArr[4], null, null, (RecyclerView) objArr[3], (FrameLayout) objArr[7], (FrameLayout) objArr[5], (TargetWeekBarView) objArr[1], (ThreeTargetView) objArr[2]);
        this.L = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.K = linearLayout;
        linearLayout.setTag(null);
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

    public pha(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 8, M, N));
    }
}
