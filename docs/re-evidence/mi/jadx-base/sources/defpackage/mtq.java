package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public class mtq extends ltq {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(xri.V1, 1);
        sparseIntArray.put(xri.gps_tv, 2);
        sparseIntArray.put(xri.a6, 3);
        sparseIntArray.put(xri.b6, 4);
        sparseIntArray.put(xri.c6, 5);
        sparseIntArray.put(xri.d6, 6);
        sparseIntArray.put(xri.e6, 7);
        sparseIntArray.put(xri.gps_describe, 8);
        sparseIntArray.put(xri.o, 9);
    }

    public mtq(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[9], (TextView) objArr[1], (TextView) objArr[8], (ConstraintLayout) objArr[0], (TextView) objArr[2], (TextView) objArr[3], (View) objArr[4], (View) objArr[5], (View) objArr[6], (View) objArr[7]);
        this.K = -1L;
        this.D.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.K = 1L;
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
            this.K = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public mtq(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 10, L, M));
    }
}
