package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.LineDetailChartRecyclerView;
import com.xiaomi.fitness.chart.view.SleepChartRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public class ace extends zbe {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(eri.x3, 2);
        sparseIntArray.put(eri.e7, 3);
        sparseIntArray.put(eri.ca, 4);
        sparseIntArray.put(eri.y1, 5);
        sparseIntArray.put(eri.Ea, 6);
        sparseIntArray.put(eri.Rg, 7);
    }

    public ace(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (SleepChartRecyclerView) objArr[5], (View) objArr[2], (ImageView) objArr[3], (FrameLayout) objArr[1], (LinearLayout) objArr[0], (LinearLayout) objArr[4], (LineDetailChartRecyclerView) objArr[6], (LineDetailChartRecyclerView) objArr[7]);
        this.I = -1L;
        this.D.setTag(null);
        this.E.setTag(null);
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

    public ace(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 8, J, K));
    }
}
