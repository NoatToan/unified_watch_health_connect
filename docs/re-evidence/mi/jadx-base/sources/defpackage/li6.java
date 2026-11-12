package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes8.dex */
public class li6 extends ki6 {
    public static final ViewDataBinding.i V = null;
    public static final SparseIntArray W;
    public final ConstraintLayout T;
    public long U;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        W = sparseIntArray;
        sparseIntArray.put(zqi.M7, 1);
        sparseIntArray.put(zqi.D9, 2);
        sparseIntArray.put(zqi.C9, 3);
        sparseIntArray.put(zqi.w9, 4);
        sparseIntArray.put(zqi.p9, 5);
        sparseIntArray.put(zqi.o9, 6);
        sparseIntArray.put(zqi.n9, 7);
        sparseIntArray.put(zqi.j9, 8);
        sparseIntArray.put(zqi.h9, 9);
        sparseIntArray.put(zqi.i9, 10);
        sparseIntArray.put(zqi.v9, 11);
        sparseIntArray.put(zqi.t9, 12);
        sparseIntArray.put(zqi.u9, 13);
        sparseIntArray.put(zqi.m9, 14);
        sparseIntArray.put(zqi.l9, 15);
        sparseIntArray.put(zqi.q9, 16);
        sparseIntArray.put(zqi.k9, 17);
        sparseIntArray.put(zqi.i0, 18);
        sparseIntArray.put(zqi.m6, 19);
    }

    public li6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (Button) objArr[18], (Button) objArr[19], (NestedScrollView) objArr[1], (CheckBox) objArr[9], (AppCompatTextView) objArr[10], (ConstraintLayout) objArr[8], (CheckBox) objArr[17], (AppCompatTextView) objArr[15], (ConstraintLayout) objArr[14], (CheckBox) objArr[7], (AppCompatTextView) objArr[6], (ConstraintLayout) objArr[5], (AppCompatTextView) objArr[16], (CheckBox) objArr[12], (AppCompatTextView) objArr[13], (ConstraintLayout) objArr[11], (CheckBox) objArr[4], (AppCompatTextView) objArr[3], (ConstraintLayout) objArr[2]);
        this.U = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.T = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.U != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.U = 1L;
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
            this.U = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public li6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 20, V, W));
    }
}
