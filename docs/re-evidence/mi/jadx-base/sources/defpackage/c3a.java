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
public abstract class c3a extends ViewDataBinding {
    public final RecyclerView A;
    public final View B;
    public final LinearLayout C;
    public final DataTitleView D;
    public final HealthBannerCardSetView E;
    public final BloodSugarLineChartRecyclerView F;
    public final RecyclerView G;
    public final RecyclerView H;
    public final CardUnderstandView I;

    public c3a(Object obj, View view, int i, RecyclerView recyclerView, View view2, LinearLayout linearLayout, DataTitleView dataTitleView, HealthBannerCardSetView healthBannerCardSetView, BloodSugarLineChartRecyclerView bloodSugarLineChartRecyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, CardUnderstandView cardUnderstandView) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = view2;
        this.C = linearLayout;
        this.D = dataTitleView;
        this.E = healthBannerCardSetView;
        this.F = bloodSugarLineChartRecyclerView;
        this.G = recyclerView2;
        this.H = recyclerView3;
        this.I = cardUnderstandView;
    }
}
