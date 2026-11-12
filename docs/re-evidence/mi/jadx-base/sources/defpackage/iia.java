package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.view.DataTitleView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class iia extends ViewDataBinding {
    public final DataTitleView A;
    public final BarChartRecyclerView B;

    public iia(Object obj, View view, int i, DataTitleView dataTitleView, BarChartRecyclerView barChartRecyclerView) {
        super(obj, view, i);
        this.A = dataTitleView;
        this.B = barChartRecyclerView;
    }
}
