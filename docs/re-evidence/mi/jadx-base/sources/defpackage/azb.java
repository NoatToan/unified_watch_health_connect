package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class azb extends ViewDataBinding {
    public final BarChartRecyclerView A;
    public final RecyclerView B;
    public final LinearLayout C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;

    public azb(Object obj, View view, int i, BarChartRecyclerView barChartRecyclerView, RecyclerView recyclerView, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.A = barChartRecyclerView;
        this.B = recyclerView;
        this.C = linearLayout;
        this.D = textView;
        this.E = textView2;
        this.F = textView3;
        this.G = textView4;
        this.H = textView5;
    }
}
