package et0;

import bt0.i;
import c22.j0;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Let0/b;", "Lbt0/i;", "Lcom/github/mikephil/charting/charts/LineChart;", "chart", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "<init>", "(Lcom/github/mikephil/charting/charts/LineChart;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h00.i f65275h;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"et0/b$a", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends ValueFormatter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList<String> f65276a;

        public a(ArrayList<String> arrayList) {
            this.f65276a = arrayList;
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public final String getFormattedValue(float f14) {
            int iC = MathKt.c(f14);
            if (iC < 0) {
                return "";
            }
            ArrayList<String> arrayList = this.f65276a;
            if (iC >= arrayList.size()) {
                return "";
            }
            String str = arrayList.get(iC);
            str.getClass();
            return str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LineChart lineChart, LocalDate localDate, LocalDate localDate2) {
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
        j0.f23099a.getClass();
        ArrayList arrayList = (ArrayList) fz.a.e(null, 5, dateTimeAtStartOfDay, dateTimeAtStartOfDay2, j0.A('S'));
        arrayList.add(j0.k(localDate2.toDateTimeAtStartOfDay(), 'S'));
        iVar.f80601e = new a(arrayList);
        iVar.f80602f = arrayList.size();
        iVar.f80603g = true;
        iVar.f80604h = 270.0f;
        iVar.f80605i = 24.0f;
        this.f65275h = iVar;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF157069d() {
        return this.f65275h;
    }
}
