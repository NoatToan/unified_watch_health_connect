package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public class vae extends uae {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(xri.j3, 1);
        sparseIntArray.put(xri.Q6, 2);
        sparseIntArray.put(xri.W5, 3);
        sparseIntArray.put(xri.U, 4);
        sparseIntArray.put(xri.X5, 5);
        sparseIntArray.put(xri.p5, 6);
        sparseIntArray.put(xri.N3, 7);
        sparseIntArray.put(xri.t5, 8);
        sparseIntArray.put(xri.j2, 9);
        sparseIntArray.put(xri.start_point_dis, 10);
        sparseIntArray.put(xri.v5, 11);
    }

    public vae(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (CardView) objArr[4], (TextView) objArr[9], (CardView) objArr[1], (TextView) objArr[7], (ImageView) objArr[6], (MotionLayout) objArr[0], (TextView) objArr[8], (TextView) objArr[11], (CardView) objArr[3], (ConstraintLayout) objArr[5], (TextView) objArr[10], (View) objArr[2]);
        this.M = -1L;
        this.F.setTag(null);
        o0(view);
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

    public vae(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 12, N, O));
    }
}
