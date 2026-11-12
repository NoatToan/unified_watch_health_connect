package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public class gde extends fde {
    public static final ViewDataBinding.i a0 = null;
    public static final SparseIntArray b0;
    public long Z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        b0 = sparseIntArray;
        sparseIntArray.put(bsi.c6, 1);
        sparseIntArray.put(bsi.z2, 2);
        sparseIntArray.put(bsi.t6, 3);
        sparseIntArray.put(bsi.Q8, 4);
        sparseIntArray.put(bsi.E5, 5);
        sparseIntArray.put(bsi.E2, 6);
        sparseIntArray.put(bsi.l9, 7);
        sparseIntArray.put(bsi.L5, 8);
        sparseIntArray.put(bsi.M2, 9);
        sparseIntArray.put(bsi.F9, 10);
        sparseIntArray.put(bsi.J5, 11);
        sparseIntArray.put(bsi.N2, 12);
        sparseIntArray.put(bsi.G9, 13);
        sparseIntArray.put(bsi.O5, 14);
        sparseIntArray.put(bsi.J2, 15);
        sparseIntArray.put(bsi.n8, 16);
        sparseIntArray.put(bsi.k6, 17);
        sparseIntArray.put(bsi.I5, 18);
        sparseIntArray.put(bsi.K2, 19);
        sparseIntArray.put(bsi.D9, 20);
        sparseIntArray.put(bsi.K5, 21);
        sparseIntArray.put(bsi.L2, 22);
        sparseIntArray.put(bsi.E9, 23);
        sparseIntArray.put(bsi.v2, 24);
    }

    public gde(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[6], (ImageView) objArr[24], (ImageView) objArr[2], (ImageView) objArr[15], (ImageView) objArr[19], (ImageView) objArr[22], (ImageView) objArr[9], (ImageView) objArr[12], (RelativeLayout) objArr[5], (RelativeLayout) objArr[0], (RelativeLayout) objArr[14], (RelativeLayout) objArr[18], (RelativeLayout) objArr[11], (RelativeLayout) objArr[21], (RelativeLayout) objArr[8], (NestedScrollView) objArr[1], (LinearLayout) objArr[17], (LinearLayout) objArr[3], (TextView) objArr[16], (TextView) objArr[7], (TextView) objArr[4], (TextView) objArr[20], (TextView) objArr[23], (TextView) objArr[10], (TextView) objArr[13]);
        this.Z = -1L;
        this.J.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.Z != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.Z = 1L;
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
            this.Z = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public gde(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 25, a0, b0));
    }
}
