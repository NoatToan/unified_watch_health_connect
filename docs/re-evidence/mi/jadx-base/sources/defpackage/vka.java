package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.health.temperature.ui.TemperatureDataTitleView;
import com.xiaomi.fitness.view.CardUnderstandView;
import com.xiaomi.fitness.view.TemperatureTrendEmptyView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class vka extends ViewDataBinding {
    public final TemperatureDataTitleView A;
    public final BarChartRecyclerView B;
    public final RecyclerView C;
    public final View D;
    public final FrameLayout E;
    public final TextView F;
    public final TextView G;
    public final TemperatureTrendEmptyView H;
    public final FrameLayout I;
    public final LineChartRecyclerView J;
    public final TextView K;
    public final LinearLayout L;
    public final LinearLayout M;
    public final CardUnderstandView N;

    public vka(Object obj, View view, int i, TemperatureDataTitleView temperatureDataTitleView, BarChartRecyclerView barChartRecyclerView, RecyclerView recyclerView, View view2, FrameLayout frameLayout, TextView textView, TextView textView2, TemperatureTrendEmptyView temperatureTrendEmptyView, FrameLayout frameLayout2, LineChartRecyclerView lineChartRecyclerView, TextView textView3, LinearLayout linearLayout, LinearLayout linearLayout2, CardUnderstandView cardUnderstandView) {
        super(obj, view, i);
        this.A = temperatureDataTitleView;
        this.B = barChartRecyclerView;
        this.C = recyclerView;
        this.D = view2;
        this.E = frameLayout;
        this.F = textView;
        this.G = textView2;
        this.H = temperatureTrendEmptyView;
        this.I = frameLayout2;
        this.J = lineChartRecyclerView;
        this.K = textView3;
        this.L = linearLayout;
        this.M = linearLayout2;
        this.N = cardUnderstandView;
    }
}
