package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.electronic.scale.model.VirtualMemberStatisticsViewModel;

/* JADX INFO: loaded from: classes8.dex */
public abstract class p5a extends ViewDataBinding {
    public final LineChartRecyclerView A;
    public final FrameLayout B;
    public final RecyclerView C;
    public final TextView D;
    public VirtualMemberStatisticsViewModel E;

    public p5a(Object obj, View view, int i, LineChartRecyclerView lineChartRecyclerView, FrameLayout frameLayout, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i);
        this.A = lineChartRecyclerView;
        this.B = frameLayout;
        this.C = recyclerView;
        this.D = textView;
    }
}
