package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.trail.widget.RecordChartView;

/* JADX INFO: loaded from: classes10.dex */
public class wop extends vop {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public final ConstraintLayout G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(bsi.S0, 1);
        sparseIntArray.put(bsi.O0, 2);
        sparseIntArray.put(bsi.P0, 3);
        sparseIntArray.put(bsi.Q0, 4);
        sparseIntArray.put(bsi.R0, 5);
        sparseIntArray.put(bsi.q, 6);
    }

    public wop(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (RecordChartView) objArr[6], (TextView) objArr[2], (TextView) objArr[3], (TextView) objArr[4], (TextView) objArr[5], (ConstraintLayout) objArr[1]);
        this.H = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.G = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.H = 1L;
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
            this.H = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public wop(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, I, J));
    }
}
