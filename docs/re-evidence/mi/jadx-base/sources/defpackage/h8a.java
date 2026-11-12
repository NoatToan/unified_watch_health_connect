package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public class h8a extends g8a {
    public static final ViewDataBinding.i E = null;
    public static final SparseIntArray F;
    public final NestedScrollView C;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(eri.g5, 1);
        sparseIntArray.put(eri.Ea, 2);
    }

    public h8a(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LinearLayoutCompat) objArr[1], (LineChartRecyclerView) objArr[2]);
        this.D = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.C = nestedScrollView;
        nestedScrollView.setTag(null);
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

    public h8a(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 3, E, F));
    }
}
