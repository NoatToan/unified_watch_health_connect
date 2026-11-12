package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport_export.data.RouteInfo;

/* JADX INFO: loaded from: classes10.dex */
public class jp0 extends ip0 {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final ConstraintLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(xri.p5, 1);
        sparseIntArray.put(xri.V4, 2);
        sparseIntArray.put(xri.U4, 3);
        sparseIntArray.put(xri.T4, 4);
        sparseIntArray.put(xri.N3, 5);
        sparseIntArray.put(xri.t5, 6);
        sparseIntArray.put(xri.j2, 7);
        sparseIntArray.put(xri.start_point_dis, 8);
        sparseIntArray.put(xri.v5, 9);
    }

    public jp0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[7], (TextView) objArr[5], (TextView) objArr[4], (ImageView) objArr[3], (ConstraintLayout) objArr[2], (ImageView) objArr[1], (TextView) objArr[6], (TextView) objArr[9], (TextView) objArr[8]);
        this.L = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.K = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    public void C0(RouteInfo routeInfo) {
        this.J = routeInfo;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.L != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.L = 2L;
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
            this.L = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (nv1.c != i) {
            return false;
        }
        C0((RouteInfo) obj);
        return true;
    }

    public jp0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 10, M, N));
    }
}
