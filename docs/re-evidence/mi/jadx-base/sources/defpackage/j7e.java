package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public class j7e extends i7e {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(gsi.w0, 1);
        sparseIntArray.put(gsi.x0, 2);
        sparseIntArray.put(gsi.v0, 3);
        sparseIntArray.put(gsi.p, 4);
        sparseIntArray.put(gsi.O, 5);
        sparseIntArray.put(gsi.P, 6);
        sparseIntArray.put(gsi.m, 7);
        sparseIntArray.put(gsi.l, 8);
    }

    public j7e(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[8], (LinearLayout) objArr[7], (TextView) objArr[4], (LinearLayout) objArr[5], (TextView) objArr[6], (ConstraintLayout) objArr[0], (TextView) objArr[3], (LinearLayout) objArr[1], (TextView) objArr[2]);
        this.J = -1L;
        this.F.setTag(null);
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

    public j7e(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
