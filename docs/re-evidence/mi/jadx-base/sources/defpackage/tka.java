package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.health.temperature.ui.TemperatureDataTitleView;
import com.xiaomi.fitness.view.CardUnderstandView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class tka extends ViewDataBinding {
    public final TemperatureDataTitleView A;
    public final BarChartRecyclerView B;
    public final RecyclerView C;
    public final View D;
    public final LinearLayout E;
    public final CardUnderstandView F;

    public tka(Object obj, View view, int i, TemperatureDataTitleView temperatureDataTitleView, BarChartRecyclerView barChartRecyclerView, RecyclerView recyclerView, View view2, LinearLayout linearLayout, CardUnderstandView cardUnderstandView) {
        super(obj, view, i);
        this.A = temperatureDataTitleView;
        this.B = barChartRecyclerView;
        this.C = recyclerView;
        this.D = view2;
        this.E = linearLayout;
        this.F = cardUnderstandView;
    }
}
