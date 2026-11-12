package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.mi.health.course.eco.widget.JumpLineChartView;
import com.mi.health.course.widget.LineChartView;

/* JADX INFO: loaded from: classes5.dex */
public class sj7 extends rj7 {
    public static final ViewDataBinding.i a0 = null;
    public static final SparseIntArray b0;
    public final ConstraintLayout Y;
    public long Z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        b0 = sparseIntArray;
        sparseIntArray.put(oqi.j1, 1);
        sparseIntArray.put(oqi.j, 2);
        sparseIntArray.put(oqi.L, 3);
        sparseIntArray.put(oqi.h1, 4);
        sparseIntArray.put(oqi.F0, 5);
        sparseIntArray.put(oqi.l1, 6);
        sparseIntArray.put(oqi.M, 7);
        sparseIntArray.put(oqi.f0, 8);
        sparseIntArray.put(oqi.o, 9);
        sparseIntArray.put(oqi.n, 10);
        sparseIntArray.put(oqi.m, 11);
        sparseIntArray.put(oqi.x0, 12);
        sparseIntArray.put(oqi.y0, 13);
        sparseIntArray.put(oqi.z0, 14);
        sparseIntArray.put(oqi.A0, 15);
        sparseIntArray.put(oqi.B0, 16);
        sparseIntArray.put(oqi.i, 17);
        sparseIntArray.put(oqi.speed_view, 18);
        sparseIntArray.put(oqi.w0, 19);
        sparseIntArray.put(oqi.k1, 20);
        sparseIntArray.put(oqi.h, 21);
        sparseIntArray.put(oqi.e, 22);
        sparseIntArray.put(oqi.g, 23);
        sparseIntArray.put(oqi.K, 24);
    }

    public sj7(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[22], (ImageView) objArr[23], (ImageView) objArr[21], (TextView) objArr[17], (TextView) objArr[2], (LinearLayout) objArr[11], (TextView) objArr[10], (TextView) objArr[9], (LottieAnimationView) objArr[24], (TextView) objArr[3], (LinearLayout) objArr[7], (TextView) objArr[8], (JumpLineChartView) objArr[19], (View) objArr[12], (View) objArr[13], (View) objArr[14], (View) objArr[15], (View) objArr[16], (ImageView) objArr[5], (LineChartView) objArr[18], (ConstraintLayout) objArr[1], (TextView) objArr[4], (ConstraintLayout) objArr[20], (TextView) objArr[6]);
        this.Z = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.Y = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.Z != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.Z = 1L;
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
            this.Z = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public sj7(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 25, a0, b0));
    }
}
