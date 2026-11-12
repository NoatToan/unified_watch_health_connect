package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public class ean extends dan {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H;
    public final NestedScrollView E;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(xri.k8, 1);
        sparseIntArray.put(xri.d0, 2);
        sparseIntArray.put(xri.c0, 3);
        sparseIntArray.put(xri.q4, 4);
    }

    public ean(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (CheckBox) objArr[3], (LinearLayout) objArr[2], (TextView) objArr[4], (TextView) objArr[1]);
        this.F = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.E = nestedScrollView;
        nestedScrollView.setTag(null);
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

    public ean(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 5, G, H));
    }
}
