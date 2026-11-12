package dx0;

import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import qz.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Ldx0/g;", "Lqz/h;", "Ld00/a;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomBarChart;", "chart", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomBarChart;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements h<d00.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h00.e f61475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f61476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d00.a f61477c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"dx0/g$b", "Li00/b;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends i00.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f61478i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final yz.c f61479j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
            super(viewPortHandler, yAxis, transformer);
            yAxis.getClass();
            this.f61478i = true;
            this.f61479j = new yz.c();
        }

        @Override // i00.b
        public final boolean a() {
            return false;
        }

        @Override // i00.b
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF61478i() {
            return this.f61478i;
        }

        @Override // i00.b
        /* JADX INFO: renamed from: e */
        public final ValueFormatter getF21082i() {
            return this.f61479j;
        }

        @Override // i00.b
        public final void f() {
        }

        @Override // i00.b
        public final void g() {
            this.f61478i = false;
        }
    }

    static {
        new a(null);
    }

    public g(CustomBarChart customBarChart) {
        customBarChart.getClass();
        ViewPortHandler viewPortHandler = customBarChart.getViewPortHandler();
        viewPortHandler.getClass();
        Transformer transformer = customBarChart.getTransformer(YAxis.AxisDependency.LEFT);
        transformer.getClass();
        XAxis xAxis = customBarChart.getXAxis();
        xAxis.getClass();
        this.f61475a = new h00.e(viewPortHandler, xAxis, transformer, pz.a.ALL_LARGE_DOT_PATTERN, pz.b.DEFAULT_LABEL_PATTERN, false);
        this.f61476b = new b(viewPortHandler, customBarChart.getAxisLeft(), transformer);
        d00.a aVar = new d00.a(customBarChart, customBarChart.getAnimator(), viewPortHandler);
        aVar.f56994f = Float.valueOf(0.0f);
        aVar.f56995g = Float.valueOf(20.0f);
        aVar.f56990b = 0.33f;
        this.f61477c = aVar;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF101974h() {
        return this.f61475a;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF142393c() {
        return this.f61477c;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF101352b() {
        return this.f61476b;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Ldx0/g$a;", "", "<init>", "()V", "", "CHART_EXTRA_TOP_OFFSET", "F", "CHART_EXTRA_BOTTOM_OFFSET", "MULTIPLE_CYCLES_BAR_WIDTH_PERCENT", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
