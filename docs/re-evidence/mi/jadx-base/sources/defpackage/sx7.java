package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport_eco.view.widget.CircularProgressLayout;

/* JADX INFO: loaded from: classes10.dex */
public class sx7 extends rx7 {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final ConstraintLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(zri.d0, 1);
        sparseIntArray.put(zri.W, 2);
        sparseIntArray.put(zri.V, 3);
        sparseIntArray.put(zri.X, 4);
        sparseIntArray.put(zri.c0, 5);
        sparseIntArray.put(zri.i2, 6);
        sparseIntArray.put(zri.v2, 7);
        sparseIntArray.put(zri.u, 8);
        sparseIntArray.put(zri.c1, 9);
        sparseIntArray.put(zri.v, 10);
    }

    public sx7(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (FrameLayout) objArr[8], (ImageView) objArr[10], (CircularProgressLayout) objArr[3], (ImageView) objArr[2], (ImageView) objArr[4], (FrameLayout) objArr[5], (FrameLayout) objArr[1], (CircularProgressLayout) objArr[9], (ImageView) objArr[6], (ImageView) objArr[7]);
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

    public sx7(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
