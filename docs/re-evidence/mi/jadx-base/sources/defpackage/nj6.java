package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import com.xiaomi.fitness.widget.view.DividerView;
import miuix.core.widget.NestedScrollView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes8.dex */
public class nj6 extends mj6 {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final SpringBackLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(zqi.M7, 1);
        sparseIntArray.put(zqi.f9, 2);
        sparseIntArray.put(zqi.r9, 3);
        sparseIntArray.put(zqi.j2, 4);
        sparseIntArray.put(zqi.W7, 5);
        sparseIntArray.put(zqi.F0, 6);
        sparseIntArray.put(zqi.H0, 7);
        sparseIntArray.put(zqi.H9, 8);
        sparseIntArray.put(zqi.t, 9);
        sparseIntArray.put(zqi.w3, 10);
    }

    public nj6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (SwitchButtonTwoLineTextView) objArr[9], (RecyclerView) objArr[7], (RightArrowTwoLineTextView) objArr[6], (DividerView) objArr[4], (TextView) objArr[10], (NestedScrollView) objArr[1], (ConstraintLayout) objArr[5], (TextView) objArr[3], (SwitchButtonTwoLineTextView) objArr[2], (RightArrowSingleLineTextView) objArr[8]);
        this.L = -1L;
        SpringBackLayout springBackLayout = (SpringBackLayout) objArr[0];
        this.K = springBackLayout;
        springBackLayout.setTag(null);
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

    public nj6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
