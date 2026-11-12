package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public class pzb extends ozb {
    public static final ViewDataBinding.i K;
    public static final SparseIntArray L;
    public long J;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(9);
        K = iVar;
        iVar.a(0, new String[]{"health_layout_common_card_icon_title"}, new int[]{2}, new int[]{jui.h4});
        int i = jui.f4;
        iVar.a(1, new String[]{"health_layout_card_data_item", "health_layout_card_data_item", "health_layout_card_data_item", "health_layout_card_data_item"}, new int[]{3, 4, 5, 6}, new int[]{i, i, i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(eri.E8, 7);
        sparseIntArray.put(eri.sp, 8);
    }

    public pzb(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 5, (AppCompatImageView) objArr[7], (qxb) objArr[2], (LinearLayout) objArr[0], (ConstraintLayout) objArr[1], (RecyclerView) objArr[8], (mxb) objArr[3], (mxb) objArr[5], (mxb) objArr[4], (mxb) objArr[6]);
        this.J = -1L;
        k0(this.B);
        this.C.setTag(null);
        this.D.setTag(null);
        k0(this.F);
        k0(this.G);
        k0(this.H);
        k0(this.I);
        o0(view);
        H();
    }

    public final boolean A0(qxb qxbVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.J |= 2;
        }
        return true;
    }

    public final boolean B0(mxb mxbVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.J |= 8;
        }
        return true;
    }

    public final boolean C0(mxb mxbVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.J |= 4;
        }
        return true;
    }

    public final boolean D0(mxb mxbVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.J |= 16;
        }
        return true;
    }

    public final boolean E0(mxb mxbVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.J |= 1;
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
                return this.B.F() || this.F.F() || this.H.F() || this.G.F() || this.I.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.J = 32L;
        }
        this.B.H();
        this.F.H();
        this.H.H();
        this.G.H();
        this.I.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return E0((mxb) obj, i2);
        }
        if (i == 1) {
            return A0((qxb) obj, i2);
        }
        if (i == 2) {
            return C0((mxb) obj, i2);
        }
        if (i == 3) {
            return B0((mxb) obj, i2);
        }
        if (i != 4) {
            return false;
        }
        return D0((mxb) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.B.l0(lifecycleOwner);
        this.F.l0(lifecycleOwner);
        this.H.l0(lifecycleOwner);
        this.G.l0(lifecycleOwner);
        this.I.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.J = 0L;
        }
        ViewDataBinding.r(this.B);
        ViewDataBinding.r(this.F);
        ViewDataBinding.r(this.H);
        ViewDataBinding.r(this.G);
        ViewDataBinding.r(this.I);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public pzb(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
