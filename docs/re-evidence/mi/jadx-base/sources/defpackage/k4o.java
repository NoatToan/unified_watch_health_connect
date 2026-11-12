package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.widget.view.HomeHeaderTabTitleView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes10.dex */
public class k4o extends j4o {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final ConstraintLayout H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(xri.g2, 1);
        sparseIntArray.put(xri.Y6, 2);
        sparseIntArray.put(xri.Q5, 3);
        sparseIntArray.put(xri.I7, 4);
        sparseIntArray.put(xri.d3, 5);
        sparseIntArray.put(xri.c3, 6);
        sparseIntArray.put(xri.m6, 7);
    }

    public k4o(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (HomeHeaderTabTitleView) objArr[1], (RecyclerView) objArr[6], (ConstraintLayout) objArr[5], (NestedScrollView) objArr[3], (RecyclerView) objArr[7], (SpringBackLayout) objArr[2], (ConstraintLayout) objArr[4]);
        this.I = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.H = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.I != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.I = 1L;
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
            this.I = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public k4o(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 8, J, K));
    }
}
