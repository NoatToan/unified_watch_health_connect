package vp;

import c22.j0;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.renderer.ScatterChartRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lvp/g;", "Lvp/i;", "Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;", "Lcom/github/mikephil/charting/charts/CombinedChart;", "chart", "Lorg/joda/time/LocalDate;", "startDate", "", "intervalType", "<init>", "(Lcom/github/mikephil/charting/charts/CombinedChart;Lorg/joda/time/LocalDate;I)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends i<ScatterChartRenderer> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LocalDate f179293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f179294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ScatterChartRenderer f179295h;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"vp/g$a", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends ValueFormatter {
        public a() {
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public final String getFormattedValue(float f14) {
            LocalDate localDatePlusDays = g.this.f179304b.plusDays(MathKt.b(((double) f14) + 0.5d));
            j0 j0Var = j0.f23099a;
            localDatePlusDays.getClass();
            j0Var.getClass();
            return j0.l(localDatePlusDays);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"vp/g$b", "Li00/b;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends i00.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f179297i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final yz.e f179298j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
            super(viewPortHandler, yAxis, transformer);
            yAxis.getClass();
            this.f179297i = true;
            this.f179298j = new yz.e();
        }

        @Override // i00.b
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF179291i() {
            return this.f179297i;
        }

        @Override // i00.b
        /* JADX INFO: renamed from: e */
        public final ValueFormatter getF63194k() {
            return this.f179298j;
        }

        @Override // i00.b
        public final void g() {
            this.f179297i = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CombinedChart combinedChart, LocalDate localDate, int i14) {
        LocalDate localDatePlusDays;
        super(combinedChart, localDate, i14);
        combinedChart.getClass();
        localDate.getClass();
        if (i14 == 3) {
            LocalDate localDateMinusDays = localDate.plusMonths(1).minusDays(1);
            localDateMinusDays.getClass();
            localDatePlusDays = localDate.plusDays(oc.b.m(localDate, localDateMinusDays) - 1);
            localDatePlusDays.getClass();
        } else if (i14 == 4) {
            localDatePlusDays = localDate.plusDays(6);
            localDatePlusDays.getClass();
        } else if (i14 == 5) {
            localDatePlusDays = localDate.plusDays(27);
            localDatePlusDays.getClass();
        } else if (i14 != 6) {
            localDatePlusDays = localDate.plusDays(6);
            localDatePlusDays.getClass();
        } else {
            localDatePlusDays = localDate.plusMonths(11);
            localDatePlusDays.getClass();
        }
        this.f179293f = localDatePlusDays;
        this.f179294g = new b(this.f179306d, combinedChart.getAxisLeft(), this.f179307e);
        this.f179295h = new ScatterChartRenderer(combinedChart, combinedChart.getAnimator(), combinedChart.getViewPortHandler());
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF173486i() {
        return this.f179295h;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF63187e() {
        return this.f179294g;
    }

    @Override // vp.i
    public final void e(h hVar) {
        hVar.f80602f = 29;
        hVar.f179300n = true;
        hVar.f80601e = new IndexAxisValueFormatter(pz.d.e(this.f179304b, this.f179293f, 0));
    }

    @Override // vp.i
    public final void f(h hVar) {
        LocalDate localDate = this.f179304b;
        LocalDate localDateMinusDays = localDate.plusMonths(1).minusDays(1);
        localDateMinusDays.getClass();
        int iM = oc.b.m(localDate, localDateMinusDays) + 1;
        hVar.f80602f = iM;
        hVar.f179302p = iM;
        BarLineChartBase<?> barLineChartBase = this.f179303a;
        barLineChartBase.getXAxis().setLabelCount(hVar.f80602f, true);
        barLineChartBase.getXAxis().setCenterAxisLabels(true);
        hVar.f179300n = true;
        hVar.f80603g = true;
        hVar.f80601e = new a();
    }

    @Override // vp.i
    public final void g(h hVar) {
        hVar.f80602f = 13;
        hVar.f179299m = true;
        hVar.f80604h = 270.0f;
        hVar.f80601e = new IndexAxisValueFormatter(pz.d.e(this.f179304b, this.f179293f, 1));
    }

    @Override // vp.i
    public final void h(h hVar) {
        hVar.f80602f = 8;
        hVar.f179300n = true;
        hVar.f80601e = new IndexAxisValueFormatter(pz.d.e(this.f179304b, this.f179293f, 0));
    }
}
