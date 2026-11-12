package defpackage;

import android.util.SparseIntArray;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.ViewDataBinding;
import com.mi.health.course.widget.CircleProgressBar;
import com.mi.health.course.widget.CourseLayout;

/* JADX INFO: loaded from: classes5.dex */
public class wm4 extends vm4 {
    public static final ViewDataBinding.i c0 = null;
    public static final SparseIntArray d0;
    public long b0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        d0 = sparseIntArray;
        sparseIntArray.put(oqi.S0, 1);
        sparseIntArray.put(oqi.n0, 2);
        sparseIntArray.put(oqi.u1, 3);
        sparseIntArray.put(oqi.V0, 4);
        sparseIntArray.put(oqi.M, 5);
        sparseIntArray.put(oqi.r2, 6);
        sparseIntArray.put(oqi.i1, 7);
        sparseIntArray.put(oqi.J0, 8);
        sparseIntArray.put(oqi.I0, 9);
        sparseIntArray.put(oqi.H0, 10);
        sparseIntArray.put(oqi.f29393r, 11);
        sparseIntArray.put(oqi.O0, 12);
        sparseIntArray.put(oqi.P0, 13);
        sparseIntArray.put(oqi.U0, 14);
        sparseIntArray.put(oqi.M0, 15);
        sparseIntArray.put(oqi.p1, 16);
        sparseIntArray.put(oqi.q1, 17);
        sparseIntArray.put(oqi.H, 18);
        sparseIntArray.put(oqi.v, 19);
        sparseIntArray.put(oqi.w, 20);
        sparseIntArray.put(oqi.u, 21);
        sparseIntArray.put(oqi.t, 22);
        sparseIntArray.put(oqi.q, 23);
        sparseIntArray.put(oqi.E0, 24);
        sparseIntArray.put(oqi.m1, 25);
        sparseIntArray.put(oqi.K0, 26);
    }

    public wm4(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[23], (View) objArr[11], (TextView) objArr[22], (TextView) objArr[21], (View) objArr[19], (TextView) objArr[20], (ImageView) objArr[18], (CourseLayout) objArr[0], (LinearLayout) objArr[5], (ConstraintLayout) objArr[2], (ImageView) objArr[24], (View) objArr[10], (Group) objArr[8], (View) objArr[9], (View) objArr[26], (ImageView) objArr[15], (Group) objArr[12], (ImageView) objArr[13], (SurfaceView) objArr[1], (ImageView) objArr[14], (CircleProgressBar) objArr[4], (ImageView) objArr[7], (TextView) objArr[25], (Group) objArr[16], (ImageView) objArr[17], (TextView) objArr[3], (ImageView) objArr[6]);
        this.b0 = -1L;
        this.H.setTag(null);
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

    public wm4(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 27, c0, d0));
    }
}
