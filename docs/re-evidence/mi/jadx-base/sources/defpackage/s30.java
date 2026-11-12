package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import miuix.core.widget.NestedScrollView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes7.dex */
public class s30 extends r30 {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public final SpringBackLayout F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(vqi.d0, 1);
        sparseIntArray.put(vqi.n0, 2);
        sparseIntArray.put(vqi.k0, 3);
        sparseIntArray.put(vqi.l0, 4);
        sparseIntArray.put(vqi.m0, 5);
    }

    public s30(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (NestedScrollView) objArr[1], (RightArrowBindingSingleLineTextView) objArr[3], (RightArrowBindingSingleLineTextView) objArr[4], (RightArrowBindingSingleLineTextView) objArr[5], (RightArrowBindingSingleLineTextView) objArr[2]);
        this.G = -1L;
        SpringBackLayout springBackLayout = (SpringBackLayout) objArr[0];
        this.F = springBackLayout;
        springBackLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.G = 1L;
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
            this.G = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public s30(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 6, H, I));
    }
}
