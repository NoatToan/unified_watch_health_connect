package qr0;

import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import d00.c;
import h00.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import qz.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lqr0/b;", "Lqz/h;", "Ld00/a;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomBarChart;", "chart", "", "isGarminCoachReport", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomBarChart;Z)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements h<d00.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f146887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2762b f146888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f146889c;

    /* JADX INFO: renamed from: qr0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"qr0/b$b", "Li00/b;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2762b extends i00.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f146890i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final yz.e f146891j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2762b(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
            super(viewPortHandler, yAxis, transformer);
            yAxis.getClass();
            this.f146890i = true;
            this.f146891j = new yz.e();
        }

        @Override // i00.b
        /* JADX INFO: renamed from: a */
        public final boolean getF98175i() {
            return false;
        }

        @Override // i00.b
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF146890i() {
            return this.f146890i;
        }

        @Override // i00.b
        /* JADX INFO: renamed from: e */
        public final ValueFormatter getF21082i() {
            return this.f146891j;
        }

        @Override // i00.b
        public final void f() {
        }

        @Override // i00.b
        public final void g() {
            this.f146890i = false;
        }
    }

    static {
        new a(null);
    }

    public b(CustomBarChart customBarChart, boolean z14) {
        customBarChart.getClass();
        ViewPortHandler viewPortHandler = customBarChart.getViewPortHandler();
        viewPortHandler.getClass();
        Transformer transformer = customBarChart.getTransformer(YAxis.AxisDependency.LEFT);
        transformer.getClass();
        XAxis xAxis = customBarChart.getXAxis();
        xAxis.getClass();
        e eVar = new e(viewPortHandler, xAxis, transformer, pz.a.ALL_LARGE_DOT_PATTERN, pz.b.DEFAULT_LABEL_PATTERN, false);
        eVar.f80606j = false;
        eVar.f80607k = false;
        if (!z14) {
            eVar.f80604h = 270.0f;
        }
        this.f146887a = eVar;
        C2762b c2762b = new C2762b(viewPortHandler, customBarChart.getAxisLeft(), transformer);
        c2762b.f86715e = 4;
        c2762b.f86716f = true;
        this.f146888b = c2762b;
        c cVar = new c(customBarChart, customBarChart.getAnimator(), viewPortHandler);
        cVar.f56994f = Float.valueOf(70.0f);
        cVar.f56995g = Float.valueOf(20.0f);
        cVar.f56990b = z14 ? 0.3f : 0.65f;
        cVar.f56991c = true;
        this.f146889c = cVar;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF159999a() {
        return this.f146887a;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF173486i() {
        return this.f146889c;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF160000b() {
        return this.f146888b;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lqr0/b$a;", "", "<init>", "()V", "", "CHART_EXTRA_TOP_OFFSET", "F", "CHART_EXTRA_BOTTOM_OFFSET", "INTENSITY_MINUTES_BAR_WIDTH_PERCENT_COACH_REPORTS", "INTENSITY_MINUTES_BAR_WIDTH_PERCENT", "", "DEFAULT_Y_LABEL_COUNT", "I", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ b(CustomBarChart customBarChart, boolean z14, int i14, j jVar) {
        this(customBarChart, (i14 & 2) != 0 ? false : z14);
    }
}
