package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.electronic.scale.widget.BodyConditionView;

/* JADX INFO: loaded from: classes8.dex */
public class k68 extends j68 {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final ConstraintLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(bri.I5, 1);
        sparseIntArray.put(bri.s5, 2);
        sparseIntArray.put(bri.t5, 3);
        sparseIntArray.put(bri.F6, 4);
        sparseIntArray.put(bri.m4, 5);
        sparseIntArray.put(bri.y0, 6);
        sparseIntArray.put(bri.P6, 7);
        sparseIntArray.put(bri.n6, 8);
        sparseIntArray.put(bri.B6, 9);
        sparseIntArray.put(bri.C6, 10);
    }

    public k68(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (Guideline) objArr[6], (TextView) objArr[5], (TextView) objArr[2], (TextView) objArr[3], (TextView) objArr[1], (BodyConditionView) objArr[8], (BodyConditionView) objArr[9], (BodyConditionView) objArr[10], (View) objArr[4], (BodyConditionView) objArr[7]);
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

    public k68(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
