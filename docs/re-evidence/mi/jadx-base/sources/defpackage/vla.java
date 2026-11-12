package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public class vla extends ula {
    public static final ViewDataBinding.i P = null;
    public static final SparseIntArray Q;
    public final NestedScrollView N;
    public long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(eri.hb, 1);
        sparseIntArray.put(eri.zh, 2);
        sparseIntArray.put(eri.i3, 3);
        sparseIntArray.put(eri.Ah, 4);
        sparseIntArray.put(eri.j3, 5);
        sparseIntArray.put(eri.Bh, 6);
        sparseIntArray.put(eri.k3, 7);
        sparseIntArray.put(eri.Ch, 8);
        sparseIntArray.put(eri.l3, 9);
        sparseIntArray.put(eri.Dh, 10);
        sparseIntArray.put(eri.m3, 11);
        sparseIntArray.put(eri.Eh, 12);
        sparseIntArray.put(eri.n3, 13);
    }

    public vla(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[3], (TextView) objArr[5], (TextView) objArr[7], (TextView) objArr[9], (TextView) objArr[11], (TextView) objArr[13], (TextView) objArr[1], (TextView) objArr[2], (TextView) objArr[4], (TextView) objArr[6], (TextView) objArr[8], (TextView) objArr[10], (TextView) objArr[12]);
        this.O = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.N = nestedScrollView;
        nestedScrollView.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.O != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.O = 1L;
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
            this.O = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public vla(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 14, P, Q));
    }
}
