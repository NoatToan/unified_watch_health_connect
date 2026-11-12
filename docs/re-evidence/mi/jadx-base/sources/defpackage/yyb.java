package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class yyb extends ViewDataBinding {
    public final BarChartRecyclerView A;
    public final RecyclerView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;

    public yyb(Object obj, View view, int i, BarChartRecyclerView barChartRecyclerView, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = barChartRecyclerView;
        this.B = recyclerView;
        this.C = textView;
        this.D = textView2;
        this.E = textView3;
        this.F = textView4;
    }
}
