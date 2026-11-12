package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.chart.view.ScrollChartRecycleView;
import com.xiaomi.fitness.view.DataTitleView;

/* JADX INFO: loaded from: classes9.dex */
public class tja extends sja {
    public static final ViewDataBinding.i Q;
    public static final SparseIntArray R;
    public long P;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(15);
        Q = iVar;
        iVar.a(0, new String[]{"layout_stress_dwm_common"}, new int[]{1}, new int[]{jui.U7});
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(eri.g0, 2);
        sparseIntArray.put(eri.H2, 3);
        sparseIntArray.put(eri.C7, 4);
        sparseIntArray.put(eri.Kn, 5);
        sparseIntArray.put(eri.U5, 6);
        sparseIntArray.put(eri.Y5, 7);
        sparseIntArray.put(eri.T5, 8);
        sparseIntArray.put(eri.X5, 9);
        sparseIntArray.put(eri.V5, 10);
        sparseIntArray.put(eri.Z5, 11);
        sparseIntArray.put(eri.S5, 12);
        sparseIntArray.put(eri.W5, 13);
        sparseIntArray.put(eri.wh, 14);
    }

    public tja(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (BarChartRecyclerView) objArr[2], (DataTitleView) objArr[3], (AppCompatImageView) objArr[12], (AppCompatImageView) objArr[8], (AppCompatImageView) objArr[6], (AppCompatImageView) objArr[10], (TextView) objArr[13], (TextView) objArr[9], (TextView) objArr[7], (TextView) objArr[11], (ImageView) objArr[4], (lde) objArr[1], (LinearLayout) objArr[0], (ScrollChartRecycleView) objArr[14], (TextView) objArr[5]);
        this.P = -1L;
        k0(this.L);
        this.M.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(lde ldeVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.P |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.P != 0) {
                    return true;
                }
                return this.L.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.P = 2L;
        }
        this.L.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((lde) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.L.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.P = 0L;
        }
        ViewDataBinding.r(this.L);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public tja(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 15, Q, R));
    }
}
