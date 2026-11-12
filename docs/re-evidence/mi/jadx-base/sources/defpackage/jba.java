package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import miuix.androidbasewidget.widget.CheckedTextView;
import miuix.core.widget.NestedScrollView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes8.dex */
public class jba extends iba {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public final SpringBackLayout F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(zqi.M7, 1);
        sparseIntArray.put(zqi.u4, 2);
        sparseIntArray.put(zqi.t0, 3);
        sparseIntArray.put(zqi.A7, 4);
        sparseIntArray.put(zqi.u0, 5);
    }

    public jba(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (CheckedTextView) objArr[3], (CheckedTextView) objArr[5], (ConstraintLayout) objArr[2], (ConstraintLayout) objArr[4], (NestedScrollView) objArr[1]);
        this.G = -1L;
        SpringBackLayout springBackLayout = (SpringBackLayout) objArr[0];
        this.F = springBackLayout;
        springBackLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.G = 1L;
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
            this.G = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public jba(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 6, H, I));
    }
}
