package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes9.dex */
public class b3a extends a3a {
    public static final ViewDataBinding.i O = null;
    public static final SparseIntArray P;
    public long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(eri.ke, 1);
        sparseIntArray.put(eri.D8, 2);
        sparseIntArray.put(eri.sk, 3);
        sparseIntArray.put(eri.tk, 4);
        sparseIntArray.put(eri.pe, 5);
        sparseIntArray.put(eri.g9, 6);
        sparseIntArray.put(eri.hm, 7);
        sparseIntArray.put(eri.im, 8);
        sparseIntArray.put(eri.oe, 9);
        sparseIntArray.put(eri.a9, 10);
        sparseIntArray.put(eri.Il, 11);
        sparseIntArray.put(eri.Jl, 12);
    }

    public b3a(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[2], (ImageView) objArr[10], (ImageView) objArr[6], (RelativeLayout) objArr[1], (RelativeLayout) objArr[9], (RelativeLayout) objArr[5], (NestedScrollView) objArr[0], (TextView) objArr[3], (TextView) objArr[4], (TextView) objArr[11], (TextView) objArr[12], (TextView) objArr[7], (TextView) objArr[8]);
        this.N = -1L;
        this.G.setTag(null);
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

    public b3a(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 13, O, P));
    }
}
