package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes2.dex */
public class ptr extends otr {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H;
    public final FrameLayout E;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(psi.h, 1);
        sparseIntArray.put(psi.u, 2);
        sparseIntArray.put(psi.f30708b, 3);
        sparseIntArray.put(psi.z, 4);
    }

    public ptr(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (AppCompatButton) objArr[3], (LinearLayout) objArr[1], (AppCompatButton) objArr[2], new ixq((ViewStub) objArr[4]));
        this.F = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.E = frameLayout;
        frameLayout.setTag(null);
        this.D.j(this);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.F != 0;
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
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.F = 0L;
        }
        if (this.D.g() != null) {
            ViewDataBinding.r(this.D.g());
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public ptr(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 5, G, H));
    }
}
