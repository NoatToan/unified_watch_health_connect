package u61;

import android.util.TypedValue;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.HorseshoePieChart;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu61/j;", "Lvz/c;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/HorseshoePieChart;", "chart", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/HorseshoePieChart;)V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements vz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g00.d f168886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g00.b f168887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f168888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f168889d;

    public j(HorseshoePieChart horseshoePieChart) {
        horseshoePieChart.getClass();
        ChartAnimator animator = horseshoePieChart.getAnimator();
        animator.getClass();
        ViewPortHandler viewPortHandler = horseshoePieChart.getViewPortHandler();
        viewPortHandler.getClass();
        g00.d dVar = new g00.d(horseshoePieChart, animator, viewPortHandler);
        dVar.f74090h = Float.valueOf(TypedValue.applyDimension(1, 8.0f, horseshoePieChart.getResources().getDisplayMetrics()));
        this.f168886a = dVar;
        this.f168887b = new g00.b();
        this.f168888c = Float.valueOf(4.0f);
        this.f168889d = true;
    }

    @Override // vz.c
    public final g00.c a() {
        return this.f168887b;
    }

    @Override // vz.c
    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF168889d() {
        return this.f168889d;
    }

    @Override // vz.c
    /* JADX INFO: renamed from: c, reason: from getter */
    public final g00.d getF168886a() {
        return this.f168886a;
    }

    @Override // vz.c
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Float getF168888c() {
        return this.f168888c;
    }
}
