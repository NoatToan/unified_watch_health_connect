package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.view.BloodSugarLineChartRecyclerView;
import com.xiaomi.fitness.view.CardUnderstandView;
import com.xiaomi.fitness.view.DataTitleView;
import com.xiaomi.fitness.view.HealthBannerCardSetView;

/* JADX INFO: loaded from: classes9.dex */
public class l3a extends k3a {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(eri.Ea, 1);
        sparseIntArray.put(eri.H2, 2);
        sparseIntArray.put(eri.Bd, 3);
        sparseIntArray.put(eri.zd, 4);
        sparseIntArray.put(eri.L5, 5);
        sparseIntArray.put(eri.uo, 6);
    }

    public l3a(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LinearLayout) objArr[0], (DataTitleView) objArr[2], (HealthBannerCardSetView) objArr[5], (BloodSugarLineChartRecyclerView) objArr[1], (RecyclerView) objArr[4], (RecyclerView) objArr[3], (CardUnderstandView) objArr[6]);
        this.H = -1L;
        this.A.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.H = 1L;
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
            this.H = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public l3a(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, I, J));
    }
}
