package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.mpchart.barchart.CustomBarChart;
import com.xiaomi.fitness.homepage.viewholder.XAxisView;

/* JADX INFO: loaded from: classes9.dex */
public class n7e extends m7e {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(eri.O7, 1);
        sparseIntArray.put(eri.ad, 2);
        sparseIntArray.put(eri.Zc, 3);
        sparseIntArray.put(eri.Yc, 4);
        sparseIntArray.put(eri.Cn, 5);
        sparseIntArray.put(eri.f0, 6);
        sparseIntArray.put(eri.c, 7);
    }

    public n7e(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LinearLayoutCompat) objArr[0], (XAxisView) objArr[7], (CustomBarChart) objArr[6], (ImageView) objArr[1], (ImageView) objArr[4], (TextView) objArr[3], (TextView) objArr[2], (TextView) objArr[5]);
        this.I = -1L;
        this.A.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.I != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.I = 1L;
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
            this.I = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public n7e(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 8, J, K));
    }
}
