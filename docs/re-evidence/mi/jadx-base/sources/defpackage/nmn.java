package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.sport.view.widget.SportGlobalTabLayout;
import com.xiaomi.fitness.widget.view.HomeHeaderView;

/* JADX INFO: loaded from: classes10.dex */
public class nmn extends mmn {
    public static final ViewDataBinding.i N;
    public static final SparseIntArray O;
    public final ConstraintLayout L;
    public long M;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(12);
        N = iVar;
        iVar.a(1, new String[]{"sport_global_view_launch"}, new int[]{2}, new int[]{dvi.o0});
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(xri.G7, 3);
        sparseIntArray.put(xri.h2, 4);
        sparseIntArray.put(xri.z6, 5);
        sparseIntArray.put(xri.y6, 6);
        sparseIntArray.put(xri.w6, 7);
        sparseIntArray.put(xri.goal_setting, 8);
        sparseIntArray.put(xri.d, 9);
        sparseIntArray.put(xri.M6, 10);
        sparseIntArray.put(xri.h6, 11);
    }

    public nmn(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (TextView) objArr[9], (ImageView) objArr[8], (View) objArr[4], (ImageView) objArr[11], (RelativeLayout) objArr[1], (RelativeLayout) objArr[7], (SportGlobalTabLayout) objArr[6], (smn) objArr[2], (HomeHeaderView) objArr[5], (ImageView) objArr[10], (View) objArr[3]);
        this.M = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.L = constraintLayout;
        constraintLayout.setTag(null);
        this.E.setTag(null);
        k0(this.H);
        o0(view);
        H();
    }

    public final boolean A0(smn smnVar, int i) {
        if (i != nv1.f28390a) {
            return false;
        }
        synchronized (this) {
            this.M |= 1;
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
                return this.H.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.M = 2L;
        }
        this.H.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((smn) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.H.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.M = 0L;
        }
        ViewDataBinding.r(this.H);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public nmn(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 12, N, O));
    }
}
