package lp1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Llp1/p;", "", "Landroid/view/View;", "view", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "", "intervalType", "<init>", "(Landroid/view/View;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;I)V", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomBarChart f114188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f114189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rz.a<List<ip1.f>, d00.a> f114190c;

    public p(View view2, LocalDate localDate, LocalDate localDate2, int i14) {
        view2.getClass();
        localDate.getClass();
        localDate2.getClass();
        View viewFindViewById = view2.findViewById(R.id.chart_view);
        viewFindViewById.getClass();
        CustomBarChart customBarChart = (CustomBarChart) viewFindViewById;
        this.f114188a = customBarChart;
        Context context = customBarChart.getContext();
        this.f114189b = context;
        qz.h hVar = i14 == 4 ? new gp1.h(customBarChart, localDate, localDate2) : new gp1.e(customBarChart, localDate, localDate2);
        context.getClass();
        this.f114190c = new rz.a<>(customBarChart, new gp1.f(context, localDate, localDate2), hVar, null, new gp1.g(customBarChart), null, 40, null);
    }
}
