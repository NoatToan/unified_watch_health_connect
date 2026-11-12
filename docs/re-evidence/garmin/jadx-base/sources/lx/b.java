package lx;

import android.content.Context;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import gl1.d;
import h00.f;
import k00.i;
import lc.u0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B;\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llx/b;", "Lk00/i;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;", "lineDataProvider", "Lcom/github/mikephil/charting/components/YAxis;", "yAxis", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "yAxisValueFormatter", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/formatter/ValueFormatter;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends i {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h00.b f115139j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BarLineChartBase<?> barLineChartBase, LineDataProvider lineDataProvider, YAxis yAxis, ValueFormatter valueFormatter, LocalDate localDate, LocalDate localDate2) {
        h00.b fVar;
        super(barLineChartBase, lineDataProvider, yAxis, valueFormatter, localDate, localDate2, true);
        barLineChartBase.getClass();
        lineDataProvider.getClass();
        yAxis.getClass();
        valueFormatter.getClass();
        localDate.getClass();
        localDate2.getClass();
        if (d.I(localDate, localDate2)) {
            fVar = new f(this.f101970d, this.f101971e, this.f101972f);
            Context context = this.f101967a.getContext();
            context.getClass();
            LocalDate localDate3 = this.f101968b;
            LocalDate localDate4 = this.f101969c;
            fVar.f80601e = new IndexAxisValueFormatter(pz.d.d(context, localDate3, localDate4));
            fVar.f80602f = u0.e(localDate3, localDate4, 1);
        } else {
            fVar = this.f101974h;
        }
        this.f115139j = fVar;
    }

    @Override // k00.e, qz.h
    /* JADX INFO: renamed from: b, reason: from getter */
    public final h00.b getF115139j() {
        return this.f115139j;
    }
}
