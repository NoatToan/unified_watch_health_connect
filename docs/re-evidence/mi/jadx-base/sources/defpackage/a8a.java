package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.view.DataTitleView;
import com.xiaomi.fitness.view.HealthBannerCardSetView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a8a extends ViewDataBinding {
    public final DataTitleView A;
    public final HealthBannerCardSetView B;
    public final LinearLayout C;
    public final aae D;
    public final BarChartRecyclerView E;

    public a8a(Object obj, View view, int i, DataTitleView dataTitleView, HealthBannerCardSetView healthBannerCardSetView, LinearLayout linearLayout, aae aaeVar, BarChartRecyclerView barChartRecyclerView) {
        super(obj, view, i);
        this.A = dataTitleView;
        this.B = healthBannerCardSetView;
        this.C = linearLayout;
        this.D = aaeVar;
        this.E = barChartRecyclerView;
    }
}
