package pr0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.github.mikephil.chartingv2.charts.LineChart;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.highlight.ChartHighlighter;
import com.github.mikephil.chartingv2.renderer.XAxisRenderer;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.Hours;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import p005kotlin.Metadata;
import po2.o;

/* JADX INFO: loaded from: classes8.dex */
@o13.e
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lpr0/j;", "Lpr0/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "measurementStepMinutes", "<init>", "(Landroid/content/Context;I)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends pr0.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f139626j = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f139627h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final pi0.e f139628i;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, int i14) {
        super(context);
        context.getClass();
        this.f139627h = i14;
        this.f139628i = new pi0.e(context);
    }

    @Override // oz.b
    public final ChartHighlighter<? super LineChart> m(LineChart lineChart) {
        lineChart.getClass();
        return new k(lineChart, new o(14));
    }

    @Override // pr0.a
    public final int r() {
        return 4;
    }

    @Override // pr0.a
    public final int s(DateTime dateTime, DateTime dateTime2) {
        return Hours.hoursBetween(dateTime, dateTime2).getHours();
    }

    @Override // pr0.a
    public final XAxisRenderer t(LineChart lineChart) {
        lineChart.getClass();
        mz.f fVar = new mz.f(lineChart.getViewPortHandler(), lineChart.getXAxis(), lineChart.getTransformer(YAxis.AxisDependency.LEFT), 4, 0);
        fVar.f121634i = 0;
        return fVar;
    }

    @Override // pr0.a
    public final List u(int i14, DateTime dateTime, DateTime dateTime2) {
        String strA;
        ArrayList arrayList = new ArrayList();
        if (dateTime == null || dateTime2 == null) {
            DateTime dateTimeNow = DateTime.now();
            dateTimeNow.getClass();
            dateTime = g22.k.o(1, dateTimeNow).withTimeAtStartOfDay();
            dateTime.getClass();
            dateTime2 = g22.k.b(1, dateTime).plusDays(1).withTimeAtStartOfDay();
            dateTime2.getClass();
        }
        MutableDateTime mutableDateTime = dateTime.toMutableDateTime();
        int i15 = 720 + i14;
        while (mutableDateTime.compareTo((ReadableInstant) dateTime2) <= 0) {
            if (i15 == mutableDateTime.getMinuteOfDay() % DateTimeConstants.MINUTES_PER_DAY) {
                DateTime dateTime3 = mutableDateTime.toDateTime();
                dateTime3.getClass();
                strA = this.f139628i.a(dateTime3, qi0.a.ABBREV_WEEKDAY);
            } else {
                strA = "";
            }
            arrayList.add(strA);
            mutableDateTime.addHours(1);
        }
        return arrayList;
    }

    @Override // pr0.a
    public final boolean v() {
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpr0/j$a;", "", "<init>", "()V", "", "Y_AXIS_LABEL_COUNT", "I", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
