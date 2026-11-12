package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.training_plan.report.TrainPlanReportBasicInfoView;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;

/* JADX INFO: loaded from: classes10.dex */
public class fvp extends evp {
    public static final ViewDataBinding.i Q = null;
    public static final SparseIntArray R;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(csi.R2, 1);
        sparseIntArray.put(csi.L2, 2);
        sparseIntArray.put(csi.j, 3);
        sparseIntArray.put(csi.y2, 4);
        sparseIntArray.put(csi.v2, 5);
        sparseIntArray.put(csi.x4, 6);
        sparseIntArray.put(csi.l, 7);
        sparseIntArray.put(csi.w2, 8);
        sparseIntArray.put(csi.A2, 9);
        sparseIntArray.put(csi.z2, 10);
        sparseIntArray.put(csi.Z0, 11);
        sparseIntArray.put(csi.p2, 12);
        sparseIntArray.put(csi.i, 13);
        sparseIntArray.put(csi.S2, 14);
    }

    public fvp(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[13], (View) objArr[3], (TrainPlanReportBasicInfoView) objArr[7], (ImageView) objArr[11], (ImageView) objArr[12], (TextView) objArr[5], (LinearLayout) objArr[8], (TextView) objArr[4], (RecyclerView) objArr[10], (DataTitleSimpleView) objArr[9], (FrameLayout) objArr[0], (ConstraintLayout) objArr[2], (NestedScrollView) objArr[1], (ImageView) objArr[14], (ImageView) objArr[6]);
        this.P = -1L;
        this.K.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.P != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.P = 1L;
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
            this.P = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public fvp(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 15, Q, R));
    }
}
