package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.widget.view.RoundImageView;
import miuix.androidbasewidget.widget.ProgressBar;

/* JADX INFO: loaded from: classes10.dex */
public class bvp extends avp {
    public static final ViewDataBinding.i Q = null;
    public static final SparseIntArray R;
    public final ConstraintLayout O;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(csi.L2, 1);
        sparseIntArray.put(csi.f14677b, 2);
        sparseIntArray.put(csi.j4, 3);
        sparseIntArray.put(csi.f4, 4);
        sparseIntArray.put(csi.i4, 5);
        sparseIntArray.put(csi.B4, 6);
        sparseIntArray.put(csi.C4, 7);
        sparseIntArray.put(csi.g4, 8);
        sparseIntArray.put(csi.h4, 9);
        sparseIntArray.put(csi.o0, 10);
        sparseIntArray.put(csi.s0, 11);
        sparseIntArray.put(csi.u0, 12);
        sparseIntArray.put(csi.t0, 13);
        sparseIntArray.put(csi.w4, 14);
    }

    public bvp(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ConstraintLayout) objArr[2], (ConstraintLayout) objArr[10], (RoundImageView) objArr[11], (TextView) objArr[13], (TextView) objArr[12], (FrameLayout) objArr[1], (TextView) objArr[4], (TextView) objArr[8], (ProgressBar) objArr[9], (TextView) objArr[5], (TextView) objArr[3], (RecyclerView) objArr[14], (RoundImageView) objArr[6], (TextView) objArr[7]);
        this.P = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.O = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.P != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.P = 1L;
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
            this.P = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public bvp(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 15, Q, R));
    }
}
