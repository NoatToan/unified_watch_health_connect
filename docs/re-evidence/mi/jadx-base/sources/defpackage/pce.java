package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class pce extends ViewDataBinding {
    public final a7e A;
    public final dce B;
    public final dce C;
    public final LineChartRecyclerView D;
    public final LineChartRecyclerView E;

    public pce(Object obj, View view, int i, a7e a7eVar, dce dceVar, dce dceVar2, LineChartRecyclerView lineChartRecyclerView, LineChartRecyclerView lineChartRecyclerView2) {
        super(obj, view, i);
        this.A = a7eVar;
        this.B = dceVar;
        this.C = dceVar2;
        this.D = lineChartRecyclerView;
        this.E = lineChartRecyclerView2;
    }
}
