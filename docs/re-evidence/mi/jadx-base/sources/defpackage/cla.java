package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.common.devicelist.SportsDeviceListView;
import com.xiaomi.fitness.view.CardUnderstandView;
import com.xiaomi.fitness.view.DataTitleView;

/* JADX INFO: loaded from: classes9.dex */
public class cla extends bla {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final LinearLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(eri.Ea, 1);
        sparseIntArray.put(eri.H2, 2);
        sparseIntArray.put(eri.qj, 3);
        sparseIntArray.put(eri.zd, 4);
        sparseIntArray.put(eri.Y3, 5);
        sparseIntArray.put(eri.ma, 6);
        sparseIntArray.put(eri.ra, 7);
        sparseIntArray.put(eri.B3, 8);
        sparseIntArray.put(eri.uo, 9);
    }

    public cla(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (DataTitleView) objArr[2], (SportsDeviceListView) objArr[8], (View) objArr[5], (LevelBarView) objArr[6], (RecyclerView) objArr[7], (LineChartRecyclerView) objArr[1], (RecyclerView) objArr[4], (LinearLayout) objArr[3], (CardUnderstandView) objArr[9]);
        this.K = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.J = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.K = 1L;
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
            this.K = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public cla(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 10, L, M));
    }
}
