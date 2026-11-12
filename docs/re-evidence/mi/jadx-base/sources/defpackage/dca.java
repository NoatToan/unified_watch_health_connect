package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.widget.CommonTitleBar;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes9.dex */
public class dca extends cca {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final ConstraintLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(eri.ij, 1);
        sparseIntArray.put(eri.Mo, 2);
        sparseIntArray.put(eri.No, 3);
        sparseIntArray.put(eri.Qc, 4);
        sparseIntArray.put(eri.Y3, 5);
        sparseIntArray.put(eri.j0, 6);
        sparseIntArray.put(eri.l0, 7);
        sparseIntArray.put(eri.hp, 8);
        sparseIntArray.put(eri.op, 9);
        sparseIntArray.put(eri.d2, 10);
    }

    public dca(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[6], (TextView) objArr[7], (TextView) objArr[10], (View) objArr[5], (TextView) objArr[4], (CommonTitleBar) objArr[1], (RoundImageView) objArr[2], (TextView) objArr[3], (TextView) objArr[8], (TextView) objArr[9]);
        this.L = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.K = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.L != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.L = 1L;
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
            this.L = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public dca(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
