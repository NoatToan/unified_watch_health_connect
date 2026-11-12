package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.devicelist.SportsDeviceListView;
import com.xiaomi.fitness.health.vitality.VitalityProgressView;
import com.xiaomi.fitness.view.CardUnderstandView;
import com.xiaomi.fitness.view.DataTitleView;
import com.xiaomi.fitness.widget.button.SwitchButton;

/* JADX INFO: loaded from: classes9.dex */
public class wma extends vma {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public final LinearLayout L;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(eri.ep, 1);
        sparseIntArray.put(eri.H2, 2);
        sparseIntArray.put(eri.P9, 3);
        sparseIntArray.put(eri.X8, 4);
        sparseIntArray.put(eri.bn, 5);
        sparseIntArray.put(eri.f16993cn, 6);
        sparseIntArray.put(eri.Nh, 7);
        sparseIntArray.put(eri.dp, 8);
        sparseIntArray.put(eri.Bd, 9);
        sparseIntArray.put(eri.B3, 10);
        sparseIntArray.put(eri.uo, 11);
    }

    public wma(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (DataTitleView) objArr[2], (SportsDeviceListView) objArr[10], (ImageView) objArr[4], (LinearLayout) objArr[3], (RecyclerView) objArr[9], (SwitchButton) objArr[7], (TextView) objArr[5], (TextView) objArr[6], (CardUnderstandView) objArr[11], (VitalityProgressView) objArr[8], (BarChartRecyclerView) objArr[1]);
        this.M = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.L = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.M != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.M = 1L;
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
            this.M = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public wma(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 12, N, O));
    }
}
