package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.view.CardUnderstandView;
import com.xiaomi.fitness.view.DataTitleView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class aba extends ViewDataBinding {
    public final DataTitleView A;
    public final LineChartRecyclerView B;
    public final View C;
    public final wae D;
    public final CardUnderstandView E;

    public aba(Object obj, View view, int i, DataTitleView dataTitleView, LineChartRecyclerView lineChartRecyclerView, View view2, wae waeVar, CardUnderstandView cardUnderstandView) {
        super(obj, view, i);
        this.A = dataTitleView;
        this.B = lineChartRecyclerView;
        this.C = view2;
        this.D = waeVar;
        this.E = cardUnderstandView;
    }
}
