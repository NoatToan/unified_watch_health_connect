package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.view.justdance.PhoneActionNavigation;

/* JADX INFO: loaded from: classes10.dex */
public class jpn extends ipn {
    public static final ViewDataBinding.i E = null;
    public static final SparseIntArray F;
    public final ConstraintLayout C;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(xri.u2, 1);
    }

    public jpn(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[1]);
        this.D = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.C = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    public void A0(PhoneActionNavigation phoneActionNavigation) {
        this.B = phoneActionNavigation;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.D = 2L;
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
            this.D = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (nv1.g != i) {
            return false;
        }
        A0((PhoneActionNavigation) obj);
        return true;
    }

    public jpn(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 2, E, F));
    }
}
