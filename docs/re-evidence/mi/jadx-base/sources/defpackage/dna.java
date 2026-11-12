package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.view.DataTitleView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class dna extends ViewDataBinding {
    public final DataTitleView A;
    public final LineChartRecyclerView B;

    public dna(Object obj, View view, int i, DataTitleView dataTitleView, LineChartRecyclerView lineChartRecyclerView) {
        super(obj, view, i);
        this.A = dataTitleView;
        this.B = lineChartRecyclerView;
    }
}
