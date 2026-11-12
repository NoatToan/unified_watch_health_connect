package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import miuix.core.widget.NestedScrollView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes8.dex */
public class deb extends ceb {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public final SpringBackLayout L;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(dri.T, 1);
        sparseIntArray.put(dri.N, 2);
        sparseIntArray.put(dri.g, 3);
        sparseIntArray.put(dri.f15840k, 4);
        sparseIntArray.put(dri.O, 5);
        sparseIntArray.put(dri.u, 6);
        sparseIntArray.put(dri.F, 7);
        sparseIntArray.put(dri.S, 8);
        sparseIntArray.put(dri.Q, 9);
        sparseIntArray.put(dri.R, 10);
        sparseIntArray.put(dri.d, 11);
    }

    public deb(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[11], (ImageView) objArr[3], (TextView) objArr[4], (TextView) objArr[6], (TextView) objArr[7], (ConstraintLayout) objArr[2], (TextView) objArr[5], (ImageView) objArr[9], (TextView) objArr[10], (ImageView) objArr[8], (NestedScrollView) objArr[1]);
        this.M = -1L;
        SpringBackLayout springBackLayout = (SpringBackLayout) objArr[0];
        this.L = springBackLayout;
        springBackLayout.setTag(null);
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

    public deb(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 12, N, O));
    }
}
