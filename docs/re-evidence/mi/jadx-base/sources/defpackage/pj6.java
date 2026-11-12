package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.databinding.ViewDataBinding;
import miuix.core.widget.NestedScrollView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes8.dex */
public class pj6 extends oj6 {
    public static final ViewDataBinding.i F = null;
    public static final SparseIntArray G;
    public final SpringBackLayout D;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(zqi.M7, 1);
        sparseIntArray.put(zqi.k6, 2);
        sparseIntArray.put(zqi.l6, 3);
    }

    public pj6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (Button) objArr[2], (Button) objArr[3], (NestedScrollView) objArr[1]);
        this.E = -1L;
        SpringBackLayout springBackLayout = (SpringBackLayout) objArr[0];
        this.D = springBackLayout;
        springBackLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.E != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.E = 1L;
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
            this.E = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public pj6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 4, F, G));
    }
}
