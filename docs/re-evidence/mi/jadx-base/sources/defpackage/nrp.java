package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class nrp extends mrp {
    public static final ViewDataBinding.i H;
    public static final SparseIntArray I;
    public final ConstraintLayout E;
    public final LinearLayout F;
    public long G;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(6);
        H = iVar;
        iVar.a(1, new String[]{"trail_total_diving_statistics_card"}, new int[]{2}, new int[]{ivi.J2});
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(bsi.C3, 3);
        sparseIntArray.put(bsi.E1, 4);
        sparseIntArray.put(bsi.G1, 5);
    }

    public nrp(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (TextView) objArr[4], (RecyclerView) objArr[5], (orp) objArr[2], (NestedScrollView) objArr[3]);
        this.G = -1L;
        k0(this.C);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.E = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.F = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(orp orpVar, int i) {
        if (i != qv1.f31871a) {
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
                return this.C.F();
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
        this.C.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((orp) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.C.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.G = 0L;
        }
        ViewDataBinding.r(this.C);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public nrp(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 6, H, I));
    }
}
