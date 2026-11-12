package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.view.CardUnderstandView;
import com.xiaomi.fitness.view.DataTitleView;
import com.xiaomi.fitness.view.HealthBannerCardSetView;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class g3a extends ViewDataBinding {
    public final LinearLayout A;
    public final DataTitleView B;
    public final HealthBannerCardSetView C;
    public final LineChartRecyclerView D;
    public final LinearLayout E;
    public final DataTitleSimpleView F;
    public final CardUnderstandView G;
    public final RecyclerView H;
    public final RecyclerView I;
    public final RecyclerView J;
    public final CardUnderstandView K;

    public g3a(Object obj, View view, int i, LinearLayout linearLayout, DataTitleView dataTitleView, HealthBannerCardSetView healthBannerCardSetView, LineChartRecyclerView lineChartRecyclerView, LinearLayout linearLayout2, DataTitleSimpleView dataTitleSimpleView, CardUnderstandView cardUnderstandView, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, CardUnderstandView cardUnderstandView2) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = dataTitleView;
        this.C = healthBannerCardSetView;
        this.D = lineChartRecyclerView;
        this.E = linearLayout2;
        this.F = dataTitleSimpleView;
        this.G = cardUnderstandView;
        this.H = recyclerView;
        this.I = recyclerView2;
        this.J = recyclerView3;
        this.K = cardUnderstandView2;
    }
}
