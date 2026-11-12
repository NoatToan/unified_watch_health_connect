package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import miuix.androidbasewidget.widget.CheckedTextView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes8.dex */
public class vg6 extends ug6 {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public final ConstraintLayout L;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(zqi.M7, 1);
        sparseIntArray.put(zqi.X5, 2);
        sparseIntArray.put(zqi.Z5, 3);
        sparseIntArray.put(zqi.Y5, 4);
        sparseIntArray.put(zqi.W5, 5);
        sparseIntArray.put(zqi.e6, 6);
        sparseIntArray.put(zqi.g6, 7);
        sparseIntArray.put(zqi.f6, 8);
        sparseIntArray.put(zqi.d6, 9);
        sparseIntArray.put(zqi.i0, 10);
        sparseIntArray.put(zqi.m6, 11);
    }

    public vg6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (Button) objArr[10], (CheckedTextView) objArr[5], (ConstraintLayout) objArr[2], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[3], (CheckedTextView) objArr[9], (ConstraintLayout) objArr[6], (AppCompatTextView) objArr[8], (AppCompatTextView) objArr[7], (Button) objArr[11], (NestedScrollView) objArr[1]);
        this.M = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.L = constraintLayout;
        constraintLayout.setTag(null);
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

    public vg6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 12, N, O));
    }
}
