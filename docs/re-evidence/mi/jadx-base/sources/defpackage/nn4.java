package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.mi.health.course.widget.NoNestScrollRecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public class nn4 extends mn4 {
    public static final ViewDataBinding.i P = null;
    public static final SparseIntArray Q;
    public final ConstraintLayout M;
    public final ConstraintLayout N;
    public long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(oqi.o1, 2);
        sparseIntArray.put(oqi.X0, 3);
        sparseIntArray.put(oqi.s1, 4);
        sparseIntArray.put(oqi.R1, 5);
        sparseIntArray.put(oqi.I1, 6);
        sparseIntArray.put(oqi.d0, 7);
        sparseIntArray.put(oqi.c1, 8);
        sparseIntArray.put(oqi.f1, 9);
        sparseIntArray.put(oqi.t1, 10);
        sparseIntArray.put(oqi.h0, 11);
        sparseIntArray.put(oqi.d1, 12);
        sparseIntArray.put(oqi.x, 13);
    }

    public nn4(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[13], (Group) objArr[7], (View) objArr[11], (RecyclerView) objArr[3], (MoreRecyclerView) objArr[8], (TextView) objArr[12], (ConstraintLayout) objArr[9], (View) objArr[2], (NoNestScrollRecyclerView) objArr[4], (NoNestScrollRecyclerView) objArr[10], (TextView) objArr[6], (TextView) objArr[5]);
        this.O = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.M = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[1];
        this.N = constraintLayout2;
        constraintLayout2.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.O != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.O = 1L;
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
            this.O = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public nn4(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 14, P, Q));
    }
}
