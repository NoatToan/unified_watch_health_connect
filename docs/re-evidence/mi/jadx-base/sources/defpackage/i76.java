package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.xiaomi.fitness.device.manager.ui.DataBindingAdapters;

/* JADX INFO: loaded from: classes8.dex */
public class i76 extends h76 {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H;
    public final ConstraintLayout E;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(xqi.c, 2);
        sparseIntArray.put(xqi.f39367b, 3);
    }

    public i76(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[3], (TextView) objArr[2], (LottieAnimationView) objArr[1]);
        this.F = -1L;
        this.C.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.E = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    public void A0(Boolean bool) {
        this.D = bool;
        synchronized (this) {
            this.F |= 1;
        }
        notifyPropertyChanged(zv1.i);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.F != 0;
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
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        long j2 = j & 3;
        boolean zJ0 = j2 != 0 ? ViewDataBinding.j0(this.D) : false;
        if (j2 != 0) {
            DataBindingAdapters.setLottie(this.C, zJ0);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (zv1.i != i) {
            return false;
        }
        A0((Boolean) obj);
        return true;
    }

    public i76(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 4, G, H));
    }
}
