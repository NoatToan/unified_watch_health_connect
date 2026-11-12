package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.sport_capture.widgets.hr.HeartRateView;

/* JADX INFO: loaded from: classes10.dex */
public class x2o extends v2o {
    public static final ViewDataBinding.i G;
    public static final SparseIntArray H;
    public final ConstraintLayout E;
    public long F;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(5);
        G = iVar;
        iVar.a(0, new String[]{"layout_time_info", "layout_info", "layout_device_info"}, new int[]{1, 2, 3}, new int[]{evi.g, evi.f, evi.e});
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(yri.j, 4);
    }

    public x2o(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 3, (eae) objArr[2], (f8e) objArr[3], (HeartRateView) objArr[4], (pde) objArr[1]);
        this.F = -1L;
        k0(this.A);
        k0(this.B);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.E = constraintLayout;
        constraintLayout.setTag(null);
        k0(this.D);
        o0(view);
        H();
    }

    private boolean C0(eae eaeVar, int i) {
        if (i != ov1.f29713a) {
            return false;
        }
        synchronized (this) {
            this.F |= 1;
        }
        return true;
    }

    private boolean D0(f8e f8eVar, int i) {
        if (i != ov1.f29713a) {
            return false;
        }
        synchronized (this) {
            this.F |= 2;
        }
        return true;
    }

    private boolean E0(pde pdeVar, int i) {
        if (i != ov1.f29713a) {
            return false;
        }
        synchronized (this) {
            this.F |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.F != 0) {
                    return true;
                }
                return this.D.F() || this.A.F() || this.B.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.F = 8L;
        }
        this.D.H();
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
        if (i != 2) {
            return false;
        }
        return E0((pde) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.D.l0(lifecycleOwner);
        this.A.l0(lifecycleOwner);
        this.B.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.F = 0L;
        }
        ViewDataBinding.r(this.D);
        ViewDataBinding.r(this.A);
        ViewDataBinding.r(this.B);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public x2o(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 5, G, H));
    }
}
