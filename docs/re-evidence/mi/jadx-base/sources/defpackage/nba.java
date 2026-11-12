package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public class nba extends mba {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final NestedScrollView K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(eri.X8, 1);
        sparseIntArray.put(eri.bn, 2);
        sparseIntArray.put(eri.qn, 3);
        sparseIntArray.put(eri.Wm, 4);
        sparseIntArray.put(eri.Zm, 5);
        sparseIntArray.put(eri.Pg, 6);
        sparseIntArray.put(eri.E1, 7);
        sparseIntArray.put(eri.G8, 8);
        sparseIntArray.put(eri.yk, 9);
        sparseIntArray.put(eri.g0, 10);
    }

    public nba(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (BarChartRecyclerView) objArr[10], (LinearLayout) objArr[7], (AppCompatImageView) objArr[8], (AppCompatImageView) objArr[1], (View) objArr[6], (TextView) objArr[9], (TextView) objArr[4], (TextView) objArr[5], (TextView) objArr[2], (TextView) objArr[3]);
        this.L = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.K = nestedScrollView;
        nestedScrollView.setTag(null);
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

    public nba(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
