package js0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.room.a0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.HorseshoePieChart;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.charts.barchart.GuidanceTimeline;
import com.github.mikephil.charting.data.LineData;
import d53.w;
import e32.p;
import es0.i;
import g22.k;
import g22.n;
import h0.r0;
import i3.e5;
import i3.f2;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p13.x;
import p13.y;
import yr0.h;
import yr0.j;
import yr0.l;
import yr0.m;
import yr0.q;
import yr0.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Ljs0/a;", "Le32/p;", "Lyr0/g;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "a", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements p<yr0.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ks0.c f100593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LayoutInflater f100594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f100595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f100596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f100597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f100598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.jet_lag.presentation.charts.barchart.a f100599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CustomLineChart f100600h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f100601i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinearLayout f100602j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final es0.b f100603k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f100604l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final es0.d f100605m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i f100606n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final tz.a<yr0.g> f100607o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fs0.c f100608p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f100609q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public yr0.g f100610r;

    /* JADX INFO: renamed from: js0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljs0/a$a;", "", "Landroid/view/View;", "view", "Lks0/c;", "formatter", "<init>", "(Landroid/view/View;Lks0/c;)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1928a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f100611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ks0.c f100612b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f100613c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f100614d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f100615e;

        public C1928a(View view2, ks0.c cVar) {
            view2.getClass();
            cVar.getClass();
            this.f100611a = view2;
            this.f100612b = cVar;
            this.f100613c = (ImageView) view2.findViewById(R.id.jet_lag_schedule_item_bullet);
            this.f100614d = (TextView) view2.findViewById(R.id.jet_lag_schedule_item_type);
            this.f100615e = (TextView) view2.findViewById(R.id.jet_lag_schedule_item_type_time);
        }

        public final void a(boolean z14) {
            ImageView imageView = this.f100613c;
            imageView.getClass();
            imageView.setVisibility(8);
            View view2 = this.f100611a;
            view2.setBackgroundColor(a7.b.getColor(view2.getContext(), R.color.gcm_surface_2));
            l22.a aVar = this.f100612b.f106382a;
            this.f100614d.setText(z14 ? n.a(aVar.getString(R.string.no_data_label)) : aVar.getString(R.string.lbl_no_guidance));
            view2.setBackgroundColor(a7.b.getColor(view2.getContext(), R.color.gcm_table_row_even));
            TextView textView = this.f100615e;
            textView.getClass();
            textView.setVisibility(8);
        }
    }

    public a(View view2) {
        view2.getClass();
        Context context = view2.getContext();
        context.getClass();
        ks0.c cVar = new ks0.c(context);
        this.f100593a = cVar;
        this.f100594b = LayoutInflater.from(context);
        View viewFindViewById = view2.findViewById(R.id.jet_lag_detail_level);
        viewFindViewById.getClass();
        this.f100595c = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.jet_lag_detail_level_feedback);
        viewFindViewById2.getClass();
        this.f100596d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.jet_lag_detail_timeline_title);
        viewFindViewById3.getClass();
        this.f100597e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.jet_lag_detail_timeline_label);
        viewFindViewById4.getClass();
        this.f100598f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.jet_lag_details_chart_bars_container);
        viewFindViewById5.getClass();
        this.f100599g = new com.garmin.android.apps.connectmobile.jet_lag.presentation.charts.barchart.a(viewFindViewById5);
        View viewFindViewById6 = view2.findViewById(R.id.jet_lag_details_chart_view);
        viewFindViewById6.getClass();
        CustomLineChart customLineChart = (CustomLineChart) viewFindViewById6;
        this.f100600h = customLineChart;
        View viewFindViewById7 = view2.findViewById(R.id.jet_lag_detail_schedule_title);
        viewFindViewById7.getClass();
        this.f100601i = (TextView) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.jet_lag_detail_schedule_container);
        viewFindViewById8.getClass();
        this.f100602j = (LinearLayout) viewFindViewById8;
        es0.b bVar = new es0.b(context, cVar);
        this.f100603k = bVar;
        es0.d dVar = new es0.d(customLineChart, new f2(this, 28));
        this.f100605m = dVar;
        i iVar = new i(customLineChart);
        this.f100606n = iVar;
        this.f100607o = new tz.a<>(customLineChart, bVar, iVar, dVar, new es0.f(customLineChart), null, 32, null);
        fs0.a aVar = new fs0.a(context);
        View viewFindViewById9 = view2.findViewById(R.id.jet_lag_pie_chart);
        viewFindViewById9.getClass();
        this.f100608p = new fs0.c(view2, aVar, new fs0.b((HorseshoePieChart) viewFindViewById9));
        View viewFindViewById10 = view2.findViewById(R.id.jet_lag_time_difference_label);
        viewFindViewById10.getClass();
        this.f100609q = (TextView) viewFindViewById10;
    }

    @Override // e32.p
    public final void a() {
        fs0.c cVar = this.f100608p;
        HorseshoePieChart horseshoePieChart = cVar.f73421a;
        if (horseshoePieChart != null) {
            horseshoePieChart.setVisibility(8);
        }
        vz.a<yr0.g> aVar = cVar.f73422b;
        if (aVar != null) {
            aVar.a(null);
            Unit unit = Unit.INSTANCE;
        }
        v22.e.j(this.f100609q);
        v22.e.j(this.f100595c);
        v22.e.j(this.f100596d);
        v22.e.j(this.f100597e);
        v22.e.j(this.f100598f);
        v22.e.j(this.f100600h);
        this.f100599g.f36969a.setVisibility(8);
        v22.e.j(this.f100601i);
        LinearLayout linearLayout = this.f100602j;
        v22.e.j(linearLayout);
        linearLayout.removeAllViews();
    }

    @Override // e32.p
    public final /* bridge */ /* synthetic */ boolean b(yr0.g gVar) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:153:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:198:0x0416  */
    /* JADX WARN: Code duplicated, block: B:199:0x0419  */
    /* JADX WARN: Code duplicated, block: B:201:0x0421  */
    /* JADX WARN: Code duplicated, block: B:204:0x042c A[LOOP:5: B:200:0x041f->B:204:0x042c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:212:0x0442  */
    /* JADX WARN: Code duplicated, block: B:225:0x0497  */
    /* JADX WARN: Code duplicated, block: B:229:0x04aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:230:0x04ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:233:0x04b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:239:0x04be  */
    /* JADX WARN: Code duplicated, block: B:243:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:246:0x04df  */
    /* JADX WARN: Code duplicated, block: B:247:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:250:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:279:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:299:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:321:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:324:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:325:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:328:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:333:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:337:0x075c  */
    /* JADX WARN: Code duplicated, block: B:338:0x0760  */
    /* JADX WARN: Code duplicated, block: B:340:0x076a  */
    /* JADX WARN: Code duplicated, block: B:343:0x0779  */
    /* JADX WARN: Code duplicated, block: B:345:0x078a  */
    /* JADX WARN: Code duplicated, block: B:346:0x078f  */
    /* JADX WARN: Code duplicated, block: B:349:0x0796 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:350:0x0798  */
    /* JADX WARN: Code duplicated, block: B:351:0x079d  */
    /* JADX WARN: Code duplicated, block: B:358:0x07bd  */
    /* JADX WARN: Code duplicated, block: B:360:0x07cd  */
    /* JADX WARN: Code duplicated, block: B:363:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:365:0x07df  */
    /* JADX WARN: Code duplicated, block: B:368:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:370:0x0800  */
    /* JADX WARN: Code duplicated, block: B:372:0x0803  */
    /* JADX WARN: Code duplicated, block: B:373:0x0806  */
    /* JADX WARN: Code duplicated, block: B:376:0x0826  */
    /* JADX WARN: Code duplicated, block: B:379:0x0830  */
    /* JADX WARN: Code duplicated, block: B:382:0x083a  */
    /* JADX WARN: Code duplicated, block: B:386:0x084f  */
    /* JADX WARN: Code duplicated, block: B:389:0x085e  */
    /* JADX WARN: Code duplicated, block: B:392:0x0865  */
    /* JADX WARN: Code duplicated, block: B:395:0x0874  */
    /* JADX WARN: Code duplicated, block: B:399:0x08a8  */
    /* JADX WARN: Code duplicated, block: B:400:0x08ab  */
    /* JADX WARN: Code duplicated, block: B:403:0x08b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:404:0x08b5  */
    /* JADX WARN: Code duplicated, block: B:405:0x08b8  */
    /* JADX WARN: Code duplicated, block: B:409:0x08c0  */
    /* JADX WARN: Code duplicated, block: B:410:0x08c2  */
    /* JADX WARN: Code duplicated, block: B:476:0x0846 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:478:0x0834 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:487:0x07a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:489:0x07a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:491:0x0773 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:0x042f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:497:0x0430 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e32.p
    public final void c(yr0.g gVar) throws ParseException {
        String string;
        String strA;
        String string2;
        LocalDateTime localDateTime;
        j jVar;
        yr0.f fVar;
        String string3;
        h hVar;
        Integer numValueOf;
        ks0.a aVar;
        yr0.a[] aVarArrValues;
        int length;
        int i14;
        yr0.a aVar2;
        Integer numValueOf2;
        String string4;
        TextView textView;
        List<j> listJ;
        LocalDate localDateI;
        ArrayList arrayListC;
        int i15;
        com.garmin.android.apps.connectmobile.jet_lag.presentation.charts.barchart.a aVar3;
        List listQ;
        LocalDate localDateI2;
        List<j> listJ2;
        ArrayList arrayList;
        List<o13.p<Integer, Integer>> list;
        ArrayList<j> arrayList2;
        DateTime dateTimeD;
        DateTime dateTimeK;
        int minuteOfDay;
        int minuteOfDay2;
        DateTime dateTimeD2;
        DateTime dateTimeK2;
        LocalDate localDate;
        LocalDate localDate2;
        ArrayList arrayList3;
        LocalDate localDateI3;
        List<l> listQ2;
        List listQ3;
        LinearLayout linearLayout;
        LayoutInflater layoutInflater;
        yr0.g gVar2;
        t tVar;
        t tVar2;
        String string5;
        yr0.f fVar2;
        m mVarF;
        DateTime dateTimeD3;
        int minuteOfDay3;
        DateTime dateTimeB;
        int minuteOfDay4;
        LocalDate localDateI4;
        long time;
        long time2;
        String strF;
        Date date;
        Date date2;
        yr0.g gVar3 = gVar;
        if (gVar3 == null) {
            a();
            return;
        }
        t tVar3 = gVar3.f198960c;
        yr0.f fVar3 = gVar3.f198958a;
        this.f100604l = k.g(fVar3.i(), LocalDate.now());
        this.f100610r = gVar3;
        fs0.c cVar = this.f100608p;
        vz.a<yr0.g> aVar4 = cVar.f73422b;
        if (aVar4 != null) {
            aVar4.a(gVar3);
            Unit unit = Unit.INSTANCE;
        }
        HorseshoePieChart horseshoePieChart = cVar.f73421a;
        if (horseshoePieChart != null) {
            horseshoePieChart.setVisibility(0);
        }
        ns0.b.f127812a.getClass();
        t tVar4 = t.PRE_TRIP;
        Double dValueOf = (tVar3 == tVar4 || tVar3 == t.TRAVELING) ? Double.valueOf(ns0.b.d(fVar3.j(), yr0.d.f198937a)) : fVar3.d();
        ks0.c cVar2 = this.f100593a;
        l22.a aVar5 = cVar2.f106382a;
        String strE = "";
        if (dValueOf == null || tVar3 == null || tVar3 == t.PAST_PRE_TRIP || tVar3 == t.PAST_TRAVEL_DAY) {
            string = "";
        } else {
            CharSequence charSequenceB = cVar2.b(dValueOf);
            string = aVar5.getString(R.string.lbl_vs_local_time);
            String string6 = aVar5.getString(R.string.lbl_hours_abbreviation);
            int i16 = ks0.c.b.f106388a[tVar3.ordinal()];
            if (i16 != 1 && i16 != 2) {
                string = (i16 == 3 || i16 == 4) ? a0.j("0", string6, StringUtils.SPACE, string) : ((Object) charSequenceB) + StringUtils.SPACE + string;
            }
        }
        boolean zP = ns0.b.p(Integer.valueOf(fVar3.getSeverity()), tVar3);
        TextView textView2 = this.f100609q;
        if (zP || string.length() <= 0) {
            v22.e.j(textView2);
        } else {
            textView2.setText(string);
            textView2.setVisibility(0);
        }
        LocalDate localDateI5 = fVar3.i();
        LocalDate localDateS = fVar3.s();
        int days = (localDateI5 == null || localDateS == null) ? -1 : Days.daysBetween(localDateI5, localDateS).getDays();
        String strG = cVar2.g(Integer.valueOf(fVar3.getSeverity()), tVar3);
        t tVar5 = t.PAST_NO_GUIDANCE;
        if (tVar3 == tVar5) {
            strG = aVar5.getString(R.string.lbl_no_guidance_available);
        } else if (tVar3 == t.PAST_PRE_TRIP) {
            strG = days == 1 ? aVar5.getString(R.string.lbl_one_day_until_trip) : aVar5.a(R.string.lbl_days_until_trip, String.valueOf(days));
        } else if (tVar3 == t.PAST_TRAVEL_DAY) {
            strG = aVar5.getString(R.string.lbl_travel_day);
        } else if (tVar3 == tVar4 || days == 0) {
            List<j> listJ3 = fVar3.j();
            DateTime dateTimeK3 = (listJ3 == null || (jVar = (j) h0.d0(listJ3)) == null) ? null : jVar.k("yyyy-MM-dd'T'HH:mm:ss");
            String strD = cVar2.d(true, false, dateTimeK3 != null ? dateTimeK3.getMinuteOfDay() : 0.0f);
            if (days == 0 && dateTimeK3 != null && dateTimeK3.isAfterNow()) {
                strA = aVar5.a(R.string.social_date_at_time, aVar5.getString(R.string.challenge_leaderboard_header_today_label), strD);
            } else if (days == 1) {
                strA = aVar5.a(R.string.social_date_at_time, aVar5.getString(R.string.common_tomorrow), strD);
            } else if (days > 1) {
                Integer numValueOf3 = (dateTimeK3 == null || (localDateTime = dateTimeK3.toLocalDateTime()) == null) ? null : Integer.valueOf(localDateTime.getDayOfWeek());
                if (numValueOf3 != null && numValueOf3.intValue() == 1) {
                    string2 = aVar5.getString(R.string.lbl_day_of_week_monday);
                } else if (numValueOf3 != null && numValueOf3.intValue() == 2) {
                    string2 = aVar5.getString(R.string.lbl_day_of_week_tuesday);
                } else if (numValueOf3 != null && numValueOf3.intValue() == 3) {
                    string2 = aVar5.getString(R.string.lbl_day_of_week_wednesday);
                } else if (numValueOf3 != null && numValueOf3.intValue() == 4) {
                    string2 = aVar5.getString(R.string.lbl_day_of_week_thursday);
                } else if (numValueOf3 != null && numValueOf3.intValue() == 5) {
                    string2 = aVar5.getString(R.string.lbl_day_of_week_friday);
                } else if (numValueOf3 != null && numValueOf3.intValue() == 6) {
                    string2 = aVar5.getString(R.string.lbl_day_of_week_saturday);
                } else {
                    string2 = (numValueOf3 != null && numValueOf3.intValue() == 7) ? aVar5.getString(R.string.lbl_day_of_week_sunday) : "";
                }
                strA = aVar5.a(R.string.social_date_at_time, string2, strD);
            } else {
                strA = "";
            }
            if (strA.length() != 0) {
                strG = strA;
            }
        }
        TextView textView3 = this.f100595c;
        if (strG != null) {
            textView3.setText(strG);
            textView3.setVisibility(0);
        } else {
            v22.e.j(textView3);
        }
        String bodyClockFeedback = fVar3.getBodyClockFeedback();
        String bodyClockShiftFeedback = fVar3.getBodyClockShiftFeedback();
        Integer numValueOf4 = Integer.valueOf(R.string.msg_body_clock_difference_0_during_travel);
        if (tVar3 != tVar5) {
            if (!h0.R(x.k(tVar5, t.PAST, t.PAST_ACCLIMATED, t.PAST_PRE_TRIP, t.PAST_TRAVEL_DAY, t.PAST_PRE_FLIGHT), tVar3)) {
                ks0.b bVar = cVar2.f106385d;
                bVar.getClass();
                if (bodyClockFeedback != null) {
                    h[] hVarArrValues = h.values();
                    int length2 = hVarArrValues.length;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= length2) {
                            fVar = fVar3;
                            hVar = null;
                            break;
                        }
                        hVar = hVarArrValues[i17];
                        fVar = fVar3;
                        if (hVar.f198992a.contains(bodyClockFeedback)) {
                            break;
                        }
                        i17++;
                        fVar3 = fVar;
                    }
                    if (hVar != null && hVar != h.UNKNOWN) {
                        switch (ks0.b.a.f106380a[hVar.ordinal()]) {
                            case 1:
                            case 2:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_before_travel_0);
                                break;
                            case 3:
                            case 4:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_before_next_travel_0);
                                break;
                            case 5:
                            case 6:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_travel_day_0);
                                break;
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_have_a_great_trip);
                                break;
                            case 11:
                            case 12:
                                numValueOf = numValueOf4;
                                break;
                            case 13:
                            case 14:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_before_travel_1_update1);
                                break;
                            case 15:
                            case 16:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_before_next_travel_1_update1);
                                break;
                            case 17:
                            case 18:
                            case 19:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_enjoy_your_trip);
                                break;
                            case 20:
                            case 21:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_during_travel_1_update1);
                                break;
                            case 22:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_before_travel_westward_2);
                                break;
                            case 23:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_before_next_travel_westward_2);
                                break;
                            case 24:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_travel_day_westward_2);
                                break;
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_during_flight);
                                break;
                            case 32:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_during_travel_westward_2);
                                break;
                            case 33:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_before_travel_eastward_2);
                                break;
                            case 34:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_before_next_travel_eastward_2);
                                break;
                            case 35:
                            case 36:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_travel_day_eastward_2);
                                break;
                            case 37:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_during_travel_eastward_2);
                                break;
                            case 38:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_before_travel_westward_3);
                                break;
                            case 39:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_before_next_travel_westward_3);
                                break;
                            case 40:
                            case 41:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_travel_day_westward_3);
                                break;
                            case 42:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_during_travel_westward_3);
                                break;
                            case 43:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_before_travel_eastward_3);
                                break;
                            case 44:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_before_next_travel_eastward_3);
                                break;
                            case 45:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_travel_day_eastward_3);
                                break;
                            case 46:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_during_travel_eastward_3);
                                break;
                            case 47:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_before_travel_westward_4);
                                break;
                            case 48:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_before_next_travel_westward_4);
                                break;
                            case 49:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_during_travel_westward_4);
                                break;
                            case 50:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_before_travel_eastward_delay_4);
                                break;
                            case 51:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_before_next_travel_eastward_delay_4);
                                break;
                            case 52:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_during_travel_eastward_delay_4);
                                break;
                            case 53:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_before_travel_eastward_4);
                                break;
                            case 54:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_before_next_travel_eastward_4);
                                break;
                            case 55:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_during_travel_eastward_4);
                                break;
                            case 56:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_before_travel_short);
                                break;
                            case 57:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_before_next_travel_short);
                                break;
                            case 58:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_travel_day_short);
                                break;
                            case 59:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_during_flight_short);
                                break;
                            case 60:
                                numValueOf = Integer.valueOf(R.string.msg_jet_lag_during_travel_short);
                                break;
                            default:
                                numValueOf = null;
                                break;
                        }
                    } else {
                        numValueOf = null;
                    }
                    string3 = numValueOf != null ? bVar.f106379a.getString(numValueOf.intValue()) : null;
                    aVar = cVar2.f106386e;
                    aVar.getClass();
                    if (bodyClockShiftFeedback == null) {
                        string4 = null;
                    } else {
                        aVarArrValues = yr0.a.values();
                        length = aVarArrValues.length;
                        i14 = 0;
                        while (true) {
                            if (i14 < length) {
                                aVar2 = aVarArrValues[i14];
                                if (aVar2.f198935a.contains(bodyClockShiftFeedback)) {
                                    i14++;
                                }
                            } else {
                                aVar2 = null;
                            }
                        }
                        if (aVar2 == null && aVar2 != yr0.a.UNKNOWN) {
                            switch (ks0.a.C2054a.f106378a[aVar2.ordinal()]) {
                                case 1:
                                    numValueOf2 = Integer.valueOf(R.string.msg_body_clock_difference_decrease_due_to_sleep);
                                    break;
                                case 2:
                                    numValueOf2 = Integer.valueOf(R.string.msg_body_clock_difference_not_changed_due_to_sleep_before_travel);
                                    break;
                                case 3:
                                    numValueOf2 = Integer.valueOf(R.string.msg_body_clock_difference_decrease_due_to_linear_model);
                                    break;
                                case 4:
                                    numValueOf2 = numValueOf4;
                                    break;
                                case 5:
                                    numValueOf2 = Integer.valueOf(R.string.msg_body_clock_difference_increase_due_to_sleep_before_next_travel);
                                    break;
                                case 6:
                                    numValueOf2 = Integer.valueOf(R.string.msg_body_clock_difference_not_changed_due_to_sleep_before_next_travel);
                                    break;
                                case 7:
                                    numValueOf2 = Integer.valueOf(R.string.msg_body_clock_difference_direction_changed_westward_due_to_sleep_before_next_travel);
                                    break;
                                case 8:
                                    numValueOf2 = Integer.valueOf(R.string.msg_body_clock_difference_direction_changed_eastward_due_to_sleep_before_next_travel);
                                    break;
                                case 9:
                                    numValueOf2 = Integer.valueOf(R.string.msg_body_clock_difference_first_day);
                                    break;
                                case 10:
                                    numValueOf2 = Integer.valueOf(R.string.msg_body_clock_difference_changed_due_to_time_zone_change_at_last_3_h);
                                    break;
                                case 11:
                                    numValueOf2 = Integer.valueOf(R.string.msg_body_clock_difference_changed_due_to_time_zone_change_less_than_3_h);
                                    break;
                                default:
                                    numValueOf2 = null;
                                    break;
                            }
                        } else {
                            numValueOf2 = null;
                        }
                        if (numValueOf2 != null) {
                            string4 = aVar.f106377a.getString(numValueOf2.intValue());
                        } else {
                            string4 = null;
                        }
                    }
                    if (string3 == null && string4 != null) {
                        string3 = e5.g(string3, StringUtils.SPACE, string4);
                    } else if (string3 == null || string4 == null) {
                        if (string3 != null || string4 != null) {
                        }
                    }
                    textView = this.f100596d;
                    if (string3 != null || string3.length() == 0) {
                        v22.e.j(textView);
                    } else {
                        textView.setText(string3);
                        textView.setVisibility(0);
                    }
                    v22.e.q(this.f100597e);
                    listJ = fVar.j();
                    localDateI = fVar.i();
                    if (listJ != null) {
                        ns0.b bVar2 = ns0.b.f127812a;
                        yr0.c cVar3 = new yr0.c(localDateI);
                        bVar2.getClass();
                        arrayListC = ns0.b.c(listJ, cVar3);
                    } else {
                        arrayListC = null;
                    }
                    if (tVar3 != t.PRE_TRIP || tVar3 == t.PAST_PRE_TRIP) {
                        ns0.b bVar3 = ns0.b.f127812a;
                        String currentLocation = fVar.getCurrentLocation();
                        bVar3.getClass();
                        strE = ns0.b.e(currentLocation);
                    } else if (arrayListC != null && !arrayListC.isEmpty()) {
                        StringBuilder sb3 = new StringBuilder();
                        Iterator it = h0.N0(arrayListC, new ks0.d()).iterator();
                        while (it.hasNext()) {
                            j jVar2 = (j) it.next();
                            ns0.b bVar4 = ns0.b.f127812a;
                            String originLocation = jVar2.getOriginLocation();
                            bVar4.getClass();
                            sb3.append(ns0.b.e(originLocation) + " (GMT " + jVar2.getOriginTimezone() + ") • ");
                            sb3.append(ns0.b.e(jVar2.getDestinationLocation()) + " (GMT " + jVar2.getDestinationTimezone() + ") • ");
                            l3 l3Var = cVar2.f106383b;
                            String destinationTimezone = jVar2.getDestinationTimezone();
                            o13.p pVarG = destinationTimezone != null ? ns0.b.g(destinationTimezone) : null;
                            DateTime dateTimeD4 = jVar2.d("yyyy-MM-dd'T'HH:mm:ss");
                            if (dateTimeD4 == null) {
                                time = 0;
                            } else {
                                DateTime dateTimeMinusHours = dateTimeD4.minusHours(pVarG != null ? ((Number) pVarG.f128594a).intValue() : 0);
                                if (dateTimeMinusHours == null) {
                                    time = 0;
                                } else {
                                    DateTime dateTimeMinusMinutes = dateTimeMinusHours.minusMinutes(pVarG != null ? ((Number) pVarG.f128595b).intValue() : 0);
                                    if (dateTimeMinusMinutes == null || (date2 = dateTimeMinusMinutes.toDate()) == null) {
                                        time = 0;
                                    } else {
                                        time = date2.getTime();
                                    }
                                }
                            }
                            String originTimezone = jVar2.getOriginTimezone();
                            o13.p pVarG2 = originTimezone != null ? ns0.b.g(originTimezone) : null;
                            DateTime dateTimeK4 = jVar2.k("yyyy-MM-dd'T'HH:mm:ss");
                            if (dateTimeK4 == null) {
                                time2 = 0;
                            } else {
                                DateTime dateTimeMinusHours2 = dateTimeK4.minusHours(pVarG2 != null ? ((Number) pVarG2.f128594a).intValue() : 0);
                                if (dateTimeMinusHours2 == null) {
                                    time2 = 0;
                                } else {
                                    DateTime dateTimeMinusMinutes2 = dateTimeMinusHours2.minusMinutes(pVarG2 != null ? ((Number) pVarG2.f128595b).intValue() : 0);
                                    if (dateTimeMinusMinutes2 == null || (date = dateTimeMinusMinutes2.toDate()) == null) {
                                        time2 = 0;
                                    } else {
                                        time2 = date.getTime();
                                    }
                                }
                            }
                            long j8 = time - time2;
                            Iterator it3 = it;
                            long j14 = DateTimeConstants.MILLIS_PER_DAY;
                            long j15 = j8 / j14;
                            long j16 = j8 % j14;
                            long j17 = DateTimeConstants.MILLIS_PER_HOUR;
                            long j18 = j16 / j17;
                            long j19 = (j16 % j17) / ((long) DateTimeConstants.MILLIS_PER_MINUTE);
                            if (j15 > 0) {
                                j18 = (j15 * ((long) 24)) + j18;
                            }
                            o13.p pVar = new o13.p(Integer.valueOf((int) j18), Integer.valueOf((int) j19));
                            l3Var.getClass();
                            int iIntValue = ((Number) pVar.f128594a).intValue();
                            int iIntValue2 = ((Number) pVar.f128595b).intValue();
                            l22.b bVar5 = l3Var.f23140a;
                            String string7 = bVar5.getString(R.string.lbl_minutes_abbreviation);
                            String string8 = bVar5.getString(R.string.lbl_hours_abbreviation);
                            if (iIntValue == 0 && iIntValue2 == 0) {
                                strF = "";
                            } else if (iIntValue == 0) {
                                strF = androidx.core.view.j.f(iIntValue2, string7);
                            } else if (iIntValue2 == 0) {
                                strF = androidx.core.view.j.f(iIntValue, string8);
                            } else {
                                strF = iIntValue + string8 + StringUtils.SPACE + iIntValue2 + string7;
                            }
                            sb3.append(strF);
                            sb3.append("\n");
                            it = it3;
                        }
                        w.Q("\n", sb3);
                        strE = sb3.toString();
                    } else if (listJ != null && !listJ.isEmpty()) {
                        ns0.b bVar6 = ns0.b.f127812a;
                        q qVar = new q(localDateI);
                        bVar6.getClass();
                        ArrayList arrayListC2 = ns0.b.c(listJ, qVar);
                        if (!arrayListC2.isEmpty()) {
                            strE = ns0.b.e(((j) h0.m0(arrayListC2)).getDestinationLocation());
                        }
                    }
                    if (strE.length() > 0) {
                        TextView textView4 = this.f100598f;
                        textView4.setText(strE);
                        i15 = 0;
                        textView4.setVisibility(0);
                    } else {
                        i15 = 0;
                    }
                    aVar3 = this.f100599g;
                    aVar3.f36969a.setVisibility(i15);
                    listQ = yr0.f.q(fVar);
                    if (listQ != null && !listQ.isEmpty()) {
                        localDateI4 = fVar.i();
                        if (localDateI4 == null) {
                            localDateI4 = LocalDate.now();
                        }
                        m mVar = m.ACTIVITY;
                        localDateI4.getClass();
                        ArrayList arrayListA = aVar3.a(listQ, mVar, localDateI4);
                        ArrayList arrayListA2 = aVar3.a(listQ, m.SLEEP, localDateI4);
                        ArrayList arrayListA3 = aVar3.a(listQ, m.LIGHT_AVOIDANCE, localDateI4);
                        ArrayList arrayListA4 = aVar3.a(listQ, m.LIGHT_EXPOSURE, localDateI4);
                        GuidanceTimeline guidanceTimeline = aVar3.f36972d.f36976c;
                        guidanceTimeline.getClass();
                        guidanceTimeline.f36964e = arrayListA;
                        guidanceTimeline.invalidate();
                        GuidanceTimeline guidanceTimeline2 = aVar3.f36971c.f36976c;
                        guidanceTimeline2.getClass();
                        guidanceTimeline2.f36964e = arrayListA2;
                        guidanceTimeline2.invalidate();
                        GuidanceTimeline guidanceTimeline3 = aVar3.f36970b.f36976c;
                        ArrayList arrayListC0 = h0.C0(arrayListA3, arrayListA4);
                        guidanceTimeline3.getClass();
                        guidanceTimeline3.f36964e = arrayListC0;
                        guidanceTimeline3.invalidate();
                    }
                    CustomLineChart customLineChart = this.f100600h;
                    v22.e.q(customLineChart);
                    customLineChart.getAxisLeft().setEnabled(false);
                    qz.a.b(this.f100607o, gVar3, null, 6);
                    this.f100603k.getClass();
                    if (gVar3.a()) {
                        localDateI2 = fVar.i();
                        listJ2 = fVar.j();
                        if (listJ2 != null) {
                            arrayList2 = new ArrayList();
                            for (Object obj : listJ2) {
                                j jVar3 = (j) obj;
                                dateTimeD2 = jVar3.d("yyyy-MM-dd'T'HH:mm:ss");
                                dateTimeK2 = jVar3.k("yyyy-MM-dd'T'HH:mm:ss");
                                if (dateTimeD2 != null) {
                                    localDate = dateTimeD2.toLocalDate();
                                } else {
                                    localDate = null;
                                }
                                if (k.g(localDateI2, localDate)) {
                                    if (dateTimeK2 != null) {
                                        localDate2 = dateTimeK2.toLocalDate();
                                    } else {
                                        localDate2 = null;
                                    }
                                    if (k.g(localDateI2, localDate2)) {
                                    }
                                }
                                arrayList2.add(obj);
                            }
                            arrayList = new ArrayList(y.r(arrayList2, 10));
                            for (j jVar4 : arrayList2) {
                                dateTimeD = jVar4.d("yyyy-MM-dd'T'HH:mm:ss");
                                dateTimeK = jVar4.k("yyyy-MM-dd'T'HH:mm:ss");
                                if (dateTimeD == null && k.g(localDateI2, dateTimeD.toLocalDate())) {
                                    minuteOfDay = dateTimeD.getMinuteOfDay();
                                } else {
                                    minuteOfDay = 1440;
                                }
                                if (dateTimeK == null && k.g(localDateI2, dateTimeK.toLocalDate())) {
                                    minuteOfDay2 = dateTimeK.getMinuteOfDay();
                                } else {
                                    minuteOfDay2 = 0;
                                }
                                arrayList.add(new o13.p(Integer.valueOf(minuteOfDay2), Integer.valueOf(minuteOfDay)));
                            }
                        } else {
                            arrayList = null;
                        }
                        if (arrayList == null) {
                            list = j0.f134944a;
                        } else {
                            list = arrayList;
                        }
                    } else {
                        list = j0.f134944a;
                    }
                    i iVar = this.f100606n;
                    iVar.getClass();
                    list.getClass();
                    es0.a aVar6 = iVar.f65204a;
                    aVar6.getClass();
                    aVar6.f65176m = list;
                    es0.d dVar = this.f100605m;
                    dVar.getClass();
                    arrayList3 = dVar.f65191f;
                    arrayList3.clear();
                    localDateI3 = fVar.i();
                    if (localDateI3 == null) {
                        localDateI3 = LocalDate.now();
                    }
                    listQ2 = yr0.f.q(fVar);
                    if (listQ2 != null) {
                        for (l lVar : listQ2) {
                            mVarF = lVar.f();
                            if (mVarF != null) {
                                localDateI3.getClass();
                                dateTimeD3 = lVar.d();
                                if (dateTimeD3 == null && dateTimeD3.toLocalDate().isEqual(localDateI3)) {
                                    minuteOfDay3 = dateTimeD3.getMinuteOfDay();
                                } else {
                                    minuteOfDay3 = 0;
                                }
                                dateTimeB = lVar.b();
                                if (dateTimeB == null && dateTimeB.toLocalDate().isEqual(localDateI3)) {
                                    minuteOfDay4 = dateTimeB.getMinuteOfDay();
                                } else {
                                    minuteOfDay4 = 1440;
                                }
                                arrayList3.add(new o13.p(new j23.l(minuteOfDay3, minuteOfDay4), mVarF));
                            }
                        }
                    }
                    d();
                    listQ3 = yr0.f.q(fVar);
                    v22.e.q(this.f100601i);
                    linearLayout = this.f100602j;
                    v22.e.q(linearLayout);
                    linearLayout.removeAllViews();
                    layoutInflater = this.f100594b;
                    linearLayout.addView(layoutInflater.inflate(R.layout.jet_lag_schedule_item_header, (ViewGroup) linearLayout, false));
                    gVar2 = this.f100610r;
                    if (gVar2 != null) {
                        tVar = gVar2.f198960c;
                    } else {
                        tVar = null;
                    }
                    if (tVar != t.ACCLIMATED) {
                        if (gVar2 != null) {
                            tVar2 = gVar2.f198960c;
                        } else {
                            tVar2 = null;
                        }
                        if (tVar2 != t.PAST_ACCLIMATED) {
                            if (listQ3 != null || listQ3.isEmpty()) {
                                View viewInflate = layoutInflater.inflate(R.layout.jet_lag_schedule_item, (ViewGroup) linearLayout, false);
                                viewInflate.getClass();
                                new C1928a(viewInflate, cVar2).a(true);
                                linearLayout.addView(viewInflate);
                                return;
                            }
                            int i18 = 0;
                            for (Object obj2 : h0.N0(listQ3, new b())) {
                                int i19 = i18 + 1;
                                if (i18 < 0) {
                                    x.q();
                                    throw null;
                                }
                                l lVar2 = (l) obj2;
                                View viewInflate2 = layoutInflater.inflate(R.layout.jet_lag_schedule_item, (ViewGroup) linearLayout, false);
                                viewInflate2.getClass();
                                C1928a c1928a = new C1928a(viewInflate2, cVar2);
                                yr0.g gVar4 = this.f100610r;
                                LocalDate localDateI6 = (gVar4 == null || (fVar2 = gVar4.f198958a) == null) ? null : fVar2.i();
                                lVar2.getClass();
                                int i24 = i18 % 2 == 0 ? R.color.gcm_table_row_even : R.color.gcm_table_row_odd;
                                View view2 = c1928a.f100611a;
                                view2.setBackgroundColor(a7.b.getColor(view2.getContext(), i24));
                                int iE = ks0.c.e(lVar2.f());
                                m mVarF2 = lVar2.f();
                                m mVar2 = m.LIGHT_AVOIDANCE;
                                ImageView imageView = c1928a.f100613c;
                                if (mVarF2 == mVar2) {
                                    imageView.setBackgroundResource(R.drawable.gcm_jet_lag_avoid_light);
                                    v22.e.h(imageView, i24);
                                } else {
                                    imageView.setBackgroundResource(R.drawable.circle_white);
                                    v22.e.h(imageView, iE);
                                }
                                m mVarF3 = lVar2.f();
                                ks0.c cVar4 = c1928a.f100612b;
                                c1928a.f100614d.setText(cVar4.f(mVarF3));
                                l22.a aVar7 = cVar4.f106382a;
                                DateTime dateTimeD5 = lVar2.d();
                                DateTime dateTimeB2 = lVar2.b();
                                if (dateTimeD5 == null || dateTimeB2 == null) {
                                    if (dateTimeD5 == null && dateTimeB2 != null) {
                                        string5 = aVar7.a(R.string.lbl_until_time_of_day, cVar4.d(false, false, dateTimeB2.minuteOfDay().get()));
                                    } else if (dateTimeD5 == null || dateTimeB2 != null) {
                                        string5 = aVar7.getString(R.string.no_value);
                                    } else {
                                        string5 = aVar7.a(R.string.common_from_timespan, cVar4.d(false, false, dateTimeD5.minuteOfDay().get())).toUpperCase(Locale.ROOT);
                                        string5.getClass();
                                    }
                                } else if (localDateI6 != null && dateTimeB2.getDayOfMonth() == localDateI6.getDayOfMonth() && dateTimeD5.plusDays(1).getDayOfMonth() == dateTimeB2.getDayOfMonth()) {
                                    string5 = aVar7.a(R.string.lbl_until_time_of_day, cVar4.d(false, false, dateTimeB2.minuteOfDay().get()));
                                } else {
                                    float f14 = dateTimeD5.minuteOfDay().get();
                                    float f15 = dateTimeB2.minuteOfDay().get();
                                    float f16 = 779;
                                    string5 = e5.g(cVar4.d(false, (f14 <= f16 && f15 <= f16) || (f14 > f16 && f15 > f16), f14), " - ", cVar4.d(false, false, f15));
                                }
                                c1928a.f100615e.setText(string5);
                                linearLayout.addView(viewInflate2);
                                i18 = i19;
                            }
                            return;
                        }
                    }
                    View viewInflate3 = layoutInflater.inflate(R.layout.jet_lag_schedule_item, (ViewGroup) linearLayout, false);
                    viewInflate3.getClass();
                    new C1928a(viewInflate3, cVar2).a(false);
                    linearLayout.addView(viewInflate3);
                }
                fVar = fVar3;
                aVar = cVar2.f106386e;
                aVar.getClass();
                if (bodyClockShiftFeedback == null) {
                    string4 = null;
                } else {
                    aVarArrValues = yr0.a.values();
                    length = aVarArrValues.length;
                    i14 = 0;
                    while (true) {
                        if (i14 < length) {
                            aVar2 = aVarArrValues[i14];
                            if (aVar2.f198935a.contains(bodyClockShiftFeedback)) {
                                i14++;
                            }
                        } else {
                            aVar2 = null;
                        }
                    }
                    if (aVar2 == null) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = null;
                    }
                    if (numValueOf2 != null) {
                        string4 = aVar.f106377a.getString(numValueOf2.intValue());
                    } else {
                        string4 = null;
                    }
                }
                if (string3 == null) {
                    if (string3 == null) {
                    }
                    if (string3 != null) {
                    }
                } else {
                    if (string3 == null) {
                    }
                    if (string3 != null) {
                    }
                }
                textView = this.f100596d;
                if (string3 != null) {
                    v22.e.j(textView);
                } else {
                    v22.e.j(textView);
                }
                v22.e.q(this.f100597e);
                listJ = fVar.j();
                localDateI = fVar.i();
                if (listJ != null) {
                    ns0.b bVar7 = ns0.b.f127812a;
                    yr0.c cVar5 = new yr0.c(localDateI);
                    bVar7.getClass();
                    arrayListC = ns0.b.c(listJ, cVar5);
                } else {
                    arrayListC = null;
                }
                if (tVar3 != t.PRE_TRIP) {
                    ns0.b bVar8 = ns0.b.f127812a;
                    String currentLocation2 = fVar.getCurrentLocation();
                    bVar8.getClass();
                    strE = ns0.b.e(currentLocation2);
                } else {
                    ns0.b bVar9 = ns0.b.f127812a;
                    String currentLocation3 = fVar.getCurrentLocation();
                    bVar9.getClass();
                    strE = ns0.b.e(currentLocation3);
                }
                if (strE.length() > 0) {
                    TextView textView5 = this.f100598f;
                    textView5.setText(strE);
                    i15 = 0;
                    textView5.setVisibility(0);
                } else {
                    i15 = 0;
                }
                aVar3 = this.f100599g;
                aVar3.f36969a.setVisibility(i15);
                listQ = yr0.f.q(fVar);
                if (listQ != null) {
                    localDateI4 = fVar.i();
                    if (localDateI4 == null) {
                        localDateI4 = LocalDate.now();
                    }
                    m mVar3 = m.ACTIVITY;
                    localDateI4.getClass();
                    ArrayList arrayListA5 = aVar3.a(listQ, mVar3, localDateI4);
                    ArrayList arrayListA6 = aVar3.a(listQ, m.SLEEP, localDateI4);
                    ArrayList arrayListA7 = aVar3.a(listQ, m.LIGHT_AVOIDANCE, localDateI4);
                    ArrayList arrayListA8 = aVar3.a(listQ, m.LIGHT_EXPOSURE, localDateI4);
                    GuidanceTimeline guidanceTimeline4 = aVar3.f36972d.f36976c;
                    guidanceTimeline4.getClass();
                    guidanceTimeline4.f36964e = arrayListA5;
                    guidanceTimeline4.invalidate();
                    GuidanceTimeline guidanceTimeline5 = aVar3.f36971c.f36976c;
                    guidanceTimeline5.getClass();
                    guidanceTimeline5.f36964e = arrayListA6;
                    guidanceTimeline5.invalidate();
                    GuidanceTimeline guidanceTimeline6 = aVar3.f36970b.f36976c;
                    ArrayList arrayListC1 = h0.C0(arrayListA7, arrayListA8);
                    guidanceTimeline6.getClass();
                    guidanceTimeline6.f36964e = arrayListC1;
                    guidanceTimeline6.invalidate();
                }
                CustomLineChart customLineChart2 = this.f100600h;
                v22.e.q(customLineChart2);
                customLineChart2.getAxisLeft().setEnabled(false);
                qz.a.b(this.f100607o, gVar3, null, 6);
                this.f100603k.getClass();
                if (gVar3.a()) {
                    list = j0.f134944a;
                } else {
                    localDateI2 = fVar.i();
                    listJ2 = fVar.j();
                    if (listJ2 != null) {
                        arrayList2 = new ArrayList();
                        while (r3.hasNext()) {
                            j jVar5 = (j) obj;
                            dateTimeD2 = jVar5.d("yyyy-MM-dd'T'HH:mm:ss");
                            dateTimeK2 = jVar5.k("yyyy-MM-dd'T'HH:mm:ss");
                            if (dateTimeD2 != null) {
                                localDate = dateTimeD2.toLocalDate();
                            } else {
                                localDate = null;
                            }
                            if (k.g(localDateI2, localDate)) {
                                if (dateTimeK2 != null) {
                                    localDate2 = dateTimeK2.toLocalDate();
                                } else {
                                    localDate2 = null;
                                }
                                if (k.g(localDateI2, localDate2)) {
                                }
                            }
                            arrayList2.add(obj);
                        }
                        arrayList = new ArrayList(y.r(arrayList2, 10));
                        while (r4.hasNext()) {
                            dateTimeD = jVar4.d("yyyy-MM-dd'T'HH:mm:ss");
                            dateTimeK = jVar4.k("yyyy-MM-dd'T'HH:mm:ss");
                            if (dateTimeD == null) {
                                minuteOfDay = 1440;
                            } else {
                                minuteOfDay = 1440;
                            }
                            if (dateTimeK == null) {
                                minuteOfDay2 = 0;
                            } else {
                                minuteOfDay2 = 0;
                            }
                            arrayList.add(new o13.p(Integer.valueOf(minuteOfDay2), Integer.valueOf(minuteOfDay)));
                        }
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        list = j0.f134944a;
                    } else {
                        list = arrayList;
                    }
                }
                i iVar2 = this.f100606n;
                iVar2.getClass();
                list.getClass();
                es0.a aVar8 = iVar2.f65204a;
                aVar8.getClass();
                aVar8.f65176m = list;
                es0.d dVar2 = this.f100605m;
                dVar2.getClass();
                arrayList3 = dVar2.f65191f;
                arrayList3.clear();
                localDateI3 = fVar.i();
                if (localDateI3 == null) {
                    localDateI3 = LocalDate.now();
                }
                listQ2 = yr0.f.q(fVar);
                if (listQ2 != null) {
                    while (r4.hasNext()) {
                        mVarF = lVar.f();
                        if (mVarF != null) {
                            localDateI3.getClass();
                            dateTimeD3 = lVar.d();
                            if (dateTimeD3 == null) {
                                minuteOfDay3 = 0;
                            } else {
                                minuteOfDay3 = 0;
                            }
                            dateTimeB = lVar.b();
                            if (dateTimeB == null) {
                                minuteOfDay4 = 1440;
                            } else {
                                minuteOfDay4 = 1440;
                            }
                            arrayList3.add(new o13.p(new j23.l(minuteOfDay3, minuteOfDay4), mVarF));
                        }
                    }
                }
                d();
                listQ3 = yr0.f.q(fVar);
                v22.e.q(this.f100601i);
                linearLayout = this.f100602j;
                v22.e.q(linearLayout);
                linearLayout.removeAllViews();
                layoutInflater = this.f100594b;
                linearLayout.addView(layoutInflater.inflate(R.layout.jet_lag_schedule_item_header, (ViewGroup) linearLayout, false));
                gVar2 = this.f100610r;
                if (gVar2 != null) {
                    tVar = gVar2.f198960c;
                } else {
                    tVar = null;
                }
                if (tVar != t.ACCLIMATED) {
                    if (gVar2 != null) {
                        tVar2 = gVar2.f198960c;
                    } else {
                        tVar2 = null;
                    }
                    if (tVar2 != t.PAST_ACCLIMATED) {
                        if (listQ3 != null) {
                        }
                        View viewInflate4 = layoutInflater.inflate(R.layout.jet_lag_schedule_item, (ViewGroup) linearLayout, false);
                        viewInflate4.getClass();
                        new C1928a(viewInflate4, cVar2).a(true);
                        linearLayout.addView(viewInflate4);
                        return;
                    }
                }
                View viewInflate5 = layoutInflater.inflate(R.layout.jet_lag_schedule_item, (ViewGroup) linearLayout, false);
                viewInflate5.getClass();
                new C1928a(viewInflate5, cVar2).a(false);
                linearLayout.addView(viewInflate5);
            }
            fVar = fVar3;
            string3 = null;
            textView = this.f100596d;
            if (string3 != null) {
                v22.e.j(textView);
            } else {
                v22.e.j(textView);
            }
            v22.e.q(this.f100597e);
            listJ = fVar.j();
            localDateI = fVar.i();
            if (listJ != null) {
                ns0.b bVar10 = ns0.b.f127812a;
                yr0.c cVar6 = new yr0.c(localDateI);
                bVar10.getClass();
                arrayListC = ns0.b.c(listJ, cVar6);
            } else {
                arrayListC = null;
            }
            if (tVar3 != t.PRE_TRIP) {
                ns0.b bVar11 = ns0.b.f127812a;
                String currentLocation4 = fVar.getCurrentLocation();
                bVar11.getClass();
                strE = ns0.b.e(currentLocation4);
            } else {
                ns0.b bVar12 = ns0.b.f127812a;
                String currentLocation5 = fVar.getCurrentLocation();
                bVar12.getClass();
                strE = ns0.b.e(currentLocation5);
            }
            if (strE.length() > 0) {
                TextView textView6 = this.f100598f;
                textView6.setText(strE);
                i15 = 0;
                textView6.setVisibility(0);
            } else {
                i15 = 0;
            }
            aVar3 = this.f100599g;
            aVar3.f36969a.setVisibility(i15);
            listQ = yr0.f.q(fVar);
            if (listQ != null) {
                localDateI4 = fVar.i();
                if (localDateI4 == null) {
                    localDateI4 = LocalDate.now();
                }
                m mVar4 = m.ACTIVITY;
                localDateI4.getClass();
                ArrayList arrayListA9 = aVar3.a(listQ, mVar4, localDateI4);
                ArrayList arrayListA10 = aVar3.a(listQ, m.SLEEP, localDateI4);
                ArrayList arrayListA11 = aVar3.a(listQ, m.LIGHT_AVOIDANCE, localDateI4);
                ArrayList arrayListA12 = aVar3.a(listQ, m.LIGHT_EXPOSURE, localDateI4);
                GuidanceTimeline guidanceTimeline7 = aVar3.f36972d.f36976c;
                guidanceTimeline7.getClass();
                guidanceTimeline7.f36964e = arrayListA9;
                guidanceTimeline7.invalidate();
                GuidanceTimeline guidanceTimeline8 = aVar3.f36971c.f36976c;
                guidanceTimeline8.getClass();
                guidanceTimeline8.f36964e = arrayListA10;
                guidanceTimeline8.invalidate();
                GuidanceTimeline guidanceTimeline9 = aVar3.f36970b.f36976c;
                ArrayList arrayListC3 = h0.C0(arrayListA11, arrayListA12);
                guidanceTimeline9.getClass();
                guidanceTimeline9.f36964e = arrayListC3;
                guidanceTimeline9.invalidate();
            }
            CustomLineChart customLineChart3 = this.f100600h;
            v22.e.q(customLineChart3);
            customLineChart3.getAxisLeft().setEnabled(false);
            qz.a.b(this.f100607o, gVar3, null, 6);
            this.f100603k.getClass();
            if (gVar3.a()) {
                list = j0.f134944a;
            } else {
                localDateI2 = fVar.i();
                listJ2 = fVar.j();
                if (listJ2 != null) {
                    arrayList2 = new ArrayList();
                    while (r3.hasNext()) {
                        j jVar6 = (j) obj;
                        dateTimeD2 = jVar6.d("yyyy-MM-dd'T'HH:mm:ss");
                        dateTimeK2 = jVar6.k("yyyy-MM-dd'T'HH:mm:ss");
                        if (dateTimeD2 != null) {
                            localDate = dateTimeD2.toLocalDate();
                        } else {
                            localDate = null;
                        }
                        if (k.g(localDateI2, localDate)) {
                            if (dateTimeK2 != null) {
                                localDate2 = dateTimeK2.toLocalDate();
                            } else {
                                localDate2 = null;
                            }
                            if (k.g(localDateI2, localDate2)) {
                            }
                        }
                        arrayList2.add(obj);
                    }
                    arrayList = new ArrayList(y.r(arrayList2, 10));
                    while (r4.hasNext()) {
                        dateTimeD = jVar4.d("yyyy-MM-dd'T'HH:mm:ss");
                        dateTimeK = jVar4.k("yyyy-MM-dd'T'HH:mm:ss");
                        if (dateTimeD == null) {
                            minuteOfDay = 1440;
                        } else {
                            minuteOfDay = 1440;
                        }
                        if (dateTimeK == null) {
                            minuteOfDay2 = 0;
                        } else {
                            minuteOfDay2 = 0;
                        }
                        arrayList.add(new o13.p(Integer.valueOf(minuteOfDay2), Integer.valueOf(minuteOfDay)));
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList == null) {
                    list = j0.f134944a;
                } else {
                    list = arrayList;
                }
            }
            i iVar3 = this.f100606n;
            iVar3.getClass();
            list.getClass();
            es0.a aVar9 = iVar3.f65204a;
            aVar9.getClass();
            aVar9.f65176m = list;
            es0.d dVar3 = this.f100605m;
            dVar3.getClass();
            arrayList3 = dVar3.f65191f;
            arrayList3.clear();
            localDateI3 = fVar.i();
            if (localDateI3 == null) {
                localDateI3 = LocalDate.now();
            }
            listQ2 = yr0.f.q(fVar);
            if (listQ2 != null) {
                while (r4.hasNext()) {
                    mVarF = lVar.f();
                    if (mVarF != null) {
                        localDateI3.getClass();
                        dateTimeD3 = lVar.d();
                        if (dateTimeD3 == null) {
                            minuteOfDay3 = 0;
                        } else {
                            minuteOfDay3 = 0;
                        }
                        dateTimeB = lVar.b();
                        if (dateTimeB == null) {
                            minuteOfDay4 = 1440;
                        } else {
                            minuteOfDay4 = 1440;
                        }
                        arrayList3.add(new o13.p(new j23.l(minuteOfDay3, minuteOfDay4), mVarF));
                    }
                }
            }
            d();
            listQ3 = yr0.f.q(fVar);
            v22.e.q(this.f100601i);
            linearLayout = this.f100602j;
            v22.e.q(linearLayout);
            linearLayout.removeAllViews();
            layoutInflater = this.f100594b;
            linearLayout.addView(layoutInflater.inflate(R.layout.jet_lag_schedule_item_header, (ViewGroup) linearLayout, false));
            gVar2 = this.f100610r;
            if (gVar2 != null) {
                tVar = gVar2.f198960c;
            } else {
                tVar = null;
            }
            if (tVar != t.ACCLIMATED) {
                if (gVar2 != null) {
                    tVar2 = gVar2.f198960c;
                } else {
                    tVar2 = null;
                }
                if (tVar2 != t.PAST_ACCLIMATED) {
                    if (listQ3 != null) {
                    }
                    View viewInflate6 = layoutInflater.inflate(R.layout.jet_lag_schedule_item, (ViewGroup) linearLayout, false);
                    viewInflate6.getClass();
                    new C1928a(viewInflate6, cVar2).a(true);
                    linearLayout.addView(viewInflate6);
                    return;
                }
            }
            View viewInflate7 = layoutInflater.inflate(R.layout.jet_lag_schedule_item, (ViewGroup) linearLayout, false);
            viewInflate7.getClass();
            new C1928a(viewInflate7, cVar2).a(false);
            linearLayout.addView(viewInflate7);
        }
        string4 = aVar5.getString(R.string.msg_no_guidance_available);
        fVar = fVar3;
        string3 = string4;
        textView = this.f100596d;
        if (string3 != null) {
            v22.e.j(textView);
        } else {
            v22.e.j(textView);
        }
        v22.e.q(this.f100597e);
        listJ = fVar.j();
        localDateI = fVar.i();
        if (listJ != null) {
            ns0.b bVar13 = ns0.b.f127812a;
            yr0.c cVar7 = new yr0.c(localDateI);
            bVar13.getClass();
            arrayListC = ns0.b.c(listJ, cVar7);
        } else {
            arrayListC = null;
        }
        if (tVar3 != t.PRE_TRIP) {
            ns0.b bVar14 = ns0.b.f127812a;
            String currentLocation6 = fVar.getCurrentLocation();
            bVar14.getClass();
            strE = ns0.b.e(currentLocation6);
        } else {
            ns0.b bVar15 = ns0.b.f127812a;
            String currentLocation7 = fVar.getCurrentLocation();
            bVar15.getClass();
            strE = ns0.b.e(currentLocation7);
        }
        if (strE.length() > 0) {
            TextView textView7 = this.f100598f;
            textView7.setText(strE);
            i15 = 0;
            textView7.setVisibility(0);
        } else {
            i15 = 0;
        }
        aVar3 = this.f100599g;
        aVar3.f36969a.setVisibility(i15);
        listQ = yr0.f.q(fVar);
        if (listQ != null) {
            localDateI4 = fVar.i();
            if (localDateI4 == null) {
                localDateI4 = LocalDate.now();
            }
            m mVar5 = m.ACTIVITY;
            localDateI4.getClass();
            ArrayList arrayListA13 = aVar3.a(listQ, mVar5, localDateI4);
            ArrayList arrayListA14 = aVar3.a(listQ, m.SLEEP, localDateI4);
            ArrayList arrayListA15 = aVar3.a(listQ, m.LIGHT_AVOIDANCE, localDateI4);
            ArrayList arrayListA16 = aVar3.a(listQ, m.LIGHT_EXPOSURE, localDateI4);
            GuidanceTimeline guidanceTimeline10 = aVar3.f36972d.f36976c;
            guidanceTimeline10.getClass();
            guidanceTimeline10.f36964e = arrayListA13;
            guidanceTimeline10.invalidate();
            GuidanceTimeline guidanceTimeline11 = aVar3.f36971c.f36976c;
            guidanceTimeline11.getClass();
            guidanceTimeline11.f36964e = arrayListA14;
            guidanceTimeline11.invalidate();
            GuidanceTimeline guidanceTimeline12 = aVar3.f36970b.f36976c;
            ArrayList arrayListC4 = h0.C0(arrayListA15, arrayListA16);
            guidanceTimeline12.getClass();
            guidanceTimeline12.f36964e = arrayListC4;
            guidanceTimeline12.invalidate();
        }
        CustomLineChart customLineChart4 = this.f100600h;
        v22.e.q(customLineChart4);
        customLineChart4.getAxisLeft().setEnabled(false);
        qz.a.b(this.f100607o, gVar3, null, 6);
        this.f100603k.getClass();
        if (gVar3.a()) {
            list = j0.f134944a;
        } else {
            localDateI2 = fVar.i();
            listJ2 = fVar.j();
            if (listJ2 != null) {
                arrayList2 = new ArrayList();
                while (r3.hasNext()) {
                    j jVar7 = (j) obj;
                    dateTimeD2 = jVar7.d("yyyy-MM-dd'T'HH:mm:ss");
                    dateTimeK2 = jVar7.k("yyyy-MM-dd'T'HH:mm:ss");
                    if (dateTimeD2 != null) {
                        localDate = dateTimeD2.toLocalDate();
                    } else {
                        localDate = null;
                    }
                    if (k.g(localDateI2, localDate)) {
                        if (dateTimeK2 != null) {
                            localDate2 = dateTimeK2.toLocalDate();
                        } else {
                            localDate2 = null;
                        }
                        if (k.g(localDateI2, localDate2)) {
                        }
                    }
                    arrayList2.add(obj);
                }
                arrayList = new ArrayList(y.r(arrayList2, 10));
                while (r4.hasNext()) {
                    dateTimeD = jVar4.d("yyyy-MM-dd'T'HH:mm:ss");
                    dateTimeK = jVar4.k("yyyy-MM-dd'T'HH:mm:ss");
                    if (dateTimeD == null) {
                        minuteOfDay = 1440;
                    } else {
                        minuteOfDay = 1440;
                    }
                    if (dateTimeK == null) {
                        minuteOfDay2 = 0;
                    } else {
                        minuteOfDay2 = 0;
                    }
                    arrayList.add(new o13.p(Integer.valueOf(minuteOfDay2), Integer.valueOf(minuteOfDay)));
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                list = j0.f134944a;
            } else {
                list = arrayList;
            }
        }
        i iVar4 = this.f100606n;
        iVar4.getClass();
        list.getClass();
        es0.a aVar10 = iVar4.f65204a;
        aVar10.getClass();
        aVar10.f65176m = list;
        es0.d dVar4 = this.f100605m;
        dVar4.getClass();
        arrayList3 = dVar4.f65191f;
        arrayList3.clear();
        localDateI3 = fVar.i();
        if (localDateI3 == null) {
            localDateI3 = LocalDate.now();
        }
        listQ2 = yr0.f.q(fVar);
        if (listQ2 != null) {
            while (r4.hasNext()) {
                mVarF = lVar.f();
                if (mVarF != null) {
                    localDateI3.getClass();
                    dateTimeD3 = lVar.d();
                    if (dateTimeD3 == null) {
                        minuteOfDay3 = 0;
                    } else {
                        minuteOfDay3 = 0;
                    }
                    dateTimeB = lVar.b();
                    if (dateTimeB == null) {
                        minuteOfDay4 = 1440;
                    } else {
                        minuteOfDay4 = 1440;
                    }
                    arrayList3.add(new o13.p(new j23.l(minuteOfDay3, minuteOfDay4), mVarF));
                }
            }
        }
        d();
        listQ3 = yr0.f.q(fVar);
        v22.e.q(this.f100601i);
        linearLayout = this.f100602j;
        v22.e.q(linearLayout);
        linearLayout.removeAllViews();
        layoutInflater = this.f100594b;
        linearLayout.addView(layoutInflater.inflate(R.layout.jet_lag_schedule_item_header, (ViewGroup) linearLayout, false));
        gVar2 = this.f100610r;
        if (gVar2 != null) {
            tVar = gVar2.f198960c;
        } else {
            tVar = null;
        }
        if (tVar != t.ACCLIMATED) {
            if (gVar2 != null) {
                tVar2 = gVar2.f198960c;
            } else {
                tVar2 = null;
            }
            if (tVar2 != t.PAST_ACCLIMATED) {
                if (listQ3 != null) {
                }
                View viewInflate8 = layoutInflater.inflate(R.layout.jet_lag_schedule_item, (ViewGroup) linearLayout, false);
                viewInflate8.getClass();
                new C1928a(viewInflate8, cVar2).a(true);
                linearLayout.addView(viewInflate8);
                return;
            }
        }
        View viewInflate9 = layoutInflater.inflate(R.layout.jet_lag_schedule_item, (ViewGroup) linearLayout, false);
        viewInflate9.getClass();
        new C1928a(viewInflate9, cVar2).a(false);
        linearLayout.addView(viewInflate9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        if (this.f100604l) {
            CustomLineChart customLineChart = this.f100600h;
            LineData lineData = (LineData) customLineChart.getData();
            if (lineData == null || lineData.getDataSetCount() != 2) {
                return;
            }
            es0.h hVar = new es0.h(DateTime.now().getMinuteOfDay());
            customLineChart.highlightValue(hVar);
            customLineChart.post(new r0(25, this, hVar));
        }
    }
}
