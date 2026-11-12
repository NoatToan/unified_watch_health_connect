package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.training_plan_export.widget.TrainingPlanTitleBar;

/* JADX INFO: loaded from: classes10.dex */
public class cm0 extends bm0 {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(csi.J3, 1);
        sparseIntArray.put(csi.B, 2);
        sparseIntArray.put(csi.R, 3);
        sparseIntArray.put(csi.Q, 4);
        sparseIntArray.put(csi.S, 5);
        sparseIntArray.put(csi.Z, 6);
        sparseIntArray.put(csi.Y, 7);
        sparseIntArray.put(csi.a0, 8);
        sparseIntArray.put(csi.e2, 9);
    }

    public cm0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (FrameLayout) objArr[2], (TextView) objArr[4], (TextView) objArr[3], (TextView) objArr[5], (TextView) objArr[7], (TextView) objArr[6], (TextView) objArr[8], (LinearLayout) objArr[0], (RecyclerView) objArr[9], (TrainingPlanTitleBar) objArr[1]);
        this.K = -1L;
        this.H.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.K = 1L;
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
            this.K = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public cm0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 10, L, M));
    }
}
