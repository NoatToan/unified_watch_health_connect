package j60;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import h00.c;
import i60.g;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import pz.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lj60/b;", "Li60/g;", "Lcom/github/mikephil/charting/charts/LineChart;", "chart", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "<init>", "(Lcom/github/mikephil/charting/charts/LineChart;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "gcm-critical-swim-speed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f97253e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LineChart lineChart, LocalDate localDate, LocalDate localDate2) {
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
        c cVar = new c(viewPortHandler, xAxis, transformer);
        List<String> listE = d.e(localDate, localDate2, 0);
        cVar.f80601e = new IndexAxisValueFormatter(listE);
        cVar.f80602f = listE.size();
        cVar.f80605i = 24.0f;
        this.f97253e = cVar;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF101974h() {
        return this.f97253e;
    }
}
