package lo0;

import android.content.Context;
import com.github.mikephil.charting.charts.LineChart;
import ko0.e;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import pi0.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Llo0/c;", "Llo0/b;", "Lcom/github/mikephil/charting/charts/LineChart;", "chart", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "<init>", "(Lcom/github/mikephil/charting/charts/LineChart;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "gcm-heart-rate_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f114003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f114004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f114005d;

    public c(LineChart lineChart, LocalDate localDate, LocalDate localDate2) {
        lineChart.getClass();
        localDate.getClass();
        localDate2.getClass();
        Context context = lineChart.getContext();
        context.getClass();
        this.f114003b = context;
        this.f114004c = 7.0f;
        this.f114005d = new e(lineChart, localDate, localDate2);
    }

    @Override // lo0.b
    public final boolean a() {
        return false;
    }

    @Override // lo0.b
    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getF114004c() {
        return this.f114004c;
    }

    @Override // lo0.b
    public final String c(LocalDate localDate, LocalDate localDate2) {
        return new pi0.e(this.f114003b).m(localDate, localDate2, f.SHORT_MONTH_NO_WEEKDAY);
    }
}
