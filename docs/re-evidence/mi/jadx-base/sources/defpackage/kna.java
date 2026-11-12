package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes9.dex */
public class kna extends jna {
    public static final ViewDataBinding.i c0 = null;
    public static final SparseIntArray d0;
    public long b0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        d0 = sparseIntArray;
        sparseIntArray.put(eri.pe, 1);
        sparseIntArray.put(eri.g9, 2);
        sparseIntArray.put(eri.hm, 3);
        sparseIntArray.put(eri.im, 4);
        sparseIntArray.put(eri.se, 5);
        sparseIntArray.put(eri.r9, 6);
        sparseIntArray.put(eri.rn, 7);
        sparseIntArray.put(eri.sn, 8);
        sparseIntArray.put(eri.Fe, 9);
        sparseIntArray.put(eri.lo, 10);
        sparseIntArray.put(eri.A7, 11);
        sparseIntArray.put(eri.Ge, 12);
        sparseIntArray.put(eri.mo, 13);
        sparseIntArray.put(eri.I7, 14);
        sparseIntArray.put(eri.De, 15);
        sparseIntArray.put(eri.jo, 16);
        sparseIntArray.put(eri.w7, 17);
        sparseIntArray.put(eri.He, 18);
        sparseIntArray.put(eri.f16997no, 19);
        sparseIntArray.put(eri.J7, 20);
        sparseIntArray.put(eri.Ie, 21);
        sparseIntArray.put(eri.oo, 22);
        sparseIntArray.put(eri.R7, 23);
        sparseIntArray.put(eri.Ee, 24);
        sparseIntArray.put(eri.ko, 25);
        sparseIntArray.put(eri.x7, 26);
    }

    public kna(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[17], (ImageView) objArr[26], (ImageView) objArr[11], (ImageView) objArr[14], (ImageView) objArr[20], (ImageView) objArr[23], (ImageView) objArr[2], (ImageView) objArr[6], (RelativeLayout) objArr[1], (RelativeLayout) objArr[5], (RelativeLayout) objArr[15], (RelativeLayout) objArr[24], (RelativeLayout) objArr[9], (RelativeLayout) objArr[12], (RelativeLayout) objArr[18], (RelativeLayout) objArr[21], (NestedScrollView) objArr[0], (TextView) objArr[3], (TextView) objArr[4], (TextView) objArr[7], (TextView) objArr[8], (TextView) objArr[16], (TextView) objArr[25], (TextView) objArr[10], (TextView) objArr[13], (TextView) objArr[19], (TextView) objArr[22]);
        this.b0 = -1L;
        this.Q.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.b0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.b0 = 1L;
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
            this.b0 = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public kna(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 27, c0, d0));
    }
}
