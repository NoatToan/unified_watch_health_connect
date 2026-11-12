package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.xiaomi.fitness.sport_eco.ftp.FtpChartView;

/* JADX INFO: loaded from: classes10.dex */
public class ml0 extends ll0 {
    public static final ViewDataBinding.i m0 = null;
    public static final SparseIntArray n0;
    public final ConstraintLayout k0;
    public long l0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        n0 = sparseIntArray;
        sparseIntArray.put(zri.o2, 1);
        sparseIntArray.put(zri.g, 2);
        sparseIntArray.put(zri.D, 3);
        sparseIntArray.put(zri.h2, 4);
        sparseIntArray.put(zri.Z0, 5);
        sparseIntArray.put(zri.A2, 6);
        sparseIntArray.put(zri.z2, 7);
        sparseIntArray.put(zri.course_relativelayout, 8);
        sparseIntArray.put(zri.L1, 9);
        sparseIntArray.put(zri.N0, 10);
        sparseIntArray.put(zri.s1, 11);
        sparseIntArray.put(zri.f41605r, 12);
        sparseIntArray.put(zri.R2, 13);
        sparseIntArray.put(zri.N2, 14);
        sparseIntArray.put(zri.y0, 15);
        sparseIntArray.put(zri.course_textview2, 16);
        sparseIntArray.put(zri.p, 17);
        sparseIntArray.put(zri.o, 18);
        sparseIntArray.put(zri.Q0, 19);
        sparseIntArray.put(zri.R0, 20);
        sparseIntArray.put(zri.S0, 21);
        sparseIntArray.put(zri.T0, 22);
        sparseIntArray.put(zri.U0, 23);
        sparseIntArray.put(zri.course_imageview, 24);
        sparseIntArray.put(zri.course_textview, 25);
        sparseIntArray.put(zri.C, 26);
        sparseIntArray.put(zri.f, 27);
        sparseIntArray.put(zri.speed_view, 28);
        sparseIntArray.put(zri.g0, 29);
        sparseIntArray.put(zri.h0, 30);
        sparseIntArray.put(zri.i0, 31);
        sparseIntArray.put(zri.j0, 32);
        sparseIntArray.put(zri.w2, 33);
        sparseIntArray.put(zri.e, 34);
        sparseIntArray.put(zri.c, 35);
        sparseIntArray.put(zri.d, 36);
    }

    public ml0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[35], (ImageView) objArr[36], (ImageView) objArr[34], (TextView) objArr[27], (TextView) objArr[2], (LinearLayout) objArr[18], (TextView) objArr[17], (TextView) objArr[12], (LottieAnimationView) objArr[26], (ImageView) objArr[24], (ConstraintLayout) objArr[8], (TextView) objArr[25], (TextView) objArr[16], (TextView) objArr[3], (TextView) objArr[29], (TextView) objArr[30], (TextView) objArr[31], (TextView) objArr[32], (TextView) objArr[15], (TextView) objArr[10], (View) objArr[19], (View) objArr[20], (View) objArr[21], (View) objArr[22], (View) objArr[23], (ImageView) objArr[5], (TextView) objArr[11], (TextView) objArr[9], (FtpChartView) objArr[28], (ConstraintLayout) objArr[1], (TextView) objArr[4], (ConstraintLayout) objArr[33], (TextView) objArr[7], (TextView) objArr[6], (TextView) objArr[14], (TextView) objArr[13]);
        this.l0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.k0 = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.l0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.l0 = 1L;
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
            this.l0 = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public ml0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 37, m0, n0));
    }
}
