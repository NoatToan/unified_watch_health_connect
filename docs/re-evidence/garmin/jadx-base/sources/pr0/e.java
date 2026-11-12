package pr0;

import android.content.Context;
import android.text.format.DateFormat;
import ch.qos.logback.core.CoreConstants;
import com.github.mikephil.chartingv2.charts.LineChart;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.highlight.ChartHighlighter;
import com.github.mikephil.chartingv2.renderer.XAxisRenderer;
import com.github.mikephil.chartingv2.utils.Transformer;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import p005kotlin.Metadata;
import po2.o;

/* JADX INFO: loaded from: classes8.dex */
@o13.e
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lpr0/e;", "Lpr0/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "measurementStepMinutes", "<init>", "(Landroid/content/Context;I)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends pr0.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f139613j = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f139614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final jz.a f139615i;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, int i14) {
        super(context);
        context.getClass();
        this.f139614h = i14;
        this.f139615i = new jz.a(new l22.a(context));
    }

    @Override // oz.b
    public final ChartHighlighter<? super LineChart> m(LineChart lineChart) {
        lineChart.getClass();
        return new k(lineChart, new o(13));
    }

    @Override // pr0.a
    public final int r() {
        return 3;
    }

    @Override // pr0.a
    public final int s(DateTime dateTime, DateTime dateTime2) {
        return Minutes.minutesBetween(dateTime, dateTime2).getMinutes() / this.f139614h;
    }

    @Override // pr0.a
    public final XAxisRenderer t(LineChart lineChart) {
        lineChart.getClass();
        ViewPortHandler viewPortHandler = lineChart.getViewPortHandler();
        viewPortHandler.getClass();
        XAxis xAxis = lineChart.getXAxis();
        xAxis.getClass();
        Transformer transformer = lineChart.getTransformer(YAxis.AxisDependency.LEFT);
        transformer.getClass();
        gm1.b bVar = new gm1.b(viewPortHandler, xAxis, transformer, 3, 0);
        bVar.f121634i = 0;
        return bVar;
    }

    @Override // pr0.a
    public final List u(int i14, DateTime dateTime, DateTime dateTime2) {
        String strA;
        boolean zIs24HourFormat = DateFormat.is24HourFormat(this.f134441a);
        ArrayList arrayList = new ArrayList();
        if (dateTime == null || dateTime2 == null) {
            dateTime = DateTime.now().withTimeAtStartOfDay();
            dateTime.getClass();
            dateTime2 = g22.k.A(dateTime);
        }
        MutableDateTime mutableDateTime = dateTime.toMutableDateTime();
        while (mutableDateTime.compareTo((ReadableInstant) dateTime2) <= 0) {
            if (i14 == mutableDateTime.getMinuteOfDay() % PsExtractor.VIDEO_STREAM_MASK) {
                DateTime dateTime3 = mutableDateTime.toDateTime();
                this.f139615i.getClass();
                strA = jz.a.a(dateTime3, zIs24HourFormat);
            } else {
                strA = i14 == mutableDateTime.getMinuteOfDay() % 60 ? StringUtils.SPACE : "";
            }
            arrayList.add(strA);
            mutableDateTime.addMinutes(this.f139614h);
        }
        return arrayList;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lpr0/e$a;", "", "<init>", "()V", "", "Y_AXIS_LABEL_COUNT", "I", "BIG_DOT_PATTERN_CYCLICITY", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
