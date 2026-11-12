package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.flexbox.FlexboxLayout;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.health.curse.view.HealthCurseSignView;
import com.xiaomi.fitness.view.TemperatureTrendEmptyView;

/* JADX INFO: loaded from: classes9.dex */
public class rtb extends qtb {
    public static final ViewDataBinding.i R = null;
    public static final SparseIntArray S;
    public long Q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(eri.z2, 3);
        sparseIntArray.put(eri.x2, 4);
        sparseIntArray.put(eri.y2, 5);
        sparseIntArray.put(eri.v2, 6);
        sparseIntArray.put(eri.t2, 7);
        sparseIntArray.put(eri.A2, 8);
        sparseIntArray.put(eri.u2, 9);
        sparseIntArray.put(eri.s2, 10);
        sparseIntArray.put(eri.r2, 11);
        sparseIntArray.put(eri.e2, 12);
        sparseIntArray.put(eri.Uc, 13);
        sparseIntArray.put(eri.sc, 14);
        sparseIntArray.put(eri.C2, 15);
    }

    public rtb(rk5 rk5Var, View[] viewArr, Object[] objArr) {
        super(rk5Var, viewArr[0], 0, (HealthCurseSignView) objArr[12], (FlexboxLayout) objArr[11], (TextView) objArr[10], (ConstraintLayout) objArr[1], (TextView) objArr[7], (LinearLayout) objArr[9], (TextView) objArr[6], (LinearLayout) objArr[4], (TextView) objArr[5], (TextView) objArr[0], (LinearLayout) objArr[3], (LineChartRecyclerView) objArr[8], (HealthCurseSignView) objArr[15], (TemperatureTrendEmptyView) objArr[2], (HealthCurseSignView) objArr[14], (HealthCurseSignView) objArr[13]);
        this.Q = -1L;
        this.D.setTag(null);
        this.J.setTag(null);
        this.N.setTag(null);
        p0(viewArr);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.Q != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.Q = 1L;
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
            this.Q = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public rtb(rk5 rk5Var, View[] viewArr) {
        this(rk5Var, viewArr, ViewDataBinding.V(rk5Var, viewArr, 16, R, S));
    }
}
