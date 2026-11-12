package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public class q36 extends p36 {
    public static final ViewDataBinding.i U = null;
    public static final SparseIntArray V;
    public final ConstraintLayout S;
    public long T;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        V = sparseIntArray;
        sparseIntArray.put(xqi.f, 1);
        sparseIntArray.put(xqi.h, 2);
        sparseIntArray.put(xqi.i, 3);
        sparseIntArray.put(xqi.e, 4);
        sparseIntArray.put(xqi.g, 5);
        sparseIntArray.put(xqi.d, 6);
        sparseIntArray.put(xqi.l, 7);
        sparseIntArray.put(xqi.n, 8);
        sparseIntArray.put(xqi.o, 9);
        sparseIntArray.put(xqi.f39368k, 10);
        sparseIntArray.put(xqi.m, 11);
        sparseIntArray.put(xqi.j, 12);
        sparseIntArray.put(xqi.v0, 13);
        sparseIntArray.put(xqi.x0, 14);
        sparseIntArray.put(xqi.y0, 15);
        sparseIntArray.put(xqi.u0, 16);
        sparseIntArray.put(xqi.w0, 17);
        sparseIntArray.put(xqi.t0, 18);
    }

    public q36(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (CheckBox) objArr[6], (TextView) objArr[4], (ConstraintLayout) objArr[1], (TextView) objArr[5], (ImageView) objArr[2], (TextView) objArr[3], (CheckBox) objArr[12], (TextView) objArr[10], (ConstraintLayout) objArr[7], (TextView) objArr[11], (ImageView) objArr[8], (TextView) objArr[9], (CheckBox) objArr[18], (TextView) objArr[16], (ConstraintLayout) objArr[13], (TextView) objArr[17], (ImageView) objArr[14], (TextView) objArr[15]);
        this.T = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.S = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.T != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.T = 1L;
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
            this.T = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public q36(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 19, U, V));
    }
}
