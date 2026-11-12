package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.widget.CommonTitleBar;

/* JADX INFO: loaded from: classes9.dex */
public class xba extends wba {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final FrameLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(eri.ij, 1);
        sparseIntArray.put(eri.e8, 2);
        sparseIntArray.put(eri.Z2, 3);
        sparseIntArray.put(eri.X, 4);
        sparseIntArray.put(eri.a3, 5);
        sparseIntArray.put(eri.wi, 6);
        sparseIntArray.put(eri.yi, 7);
        sparseIntArray.put(eri.Y2, 8);
        sparseIntArray.put(eri.Y3, 9);
        sparseIntArray.put(eri.zi, 10);
    }

    public xba(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[4], (TextView) objArr[8], (TextView) objArr[3], (RecyclerView) objArr[5], (View) objArr[9], (ConstraintLayout) objArr[2], (LinearLayout) objArr[6], (TextView) objArr[7], (RecyclerView) objArr[10], (CommonTitleBar) objArr[1]);
        this.L = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.K = frameLayout;
        frameLayout.setTag(null);
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

    public xba(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
