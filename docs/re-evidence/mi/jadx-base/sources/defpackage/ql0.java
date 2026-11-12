package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.RatioImageView;

/* JADX INFO: loaded from: classes10.dex */
public class ql0 extends pl0 {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public final ConstraintLayout G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(zri.e0, 1);
        sparseIntArray.put(zri.M1, 2);
        sparseIntArray.put(zri.T2, 3);
        sparseIntArray.put(zri.f0, 4);
        sparseIntArray.put(zri.U2, 5);
        sparseIntArray.put(zri.t0, 6);
    }

    public ql0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[1], (TextView) objArr[4], (TextView) objArr[6], (RatioImageView) objArr[2], (TextView) objArr[3], (ImageView) objArr[5]);
        this.H = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.G = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.H = 1L;
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
            this.H = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public ql0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, I, J));
    }
}
