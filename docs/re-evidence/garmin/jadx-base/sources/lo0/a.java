package lo0;

import android.content.Context;
import com.github.mikephil.charting.charts.LineChart;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import pi0.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Llo0/a;", "Llo0/b;", "Lcom/github/mikephil/charting/charts/LineChart;", "chart", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "<init>", "(Lcom/github/mikephil/charting/charts/LineChart;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "gcm-heart-rate_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f113995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f113996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f113997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ko0.a f113998e;

    public a(LineChart lineChart, LocalDate localDate, LocalDate localDate2) {
        lineChart.getClass();
        localDate.getClass();
        localDate2.getClass();
        Context context = lineChart.getContext();
        context.getClass();
        this.f113995b = context;
        this.f113996c = true;
        this.f113997d = 1.0f;
        this.f113998e = new ko0.a(lineChart, localDate, localDate2);
    }

    @Override // lo0.b
    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getF113996c() {
        return this.f113996c;
    }

    @Override // lo0.b
    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getF113997d() {
        return this.f113997d;
    }

    @Override // lo0.b
    public final String c(LocalDate localDate, LocalDate localDate2) {
        return new e(this.f113995b).d(localDate, qi0.a.RELATIVE_YEAR_MONTH_DAY);
    }
}
