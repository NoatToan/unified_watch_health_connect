package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public class vod extends uod {
    public static final ViewDataBinding.i P = null;
    public static final SparseIntArray Q;
    public final ConstraintLayout N;
    public long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(eri.Um, 1);
        sparseIntArray.put(eri.tj, 2);
        sparseIntArray.put(eri.Y0, 3);
        sparseIntArray.put(eri.Uo, 4);
        sparseIntArray.put(eri.r5, 5);
        sparseIntArray.put(eri.il, 6);
        sparseIntArray.put(eri.hl, 7);
        sparseIntArray.put(eri.fl, 8);
        sparseIntArray.put(eri.gl, 9);
        sparseIntArray.put(eri.xm, 10);
        sparseIntArray.put(eri.wm, 11);
        sparseIntArray.put(eri.um, 12);
        sparseIntArray.put(eri.vm, 13);
    }

    public vod(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (View) objArr[3], (Guideline) objArr[5], (View) objArr[2], (TextView) objArr[8], (TextView) objArr[9], (TextView) objArr[7], (TextView) objArr[6], (TextView) objArr[12], (TextView) objArr[13], (TextView) objArr[11], (TextView) objArr[10], (TextView) objArr[1], (View) objArr[4]);
        this.O = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.N = constraintLayout;
        constraintLayout.setTag(null);
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

    public vod(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 14, P, Q));
    }
}
