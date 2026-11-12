package com.garmin.android.apps.connectmobile.jet_lag.presentation.charts.barchart;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.List;
import ks0.c;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p13.y;
import yr0.l;
import yr0.m;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/charts/barchart/a;", "", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "a", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f36969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0661a f36970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0661a f36971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0661a f36972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f36973e;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.jet_lag.presentation.charts.barchart.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/charts/barchart/a$a;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0661a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f36974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f36975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final GuidanceTimeline f36976c;

        public C0661a(View view2) {
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.jet_lag_timeline_icon);
            viewFindViewById.getClass();
            this.f36974a = (ImageView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.jet_lag_timeline_text);
            viewFindViewById2.getClass();
            this.f36975b = (TextView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.jet_lag_timeline_view);
            viewFindViewById3.getClass();
            this.f36976c = (GuidanceTimeline) viewFindViewById3;
        }
    }

    public a(View view2) {
        view2.getClass();
        this.f36969a = view2;
        View viewFindViewById = view2.findViewById(R.id.jet_lag_details_chart_bars_light);
        viewFindViewById.getClass();
        C0661a c0661a = new C0661a(viewFindViewById);
        this.f36970b = c0661a;
        View viewFindViewById2 = view2.findViewById(R.id.jet_lag_details_chart_bars_sleep);
        viewFindViewById2.getClass();
        C0661a c0661a2 = new C0661a(viewFindViewById2);
        this.f36971c = c0661a2;
        View viewFindViewById3 = view2.findViewById(R.id.jet_lag_details_chart_bars_active);
        viewFindViewById3.getClass();
        C0661a c0661a3 = new C0661a(viewFindViewById3);
        this.f36972d = c0661a3;
        Context context = view2.getContext();
        context.getClass();
        this.f36973e = new c(context);
        c0661a.f36975b.setText(view2.getContext().getString(R.string.lbl_seek_or_avoid_light));
        c0661a.f36974a.setImageResource(R.drawable.ic_jet_lag_light);
        c0661a2.f36975b.setText(view2.getContext().getString(R.string.concept_sleep));
        c0661a2.f36974a.setImageResource(R.drawable.ic_jet_lag_sleep);
        c0661a3.f36975b.setText(view2.getContext().getString(R.string.lbl_be_active));
        c0661a3.f36974a.setImageResource(R.drawable.ic_jet_lag_activity);
    }

    public final ArrayList a(List list, m mVar, LocalDate localDate) {
        ArrayList<l> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((l) obj).f() == mVar) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        for (l lVar : arrayList) {
            lVar.getClass();
            DateTime dateTimeD = lVar.d();
            int minuteOfDay = (dateTimeD == null || !dateTimeD.toLocalDate().isEqual(localDate)) ? 0 : dateTimeD.getMinuteOfDay();
            DateTime dateTimeB = lVar.b();
            int minuteOfDay2 = (dateTimeB == null || !dateTimeB.toLocalDate().isEqual(localDate)) ? DateTimeConstants.MINUTES_PER_DAY : dateTimeB.getMinuteOfDay();
            this.f36973e.getClass();
            arrayList2.add(new GuidanceTimeline.b(minuteOfDay, minuteOfDay2, c.e(mVar), mVar == m.LIGHT_AVOIDANCE ? 2 : 1));
        }
        return arrayList2;
    }
}
