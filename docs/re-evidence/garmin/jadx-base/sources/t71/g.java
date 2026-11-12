package t71;

import android.util.TypedValue;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomPieChart;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt71/g;", "Lvz/c;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomPieChart;", "chart", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomPieChart;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements vz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g00.d f163102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g00.b f163103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f163104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f163105d;

    public g(CustomPieChart customPieChart) {
        customPieChart.getClass();
        ChartAnimator animator = customPieChart.getAnimator();
        animator.getClass();
        ViewPortHandler viewPortHandler = customPieChart.getViewPortHandler();
        viewPortHandler.getClass();
        g00.d dVar = new g00.d(customPieChart, animator, viewPortHandler);
        dVar.f74090h = Float.valueOf(TypedValue.applyDimension(1, 8.0f, customPieChart.getResources().getDisplayMetrics()));
        this.f163102a = dVar;
        this.f163103b = new g00.b();
        this.f163104c = Float.valueOf(4.0f);
        this.f163105d = true;
    }

    @Override // vz.c
    public final g00.c a() {
        return this.f163103b;
    }

    @Override // vz.c
    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF163105d() {
        return this.f163105d;
    }

    @Override // vz.c
    /* JADX INFO: renamed from: c, reason: from getter */
    public final g00.d getF163102a() {
        return this.f163102a;
    }

    @Override // vz.c
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Float getF163104c() {
        return this.f163104c;
    }
}
