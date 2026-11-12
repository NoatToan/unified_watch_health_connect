package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public class wna extends vna {
    public static final ViewDataBinding.i G;
    public static final SparseIntArray H;
    public final LinearLayout E;
    public long F;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(5);
        G = iVar;
        iVar.a(0, new String[]{"common_switch_header"}, new int[]{1}, new int[]{jui.common_switch_header});
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(eri.y1, 2);
        sparseIntArray.put(eri.jb, 3);
        sparseIntArray.put(eri.w3, 4);
    }

    public wna(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (LineChartRecyclerView) objArr[2], (RecyclerView) objArr[4], (j84) objArr[1], (RecyclerView) objArr[3]);
        this.F = -1L;
        k0(this.C);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.E = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    public final boolean C0(j84 j84Var, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.F |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.F != 0) {
                    return true;
                }
                return this.C.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.F = 2L;
        }
        this.C.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return C0((j84) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.C.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.F = 0L;
        }
        ViewDataBinding.r(this.C);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public wna(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 5, G, H));
    }
}
