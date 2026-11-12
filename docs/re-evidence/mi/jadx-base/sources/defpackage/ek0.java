package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import miuix.androidbasewidget.widget.ProgressBar;

/* JADX INFO: loaded from: classes8.dex */
public class ek0 extends dk0 {
    public static final ViewDataBinding.i T = null;
    public static final SparseIntArray U;
    public final FrameLayout R;
    public long S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        U = sparseIntArray;
        sparseIntArray.put(bri.n2, 1);
        sparseIntArray.put(bri.Q5, 2);
        sparseIntArray.put(bri.R5, 3);
        sparseIntArray.put(bri.D1, 4);
        sparseIntArray.put(bri.n5, 5);
        sparseIntArray.put(bri.m5, 6);
        sparseIntArray.put(bri.D5, 7);
        sparseIntArray.put(bri.l2, 8);
        sparseIntArray.put(bri.l5, 9);
        sparseIntArray.put(bri.E1, 10);
        sparseIntArray.put(bri.j2, 11);
        sparseIntArray.put(bri.j5, 12);
        sparseIntArray.put(bri.R2, 13);
        sparseIntArray.put(bri.k5, 14);
        sparseIntArray.put(bri.i2, 15);
        sparseIntArray.put(bri.p5, 16);
        sparseIntArray.put(bri.h4, 17);
    }

    public ek0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ScrollView) objArr[4], (LinearLayout) objArr[10], (LinearLayout) objArr[15], (LinearLayout) objArr[11], (RelativeLayout) objArr[8], (LinearLayout) objArr[1], (ProgressBar) objArr[13], (TextView) objArr[17], (TextView) objArr[12], (TextView) objArr[14], (TextView) objArr[9], (TextView) objArr[6], (TextView) objArr[5], (TextView) objArr[16], (TextView) objArr[7], (TextView) objArr[2], (TextView) objArr[3]);
        this.S = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.R = frameLayout;
        frameLayout.setTag(null);
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

    public ek0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 18, T, U));
    }
}
