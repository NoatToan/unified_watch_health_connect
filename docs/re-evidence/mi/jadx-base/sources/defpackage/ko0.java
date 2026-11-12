package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes9.dex */
public class ko0 extends io0 {
    public static final ViewDataBinding.i M;
    public static final SparseIntArray N;
    public final ConstraintLayout K;
    public long L;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(11);
        M = iVar;
        iVar.a(1, new String[]{"layout_edit_sleep_record"}, new int[]{3}, new int[]{jui.Z6});
        iVar.a(2, new String[]{"layout_edit_sleep_record"}, new int[]{4}, new int[]{jui.Z6});
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(eri.l4, 5);
        sparseIntArray.put(eri.m4, 6);
        sparseIntArray.put(eri.o4, 7);
        sparseIntArray.put(eri.k0, 8);
        sparseIntArray.put(eri.P4, 9);
        sparseIntArray.put(eri.i1, 10);
    }

    public ko0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 2, (ConstraintLayout) objArr[8], (TextView) objArr[10], (ConstraintLayout) objArr[5], (TextView) objArr[6], (TextView) objArr[7], (TextView) objArr[9], (m8e) objArr[3], (CardView) objArr[1], (m8e) objArr[4], (CardView) objArr[2]);
        this.L = -1L;
        k0(this.G);
        this.H.setTag(null);
        k0(this.I);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.K = constraintLayout;
        constraintLayout.setTag(null);
        this.J.setTag(null);
        o0(view);
        H();
    }

    private boolean A0(m8e m8eVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.L |= 1;
        }
        return true;
    }

    private boolean B0(m8e m8eVar, int i) {
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
                return this.G.F() || this.I.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.L = 4L;
        }
        this.G.H();
        this.I.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return A0((m8e) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return B0((m8e) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.G.l0(lifecycleOwner);
        this.I.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.L = 0L;
        }
        ViewDataBinding.r(this.G);
        ViewDataBinding.r(this.I);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public ko0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
