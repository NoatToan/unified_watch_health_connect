package d41;

import android.graphics.Paint;
import c22.j0;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.Days;
import p005kotlin.Metadata;
import qz.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ld41/d;", "Lqz/h;", "Lf00/c;", "Lcom/github/mikephil/charting/charts/CombinedChart;", "chart", "Lorg/joda/time/DateTime;", "startDateTime", "endDateTime", "<init>", "(Lcom/github/mikephil/charting/charts/CombinedChart;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements h<f00.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewPortHandler f57463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Transformer f57464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f57465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f57466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f00.c f57467e;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"d41/d$a", "Li00/b;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends i00.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final yz.e f57468i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
            super(viewPortHandler, yAxis, transformer);
            vb.h.o(viewPortHandler, yAxis, transformer);
            this.f57468i = new yz.e();
        }

        @Override // i00.b
        /* JADX INFO: renamed from: e */
        public final ValueFormatter getF63194k() {
            return this.f57468i;
        }
    }

    public d(CombinedChart combinedChart, DateTime dateTime, DateTime dateTime2) {
        combinedChart.getClass();
        dateTime.getClass();
        dateTime2.getClass();
        ViewPortHandler viewPortHandler = combinedChart.getViewPortHandler();
        this.f57463a = viewPortHandler;
        Transformer transformer = combinedChart.getTransformer(YAxis.AxisDependency.LEFT);
        this.f57464b = transformer;
        viewPortHandler.getClass();
        XAxis xAxis = combinedChart.getXAxis();
        xAxis.getClass();
        transformer.getClass();
        f fVar = new f(viewPortHandler, xAxis, transformer);
        int days = Days.daysBetween(dateTime, dateTime2).getDays() + 1;
        ArrayList arrayList = new ArrayList(days);
        for (int i14 = 0; i14 < days; i14++) {
            arrayList.add("");
        }
        j0.f23099a.getClass();
        arrayList.set(0, j0.k(dateTime, 'S'));
        arrayList.set(arrayList.size() - 1, j0.k(dateTime2, 'S'));
        fVar.f80601e = new IndexAxisValueFormatter(arrayList);
        fVar.f80602f = arrayList.size();
        fVar.f80603g = true;
        this.f57465c = fVar;
        this.f57466d = new a(this.f57463a, combinedChart.getAxisLeft(), this.f57464b);
        ChartAnimator animator = combinedChart.getAnimator();
        animator.getClass();
        ViewPortHandler viewPortHandler2 = this.f57463a;
        viewPortHandler2.getClass();
        f00.c cVar = new f00.c(combinedChart, animator, viewPortHandler2);
        cVar.f67652c = Paint.Cap.ROUND;
        this.f57467e = cVar;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF93102d() {
        return this.f57465c;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF173486i() {
        return this.f57467e;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF93103e() {
        return this.f57466d;
    }
}
