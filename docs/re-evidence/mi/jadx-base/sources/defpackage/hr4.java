package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.mi.health.course.widget.CourseInfoHeaderPreView;
import com.xiaomi.fitness.training_plan_export.widget.TrainingStartBtn;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes5.dex */
public class hr4 extends gr4 {
    public static final ViewDataBinding.i V = null;
    public static final SparseIntArray W;
    public final LinearLayout T;
    public long U;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        W = sparseIntArray;
        sparseIntArray.put(oqi.course_header, 1);
        sparseIntArray.put(oqi.Z, 2);
        sparseIntArray.put(oqi.a0, 3);
        sparseIntArray.put(oqi.b0, 4);
        sparseIntArray.put(oqi.c0, 5);
        sparseIntArray.put(oqi.S, 6);
        sparseIntArray.put(oqi.U, 7);
        sparseIntArray.put(oqi.E, 8);
        sparseIntArray.put(oqi.D, 9);
        sparseIntArray.put(oqi.F, 10);
        sparseIntArray.put(oqi.C, 11);
        sparseIntArray.put(oqi.c1, 12);
        sparseIntArray.put(oqi.f29391b, 13);
        sparseIntArray.put(oqi.d, 14);
        sparseIntArray.put(oqi.c, 15);
        sparseIntArray.put(oqi.A1, 16);
        sparseIntArray.put(oqi.B1, 17);
        sparseIntArray.put(oqi.start_view, 18);
        sparseIntArray.put(oqi.G1, 19);
    }

    public hr4(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LinearLayout) objArr[13], (DividerView) objArr[15], (TextView) objArr[14], (LinearLayout) objArr[11], (TextView) objArr[9], (Group) objArr[8], (TextView) objArr[10], (CourseInfoHeaderPreView) objArr[1], (LinearLayout) objArr[6], (TextView) objArr[7], (LinearLayout) objArr[2], (LinearLayout) objArr[3], (TextView) objArr[4], (TextView) objArr[5], (RecyclerView) objArr[12], (TextView) objArr[18], (TextView) objArr[16], (TextView) objArr[17], (TrainingStartBtn) objArr[19]);
        this.U = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.T = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.U != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.U = 1L;
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
            this.U = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public hr4(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 20, V, W));
    }
}
