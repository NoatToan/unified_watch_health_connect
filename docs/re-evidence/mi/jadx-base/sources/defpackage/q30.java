package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes7.dex */
public class q30 extends p30 {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final ConstraintLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(vqi.f37135b, 1);
        sparseIntArray.put(vqi.d0, 2);
        sparseIntArray.put(vqi.T, 3);
        sparseIntArray.put(vqi.W, 4);
        sparseIntArray.put(vqi.E, 5);
        sparseIntArray.put(vqi.R, 6);
        sparseIntArray.put(vqi.o, 7);
        sparseIntArray.put(vqi.S, 8);
        sparseIntArray.put(vqi.U, 9);
        sparseIntArray.put(vqi.V, 10);
    }

    public q30(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LinearLayout) objArr[1], (LinearLayout) objArr[7], (View) objArr[5], (RecyclerView) objArr[6], (ImageView) objArr[8], (ImageView) objArr[3], (TextView) objArr[9], (TextView) objArr[10], (TextView) objArr[4], (NestedScrollView) objArr[2]);
        this.L = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.K = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.L != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.L = 1L;
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
            this.L = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public q30(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
