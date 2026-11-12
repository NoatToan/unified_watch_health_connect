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
public class dmn extends cmn {
    public static final ViewDataBinding.i S = null;
    public static final SparseIntArray T;
    public long R;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        T = sparseIntArray;
        sparseIntArray.put(xri.i0, 1);
        sparseIntArray.put(xri.j0, 2);
        sparseIntArray.put(xri.h0, 3);
        sparseIntArray.put(xri.I3, 4);
        sparseIntArray.put(xri.J3, 5);
        sparseIntArray.put(xri.b0, 6);
        sparseIntArray.put(xri.Z, 7);
        sparseIntArray.put(xri.a0, 8);
        sparseIntArray.put(xri.s1, 9);
        sparseIntArray.put(xri.k4, 10);
        sparseIntArray.put(xri.i4, 11);
        sparseIntArray.put(xri.j4, 12);
        sparseIntArray.put(xri.U6, 13);
        sparseIntArray.put(xri.H, 14);
        sparseIntArray.put(xri.S, 15);
        sparseIntArray.put(xri.P, 16);
    }

    public dmn(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LinearLayout) objArr[14], (Button) objArr[16], (Button) objArr[15], (ImageView) objArr[7], (ImageView) objArr[8], (ConstraintLayout) objArr[6], (TextView) objArr[3], (LinearLayout) objArr[1], (TextView) objArr[2], (LinearLayout) objArr[0], (TextView) objArr[9], (LinearLayout) objArr[4], (LinearLayout) objArr[5], (ImageView) objArr[11], (ImageView) objArr[12], (ConstraintLayout) objArr[10], (TextView) objArr[13]);
        this.R = -1L;
        this.J.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.R != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.R = 1L;
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
            this.R = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public dmn(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 17, S, T));
    }
}
