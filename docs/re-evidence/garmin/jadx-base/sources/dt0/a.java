package dt0;

import bt0.i;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.utils.ViewPortHandler;
import h00.b;
import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ldt0/a;", "Lbt0/i;", "Lcom/github/mikephil/charting/charts/LineChart;", "chart", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "<init>", "(Lcom/github/mikephil/charting/charts/LineChart;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h00.i f61108h;

    /* JADX INFO: renamed from: dt0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"dt0/a$a", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1297a extends ValueFormatter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h00.i f61109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList<String> f61110b;

        public C1297a(h00.i iVar, ArrayList<String> arrayList) {
            this.f61109a = iVar;
            this.f61110b = arrayList;
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public final String getFormattedValue(float f14) {
            int iC = MathKt.c(f14 / (52 / (this.f61109a.f80602f - 1.0f)));
            if (iC < 0) {
                return "";
            }
            ArrayList<String> arrayList = this.f61110b;
            if (iC >= arrayList.size()) {
                return "";
            }
            String str = arrayList.get(iC);
            str.getClass();
            return str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LineChart lineChart, LocalDate localDate, LocalDate localDate2) {
        super(lineChart);
        lineChart.getClass();
        localDate.getClass();
        localDate2.getClass();
        ViewPortHandler viewPortHandler = this.f21074b;
        XAxis xAxis = lineChart.getXAxis();
        xAxis.getClass();
        h00.i iVar = new h00.i(viewPortHandler, xAxis, this.f21075c);
        DateTime dateTimeAtStartOfDay = localDate.toDateTimeAtStartOfDay();
        dateTimeAtStartOfDay.getClass();
        DateTime dateTimeAtStartOfDay2 = localDate2.toDateTimeAtStartOfDay();
        dateTimeAtStartOfDay2.getClass();
        DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("MMM");
        dateTimeFormatterForPattern.getClass();
        ArrayList arrayList = (ArrayList) fz.a.e(null, 1, dateTimeAtStartOfDay, dateTimeAtStartOfDay2, dateTimeFormatterForPattern);
        iVar.f80601e = new C1297a(iVar, arrayList);
        iVar.f80602f = arrayList.size();
        iVar.f80603g = true;
        iVar.f80604h = 270.0f;
        iVar.f80605i = 24.0f;
        this.f61108h = iVar;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final b getF159999a() {
        return this.f61108h;
    }
}
