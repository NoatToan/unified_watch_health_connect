package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.widget.SportDetailItemView;
import com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChart;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;

/* JADX INFO: loaded from: classes10.dex */
public class hfa extends ffa {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final LinearLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(bsi.U0, 1);
        sparseIntArray.put(bsi.Y2, 2);
        sparseIntArray.put(bsi.h1, 3);
        sparseIntArray.put(bsi.i1, 4);
        sparseIntArray.put(bsi.E, 5);
        sparseIntArray.put(bsi.e3, 6);
        sparseIntArray.put(bsi.p5, 7);
    }

    public hfa(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (CustomLineChart) objArr[5], (DataTitleSimpleView) objArr[1], (SportDetailItemView) objArr[3], (SportDetailItemView) objArr[4], (LinearLayout) objArr[2], (AppCompatImageView) objArr[6], null, (RecyclerView) objArr[7]);
        this.J = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.I = linearLayout;
        linearLayout.setTag(null);
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

    public hfa(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 8, K, L));
    }
}
