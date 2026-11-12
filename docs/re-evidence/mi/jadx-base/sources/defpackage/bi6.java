package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import miuix.core.widget.NestedScrollView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes8.dex */
public class bi6 extends ai6 {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H;
    public final SpringBackLayout E;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(zqi.M7, 1);
        sparseIntArray.put(zqi.m4, 2);
        sparseIntArray.put(zqi.n4, 3);
        sparseIntArray.put(zqi.j4, 4);
    }

    public bi6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (RightArrowTwoLineTextView) objArr[4], (RightArrowTwoLineTextView) objArr[2], (RightArrowTwoLineTextView) objArr[3], (NestedScrollView) objArr[1]);
        this.F = -1L;
        SpringBackLayout springBackLayout = (SpringBackLayout) objArr[0];
        this.E = springBackLayout;
        springBackLayout.setTag(null);
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
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public bi6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 5, G, H));
    }
}
