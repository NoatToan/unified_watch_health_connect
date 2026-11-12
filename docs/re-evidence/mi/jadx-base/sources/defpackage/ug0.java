package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.training_plan_export.widget.TrainingPlanTitleBar;
import com.xiaomi.fitness.training_plan_export.widget.TrainingStartBtn;

/* JADX INFO: loaded from: classes10.dex */
public class ug0 extends tg0 {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(csi.J3, 1);
        sparseIntArray.put(csi.B, 2);
        sparseIntArray.put(csi.D4, 3);
        sparseIntArray.put(csi.F, 4);
        sparseIntArray.put(csi.E, 5);
        sparseIntArray.put(csi.H, 6);
        sparseIntArray.put(csi.U1, 7);
        sparseIntArray.put(csi.C, 8);
    }

    public ug0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (FrameLayout) objArr[2], (TextView) objArr[8], (TextView) objArr[5], (TextView) objArr[4], (LinearLayout) objArr[6], (RelativeLayout) objArr[0], (ImageView) objArr[7], (TrainingPlanTitleBar) objArr[1], (TrainingStartBtn) objArr[3]);
        this.J = -1L;
        this.F.setTag(null);
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

    public ug0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
