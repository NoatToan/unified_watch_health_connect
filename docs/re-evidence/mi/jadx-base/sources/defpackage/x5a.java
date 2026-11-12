package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.view.DataTitleView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class x5a extends ViewDataBinding {
    public final BarChartRecyclerView A;
    public final DataTitleView B;
    public final LinearLayout C;
    public final z8e D;

    public x5a(Object obj, View view, int i, BarChartRecyclerView barChartRecyclerView, DataTitleView dataTitleView, LinearLayout linearLayout, z8e z8eVar) {
        super(obj, view, i);
        this.A = barChartRecyclerView;
        this.B = dataTitleView;
        this.C = linearLayout;
        this.D = z8eVar;
    }
}
