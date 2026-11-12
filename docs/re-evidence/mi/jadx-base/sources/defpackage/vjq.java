package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes10.dex */
public class vjq extends ujq {
    public static final ViewDataBinding.i E;
    public static final SparseIntArray F;
    public final FrameLayout C;
    public long D;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(3);
        E = iVar;
        iVar.a(0, new String[]{"userinfo_layout_aid_record_detail"}, new int[]{2}, new int[]{nvi.x});
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(hsi.d, 1);
    }

    public vjq(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (hkq) objArr[2], (View) objArr[1]);
        this.D = -1L;
        k0(this.A);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.C = frameLayout;
        frameLayout.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(hkq hkqVar, int i) {
        if (i != sv1.f34012a) {
            return false;
        }
        synchronized (this) {
            this.D |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.D != 0) {
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
            this.D = 2L;
        }
        this.A.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((hkq) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.A.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.D = 0L;
        }
        ViewDataBinding.r(this.A);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public vjq(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 3, E, F));
    }
}
