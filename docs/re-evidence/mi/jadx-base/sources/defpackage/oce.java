package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public class oce extends nce {
    public static final ViewDataBinding.i F;
    public static final SparseIntArray G;
    public final LinearLayout D;
    public long E;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(4);
        F = iVar;
        iVar.a(0, new String[]{"layout_common_icon_title"}, new int[]{1}, new int[]{jui.v6});
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(eri.R, 2);
        sparseIntArray.put(eri.pd, 3);
    }

    public oce(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (TextView) objArr[2], (a7e) objArr[1], (LineChartRecyclerView) objArr[3]);
        this.E = -1L;
        k0(this.B);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.D = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    private boolean A0(a7e a7eVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.E |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.E != 0) {
                    return true;
                }
                return this.B.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.E = 2L;
        }
        this.B.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((a7e) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.B.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.E = 0L;
        }
        ViewDataBinding.r(this.B);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public oce(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 4, F, G));
    }
}
