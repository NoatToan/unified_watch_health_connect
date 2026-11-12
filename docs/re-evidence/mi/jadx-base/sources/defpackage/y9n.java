package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.xiaomi.fitness.baseui.widget.CarouselIndicator;
import com.xiaomi.fitness.widget.SlidableScrollView;

/* JADX INFO: loaded from: classes10.dex */
public class y9n extends x9n {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final ConstraintLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(xri.T5, 1);
        sparseIntArray.put(xri.r0, 2);
        sparseIntArray.put(xri.V, 3);
        sparseIntArray.put(xri.v8, 4);
        sparseIntArray.put(xri.t8, 5);
        sparseIntArray.put(xri.u0, 6);
        sparseIntArray.put(xri.d0, 7);
        sparseIntArray.put(xri.c0, 8);
        sparseIntArray.put(xri.y1, 9);
        sparseIntArray.put(xri.O, 10);
    }

    public y9n(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[10], (ConstraintLayout) objArr[3], (CheckBox) objArr[8], (LinearLayout) objArr[7], (ConstraintLayout) objArr[2], (TextView) objArr[6], (TextView) objArr[9], (SlidableScrollView) objArr[1], (ViewPager2) objArr[4], (CarouselIndicator) objArr[5]);
        this.L = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.K = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.L != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.L = 1L;
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
            this.L = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public y9n(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
