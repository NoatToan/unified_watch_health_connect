package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class uyb extends ViewDataBinding {
    public final BarChartRecyclerView A;
    public final LinearLayout B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;

    public uyb(Object obj, View view, int i, BarChartRecyclerView barChartRecyclerView, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.A = barChartRecyclerView;
        this.B = linearLayout;
        this.C = textView;
        this.D = textView2;
        this.E = textView3;
        this.F = textView4;
        this.G = textView5;
    }
}
