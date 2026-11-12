package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import miuix.androidbasewidget.widget.ProgressBar;

/* JADX INFO: loaded from: classes10.dex */
public class uh extends oh {
    public static final ViewDataBinding.i Q = null;
    public static final SparseIntArray R;
    public final LinearLayout O;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(csi.I0, 1);
        sparseIntArray.put(csi.t, 2);
        sparseIntArray.put(csi.C2, 3);
        sparseIntArray.put(csi.R1, 4);
        sparseIntArray.put(csi.m2, 5);
        sparseIntArray.put(csi.g1, 6);
        sparseIntArray.put(csi.l2, 7);
        sparseIntArray.put(csi.T1, 8);
        sparseIntArray.put(csi.J0, 9);
        sparseIntArray.put(csi.K0, 10);
        sparseIntArray.put(csi.u, 11);
        sparseIntArray.put(csi.v, 12);
        sparseIntArray.put(csi.D2, 13);
        sparseIntArray.put(csi.E2, 14);
    }

    public uh(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[2], (FrameLayout) objArr[11], (TextView) objArr[12], (ImageView) objArr[1], (View) objArr[9], (TextView) objArr[10], (LinearLayout) objArr[6], (LinearLayout) objArr[4], (ProgressBar) objArr[8], (ProgressBar) objArr[7], (ProgressBar) objArr[5], (ImageView) objArr[3], (View) objArr[13], (TextView) objArr[14]);
        this.P = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.O = linearLayout;
        linearLayout.setTag(null);
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

    public uh(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 15, Q, R));
    }
}
