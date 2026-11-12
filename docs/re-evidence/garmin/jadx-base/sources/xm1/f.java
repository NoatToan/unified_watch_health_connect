package xm1;

import android.text.format.DateFormat;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import k00.i;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import yz.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lxm1/f;", "Lk00/i;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;", "lineDataProvider", "Lcom/github/mikephil/charting/components/YAxis;", "yAxis", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;Lcom/github/mikephil/charting/components/YAxis;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends i {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f191508j;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"xm1/f$a", "Lvm1/b;", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends vm1.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final C3567a f191509i;

        /* JADX INFO: renamed from: xm1.f$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"xm1/f$a$a", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C3567a extends ValueFormatter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ BarLineChartBase<?> f191510a;

            public C3567a(BarLineChartBase<?> barLineChartBase) {
                this.f191510a = barLineChartBase;
            }

            @Override // com.github.mikephil.charting.formatter.ValueFormatter
            public final String getFormattedValue(float f14) {
                return new k(DateFormat.is24HourFormat(this.f191510a.getContext())).b(-f14);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BarLineChartBase<?> barLineChartBase, ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
            super(viewPortHandler, yAxis, transformer);
            yAxis.getClass();
            this.f191509i = new C3567a(barLineChartBase);
        }

        @Override // i00.b
        /* JADX INFO: renamed from: d */
        public final boolean getF160005j() {
            return false;
        }

        @Override // i00.b
        /* JADX INFO: renamed from: e */
        public final ValueFormatter getF21082i() {
            return this.f191509i;
        }
    }

    static {
        int i14 = i00.b.f86710h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BarLineChartBase<?> barLineChartBase, LineDataProvider lineDataProvider, YAxis yAxis, LocalDate localDate, LocalDate localDate2) {
        super(barLineChartBase, lineDataProvider, yAxis, (ValueFormatter) new k(DateFormat.is24HourFormat(barLineChartBase.getContext())), localDate, localDate2, false);
        barLineChartBase.getClass();
        lineDataProvider.getClass();
        yAxis.getClass();
        localDate.getClass();
        localDate2.getClass();
        this.f191508j = new a(barLineChartBase, this.f101970d, barLineChartBase.getAxisLeft(), this.f101972f);
    }

    @Override // k00.e, qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF101352b() {
        return this.f191508j;
    }
}
