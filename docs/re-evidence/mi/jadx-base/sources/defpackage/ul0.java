package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.xiaomi.fitness.sport_eco.ftp.view.ColorfulRingProgressView;
import com.xiaomi.fitness.sport_eco.view.widget.CircularProgressLayout;

/* JADX INFO: loaded from: classes10.dex */
public class ul0 extends tl0 {
    public static final ViewDataBinding.i d0 = null;
    public static final SparseIntArray e0;
    public long c0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e0 = sparseIntArray;
        sparseIntArray.put(zri.o2, 1);
        sparseIntArray.put(zri.b1, 2);
        sparseIntArray.put(zri.g, 3);
        sparseIntArray.put(zri.h2, 4);
        sparseIntArray.put(zri.Z0, 5);
        sparseIntArray.put(zri.p, 6);
        sparseIntArray.put(zri.n, 7);
        sparseIntArray.put(zri.course_relativelayout, 8);
        sparseIntArray.put(zri.t1, 9);
        sparseIntArray.put(zri.s1, 10);
        sparseIntArray.put(zri.S2, 11);
        sparseIntArray.put(zri.L1, 12);
        sparseIntArray.put(zri.s, 13);
        sparseIntArray.put(zri.f41605r, 14);
        sparseIntArray.put(zri.O2, 15);
        sparseIntArray.put(zri.m0, 16);
        sparseIntArray.put(zri.k0, 17);
        sparseIntArray.put(zri.l0, 18);
        sparseIntArray.put(zri.n0, 19);
        sparseIntArray.put(zri.w2, 20);
        sparseIntArray.put(zri.b0, 21);
        sparseIntArray.put(zri.W, 22);
        sparseIntArray.put(zri.V, 23);
        sparseIntArray.put(zri.X, 24);
        sparseIntArray.put(zri.c, 25);
        sparseIntArray.put(zri.d, 26);
        sparseIntArray.put(zri.C, 27);
    }

    public ul0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[25], (ImageView) objArr[26], (TextView) objArr[3], (TextView) objArr[7], (TextView) objArr[6], (TextView) objArr[14], (LinearLayout) objArr[13], (ConstraintLayout) objArr[0], (LottieAnimationView) objArr[27], (ConstraintLayout) objArr[8], (CircularProgressLayout) objArr[23], (ImageView) objArr[22], (ImageView) objArr[24], (FrameLayout) objArr[21], (ColorfulRingProgressView) objArr[17], (LinearLayout) objArr[18], (ConstraintLayout) objArr[16], (TextView) objArr[19], (ImageView) objArr[5], (LinearLayout) objArr[2], (TextView) objArr[10], (LinearLayout) objArr[9], (TextView) objArr[12], (ConstraintLayout) objArr[1], (TextView) objArr[4], (ConstraintLayout) objArr[20], (TextView) objArr[15], (TextView) objArr[11]);
        this.c0 = -1L;
        this.H.setTag(null);
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

    public ul0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 28, d0, e0));
    }
}
