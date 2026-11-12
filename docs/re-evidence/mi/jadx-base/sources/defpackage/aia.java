package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.view.DataTitleView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class aia extends ViewDataBinding {
    public final DataTitleView A;
    public final hde B;
    public final BarChartRecyclerView C;
    public final LinearLayout D;

    public aia(Object obj, View view, int i, DataTitleView dataTitleView, hde hdeVar, BarChartRecyclerView barChartRecyclerView, LinearLayout linearLayout) {
        super(obj, view, i);
        this.A = dataTitleView;
        this.B = hdeVar;
        this.C = barChartRecyclerView;
        this.D = linearLayout;
    }
}
