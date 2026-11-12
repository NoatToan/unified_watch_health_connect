package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.view.CardUnderstandView;
import com.xiaomi.fitness.view.DataTitleView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class mja extends ViewDataBinding {
    public final DataTitleView A;
    public final BarChartRecyclerView B;
    public final RecyclerView C;
    public final LinearLayout D;
    public final CardUnderstandView E;

    public mja(Object obj, View view, int i, DataTitleView dataTitleView, BarChartRecyclerView barChartRecyclerView, RecyclerView recyclerView, LinearLayout linearLayout, CardUnderstandView cardUnderstandView) {
        super(obj, view, i);
        this.A = dataTitleView;
        this.B = barChartRecyclerView;
        this.C = recyclerView;
        this.D = linearLayout;
        this.E = cardUnderstandView;
    }
}
