package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public class ece extends dce {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final ConstraintLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(eri.ea, 1);
        sparseIntArray.put(eri.start_group, 2);
        sparseIntArray.put(eri.start_value, 3);
        sparseIntArray.put(eri.start_label, 4);
        sparseIntArray.put(eri.J4, 5);
        sparseIntArray.put(eri.O4, 6);
        sparseIntArray.put(eri.K4, 7);
        sparseIntArray.put(eri.D9, 8);
    }

    public ece(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (RelativeLayout) objArr[5], (TextView) objArr[7], (TextView) objArr[6], (TextView) objArr[8], (LinearLayout) objArr[1], (RelativeLayout) objArr[2], (TextView) objArr[4], (TextView) objArr[3]);
        this.J = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
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

    public ece(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
