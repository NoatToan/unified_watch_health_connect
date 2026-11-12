package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.mi.health.course.widget.NoNestScrollRecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public class wp4 extends vp4 {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final ConstraintLayout I;
    public final FrameLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(oqi.o1, 2);
        sparseIntArray.put(oqi.s1, 3);
        sparseIntArray.put(oqi.c1, 4);
        sparseIntArray.put(oqi.f1, 5);
        sparseIntArray.put(oqi.t1, 6);
        sparseIntArray.put(oqi.h0, 7);
        sparseIntArray.put(oqi.d1, 8);
        sparseIntArray.put(oqi.x, 9);
    }

    public wp4(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[9], (View) objArr[7], (MoreRecyclerView) objArr[4], (TextView) objArr[8], (ConstraintLayout) objArr[5], (View) objArr[2], (NoNestScrollRecyclerView) objArr[3], (NoNestScrollRecyclerView) objArr[6]);
        this.K = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[1];
        this.J = frameLayout;
        frameLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.K = 1L;
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
            this.K = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public wp4(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 10, L, M));
    }
}
