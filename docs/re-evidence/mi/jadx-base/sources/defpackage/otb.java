package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.health.curse.view.SymptomSelectView;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes9.dex */
public class otb extends mtb {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L = null;
    public long J;

    public otb(rk5 rk5Var, View[] viewArr, Object[] objArr) {
        super(rk5Var, viewArr[0], 0, (DividerView) objArr[3], (Guideline) objArr[5], (Guideline) objArr[7], (ImageView) objArr[0], (TextView) objArr[1], (TextView) objArr[2], (SymptomSelectView) objArr[6], (SymptomSelectView) objArr[4], (SymptomSelectView) objArr[8]);
        this.J = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        p0(viewArr);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.J != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.J = 1L;
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
            this.J = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public otb(rk5 rk5Var, View[] viewArr) {
        this(rk5Var, viewArr, ViewDataBinding.V(rk5Var, viewArr, 9, K, L));
    }
}
