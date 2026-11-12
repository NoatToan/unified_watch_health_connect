package at0;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import e32.o;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import u62.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lat0/e;", "", "Landroid/view/View;", "view", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "", "intervalType", "Lxs0/a;", "lactateThresholdSportType", "<init>", "(Landroid/view/View;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;ILxs0/a;)V", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f12752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d<vs0.c> f12753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12754c;

    public e(View view2, LocalDate localDate, LocalDate localDate2, int i14, xs0.a aVar) {
        d<vs0.c> dVar;
        view2.getClass();
        localDate.getClass();
        localDate2.getClass();
        aVar.getClass();
        this.f12752a = view2;
        View viewFindViewById = view2.findViewById(R.id.chart_view);
        viewFindViewById.getClass();
        CustomLineChart customLineChart = (CustomLineChart) viewFindViewById;
        Context context = view2.getContext();
        context.getClass();
        Integer num = o.f62808k.f62822d;
        if (num != null && i14 == num.intValue()) {
            dVar = new d<>(customLineChart, new bt0.c(context, new ct0.a(localDate, localDate2, aVar), aVar), new ct0.b(customLineChart, localDate, localDate2), new bt0.d(customLineChart), new bt0.e(customLineChart), null, 32, null);
        } else {
            Integer num2 = o.f62810m.f62822d;
            if (num2 != null && i14 == num2.intValue()) {
                dVar = new d<>(customLineChart, new bt0.c(context, new et0.a(localDate, localDate2, aVar), aVar), new et0.b(customLineChart, localDate, localDate2), new bt0.d(customLineChart), new bt0.e(customLineChart), null, 32, null);
            } else {
                dVar = new d<>(customLineChart, new bt0.c(context, new et0.a(localDate, localDate2, aVar), aVar), new dt0.a(customLineChart, localDate, localDate2), new bt0.d(customLineChart), new bt0.e(customLineChart), null, 32, null);
            }
        }
        this.f12753b = dVar;
        this.f12754c = z.b(R.string.txt_empty_page_no_data, view2);
    }
}
