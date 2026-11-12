package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.view.DataTitleView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class yca extends ViewDataBinding {
    public final DataTitleView A;
    public final tce B;
    public final BarChartRecyclerView C;
    public final LinearLayout D;

    public yca(Object obj, View view, int i, DataTitleView dataTitleView, tce tceVar, BarChartRecyclerView barChartRecyclerView, LinearLayout linearLayout) {
        super(obj, view, i);
        this.A = dataTitleView;
        this.B = tceVar;
        this.C = barChartRecyclerView;
        this.D = linearLayout;
    }
}
