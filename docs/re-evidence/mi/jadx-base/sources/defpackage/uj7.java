package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.mi.health.course.eco.widget.LineChartView;

/* JADX INFO: loaded from: classes5.dex */
public class uj7 extends tj7 {
    public static final ViewDataBinding.i c0 = null;
    public static final SparseIntArray d0;
    public final ConstraintLayout a0;
    public long b0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        d0 = sparseIntArray;
        sparseIntArray.put(oqi.j1, 1);
        sparseIntArray.put(oqi.E1, 2);
        sparseIntArray.put(oqi.j, 3);
        sparseIntArray.put(oqi.L, 4);
        sparseIntArray.put(oqi.h1, 5);
        sparseIntArray.put(oqi.F0, 6);
        sparseIntArray.put(oqi.l1, 7);
        sparseIntArray.put(oqi.O, 8);
        sparseIntArray.put(oqi.M, 9);
        sparseIntArray.put(oqi.N, 10);
        sparseIntArray.put(oqi.e0, 11);
        sparseIntArray.put(oqi.f0, 12);
        sparseIntArray.put(oqi.n, 13);
        sparseIntArray.put(oqi.m, 14);
        sparseIntArray.put(oqi.x0, 15);
        sparseIntArray.put(oqi.y0, 16);
        sparseIntArray.put(oqi.z0, 17);
        sparseIntArray.put(oqi.A0, 18);
        sparseIntArray.put(oqi.B0, 19);
        sparseIntArray.put(oqi.i, 20);
        sparseIntArray.put(oqi.speed_view, 21);
        sparseIntArray.put(oqi.k1, 22);
        sparseIntArray.put(oqi.h, 23);
        sparseIntArray.put(oqi.e, 24);
        sparseIntArray.put(oqi.g, 25);
        sparseIntArray.put(oqi.K, 26);
    }

    public uj7(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[24], (ImageView) objArr[25], (ImageView) objArr[23], (TextView) objArr[20], (TextView) objArr[3], (LinearLayout) objArr[14], (TextView) objArr[13], (LottieAnimationView) objArr[26], (TextView) objArr[4], (LinearLayout) objArr[9], (LinearLayout) objArr[10], (ConstraintLayout) objArr[8], (ConstraintLayout) objArr[11], (TextView) objArr[12], (View) objArr[15], (View) objArr[16], (View) objArr[17], (View) objArr[18], (View) objArr[19], (ImageView) objArr[6], (LineChartView) objArr[21], (ConstraintLayout) objArr[1], (TextView) objArr[5], (ConstraintLayout) objArr[22], (TextView) objArr[7], (ConstraintLayout) objArr[2]);
        this.b0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.a0 = constraintLayout;
        constraintLayout.setTag(null);
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

    public uj7(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 27, c0, d0));
    }
}
