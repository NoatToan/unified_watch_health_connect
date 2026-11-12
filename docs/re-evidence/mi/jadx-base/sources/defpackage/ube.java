package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.view.HealthBannerCardSetView;

/* JADX INFO: loaded from: classes9.dex */
public class ube extends tbe {
    public static final ViewDataBinding.i M;
    public static final SparseIntArray N;
    public long L;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(11);
        M = iVar;
        iVar.a(0, new String[]{"layout_sleep_interfere_create_entry"}, new int[]{3}, new int[]{jui.A7});
        iVar.a(1, new String[]{"layout_sleep_rhythm_monitor_entrance"}, new int[]{2}, new int[]{jui.J7});
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(eri.G5, 4);
        sparseIntArray.put(eri.K5, 5);
        sparseIntArray.put(eri.J5, 6);
        sparseIntArray.put(eri.I5, 7);
        sparseIntArray.put(eri.H5, 8);
        sparseIntArray.put(eri.b4, 9);
        sparseIntArray.put(eri.L5, 10);
    }

    public ube(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 2, (hce) objArr[2], (View) objArr[9], (HealthBannerCardSetView) objArr[10], (LinearLayout) objArr[0], (ConstraintLayout) objArr[4], (LinearLayout) objArr[8], (TextView) objArr[7], (TextView) objArr[6], (TextView) objArr[5], (ConstraintLayout) objArr[1], (vbe) objArr[3]);
        this.L = -1L;
        k0(this.A);
        this.D.setTag(null);
        this.J.setTag(null);
        k0(this.K);
        o0(view);
        H();
    }

    private boolean D0(vbe vbeVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.L |= 1;
        }
        return true;
    }

    public final boolean C0(hce hceVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.L |= 2;
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
                return this.A.F() || this.K.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.L = 4L;
        }
        this.A.H();
        this.K.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return D0((vbe) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return C0((hce) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.A.l0(lifecycleOwner);
        this.K.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.L = 0L;
        }
        ViewDataBinding.r(this.A);
        ViewDataBinding.r(this.K);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public ube(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
