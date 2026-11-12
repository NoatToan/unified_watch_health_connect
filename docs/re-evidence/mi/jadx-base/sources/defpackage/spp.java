package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.detail.view.JustDanceScoreLevelView;

/* JADX INFO: loaded from: classes10.dex */
public class spp extends rpp {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final ConstraintLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(bsi.m3, 1);
        sparseIntArray.put(bsi.q3, 2);
        sparseIntArray.put(bsi.v3, 3);
        sparseIntArray.put(bsi.t3, 4);
        sparseIntArray.put(bsi.r3, 5);
        sparseIntArray.put(bsi.j3, 6);
        sparseIntArray.put(bsi.k3, 7);
        sparseIntArray.put(bsi.l3, 8);
        sparseIntArray.put(bsi.u3, 9);
        sparseIntArray.put(bsi.f8, 10);
    }

    public spp(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[6], (TextView) objArr[7], (TextView) objArr[8], (AppCompatImageView) objArr[1], (TextView) objArr[2], (TextView) objArr[5], (TextView) objArr[4], (JustDanceScoreLevelView) objArr[9], (TextView) objArr[3], (TextView) objArr[10]);
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

    public spp(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
