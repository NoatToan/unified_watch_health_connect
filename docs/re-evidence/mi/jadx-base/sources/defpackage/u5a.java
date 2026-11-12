package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.view.DataTitleView;
import com.xiaomi.fitness.view.DispatchMaskDownLinearLayout;

/* JADX INFO: loaded from: classes9.dex */
public class u5a extends t5a {
    public static final ViewDataBinding.i H;
    public static final SparseIntArray I;
    public long G;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(6);
        H = iVar;
        iVar.a(0, new String[]{"layout_energy_dwm_common"}, new int[]{1}, new int[]{jui.b7});
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(eri.S3, 2);
        sparseIntArray.put(eri.Ea, 3);
        sparseIntArray.put(eri.H2, 4);
        sparseIntArray.put(eri.X0, 5);
    }

    public u5a(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (BarChartRecyclerView) objArr[5], (DataTitleView) objArr[4], (DispatchMaskDownLinearLayout) objArr[2], (LinearLayout) objArr[0], (LineChartRecyclerView) objArr[3], (z8e) objArr[1]);
        this.G = -1L;
        this.D.setTag(null);
        k0(this.F);
        o0(view);
        H();
    }

    public final boolean A0(z8e z8eVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.G |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.G != 0) {
                    return true;
                }
                return this.F.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.G = 2L;
        }
        this.F.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((z8e) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.F.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.G = 0L;
        }
        ViewDataBinding.r(this.F);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public u5a(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 6, H, I));
    }
}
