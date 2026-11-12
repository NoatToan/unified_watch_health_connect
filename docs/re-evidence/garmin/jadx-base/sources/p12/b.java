package p12;

import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
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
import p005kotlin.jvm.internal.j;
import pz.d;
import qz.h;
import yz.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lp12/b;", "Lqz/h;", "Ld00/a;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomBarChart;", "chart", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomBarChart;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements h<d00.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f134908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2562b f134909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d00.c f134910c;

    /* JADX INFO: renamed from: p12.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"p12/b$b", "Li00/b;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2562b extends i00.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f134911i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final e f134912j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2562b(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
            super(viewPortHandler, yAxis, transformer);
            yAxis.getClass();
            this.f134911i = true;
            this.f134912j = new e();
        }

        @Override // i00.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF134911i() {
            return this.f134911i;
        }

        @Override // i00.b
        /* JADX INFO: renamed from: b */
        public final boolean getF63193j() {
            return false;
        }

        @Override // i00.b
        /* JADX INFO: renamed from: e */
        public final ValueFormatter getF63194k() {
            return this.f134912j;
        }

        @Override // i00.b
        public final void f() {
            this.f134911i = false;
        }

        @Override // i00.b
        public final void g() {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"p12/b$c", "Lh00/b;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends h00.b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f134913m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer) {
            super(viewPortHandler, xAxis, transformer);
            xAxis.getClass();
            this.f134913m = true;
        }

        @Override // h00.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF134913m() {
            return this.f134913m;
        }

        @Override // h00.b
        public final void b() {
            this.f134913m = false;
        }
    }

    static {
        new a(null);
    }

    public b(CustomBarChart customBarChart, LocalDate localDate, LocalDate localDate2) {
        customBarChart.getClass();
        localDate.getClass();
        localDate2.getClass();
        ViewPortHandler viewPortHandler = customBarChart.getViewPortHandler();
        viewPortHandler.getClass();
        Transformer transformer = customBarChart.getTransformer(YAxis.AxisDependency.LEFT);
        transformer.getClass();
        c cVar = new c(viewPortHandler, customBarChart.getXAxis(), transformer);
        List<String> listE = d.e(localDate, localDate2, 1);
        cVar.f80601e = new IndexAxisValueFormatter(listE);
        cVar.f80602f = listE.size();
        this.f134908a = cVar;
        C2562b c2562b = new C2562b(viewPortHandler, customBarChart.getAxisLeft(), transformer);
        c2562b.f86715e = 6;
        c2562b.f86716f = false;
        this.f134909b = c2562b;
        d00.c cVar2 = new d00.c(customBarChart, customBarChart.getAnimator(), viewPortHandler);
        cVar2.f56994f = Float.valueOf(0.0f);
        cVar2.f56995g = Float.valueOf(20.0f);
        cVar2.f56990b = 0.7f;
        this.f134910c = cVar2;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF57459d() {
        return this.f134908a;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF173486i() {
        return this.f134910c;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF57460e() {
        return this.f134909b;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lp12/b$a;", "", "<init>", "()V", "", "CHART_EXTRA_TOP_OFFSET", "F", "CHART_EXTRA_BOTTOM_OFFSET", "MONTHLY_SUMMARY_BAR_WIDTH_PERCENT", "", "MONTHLY_Y_AXIS_LABELS_COUNT", "I", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
