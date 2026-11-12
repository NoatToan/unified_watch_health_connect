package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes9.dex */
public class gqe extends fqe {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final ConstraintLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(gri.g0, 1);
        sparseIntArray.put(gri.w, 2);
        sparseIntArray.put(gri.l, 3);
        sparseIntArray.put(gri.l0, 4);
        sparseIntArray.put(gri.J, 5);
        sparseIntArray.put(gri.K, 6);
        sparseIntArray.put(gri.O, 7);
        sparseIntArray.put(gri.x, 8);
        sparseIntArray.put(gri.N, 9);
    }

    public gqe(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (DividerView) objArr[3], (DividerView) objArr[2], (TextView) objArr[8], (CheckBox) objArr[5], (TextView) objArr[6], (TextView) objArr[9], (LinearLayout) objArr[7], (TextView) objArr[1], (LinearLayout) objArr[4]);
        this.K = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.J = constraintLayout;
        constraintLayout.setTag(null);
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

    public gqe(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 10, L, M));
    }
}
