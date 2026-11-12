package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public class xzb extends wzb {
    public static final ViewDataBinding.i E;
    public static final SparseIntArray F;
    public long D;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(3);
        E = iVar;
        iVar.a(0, new String[]{"health_layout_common_card_icon_title"}, new int[]{1}, new int[]{jui.h4});
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(eri.pd, 2);
    }

    public xzb(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (LinearLayout) objArr[0], (qxb) objArr[1], (RecyclerView) objArr[2]);
        this.D = -1L;
        this.A.setTag(null);
        k0(this.B);
        o0(view);
        H();
    }

    private boolean A0(qxb qxbVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.D |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.D != 0) {
                    return true;
                }
                return this.B.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.D = 2L;
        }
        this.B.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((qxb) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.B.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.D = 0L;
        }
        ViewDataBinding.r(this.B);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public xzb(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 3, E, F));
    }
}
