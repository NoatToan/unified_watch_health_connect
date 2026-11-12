package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public class fzb extends ezb {
    public static final ViewDataBinding.i T = null;
    public static final SparseIntArray U;
    public final LinearLayoutCompat R;
    public long S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        U = sparseIntArray;
        sparseIntArray.put(eri.rg, 1);
        sparseIntArray.put(eri.pg, 2);
        sparseIntArray.put(eri.og, 3);
        sparseIntArray.put(eri.ng, 4);
        sparseIntArray.put(eri.mg, 5);
        sparseIntArray.put(eri.lg, 6);
        sparseIntArray.put(eri.kg, 7);
        sparseIntArray.put(eri.qg, 8);
        sparseIntArray.put(eri.sg, 9);
        sparseIntArray.put(eri.zg, 10);
        sparseIntArray.put(eri.M6, 11);
        sparseIntArray.put(eri.L6, 12);
        sparseIntArray.put(eri.K6, 13);
        sparseIntArray.put(eri.i6, 14);
        sparseIntArray.put(eri.g6, 15);
        sparseIntArray.put(eri.r6, 16);
        sparseIntArray.put(eri.v6, 17);
    }

    public fzb(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[15], (TextView) objArr[14], (TextView) objArr[16], (TextView) objArr[17], (RecyclerView) objArr[13], (TextView) objArr[12], (ConstraintLayout) objArr[11], (RecyclerView) objArr[7], (TextView) objArr[6], (ConstraintLayout) objArr[5], (RecyclerView) objArr[4], (TextView) objArr[3], (ConstraintLayout) objArr[2], (TextView) objArr[8], (TextView) objArr[1], (TextView) objArr[9], (TextView) objArr[10]);
        this.S = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.R = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.S != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.S = 1L;
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
            this.S = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public fzb(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 18, T, U));
    }
}
