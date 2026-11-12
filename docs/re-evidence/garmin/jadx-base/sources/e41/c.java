package e41;

import android.util.TypedValue;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.HorseshoePieChart;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.utils.ViewPortHandler;
import g00.d;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le41/c;", "Lvz/c;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/HorseshoePieChart;", "chart", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/HorseshoePieChart;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements vz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f62867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g00.b f62868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f62869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f62870d;

    public c(HorseshoePieChart horseshoePieChart) {
        horseshoePieChart.getClass();
        ChartAnimator animator = horseshoePieChart.getAnimator();
        animator.getClass();
        ViewPortHandler viewPortHandler = horseshoePieChart.getViewPortHandler();
        viewPortHandler.getClass();
        d dVar = new d(horseshoePieChart, animator, viewPortHandler);
        dVar.f74090h = Float.valueOf(TypedValue.applyDimension(1, 8.0f, horseshoePieChart.getResources().getDisplayMetrics()));
        this.f62867a = dVar;
        this.f62868b = new g00.b();
        this.f62869c = Float.valueOf(4.0f);
        this.f62870d = true;
    }

    @Override // vz.c
    public final g00.c a() {
        return this.f62868b;
    }

    @Override // vz.c
    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF62870d() {
        return this.f62870d;
    }

    @Override // vz.c
    /* JADX INFO: renamed from: c, reason: from getter */
    public final d getF62867a() {
        return this.f62867a;
    }

    @Override // vz.c
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Float getF62869c() {
        return this.f62869c;
    }
}
