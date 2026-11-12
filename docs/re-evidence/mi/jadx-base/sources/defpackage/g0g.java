package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.widget.ScrollTitleBar;
import com.xiaomi.fitness.mine.MineViewModel;
import com.xiaomi.fitness.widget.RightArrowBindingTwoLineTextView;
import com.xiaomi.fitness.widget.view.HomeHeaderView;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes9.dex */
public class g0g extends f0g {
    public static final ViewDataBinding.i o0 = null;
    public static final SparseIntArray p0;
    public final ConstraintLayout m0;
    public long n0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        p0 = sparseIntArray;
        sparseIntArray.put(lri.T0, 1);
        sparseIntArray.put(lri.v0, 2);
        sparseIntArray.put(lri.w0, 3);
        sparseIntArray.put(lri.r0, 4);
        sparseIntArray.put(lri.W, 5);
        sparseIntArray.put(lri.Y, 6);
        sparseIntArray.put(lri.q1, 7);
        sparseIntArray.put(lri.y, 8);
        sparseIntArray.put(lri.p1, 9);
        sparseIntArray.put(lri.i1, 10);
        sparseIntArray.put(lri.X, 11);
        sparseIntArray.put(lri.h0, 12);
        sparseIntArray.put(lri.l0, 13);
        sparseIntArray.put(lri.i0, 14);
        sparseIntArray.put(lri.k0, 15);
        sparseIntArray.put(lri.U, 16);
        sparseIntArray.put(lri.D, 17);
        sparseIntArray.put(lri.f25378b, 18);
        sparseIntArray.put(lri.x0, 19);
        sparseIntArray.put(lri.R0, 20);
        sparseIntArray.put(lri.u1, 21);
        sparseIntArray.put(lri.T, 22);
        sparseIntArray.put(lri.d, 23);
        sparseIntArray.put(lri.course_mine, 24);
        sparseIntArray.put(lri.y0, 25);
        sparseIntArray.put(lri.S, 26);
        sparseIntArray.put(lri.L0, 27);
        sparseIntArray.put(lri.M0, 28);
        sparseIntArray.put(lri.J, 29);
        sparseIntArray.put(lri.n, 30);
        sparseIntArray.put(lri.G, 31);
        sparseIntArray.put(lri.H, 32);
        sparseIntArray.put(lri.U0, 33);
        sparseIntArray.put(lri.Z0, 34);
        sparseIntArray.put(lri.r1, 35);
        sparseIntArray.put(lri.f25377a, 36);
        sparseIntArray.put(lri.c1, 37);
    }

    public g0g(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (RightArrowBindingTwoLineTextView) objArr[36], (RightArrowBindingTwoLineTextView) objArr[18], (RightArrowBindingTwoLineTextView) objArr[23], (RightArrowBindingTwoLineTextView) objArr[30], (ImageView) objArr[8], (RightArrowBindingTwoLineTextView) objArr[17], (RightArrowBindingTwoLineTextView) objArr[24], (RightArrowBindingTwoLineTextView) objArr[32], (RightArrowBindingTwoLineTextView) objArr[31], (View) objArr[29], (RightArrowBindingTwoLineTextView) objArr[26], (RightArrowBindingTwoLineTextView) objArr[22], (AppCompatImageView) objArr[16], (ConstraintLayout) objArr[5], (ConstraintLayout) objArr[11], (ConstraintLayout) objArr[6], (ImageView) objArr[12], (View) objArr[14], (TextView) objArr[15], (AppCompatTextView) objArr[13], (HomeHeaderView) objArr[4], (View) objArr[2], (View) objArr[3], (RightArrowBindingTwoLineTextView) objArr[19], (RightArrowBindingTwoLineTextView) objArr[25], (RightArrowBindingTwoLineTextView) objArr[27], (RightArrowBindingTwoLineTextView) objArr[28], (RightArrowBindingTwoLineTextView) objArr[20], (NestedScrollView) objArr[1], (RightArrowBindingTwoLineTextView) objArr[33], (RightArrowBindingTwoLineTextView) objArr[34], (ScrollTitleBar) objArr[37], (TextView) objArr[10], (TextView) objArr[9], (RoundImageView) objArr[7], (RightArrowBindingTwoLineTextView) objArr[35], (RightArrowBindingTwoLineTextView) objArr[21]);
        this.n0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.m0 = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    public void A0(MineViewModel mineViewModel) {
        this.l0 = mineViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.n0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.n0 = 2L;
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
            this.n0 = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (gv1.f19360b != i) {
            return false;
        }
        A0((MineViewModel) obj);
        return true;
    }

    public g0g(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 38, o0, p0));
    }
}
