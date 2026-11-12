package hm1;

import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.renderer.DataRenderer;
import f00.c;
import f00.d;
import k00.i;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BC\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010BE\b\u0016\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0011\u0012\u0006\u0010\f\u001a\u00020\u0011\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0012¨\u0006\u0013"}, d2 = {"Lhm1/b;", "Lk00/i;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;", "lineDataProvider", "Lcom/github/mikephil/charting/components/YAxis;", "yAxis", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "yAxisValueFormatter", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "", "daily", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/formatter/ValueFormatter;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Z)V", "Lorg/joda/time/DateTime;", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/formatter/ValueFormatter;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Z)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends i {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f84496j;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(BarLineChartBase<?> barLineChartBase, LineDataProvider lineDataProvider, YAxis yAxis, ValueFormatter valueFormatter, DateTime dateTime, DateTime dateTime2, boolean z14) {
        barLineChartBase.getClass();
        lineDataProvider.getClass();
        yAxis.getClass();
        valueFormatter.getClass();
        dateTime.getClass();
        dateTime2.getClass();
        LocalDate localDate = dateTime.toLocalDate();
        localDate.getClass();
        LocalDate localDate2 = dateTime2.toLocalDate();
        localDate2.getClass();
        this(barLineChartBase, lineDataProvider, yAxis, valueFormatter, localDate, localDate2, z14);
    }

    @Override // k00.i, qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF142393c() {
        return this.f84496j;
    }

    @Override // k00.i
    /* JADX INFO: renamed from: e */
    public final c getF142393c() {
        return this.f84496j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BarLineChartBase<?> barLineChartBase, LineDataProvider lineDataProvider, YAxis yAxis, ValueFormatter valueFormatter, LocalDate localDate, LocalDate localDate2, boolean z14) {
        super(barLineChartBase, lineDataProvider, yAxis, valueFormatter, localDate, localDate2, z14);
        barLineChartBase.getClass();
        lineDataProvider.getClass();
        yAxis.getClass();
        valueFormatter.getClass();
        localDate.getClass();
        localDate2.getClass();
        d dVar = this.f101986i;
        dVar.f67653d = Float.valueOf(0.0f);
        this.f84496j = dVar;
    }
}
