package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public class oog extends nog {
    public static final ViewDataBinding.i P = null;
    public static final SparseIntArray Q;
    public final RelativeLayout N;
    public long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(mri.I, 1);
        sparseIntArray.put(mri.U1, 2);
        sparseIntArray.put(mri.i, 3);
        sparseIntArray.put(mri.R4, 4);
        sparseIntArray.put(mri.e1, 5);
        sparseIntArray.put(mri.s1, 6);
        sparseIntArray.put(mri.S4, 7);
        sparseIntArray.put(mri.f1, 8);
        sparseIntArray.put(mri.F1, 9);
        sparseIntArray.put(mri.X1, 10);
        sparseIntArray.put(mri.L, 11);
        sparseIntArray.put(mri.w4, 12);
        sparseIntArray.put(mri.Q4, 13);
    }

    public oog(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LinearLayout) objArr[3], (RelativeLayout) objArr[1], (LinearLayout) objArr[11], (TextView) objArr[5], (TextView) objArr[8], (LinearLayout) objArr[6], (TextView) objArr[9], (ImageView) objArr[2], (TextView) objArr[10], (TextView) objArr[12], (TextView) objArr[13], (TextView) objArr[4], (TextView) objArr[7]);
        this.O = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.N = relativeLayout;
        relativeLayout.setTag(null);
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

    public oog(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 14, P, Q));
    }
}
