package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.health.temperature.ui.TemperatureDataTitleView;
import com.xiaomi.fitness.view.CardUnderstandView;
import com.xiaomi.fitness.view.TemperatureTrendEmptyView;

/* JADX INFO: loaded from: classes9.dex */
public class ala extends zka {
    public static final ViewDataBinding.i P = null;
    public static final SparseIntArray Q;
    public long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(eri.Mg, 1);
        sparseIntArray.put(eri.pd, 2);
        sparseIntArray.put(eri.H2, 3);
        sparseIntArray.put(eri.Fi, 4);
        sparseIntArray.put(eri.Bi, 5);
        sparseIntArray.put(eri.Ii, 6);
        sparseIntArray.put(eri.Hi, 7);
        sparseIntArray.put(eri.Di, 8);
        sparseIntArray.put(eri.Ci, 9);
        sparseIntArray.put(eri.Gi, 10);
        sparseIntArray.put(eri.Ei, 11);
        sparseIntArray.put(eri.zd, 12);
        sparseIntArray.put(eri.uo, 13);
    }

    public ala(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TemperatureDataTitleView) objArr[3], (BarChartRecyclerView) objArr[2], (RecyclerView) objArr[12], (View) objArr[1], (FrameLayout) objArr[5], (TextView) objArr[9], (TextView) objArr[8], (TemperatureTrendEmptyView) objArr[11], (FrameLayout) objArr[4], (LineChartRecyclerView) objArr[10], (TextView) objArr[7], (LinearLayout) objArr[6], (LinearLayout) objArr[0], (CardUnderstandView) objArr[13]);
        this.O = -1L;
        this.M.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.O != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.O = 1L;
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
            this.O = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public ala(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 14, P, Q));
    }
}
