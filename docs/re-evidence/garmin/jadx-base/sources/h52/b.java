package h52;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import lc.u0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lh52/b;", "Lqz/h;", "Ld00/a;", "Lcom/github/mikephil/charting/charts/BarChart;", "chart", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "<init>", "(Lcom/github/mikephil/charting/charts/BarChart;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "gcm-wheelchair_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements qz.h<d00.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h00.c f82108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f82109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d00.c f82110c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"h52/b$a", "Li00/b;", "gcm-wheelchair_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends i00.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final yz.g f82111i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
            super(viewPortHandler, yAxis, transformer);
            vb.h.o(viewPortHandler, yAxis, transformer);
            this.f82111i = new yz.g();
        }

        @Override // i00.b
        /* JADX INFO: renamed from: e */
        public final ValueFormatter getF63194k() {
            return this.f82111i;
        }
    }

    public b(BarChart barChart, LocalDate localDate, LocalDate localDate2) {
        barChart.getClass();
        localDate.getClass();
        localDate2.getClass();
        ViewPortHandler viewPortHandler = barChart.getViewPortHandler();
        Transformer transformer = barChart.getTransformer(YAxis.AxisDependency.LEFT);
        viewPortHandler.getClass();
        XAxis xAxis = barChart.getXAxis();
        xAxis.getClass();
        transformer.getClass();
        h00.c cVar = new h00.c(viewPortHandler, xAxis, transformer);
        cVar.f80601e = new IndexAxisValueFormatter(pz.d.e(localDate, localDate2, 0));
        cVar.f80602f = u0.e(localDate, localDate2, 1);
        this.f82108a = cVar;
        this.f82109b = new a(viewPortHandler, barChart.getAxisLeft(), transformer);
        d00.c cVar2 = new d00.c(barChart, barChart.getAnimator(), barChart.getViewPortHandler());
        cVar2.f56990b = 0.33f;
        cVar2.f56991c = true;
        this.f82110c = cVar2;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF107016d() {
        return this.f82108a;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF173486i() {
        return this.f82110c;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF107017e() {
        return this.f82109b;
    }
}
