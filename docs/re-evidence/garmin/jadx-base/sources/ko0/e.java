package ko0;

import android.graphics.Paint;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import h00.i;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;
import qz.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lko0/e;", "Lqz/h;", "Lf00/c;", "Lcom/github/mikephil/charting/charts/LineChart;", "chart", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "<init>", "(Lcom/github/mikephil/charting/charts/LineChart;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "gcm-heart-rate_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements h<f00.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f105763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i00.d f105764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f00.c f105765c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ko0/e$a", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-heart-rate_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends ValueFormatter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f105766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<String> f105767b;

        public a(i iVar, List<String> list) {
            this.f105766a = iVar;
            this.f105767b = list;
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public final String getFormattedValue(float f14) {
            int iC = MathKt.c(f14 / (52 / (this.f105766a.f80602f - 1.0f)));
            if (iC < 0) {
                return "";
            }
            List<String> list = this.f105767b;
            return iC < list.size() ? list.get(iC) : "";
        }
    }

    public e(LineChart lineChart, LocalDate localDate, LocalDate localDate2) {
        lineChart.getClass();
        localDate.getClass();
        localDate2.getClass();
        ViewPortHandler viewPortHandler = lineChart.getViewPortHandler();
        Transformer transformer = lineChart.getTransformer(YAxis.AxisDependency.LEFT);
        viewPortHandler.getClass();
        i iVar = new i(viewPortHandler, com.nimbusds.jose.shaded.gson.internal.a.e(lineChart, transformer), transformer);
        List<String> listE = pz.d.e(localDate, localDate2, 5);
        iVar.f80601e = new a(iVar, listE);
        iVar.f80602f = listE.size();
        iVar.f80603g = true;
        iVar.f80604h = 270.0f;
        this.f105763a = iVar;
        YAxis axisLeft = lineChart.getAxisLeft();
        axisLeft.getClass();
        this.f105764b = new i00.d(viewPortHandler, axisLeft, transformer);
        ChartAnimator animator = lineChart.getAnimator();
        animator.getClass();
        f00.c cVar = new f00.c(lineChart, animator, viewPortHandler);
        cVar.f67652c = Paint.Cap.ROUND;
        this.f105765c = cVar;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF101351a() {
        return this.f105763a;
    }

    @Override // qz.h
    public final DataRenderer c() {
        return this.f105765c;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF101352b() {
        return this.f105764b;
    }
}
