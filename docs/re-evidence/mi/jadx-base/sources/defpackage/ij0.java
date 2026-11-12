package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public class ij0 extends hj0 {
    public static final ViewDataBinding.i P = null;
    public static final SparseIntArray Q;
    public long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(bri.F1, 1);
        sparseIntArray.put(bri.w1, 2);
        sparseIntArray.put(bri.c, 3);
        sparseIntArray.put(bri.I5, 4);
        sparseIntArray.put(bri.F5, 5);
        sparseIntArray.put(bri.B7, 6);
        sparseIntArray.put(bri.A7, 7);
        sparseIntArray.put(bri.v7, 8);
        sparseIntArray.put(bri.T3, 9);
        sparseIntArray.put(bri.U3, 10);
        sparseIntArray.put(bri.F, 11);
        sparseIntArray.put(bri.L3, 12);
        sparseIntArray.put(bri.X3, 13);
    }

    public ij0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (AppCompatImageButton) objArr[3], (TextView) objArr[11], (LinearLayout) objArr[2], (RelativeLayout) objArr[0], (LinearLayout) objArr[1], (TextView) objArr[12], (ImageView) objArr[9], (LinearLayout) objArr[10], (TextView) objArr[13], (TextView) objArr[5], (TextView) objArr[4], (TextView) objArr[8], (TextView) objArr[7], (TextView) objArr[6]);
        this.O = -1L;
        this.D.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.O != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.O = 1L;
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
            this.O = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public ij0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 14, P, Q));
    }
}
