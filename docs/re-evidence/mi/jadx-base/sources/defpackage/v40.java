package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.DividerView;
import miuix.androidbasewidget.widget.ProgressBar;

/* JADX INFO: loaded from: classes7.dex */
public class v40 extends u40 {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final ConstraintLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(vqi.X, 1);
        sparseIntArray.put(vqi.M, 2);
        sparseIntArray.put(vqi.C, 3);
        sparseIntArray.put(vqi.x, 4);
        sparseIntArray.put(vqi.n, 5);
        sparseIntArray.put(vqi.Q, 6);
        sparseIntArray.put(vqi.a0, 7);
        sparseIntArray.put(vqi.N, 8);
        sparseIntArray.put(vqi.q, 9);
    }

    public v40(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[5], (TextView) objArr[9], (TextView) objArr[4], (DividerView) objArr[3], (ImageView) objArr[2], (TextView) objArr[8], (ProgressBar) objArr[6], (ConstraintLayout) objArr[1], (ConstraintLayout) objArr[7]);
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

    public v40(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 10, L, M));
    }
}
