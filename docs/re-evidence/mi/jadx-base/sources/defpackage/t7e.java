package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.chart.mpchart.linechart.DataCubicLineChart;
import com.xiaomi.fitness.homepage.viewholder.XAxisView;
import com.xiaomi.fitness.v2.view.HomeCardCommonTitleView;

/* JADX INFO: loaded from: classes9.dex */
public class t7e extends s7e {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public final LinearLayoutCompat G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(eri.p1, 1);
        sparseIntArray.put(eri.B4, 2);
        sparseIntArray.put(eri.za, 3);
        sparseIntArray.put(eri.ma, 4);
        sparseIntArray.put(eri.q8, 5);
        sparseIntArray.put(eri.Dp, 6);
    }

    public t7e(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (HomeCardCommonTitleView) objArr[1], (View) objArr[2], (AppCompatImageView) objArr[5], (LevelBarView) objArr[4], (DataCubicLineChart) objArr[3], (XAxisView) objArr[6]);
        this.H = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.G = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
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

    public t7e(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, I, J));
    }
}
