package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.health.curse.view.SymChartRecordInfoView;
import com.xiaomi.fitness.health.curse.view.SymMoodChartRecordInfoView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes9.dex */
public class psb extends osb {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final LinearLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(eri.Me, 1);
        sparseIntArray.put(eri.W1, 2);
        sparseIntArray.put(eri.m0, 3);
        sparseIntArray.put(eri.Ic, 4);
        sparseIntArray.put(eri.g3, 5);
        sparseIntArray.put(eri.d7, 6);
        sparseIntArray.put(eri.s0, 7);
        sparseIntArray.put(eri.Qb, 8);
        sparseIntArray.put(eri.Io, 9);
        sparseIntArray.put(eri.e3, 10);
    }

    public psb(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (View) objArr[3], (SymChartRecordInfoView) objArr[7], (ConstraintLayout) objArr[2], (TextView) objArr[10], (TextView) objArr[5], (SymChartRecordInfoView) objArr[6], (SymMoodChartRecordInfoView) objArr[8], (TextView) objArr[4], (NestedScrollView) objArr[1], (TextView) objArr[9]);
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

    public psb(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
