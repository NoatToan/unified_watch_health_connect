package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ni0 extends ViewDataBinding {
    public final LinearLayoutCompat A;
    public final LineChartRecyclerView B;
    public final TextView C;
    public final TextView D;

    public ni0(Object obj, View view, int i, LinearLayoutCompat linearLayoutCompat, LineChartRecyclerView lineChartRecyclerView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = linearLayoutCompat;
        this.B = lineChartRecyclerView;
        this.C = textView;
        this.D = textView2;
    }
}
