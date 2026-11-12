package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.heartrate.ui.view.IndicatorView;
import com.xiaomi.fitness.widget.view.DurationTextView;

/* JADX INFO: loaded from: classes9.dex */
public class b7c extends a7c {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final ConstraintLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(fri.f, 1);
        sparseIntArray.put(fri.f18132k, 2);
        sparseIntArray.put(fri.j, 3);
        sparseIntArray.put(fri.h, 4);
        sparseIntArray.put(fri.d, 5);
        sparseIntArray.put(fri.c, 6);
        sparseIntArray.put(fri.f18130a, 7);
        sparseIntArray.put(fri.n, 8);
        sparseIntArray.put(fri.m, 9);
        sparseIntArray.put(fri.l, 10);
    }

    public b7c(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ConstraintLayout) objArr[7], (DurationTextView) objArr[6], (IndicatorView) objArr[5], (NestedScrollView) objArr[1], (TextView) objArr[4], (TextView) objArr[3], (TextView) objArr[2], (TextView) objArr[10], (TextView) objArr[9], (TextView) objArr[8]);
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

    public b7c(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
