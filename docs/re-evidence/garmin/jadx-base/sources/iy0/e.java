package iy0;

import c22.j0;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.ArrayList;
import lc.u0;
import o53.f0;
import org.joda.time.LocalDate;
import org.joda.time.Weeks;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Liy0/e;", "Lqz/h;", "Ld00/a;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomBarChart;", "chart", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomBarChart;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "a", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements qz.h<d00.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f95783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f95784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewPortHandler f95785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Transformer f95786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h00.c f95787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i00.c f95788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d00.d f95789g;

    static {
        new a(null);
    }

    public e(CustomBarChart customBarChart, LocalDate localDate, LocalDate localDate2) {
        ArrayList arrayList;
        customBarChart.getClass();
        localDate.getClass();
        localDate2.getClass();
        this.f95783a = localDate;
        this.f95784b = localDate2;
        ViewPortHandler viewPortHandler = customBarChart.getViewPortHandler();
        this.f95785c = viewPortHandler;
        Transformer transformer = customBarChart.getTransformer(YAxis.AxisDependency.LEFT);
        this.f95786d = transformer;
        viewPortHandler.getClass();
        XAxis xAxis = customBarChart.getXAxis();
        xAxis.getClass();
        transformer.getClass();
        h00.c cVar = new h00.c(viewPortHandler, xAxis, transformer);
        if (f0.I(localDate, jg.b.J(localDate2)).c() > 28) {
            int weeks = Weeks.weeksBetween(localDate, localDate2).getWeeks();
            int i14 = weeks + 1;
            arrayList = new ArrayList(i14);
            for (int i15 = 0; i15 < i14; i15++) {
                arrayList.add("");
            }
            j0 j0Var = j0.f23099a;
            LocalDate localDate3 = this.f95783a;
            j0Var.getClass();
            arrayList.set(0, j0.l(localDate3));
            int size = arrayList.size() - 1;
            LocalDate localDatePlusWeeks = this.f95783a.plusWeeks(weeks);
            localDatePlusWeeks.getClass();
            arrayList.set(size, j0.l(localDatePlusWeeks));
        } else {
            int iE = u0.e(localDate, localDate2, 1);
            arrayList = new ArrayList(iE);
            for (int i16 = 0; i16 < iE; i16++) {
                arrayList.add("");
            }
            j0 j0Var2 = j0.f23099a;
            LocalDate localDate4 = this.f95783a;
            j0Var2.getClass();
            arrayList.set(0, j0.l(localDate4));
            arrayList.set(arrayList.size() - 1, j0.l(this.f95784b));
        }
        cVar.f80601e = new IndexAxisValueFormatter(arrayList);
        cVar.f80602f = arrayList.size();
        this.f95787e = cVar;
        ViewPortHandler viewPortHandler2 = this.f95785c;
        viewPortHandler2.getClass();
        YAxis axisLeft = customBarChart.getAxisLeft();
        axisLeft.getClass();
        Transformer transformer2 = this.f95786d;
        transformer2.getClass();
        i00.c cVar2 = new i00.c(viewPortHandler2, axisLeft, transformer2);
        cVar2.f86714d = new yz.j();
        this.f95788f = cVar2;
        ChartAnimator animator = customBarChart.getAnimator();
        animator.getClass();
        ViewPortHandler viewPortHandler3 = this.f95785c;
        viewPortHandler3.getClass();
        d00.d dVar = new d00.d(customBarChart, animator, viewPortHandler3, false, null, 24, null);
        dVar.f56990b = 0.4f;
        dVar.f56995g = Float.valueOf(20.0f);
        this.f95789g = dVar;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF179276e() {
        return this.f95787e;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF173486i() {
        return this.f95789g;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF179277f() {
        return this.f95788f;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Liy0/e$a;", "", "<init>", "()V", "", "CHART_EXTRA_BOTTOM_OFFSET", "F", "BAR_WIDTH", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
