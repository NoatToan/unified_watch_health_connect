package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import miuix.core.widget.NestedScrollView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes9.dex */
public class yng extends xng {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final SpringBackLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(mri.j4, 1);
        sparseIntArray.put(mri.g3, 2);
        sparseIntArray.put(mri.f3, 3);
        sparseIntArray.put(mri.N2, 4);
        sparseIntArray.put(mri.e3, 5);
        sparseIntArray.put(mri.t, 6);
        sparseIntArray.put(mri.T4, 7);
        sparseIntArray.put(mri.Q0, 8);
    }

    public yng(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (AppCompatTextView) objArr[6], (TextView) objArr[8], (AppCompatImageView) objArr[4], (AppCompatTextView) objArr[5], (ConstraintLayout) objArr[3], (TextView) objArr[2], (NestedScrollView) objArr[1], (AppCompatTextView) objArr[7]);
        this.J = -1L;
        SpringBackLayout springBackLayout = (SpringBackLayout) objArr[0];
        this.I = springBackLayout;
        springBackLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.J != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.J = 1L;
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
            this.J = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public yng(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
