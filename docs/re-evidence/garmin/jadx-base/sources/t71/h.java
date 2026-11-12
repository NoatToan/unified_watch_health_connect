package t71;

import c22.j0;
import c22.l3;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import h00.i;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lt71/h;", "Lqz/h;", "Lf00/c;", "Lcom/github/mikephil/charting/charts/LineChart;", "chart", "Lorg/joda/time/LocalDate;", "startDate", "", "intervalType", "<init>", "(Lcom/github/mikephil/charting/charts/LineChart;Lorg/joda/time/LocalDate;I)V", "a", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements qz.h<f00.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f163106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f163107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f163108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f163109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f163110e;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"t71/h$b", "Li00/b;", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends i00.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final a f163111i;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"t71/h$b$a", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a extends ValueFormatter {
            @Override // com.github.mikephil.charting.formatter.ValueFormatter
            public final String getFormattedValue(float f14) {
                l3.f23124b.getClass();
                String str = l3.f23131i.format(Float.valueOf(f14));
                str.getClass();
                return str;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
            super(viewPortHandler, yAxis, transformer);
            vb.h.o(viewPortHandler, yAxis, transformer);
            this.f163111i = new a();
        }

        @Override // i00.b
        /* JADX INFO: renamed from: e */
        public final ValueFormatter getF63194k() {
            return this.f163111i;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"t71/h$c", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends ValueFormatter {
        public c() {
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public final String getFormattedValue(float f14) {
            h hVar = h.this;
            int i14 = hVar.f163107b;
            LocalDate localDate = hVar.f163106a;
            if (i14 != 10) {
                String string = localDate.plusMonths((int) f14).toString("MMM");
                string.getClass();
                return string;
            }
            j0 j0Var = j0.f23099a;
            LocalDate localDatePlusWeeks = localDate.plusWeeks((int) f14);
            localDatePlusWeeks.getClass();
            j0Var.getClass();
            return j0.l(localDatePlusWeeks);
        }
    }

    static {
        new a(null);
    }

    public h(LineChart lineChart, LocalDate localDate, int i14) {
        lineChart.getClass();
        localDate.getClass();
        this.f163106a = localDate;
        this.f163107b = i14;
        ViewPortHandler viewPortHandler = lineChart.getViewPortHandler();
        Transformer transformer = lineChart.getTransformer(YAxis.AxisDependency.LEFT);
        viewPortHandler.getClass();
        i iVar = new i(viewPortHandler, com.nimbusds.jose.shaded.gson.internal.a.e(lineChart, transformer), transformer);
        iVar.f80601e = new c();
        iVar.f80602f = 12;
        iVar.f80603g = true;
        iVar.f80604h = 270.0f;
        this.f163108c = iVar;
        b bVar = new b(viewPortHandler, lineChart.getAxisLeft(), transformer);
        bVar.f86717g = 12.0f;
        this.f163109d = bVar;
        ChartAnimator animator = lineChart.getAnimator();
        animator.getClass();
        this.f163110e = new f(lineChart, animator, viewPortHandler);
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF107016d() {
        return this.f163108c;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF173486i() {
        return this.f163110e;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF107017e() {
        return this.f163109d;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt71/h$a;", "", "<init>", "()V", "", "LABEL_COUNT", "I", "", "LEFT_AXIS_OFFSET", "F", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
