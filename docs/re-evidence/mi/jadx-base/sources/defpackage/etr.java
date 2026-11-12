package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public class etr extends dtr {
    public static final ViewDataBinding.i E = null;
    public static final SparseIntArray F;
    public final FrameLayout C;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(psi.n, 1);
        sparseIntArray.put(psi.E, 2);
    }

    public etr(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 3, E, F));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.D = 1L;
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
            this.D = 0L;
        }
        if (this.A.g() != null) {
            ViewDataBinding.r(this.A.g());
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public etr(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, new ixq((ViewStub) objArr[1]), (RecyclerView) objArr[2]);
        this.D = -1L;
        this.A.j(this);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.C = frameLayout;
        frameLayout.setTag(null);
        o0(view);
        H();
    }
}
