package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.mi.health.course.widget.HeartRateView;

/* JADX INFO: loaded from: classes5.dex */
public class sm4 extends rm4 {
    public static final ViewDataBinding.i Y = null;
    public static final SparseIntArray Z;
    public final ConstraintLayout W;
    public long X;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Z = sparseIntArray;
        sparseIntArray.put(oqi.j1, 1);
        sparseIntArray.put(oqi.j, 2);
        sparseIntArray.put(oqi.L, 3);
        sparseIntArray.put(oqi.h1, 4);
        sparseIntArray.put(oqi.F0, 5);
        sparseIntArray.put(oqi.l1, 6);
        sparseIntArray.put(oqi.M, 7);
        sparseIntArray.put(oqi.f0, 8);
        sparseIntArray.put(oqi.n, 9);
        sparseIntArray.put(oqi.m, 10);
        sparseIntArray.put(oqi.x0, 11);
        sparseIntArray.put(oqi.y0, 12);
        sparseIntArray.put(oqi.z0, 13);
        sparseIntArray.put(oqi.A0, 14);
        sparseIntArray.put(oqi.B0, 15);
        sparseIntArray.put(oqi.f, 16);
        sparseIntArray.put(oqi.g0, 17);
        sparseIntArray.put(oqi.k1, 18);
        sparseIntArray.put(oqi.h, 19);
        sparseIntArray.put(oqi.e, 20);
        sparseIntArray.put(oqi.g, 21);
        sparseIntArray.put(oqi.K, 22);
    }

    public sm4(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[20], (TextView) objArr[16], (ImageView) objArr[21], (ImageView) objArr[19], (TextView) objArr[2], (LinearLayout) objArr[10], (TextView) objArr[9], (LottieAnimationView) objArr[22], (TextView) objArr[3], (LinearLayout) objArr[7], (TextView) objArr[8], (HeartRateView) objArr[17], (View) objArr[11], (View) objArr[12], (View) objArr[13], (View) objArr[14], (View) objArr[15], (ImageView) objArr[5], (ConstraintLayout) objArr[1], (TextView) objArr[4], (ConstraintLayout) objArr[18], (TextView) objArr[6]);
        this.X = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.W = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.X != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.X = 1L;
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
            this.X = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public sm4(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 23, Y, Z));
    }
}
