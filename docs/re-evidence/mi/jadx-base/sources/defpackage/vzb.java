package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes9.dex */
public class vzb extends uzb {
    public static final ViewDataBinding.i L;
    public static final SparseIntArray M;
    public final LinearLayout J;
    public long K;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(10);
        L = iVar;
        int i = jui.O4;
        int i2 = jui.R4;
        int i3 = jui.M4;
        int i4 = jui.P4;
        int i5 = jui.S4;
        int i6 = jui.T4;
        iVar.a(0, new String[]{"health_layout_weight_body_score", "health_layout_weight_focus_index", "health_layout_weight_body_composition", "health_layout_weight_control_suggest", "health_layout_weight_index_evaluation", "health_layout_weight_segmental", "health_layout_weight_segmental"}, new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{i, i2, i3, i4, i5, i6, i6});
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(eri.Im, 8);
        sparseIntArray.put(eri.Sk, 9);
    }

    public vzb(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 7, (ozb) objArr[3], (qzb) objArr[1], (szb) objArr[4], (wzb) objArr[2], (yzb) objArr[5], (a0c) objArr[6], (a0c) objArr[7], (TextView) objArr[9], (TextView) objArr[8]);
        this.K = -1L;
        k0(this.A);
        k0(this.B);
        k0(this.C);
        k0(this.D);
        k0(this.E);
        k0(this.F);
        k0(this.G);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.J = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(ozb ozbVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.K |= 64;
        }
        return true;
    }

    public final boolean B0(qzb qzbVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.K |= 16;
        }
        return true;
    }

    public final boolean C0(szb szbVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.K |= 32;
        }
        return true;
    }

    public final boolean D0(wzb wzbVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.K |= 8;
        }
        return true;
    }

    public final boolean E0(yzb yzbVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.K |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.K != 0) {
                    return true;
                }
                return this.B.F() || this.D.F() || this.A.F() || this.C.F() || this.E.F() || this.F.F() || this.G.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean F0(a0c a0cVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.K |= 2;
        }
        return true;
    }

    public final boolean G0(a0c a0cVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.K |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.K = 128L;
        }
        this.B.H();
        this.D.H();
        this.A.H();
        this.C.H();
        this.E.H();
        this.F.H();
        this.G.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        switch (i) {
            case 0:
                return E0((yzb) obj, i2);
            case 1:
                return F0((a0c) obj, i2);
            case 2:
                return G0((a0c) obj, i2);
            case 3:
                return D0((wzb) obj, i2);
            case 4:
                return B0((qzb) obj, i2);
            case 5:
                return C0((szb) obj, i2);
            case 6:
                return A0((ozb) obj, i2);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.B.l0(lifecycleOwner);
        this.D.l0(lifecycleOwner);
        this.A.l0(lifecycleOwner);
        this.C.l0(lifecycleOwner);
        this.E.l0(lifecycleOwner);
        this.F.l0(lifecycleOwner);
        this.G.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.K = 0L;
        }
        ViewDataBinding.r(this.B);
        ViewDataBinding.r(this.D);
        ViewDataBinding.r(this.A);
        ViewDataBinding.r(this.C);
        ViewDataBinding.r(this.E);
        ViewDataBinding.r(this.F);
        ViewDataBinding.r(this.G);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public vzb(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 10, L, M));
    }
}
