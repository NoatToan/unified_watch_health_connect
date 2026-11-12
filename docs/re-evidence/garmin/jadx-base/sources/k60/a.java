package k60;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import h00.i;
import i60.g;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lk60/a;", "Li60/g;", "Lcom/github/mikephil/charting/charts/LineChart;", "chart", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "<init>", "(Lcom/github/mikephil/charting/charts/LineChart;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "gcm-critical-swim-speed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f103154e;

    /* JADX INFO: renamed from: k60.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"k60/a$a", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-critical-swim-speed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1979a extends ValueFormatter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f103155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r0<List<String>> f103156b;

        public C1979a(i iVar, r0<List<String>> r0Var) {
            this.f103155a = iVar;
            this.f103156b = r0Var;
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public final String getFormattedValue(float f14) {
            int iC = MathKt.c(f14 / (52 / (this.f103155a.f80602f - 1.0f)));
            if (iC < 0) {
                return "";
            }
            r0<List<String>> r0Var = this.f103156b;
            return iC < r0Var.f105810a.size() ? r0Var.f105810a.get(iC) : "";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, java.util.List] */
    public a(LineChart lineChart, LocalDate localDate, LocalDate localDate2) {
        super(lineChart);
        lineChart.getClass();
        localDate.getClass();
        localDate2.getClass();
        ViewPortHandler viewPortHandler = this.f91819a;
        viewPortHandler.getClass();
        XAxis xAxis = lineChart.getXAxis();
        xAxis.getClass();
        Transformer transformer = this.f91820b;
        transformer.getClass();
        i iVar = new i(viewPortHandler, xAxis, transformer);
        r0 r0Var = new r0();
        DateTime dateTimeAtStartOfDay = localDate.toDateTimeAtStartOfDay();
        dateTimeAtStartOfDay.getClass();
        DateTime dateTimeAtStartOfDay2 = localDate2.toDateTimeAtStartOfDay();
        dateTimeAtStartOfDay2.getClass();
        DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("MMM");
        dateTimeFormatterForPattern.getClass();
        r0Var.f105810a = fz.a.e(null, 1, dateTimeAtStartOfDay, dateTimeAtStartOfDay2, dateTimeFormatterForPattern);
        iVar.f80601e = new C1979a(iVar, r0Var);
        iVar.f80602f = ((List) r0Var.f105810a).size();
        iVar.f80603g = true;
        iVar.f80604h = 270.0f;
        iVar.f80605i = 24.0f;
        this.f103154e = iVar;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF159999a() {
        return this.f103154e;
    }
}
