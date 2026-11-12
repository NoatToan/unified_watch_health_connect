package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.view.DataTitleView;

/* JADX INFO: loaded from: classes9.dex */
public class sna extends rna {
    public static final ViewDataBinding.i G;
    public static final SparseIntArray H;
    public final ConstraintLayout E;
    public long F;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(5);
        G = iVar;
        iVar.a(1, new String[]{"health_layout_weight_day_detail"}, new int[]{2}, new int[]{jui.Q4});
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(eri.H2, 3);
        sparseIntArray.put(eri.f16992b, 4);
    }

    public sna(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (TextView) objArr[4], (LinearLayout) objArr[1], (DataTitleView) objArr[3], (uzb) objArr[2]);
        this.F = -1L;
        this.B.setTag(null);
        k0(this.D);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.E = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    private boolean A0(uzb uzbVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.F |= 1;
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
                return this.D.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.F = 2L;
        }
        this.D.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((uzb) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.D.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.F = 0L;
        }
        ViewDataBinding.r(this.D);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public sna(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 5, G, H));
    }
}
