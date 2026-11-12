package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.sport.view.widget.GpsSignalView;

/* JADX INFO: loaded from: classes10.dex */
public class tmn extends smn {
    public static final ViewDataBinding.i G;
    public static final SparseIntArray H;
    public long F;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(5);
        G = iVar;
        iVar.a(0, new String[]{"sport_layout_right_arrow_entrance", "sport_global_view_launch_stub"}, new int[]{1, 2}, new int[]{dvi.E0, dvi.p0});
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(xri.q6, 3);
        sparseIntArray.put(xri.X1, 4);
    }

    public tmn(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 2, (GpsSignalView) objArr[4], (mpn) objArr[1], (umn) objArr[2], (ImageView) objArr[3], (ConstraintLayout) objArr[0]);
        this.F = -1L;
        k0(this.B);
        k0(this.C);
        this.E.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(mpn mpnVar, int i) {
        if (i != nv1.f28390a) {
            return false;
        }
        synchronized (this) {
            this.F |= 1;
        }
        return true;
    }

    public final boolean B0(umn umnVar, int i) {
        if (i != nv1.f28390a) {
            return false;
        }
        synchronized (this) {
            this.F |= 2;
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
                return this.B.F() || this.C.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.F = 4L;
        }
        this.B.H();
        this.C.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return A0((mpn) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return B0((umn) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.B.l0(lifecycleOwner);
        this.C.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.F = 0L;
        }
        ViewDataBinding.r(this.B);
        ViewDataBinding.r(this.C);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public tmn(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 5, G, H));
    }
}
