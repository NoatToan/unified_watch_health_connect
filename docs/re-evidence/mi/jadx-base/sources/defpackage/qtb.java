package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.flexbox.FlexboxLayout;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.health.curse.view.HealthCurseSignView;
import com.xiaomi.fitness.view.TemperatureTrendEmptyView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class qtb extends ViewDataBinding {
    public final HealthCurseSignView A;
    public final FlexboxLayout B;
    public final TextView C;
    public final ConstraintLayout D;
    public final TextView E;
    public final LinearLayout F;
    public final TextView G;
    public final LinearLayout H;
    public final TextView I;
    public final TextView J;
    public final LinearLayout K;
    public final LineChartRecyclerView L;
    public final HealthCurseSignView M;
    public final TemperatureTrendEmptyView N;
    public final HealthCurseSignView O;
    public final HealthCurseSignView P;

    public qtb(Object obj, View view, int i, HealthCurseSignView healthCurseSignView, FlexboxLayout flexboxLayout, TextView textView, ConstraintLayout constraintLayout, TextView textView2, LinearLayout linearLayout, TextView textView3, LinearLayout linearLayout2, TextView textView4, TextView textView5, LinearLayout linearLayout3, LineChartRecyclerView lineChartRecyclerView, HealthCurseSignView healthCurseSignView2, TemperatureTrendEmptyView temperatureTrendEmptyView, HealthCurseSignView healthCurseSignView3, HealthCurseSignView healthCurseSignView4) {
        super(obj, view, i);
        this.A = healthCurseSignView;
        this.B = flexboxLayout;
        this.C = textView;
        this.D = constraintLayout;
        this.E = textView2;
        this.F = linearLayout;
        this.G = textView3;
        this.H = linearLayout2;
        this.I = textView4;
        this.J = textView5;
        this.K = linearLayout3;
        this.L = lineChartRecyclerView;
        this.M = healthCurseSignView2;
        this.N = temperatureTrendEmptyView;
        this.O = healthCurseSignView3;
        this.P = healthCurseSignView4;
    }
}
