package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes10.dex */
public class mp0 extends kp0 {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final ConstraintLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(xri.A, 1);
        sparseIntArray.put(xri.a2, 2);
        sparseIntArray.put(xri.N3, 3);
        sparseIntArray.put(xri.t5, 4);
        sparseIntArray.put(xri.e8, 5);
        sparseIntArray.put(xri.i5, 6);
        sparseIntArray.put(xri.f5, 7);
    }

    public mp0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ShapeableImageView) objArr[1], null, (ConstraintLayout) objArr[2], (TextView) objArr[3], (ImageView) objArr[7], null, (TextView) objArr[4], (TextView) objArr[6], (TextView) objArr[5]);
        this.K = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.J = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.K = 1L;
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
            this.K = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public mp0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 8, L, M));
    }
}
