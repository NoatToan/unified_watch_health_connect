package vp;

import android.content.Context;
import c22.j0;
import c22.l3;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014BC\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011BC\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0012\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0013¨\u0006\u0015"}, d2 = {"Lvp/b;", "Lvp/i;", "Ld00/a;", "Lcom/github/mikephil/charting/charts/BarChart;", "chart", "Lmp/k;", "metric", "Lorg/joda/time/LocalDate;", "startDate", "", "intervalType", "", "barWidth", "", "isUsingMetric", "isNotStatuteUS", "<init>", "(Lcom/github/mikephil/charting/charts/BarChart;Lmp/k;Lorg/joda/time/LocalDate;IFZZ)V", "Lcom/github/mikephil/charting/charts/CombinedChart;", "(Lcom/github/mikephil/charting/charts/CombinedChart;Lmp/k;Lorg/joda/time/LocalDate;IFZZ)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends i<d00.a> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f179254k = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final mp.k f179255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f179256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f179257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f179258i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d00.c f179259j;

    /* JADX INFO: renamed from: vp.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"vp/b$b", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3346b extends ValueFormatter {
        public C3346b() {
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public final String getFormattedValue(float f14) {
            LocalDate localDatePlusDays = b.this.f179304b.plusDays(MathKt.b(((double) f14) + 0.5d));
            j0 j0Var = j0.f23099a;
            localDatePlusDays.getClass();
            j0Var.getClass();
            return j0.l(localDatePlusDays);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"vp/b$c", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends ValueFormatter {
        public c() {
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public final String getFormattedValue(float f14) {
            LocalDate localDatePlusDays = b.this.f179304b.plusDays(MathKt.b(((double) f14) + 0.5d));
            j0 j0Var = j0.f23099a;
            localDatePlusDays.getClass();
            j0Var.getClass();
            return j0.l(localDatePlusDays);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"vp/b$d", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends ValueFormatter {
        public d() {
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public final String getFormattedValue(float f14) {
            String string = b.this.f179304b.plusMonths(MathKt.b(((double) f14) + 0.5d)).toString("MMM");
            string.getClass();
            return string;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"vp/b$e", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends ValueFormatter {
        public e() {
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public final String getFormattedValue(float f14) {
            LocalDate localDatePlusDays = b.this.f179304b.plusDays(MathKt.b(((double) f14) + 0.5d));
            j0 j0Var = j0.f23099a;
            localDatePlusDays.getClass();
            j0Var.getClass();
            return j0.l(localDatePlusDays);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"vp/b$f", "Li00/b;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f extends i00.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final a f179264i;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"vp/b$f$a", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a extends ValueFormatter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f179265a;

            public a(b bVar) {
                this.f179265a = bVar;
            }

            @Override // com.github.mikephil.charting.formatter.ValueFormatter
            public final String getFormattedValue(float f14) {
                b bVar = this.f179265a;
                Context context = bVar.f179303a.getContext();
                context.getClass();
                Double dValueOf = Double.valueOf(f14);
                mp.k kVar = bVar.f179255f;
                if (kVar == null) {
                    s.m("metric");
                    throw null;
                }
                return wp.d.a(context, dValueOf, kVar, l3.f23135m, bVar.f179256g, bVar.f179257h);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(b bVar, ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
            super(viewPortHandler, yAxis, transformer);
            yAxis.getClass();
            this.f179264i = new a(bVar);
        }

        @Override // i00.b
        /* JADX INFO: renamed from: e */
        public final ValueFormatter getF63194k() {
            return this.f179264i;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(BarChart barChart, mp.k kVar, LocalDate localDate, int i14, float f14, boolean z14, boolean z15) {
        super(barChart, localDate, i14);
        barChart.getClass();
        kVar.getClass();
        localDate.getClass();
        a.a(f179254k, this.f179305c, this.f179304b);
        this.f179256g = true;
        this.f179257h = true;
        this.f179258i = new f(this, this.f179306d, this.f179303a.getAxisLeft(), this.f179307e);
        BarLineChartBase<?> barLineChartBase = this.f179303a;
        d00.c cVar = new d00.c((BarDataProvider) barLineChartBase, barLineChartBase.getAnimator(), this.f179303a.getViewPortHandler());
        this.f179259j = cVar;
        this.f179255f = kVar;
        this.f179256g = z14;
        this.f179257h = z15;
        cVar.f56990b = f14;
        cVar.f56991c = false;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF173486i() {
        return this.f179259j;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF63187e() {
        return this.f179258i;
    }

    @Override // vp.i
    public final void e(h hVar) {
        f179254k.getClass();
        hVar.f80602f = a.b(this.f179305c, this.f179304b);
        BarLineChartBase<?> barLineChartBase = this.f179303a;
        barLineChartBase.getXAxis().setLabelCount(hVar.f80602f, true);
        barLineChartBase.getXAxis().setCenterAxisLabels(true);
        hVar.f179300n = true;
        hVar.f80603g = true;
        hVar.f80601e = new C3346b();
    }

    @Override // vp.i
    public final void f(h hVar) {
        f179254k.getClass();
        int iB = a.b(this.f179305c, this.f179304b);
        hVar.f80602f = iB;
        hVar.f179302p = iB;
        BarLineChartBase<?> barLineChartBase = this.f179303a;
        barLineChartBase.getXAxis().setLabelCount(hVar.f80602f, true);
        barLineChartBase.getXAxis().setCenterAxisLabels(true);
        hVar.f179300n = true;
        hVar.f80603g = true;
        hVar.f80601e = new c();
    }

    @Override // vp.i
    public final void g(h hVar) {
        f179254k.getClass();
        hVar.f80602f = a.b(this.f179305c, this.f179304b);
        BarLineChartBase<?> barLineChartBase = this.f179303a;
        barLineChartBase.getXAxis().setLabelCount(hVar.f80602f, true);
        barLineChartBase.getXAxis().setCenterAxisLabels(true);
        hVar.f179299m = true;
        hVar.f80604h = 270.0f;
        hVar.f80601e = new d();
    }

    @Override // vp.i
    public final void h(h hVar) {
        f179254k.getClass();
        hVar.f80602f = a.b(this.f179305c, this.f179304b);
        BarLineChartBase<?> barLineChartBase = this.f179303a;
        barLineChartBase.getXAxis().setLabelCount(hVar.f80602f, true);
        barLineChartBase.getXAxis().setCenterAxisLabels(true);
        hVar.f179300n = true;
        hVar.f80603g = true;
        hVar.f80601e = new e();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvp/b$a;", "", "<init>", "()V", "", "BASE_BAR_WIDTH_PERCENT", "F", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static final float a(a aVar, int i14, LocalDate localDate) {
            aVar.getClass();
            int iB = b(i14, localDate);
            if (iB < 1) {
                iB = 1;
            }
            float f14 = (iB / 8) * 0.22f;
            if (f14 > 1.0f) {
                return 1.0f;
            }
            return f14;
        }

        public static int b(int i14, LocalDate localDate) {
            if (i14 != 3) {
                if (i14 != 4) {
                    return i14 != 5 ? 13 : 29;
                }
                return 8;
            }
            LocalDate localDateMinusDays = localDate.plusMonths(1).minusDays(1);
            localDateMinusDays.getClass();
            return oc.b.m(localDate, localDateMinusDays) + 1;
        }

        private a() {
        }
    }

    public /* synthetic */ b(BarChart barChart, mp.k kVar, LocalDate localDate, int i14, float f14, boolean z14, boolean z15, int i15, p005kotlin.jvm.internal.j jVar) {
        this(barChart, kVar, localDate, i14, (i15 & 16) != 0 ? a.a(f179254k, i14, localDate) : f14, z14, z15);
    }

    public /* synthetic */ b(CombinedChart combinedChart, mp.k kVar, LocalDate localDate, int i14, float f14, boolean z14, boolean z15, int i15, p005kotlin.jvm.internal.j jVar) {
        this(combinedChart, kVar, localDate, i14, (i15 & 16) != 0 ? a.a(f179254k, i14, localDate) : f14, z14, z15);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(CombinedChart combinedChart, mp.k kVar, LocalDate localDate, int i14, float f14, boolean z14, boolean z15) {
        super(combinedChart, localDate, i14);
        combinedChart.getClass();
        kVar.getClass();
        localDate.getClass();
        a.a(f179254k, this.f179305c, this.f179304b);
        this.f179256g = true;
        this.f179257h = true;
        this.f179258i = new f(this, this.f179306d, this.f179303a.getAxisLeft(), this.f179307e);
        BarLineChartBase<?> barLineChartBase = this.f179303a;
        d00.c cVar = new d00.c((BarDataProvider) barLineChartBase, barLineChartBase.getAnimator(), this.f179303a.getViewPortHandler());
        this.f179259j = cVar;
        this.f179255f = kVar;
        this.f179256g = z14;
        this.f179257h = z15;
        cVar.f56990b = f14;
        cVar.f56991c = false;
    }
}
