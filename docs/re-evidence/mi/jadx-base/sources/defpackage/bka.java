package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.view.DataTitleView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class bka extends ViewDataBinding {
    public final BarChartRecyclerView A;
    public final DataTitleView B;
    public final lde C;
    public final LinearLayout D;

    public bka(Object obj, View view, int i, BarChartRecyclerView barChartRecyclerView, DataTitleView dataTitleView, lde ldeVar, LinearLayout linearLayout) {
        super(obj, view, i);
        this.A = barChartRecyclerView;
        this.B = dataTitleView;
        this.C = ldeVar;
        this.D = linearLayout;
    }
}
