package b81;

import c22.l3;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import h00.i;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import qz.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lb81/f;", "Lqz/h;", "Ld00/a;", "Lcom/github/mikephil/charting/charts/BarChart;", "chart", "Lorg/joda/time/LocalDate;", "startDate", "", "intervalType", "", "labelFormatPattern", "<init>", "(Lcom/github/mikephil/charting/charts/BarChart;Lorg/joda/time/LocalDate;ILjava/lang/String;)V", "a", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements h<d00.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f16403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f16406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f16407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d00.c f16408f;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"b81/f$b", "Li00/b;", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends i00.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final a f16409i;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"b81/f$b$a", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a extends ValueFormatter {
            @Override // com.github.mikephil.charting.formatter.ValueFormatter
            public final String getFormattedValue(float f14) {
                l3.f23124b.getClass();
                return l3.f23131i.format(Float.valueOf(f14));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
            super(viewPortHandler, yAxis, transformer);
            vb.h.o(viewPortHandler, yAxis, transformer);
            this.f16409i = new a();
        }

        @Override // i00.b
        /* JADX INFO: renamed from: e */
        public final ValueFormatter getF63194k() {
            return this.f16409i;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"b81/f$c", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends ValueFormatter {
        public c() {
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public final String getFormattedValue(float f14) {
            double d14 = ((double) f14) + 0.5d;
            f fVar = f.this;
            int i14 = fVar.f16404b;
            LocalDate localDate = fVar.f16403a;
            String string = (i14 == 10 ? localDate.plusWeeks((int) d14) : localDate.plusMonths((int) d14)).toString(fVar.f16405c);
            string.getClass();
            return string;
        }
    }

    static {
        new a(null);
    }

    public f(BarChart barChart, LocalDate localDate, int i14, String str) {
        barChart.getClass();
        localDate.getClass();
        str.getClass();
        this.f16403a = localDate;
        this.f16404b = i14;
        this.f16405c = str;
        ViewPortHandler viewPortHandler = barChart.getViewPortHandler();
        Transformer transformer = barChart.getTransformer(YAxis.AxisDependency.LEFT);
        viewPortHandler.getClass();
        XAxis xAxis = barChart.getXAxis();
        xAxis.getClass();
        transformer.getClass();
        i iVar = new i(viewPortHandler, xAxis, transformer);
        barChart.getXAxis().setCenterAxisLabels(true);
        iVar.f80601e = new c();
        iVar.f80602f = 14;
        iVar.f80603g = true;
        barChart.getXAxis().setLabelCount(14, true);
        iVar.f80604h = 270.0f;
        this.f16406d = iVar;
        this.f16407e = new b(viewPortHandler, barChart.getAxisLeft(), transformer);
        d00.c cVar = new d00.c(barChart, barChart.getAnimator(), viewPortHandler);
        cVar.f56990b = 0.3f;
        cVar.f56994f = Float.valueOf(40.0f);
        this.f16408f = cVar;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF107016d() {
        return this.f16406d;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF173486i() {
        return this.f16408f;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF107017e() {
        return this.f16407e;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lb81/f$a;", "", "<init>", "()V", "", "LABEL_COUNT", "I", "", "TOP_OFFSET", "F", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
