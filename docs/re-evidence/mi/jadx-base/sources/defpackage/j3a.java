package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.view.CardUnderstandView;
import com.xiaomi.fitness.view.DataTitleView;
import com.xiaomi.fitness.view.HealthBannerCardSetView;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;

/* JADX INFO: loaded from: classes9.dex */
public class j3a extends i3a {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(eri.Ea, 1);
        sparseIntArray.put(eri.H2, 2);
        sparseIntArray.put(eri.zd, 3);
        sparseIntArray.put(eri.kb, 4);
        sparseIntArray.put(eri.lb, 5);
        sparseIntArray.put(eri.Ad, 6);
        sparseIntArray.put(eri.Bd, 7);
        sparseIntArray.put(eri.Sb, 8);
        sparseIntArray.put(eri.L5, 9);
        sparseIntArray.put(eri.uo, 10);
    }

    public j3a(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LinearLayout) objArr[0], (DataTitleView) objArr[2], (HealthBannerCardSetView) objArr[9], (LineChartRecyclerView) objArr[1], (LinearLayout) objArr[4], (DataTitleSimpleView) objArr[5], (CardUnderstandView) objArr[8], (RecyclerView) objArr[3], (RecyclerView) objArr[6], (RecyclerView) objArr[7], (CardUnderstandView) objArr[10]);
        this.L = -1L;
        this.A.setTag(null);
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

    public j3a(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
