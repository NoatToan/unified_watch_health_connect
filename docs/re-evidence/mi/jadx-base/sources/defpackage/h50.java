package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.widget.view.DividerView;
import miuix.androidbasewidget.widget.ProgressBar;

/* JADX INFO: loaded from: classes7.dex */
public class h50 extends g50 {
    public static final ViewDataBinding.i Q;
    public static final SparseIntArray R;
    public final ConstraintLayout O;
    public long P;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(15);
        Q = iVar;
        iVar.a(1, new String[]{"access_suunto_include_layout"}, new int[]{2}, new int[]{aui.m});
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(vqi.X, 3);
        sparseIntArray.put(vqi.M, 4);
        sparseIntArray.put(vqi.C, 5);
        sparseIntArray.put(vqi.j0, 6);
        sparseIntArray.put(vqi.x, 7);
        sparseIntArray.put(vqi.p, 8);
        sparseIntArray.put(vqi.v0, 9);
        sparseIntArray.put(vqi.n, 10);
        sparseIntArray.put(vqi.Q, 11);
        sparseIntArray.put(vqi.a0, 12);
        sparseIntArray.put(vqi.N, 13);
        sparseIntArray.put(vqi.q, 14);
    }

    public h50(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (TextView) objArr[10], (ConstraintLayout) objArr[8], (TextView) objArr[14], (LinearLayout) objArr[1], (TextView) objArr[7], (DividerView) objArr[5], (ImageView) objArr[4], (TextView) objArr[13], (ProgressBar) objArr[11], (ConstraintLayout) objArr[3], (ConstraintLayout) objArr[12], (z50) objArr[2], (AppCompatTextView) objArr[6], (TextView) objArr[9]);
        this.P = -1L;
        this.D.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.O = constraintLayout;
        constraintLayout.setTag(null);
        k0(this.L);
        o0(view);
        H();
    }

    public final boolean A0(z50 z50Var, int i) {
        if (i != xv1.f39496a) {
            return false;
        }
        synchronized (this) {
            this.P |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.P != 0) {
                    return true;
                }
                return this.L.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.P = 2L;
        }
        this.L.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((z50) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.L.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.P = 0L;
        }
        ViewDataBinding.r(this.L);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public h50(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 15, Q, R));
    }
}
