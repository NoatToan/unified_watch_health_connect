package fs0;

import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.HorseshoePieChart;
import p005kotlin.Metadata;
import yr0.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lfs0/c;", "", "Landroid/view/View;", "view", "Lfs0/a;", "pieDataConfig", "Lvz/c;", "pieRendererConfig", "<init>", "(Landroid/view/View;Lfs0/a;Lvz/c;)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HorseshoePieChart f73421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vz.a<g> f73422b;

    static {
        int i14 = HorseshoePieChart.f31354c;
    }

    public c(View view2, a aVar, vz.c cVar) {
        view2.getClass();
        aVar.getClass();
        cVar.getClass();
        HorseshoePieChart horseshoePieChart = (HorseshoePieChart) view2.findViewById(R.id.jet_lag_pie_chart);
        this.f73421a = horseshoePieChart;
        this.f73422b = horseshoePieChart != null ? new vz.a<>(horseshoePieChart, aVar, cVar) : null;
    }
}
