package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.training_plan.widget.AbilityMedalProgressLayout;
import com.xiaomi.fitness.training_plan.widget.AbilityMedalProgressLayoutTablet;
import com.xiaomi.fitness.training_plan.widget.AbilitySummaryLayout;
import com.xiaomi.fitness.training_plan_export.widget.TrainingPlanTitleBar;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes10.dex */
public class qg0 extends pg0 {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(csi.J3, 1);
        sparseIntArray.put(csi.K2, 2);
        sparseIntArray.put(csi.z3, 3);
        sparseIntArray.put(csi.B, 4);
        sparseIntArray.put(csi.f14676a, 5);
        sparseIntArray.put(csi.d2, 6);
        sparseIntArray.put(csi.y1, 7);
        sparseIntArray.put(csi.z1, 8);
    }

    public qg0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (AbilitySummaryLayout) objArr[5], (NestedScrollView) objArr[4], (LinearLayout) objArr[0], (AbilityMedalProgressLayout) objArr[7], (AbilityMedalProgressLayoutTablet) objArr[8], (LinearLayout) objArr[6], (FrameLayout) objArr[2], (SpringBackLayout) objArr[3], (TrainingPlanTitleBar) objArr[1]);
        this.J = -1L;
        this.C.setTag(null);
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

    public qg0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
