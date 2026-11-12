package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public class zae extends yae {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(xri.B2, 1);
        sparseIntArray.put(xri.D6, 2);
        sparseIntArray.put(xri.C6, 3);
        sparseIntArray.put(xri.E6, 4);
        sparseIntArray.put(xri.I6, 5);
        sparseIntArray.put(xri.G6, 6);
        sparseIntArray.put(xri.F6, 7);
        sparseIntArray.put(xri.H6, 8);
    }

    public zae(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (RelativeLayout) objArr[1], (ConstraintLayout) objArr[0], (ImageView) objArr[3], (ImageView) objArr[2], (TextView) objArr[4], (ImageView) objArr[7], (ImageView) objArr[6], (ImageView) objArr[8], (ImageView) objArr[5]);
        this.J = -1L;
        this.B.setTag(null);
        o0(view);
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

    public zae(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
