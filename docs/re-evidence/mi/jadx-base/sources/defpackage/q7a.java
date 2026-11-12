package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.view.DataTitleView;
import com.xiaomi.fitness.view.TitleBarAlphaView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class q7a extends ViewDataBinding {
    public final BarChartRecyclerView A;
    public final DataTitleView B;
    public final LinearLayout C;
    public final NestedScrollView D;
    public final TitleBarAlphaView E;
    public final TextView F;
    public final TextView G;

    public q7a(Object obj, View view, int i, BarChartRecyclerView barChartRecyclerView, DataTitleView dataTitleView, LinearLayout linearLayout, NestedScrollView nestedScrollView, TitleBarAlphaView titleBarAlphaView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = barChartRecyclerView;
        this.B = dataTitleView;
        this.C = linearLayout;
        this.D = nestedScrollView;
        this.E = titleBarAlphaView;
        this.F = textView;
        this.G = textView2;
    }
}
