package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.view.BloodSugarLineChartRecyclerView;
import com.xiaomi.fitness.view.CardUnderstandView;
import com.xiaomi.fitness.view.DataTitleView;
import com.xiaomi.fitness.view.HealthBannerCardSetView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class k3a extends ViewDataBinding {
    public final LinearLayout A;
    public final DataTitleView B;
    public final HealthBannerCardSetView C;
    public final BloodSugarLineChartRecyclerView D;
    public final RecyclerView E;
    public final RecyclerView F;
    public final CardUnderstandView G;

    public k3a(Object obj, View view, int i, LinearLayout linearLayout, DataTitleView dataTitleView, HealthBannerCardSetView healthBannerCardSetView, BloodSugarLineChartRecyclerView bloodSugarLineChartRecyclerView, RecyclerView recyclerView, RecyclerView recyclerView2, CardUnderstandView cardUnderstandView) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = dataTitleView;
        this.C = healthBannerCardSetView;
        this.D = bloodSugarLineChartRecyclerView;
        this.E = recyclerView;
        this.F = recyclerView2;
        this.G = cardUnderstandView;
    }
}
