package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.mpchart.linechart.DataCubicLineChart;
import com.xiaomi.fitness.homepage.viewholder.XAxisView;
import com.xiaomi.fitness.v2.view.HomeCardCommonTitleView;

/* JADX INFO: loaded from: classes9.dex */
public class v7e extends u7e {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H;
    public final LinearLayoutCompat E;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(eri.p1, 1);
        sparseIntArray.put(eri.B4, 2);
        sparseIntArray.put(eri.za, 3);
        sparseIntArray.put(eri.Dp, 4);
    }

    public v7e(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (HomeCardCommonTitleView) objArr[1], (View) objArr[2], (DataCubicLineChart) objArr[3], (XAxisView) objArr[4]);
        this.F = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.E = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
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

    public v7e(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 5, G, H));
    }
}
