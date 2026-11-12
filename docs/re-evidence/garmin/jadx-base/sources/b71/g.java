package b71;

import android.graphics.Paint;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lb71/g;", "Lqz/h;", "Lf00/c;", "Lcom/github/mikephil/charting/charts/LineChart;", "chart", "Lorg/joda/time/DateTime;", "startDate", "endDate", "<init>", "(Lcom/github/mikephil/charting/charts/LineChart;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements qz.h<f00.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h00.c f16337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f16338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f00.a f16339c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"b71/g$b", "Li00/b;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends i00.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final yz.g f16340i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
            super(viewPortHandler, yAxis, transformer);
            yAxis.getClass();
            transformer.getClass();
            this.f16340i = new yz.g();
        }

        @Override // i00.b
        /* JADX INFO: renamed from: e */
        public final ValueFormatter getF63194k() {
            return this.f16340i;
        }
    }

    static {
        new a(null);
    }

    public g(LineChart lineChart, DateTime dateTime, DateTime dateTime2) {
        lineChart.getClass();
        dateTime.getClass();
        dateTime2.getClass();
        ViewPortHandler viewPortHandler = lineChart.getViewPortHandler();
        viewPortHandler.getClass();
        Transformer transformer = lineChart.getTransformer(YAxis.AxisDependency.LEFT);
        h00.c cVar = new h00.c(viewPortHandler, com.nimbusds.jose.shaded.gson.internal.a.e(lineChart, transformer), transformer);
        LocalDate localDate = dateTime.toLocalDate();
        localDate.getClass();
        LocalDate localDate2 = dateTime2.toLocalDate();
        localDate2.getClass();
        List<String> listE = pz.d.e(localDate, localDate2, 0);
        cVar.f80601e = new IndexAxisValueFormatter(listE);
        cVar.f80602f = listE.size();
        cVar.f80605i = 12.0f;
        this.f16337a = cVar;
        b bVar = new b(viewPortHandler, lineChart.getAxisLeft(), transformer);
        bVar.f86717g = 12.0f;
        bVar.f86715e = 5;
        bVar.f86716f = true;
        this.f16338b = bVar;
        ChartAnimator animator = lineChart.getAnimator();
        animator.getClass();
        f00.a aVar = new f00.a(lineChart, animator, viewPortHandler);
        aVar.f67652c = Paint.Cap.ROUND;
        aVar.f67653d = Float.valueOf(76.0f);
        aVar.f67654e = Float.valueOf(30.0f);
        this.f16339c = aVar;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF107016d() {
        return this.f16337a;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF173486i() {
        return this.f16339c;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF107017e() {
        return this.f16338b;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lb71/g$a;", "", "<init>", "()V", "", "Y_AXIS_OFFSET", "F", "", "LABEL_COUNT", "I", "CHART_TOP_OFFSET", "CHART_BOTTOM_OFFSET", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
