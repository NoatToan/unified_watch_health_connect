package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public class fl6 extends el6 {
    public static final ViewDataBinding.i D = null;
    public static final SparseIntArray E = null;
    public long C;

    public fl6(rk5 rk5Var, View[] viewArr, Object[] objArr) {
        super(rk5Var, viewArr[0], 0, (RecyclerView) objArr[1], (TextView) objArr[0]);
        this.C = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        p0(viewArr);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.C = 1L;
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
            this.C = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public fl6(rk5 rk5Var, View[] viewArr) {
        this(rk5Var, viewArr, ViewDataBinding.V(rk5Var, viewArr, 2, D, E));
    }
}
