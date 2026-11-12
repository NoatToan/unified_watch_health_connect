package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.view.DataTitleView;
import com.xiaomi.fitness.view.TitleBarAlphaView;

/* JADX INFO: loaded from: classes9.dex */
public class xca extends wca {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public final LinearLayout G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(eri.dj, 2);
        sparseIntArray.put(eri.H2, 3);
        sparseIntArray.put(eri.g0, 4);
        sparseIntArray.put(eri.in, 5);
        sparseIntArray.put(eri.hn, 6);
    }

    public xca(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (BarChartRecyclerView) objArr[4], (DataTitleView) objArr[3], (LinearLayout) objArr[1], (TitleBarAlphaView) objArr[2], (TextView) objArr[6], (TextView) objArr[5]);
        this.H = -1L;
        this.C.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.G = linearLayout;
        linearLayout.setTag(null);
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

    public xca(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, I, J));
    }
}
