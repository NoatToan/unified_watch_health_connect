package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.health.bloodpressure.BloodPressureViewModel;
import miuix.miuixbasewidget.widget.FilterSortView;

/* JADX INFO: loaded from: classes9.dex */
public class i1f extends h1f {
    public static final ViewDataBinding.i G;
    public static final SparseIntArray H;
    public final LinearLayout E;
    public long F;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(4);
        G = iVar;
        iVar.a(0, new String[]{"widget_top_bar"}, new int[]{1}, new int[]{mvi.A});
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(eri.c5, 2);
        sparseIntArray.put(eri.Z0, 3);
    }

    public i1f(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (BarChartRecyclerView) objArr[3], (FilterSortView) objArr[2], (gkr) objArr[1]);
        this.F = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.E = linearLayout;
        linearLayout.setTag(null);
        k0(this.C);
        o0(view);
        H();
    }

    public final boolean A0(gkr gkrVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.F |= 1;
        }
        return true;
    }

    public void B0(BloodPressureViewModel bloodPressureViewModel) {
        this.D = bloodPressureViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.F != 0) {
                    return true;
                }
                return this.C.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.F = 4L;
        }
        this.C.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((gkr) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.C.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.F = 0L;
        }
        ViewDataBinding.r(this.C);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (cv1.c != i) {
            return false;
        }
        B0((BloodPressureViewModel) obj);
        return true;
    }

    public i1f(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 4, G, H));
    }
}
