package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes9.dex */
public class lca extends kca {
    public static final ViewDataBinding.i G;
    public static final SparseIntArray H;
    public final m8e D;
    public final m8e E;
    public long F;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(5);
        G = iVar;
        iVar.a(1, new String[]{"layout_edit_sleep_record"}, new int[]{3}, new int[]{jui.Z6});
        iVar.a(2, new String[]{"layout_edit_sleep_record"}, new int[]{4}, new int[]{jui.Z6});
        H = null;
    }

    public lca(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (CardView) objArr[1], (NestedScrollView) objArr[0], (CardView) objArr[2]);
        this.F = -1L;
        this.A.setTag(null);
        m8e m8eVar = (m8e) objArr[3];
        this.D = m8eVar;
        k0(m8eVar);
        m8e m8eVar2 = (m8e) objArr[4];
        this.E = m8eVar2;
        k0(m8eVar2);
        this.B.setTag(null);
        this.C.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.F != 0) {
                    return true;
                }
                return this.D.F() || this.E.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.F = 1L;
        }
        this.D.H();
        this.E.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.D.l0(lifecycleOwner);
        this.E.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.F = 0L;
        }
        ViewDataBinding.r(this.D);
        ViewDataBinding.r(this.E);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public lca(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 5, G, H));
    }
}
