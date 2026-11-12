package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.mi.health.sport.CreateRouteMap;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes10.dex */
public class s9n extends r9n {
    public static final ViewDataBinding.i Y = null;
    public static final SparseIntArray Z;
    public final ConstraintLayout W;
    public long X;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Z = sparseIntArray;
        sparseIntArray.put(xri.v3, 1);
        sparseIntArray.put(xri.c, 2);
        sparseIntArray.put(xri.u, 3);
        sparseIntArray.put(xri.E7, 4);
        sparseIntArray.put(xri.j3, 5);
        sparseIntArray.put(xri.s5, 6);
        sparseIntArray.put(xri.n6, 7);
        sparseIntArray.put(xri.f4, 8);
        sparseIntArray.put(xri.r5, 9);
        sparseIntArray.put(xri.o8, 10);
        sparseIntArray.put(xri.u5, 11);
        sparseIntArray.put(xri.t5, 12);
        sparseIntArray.put(xri.e3, 13);
        sparseIntArray.put(xri.P3, 14);
        sparseIntArray.put(xri.x1, 15);
        sparseIntArray.put(xri.j5, 16);
        sparseIntArray.put(xri.l5, 17);
        sparseIntArray.put(xri.t1, 18);
        sparseIntArray.put(xri.start_running_btn, 19);
        sparseIntArray.put(xri.c4, 20);
        sparseIntArray.put(xri.d4, 21);
        sparseIntArray.put(xri.R1, 22);
    }

    public s9n(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ConstraintLayout) objArr[2], (CardView) objArr[3], (TextView) objArr[18], (DividerView) objArr[15], (Button) objArr[22], (DividerView) objArr[13], (CardView) objArr[5], (CreateRouteMap) objArr[1], (AppCompatTextView) objArr[14], (ConstraintLayout) objArr[20], (AppCompatTextView) objArr[21], (FrameLayout) objArr[8], (RelativeLayout) objArr[16], (TextView) objArr[17], (ConstraintLayout) objArr[9], (TextView) objArr[6], (TextView) objArr[12], (TextView) objArr[11], (TextView) objArr[7], (TextView) objArr[19], (ImageView) objArr[4], (ImageView) objArr[10]);
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

    public s9n(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 23, Y, Z));
    }
}
