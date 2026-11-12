package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.training_plan_export.widget.TrainingPlanTitleBar;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;

/* JADX INFO: loaded from: classes10.dex */
public class wg0 extends vg0 {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final ConstraintLayout H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(csi.J3, 1);
        sparseIntArray.put(csi.b1, 2);
        sparseIntArray.put(csi.G4, 3);
        sparseIntArray.put(csi.F4, 4);
        sparseIntArray.put(csi.J4, 5);
        sparseIntArray.put(csi.H4, 6);
        sparseIntArray.put(csi.I4, 7);
    }

    public wg0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LinearLayoutCompat) objArr[2], (TrainingPlanTitleBar) objArr[1], (RightArrowBindingSingleLineTextView) objArr[4], (RightArrowBindingSingleLineTextView) objArr[3], (SwitchButtonBindingTwoLineTextView) objArr[6], (RightArrowBindingSingleLineTextView) objArr[7], (SwitchButtonBindingTwoLineTextView) objArr[5]);
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

    public wg0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 8, J, K));
    }
}
