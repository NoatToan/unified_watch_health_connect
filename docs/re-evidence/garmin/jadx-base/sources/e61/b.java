package e61;

import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import qz.h;
import yz.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Le61/b;", "Lqz/h;", "Ld00/a;", "Lcom/github/mikephil/charting/charts/CombinedChart;", "chart", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "Lc61/a;", "acclimationType", "<init>", "(Lcom/github/mikephil/charting/charts/CombinedChart;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lc61/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements h<d00.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h00.c f63165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f63166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d00.a f63167c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"e61/b$a", "Li00/b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends i00.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final ValueFormatter f63168i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c61.a aVar, ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
            super(viewPortHandler, yAxis, transformer);
            yAxis.getClass();
            transformer.getClass();
            this.f63168i = aVar == c61.a.HEAT ? new yz.h() : new f();
        }

        @Override // i00.b
        /* JADX INFO: renamed from: b */
        public final boolean getF157099j() {
            return false;
        }

        @Override // i00.b
        /* JADX INFO: renamed from: c */
        public final boolean getF157098i() {
            return false;
        }

        @Override // i00.b
        /* JADX INFO: renamed from: e, reason: from getter */
        public final ValueFormatter getF63168i() {
            return this.f63168i;
        }

        @Override // i00.b
        public final void g() {
        }

        @Override // i00.b
        public final void h() {
        }
    }

    public b(CombinedChart combinedChart, LocalDate localDate, LocalDate localDate2, c61.a aVar) {
        combinedChart.getClass();
        localDate.getClass();
        localDate2.getClass();
        aVar.getClass();
        ViewPortHandler viewPortHandler = combinedChart.getViewPortHandler();
        viewPortHandler.getClass();
        Transformer transformer = combinedChart.getTransformer(YAxis.AxisDependency.LEFT);
        XAxis xAxis = combinedChart.getXAxis();
        xAxis.getClass();
        transformer.getClass();
        h00.c cVar = new h00.c(viewPortHandler, xAxis, transformer);
        List<String> listE = pz.d.e(localDate, localDate2, 0);
        cVar.f80601e = new IndexAxisValueFormatter(listE);
        cVar.f80602f = listE.size();
        this.f63165a = cVar;
        this.f63166b = new a(aVar, viewPortHandler, combinedChart.getAxisLeft(), transformer);
        d00.a aVar2 = new d00.a(combinedChart, combinedChart.getAnimator(), viewPortHandler);
        aVar2.f56990b = 1.01f;
        this.f63167c = aVar2;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF157069d() {
        return this.f63165a;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF173486i() {
        return this.f63167c;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF157070e() {
        return this.f63166b;
    }
}
