package gp1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lgp1/e;", "Lqz/h;", "Ld00/a;", "Lcom/github/mikephil/charting/charts/BarChart;", "chart", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "<init>", "(Lcom/github/mikephil/charting/charts/BarChart;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "a", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements qz.h<d00.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h00.c f78444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f78445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d00.c f78446c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"gp1/e$b", "Li00/b;", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends i00.b {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
            super(viewPortHandler, yAxis, transformer);
            vb.h.o(viewPortHandler, yAxis, transformer);
        }
    }

    static {
        new a(null);
    }

    public e(BarChart barChart, LocalDate localDate, LocalDate localDate2) {
        barChart.getClass();
        localDate.getClass();
        localDate2.getClass();
        Context context = barChart.getContext();
        ViewPortHandler viewPortHandler = barChart.getViewPortHandler();
        Transformer transformer = barChart.getTransformer(YAxis.AxisDependency.LEFT);
        viewPortHandler.getClass();
        XAxis xAxis = barChart.getXAxis();
        xAxis.getClass();
        transformer.getClass();
        h00.c cVar = new h00.c(viewPortHandler, xAxis, transformer);
        cVar.f80601e = new IndexAxisValueFormatter(pz.d.e(localDate, localDate2, 0));
        cVar.f80602f = u0.e(localDate, localDate2, 1);
        this.f78444a = cVar;
        b bVar = new b(viewPortHandler, barChart.getAxisLeft(), transformer);
        bVar.f86714d = new yz.e();
        bVar.f86715e = 4;
        this.f78445b = bVar;
        d00.c cVar2 = new d00.c(barChart, barChart.getAnimator(), barChart.getViewPortHandler());
        cVar2.f56990b = 0.66f;
        cVar2.f56991c = true;
        cVar2.f56994f = Float.valueOf(context.getResources().getDimension(R.dimen.spacing_normal));
        this.f78446c = cVar2;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF159999a() {
        return this.f78444a;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF173486i() {
        return this.f78446c;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF160000b() {
        return this.f78445b;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgp1/e$a;", "", "<init>", "()V", "", "BAR_WIDTH_PERCENT", "F", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
