package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes9.dex */
public class lyb extends kyb {
    public static final ViewDataBinding.i K;
    public static final SparseIntArray L;
    public final LinearLayout I;
    public long J;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(9);
        K = iVar;
        iVar.a(0, new String[]{"layout_common_icon_title"}, new int[]{2}, new int[]{jui.v6});
        iVar.a(1, new String[]{"health_layout_sleep_insight_schedule_report", "health_layout_sleep_insight_continuity_report", "health_layout_sleep_insight_day_nap_report", "health_layout_sleep_insight_stress_report", "health_layout_sleep_insight_strength_report"}, new int[]{3, 4, 5, 6, 7}, new int[]{jui.E4, jui.C4, jui.D4, jui.G4, jui.F4});
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(eri.d4, 8);
    }

    public lyb(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 6, (View) objArr[8], (uyb) objArr[4], (wyb) objArr[5], (yyb) objArr[3], (azb) objArr[7], (czb) objArr[6], (a7e) objArr[2], (LinearLayout) objArr[1]);
        this.J = -1L;
        k0(this.B);
        k0(this.C);
        k0(this.D);
        k0(this.E);
        k0(this.F);
        k0(this.G);
        this.H.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.I = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(uyb uybVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.J |= 8;
        }
        return true;
    }

    public final boolean B0(wyb wybVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.J |= 32;
        }
        return true;
    }

    public final boolean C0(yyb yybVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.J |= 1;
        }
        return true;
    }

    public final boolean D0(azb azbVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.J |= 4;
        }
        return true;
    }

    public final boolean E0(czb czbVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.J |= 16;
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
                return this.G.F() || this.D.F() || this.B.F() || this.C.F() || this.F.F() || this.E.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean F0(a7e a7eVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.J |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.J = 64L;
        }
        this.G.H();
        this.D.H();
        this.B.H();
        this.C.H();
        this.F.H();
        this.E.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return C0((yyb) obj, i2);
        }
        if (i == 1) {
            return F0((a7e) obj, i2);
        }
        if (i == 2) {
            return D0((azb) obj, i2);
        }
        if (i == 3) {
            return A0((uyb) obj, i2);
        }
        if (i == 4) {
            return E0((czb) obj, i2);
        }
        if (i != 5) {
            return false;
        }
        return B0((wyb) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.G.l0(lifecycleOwner);
        this.D.l0(lifecycleOwner);
        this.B.l0(lifecycleOwner);
        this.C.l0(lifecycleOwner);
        this.F.l0(lifecycleOwner);
        this.E.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.J = 0L;
        }
        ViewDataBinding.r(this.G);
        ViewDataBinding.r(this.D);
        ViewDataBinding.r(this.B);
        ViewDataBinding.r(this.C);
        ViewDataBinding.r(this.F);
        ViewDataBinding.r(this.E);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public lyb(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
