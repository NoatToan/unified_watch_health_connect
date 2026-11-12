package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public class jca extends ica {
    public static final ViewDataBinding.i Y = null;
    public static final SparseIntArray Z;
    public final NestedScrollView W;
    public long X;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Z = sparseIntArray;
        sparseIntArray.put(eri.O1, 1);
        sparseIntArray.put(eri.v8, 2);
        sparseIntArray.put(eri.ek, 3);
        sparseIntArray.put(eri.ra, 4);
        sparseIntArray.put(eri.w, 5);
        sparseIntArray.put(eri.X8, 6);
        sparseIntArray.put(eri.bn, 7);
        sparseIntArray.put(eri.J8, 8);
        sparseIntArray.put(eri.Gk, 9);
        sparseIntArray.put(eri.K8, 10);
        sparseIntArray.put(eri.Hk, 11);
        sparseIntArray.put(eri.L8, 12);
        sparseIntArray.put(eri.Ik, 13);
        sparseIntArray.put(eri.M8, 14);
        sparseIntArray.put(eri.Jk, 15);
        sparseIntArray.put(eri.N8, 16);
        sparseIntArray.put(eri.Kk, 17);
        sparseIntArray.put(eri.O8, 18);
        sparseIntArray.put(eri.Lk, 19);
        sparseIntArray.put(eri.P8, 20);
        sparseIntArray.put(eri.Mk, 21);
        sparseIntArray.put(eri.ql, 22);
    }

    public jca(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (RecyclerView) objArr[5], (ConstraintLayout) objArr[1], (AppCompatImageView) objArr[2], (AppCompatImageView) objArr[8], (AppCompatImageView) objArr[10], (AppCompatImageView) objArr[12], (AppCompatImageView) objArr[14], (AppCompatImageView) objArr[16], (AppCompatImageView) objArr[18], (AppCompatImageView) objArr[20], (AppCompatImageView) objArr[6], (RecyclerView) objArr[4], (TextView) objArr[3], (TextView) objArr[9], (TextView) objArr[11], (TextView) objArr[13], (TextView) objArr[15], (TextView) objArr[17], (TextView) objArr[19], (TextView) objArr[21], (TextView) objArr[22], (TextView) objArr[7]);
        this.X = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.W = nestedScrollView;
        nestedScrollView.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.X != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.X = 1L;
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
            this.X = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public jca(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 23, Y, Z));
    }
}
