package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.health.sleep.interfere.report.charts.NapDurationBarChart;
import com.xiaomi.fitness.health.sleep.interfere.report.charts.SleepInterfereLineChartView;
import com.xiaomi.fitness.health.sleep.interfere.report.charts.SleepInterfereReportChartCompareInfoView;

/* JADX INFO: loaded from: classes9.dex */
public class lom extends kom {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final LinearLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(eri.of, 1);
        sparseIntArray.put(eri.nf, 2);
        sparseIntArray.put(eri.pf, 3);
        sparseIntArray.put(eri.mf, 4);
        sparseIntArray.put(eri.ec, 5);
        sparseIntArray.put(eri.fc, 6);
        sparseIntArray.put(eri.Q, 7);
        sparseIntArray.put(eri.hc, 8);
        sparseIntArray.put(eri.gc, 9);
    }

    public lom(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[7], (SleepInterfereReportChartCompareInfoView) objArr[5], (SleepInterfereLineChartView) objArr[6], (NapDurationBarChart) objArr[9], (SleepInterfereReportChartCompareInfoView) objArr[8], (AppCompatTextView) objArr[4], (ImageView) objArr[2], (LinearLayout) objArr[1], (AppCompatTextView) objArr[3]);
        this.K = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.J = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
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
            this.K = 1L;
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
            this.K = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public lom(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 10, L, M));
    }
}
