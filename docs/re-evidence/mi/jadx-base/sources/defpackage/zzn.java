package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.DividerView;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes10.dex */
public class zzn extends yzn {
    public static final ViewDataBinding.i S = null;
    public static final SparseIntArray T;
    public final ConstraintLayout Q;
    public long R;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        T = sparseIntArray;
        sparseIntArray.put(xri.u5, 1);
        sparseIntArray.put(xri.t5, 2);
        sparseIntArray.put(xri.e3, 3);
        sparseIntArray.put(xri.r4, 4);
        sparseIntArray.put(xri.w5, 5);
        sparseIntArray.put(xri.m5, 6);
        sparseIntArray.put(xri.G1, 7);
        sparseIntArray.put(xri.s0, 8);
        sparseIntArray.put(xri.F1, 9);
        sparseIntArray.put(xri.H1, 10);
        sparseIntArray.put(xri.k5, 11);
        sparseIntArray.put(xri.P3, 12);
        sparseIntArray.put(xri.x1, 13);
        sparseIntArray.put(xri.j5, 14);
        sparseIntArray.put(xri.l5, 15);
        sparseIntArray.put(xri.t1, 16);
    }

    public zzn(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (AppCompatTextView) objArr[8], (TextView) objArr[16], (DividerView) objArr[13], (TextView) objArr[9], (RoundImageView) objArr[7], (TextView) objArr[10], (DividerView) objArr[3], (AppCompatTextView) objArr[12], (TextView) objArr[4], (RelativeLayout) objArr[14], (ConstraintLayout) objArr[11], (TextView) objArr[15], (RelativeLayout) objArr[6], (TextView) objArr[2], (TextView) objArr[1], (TextView) objArr[5]);
        this.R = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.Q = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.R != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.R = 1L;
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
            this.R = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public zzn(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 17, S, T));
    }
}
