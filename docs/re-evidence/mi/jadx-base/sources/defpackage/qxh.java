package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes7.dex */
public class qxh extends pxh {
    public static final ViewDataBinding.i D;
    public static final SparseIntArray E;
    public final FrameLayout B;
    public long C;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(2);
        D = iVar;
        iVar.a(0, new String[]{"pk_layout_user_active_goal"}, new int[]{1}, new int[]{bui.q});
        E = null;
    }

    public qxh(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (ryh) objArr[1]);
        this.C = -1L;
        k0(this.A);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.B = frameLayout;
        frameLayout.setTag(null);
        o0(view);
        H();
    }

    private boolean C0(ryh ryhVar, int i) {
        if (i != yv1.f40598a) {
            return false;
        }
        synchronized (this) {
            this.C |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.C != 0) {
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
            this.C = 2L;
        }
        this.A.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return C0((ryh) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.A.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.C = 0L;
        }
        ViewDataBinding.r(this.A);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public qxh(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 2, D, E));
    }
}
