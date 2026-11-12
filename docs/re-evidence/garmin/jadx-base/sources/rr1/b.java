package rr1;

import android.graphics.Paint;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import lc.u0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import qz.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lrr1/b;", "Lqz/h;", "Lf00/c;", "Lcom/github/mikephil/charting/charts/LineChart;", "chart", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "<init>", "(Lcom/github/mikephil/charting/charts/LineChart;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements h<f00.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h00.c f154256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f154257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f00.c f154258c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"rr1/b$a", "Li00/b;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends i00.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final yz.e f154259i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
            super(viewPortHandler, yAxis, transformer);
            vb.h.o(viewPortHandler, yAxis, transformer);
            this.f154259i = new yz.e();
        }

        @Override // i00.b
        /* JADX INFO: renamed from: e */
        public final ValueFormatter getF63194k() {
            return this.f154259i;
        }
    }

    public b(LineChart lineChart, LocalDate localDate, LocalDate localDate2) {
        lineChart.getClass();
        localDate.getClass();
        localDate2.getClass();
        ViewPortHandler viewPortHandler = lineChart.getViewPortHandler();
        Transformer transformer = lineChart.getTransformer(YAxis.AxisDependency.LEFT);
        viewPortHandler.getClass();
        h00.c cVar = new h00.c(viewPortHandler, com.nimbusds.jose.shaded.gson.internal.a.e(lineChart, transformer), transformer);
        cVar.f80601e = new IndexAxisValueFormatter(pz.d.e(localDate, localDate2, 0));
        cVar.f80602f = u0.e(localDate, localDate2, 1);
        this.f154256a = cVar;
        this.f154257b = new a(viewPortHandler, lineChart.getAxisLeft(), transformer);
        ChartAnimator animator = lineChart.getAnimator();
        animator.getClass();
        f00.c cVar2 = new f00.c(lineChart, animator, viewPortHandler);
        cVar2.f67652c = Paint.Cap.ROUND;
        this.f154258c = cVar2;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF107016d() {
        return this.f154256a;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF173486i() {
        return this.f154258c;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF107017e() {
        return this.f154257b;
    }
}
