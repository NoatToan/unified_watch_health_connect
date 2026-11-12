package ym1;

import android.content.Context;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import lc.u0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import qz.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lym1/b;", "Lqz/h;", "Ld00/c;", "Lcom/github/mikephil/charting/charts/BarChart;", "chart", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "<init>", "(Lcom/github/mikephil/charting/charts/BarChart;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements h<d00.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h00.c f198106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vm1.b f198107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d00.c f198108c;

    static {
        new a(null);
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
        this.f198106a = cVar;
        YAxis axisLeft = barChart.getAxisLeft();
        axisLeft.getClass();
        vm1.b bVar = new vm1.b(viewPortHandler, axisLeft, transformer);
        Context context = barChart.getContext();
        context.getClass();
        bVar.f86714d = new yz.d(context);
        this.f198107b = bVar;
        d00.c cVar2 = new d00.c(barChart, barChart.getAnimator(), barChart.getViewPortHandler());
        cVar2.f56990b = 0.33f;
        cVar2.f56991c = true;
        this.f198108c = cVar2;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF107016d() {
        return this.f198106a;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF173486i() {
        return this.f198108c;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF107017e() {
        return this.f198107b;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lym1/b$a;", "", "<init>", "()V", "", "DURATION_BAR_WIDTH_PERCENT", "F", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
