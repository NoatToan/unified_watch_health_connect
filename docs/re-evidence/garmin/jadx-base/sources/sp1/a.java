package sp1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import k00.g;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lsp1/a;", "Ltz/a;", "Lxp1/b;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomLineChart;", "chart", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomLineChart;)V", "a", "gcm-solar-intensity_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends tz.a<xp1.b> {
    static {
        new C3033a(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(CustomLineChart customLineChart) {
        customLineChart.getClass();
        Context context = customLineChart.getContext();
        context.getClass();
        super(customLineChart, new b(context), new d(customLineChart), new c(customLineChart), new g(customLineChart), null, 32, null);
        customLineChart.setScaleXEnabled(true);
        customLineChart.setScaleYEnabled(false);
        customLineChart.getViewPortHandler().setMaximumScaleX(2.0f);
        customLineChart.setScaleMinima(1.0f, 1.0f);
        customLineChart.setDoubleTapToZoomEnabled(false);
        customLineChart.setExtraBottomOffset(40.0f);
        customLineChart.setExtraLeftOffset(10.0f);
        customLineChart.setExtraRightOffset(30.0f);
    }

    @Override // tz.a, qz.a
    public final void a(Object obj, String str) {
        xp1.b bVar = (xp1.b) obj;
        super.a(bVar, str);
        if (bVar == null) {
            this.f167284a.clear();
        }
    }

    /* JADX INFO: renamed from: sp1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lsp1/a$a;", "", "<init>", "()V", "", "CHART_X_AXIS_MAX_ZOOM", "F", "CHART_EXTRA_LEFT_OFFSET", "CHART_EXTRA_RIGHT_OFFSET", "CHART_EXTRA_BOTTOM_OFFSET", "gcm-solar-intensity_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3033a {
        public /* synthetic */ C3033a(j jVar) {
            this();
        }

        private C3033a() {
        }
    }
}
