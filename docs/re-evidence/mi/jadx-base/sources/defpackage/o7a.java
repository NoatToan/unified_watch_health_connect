package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.view.CardUnderstandView;
import com.xiaomi.fitness.view.DataTitleView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class o7a extends ViewDataBinding {
    public final BarChartRecyclerView A;
    public final LinearLayout B;
    public final DataTitleView C;
    public final ImageView D;
    public final TextView E;
    public final TextView F;
    public final CardUnderstandView G;

    public o7a(Object obj, View view, int i, BarChartRecyclerView barChartRecyclerView, LinearLayout linearLayout, DataTitleView dataTitleView, ImageView imageView, TextView textView, TextView textView2, CardUnderstandView cardUnderstandView) {
        super(obj, view, i);
        this.A = barChartRecyclerView;
        this.B = linearLayout;
        this.C = dataTitleView;
        this.D = imageView;
        this.E = textView;
        this.F = textView2;
        this.G = cardUnderstandView;
    }
}
