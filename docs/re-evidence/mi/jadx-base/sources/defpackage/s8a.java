package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.view.DataTitleView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class s8a extends ViewDataBinding {
    public final DataTitleView A;
    public final LinearLayout B;
    public final aae C;
    public final BarChartRecyclerView D;

    public s8a(Object obj, View view, int i, DataTitleView dataTitleView, LinearLayout linearLayout, aae aaeVar, BarChartRecyclerView barChartRecyclerView) {
        super(obj, view, i);
        this.A = dataTitleView;
        this.B = linearLayout;
        this.C = aaeVar;
        this.D = barChartRecyclerView;
    }
}
