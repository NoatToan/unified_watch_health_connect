package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import miuix.miuixbasewidget.widget.FilterSortView;

/* JADX INFO: loaded from: classes9.dex */
public class snb extends rnb {
    public static final ViewDataBinding.i E = null;
    public static final SparseIntArray F;
    public final LinearLayoutCompat C;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(eri.c5, 1);
        sparseIntArray.put(eri.V1, 2);
    }

    public snb(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (FrameLayout) objArr[2], (FilterSortView) objArr[1]);
        this.D = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.C = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        o0(view);
        H();
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
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public snb(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 3, E, F));
    }
}
