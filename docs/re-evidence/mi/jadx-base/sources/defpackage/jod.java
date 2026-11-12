package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.detail.view.SportsBehaviorCircleView;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes10.dex */
public class jod extends iod {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final ConstraintLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(bsi.G7, 1);
        sparseIntArray.put(bsi.E3, 2);
        sparseIntArray.put(bsi.q4, 3);
        sparseIntArray.put(bsi.C5, 4);
        sparseIntArray.put(bsi.A1, 5);
        sparseIntArray.put(bsi.b1, 6);
        sparseIntArray.put(bsi.c1, 7);
        sparseIntArray.put(bsi.d1, 8);
        sparseIntArray.put(bsi.n5, 9);
    }

    public jod(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ConstraintLayout) objArr[6], (TextView) objArr[7], (TextView) objArr[8], (DividerView) objArr[5], (SportsBehaviorCircleView) objArr[2], (SportsBehaviorCircleView) objArr[3], (RecyclerView) objArr[9], (SportsBehaviorCircleView) objArr[4], (DataTitleSimpleView) objArr[1]);
        this.K = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.J = constraintLayout;
        constraintLayout.setTag(null);
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

    public jod(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 10, L, M));
    }
}
