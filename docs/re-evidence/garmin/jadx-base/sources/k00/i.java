package k00;

import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011BE\b\u0016\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u0012\u0012\u0006\u0010\r\u001a\u00020\u0012\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0013¨\u0006\u0014"}, d2 = {"Lk00/i;", "Lk00/e;", "Lf00/c;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;", "lineDataProvider", "Lcom/github/mikephil/charting/components/YAxis;", "yAxis", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "yAxisValueFormatter", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "", "daily", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/formatter/ValueFormatter;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Z)V", "Lorg/joda/time/DateTime;", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/formatter/ValueFormatter;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Z)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class i extends e<f00.c> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f00.d f101986i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(BarLineChartBase<?> barLineChartBase, LineDataProvider lineDataProvider, YAxis yAxis, ValueFormatter valueFormatter, LocalDate localDate, LocalDate localDate2, boolean z14) {
        super(barLineChartBase, yAxis, valueFormatter, localDate, localDate2, z14);
        barLineChartBase.getClass();
        lineDataProvider.getClass();
        yAxis.getClass();
        valueFormatter.getClass();
        localDate.getClass();
        localDate2.getClass();
        ChartAnimator animator = barLineChartBase.getAnimator();
        animator.getClass();
        this.f101986i = new f00.d(lineDataProvider, animator, this.f101970d);
    }

    @Override // qz.h
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public f00.c getF142393c() {
        return this.f101986i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i(BarLineChartBase<?> barLineChartBase, LineDataProvider lineDataProvider, YAxis yAxis, ValueFormatter valueFormatter, DateTime dateTime, DateTime dateTime2, boolean z14) {
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
}
