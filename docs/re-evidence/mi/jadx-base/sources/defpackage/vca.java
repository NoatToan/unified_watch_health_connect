package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.health.sleep.view.wm.SleepRegularView;
import com.xiaomi.fitness.view.DataTitleView;

/* JADX INFO: loaded from: classes9.dex */
public class vca extends uca {
    public static final ViewDataBinding.i W;
    public static final SparseIntArray X;
    public final ConstraintLayout Q;
    public final a7e R;
    public final a7e S;
    public final a7e T;
    public final a7e U;
    public long V;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(21);
        W = iVar;
        iVar.a(1, new String[]{"layout_sleep_evaluation"}, new int[]{6}, new int[]{jui.y7});
        iVar.a(2, new String[]{"layout_common_icon_title"}, new int[]{7}, new int[]{jui.v6});
        iVar.a(3, new String[]{"layout_common_icon_title"}, new int[]{8}, new int[]{jui.v6});
        iVar.a(4, new String[]{"layout_common_icon_title"}, new int[]{9}, new int[]{jui.v6});
        iVar.a(5, new String[]{"layout_common_icon_title"}, new int[]{10}, new int[]{jui.v6});
        SparseIntArray sparseIntArray = new SparseIntArray();
        X = sparseIntArray;
        sparseIntArray.put(eri.cb, 11);
        sparseIntArray.put(eri.ra, 12);
        sparseIntArray.put(eri.U3, 13);
        sparseIntArray.put(eri.V3, 14);
        sparseIntArray.put(eri.ig, 15);
        sparseIntArray.put(eri.Y6, 16);
        sparseIntArray.put(eri.c7, 17);
        sparseIntArray.put(eri.Qg, 18);
        sparseIntArray.put(eri.Sg, 19);
        sparseIntArray.put(eri.H2, 20);
    }

    public vca(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (rbe) objArr[6], (LinearLayout) objArr[1], (TextView) objArr[20], (DataTitleView) objArr[13], (BarChartRecyclerView) objArr[14], (DataTitleView) objArr[16], (BarChartRecyclerView) objArr[17], (LinearLayout) objArr[2], (LinearLayout) objArr[4], (LinearLayout) objArr[3], (LinearLayout) objArr[5], (RecyclerView) objArr[12], (LinearLayout) objArr[11], (SleepRegularView) objArr[15], (DataTitleView) objArr[18], (BarChartRecyclerView) objArr[19]);
        this.V = -1L;
        k0(this.A);
        this.B.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        this.K.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.Q = constraintLayout;
        constraintLayout.setTag(null);
        a7e a7eVar = (a7e) objArr[7];
        this.R = a7eVar;
        k0(a7eVar);
        a7e a7eVar2 = (a7e) objArr[8];
        this.S = a7eVar2;
        k0(a7eVar2);
        a7e a7eVar3 = (a7e) objArr[9];
        this.T = a7eVar3;
        k0(a7eVar3);
        a7e a7eVar4 = (a7e) objArr[10];
        this.U = a7eVar4;
        k0(a7eVar4);
        o0(view);
        H();
    }

    private boolean A0(rbe rbeVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.V |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.V != 0) {
                    return true;
                }
                return this.A.F() || this.R.F() || this.S.F() || this.T.F() || this.U.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.V = 2L;
        }
        this.A.H();
        this.R.H();
        this.S.H();
        this.T.H();
        this.U.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((rbe) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.A.l0(lifecycleOwner);
        this.R.l0(lifecycleOwner);
        this.S.l0(lifecycleOwner);
        this.T.l0(lifecycleOwner);
        this.U.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.V = 0L;
        }
        ViewDataBinding.r(this.A);
        ViewDataBinding.r(this.R);
        ViewDataBinding.r(this.S);
        ViewDataBinding.r(this.T);
        ViewDataBinding.r(this.U);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public vca(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 21, W, X));
    }
}
