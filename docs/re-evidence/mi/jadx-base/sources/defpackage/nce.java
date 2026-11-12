package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class nce extends ViewDataBinding {
    public final TextView A;
    public final a7e B;
    public final LineChartRecyclerView C;

    public nce(Object obj, View view, int i, TextView textView, a7e a7eVar, LineChartRecyclerView lineChartRecyclerView) {
        super(obj, view, i);
        this.A = textView;
        this.B = a7eVar;
        this.C = lineChartRecyclerView;
    }
}
