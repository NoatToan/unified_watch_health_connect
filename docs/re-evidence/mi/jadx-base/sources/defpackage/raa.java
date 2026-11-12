package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.chart.view.LineDetailChartRecyclerView;
import com.xiaomi.fitness.common.devicelist.SportsDeviceListView;
import com.xiaomi.fitness.view.CardUnderstandView;
import com.xiaomi.fitness.view.DataTitleView;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;

/* JADX INFO: loaded from: classes9.dex */
public class raa extends qaa {
    public static final ViewDataBinding.i T = null;
    public static final SparseIntArray U;
    public final LinearLayout R;
    public long S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        U = sparseIntArray;
        sparseIntArray.put(eri.pd, 1);
        sparseIntArray.put(eri.H2, 2);
        sparseIntArray.put(eri.qj, 3);
        sparseIntArray.put(eri.zd, 4);
        sparseIntArray.put(eri.Y3, 5);
        sparseIntArray.put(eri.ma, 6);
        sparseIntArray.put(eri.ra, 7);
        sparseIntArray.put(eri.L2, 8);
        sparseIntArray.put(eri.F2, 9);
        sparseIntArray.put(eri.pa, 10);
        sparseIntArray.put(eri.oa, 11);
        sparseIntArray.put(eri.J2, 12);
        sparseIntArray.put(eri.I2, 13);
        sparseIntArray.put(eri.Ga, 14);
        sparseIntArray.put(eri.Fa, 15);
        sparseIntArray.put(eri.B3, 16);
        sparseIntArray.put(eri.uo, 17);
    }

    public raa(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ConstraintLayout) objArr[8], (DataTitleSimpleView) objArr[9], (DataTitleView) objArr[2], (DataTitleView) objArr[13], (DataTitleView) objArr[12], (SportsDeviceListView) objArr[16], (View) objArr[5], (LevelBarView) objArr[6], (RecyclerView) objArr[7], (TextView) objArr[11], (TextView) objArr[10], (LineDetailChartRecyclerView) objArr[15], (LineChartRecyclerView) objArr[14], (LineChartRecyclerView) objArr[1], (RecyclerView) objArr[4], (LinearLayout) objArr[3], (CardUnderstandView) objArr[17]);
        this.S = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.R = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.S != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.S = 1L;
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
            this.S = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public raa(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 18, T, U));
    }
}
