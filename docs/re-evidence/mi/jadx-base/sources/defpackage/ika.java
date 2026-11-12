package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.xiaomi.fitness.view.CustomCoordinatorLayout;
import com.xiaomi.fitness.view.TitleBarAlphaView;

/* JADX INFO: loaded from: classes9.dex */
public class ika extends hka {
    public static final ViewDataBinding.i F = null;
    public static final SparseIntArray G;
    public final CustomCoordinatorLayout D;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(eri.G, 1);
        sparseIntArray.put(eri.dj, 2);
        sparseIntArray.put(eri.h5, 3);
    }

    public ika(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (AppBarLayout) objArr[1], (FrameLayout) objArr[3], (TitleBarAlphaView) objArr[2]);
        this.E = -1L;
        CustomCoordinatorLayout customCoordinatorLayout = (CustomCoordinatorLayout) objArr[0];
        this.D = customCoordinatorLayout;
        customCoordinatorLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.E != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.E = 1L;
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
            this.E = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public ika(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 4, F, G));
    }
}
