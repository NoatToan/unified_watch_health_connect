package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public class c2g extends b2g {
    public static final ViewDataBinding.i M;
    public static final SparseIntArray N;
    public final ConstraintLayout K;
    public long L;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(11);
        M = iVar;
        iVar.a(0, new String[]{"mine_medal_unlogged_in_entrance"}, new int[]{1}, new int[]{rui.t});
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(lri.l0, 2);
        sparseIntArray.put(lri.L, 3);
        sparseIntArray.put(lri.K, 4);
        sparseIntArray.put(lri.f0, 5);
        sparseIntArray.put(lri.d0, 6);
        sparseIntArray.put(lri.e0, 7);
        sparseIntArray.put(lri.t0, 8);
        sparseIntArray.put(lri.u0, 9);
        sparseIntArray.put(lri.c0, 10);
    }

    public c2g(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (ImageView) objArr[4], (TextView) objArr[3], (TextView) objArr[10], (ImageView) objArr[6], (ImageView) objArr[7], (RecyclerView) objArr[5], (TextView) objArr[2], (i2g) objArr[1], (ConstraintLayout) objArr[8], (ImageView) objArr[9]);
        this.L = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.K = constraintLayout;
        constraintLayout.setTag(null);
        k0(this.H);
        o0(view);
        H();
    }

    public final boolean C0(i2g i2gVar, int i) {
        if (i != gv1.f19359a) {
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
                return this.H.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.L = 2L;
        }
        this.H.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return C0((i2g) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.H.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.L = 0L;
        }
        ViewDataBinding.r(this.H);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public c2g(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
