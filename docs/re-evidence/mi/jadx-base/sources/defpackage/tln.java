package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public class tln extends sln {
    public static final ViewDataBinding.i R = null;
    public static final SparseIntArray S;
    public long Q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(xri.i0, 1);
        sparseIntArray.put(xri.j0, 2);
        sparseIntArray.put(xri.h0, 3);
        sparseIntArray.put(xri.I3, 4);
        sparseIntArray.put(xri.J3, 5);
        sparseIntArray.put(xri.r1, 6);
        sparseIntArray.put(xri.p1, 7);
        sparseIntArray.put(xri.q1, 8);
        sparseIntArray.put(xri.s1, 9);
        sparseIntArray.put(xri.T6, 10);
        sparseIntArray.put(xri.R6, 11);
        sparseIntArray.put(xri.S6, 12);
        sparseIntArray.put(xri.U6, 13);
        sparseIntArray.put(xri.H, 14);
        sparseIntArray.put(xri.P, 15);
    }

    public tln(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LinearLayout) objArr[14], (Button) objArr[15], (TextView) objArr[3], (LinearLayout) objArr[1], (TextView) objArr[2], (LinearLayout) objArr[0], (ImageView) objArr[7], (ImageView) objArr[8], (ConstraintLayout) objArr[6], (TextView) objArr[9], (LinearLayout) objArr[4], (LinearLayout) objArr[5], (ImageView) objArr[11], (ImageView) objArr[12], (ConstraintLayout) objArr[10], (TextView) objArr[13]);
        this.Q = -1L;
        this.F.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.Q != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.Q = 1L;
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
            this.Q = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public tln(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 16, R, S));
    }
}
