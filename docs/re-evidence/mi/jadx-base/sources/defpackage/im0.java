package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.training_plan.widget.HabitHomeDetailCard;
import com.xiaomi.fitness.training_plan.widget.HabitHomeTrainFutureCard;
import com.xiaomi.fitness.training_plan.widget.HabitHomeTrainTodayCard;
import com.xiaomi.fitness.training_plan_export.widget.TrainingPlanTitleBar;
import miuix.core.widget.NestedScrollView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes10.dex */
public class im0 extends hm0 {
    public static final ViewDataBinding.i O = null;
    public static final SparseIntArray P;
    public final LinearLayout M;
    public long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(csi.J3, 1);
        sparseIntArray.put(csi.K2, 2);
        sparseIntArray.put(csi.z3, 3);
        sparseIntArray.put(csi.B, 4);
        sparseIntArray.put(csi.q4, 5);
        sparseIntArray.put(csi.t4, 6);
        sparseIntArray.put(csi.s4, 7);
        sparseIntArray.put(csi.p4, 8);
        sparseIntArray.put(csi.r4, 9);
        sparseIntArray.put(csi.m4, 10);
        sparseIntArray.put(csi.o4, 11);
        sparseIntArray.put(csi.n4, 12);
    }

    public im0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (NestedScrollView) objArr[4], (FrameLayout) objArr[2], (SpringBackLayout) objArr[3], (TrainingPlanTitleBar) objArr[1], (HabitHomeDetailCard) objArr[10], (HabitHomeTrainFutureCard) objArr[12], (HabitHomeTrainTodayCard) objArr[11], (TextView) objArr[8], (ConstraintLayout) objArr[5], (ImageView) objArr[9], (TextView) objArr[7], (TextView) objArr[6]);
        this.N = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.M = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.N != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.N = 1L;
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
            this.N = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public im0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 13, O, P));
    }
}
