package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.widget.LevelBarView;

/* JADX INFO: loaded from: classes8.dex */
public class y8e extends x8e {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final ConstraintLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(zqi.i2, 1);
        sparseIntArray.put(zqi.W9, 2);
        sparseIntArray.put(zqi.b1, 3);
        sparseIntArray.put(zqi.w4, 4);
        sparseIntArray.put(zqi.O5, 5);
        sparseIntArray.put(zqi.x4, 6);
        sparseIntArray.put(zqi.u5, 7);
        sparseIntArray.put(zqi.d8, 8);
    }

    public y8e(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[3], (View) objArr[1], (LevelBarView) objArr[4], (TextView) objArr[6], (TextView) objArr[7], (TextView) objArr[5], (TextView) objArr[8], (TextView) objArr[2]);
        this.J = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.J != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.J = 1L;
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
            this.J = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public y8e(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
