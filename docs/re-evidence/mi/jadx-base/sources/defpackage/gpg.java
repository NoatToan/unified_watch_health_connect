package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public class gpg extends fpg {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(mri.m, 1);
        sparseIntArray.put(mri.s3, 2);
        sparseIntArray.put(mri.p3, 3);
        sparseIntArray.put(mri.t3, 4);
        sparseIntArray.put(mri.l, 5);
        sparseIntArray.put(mri.f27133k, 6);
        sparseIntArray.put(mri.u3, 7);
        sparseIntArray.put(mri.J5, 8);
        sparseIntArray.put(mri.I5, 9);
        sparseIntArray.put(mri.H5, 10);
        sparseIntArray.put(mri.q3, 11);
    }

    public gpg(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[6], (LinearLayout) objArr[5], (TextView) objArr[1], (LinearLayout) objArr[0], (TextView) objArr[2], (TextView) objArr[3], (TextView) objArr[4], (TextView) objArr[11], (LinearLayout) objArr[7], (ImageView) objArr[10], (LinearLayout) objArr[9], (ImageView) objArr[8]);
        this.M = -1L;
        this.D.setTag(null);
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

    public gpg(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 12, N, O));
    }
}
