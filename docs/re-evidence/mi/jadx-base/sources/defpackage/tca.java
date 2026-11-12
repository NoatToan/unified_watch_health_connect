package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.health.sleep.ui.SleepHealthBannerCardSetLayout;
import com.xiaomi.fitness.view.CardUnderstandView;

/* JADX INFO: loaded from: classes9.dex */
public class tca extends sca {
    public static final ViewDataBinding.i M;
    public static final SparseIntArray N;
    public long L;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(11);
        M = iVar;
        iVar.a(1, new String[]{"layout_sleep_empty"}, new int[]{3}, new int[]{jui.x7});
        iVar.a(2, new String[]{"layout_sleep_wm_score", "layout_sleep_wm_regularity", "layout_sleep_wm_duration", "health_layout_sleep_wm_regular", "layout_sleep_wm_efficiency"}, new int[]{4, 5, 6, 7, 8}, new int[]{jui.P7, jui.O7, jui.M7, jui.L4, jui.N7});
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(eri.b6, 9);
        sparseIntArray.put(eri.uo, 10);
    }

    public tca(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 6, (pbe) objArr[3], (pce) objArr[5], (nce) objArr[8], (mzb) objArr[7], (rce) objArr[4], (lce) objArr[6], (LinearLayout) objArr[1], (SleepHealthBannerCardSetLayout) objArr[9], (LinearLayout) objArr[2], (NestedScrollView) objArr[0], (CardUnderstandView) objArr[10]);
        this.L = -1L;
        k0(this.A);
        k0(this.B);
        k0(this.C);
        k0(this.D);
        k0(this.E);
        k0(this.F);
        this.G.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(pbe pbeVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.L |= 32;
        }
        return true;
    }

    public final boolean B0(pce pceVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.L |= 16;
        }
        return true;
    }

    public final boolean C0(nce nceVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.L |= 4;
        }
        return true;
    }

    public final boolean D0(mzb mzbVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.L |= 8;
        }
        return true;
    }

    public final boolean E0(rce rceVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.L |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.L != 0) {
                    return true;
                }
                return this.A.F() || this.E.F() || this.B.F() || this.F.F() || this.D.F() || this.C.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean F0(lce lceVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.L |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.L = 64L;
        }
        this.A.H();
        this.E.H();
        this.B.H();
        this.F.H();
        this.D.H();
        this.C.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return E0((rce) obj, i2);
        }
        if (i == 1) {
            return F0((lce) obj, i2);
        }
        if (i == 2) {
            return C0((nce) obj, i2);
        }
        if (i == 3) {
            return D0((mzb) obj, i2);
        }
        if (i == 4) {
            return B0((pce) obj, i2);
        }
        if (i != 5) {
            return false;
        }
        return A0((pbe) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.A.l0(lifecycleOwner);
        this.E.l0(lifecycleOwner);
        this.B.l0(lifecycleOwner);
        this.F.l0(lifecycleOwner);
        this.D.l0(lifecycleOwner);
        this.C.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.L = 0L;
        }
        ViewDataBinding.r(this.A);
        ViewDataBinding.r(this.E);
        ViewDataBinding.r(this.B);
        ViewDataBinding.r(this.F);
        ViewDataBinding.r(this.D);
        ViewDataBinding.r(this.C);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public tca(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
