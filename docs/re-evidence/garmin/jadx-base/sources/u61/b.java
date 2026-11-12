package u61;

import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lu61/b;", "Lqz/h;", "Ld00/a;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomBarChart;", "chart", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomBarChart;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements qz.h<d00.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h00.e f168860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3165b f168861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d00.c f168862c;

    /* JADX INFO: renamed from: u61.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"u61/b$b", "Li00/b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3165b extends i00.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final yz.e f168863i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3165b(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
            super(viewPortHandler, yAxis, transformer);
            yAxis.getClass();
            this.f168863i = new yz.e();
        }

        @Override // i00.b
        /* JADX INFO: renamed from: a */
        public final boolean getF98175i() {
            return false;
        }

        @Override // i00.b
        /* JADX INFO: renamed from: b */
        public final boolean getF146890i() {
            return false;
        }

        @Override // i00.b
        /* JADX INFO: renamed from: e */
        public final ValueFormatter getF21082i() {
            return this.f168863i;
        }

        @Override // i00.b
        public final void f() {
        }

        @Override // i00.b
        public final void g() {
        }
    }

    static {
        new a(null);
    }

    public b(CustomBarChart customBarChart) {
        customBarChart.getClass();
        ViewPortHandler viewPortHandler = customBarChart.getViewPortHandler();
        viewPortHandler.getClass();
        Transformer transformer = customBarChart.getTransformer(YAxis.AxisDependency.LEFT);
        transformer.getClass();
        XAxis xAxis = customBarChart.getXAxis();
        xAxis.getClass();
        h00.e eVar = new h00.e(viewPortHandler, xAxis, transformer, pz.a.LARGE_LIMIT_DOT_PATTERN, pz.b.BOUNDARY_LABEL_PATTERN, false, 32, null);
        eVar.f80606j = false;
        eVar.f80607k = false;
        this.f168860a = eVar;
        C3165b c3165b = new C3165b(viewPortHandler, customBarChart.getAxisLeft(), transformer);
        c3165b.f86715e = 4;
        c3165b.f86716f = false;
        this.f168861b = c3165b;
        d00.c cVar = new d00.c(customBarChart, customBarChart.getAnimator(), viewPortHandler);
        cVar.f56994f = Float.valueOf(0.0f);
        cVar.f56995g = Float.valueOf(20.0f);
        cVar.f56990b = 0.65f;
        cVar.f57001h = true;
        this.f168862c = cVar;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF159999a() {
        return this.f168860a;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF173486i() {
        return this.f168862c;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF160000b() {
        return this.f168861b;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lu61/b$a;", "", "<init>", "()V", "", "CHART_EXTRA_TOP_OFFSET", "F", "CHART_EXTRA_BOTTOM_OFFSET", "TRAINING_EFFECT_BAR_WIDTH_PERCENT", "", "DEFAULT_Y_LABEL_COUNT", "I", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
