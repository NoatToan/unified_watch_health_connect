package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.view.DataTitleView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class pna extends ViewDataBinding {
    public final LinearLayout A;
    public final DataTitleView B;
    public final uzb C;
    public final LineChartRecyclerView D;

    public pna(Object obj, View view, int i, LinearLayout linearLayout, DataTitleView dataTitleView, uzb uzbVar, LineChartRecyclerView lineChartRecyclerView) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = dataTitleView;
        this.C = uzbVar;
        this.D = lineChartRecyclerView;
    }
}
