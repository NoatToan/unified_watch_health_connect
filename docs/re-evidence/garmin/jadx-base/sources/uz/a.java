package uz;

import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004:\u0001\u0014Bi\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\"\u0010\t\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Luz/a;", "ChartType", "OverlayType", "Data", "", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomCombinedChart;", "chart", "Luz/b;", "Lcom/github/mikephil/charting/interfaces/datasets/IBarLineScatterCandleBubbleDataSet;", "dataConfig", "Luz/d;", "rendererConfig", "Lqz/e;", "hoverConfig", "Lqz/f;", "legendConfig", "", "fixedYAxisWidth", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomCombinedChart;Luz/b;Luz/d;Lqz/e;Lqz/f;F)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class a<ChartType, OverlayType, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b<ChartType, OverlayType, Data, IBarLineScatterCandleBubbleDataSet<?>> f173470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d<ChartType, OverlayType> f173471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qz.e f173472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qz.f f173473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sz.a<Data> f173474e;

    static {
        new C3243a(null);
    }

    public a(CustomCombinedChart customCombinedChart, b<ChartType, OverlayType, Data, IBarLineScatterCandleBubbleDataSet<?>> bVar, d<ChartType, OverlayType> dVar, qz.e eVar, qz.f fVar, float f14) {
        customCombinedChart.getClass();
        bVar.getClass();
        dVar.getClass();
        this.f173470a = bVar;
        this.f173471b = dVar;
        this.f173472c = eVar;
        this.f173473d = fVar;
        this.f173474e = new sz.a<>(customCombinedChart, bVar, dVar, eVar, fVar, null, 32, null);
        customCombinedChart.setExtraLeftOffset(8.0f);
        customCombinedChart.setExtraRightOffset(8.0f);
        if (f14 > 0.0f) {
            customCombinedChart.getAxisLeft().setMinWidth(f14);
            customCombinedChart.getAxisLeft().setMaxWidth(f14);
            customCombinedChart.getAxisRight().setMinWidth(f14);
            customCombinedChart.getAxisRight().setMaxWidth(f14);
        }
    }

    public static void a(a aVar, Object obj, String str, int i14) {
        if ((i14 & 2) != 0) {
            str = null;
        }
        aVar.f173474e.a(obj, str);
    }

    public final void b(OverlayType overlaytype) {
        d<ChartType, OverlayType> dVar = this.f173471b;
        e<ChartType, OverlayType> eVar = dVar.f173481d;
        ChartType charttype = dVar.f173480c;
        dVar.f173482e = eVar.b(charttype, overlaytype);
        YAxis axisRight = dVar.f173479b.getAxisRight();
        axisRight.getClass();
        dVar.f173483f = eVar.a(axisRight, charttype, overlaytype);
        b<ChartType, OverlayType, Data, IBarLineScatterCandleBubbleDataSet<?>> bVar = this.f173470a;
        c<ChartType, OverlayType, Data, DataSet> cVar = bVar.f173476b;
        ChartType charttype2 = bVar.f173475a;
        bVar.f173477c = cVar.b(charttype2, overlaytype);
        bVar.f173478d = cVar.a(charttype2, overlaytype);
        this.f173474e.c();
    }

    /* JADX INFO: renamed from: uz.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Luz/a$a;", "", "<init>", "()V", "", "NO_Y_AXIS_WIDTH", "F", "EXTRA_HORIZONTAL_OFFSET", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3243a {
        public /* synthetic */ C3243a(j jVar) {
            this();
        }

        private C3243a() {
        }
    }

    public /* synthetic */ a(CustomCombinedChart customCombinedChart, b bVar, d dVar, qz.e eVar, qz.f fVar, float f14, int i14, j jVar) {
        this(customCombinedChart, bVar, dVar, (i14 & 8) != 0 ? null : eVar, (i14 & 16) != 0 ? null : fVar, (i14 & 32) != 0 ? 0.0f : f14);
    }
}
