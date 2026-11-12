package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public class owb extends nwb {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final NestedScrollView I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(eri.N6, 1);
        sparseIntArray.put(eri.R4, 2);
        sparseIntArray.put(eri.f7, 3);
        sparseIntArray.put(eri.cj, 4);
        sparseIntArray.put(eri.xh, 5);
        sparseIntArray.put(eri.Y3, 6);
        sparseIntArray.put(eri.S2, 7);
        sparseIntArray.put(eri.kc, 8);
    }

    public owb(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[7], (View) objArr[6], (RelativeLayout) objArr[2], (TextView) objArr[1], (ImageView) objArr[3], (RecyclerView) objArr[8], (TextView) objArr[5], (TextView) objArr[4]);
        this.J = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.I = nestedScrollView;
        nestedScrollView.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.J != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.J = 1L;
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
            this.J = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public owb(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
