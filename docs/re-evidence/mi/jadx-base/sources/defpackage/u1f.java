package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* JADX INFO: loaded from: classes9.dex */
public class u1f extends t1f {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(eri.c2, 1);
        sparseIntArray.put(eri.G, 2);
        sparseIntArray.put(eri.Q1, 3);
        sparseIntArray.put(eri.h5, 4);
        sparseIntArray.put(eri.Le, 5);
    }

    public u1f(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (AppBarLayout) objArr[2], (CollapsingToolbarLayout) objArr[3], (CoordinatorLayout) objArr[1], (FrameLayout) objArr[4], (NestedScrollView) objArr[5], (SwipeRefreshLayout) objArr[0]);
        this.G = -1L;
        this.F.setTag(null);
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

    public u1f(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 6, H, I));
    }
}
