package xm1;

import android.text.format.DateFormat;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import k00.i;
import lc.u0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import yz.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B;\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lxm1/b;", "Lk00/i;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;", "lineDataProvider", "Lcom/github/mikephil/charting/components/YAxis;", "yAxis", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "yAxisValueFormatter", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/formatter/ValueFormatter;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends i {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h00.c f191493j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f191494k;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"xm1/b$a", "Lvm1/b;", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends vm1.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final C3566a f191495i;

        /* JADX INFO: renamed from: xm1.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"xm1/b$a$a", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C3566a extends ValueFormatter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ BarLineChartBase<?> f191496a;

            public C3566a(BarLineChartBase<?> barLineChartBase) {
                this.f191496a = barLineChartBase;
            }

            @Override // com.github.mikephil.charting.formatter.ValueFormatter
            public final String getFormattedValue(float f14) {
                return new k(DateFormat.is24HourFormat(this.f191496a.getContext())).b(-f14);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BarLineChartBase<?> barLineChartBase, ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
            super(viewPortHandler, yAxis, transformer);
            yAxis.getClass();
            this.f191495i = new C3566a(barLineChartBase);
        }

        @Override // i00.b
        /* JADX INFO: renamed from: d */
        public final boolean getF160005j() {
            return false;
        }

        @Override // i00.b
        /* JADX INFO: renamed from: e */
        public final ValueFormatter getF63194k() {
            return this.f191495i;
        }
    }

    static {
        int i14 = i00.b.f86710h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BarLineChartBase<?> barLineChartBase, LineDataProvider lineDataProvider, YAxis yAxis, ValueFormatter valueFormatter, LocalDate localDate, LocalDate localDate2) {
        super(barLineChartBase, lineDataProvider, yAxis, valueFormatter, localDate, localDate2, true);
        barLineChartBase.getClass();
        lineDataProvider.getClass();
        yAxis.getClass();
        valueFormatter.getClass();
        localDate.getClass();
        localDate2.getClass();
        ViewPortHandler viewPortHandler = this.f101970d;
        XAxis xAxis = barLineChartBase.getXAxis();
        xAxis.getClass();
        h00.c cVar = new h00.c(viewPortHandler, xAxis, this.f101972f);
        cVar.f80601e = new IndexAxisValueFormatter(pz.d.e(localDate, localDate2, 0));
        cVar.f80602f = u0.e(localDate, localDate2, 1);
        this.f191493j = cVar;
        this.f191494k = new a(barLineChartBase, this.f101970d, barLineChartBase.getAxisLeft(), this.f101972f);
    }

    @Override // k00.e, qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF57459d() {
        return this.f191493j;
    }

    @Override // k00.e, qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF57460e() {
        return this.f191494k;
    }
}
