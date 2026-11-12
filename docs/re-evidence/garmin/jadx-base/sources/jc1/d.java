package jc1;

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
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ljc1/d;", "Lqz/h;", "Ld00/a;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomBarChart;", "chart", "", "showDailyAverages", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomBarChart;Z)V", "a", "gcm-pulseox_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements h<d00.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jc1.a f98172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f98173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d00.a f98174c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"jc1/d$b", "Li00/b;", "gcm-pulseox_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends i00.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f98175i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final yz.h f98176j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
            super(viewPortHandler, yAxis, transformer);
            yAxis.getClass();
            this.f98175i = true;
            this.f98176j = new yz.h();
        }

        @Override // i00.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF98175i() {
            return this.f98175i;
        }

        @Override // i00.b
        /* JADX INFO: renamed from: b */
        public final boolean getF61478i() {
            return false;
        }

        @Override // i00.b
        /* JADX INFO: renamed from: e */
        public final ValueFormatter getF21082i() {
            return this.f98176j;
        }

        @Override // i00.b
        public final void f() {
            this.f98175i = false;
        }

        @Override // i00.b
        public final void g() {
        }
    }

    static {
        new a(null);
    }

    public d(CustomBarChart customBarChart, boolean z14) {
        customBarChart.getClass();
        ViewPortHandler viewPortHandler = customBarChart.getViewPortHandler();
        viewPortHandler.getClass();
        Transformer transformer = customBarChart.getTransformer(YAxis.AxisDependency.LEFT);
        transformer.getClass();
        XAxis xAxis = customBarChart.getXAxis();
        xAxis.getClass();
        jc1.a aVar = new jc1.a(viewPortHandler, xAxis, transformer, pz.a.ALL_LARGE_DOT_PATTERN, pz.b.DEFAULT_LABEL_PATTERN);
        aVar.f80606j = false;
        aVar.f80607k = true;
        aVar.f98161r = true;
        aVar.f98160q = z14 ? 7 : 24;
        this.f98172a = aVar;
        this.f98173b = new b(viewPortHandler, customBarChart.getAxisLeft(), transformer);
        d00.a aVar2 = new d00.a(customBarChart, customBarChart.getAnimator(), viewPortHandler);
        aVar2.f56994f = Float.valueOf(0.0f);
        aVar2.f56995g = Float.valueOf(25.0f);
        aVar2.f56990b = 1.0f;
        this.f98174c = aVar2;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF69204a() {
        return this.f98172a;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF142393c() {
        return this.f98174c;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF101352b() {
        return this.f98173b;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Ljc1/d$a;", "", "<init>", "()V", "", "CHART_EXTRA_TOP_OFFSET", "F", "CHART_EXTRA_BOTTOM_OFFSET", "PULSE_OX_SUMMARY_BAR_WIDTH_PERCENT", "gcm-pulseox_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
