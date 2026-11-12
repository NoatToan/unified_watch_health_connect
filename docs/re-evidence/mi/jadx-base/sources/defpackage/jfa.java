package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.widget.SportDetailItemView;
import com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChart;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;

/* JADX INFO: loaded from: classes10.dex */
public class jfa extends ifa {
    public static final ViewDataBinding.i L;
    public static final SparseIntArray M;
    public final LinearLayout J;
    public long K;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(10);
        L = iVar;
        iVar.a(0, new String[]{"layout_sport_rate_floating"}, new int[]{1}, new int[]{ivi.f1});
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(bsi.U0, 2);
        sparseIntArray.put(bsi.o5, 3);
        sparseIntArray.put(bsi.Y2, 4);
        sparseIntArray.put(bsi.k1, 5);
        sparseIntArray.put(bsi.l1, 6);
        sparseIntArray.put(bsi.E, 7);
        sparseIntArray.put(bsi.e3, 8);
        sparseIntArray.put(bsi.p5, 9);
    }

    public jfa(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (CustomLineChart) objArr[7], (DataTitleSimpleView) objArr[2], (SportDetailItemView) objArr[5], (SportDetailItemView) objArr[6], (LinearLayout) objArr[4], (AppCompatImageView) objArr[8], (dde) objArr[1], (RecyclerView) objArr[3], (RecyclerView) objArr[9]);
        this.K = -1L;
        k0(this.G);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.J = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    public final boolean C0(dde ddeVar, int i) {
        if (i != qv1.f31871a) {
            return false;
        }
        synchronized (this) {
            this.K |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.K != 0) {
                    return true;
                }
                return this.G.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.K = 2L;
        }
        this.G.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return C0((dde) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.G.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.K = 0L;
        }
        ViewDataBinding.r(this.G);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public jfa(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 10, L, M));
    }
}
