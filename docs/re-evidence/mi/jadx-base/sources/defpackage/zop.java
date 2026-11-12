package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public class zop extends yop {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final ConstraintLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(bsi.N, 1);
        sparseIntArray.put(bsi.G5, 2);
        sparseIntArray.put(bsi.c6, 3);
        sparseIntArray.put(bsi.z2, 4);
        sparseIntArray.put(bsi.d4, 5);
        sparseIntArray.put(bsi.P3, 6);
        sparseIntArray.put(bsi.l, 7);
        sparseIntArray.put(bsi.t6, 8);
        sparseIntArray.put(bsi.s6, 9);
        sparseIntArray.put(bsi.Q8, 10);
    }

    public zop(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[7], (CardView) objArr[1], (ImageView) objArr[4], (ImageView) objArr[6], (AppCompatImageView) objArr[5], (ConstraintLayout) objArr[2], (NestedScrollView) objArr[3], (AppCompatImageView) objArr[9], (ConstraintLayout) objArr[8], (AppCompatTextView) objArr[10]);
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

    public zop(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
