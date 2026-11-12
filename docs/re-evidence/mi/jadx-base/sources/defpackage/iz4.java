package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public class iz4 extends hz4 {
    public static final ViewDataBinding.i R = null;
    public static final SparseIntArray S;
    public final NestedScrollView P;
    public long Q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(oqi.o1, 2);
        sparseIntArray.put(oqi.v0, 3);
        sparseIntArray.put(oqi.i2, 4);
        sparseIntArray.put(oqi.h2, 5);
        sparseIntArray.put(oqi.p2, 6);
        sparseIntArray.put(oqi.q2, 7);
        sparseIntArray.put(oqi.Z1, 8);
        sparseIntArray.put(oqi.a2, 9);
        sparseIntArray.put(oqi.Y0, 10);
        sparseIntArray.put(oqi.S1, 11);
        sparseIntArray.put(oqi.g2, 12);
        sparseIntArray.put(oqi.o2, 13);
        sparseIntArray.put(oqi.U1, 14);
        sparseIntArray.put(oqi.T1, 15);
    }

    public iz4(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (FrameLayout) objArr[1], (ImageFilterView) objArr[3], (RecyclerView) objArr[10], (View) objArr[2], (TextView) objArr[11], (TextView) objArr[15], (TextView) objArr[14], (TextView) objArr[8], (TextView) objArr[9], (TextView) objArr[12], (TextView) objArr[5], (TextView) objArr[4], (View) objArr[13], (View) objArr[6], (View) objArr[7]);
        this.Q = -1L;
        this.A.setTag(null);
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.P = nestedScrollView;
        nestedScrollView.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.Q != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.Q = 1L;
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
            this.Q = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public iz4(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 16, R, S));
    }
}
