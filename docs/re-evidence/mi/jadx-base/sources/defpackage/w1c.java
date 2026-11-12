package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public class w1c extends v1c {
    public static final ViewDataBinding.i Q = null;
    public static final SparseIntArray R;
    public final LinearLayout O;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(eri.ic, 1);
        sparseIntArray.put(eri.Ck, 2);
        sparseIntArray.put(eri.I1, 3);
        sparseIntArray.put(eri.t8, 4);
        sparseIntArray.put(eri.yj, 5);
        sparseIntArray.put(eri.wj, 6);
        sparseIntArray.put(eri.J1, 7);
        sparseIntArray.put(eri.u8, 8);
        sparseIntArray.put(eri.zj, 9);
        sparseIntArray.put(eri.xj, 10);
        sparseIntArray.put(eri.W3, 11);
        sparseIntArray.put(eri.Lj, 12);
        sparseIntArray.put(eri.Kj, 13);
        sparseIntArray.put(eri.Jj, 14);
    }

    public w1c(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ConstraintLayout) objArr[3], (ConstraintLayout) objArr[7], (View) objArr[11], (AppCompatImageView) objArr[4], (AppCompatImageView) objArr[8], (NestedScrollView) objArr[1], (TextView) objArr[2], (TextView) objArr[6], (TextView) objArr[10], (TextView) objArr[5], (TextView) objArr[9], (TextView) objArr[14], (TextView) objArr[13], (TextView) objArr[12]);
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

    public w1c(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 15, Q, R));
    }
}
