package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.flexbox.FlexboxLayout;
import com.xiaomi.fitness.health.curse.view.HealthCurseSignView;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes9.dex */
public class lsb extends ksb {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(eri.e2, 8);
        sparseIntArray.put(eri.Uc, 9);
        sparseIntArray.put(eri.sc, 10);
        sparseIntArray.put(eri.C2, 11);
    }

    public lsb(rk5 rk5Var, View[] viewArr, Object[] objArr) {
        super(rk5Var, viewArr[0], 0, (TextView) objArr[6], (HealthCurseSignView) objArr[8], (FlexboxLayout) objArr[3], (HealthCurseSignView) objArr[11], (ViewPager2) objArr[4], (TextView) objArr[0], (TextView) objArr[1], (DividerView) objArr[2], (DividerView) objArr[5], (HealthCurseSignView) objArr[10], (HealthCurseSignView) objArr[9], (TextView) objArr[7]);
        this.M = -1L;
        this.A.setTag(null);
        this.C.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.L.setTag(null);
        p0(viewArr);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.M != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.M = 1L;
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
            this.M = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public lsb(rk5 rk5Var, View[] viewArr) {
        this(rk5Var, viewArr, ViewDataBinding.V(rk5Var, viewArr, 12, N, O));
    }
}
