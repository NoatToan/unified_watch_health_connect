package ym1;

import android.content.Context;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import h00.i;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.math.MathKt;
import qz.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lym1/f;", "Lqz/h;", "Ld00/c;", "Lcom/github/mikephil/charting/charts/BarChart;", "chart", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "<init>", "(Lcom/github/mikephil/charting/charts/BarChart;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements h<d00.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f198122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vm1.b f198123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d00.c f198124c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ym1/f$b", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends ValueFormatter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f198125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<String> f198126b;

        public b(int i14, List<String> list) {
            this.f198125a = i14;
            this.f198126b = list;
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public final String getFormattedValue(float f14) {
            int i14 = this.f198125a;
            int iC = MathKt.c(f14 / (52 / (i14 - 1.0f)));
            return (iC < 0 || iC >= i14) ? "" : this.f198126b.get(iC);
        }
    }

    static {
        new a(null);
    }

    public f(BarChart barChart, LocalDate localDate, LocalDate localDate2) {
        barChart.getClass();
        localDate.getClass();
        localDate2.getClass();
        ViewPortHandler viewPortHandler = barChart.getViewPortHandler();
        Transformer transformer = barChart.getTransformer(YAxis.AxisDependency.LEFT);
        viewPortHandler.getClass();
        XAxis xAxis = barChart.getXAxis();
        xAxis.getClass();
        transformer.getClass();
        i iVar = new i(viewPortHandler, xAxis, transformer);
        List<String> listE = pz.d.e(localDate, localDate2, 5);
        iVar.f80601e = new b(listE.size(), listE);
        iVar.f80603g = true;
        iVar.f80604h = 270.0f;
        this.f198122a = iVar;
        YAxis axisLeft = barChart.getAxisLeft();
        axisLeft.getClass();
        vm1.b bVar = new vm1.b(viewPortHandler, axisLeft, transformer);
        Context context = barChart.getContext();
        context.getClass();
        bVar.f86714d = new yz.d(context);
        this.f198123b = bVar;
        d00.c cVar = new d00.c(barChart, barChart.getAnimator(), barChart.getViewPortHandler());
        cVar.f56990b = 0.66f;
        cVar.f56991c = true;
        this.f198124c = cVar;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF159999a() {
        return this.f198122a;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF173486i() {
        return this.f198124c;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF160000b() {
        return this.f198123b;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lym1/f$a;", "", "<init>", "()V", "", "DURATION_BAR_WIDTH_PERCENT_WEEKLY", "F", "LABELS_ROTATION_ANGLE_270", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
