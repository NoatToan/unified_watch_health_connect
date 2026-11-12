package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes10.dex */
public class xln extends wln {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(xri.L0, 1);
        sparseIntArray.put(xri.J0, 2);
        sparseIntArray.put(xri.C0, 3);
        sparseIntArray.put(xri.D0, 4);
        sparseIntArray.put(xri.x1, 5);
        sparseIntArray.put(xri.H0, 6);
        sparseIntArray.put(xri.I0, 7);
        sparseIntArray.put(xri.t1, 8);
        sparseIntArray.put(xri.O0, 9);
    }

    public xln(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ConstraintLayout) objArr[0], (DividerView) objArr[3], (AppCompatTextView) objArr[4], (RelativeLayout) objArr[6], (TextView) objArr[7], (TextView) objArr[2], (TextView) objArr[1], (TextView) objArr[9], (TextView) objArr[8], (DividerView) objArr[5]);
        this.K = -1L;
        this.A.setTag(null);
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

    public xln(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 10, L, M));
    }
}
