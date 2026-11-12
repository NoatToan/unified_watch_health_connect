package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.view.DataTitleView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class bna extends ViewDataBinding {
    public final DataTitleView A;
    public final xde B;
    public final LineChartRecyclerView C;
    public final LinearLayout D;

    public bna(Object obj, View view, int i, DataTitleView dataTitleView, xde xdeVar, LineChartRecyclerView lineChartRecyclerView, LinearLayout linearLayout) {
        super(obj, view, i);
        this.A = dataTitleView;
        this.B = xdeVar;
        this.C = lineChartRecyclerView;
        this.D = linearLayout;
    }
}
