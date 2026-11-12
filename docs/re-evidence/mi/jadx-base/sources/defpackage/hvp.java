package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public class hvp extends gvp {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final FrameLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(csi.s2, 1);
        sparseIntArray.put(csi.x2, 2);
        sparseIntArray.put(csi.t2, 3);
        sparseIntArray.put(csi.v2, 4);
        sparseIntArray.put(csi.u2, 5);
        sparseIntArray.put(csi.W1, 6);
        sparseIntArray.put(csi.V1, 7);
        sparseIntArray.put(csi.X1, 8);
    }

    public hvp(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[7], (ConstraintLayout) objArr[6], (TextView) objArr[8], (TextView) objArr[3], (TextView) objArr[5], (TextView) objArr[4], (ConstraintLayout) objArr[1], (TextView) objArr[2]);
        this.J = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.I = frameLayout;
        frameLayout.setTag(null);
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

    public hvp(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
