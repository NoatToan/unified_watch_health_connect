package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.health.bloodpressure.ui.BloodPressureDataTitleView;
import com.xiaomi.fitness.view.CardUnderstandView;
import com.xiaomi.fitness.view.HealthBannerCardSetView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class w3a extends ViewDataBinding {
    public final LinearLayout A;
    public final BloodPressureDataTitleView B;
    public final HealthBannerCardSetView C;
    public final BarChartRecyclerView D;
    public final RecyclerView E;
    public final RecyclerView F;
    public final View G;
    public final CardUnderstandView H;

    public w3a(Object obj, View view, int i, LinearLayout linearLayout, BloodPressureDataTitleView bloodPressureDataTitleView, HealthBannerCardSetView healthBannerCardSetView, BarChartRecyclerView barChartRecyclerView, RecyclerView recyclerView, RecyclerView recyclerView2, View view2, CardUnderstandView cardUnderstandView) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = bloodPressureDataTitleView;
        this.C = healthBannerCardSetView;
        this.D = barChartRecyclerView;
        this.E = recyclerView;
        this.F = recyclerView2;
        this.G = view2;
        this.H = cardUnderstandView;
    }
}
