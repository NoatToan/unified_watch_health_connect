package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes7.dex */
public class gxh extends fxh {
    public static final ViewDataBinding.i R = null;
    public static final SparseIntArray S;
    public final RelativeLayout P;
    public long Q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(wqi.f38257k, 1);
        sparseIntArray.put(wqi.f38255a, 2);
        sparseIntArray.put(wqi.O0, 3);
        sparseIntArray.put(wqi.C1, 4);
        sparseIntArray.put(wqi.K, 5);
        sparseIntArray.put(wqi.L, 6);
        sparseIntArray.put(wqi.O, 7);
        sparseIntArray.put(wqi.P, 8);
        sparseIntArray.put(wqi.H, 9);
        sparseIntArray.put(wqi.i1, 10);
        sparseIntArray.put(wqi.o1, 11);
        sparseIntArray.put(wqi.E1, 12);
        sparseIntArray.put(wqi.J, 13);
        sparseIntArray.put(wqi.x0, 14);
        sparseIntArray.put(wqi.i0, 15);
    }

    public gxh(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (AppBarLayout) objArr[2], (CoordinatorLayout) objArr[1], (ImageView) objArr[9], (ImageView) objArr[13], (RoundImageView) objArr[5], (TextView) objArr[6], (RoundImageView) objArr[7], (TextView) objArr[8], (TextView) objArr[15], (RecyclerView) objArr[14], (RelativeLayout) objArr[3], (TextView) objArr[10], (TextView) objArr[11], (View) objArr[4], (TextView) objArr[12]);
        this.Q = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.P = relativeLayout;
        relativeLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.Q != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.Q = 1L;
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
            this.Q = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public gxh(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 16, R, S));
    }
}
