package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.view.DataTitleView;
import com.xiaomi.fitness.view.TitleBarAlphaView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class wca extends ViewDataBinding {
    public final BarChartRecyclerView A;
    public final DataTitleView B;
    public final LinearLayout C;
    public final TitleBarAlphaView D;
    public final TextView E;
    public final TextView F;

    public wca(Object obj, View view, int i, BarChartRecyclerView barChartRecyclerView, DataTitleView dataTitleView, LinearLayout linearLayout, TitleBarAlphaView titleBarAlphaView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = barChartRecyclerView;
        this.B = dataTitleView;
        this.C = linearLayout;
        this.D = titleBarAlphaView;
        this.E = textView;
        this.F = textView2;
    }
}
