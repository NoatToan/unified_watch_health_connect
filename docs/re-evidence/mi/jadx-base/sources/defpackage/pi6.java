package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public class pi6 extends oi6 {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final ConstraintLayout H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(zqi.P9, 1);
        sparseIntArray.put(zqi.O9, 2);
        sparseIntArray.put(zqi.T, 3);
        sparseIntArray.put(zqi.F4, 4);
        sparseIntArray.put(zqi.i2, 5);
        sparseIntArray.put(zqi.ia, 6);
        sparseIntArray.put(zqi.Ba, 7);
    }

    public pi6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ConstraintLayout) objArr[3], (View) objArr[5], (LinearLayout) objArr[4], (LinearLayout) objArr[2], (RecyclerView) objArr[1], (TextView) objArr[6], (TextView) objArr[7]);
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

    public pi6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 8, J, K));
    }
}
