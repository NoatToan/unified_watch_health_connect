package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes7.dex */
public class kxh extends jxh {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public final FrameLayout G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(wqi.j, 1);
        sparseIntArray.put(wqi.F0, 2);
        sparseIntArray.put(wqi.G0, 3);
        sparseIntArray.put(wqi.E0, 4);
        sparseIntArray.put(wqi.i0, 5);
        sparseIntArray.put(wqi.U, 6);
    }

    public kxh(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (NestedScrollView) objArr[1], (TextView) objArr[6], (TextView) objArr[5], (RecyclerView) objArr[4], (RecyclerView) objArr[2], (RecyclerView) objArr[3]);
        this.H = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.G = frameLayout;
        frameLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.H = 1L;
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
            this.H = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public kxh(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, I, J));
    }
}
