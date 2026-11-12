package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.relative.home.RelativeDataHeaderView;
import com.xiaomi.fitness.relative.home.RelativeHealthTitleView;
import com.xiaomi.fitness.relative.home.RelativeHomeHeaderView;
import com.xiaomi.fitness.view.DataEmptyView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes9.dex */
public class xaa extends waa {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final FrameLayout H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(eri.Mh, 1);
        sparseIntArray.put(eri.Le, 2);
        sparseIntArray.put(eri.E2, 3);
        sparseIntArray.put(eri.pd, 4);
        sparseIntArray.put(eri.fj, 5);
        sparseIntArray.put(eri.D2, 6);
        sparseIntArray.put(eri.C4, 7);
    }

    public xaa(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (RelativeHomeHeaderView) objArr[6], (RelativeDataHeaderView) objArr[3], (DataEmptyView) objArr[7], (RecyclerView) objArr[4], (NestedScrollView) objArr[2], (SpringBackLayout) objArr[1], (RelativeHealthTitleView) objArr[5]);
        this.I = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.H = frameLayout;
        frameLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.I != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.I = 1L;
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
            this.I = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public xaa(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 8, J, K));
    }
}
