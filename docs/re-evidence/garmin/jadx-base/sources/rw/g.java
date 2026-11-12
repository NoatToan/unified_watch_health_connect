package rw;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.StyledInlineButtonFieldViewDark;
import com.garmin.android.apps.connectmobile.view.StyledInlineTextFieldViewDark;
import e23.l;
import e23.p;
import g22.k;
import java.util.Calendar;
import org.joda.time.DateTime;
import org.joda.time.Days;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lrw/g;", "", "Landroid/view/View;", "view", "Lyw/b;", "formatter", "Lkotlin/Function1;", "Ljava/util/Calendar;", "", "onDateClicked", "Lkotlin/Function2;", "", "onTimeClicked", "", "onSystolicEdited", "onDiastolicEdited", "onPulseEdited", "", "onNotesEdited", "<init>", "(Landroid/view/View;Lyw/b;Le23/l;Le23/p;Le23/l;Le23/l;Le23/l;Le23/l;)V", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yw.b f154787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<Calendar, Unit> f154788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p<Calendar, Boolean, Unit> f154789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l<Double, Unit> f154790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l<Double, Unit> f154791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l<Double, Unit> f154792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l<String, Unit> f154793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final StyledInlineButtonFieldViewDark f154794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final StyledInlineButtonFieldViewDark f154795i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f154796j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final StyledInlineTextFieldViewDark f154797k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f154798l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final View f154799m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final StyledInlineTextFieldViewDark f154800n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f154801o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final View f154802p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final StyledInlineTextFieldViewDark f154803q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f154804r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RelativeLayout f154805s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinearLayout f154806t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f154807u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f154808v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final EditText f154809w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ScrollView f154810x;

    /* JADX WARN: Multi-variable type inference failed */
    public g(View view2, yw.b bVar, l<? super Calendar, Unit> lVar, p<? super Calendar, ? super Boolean, Unit> pVar, l<? super Double, Unit> lVar2, l<? super Double, Unit> lVar3, l<? super Double, Unit> lVar4, l<? super String, Unit> lVar5) {
        view2.getClass();
        bVar.getClass();
        lVar.getClass();
        pVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        lVar5.getClass();
        this.f154787a = bVar;
        this.f154788b = lVar;
        this.f154789c = pVar;
        this.f154790d = lVar2;
        this.f154791e = lVar3;
        this.f154792f = lVar4;
        this.f154793g = lVar5;
        View viewFindViewById = view2.findViewById(R.id.date_button);
        viewFindViewById.getClass();
        this.f154794h = (StyledInlineButtonFieldViewDark) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.time_button);
        viewFindViewById2.getClass();
        this.f154795i = (StyledInlineButtonFieldViewDark) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.systolic_group);
        viewFindViewById3.getClass();
        this.f154796j = viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.systolic_measurement);
        viewFindViewById4.getClass();
        this.f154797k = (StyledInlineTextFieldViewDark) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.systolic_measurement_limits);
        viewFindViewById5.getClass();
        this.f154798l = (TextView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.diastolic_group);
        viewFindViewById6.getClass();
        this.f154799m = viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.diastolic_measurement);
        viewFindViewById7.getClass();
        this.f154800n = (StyledInlineTextFieldViewDark) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.diastolic_measurement_limits);
        viewFindViewById8.getClass();
        this.f154801o = (TextView) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.pulse_group);
        viewFindViewById9.getClass();
        this.f154802p = viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.pulse_measurement);
        viewFindViewById10.getClass();
        this.f154803q = (StyledInlineTextFieldViewDark) viewFindViewById10;
        View viewFindViewById11 = view2.findViewById(R.id.pulse_measurement_limits);
        viewFindViewById11.getClass();
        this.f154804r = (TextView) viewFindViewById11;
        View viewFindViewById12 = view2.findViewById(R.id.add_notes_layout);
        viewFindViewById12.getClass();
        this.f154805s = (RelativeLayout) viewFindViewById12;
        View viewFindViewById13 = view2.findViewById(R.id.notes_layout);
        viewFindViewById13.getClass();
        this.f154806t = (LinearLayout) viewFindViewById13;
        View viewFindViewById14 = view2.findViewById(R.id.character_count_tv);
        viewFindViewById14.getClass();
        this.f154807u = (TextView) viewFindViewById14;
        View viewFindViewById15 = view2.findViewById(R.id.done_tv);
        viewFindViewById15.getClass();
        this.f154808v = (TextView) viewFindViewById15;
        View viewFindViewById16 = view2.findViewById(R.id.notes_tv);
        viewFindViewById16.getClass();
        this.f154809w = (EditText) viewFindViewById16;
        View viewFindViewById17 = view2.findViewById(R.id.scroll_view);
        viewFindViewById17.getClass();
        this.f154810x = (ScrollView) viewFindViewById17;
    }

    public final void a(Calendar calendar) {
        String string;
        calendar.getClass();
        DateTime dateTime = new DateTime(calendar);
        l22.a aVar = this.f154787a.f199875a;
        DateTime dateTime2 = new DateTime();
        if (k.f(dateTime2, dateTime)) {
            string = aVar.getString(R.string.challenge_leaderboard_header_today_label);
        } else if (k.d(dateTime2, dateTime)) {
            string = aVar.getString(R.string.common_tomorrow);
        } else if (k.f(dateTime2.minusDays(1), dateTime)) {
            string = aVar.getString(R.string.social_elapsed_time_yesterday);
        } else if (Math.abs(Days.daysBetween(dateTime2, dateTime).getDays()) < 7) {
            string = dateTime.toString("EEEE");
            string.getClass();
        } else {
            string = dateTime.toString("MMMM d");
            string.getClass();
        }
        this.f154794h.i(new h32.h.c(string, null, null, null, null, null, new d(this, calendar, 1), null, 0, false, null, null, 4030, null));
    }

    public final void b(Calendar calendar) {
        calendar.getClass();
        j0.f23099a.getClass();
        this.f154795i.i(new h32.h.c(j0.D() ? j0.f(calendar, "HH:mm", null) : j0.f(calendar, "h:mm a", null), null, null, null, null, null, new d(this, calendar, 0), null, 0, false, null, null, 4030, null));
    }

    public final boolean c() {
        return this.f154797k.hasFocus() || this.f154800n.hasFocus() || this.f154803q.hasFocus() || this.f154809w.hasFocus();
    }
}
