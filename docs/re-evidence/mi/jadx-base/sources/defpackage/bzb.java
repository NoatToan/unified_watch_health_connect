package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public class bzb extends azb {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final ConstraintLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(eri.bn, 1);
        sparseIntArray.put(eri.Ym, 2);
        sparseIntArray.put(eri.Xm, 3);
        sparseIntArray.put(eri.qm, 4);
        sparseIntArray.put(eri.ra, 5);
        sparseIntArray.put(eri.h0, 6);
        sparseIntArray.put(eri.Ta, 7);
        sparseIntArray.put(eri.Pl, 8);
    }

    public bzb(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (BarChartRecyclerView) objArr[6], (RecyclerView) objArr[5], (LinearLayout) objArr[7], (TextView) objArr[8], (TextView) objArr[4], (TextView) objArr[3], (TextView) objArr[2], (TextView) objArr[1]);
        this.J = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.J != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.J = 1L;
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
            this.J = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public bzb(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
