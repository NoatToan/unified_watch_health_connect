package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.electronic.scale.widget.sliding.BodyIndexSlidingViewV2;

/* JADX INFO: loaded from: classes8.dex */
public class kj0 extends jj0 {
    public static final ViewDataBinding.i Q = null;
    public static final SparseIntArray R;
    public final FrameLayout O;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(bri.w7, 1);
        sparseIntArray.put(bri.d, 2);
        sparseIntArray.put(bri.C0, 3);
        sparseIntArray.put(bri.A0, 4);
        sparseIntArray.put(bri.c4, 5);
        sparseIntArray.put(bri.x7, 6);
        sparseIntArray.put(bri.r3, 7);
        sparseIntArray.put(bri.p3, 8);
        sparseIntArray.put(bri.b3, 9);
        sparseIntArray.put(bri.f3, 10);
        sparseIntArray.put(bri.c3, 11);
        sparseIntArray.put(bri.d3, 12);
        sparseIntArray.put(bri.g3, 13);
        sparseIntArray.put(bri.e3, 14);
    }

    public kj0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ConstraintLayout) objArr[2], (TextView) objArr[4], (TextView) objArr[3], (TextView) objArr[9], (BodyIndexSlidingViewV2) objArr[11], (ImageView) objArr[12], (TextView) objArr[14], (RelativeLayout) objArr[10], (TextView) objArr[13], (TextView) objArr[8], (TextView) objArr[7], (TextView) objArr[5], (RelativeLayout) objArr[1], (ConstraintLayout) objArr[6]);
        this.P = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.O = frameLayout;
        frameLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.P != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.P = 1L;
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
            this.P = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public kj0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 15, Q, R));
    }
}
