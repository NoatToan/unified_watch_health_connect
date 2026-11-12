package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.sport_capture.widgets.PathView;
import com.xiaomi.fitness.sport_capture.widgets.SpeedView;

/* JADX INFO: loaded from: classes10.dex */
public class o2o extends m2o {
    public static final ViewDataBinding.i M;
    public static final SparseIntArray N;
    public final ConstraintLayout K;
    public long L;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(11);
        M = iVar;
        int i = evi.g;
        int i2 = evi.f;
        iVar.a(0, new String[]{"layout_time_info", "layout_info", "layout_info", "layout_info", "layout_device_info"}, new int[]{1, 2, 3, 4, 5}, new int[]{i, i2, i2, i2, evi.e});
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(yri.f40464r, 6);
        sparseIntArray.put(yri.g, 7);
        sparseIntArray.put(yri.y, 8);
        sparseIntArray.put(yri.w, 9);
        sparseIntArray.put(yri.n, 10);
    }

    public o2o(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 5, (eae) objArr[4], (f8e) objArr[5], (eae) objArr[2], (TextView) objArr[7], (eae) objArr[3], (PathView) objArr[10], (SpeedView) objArr[6], (pde) objArr[1], (TextView) objArr[9], (TextView) objArr[8]);
        this.L = -1L;
        k0(this.A);
        k0(this.B);
        k0(this.C);
        k0(this.E);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.K = constraintLayout;
        constraintLayout.setTag(null);
        k0(this.H);
        o0(view);
        H();
    }

    private boolean C0(eae eaeVar, int i) {
        if (i != ov1.f29713a) {
            return false;
        }
        synchronized (this) {
            this.L |= 1;
        }
        return true;
    }

    private boolean D0(f8e f8eVar, int i) {
        if (i != ov1.f29713a) {
            return false;
        }
        synchronized (this) {
            this.L |= 2;
        }
        return true;
    }

    private boolean E0(eae eaeVar, int i) {
        if (i != ov1.f29713a) {
            return false;
        }
        synchronized (this) {
            this.L |= 8;
        }
        return true;
    }

    private boolean F0(eae eaeVar, int i) {
        if (i != ov1.f29713a) {
            return false;
        }
        synchronized (this) {
            this.L |= 16;
        }
        return true;
    }

    private boolean G0(pde pdeVar, int i) {
        if (i != ov1.f29713a) {
            return false;
        }
        synchronized (this) {
            this.L |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.L != 0) {
                    return true;
                }
                return this.H.F() || this.C.F() || this.E.F() || this.A.F() || this.B.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.L = 32L;
        }
        this.H.H();
        this.C.H();
        this.E.H();
        this.A.H();
        this.B.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return C0((eae) obj, i2);
        }
        if (i == 1) {
            return D0((f8e) obj, i2);
        }
        if (i == 2) {
            return G0((pde) obj, i2);
        }
        if (i == 3) {
            return E0((eae) obj, i2);
        }
        if (i != 4) {
            return false;
        }
        return F0((eae) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.H.l0(lifecycleOwner);
        this.C.l0(lifecycleOwner);
        this.E.l0(lifecycleOwner);
        this.A.l0(lifecycleOwner);
        this.B.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.L = 0L;
        }
        ViewDataBinding.r(this.H);
        ViewDataBinding.r(this.C);
        ViewDataBinding.r(this.E);
        ViewDataBinding.r(this.A);
        ViewDataBinding.r(this.B);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public o2o(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
