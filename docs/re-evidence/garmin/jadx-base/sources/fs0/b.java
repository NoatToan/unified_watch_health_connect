package fs0;

import android.util.TypedValue;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.HorseshoePieChart;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.utils.ViewPortHandler;
import g00.d;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfs0/b;", "Lvz/c;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/HorseshoePieChart;", "chart", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/HorseshoePieChart;)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements vz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f73417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g00.b f73418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f73419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f73420d;

    public b(HorseshoePieChart horseshoePieChart) {
        horseshoePieChart.getClass();
        ChartAnimator animator = horseshoePieChart.getAnimator();
        animator.getClass();
        ViewPortHandler viewPortHandler = horseshoePieChart.getViewPortHandler();
        viewPortHandler.getClass();
        d dVar = new d(horseshoePieChart, animator, viewPortHandler);
        dVar.f74090h = Float.valueOf(TypedValue.applyDimension(1, 8.0f, horseshoePieChart.getResources().getDisplayMetrics()));
        this.f73417a = dVar;
        this.f73418b = new g00.b();
        this.f73419c = Float.valueOf(4.0f);
        this.f73420d = true;
    }

    @Override // vz.c
    public final g00.c a() {
        return this.f73418b;
    }

    @Override // vz.c
    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF73420d() {
        return this.f73420d;
    }

    @Override // vz.c
    /* JADX INFO: renamed from: c, reason: from getter */
    public final d getF73417a() {
        return this.f73417a;
    }

    @Override // vz.c
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Float getF73419c() {
        return this.f73419c;
    }
}
