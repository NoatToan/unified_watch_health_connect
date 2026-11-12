package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.active.pk.widget.PkBarChart;
import com.xiaomi.fitness.baseui.widget.ScrollTitleBar;

/* JADX INFO: loaded from: classes7.dex */
public class iyh extends hyh {
    public static final ViewDataBinding.i v0;
    public static final SparseIntArray w0;
    public final ConstraintLayout s0;
    public final ConstraintLayout t0;
    public long u0;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(46);
        v0 = iVar;
        int i = bui.h;
        iVar.a(1, new String[]{"pk_layout_arrow_single_line_text_view", "pk_layout_arrow_single_line_text_view"}, new int[]{4, 5}, new int[]{i, i});
        iVar.a(2, new String[]{"pk_layout_arrow_single_line_text_view"}, new int[]{3}, new int[]{bui.h});
        SparseIntArray sparseIntArray = new SparseIntArray();
        w0 = sparseIntArray;
        sparseIntArray.put(wqi.y0, 6);
        sparseIntArray.put(wqi.f, 7);
        sparseIntArray.put(wqi.C0, 8);
        sparseIntArray.put(wqi.p, 9);
        sparseIntArray.put(wqi.D, 10);
        sparseIntArray.put(wqi.I0, 11);
        sparseIntArray.put(wqi.P0, 12);
        sparseIntArray.put(wqi.B0, 13);
        sparseIntArray.put(wqi.y, 14);
        sparseIntArray.put(wqi.r0, 15);
        sparseIntArray.put(wqi.k0, 16);
        sparseIntArray.put(wqi.o0, 17);
        sparseIntArray.put(wqi.m0, 18);
        sparseIntArray.put(wqi.s0, 19);
        sparseIntArray.put(wqi.n0, 20);
        sparseIntArray.put(wqi.f0, 21);
        sparseIntArray.put(wqi.c0, 22);
        sparseIntArray.put(wqi.d0, 23);
        sparseIntArray.put(wqi.Z, 24);
        sparseIntArray.put(wqi.g0, 25);
        sparseIntArray.put(wqi.b0, 26);
        sparseIntArray.put(wqi.v, 27);
        sparseIntArray.put(wqi.q, 28);
        sparseIntArray.put(wqi.l, 29);
        sparseIntArray.put(wqi.B, 30);
        sparseIntArray.put(wqi.M0, 31);
        sparseIntArray.put(wqi.C, 32);
        sparseIntArray.put(wqi.l0, 33);
        sparseIntArray.put(wqi.p0, 34);
        sparseIntArray.put(wqi.j0, 35);
        sparseIntArray.put(wqi.X, 36);
        sparseIntArray.put(wqi.e0, 37);
        sparseIntArray.put(wqi.a0, 38);
        sparseIntArray.put(wqi.s, 39);
        sparseIntArray.put(wqi.t, 40);
        sparseIntArray.put(wqi.f38258r, 41);
        sparseIntArray.put(wqi.c, 42);
        sparseIntArray.put(wqi.q0, 43);
        sparseIntArray.put(wqi.e, 44);
        sparseIntArray.put(wqi.N0, 45);
    }

    public iyh(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 3, (PkBarChart) objArr[42], (View) objArr[44], (ImageView) objArr[7], (RelativeLayout) objArr[29], (TextView) objArr[9], (RelativeLayout) objArr[28], (AppCompatImageView) objArr[41], (AppCompatImageView) objArr[39], (TextView) objArr[40], (View) objArr[27], (RelativeLayout) objArr[14], (AppCompatImageView) objArr[30], (RelativeLayout) objArr[32], (ImageView) objArr[10], (RelativeLayout) objArr[36], (TextView) objArr[24], (TextView) objArr[38], (AppCompatImageView) objArr[26], (ImageView) objArr[22], (TextView) objArr[23], (AppCompatImageView) objArr[37], (RelativeLayout) objArr[21], (TextView) objArr[25], (TextView) objArr[35], (ImageView) objArr[16], (RelativeLayout) objArr[33], (TextView) objArr[18], (AppCompatImageView) objArr[20], (TextView) objArr[17], (AppCompatImageView) objArr[34], (RecyclerView) objArr[43], (RelativeLayout) objArr[15], (TextView) objArr[19], (byh) objArr[4], (RelativeLayout) objArr[6], (byh) objArr[3], (byh) objArr[5], (View) objArr[13], (TextView) objArr[8], (NestedScrollView) objArr[11], (RelativeLayout) objArr[2], (TextView) objArr[31], (ScrollTitleBar) objArr[45], (View) objArr[12]);
        this.u0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.s0 = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[1];
        this.t0 = constraintLayout2;
        constraintLayout2.setTag(null);
        k0(this.h0);
        k0(this.j0);
        k0(this.k0);
        this.o0.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(byh byhVar, int i) {
        if (i != yv1.f40598a) {
            return false;
        }
        synchronized (this) {
            this.u0 |= 4;
        }
        return true;
    }

    public final boolean B0(byh byhVar, int i) {
        if (i != yv1.f40598a) {
            return false;
        }
        synchronized (this) {
            this.u0 |= 1;
        }
        return true;
    }

    public final boolean C0(byh byhVar, int i) {
        if (i != yv1.f40598a) {
            return false;
        }
        synchronized (this) {
            this.u0 |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.u0 != 0) {
                    return true;
                }
                return this.j0.F() || this.h0.F() || this.k0.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.u0 = 8L;
        }
        this.j0.H();
        this.h0.H();
        this.k0.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return B0((byh) obj, i2);
        }
        if (i == 1) {
            return C0((byh) obj, i2);
        }
        if (i != 2) {
            return false;
        }
        return A0((byh) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.j0.l0(lifecycleOwner);
        this.h0.l0(lifecycleOwner);
        this.k0.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.u0 = 0L;
        }
        ViewDataBinding.r(this.j0);
        ViewDataBinding.r(this.h0);
        ViewDataBinding.r(this.k0);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public iyh(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 46, v0, w0));
    }
}
