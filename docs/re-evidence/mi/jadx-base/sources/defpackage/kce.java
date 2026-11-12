package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public class kce extends jce {
    public static final ViewDataBinding.i Q = null;
    public static final SparseIntArray R;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(eri.Zk, 1);
        sparseIntArray.put(eri.G9, 2);
        sparseIntArray.put(eri.Yj, 3);
        sparseIntArray.put(eri.Am, 4);
        sparseIntArray.put(eri.Bm, 5);
        sparseIntArray.put(eri.Wj, 6);
        sparseIntArray.put(eri.Xj, 7);
        sparseIntArray.put(eri.O9, 8);
        sparseIntArray.put(eri.ml, 9);
        sparseIntArray.put(eri.ll, 10);
        sparseIntArray.put(eri.T8, 11);
        sparseIntArray.put(eri.d4, 12);
        sparseIntArray.put(eri.Tl, 13);
        sparseIntArray.put(eri.Sl, 14);
    }

    public kce(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (View) objArr[12], (AppCompatImageView) objArr[11], (RelativeLayout) objArr[2], (RelativeLayout) objArr[8], (FrameLayout) objArr[0], (TextView) objArr[6], (TextView) objArr[7], (TextView) objArr[3], (TextView) objArr[1], (TextView) objArr[10], (TextView) objArr[9], (TextView) objArr[14], (TextView) objArr[13], (TextView) objArr[4], (TextView) objArr[5]);
        this.P = -1L;
        this.E.setTag(null);
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

    public kce(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 15, Q, R));
    }
}
