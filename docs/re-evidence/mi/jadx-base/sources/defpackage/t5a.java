package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.view.DataTitleView;
import com.xiaomi.fitness.view.DispatchMaskDownLinearLayout;

/* JADX INFO: loaded from: classes9.dex */
public abstract class t5a extends ViewDataBinding {
    public final BarChartRecyclerView A;
    public final DataTitleView B;
    public final DispatchMaskDownLinearLayout C;
    public final LinearLayout D;
    public final LineChartRecyclerView E;
    public final z8e F;

    public t5a(Object obj, View view, int i, BarChartRecyclerView barChartRecyclerView, DataTitleView dataTitleView, DispatchMaskDownLinearLayout dispatchMaskDownLinearLayout, LinearLayout linearLayout, LineChartRecyclerView lineChartRecyclerView, z8e z8eVar) {
        super(obj, view, i);
        this.A = barChartRecyclerView;
        this.B = dataTitleView;
        this.C = dispatchMaskDownLinearLayout;
        this.D = linearLayout;
        this.E = lineChartRecyclerView;
        this.F = z8eVar;
    }
}
