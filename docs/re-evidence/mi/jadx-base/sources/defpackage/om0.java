package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.training_plan.widget.HabitSuggestCard;
import com.xiaomi.fitness.training_plan_export.widget.TrainingPlanTitleBar;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes10.dex */
public class om0 extends nm0 {
    public static final ViewDataBinding.i P = null;
    public static final SparseIntArray Q;
    public final ConstraintLayout N;
    public long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(csi.J3, 1);
        sparseIntArray.put(csi.r0, 2);
        sparseIntArray.put(csi.X4, 3);
        sparseIntArray.put(csi.Y4, 4);
        sparseIntArray.put(csi.Z4, 5);
        sparseIntArray.put(csi.a5, 6);
        sparseIntArray.put(csi.c0, 7);
        sparseIntArray.put(csi.e3, 8);
        sparseIntArray.put(csi.b3, 9);
        sparseIntArray.put(csi.n0, 10);
        sparseIntArray.put(csi.d0, 11);
        sparseIntArray.put(csi.z, 12);
        sparseIntArray.put(csi.c1, 13);
    }

    public om0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[12], (View) objArr[7], (View) objArr[11], (Guideline) objArr[10], (ConstraintLayout) objArr[2], (TextView) objArr[13], (HabitSuggestCard) objArr[9], (HabitSuggestCard) objArr[8], (TrainingPlanTitleBar) objArr[1], (RoundImageView) objArr[3], (LinearLayout) objArr[4], (TextView) objArr[5], (TextView) objArr[6]);
        this.O = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.N = constraintLayout;
        constraintLayout.setTag(null);
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

    public om0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 14, P, Q));
    }
}
