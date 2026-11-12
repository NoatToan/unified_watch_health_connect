package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;

/* JADX INFO: loaded from: classes9.dex */
public class tba extends sba {
    public static final ViewDataBinding.i a0 = null;
    public static final SparseIntArray b0;
    public long Z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        b0 = sparseIntArray;
        sparseIntArray.put(eri.Q3, 1);
        sparseIntArray.put(eri.nd, 2);
        sparseIntArray.put(eri.ya, 3);
        sparseIntArray.put(eri.U7, 4);
        sparseIntArray.put(eri.T7, 5);
        sparseIntArray.put(eri.s, 6);
        sparseIntArray.put(eri.f16998r, 7);
        sparseIntArray.put(eri.yb, 8);
        sparseIntArray.put(eri.mp, 9);
        sparseIntArray.put(eri.kp, 10);
        sparseIntArray.put(eri.np, 11);
        sparseIntArray.put(eri.Tf, 12);
        sparseIntArray.put(eri.Rf, 13);
        sparseIntArray.put(eri.Sf, 14);
        sparseIntArray.put(eri.Jf, 15);
        sparseIntArray.put(eri.Kf, 16);
        sparseIntArray.put(eri.Lf, 17);
        sparseIntArray.put(eri.q6, 18);
        sparseIntArray.put(eri.p6, 19);
        sparseIntArray.put(eri.Of, 20);
        sparseIntArray.put(eri.Pf, 21);
        sparseIntArray.put(eri.Qf, 22);
        sparseIntArray.put(eri.u6, 23);
        sparseIntArray.put(eri.t6, 24);
    }

    public tba(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[7], (TextView) objArr[6], (RightArrowSingleLineTextView) objArr[1], (TextView) objArr[19], (TextView) objArr[18], (TextView) objArr[24], (TextView) objArr[23], (RightArrowSingleLineTextView) objArr[5], (RightArrowSingleLineTextView) objArr[4], (RightArrowSingleLineTextView) objArr[3], (RecyclerView) objArr[8], (RightArrowSingleLineTextView) objArr[2], (NestedScrollView) objArr[0], (TextView) objArr[15], (TextView) objArr[16], (RecyclerView) objArr[17], (TextView) objArr[20], (TextView) objArr[21], (RecyclerView) objArr[22], (ImageView) objArr[13], (RecyclerView) objArr[14], (TextView) objArr[12], (ImageView) objArr[10], (TextView) objArr[9], (RecyclerView) objArr[11]);
        this.Z = -1L;
        this.M.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.Z != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.Z = 1L;
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
            this.Z = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public tba(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 25, a0, b0));
    }
}
