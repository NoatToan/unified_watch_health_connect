package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.health.bloodpressure.BloodPressureViewModel;
import miuix.miuixbasewidget.widget.FilterSortView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class h1f extends ViewDataBinding {
    public final BarChartRecyclerView A;
    public final FilterSortView B;
    public final gkr C;
    public BloodPressureViewModel D;

    public h1f(Object obj, View view, int i, BarChartRecyclerView barChartRecyclerView, FilterSortView filterSortView, gkr gkrVar) {
        super(obj, view, i);
        this.A = barChartRecyclerView;
        this.B = filterSortView;
        this.C = gkrVar;
    }
}
