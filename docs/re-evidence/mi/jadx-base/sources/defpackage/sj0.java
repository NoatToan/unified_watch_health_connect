package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public class sj0 extends rj0 {
    public static final ViewDataBinding.i C = null;
    public static final SparseIntArray D = null;
    public final LinearLayout A;
    public long B;

    public sj0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0);
        this.B = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.A = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.B != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.B = 1L;
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
            this.B = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public sj0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 1, C, D));
    }
}
