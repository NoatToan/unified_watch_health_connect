package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class hmn extends gmn {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(xri.q0, 1);
        sparseIntArray.put(xri.i0, 2);
        sparseIntArray.put(xri.j0, 3);
        sparseIntArray.put(xri.h0, 4);
        sparseIntArray.put(xri.I3, 5);
        sparseIntArray.put(xri.H, 6);
        sparseIntArray.put(xri.S, 7);
        sparseIntArray.put(xri.P, 8);
    }

    public hmn(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LinearLayout) objArr[6], (Button) objArr[8], (Button) objArr[7], (TextView) objArr[4], (LinearLayout) objArr[2], (TextView) objArr[3], (FrameLayout) objArr[0], (LinearLayout) objArr[1], (RecyclerView) objArr[5]);
        this.J = -1L;
        this.G.setTag(null);
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

    public hmn(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
