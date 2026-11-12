package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes7.dex */
public class syh extends ryh {
    public static final ViewDataBinding.i Q = null;
    public static final SparseIntArray R;
    public final ConstraintLayout O;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(wqi.w, 1);
        sparseIntArray.put(wqi.x, 2);
        sparseIntArray.put(wqi.h1, 3);
        sparseIntArray.put(wqi.n1, 4);
        sparseIntArray.put(wqi.d, 5);
        sparseIntArray.put(wqi.e1, 6);
        sparseIntArray.put(wqi.f1, 7);
        sparseIntArray.put(wqi.g1, 8);
        sparseIntArray.put(wqi.k1, 9);
        sparseIntArray.put(wqi.l1, 10);
        sparseIntArray.put(wqi.m1, 11);
        sparseIntArray.put(wqi.z1, 12);
        sparseIntArray.put(wqi.K, 13);
        sparseIntArray.put(wqi.O, 14);
    }

    public syh(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (Barrier) objArr[5], (Guideline) objArr[1], (Guideline) objArr[2], (RoundImageView) objArr[13], (RoundImageView) objArr[14], (TextView) objArr[6], (TextView) objArr[7], (TextView) objArr[8], (TextView) objArr[3], (TextView) objArr[9], (TextView) objArr[10], (TextView) objArr[11], (TextView) objArr[4], (TextView) objArr[12]);
        this.P = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.O = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.P != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.P = 1L;
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
            this.P = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public syh(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 15, Q, R));
    }
}
