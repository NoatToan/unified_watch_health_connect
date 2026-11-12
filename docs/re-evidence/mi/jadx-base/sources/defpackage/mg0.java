package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.training_plan_export.widget.TrainingPlanTitleBar;

/* JADX INFO: loaded from: classes10.dex */
public class mg0 extends lg0 {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(csi.J3, 1);
        sparseIntArray.put(csi.a4, 2);
        sparseIntArray.put(csi.Z3, 3);
        sparseIntArray.put(csi.b4, 4);
        sparseIntArray.put(csi.P3, 5);
        sparseIntArray.put(csi.O3, 6);
        sparseIntArray.put(csi.Q3, 7);
        sparseIntArray.put(csi.X3, 8);
        sparseIntArray.put(csi.W3, 9);
        sparseIntArray.put(csi.Y3, 10);
        sparseIntArray.put(csi.H, 11);
    }

    public mg0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (RecyclerView) objArr[11], (LinearLayout) objArr[0], (TrainingPlanTitleBar) objArr[1], (TextView) objArr[6], (TextView) objArr[5], (TextView) objArr[7], (TextView) objArr[9], (TextView) objArr[8], (TextView) objArr[10], (TextView) objArr[3], (TextView) objArr[2], (TextView) objArr[4]);
        this.M = -1L;
        this.B.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.M != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.M = 1L;
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
            this.M = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public mg0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 12, N, O));
    }
}
