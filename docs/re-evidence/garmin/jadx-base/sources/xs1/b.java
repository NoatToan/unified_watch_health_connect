package xs1;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import d00.c;
import h00.f;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import qz.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxs1/b;", "Lqz/h;", "Ld00/c;", "Lcom/github/mikephil/charting/charts/BarChart;", "chart", "<init>", "(Lcom/github/mikephil/charting/charts/BarChart;)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements h<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f192076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f192077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f192078c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"xs1/b$a", "Li00/b;", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends i00.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final C3579a f192079i;

        /* JADX INFO: renamed from: xs1.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"xs1/b$a$a", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C3579a extends ValueFormatter {
            @Override // com.github.mikephil.charting.formatter.ValueFormatter
            public final String getFormattedValue(float f14) {
                return "";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
            super(viewPortHandler, yAxis, transformer);
            vb.h.o(viewPortHandler, yAxis, transformer);
            this.f192079i = new C3579a();
        }

        @Override // i00.b
        /* JADX INFO: renamed from: e */
        public final ValueFormatter getF63194k() {
            return this.f192079i;
        }
    }

    /* JADX INFO: renamed from: xs1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"xs1/b$b", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3580b extends ValueFormatter {
        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public final String getFormattedValue(float f14) {
            String string = new LocalDate().withMonthOfYear(((int) f14) + 1).toString("MMM");
            string.getClass();
            return string;
        }
    }

    public b(BarChart barChart) {
        barChart.getClass();
        ViewPortHandler viewPortHandler = barChart.getViewPortHandler();
        Transformer transformer = barChart.getTransformer(YAxis.AxisDependency.LEFT);
        viewPortHandler.getClass();
        XAxis xAxis = barChart.getXAxis();
        xAxis.getClass();
        transformer.getClass();
        f fVar = new f(viewPortHandler, xAxis, transformer);
        fVar.f80604h = 270.0f;
        fVar.f80601e = new C3580b();
        this.f192076a = fVar;
        this.f192077b = new a(viewPortHandler, barChart.getAxisLeft(), transformer);
        c cVar = new c(barChart, barChart.getAnimator(), barChart.getViewPortHandler());
        cVar.f56990b = 0.75f;
        cVar.f56994f = Float.valueOf(0.0f);
        this.f192078c = cVar;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF159999a() {
        return this.f192076a;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF173486i() {
        return this.f192078c;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF160000b() {
        return this.f192077b;
    }
}
