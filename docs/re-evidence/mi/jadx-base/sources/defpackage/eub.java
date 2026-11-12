package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.view.MultiDataTitleView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class eub extends ViewDataBinding {
    public final BarChartRecyclerView A;
    public final MultiDataTitleView B;
    public final View C;

    public eub(Object obj, View view, int i, BarChartRecyclerView barChartRecyclerView, MultiDataTitleView multiDataTitleView, View view2) {
        super(obj, view, i);
        this.A = barChartRecyclerView;
        this.B = multiDataTitleView;
        this.C = view2;
    }
}
