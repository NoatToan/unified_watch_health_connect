package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.devicelist.SportsDeviceListView;
import com.xiaomi.fitness.health.pai.view.PaiLimitGridView;
import com.xiaomi.fitness.health.pai.view.PaiProgressView;
import com.xiaomi.fitness.view.CardUnderstandView;
import com.xiaomi.fitness.view.DataTitleView;

/* JADX INFO: loaded from: classes9.dex */
public class kaa extends jaa {
    public static final ViewDataBinding.i Q = null;
    public static final SparseIntArray R;
    public final LinearLayout O;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(eri.wc, 1);
        sparseIntArray.put(eri.H2, 2);
        sparseIntArray.put(eri.vc, 3);
        sparseIntArray.put(eri.Q9, 4);
        sparseIntArray.put(eri.dn, 5);
        sparseIntArray.put(eri.jd, 6);
        sparseIntArray.put(eri.V6, 7);
        sparseIntArray.put(eri.uc, 8);
        sparseIntArray.put(eri.P9, 9);
        sparseIntArray.put(eri.X8, 10);
        sparseIntArray.put(eri.bn, 11);
        sparseIntArray.put(eri.S8, 12);
        sparseIntArray.put(eri.B3, 13);
        sparseIntArray.put(eri.uo, 14);
    }

    public kaa(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (DataTitleView) objArr[2], (SportsDeviceListView) objArr[13], (DataTitleView) objArr[7], (ImageView) objArr[12], (ImageView) objArr[10], (LinearLayout) objArr[9], (LinearLayout) objArr[4], (PaiLimitGridView) objArr[8], (PaiProgressView) objArr[3], (BarChartRecyclerView) objArr[1], (BarChartRecyclerView) objArr[6], (TextView) objArr[11], (TextView) objArr[5], (CardUnderstandView) objArr[14]);
        this.P = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.O = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.P != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.P = 1L;
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
            this.P = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public kaa(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 15, Q, R));
    }
}
