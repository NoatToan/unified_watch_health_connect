package vm;

import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomHorizontalBarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lvm/b;", "Lqz/d;", "Ld00/b;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomHorizontalBarChart;", "chart", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomHorizontalBarChart;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements qz.d<d00.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h00.d f178724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3340b f178725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d00.b f178726c;

    /* JADX INFO: renamed from: vm.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"vm/b$b", "Li00/a;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3340b extends i00.a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final yz.b f178727f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3340b(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
            super(viewPortHandler, yAxis, transformer);
            yAxis.getClass();
            this.f178727f = new yz.b(0);
        }
    }

    static {
        new a(null);
    }

    public b(CustomHorizontalBarChart customHorizontalBarChart) {
        customHorizontalBarChart.getClass();
        ViewPortHandler viewPortHandler = customHorizontalBarChart.getViewPortHandler();
        viewPortHandler.getClass();
        Transformer transformer = customHorizontalBarChart.getTransformer(YAxis.AxisDependency.RIGHT);
        transformer.getClass();
        XAxis xAxis = customHorizontalBarChart.getXAxis();
        xAxis.getClass();
        this.f178724a = new h00.d(viewPortHandler, xAxis, transformer, customHorizontalBarChart);
        this.f178725b = new C3340b(viewPortHandler, customHorizontalBarChart.getAxisRight(), transformer);
        d00.b bVar = new d00.b(customHorizontalBarChart, customHorizontalBarChart.getAnimator(), customHorizontalBarChart.getViewPortHandler());
        bVar.f56997b = 0.55f;
        Float fValueOf = Float.valueOf(20.0f);
        bVar.f56999d = fValueOf;
        bVar.f57000e = fValueOf;
        this.f178726c = bVar;
    }

    @Override // qz.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final C3340b getF178725b() {
        return this.f178725b;
    }

    @Override // qz.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final h00.d getF178724a() {
        return this.f178724a;
    }

    @Override // qz.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final d00.b getF178726c() {
        return this.f178726c;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lvm/b$a;", "", "<init>", "()V", "", "ROUTES_CHART_BAR_WIDTH", "F", "ROUTES_EXTRA_OFFSET", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
