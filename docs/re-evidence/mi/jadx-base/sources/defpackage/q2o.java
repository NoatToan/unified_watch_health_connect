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
public class q2o extends p2o {
    public static final ViewDataBinding.i N;
    public static final SparseIntArray O;
    public final ConstraintLayout L;
    public long M;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(12);
        N = iVar;
        int i = evi.g;
        int i2 = evi.f;
        iVar.a(0, new String[]{"layout_time_info", "layout_info", "layout_info", "layout_info", "layout_info", "layout_device_info"}, new int[]{1, 2, 3, 4, 5, 6}, new int[]{i, i2, i2, i2, i2, evi.e});
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(yri.f40464r, 7);
        sparseIntArray.put(yri.g, 8);
        sparseIntArray.put(yri.f, 9);
        sparseIntArray.put(yri.e, 10);
        sparseIntArray.put(yri.n, 11);
    }

    public q2o(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 6, (eae) objArr[5], (f8e) objArr[6], (eae) objArr[3], (TextView) objArr[10], (TextView) objArr[9], (TextView) objArr[8], (eae) objArr[4], (PathView) objArr[11], (eae) objArr[2], (SpeedView) objArr[7], (pde) objArr[1]);
        this.M = -1L;
        k0(this.A);
        k0(this.B);
        k0(this.C);
        k0(this.G);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.L = constraintLayout;
        constraintLayout.setTag(null);
        k0(this.I);
        k0(this.K);
        o0(view);
        H();
    }

    private boolean C0(eae eaeVar, int i) {
        if (i != ov1.f29713a) {
            return false;
        }
        synchronized (this) {
            this.M |= 1;
        }
        return true;
    }

    private boolean D0(f8e f8eVar, int i) {
        if (i != ov1.f29713a) {
            return false;
        }
        synchronized (this) {
            this.M |= 2;
        }
        return true;
    }

    private boolean E0(eae eaeVar, int i) {
        if (i != ov1.f29713a) {
            return false;
        }
        synchronized (this) {
            this.M |= 8;
        }
        return true;
    }

    private boolean F0(eae eaeVar, int i) {
        if (i != ov1.f29713a) {
            return false;
        }
        synchronized (this) {
            this.M |= 32;
        }
        return true;
    }

    private boolean H0(pde pdeVar, int i) {
        if (i != ov1.f29713a) {
            return false;
        }
        synchronized (this) {
            this.M |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.M != 0) {
                    return true;
                }
                return this.K.F() || this.I.F() || this.C.F() || this.G.F() || this.A.F() || this.B.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean G0(eae eaeVar, int i) {
        if (i != ov1.f29713a) {
            return false;
        }
        synchronized (this) {
            this.M |= 16;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.M = 64L;
        }
        this.K.H();
        this.I.H();
        this.C.H();
        this.G.H();
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
            return H0((pde) obj, i2);
        }
        if (i == 3) {
            return E0((eae) obj, i2);
        }
        if (i == 4) {
            return G0((eae) obj, i2);
        }
        if (i != 5) {
            return false;
        }
        return F0((eae) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.K.l0(lifecycleOwner);
        this.I.l0(lifecycleOwner);
        this.C.l0(lifecycleOwner);
        this.G.l0(lifecycleOwner);
        this.A.l0(lifecycleOwner);
        this.B.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.M = 0L;
        }
        ViewDataBinding.r(this.K);
        ViewDataBinding.r(this.I);
        ViewDataBinding.r(this.C);
        ViewDataBinding.r(this.G);
        ViewDataBinding.r(this.A);
        ViewDataBinding.r(this.B);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public q2o(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 12, N, O));
    }
}
