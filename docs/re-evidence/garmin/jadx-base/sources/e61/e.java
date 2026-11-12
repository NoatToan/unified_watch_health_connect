package e61;

import android.graphics.Paint;
import com.github.mikephil.charting.animation.ChartAnimator;
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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Le61/e;", "Lqz/h;", "Lf00/c;", "Lcom/github/mikephil/charting/charts/CombinedChart;", "chart", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "Lc61/a;", "acclimationType", "<init>", "(Lcom/github/mikephil/charting/charts/CombinedChart;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lc61/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements h<f00.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h00.c f63189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f63190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f00.c f63191c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"e61/e$a", "Li00/b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends i00.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f63192i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f63193j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final ValueFormatter f63194k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c61.a aVar, ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
            super(viewPortHandler, yAxis, transformer);
            yAxis.getClass();
            transformer.getClass();
            this.f63192i = true;
            this.f63193j = true;
            this.f63194k = aVar == c61.a.HEAT ? new yz.h() : new f();
        }

        @Override // i00.b
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF63193j() {
            return this.f63193j;
        }

        @Override // i00.b
        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getF63192i() {
            return this.f63192i;
        }

        @Override // i00.b
        /* JADX INFO: renamed from: e, reason: from getter */
        public final ValueFormatter getF63194k() {
            return this.f63194k;
        }

        @Override // i00.b
        public final void g() {
            this.f63193j = false;
        }

        @Override // i00.b
        public final void h() {
            this.f63192i = false;
        }
    }

    public e(CombinedChart combinedChart, LocalDate localDate, LocalDate localDate2, c61.a aVar) {
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
        this.f63189a = cVar;
        this.f63190b = new a(aVar, viewPortHandler, combinedChart.getAxisLeft(), transformer);
        ChartAnimator animator = combinedChart.getAnimator();
        animator.getClass();
        f00.c cVar2 = new f00.c(combinedChart, animator, viewPortHandler);
        cVar2.f67652c = Paint.Cap.ROUND;
        this.f63191c = cVar2;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF157069d() {
        return this.f63189a;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF173486i() {
        return this.f63191c;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF157070e() {
        return this.f63190b;
    }
}
