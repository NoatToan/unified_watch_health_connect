package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.view.CardUnderstandView;

/* JADX INFO: loaded from: classes9.dex */
public class eo0 extends do0 {
    public static final ViewDataBinding.i M;
    public static final SparseIntArray N;
    public final FrameLayout I;
    public final LinearLayout J;
    public final LinearLayout K;
    public long L;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(11);
        M = iVar;
        iVar.a(0, new String[]{"health_layout_sleep_animal_floating"}, new int[]{8}, new int[]{jui.v4});
        iVar.a(1, new String[]{"health_common_custom_title_layout"}, new int[]{3}, new int[]{jui.R2});
        iVar.a(2, new String[]{"health_layout_sleep_animal_collect_progress", "health_layout_sleep_animal_image", "health_layout_sleep_animal_report_list", "health_layout_sleep_animal_schedule_suggest"}, new int[]{4, 5, 6, 7}, new int[]{jui.u4, jui.w4, jui.x4, jui.y4});
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(eri.ic, 9);
        sparseIntArray.put(eri.uo, 10);
    }

    public eo0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 6, (iyb) objArr[5], (kyb) objArr[6], (myb) objArr[7], (eyb) objArr[4], (gyb) objArr[8], (mpb) objArr[3], (NestedScrollView) objArr[9], (CardUnderstandView) objArr[10]);
        this.L = -1L;
        k0(this.A);
        k0(this.B);
        k0(this.C);
        k0(this.D);
        k0(this.E);
        k0(this.F);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.I = frameLayout;
        frameLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.J = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[2];
        this.K = linearLayout2;
        linearLayout2.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(iyb iybVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.L |= 4;
        }
        return true;
    }

    public final boolean B0(kyb kybVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.L |= 16;
        }
        return true;
    }

    public final boolean C0(myb mybVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.L |= 32;
        }
        return true;
    }

    public final boolean D0(eyb eybVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.L |= 1;
        }
        return true;
    }

    public final boolean E0(gyb gybVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.L |= 2;
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
                return this.F.F() || this.D.F() || this.A.F() || this.B.F() || this.C.F() || this.E.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean F0(mpb mpbVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.L |= 8;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.L = 64L;
        }
        this.F.H();
        this.D.H();
        this.A.H();
        this.B.H();
        this.C.H();
        this.E.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return D0((eyb) obj, i2);
        }
        if (i == 1) {
            return E0((gyb) obj, i2);
        }
        if (i == 2) {
            return A0((iyb) obj, i2);
        }
        if (i == 3) {
            return F0((mpb) obj, i2);
        }
        if (i == 4) {
            return B0((kyb) obj, i2);
        }
        if (i != 5) {
            return false;
        }
        return C0((myb) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.F.l0(lifecycleOwner);
        this.D.l0(lifecycleOwner);
        this.A.l0(lifecycleOwner);
        this.B.l0(lifecycleOwner);
        this.C.l0(lifecycleOwner);
        this.E.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.L = 0L;
        }
        ViewDataBinding.r(this.F);
        ViewDataBinding.r(this.D);
        ViewDataBinding.r(this.A);
        ViewDataBinding.r(this.B);
        ViewDataBinding.r(this.C);
        ViewDataBinding.r(this.E);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public eo0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
