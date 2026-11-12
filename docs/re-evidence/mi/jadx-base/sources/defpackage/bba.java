package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.view.CardUnderstandView;
import com.xiaomi.fitness.view.DataTitleView;

/* JADX INFO: loaded from: classes9.dex */
public class bba extends aba {
    public static final ViewDataBinding.i I;
    public static final SparseIntArray J;
    public final ConstraintLayout F;
    public final LinearLayout G;
    public long H;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(7);
        I = iVar;
        iVar.a(1, new String[]{"layout_running_indicator_widget"}, new int[]{3}, new int[]{jui.r7});
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(eri.ze, 2);
        sparseIntArray.put(eri.Ea, 4);
        sparseIntArray.put(eri.H2, 5);
        sparseIntArray.put(eri.uo, 6);
    }

    public bba(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (DataTitleView) objArr[5], (LineChartRecyclerView) objArr[4], (View) objArr[2], (wae) objArr[3], (CardUnderstandView) objArr[6]);
        this.H = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.F = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.G = linearLayout;
        linearLayout.setTag(null);
        k0(this.D);
        o0(view);
        H();
    }

    public final boolean A0(wae waeVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.H |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.H != 0) {
                    return true;
                }
                return this.D.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.H = 2L;
        }
        this.D.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((wae) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.D.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.H = 0L;
        }
        ViewDataBinding.r(this.D);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public bba(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, I, J));
    }
}
