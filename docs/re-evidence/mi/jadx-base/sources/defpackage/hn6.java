package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes8.dex */
public class hn6 extends gn6 {
    public static final ViewDataBinding.i I;
    public static final SparseIntArray J;
    public final CoordinatorLayout G;
    public long H;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(7);
        I = iVar;
        iVar.a(1, new String[]{"device_settings_widget_select_title"}, new int[]{2}, new int[]{eui.j2});
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(zqi.wa, 3);
        sparseIntArray.put(zqi.Va, 4);
        sparseIntArray.put(zqi.E4, 5);
        sparseIntArray.put(zqi.Z, 6);
    }

    public hn6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (Button) objArr[6], (LinearLayout) objArr[5], (ConstraintLayout) objArr[1], (TextView) objArr[3], (ViewPager) objArr[4], (kn6) objArr[2]);
        this.H = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.G = coordinatorLayout;
        coordinatorLayout.setTag(null);
        this.C.setTag(null);
        k0(this.F);
        o0(view);
        H();
    }

    public final boolean A0(kn6 kn6Var, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.H |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.H != 0) {
                    return true;
                }
                return this.F.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.H = 2L;
        }
        this.F.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((kn6) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.F.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.H = 0L;
        }
        ViewDataBinding.r(this.F);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public hn6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, I, J));
    }
}
