package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes9.dex */
public class v6c extends u6c {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public final NestedScrollView E;
    public final ConstraintLayout F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(fri.x, 2);
        sparseIntArray.put(fri.v, 3);
        sparseIntArray.put(fri.u, 4);
        sparseIntArray.put(fri.t, 5);
    }

    public v6c(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (View) objArr[5], (View) objArr[4], (View) objArr[3], (View) objArr[2]);
        this.G = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.E = nestedScrollView;
        nestedScrollView.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.F = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.G = 1L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.G = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public v6c(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 6, H, I));
    }
}
