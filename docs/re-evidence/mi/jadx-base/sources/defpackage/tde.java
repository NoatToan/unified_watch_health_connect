package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes9.dex */
public class tde extends sde {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public final ConstraintLayout L;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(eri.cj, 1);
        sparseIntArray.put(eri.S6, 2);
        sparseIntArray.put(eri.S4, 3);
        sparseIntArray.put(eri.we, 4);
        sparseIntArray.put(eri.d, 5);
        sparseIntArray.put(eri.W7, 6);
        sparseIntArray.put(eri.uj, 7);
        sparseIntArray.put(eri.m5, 8);
        sparseIntArray.put(eri.n5, 9);
        sparseIntArray.put(eri.T6, 10);
        sparseIntArray.put(eri.Hh, 11);
    }

    public tde(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[5], (LinearLayout) objArr[3], (TextView) objArr[8], (TextView) objArr[9], (DividerView) objArr[2], (DividerView) objArr[10], (TextView) objArr[6], (RelativeLayout) objArr[4], (TextView) objArr[11], (TextView) objArr[1], (RelativeLayout) objArr[7]);
        this.M = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.L = constraintLayout;
        constraintLayout.setTag(null);
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

    public tde(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 12, N, O));
    }
}
