package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes8.dex */
public class j2g extends h2g {
    public static final ViewDataBinding.i F;
    public static final SparseIntArray G;
    public final LinearLayout D;
    public long E;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(4);
        F = iVar;
        int i = bvi.f4642b;
        iVar.a(0, new String[]{"mine_medal_entrance_medal_item", "mine_medal_entrance_medal_item", "mine_medal_entrance_medal_item"}, new int[]{1, 2, 3}, new int[]{i, i, i});
        G = null;
    }

    public j2g(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 3, (d2g) objArr[1], (d2g) objArr[2], (d2g) objArr[3]);
        this.E = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.D = linearLayout;
        linearLayout.setTag(null);
        k0(this.A);
        k0(this.B);
        k0(this.C);
        o0(view);
        H();
    }

    public final boolean A0(d2g d2gVar, int i) {
        if (i != mv1.f27240a) {
            return false;
        }
        synchronized (this) {
            this.E |= 2;
        }
        return true;
    }

    public final boolean B0(d2g d2gVar, int i) {
        if (i != mv1.f27240a) {
            return false;
        }
        synchronized (this) {
            this.E |= 1;
        }
        return true;
    }

    public final boolean C0(d2g d2gVar, int i) {
        if (i != mv1.f27240a) {
            return false;
        }
        synchronized (this) {
            this.E |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.E != 0) {
                    return true;
                }
                return this.A.F() || this.B.F() || this.C.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.E = 8L;
        }
        this.A.H();
        this.B.H();
        this.C.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return B0((d2g) obj, i2);
        }
        if (i == 1) {
            return A0((d2g) obj, i2);
        }
        if (i != 2) {
            return false;
        }
        return C0((d2g) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.A.l0(lifecycleOwner);
        this.B.l0(lifecycleOwner);
        this.C.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.E = 0L;
        }
        ViewDataBinding.r(this.A);
        ViewDataBinding.r(this.B);
        ViewDataBinding.r(this.C);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public j2g(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 4, F, G));
    }
}
