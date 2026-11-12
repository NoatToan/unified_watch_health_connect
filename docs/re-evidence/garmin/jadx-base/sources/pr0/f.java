package pr0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.github.mikephil.chartingv2.charts.LineChart;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.highlight.ChartHighlighter;
import com.github.mikephil.chartingv2.renderer.XAxisRenderer;
import java.util.ArrayList;
import java.util.List;
import o13.p;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Metadata;
import p13.x;
import p13.y;
import p3.q1;

/* JADX INFO: loaded from: classes8.dex */
@o13.e
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lpr0/f;", "Lpr0/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends pr0.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f139616j = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final pi0.e f139617h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p<String, String> f139618i;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(context);
        context.getClass();
        this.f139617h = new pi0.e(context);
    }

    @Override // oz.b
    public final ChartHighlighter<? super LineChart> m(LineChart lineChart) {
        lineChart.getClass();
        return new k(lineChart, new q1(lineChart, 23));
    }

    @Override // pr0.a
    public final int r() {
        return 4;
    }

    @Override // pr0.a
    public final int s(DateTime dateTime, DateTime dateTime2) {
        return Days.daysBetween(dateTime, dateTime2).getDays();
    }

    @Override // pr0.a
    public final XAxisRenderer t(LineChart lineChart) {
        lineChart.getClass();
        mz.f fVar = new mz.f(lineChart.getViewPortHandler(), lineChart.getXAxis(), lineChart.getTransformer(YAxis.AxisDependency.LEFT), 1, 0);
        fVar.f121634i = 0;
        return fVar;
    }

    @Override // pr0.a
    public final List u(int i14, DateTime dateTime, DateTime dateTime2) {
        String str;
        String str2;
        DateTime dateTimeMinusDays = (dateTime != null || dateTime2 == null) ? dateTime : dateTime2.minusDays(27);
        if (dateTime2 == null && dateTime != null) {
            dateTime2 = dateTime.plusDays(27);
        }
        int i15 = 0;
        if (dateTimeMinusDays == null || dateTime2 == null) {
            ArrayList arrayList = new ArrayList(28);
            while (i15 < 28) {
                arrayList.add("");
                i15++;
            }
            return arrayList;
        }
        DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("M/dd");
        dateTimeFormatterForPattern.getClass();
        List<String> listE = fz.a.e(this.f134441a, 0, dateTimeMinusDays, dateTime2, dateTimeFormatterForPattern);
        if (this.f139618i == null) {
            return listE;
        }
        ArrayList arrayList2 = new ArrayList(y.r(listE, 10));
        ArrayList arrayList3 = (ArrayList) listE;
        for (Object obj : arrayList3) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                x.q();
                throw null;
            }
            String strH = (String) obj;
            if (i15 == 0) {
                p<String, String> pVar = this.f139618i;
                if (pVar != null && (str2 = pVar.f128594a) != null) {
                    strH = str2;
                }
            } else if (i15 == arrayList3.size() - 1) {
                p<String, String> pVar2 = this.f139618i;
                if (pVar2 != null && (str = pVar2.f128595b) != null) {
                    strH = com.nimbusds.jose.shaded.gson.internal.a.h(str, " (", strH, ")");
                }
            } else {
                strH = "";
            }
            arrayList2.add(strH);
            i15 = i16;
        }
        return arrayList2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lpr0/f$a;", "", "<init>", "()V", "", "Y_AXIS_LABEL_COUNT", "I", "FOUR_WEEKS_DAYS_COUNT", "FOUR_WEEKS_DAYS_DELTA", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
