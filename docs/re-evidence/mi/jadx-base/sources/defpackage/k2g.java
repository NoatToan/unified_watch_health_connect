package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes9.dex */
public class k2g extends i2g {
    public static final ViewDataBinding.i G;
    public static final SparseIntArray H;
    public long F;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(5);
        G = iVar;
        int i = rui.s;
        iVar.a(0, new String[]{"mine_medal_entrance_medal_item", "mine_medal_entrance_medal_item", "mine_medal_entrance_medal_item", "mine_medal_entrance_medal_item"}, new int[]{1, 2, 3, 4}, new int[]{i, i, i, i});
        H = null;
    }

    public k2g(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 4, (e2g) objArr[1], (e2g) objArr[2], (e2g) objArr[3], (e2g) objArr[4], (LinearLayout) objArr[0]);
        this.F = -1L;
        k0(this.A);
        k0(this.B);
        k0(this.C);
        k0(this.D);
        this.E.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(e2g e2gVar, int i) {
        if (i != gv1.f19359a) {
            return false;
        }
        synchronized (this) {
            this.F |= 2;
        }
        return true;
    }

    public final boolean B0(e2g e2gVar, int i) {
        if (i != gv1.f19359a) {
            return false;
        }
        synchronized (this) {
            this.F |= 1;
        }
        return true;
    }

    public final boolean C0(e2g e2gVar, int i) {
        if (i != gv1.f19359a) {
            return false;
        }
        synchronized (this) {
            this.F |= 8;
        }
        return true;
    }

    public final boolean D0(e2g e2gVar, int i) {
        if (i != gv1.f19359a) {
            return false;
        }
        synchronized (this) {
            this.F |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.F != 0) {
                    return true;
                }
                return this.A.F() || this.B.F() || this.C.F() || this.D.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.F = 16L;
        }
        this.A.H();
        this.B.H();
        this.C.H();
        this.D.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return B0((e2g) obj, i2);
        }
        if (i == 1) {
            return A0((e2g) obj, i2);
        }
        if (i == 2) {
            return D0((e2g) obj, i2);
        }
        if (i != 3) {
            return false;
        }
        return C0((e2g) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.A.l0(lifecycleOwner);
        this.B.l0(lifecycleOwner);
        this.C.l0(lifecycleOwner);
        this.D.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.F = 0L;
        }
        ViewDataBinding.r(this.A);
        ViewDataBinding.r(this.B);
        ViewDataBinding.r(this.C);
        ViewDataBinding.r(this.D);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public k2g(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 5, G, H));
    }
}
