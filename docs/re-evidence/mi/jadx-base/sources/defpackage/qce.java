package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public class qce extends pce {
    public static final ViewDataBinding.i K;
    public static final SparseIntArray L;
    public final ScrollView F;
    public final LinearLayout G;
    public final FrameLayout H;
    public final FrameLayout I;
    public long J;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(9);
        K = iVar;
        iVar.a(1, new String[]{"layout_common_icon_title"}, new int[]{4}, new int[]{jui.v6});
        iVar.a(2, new String[]{"layout_sleep_regularity_header"}, new int[]{5}, new int[]{jui.H7});
        iVar.a(3, new String[]{"layout_sleep_regularity_header"}, new int[]{6}, new int[]{jui.H7});
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(eri.vd, 7);
        sparseIntArray.put(eri.Pd, 8);
    }

    public qce(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 3, (a7e) objArr[4], (dce) objArr[5], (dce) objArr[6], (LineChartRecyclerView) objArr[7], (LineChartRecyclerView) objArr[8]);
        this.J = -1L;
        k0(this.A);
        k0(this.B);
        k0(this.C);
        ScrollView scrollView = (ScrollView) objArr[0];
        this.F = scrollView;
        scrollView.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.G = linearLayout;
        linearLayout.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[2];
        this.H = frameLayout;
        frameLayout.setTag(null);
        FrameLayout frameLayout2 = (FrameLayout) objArr[3];
        this.I = frameLayout2;
        frameLayout2.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(a7e a7eVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.J |= 4;
        }
        return true;
    }

    public final boolean B0(dce dceVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.J |= 1;
        }
        return true;
    }

    public final boolean C0(dce dceVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.J |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.J != 0) {
                    return true;
                }
                return this.A.F() || this.B.F() || this.C.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.J = 8L;
        }
        this.A.H();
        this.B.H();
        this.C.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return B0((dce) obj, i2);
        }
        if (i == 1) {
            return C0((dce) obj, i2);
        }
        if (i != 2) {
            return false;
        }
        return A0((a7e) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.A.l0(lifecycleOwner);
        this.B.l0(lifecycleOwner);
        this.C.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.J = 0L;
        }
        ViewDataBinding.r(this.A);
        ViewDataBinding.r(this.B);
        ViewDataBinding.r(this.C);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public qce(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
