package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.view.CardUnderstandView;
import com.xiaomi.fitness.view.DataTitleView;
import com.xiaomi.fitness.view.HealthBannerCardSetView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class e3a extends ViewDataBinding {
    public final View A;
    public final LinearLayout B;
    public final DataTitleView C;
    public final HealthBannerCardSetView D;
    public final LineChartRecyclerView E;
    public final CardUnderstandView F;
    public final RecyclerView G;
    public final RecyclerView H;
    public final CardUnderstandView I;

    public e3a(Object obj, View view, int i, View view2, LinearLayout linearLayout, DataTitleView dataTitleView, HealthBannerCardSetView healthBannerCardSetView, LineChartRecyclerView lineChartRecyclerView, CardUnderstandView cardUnderstandView, RecyclerView recyclerView, RecyclerView recyclerView2, CardUnderstandView cardUnderstandView2) {
        super(obj, view, i);
        this.A = view2;
        this.B = linearLayout;
        this.C = dataTitleView;
        this.D = healthBannerCardSetView;
        this.E = lineChartRecyclerView;
        this.F = cardUnderstandView;
        this.G = recyclerView;
        this.H = recyclerView2;
        this.I = cardUnderstandView2;
    }
}
