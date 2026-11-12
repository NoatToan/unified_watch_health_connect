package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes9.dex */
public class sce extends rce {
    public static final ViewDataBinding.i L;
    public static final SparseIntArray M;
    public final LinearLayout J;
    public long K;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(10);
        L = iVar;
        iVar.a(0, new String[]{"layout_common_icon_title"}, new int[]{1}, new int[]{jui.v6});
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(eri.lk, 2);
        sparseIntArray.put(eri.tm, 3);
        sparseIntArray.put(eri.sm, 4);
        sparseIntArray.put(eri.rm, 5);
        sparseIntArray.put(eri.Pa, 6);
        sparseIntArray.put(eri.vl, 7);
        sparseIntArray.put(eri.pk, 8);
        sparseIntArray.put(eri.Xa, 9);
    }

    public sce(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (a7e) objArr[1], (LinearLayout) objArr[6], (LinearLayout) objArr[9], (TextView) objArr[2], (TextView) objArr[8], (TextView) objArr[7], (TextView) objArr[5], (TextView) objArr[4], (TextView) objArr[3]);
        this.K = -1L;
        k0(this.A);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.J = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(a7e a7eVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.K |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.K != 0) {
                    return true;
                }
                return this.A.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.K = 2L;
        }
        this.A.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((a7e) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.A.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.K = 0L;
        }
        ViewDataBinding.r(this.A);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public sce(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 10, L, M));
    }
}
