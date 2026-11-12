package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public class snh extends rnh {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final ConstraintLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(ori.h, 1);
        sparseIntArray.put(ori.j, 2);
        sparseIntArray.put(ori.u, 3);
        sparseIntArray.put(ori.t, 4);
        sparseIntArray.put(ori.D, 5);
        sparseIntArray.put(ori.x, 6);
        sparseIntArray.put(ori.p, 7);
        sparseIntArray.put(ori.q, 8);
        sparseIntArray.put(ori.y, 9);
    }

    public snh(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[1], (View) objArr[2], (TextView) objArr[7], (TextView) objArr[8], (TextView) objArr[4], (TextView) objArr[3], (ImageView) objArr[6], (TextView) objArr[9], (ConstraintLayout) objArr[5]);
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

    public snh(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 10, L, M));
    }
}
