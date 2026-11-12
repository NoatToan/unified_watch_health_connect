package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.training_plan_export.widget.TrainingPlanTitleBar;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;

/* JADX INFO: loaded from: classes10.dex */
public class mm0 extends lm0 {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(csi.J3, 1);
        sparseIntArray.put(csi.J4, 2);
        sparseIntArray.put(csi.H4, 3);
        sparseIntArray.put(csi.I4, 4);
    }

    public mm0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LinearLayout) objArr[0], (TrainingPlanTitleBar) objArr[1], (SwitchButtonBindingTwoLineTextView) objArr[3], (RightArrowBindingSingleLineTextView) objArr[4], (SwitchButtonBindingTwoLineTextView) objArr[2]);
        this.F = -1L;
        this.A.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.F = 1L;
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
            this.F = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public mm0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 5, G, H));
    }
}
