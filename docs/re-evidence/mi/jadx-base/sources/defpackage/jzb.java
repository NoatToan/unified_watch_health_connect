package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public class jzb extends izb {
    public static final ViewDataBinding.i O = null;
    public static final SparseIntArray P;
    public final LinearLayoutCompat M;
    public long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(eri.n6, 1);
        sparseIntArray.put(eri.o6, 2);
        sparseIntArray.put(eri.B6, 3);
        sparseIntArray.put(eri.m6, 4);
        sparseIntArray.put(eri.k6, 5);
        sparseIntArray.put(eri.j6, 6);
        sparseIntArray.put(eri.I6, 7);
        sparseIntArray.put(eri.H6, 8);
        sparseIntArray.put(eri.i6, 9);
        sparseIntArray.put(eri.h6, 10);
        sparseIntArray.put(eri.d6, 11);
        sparseIntArray.put(eri.f6, 12);
    }

    public jzb(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[11], (TextView) objArr[12], (TextView) objArr[10], (TextView) objArr[9], (TextView) objArr[6], (TextView) objArr[5], (RecyclerView) objArr[4], (TextView) objArr[1], (RecyclerView) objArr[2], (TextView) objArr[3], (RecyclerView) objArr[8], (TextView) objArr[7]);
        this.N = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.M = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.N != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.N = 1L;
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
            this.N = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public jzb(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 13, O, P));
    }
}
