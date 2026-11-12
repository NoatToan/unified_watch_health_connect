package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import miuix.androidbasewidget.widget.ProgressBar;

/* JADX INFO: loaded from: classes10.dex */
public class fi extends ei {
    public static final ViewDataBinding.i d0 = null;
    public static final SparseIntArray e0;
    public final FrameLayout b0;
    public long c0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e0 = sparseIntArray;
        sparseIntArray.put(csi.d, 1);
        sparseIntArray.put(csi.e, 2);
        sparseIntArray.put(csi.m2, 3);
        sparseIntArray.put(csi.j1, 4);
        sparseIntArray.put(csi.k1, 5);
        sparseIntArray.put(csi.f3, 6);
        sparseIntArray.put(csi.g3, 7);
        sparseIntArray.put(csi.i1, 8);
        sparseIntArray.put(csi.h1, 9);
        sparseIntArray.put(csi.n1, 10);
        sparseIntArray.put(csi.o1, 11);
        sparseIntArray.put(csi.h3, 12);
        sparseIntArray.put(csi.i3, 13);
        sparseIntArray.put(csi.m1, 14);
        sparseIntArray.put(csi.l1, 15);
        sparseIntArray.put(csi.r1, 16);
        sparseIntArray.put(csi.s1, 17);
        sparseIntArray.put(csi.j3, 18);
        sparseIntArray.put(csi.k3, 19);
        sparseIntArray.put(csi.q1, 20);
        sparseIntArray.put(csi.p1, 21);
        sparseIntArray.put(csi.v1, 22);
        sparseIntArray.put(csi.w1, 23);
        sparseIntArray.put(csi.l3, 24);
        sparseIntArray.put(csi.m3, 25);
        sparseIntArray.put(csi.u1, 26);
        sparseIntArray.put(csi.t1, 27);
    }

    public fi(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (View) objArr[1], (View) objArr[2], (ImageView) objArr[9], (ImageView) objArr[8], (ConstraintLayout) objArr[4], (TextView) objArr[5], (ImageView) objArr[15], (ImageView) objArr[14], (ConstraintLayout) objArr[10], (TextView) objArr[11], (ImageView) objArr[21], (ImageView) objArr[20], (ConstraintLayout) objArr[16], (TextView) objArr[17], (ImageView) objArr[27], (ImageView) objArr[26], (ConstraintLayout) objArr[22], (TextView) objArr[23], (ProgressBar) objArr[3], (View) objArr[6], (View) objArr[7], (View) objArr[12], (View) objArr[13], (View) objArr[18], (View) objArr[19], (View) objArr[24], (View) objArr[25]);
        this.c0 = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.b0 = frameLayout;
        frameLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.c0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.c0 = 1L;
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
            this.c0 = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public fi(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 28, d0, e0));
    }
}
