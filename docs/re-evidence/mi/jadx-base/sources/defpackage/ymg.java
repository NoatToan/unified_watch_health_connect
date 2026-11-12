package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public class ymg extends xmg {
    public static final ViewDataBinding.i Q = null;
    public static final SparseIntArray R;
    public final LinearLayout O;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(mri.u2, 1);
        sparseIntArray.put(mri.G0, 2);
        sparseIntArray.put(mri.P, 3);
        sparseIntArray.put(mri.H0, 4);
        sparseIntArray.put(mri.v2, 5);
        sparseIntArray.put(mri.f27132b, 6);
        sparseIntArray.put(mri.X0, 7);
        sparseIntArray.put(mri.o1, 8);
        sparseIntArray.put(mri.J, 9);
        sparseIntArray.put(mri.m1, 10);
        sparseIntArray.put(mri.K2, 11);
        sparseIntArray.put(mri.n1, 12);
        sparseIntArray.put(mri.e, 13);
        sparseIntArray.put(mri.f, 14);
    }

    public ymg(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[6], (CheckBox) objArr[13], (TextView) objArr[14], (RelativeLayout) objArr[9], (TextView) objArr[3], (LinearLayout) objArr[2], (LinearLayout) objArr[4], (RelativeLayout) objArr[7], (ImageView) objArr[10], (ImageView) objArr[12], (ImageView) objArr[8], (LinearLayout) objArr[1], (View) objArr[5], (RelativeLayout) objArr[11]);
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

    public ymg(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 15, Q, R));
    }
}
