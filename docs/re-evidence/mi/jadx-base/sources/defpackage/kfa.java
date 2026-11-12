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
public class kfa extends ifa {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final LinearLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(bsi.U0, 1);
        sparseIntArray.put(bsi.Y2, 2);
        sparseIntArray.put(bsi.k1, 3);
        sparseIntArray.put(bsi.l1, 4);
        sparseIntArray.put(bsi.E, 5);
        sparseIntArray.put(bsi.e3, 6);
        sparseIntArray.put(bsi.p5, 7);
    }

    public kfa(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (CustomLineChart) objArr[5], (DataTitleSimpleView) objArr[1], (SportDetailItemView) objArr[3], (SportDetailItemView) objArr[4], (LinearLayout) objArr[2], (AppCompatImageView) objArr[6], null, null, (RecyclerView) objArr[7]);
        this.K = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.J = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    private boolean C0(dde ddeVar, int i) {
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
                return this.K != 0;
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
    public void o() {
        synchronized (this) {
            this.K = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public kfa(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 8, L, M));
    }
}
