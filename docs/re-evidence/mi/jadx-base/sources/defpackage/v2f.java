package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public class v2f extends u2f {
    public static final ViewDataBinding.i F = null;
    public static final SparseIntArray G;
    public final ConstraintLayout D;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(hri.f20372b, 1);
        sparseIntArray.put(hri.h, 2);
        sparseIntArray.put(hri.e, 3);
    }

    public v2f(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[1], (TextView) objArr[3], (ImageView) objArr[2]);
        this.E = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.D = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.E != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.E = 1L;
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
            this.E = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public v2f(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 4, F, G));
    }
}
