package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.xiaomi.fitness.view.TitleBarAlphaView;

/* JADX INFO: loaded from: classes9.dex */
public class tub extends sub {
    public static final ViewDataBinding.i K;
    public static final SparseIntArray L;
    public final LinearLayout H;
    public final LinearLayout I;
    public long J;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(9);
        K = iVar;
        iVar.a(1, new String[]{"health_layout_ecg_analyze_entrance"}, new int[]{2}, new int[]{jui.m4});
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(eri.dj, 3);
        sparseIntArray.put(eri.H, 4);
        sparseIntArray.put(eri.gj, 5);
        sparseIntArray.put(eri.b5, 6);
        sparseIntArray.put(eri.Ol, 7);
        sparseIntArray.put(eri.t4, 8);
    }

    public tub(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (AppBarLayout) objArr[4], (uxb) objArr[2], (RecyclerView) objArr[8], (AppCompatTextView) objArr[6], (TitleBarAlphaView) objArr[3], (ConstraintLayout) objArr[5], (AppCompatTextView) objArr[7]);
        this.J = -1L;
        k0(this.B);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.H = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[1];
        this.I = linearLayout2;
        linearLayout2.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(uxb uxbVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.J |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.J != 0) {
                    return true;
                }
                return this.B.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.J = 2L;
        }
        this.B.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((uxb) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.B.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.J = 0L;
        }
        ViewDataBinding.r(this.B);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public tub(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
