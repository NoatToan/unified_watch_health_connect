package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.health.sleep.view.wm.SleepRegularView;
import com.xiaomi.fitness.view.DataTitleView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class uca extends ViewDataBinding {
    public final rbe A;
    public final LinearLayout B;
    public final TextView C;
    public final DataTitleView D;
    public final BarChartRecyclerView E;
    public final DataTitleView F;
    public final BarChartRecyclerView G;
    public final LinearLayout H;
    public final LinearLayout I;
    public final LinearLayout J;
    public final LinearLayout K;
    public final RecyclerView L;
    public final LinearLayout M;
    public final SleepRegularView N;
    public final DataTitleView O;
    public final BarChartRecyclerView P;

    public uca(Object obj, View view, int i, rbe rbeVar, LinearLayout linearLayout, TextView textView, DataTitleView dataTitleView, BarChartRecyclerView barChartRecyclerView, DataTitleView dataTitleView2, BarChartRecyclerView barChartRecyclerView2, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, RecyclerView recyclerView, LinearLayout linearLayout6, SleepRegularView sleepRegularView, DataTitleView dataTitleView3, BarChartRecyclerView barChartRecyclerView3) {
        super(obj, view, i);
        this.A = rbeVar;
        this.B = linearLayout;
        this.C = textView;
        this.D = dataTitleView;
        this.E = barChartRecyclerView;
        this.F = dataTitleView2;
        this.G = barChartRecyclerView2;
        this.H = linearLayout2;
        this.I = linearLayout3;
        this.J = linearLayout4;
        this.K = linearLayout5;
        this.L = recyclerView;
        this.M = linearLayout6;
        this.N = sleepRegularView;
        this.O = dataTitleView3;
        this.P = barChartRecyclerView3;
    }
}
