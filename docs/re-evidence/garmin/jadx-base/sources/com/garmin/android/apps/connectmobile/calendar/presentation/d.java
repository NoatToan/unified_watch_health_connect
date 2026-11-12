package com.garmin.android.apps.connectmobile.calendar.presentation;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.calendar.detail.model.CalendarDTO;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.roomorama.caldroid.CaldroidFragment;
import com.roomorama.caldroid.CaldroidGridAdapter;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0016\u0017\u0018B\u0095\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012&\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u0001`\n\u0012&\u0010\f\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u0001`\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/presentation/d;", "Lcom/roomorama/caldroid/CaldroidGridAdapter;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", CaldroidFragment.MONTH, CaldroidFragment.YEAR, "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "caldroidData", "extraData", "", "mCalendarHeight", "Lh03/a;", "highlightedPeriodStartDate", "highlightedPeriodEndDate", "", "highlightToday", "<init>", "(Landroid/content/Context;IILjava/util/HashMap;Ljava/util/HashMap;FLh03/a;Lh03/a;Z)V", "a", "c", "b", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends CaldroidGridAdapter {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f31148r = new b(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final DateTimeFormatter f31149t = DateTimeFormat.forPattern("yyyy-MM-dd");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f31150v = R.color.gcm_map_segment_track_path;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f31151w = R.color.gcm_fitness_equipment_fill_color;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f31152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f31153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f31154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f31155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f31156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CalendarDTO f31157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h03.a f31158g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h03.a f31159h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h03.a f31160i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h03.a f31161j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h03.a f31162k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.calendar.presentation.b f31163l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f31164m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final HashMap<Integer, g22.c<Void, Void>> f31165n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinkedHashMap f31166o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f31167p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List<? extends CalendarItemDTO.b> f31168q;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/presentation/d$a;", "", "", "resId", "<init>", "(Ljava/lang/String;II)V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        STEPS(R.color.gcm_calendar_steps_color),
        STEPS_GOAL_NOT_REACHED(R.drawable.gcm3_calendar_grid_bar_striped_multiple),
        SLEEP(R.color.gcm_calendar_sleep_color),
        SLEEP_WITH_SLEEP_SCORE(R.color.gcm_calendar_sleep_color),
        NAP(R.color.gcm_calendar_sleep_color),
        SLEEP_COACH(R.color.gcm_calendar_sleep_color),
        ACTIVITIES(R.color.gcm_calendar_activity_color),
        HEALTH_SNAPSHOT(R.color.gcm_calendar_health_snapshot_color),
        ECG(R.color.gcm_calendar_ecg_color),
        MOVE_IQ_EVENT(R.color.gcm_calendar_move_iq_event_color),
        HEART_RATE(R.color.gcm_calendar_heart_rate_color),
        HRV_STATUS(R.color.gcm_calendar_hrv_status_color),
        STRESS(R.color.gcm_calendar_stress_color),
        BODY_BATTERY(R.color.gcm_calendar_body_battery_color),
        EVENTS(R.color.gcm_calendar_event_color),
        JET_LAG_TRIP(R.color.gcm_calendar_jet_lag_color),
        BLOOD_PRESSURE(R.color.gcm_calendar_blood_pressure_color);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f31187a;

        a(int i14) {
            this.f31187a = i14;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/presentation/d$c;", "", "<init>", "()V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f31188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ImageView f31189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f31190c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ImageView f31191d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f31192e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f31193f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, int i14, int i15, HashMap<String, Object> map, HashMap<String, Object> map2, float f14, h03.a aVar, h03.a aVar2, boolean z14) {
        List<CalendarItemDTO.b> listD;
        super(context, i14, i15, map, map2);
        context.getClass();
        this.f31152a = f14;
        this.f31153b = z14;
        this.f31154c = new DateFormatSymbols().getMonths();
        this.f31155d = 20.0f;
        this.f31160i = getToday();
        this.f31164m = 20.0f;
        this.f31165n = new HashMap<>();
        com.garmin.android.apps.connectmobile.calendar.presentation.b bVarA = com.garmin.android.apps.connectmobile.calendar.presentation.b.f31134b.a();
        this.f31163l = bVarA;
        this.f31158g = aVar;
        this.f31159h = aVar2;
        l();
        this.f31168q = (bVarA == null || (listD = bVarA.d()) == null) ? j0.f134944a : h0.Z(listD);
    }

    public final void d() {
        Iterator<Map.Entry<Integer, g22.c<Void, Void>>> it = this.f31165n.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, g22.c<Void, Void>> next = it.next();
            next.getClass();
            g22.c<Void, Void> value = next.getValue();
            value.getClass();
            value.a();
            it.remove();
        }
        this.f31157f = null;
        this.f31156e = null;
        this.f31166o = null;
    }

    public final ArrayList e(DateTime dateTime) {
        ArrayList arrayList = new ArrayList();
        if (this.f31166o != null) {
            DateTimeFormatter dateTimeFormatter = f31149t;
            dateTimeFormatter.getClass();
            String strH = c22.j0.h(dateTime, dateTimeFormatter);
            LinkedHashMap linkedHashMap = this.f31166o;
            List list = linkedHashMap != null ? (List) linkedHashMap.get(strH) : null;
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        return arrayList;
    }

    public final int f() {
        return this.month;
    }

    public final int g() {
        return this.year;
    }

    @Override // com.roomorama.caldroid.CaldroidGridAdapter, android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        c cVar;
        View viewInflate;
        g22.c<Void, Void> cVar2;
        ViewGroup.LayoutParams layoutParams;
        TextView textView;
        ImageView imageView;
        ImageView imageView2;
        h03.a aVar = this.datetimeList.get(i14);
        if (view2 == null) {
            Object systemService = this.context.getSystemService("layout_inflater");
            systemService.getClass();
            viewInflate = ((LayoutInflater) systemService).inflate(R.layout.calendar_cell, viewGroup, false);
            viewInflate.getClass();
            cVar = new c();
            cVar.f31189b = (ImageView) viewInflate.findViewById(R.id.scale_icon);
            cVar.f31191d = (ImageView) viewInflate.findViewById(R.id.badge_icon);
            cVar.f31190c = (TextView) viewInflate.findViewById(R.id.activity_overflow_text);
            cVar.f31188a = (TextView) viewInflate.findViewById(R.id.date_text);
            cVar.f31192e = (LinearLayout) viewInflate.findViewById(R.id.custom_cell);
            cVar.f31193f = (LinearLayout) viewInflate.findViewById(R.id.barContainer);
            TextView textView2 = cVar.f31190c;
            if (textView2 != null) {
                textView2.setImportantForAccessibility(2);
            }
            Context context = this.context;
            context.getClass();
            if (c22.b.e(context)) {
                TextView textView3 = cVar.f31188a;
                if (textView3 != null) {
                    v22.d.a(textView3, 1.3f);
                }
                TextView textView4 = cVar.f31190c;
                if (textView4 != null) {
                    v22.d.a(textView4, 1.5f);
                }
                View viewFindViewById = viewInflate.findViewById(R.id.date_top_container);
                View viewFindViewById2 = viewInflate.findViewById(R.id.date_bottom_container);
                Context context2 = this.context;
                context2.getClass();
                int iC = (int) c22.b.c(context2, this.resources.getDimension(R.dimen.gcm_calendar_header_cell_height), 1.3f);
                Context context3 = this.context;
                context3.getClass();
                int iC2 = (int) c22.b.c(context3, this.resources.getDimension(R.dimen.gcm_calendar_footer_cell_height), 1.5f);
                viewFindViewById.getLayoutParams().height = iC;
                viewFindViewById2.getLayoutParams().height = iC2;
            }
            viewInflate.setTag(cVar);
        } else {
            Object tag = view2.getTag();
            tag.getClass();
            cVar = (c) tag;
            viewInflate = view2;
        }
        if (!this.f31167p) {
            ImageView imageView3 = cVar.f31191d;
            if (imageView3 != null && imageView3.getVisibility() == 0 && (imageView2 = cVar.f31191d) != null) {
                imageView2.setVisibility(8);
            }
            ImageView imageView4 = cVar.f31189b;
            if (imageView4 != null && imageView4.getVisibility() == 0 && (imageView = cVar.f31189b) != null) {
                imageView.setVisibility(4);
            }
            TextView textView5 = cVar.f31190c;
            if (textView5 != null && textView5.getVisibility() == 0 && (textView = cVar.f31190c) != null) {
                textView.setVisibility(4);
            }
            LinearLayout linearLayout = cVar.f31193f;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
        }
        aVar.getClass();
        Resources resources = this.context.getResources();
        boolean zJ = j(aVar);
        TextView textView6 = cVar.f31188a;
        if ((textView6 != null ? textView6.getTag() : null) == null) {
            h(cVar, aVar);
            TextView textView7 = cVar.f31188a;
            if (textView7 != null) {
                textView7.setTag(Boolean.TRUE);
            }
        }
        LinearLayout linearLayout2 = cVar.f31192e;
        if (linearLayout2 != null) {
            linearLayout2.setEnabled(zJ);
        }
        LinearLayout linearLayout3 = cVar.f31192e;
        if (linearLayout3 != null) {
            linearLayout3.setClickable(!zJ);
        }
        LinearLayout linearLayout4 = cVar.f31192e;
        if (linearLayout4 != null && (layoutParams = linearLayout4.getLayoutParams()) != null) {
            layoutParams.height = (int) this.f31155d;
        }
        h03.a aVar2 = this.f31160i;
        boolean z14 = aVar2 != null && aVar.q(aVar2) && j(aVar);
        boolean zQ = aVar.q(getToday());
        Drawable drawable = a7.b.getDrawable(this.context, (z14 || (this.f31153b && zQ)) ? R.drawable.gcm3_calendar_cell_marked_selector : R.drawable.cell_background);
        LinearLayout linearLayout5 = cVar.f31192e;
        if (linearLayout5 != null) {
            linearLayout5.setBackground(drawable);
        }
        int i15 = (int) (this.f31155d * 0.07f);
        LinearLayout linearLayout6 = cVar.f31192e;
        if (linearLayout6 != null) {
            linearLayout6.setPadding(i15, i15, i15, i15);
        }
        Context context4 = this.context;
        context4.getClass();
        float fC = c22.b.c(context4, resources.getDimension(R.dimen.gcm_calendar_header_cell_height), 1.3f);
        Context context5 = this.context;
        context5.getClass();
        this.f31164m = this.f31155d - (((i15 * 2) + c22.b.c(context5, resources.getDimension(R.dimen.gcm_calendar_footer_cell_height), 1.5f)) + fC);
        boolean z15 = zJ && k(aVar);
        if (aVar.v(h03.a.d.HOUR, h03.a.d.MINUTE, h03.a.d.SECOND)) {
            aVar.t(h03.a.d.DAY);
        }
        boolean z16 = aVar.equals(this.f31158g) || aVar.equals(this.f31159h);
        if (z15) {
            if (zQ && z16) {
                Drawable drawable2 = a7.b.getDrawable(this.context, R.drawable.gcm3_calendar_cell_today_in_highlight_start_end_selector);
                LinearLayout linearLayout7 = cVar.f31192e;
                if (linearLayout7 != null) {
                    linearLayout7.setBackground(drawable2);
                }
            } else if (zQ) {
                Drawable drawable3 = a7.b.getDrawable(this.context, R.drawable.gcm3_calendar_cell_today_in_highlight_period_selector);
                LinearLayout linearLayout8 = cVar.f31192e;
                if (linearLayout8 != null) {
                    linearLayout8.setBackground(drawable3);
                }
            } else {
                LinearLayout linearLayout9 = cVar.f31192e;
                if (z16) {
                    if (linearLayout9 != null) {
                        linearLayout9.setBackgroundColor(a7.b.getColor(this.context, f31150v));
                    }
                } else if (linearLayout9 != null) {
                    linearLayout9.setBackgroundColor(a7.b.getColor(this.context, f31151w));
                }
            }
        }
        if (!this.f31167p && this.f31157f != null) {
            Integer numK = aVar.k();
            HashMap<Integer, g22.c<Void, Void>> map = this.f31165n;
            if (map.get(numK) != null && (cVar2 = map.get(aVar.k())) != null) {
                cVar2.a();
            }
            e eVar = new e(aVar, this, cVar);
            try {
                map.put(aVar.k(), eVar);
                eVar.c(new Void[0]);
            } catch (Exception unused) {
                i2.a.j(i2.f36769a, "GCMCalendarAdapter", "setCellContent couldn't be rendered: " + aVar);
            }
        }
        if (i14 == this.datetimeList.size() - 1) {
            this.f31167p = false;
        }
        return viewInflate;
    }

    public final void h(c cVar, h03.a aVar) {
        TextView textView;
        boolean zJ = j(aVar);
        TextView textView2 = cVar.f31188a;
        if (textView2 != null) {
            aVar.g();
            textView2.setText(String.valueOf(aVar.f80661d));
        }
        Context context = this.context;
        aVar.g();
        String strValueOf = String.valueOf(aVar.f80661d);
        aVar.g();
        String string = context.getString(R.string.string_space_string_pattern, strValueOf, this.f31154c[aVar.f80660c.intValue() - 1]);
        string.getClass();
        h03.a aVar2 = this.f31160i;
        if (aVar2 != null && aVar.q(aVar2) && j(aVar)) {
            Context context2 = this.context;
            string = context2.getString(R.string.string_colon_string_pattern, context2.getString(R.string.challenge_leaderboard_header_today_label), string);
            string.getClass();
        }
        TextView textView3 = cVar.f31188a;
        if (textView3 != null) {
            textView3.setContentDescription(string);
        }
        TextView textView4 = cVar.f31188a;
        if (textView4 != null) {
            Context context3 = this.context;
            aVar.g();
            Integer num = aVar.f80660c;
            textView4.setTextColor(a7.b.getColor(context3, (num != null && num.intValue() == this.month) ? R.color.gcm_text_primary : R.color.gcm_text_secondary));
        }
        if (zJ && k(aVar) && (textView = cVar.f31188a) != null) {
            textView.setTextColor(a7.b.getColor(this.context, R.color.gcm_text_on_color));
        }
    }

    public final boolean i(String str) {
        boolean z14 = (str == null && this.f31156e == null) || (str != null && str.equals(this.f31156e));
        CalendarDTO calendarDTO = this.f31157f;
        return calendarDTO != null && calendarDTO != null && calendarDTO.f30964d == this.month && calendarDTO != null && calendarDTO.f30965e == this.year && z14;
    }

    public final boolean j(h03.a aVar) {
        h03.a aVar2 = this.f31161j;
        if (aVar2 == null || this.f31162k == null) {
            aVar.g();
            Integer num = aVar.f80660c;
            return num != null && num.intValue() == this.month;
        }
        aVar2.getClass();
        h03.a aVar3 = this.f31162k;
        aVar3.getClass();
        return (aVar.compareTo(aVar2) >= 0) && (aVar.compareTo(aVar3) <= 0);
    }

    public final boolean k(h03.a aVar) {
        aVar.getClass();
        if (aVar.v(h03.a.d.HOUR, h03.a.d.MINUTE, h03.a.d.SECOND)) {
            aVar.t(h03.a.d.DAY);
        }
        h03.a aVar2 = this.f31158g;
        if (aVar2 == null || this.f31159h == null) {
            return false;
        }
        if (aVar.compareTo(aVar2) <= 0 && !aVar.equals(aVar2)) {
            return false;
        }
        h03.a aVar3 = this.f31159h;
        return aVar.compareTo(aVar3) < 0 || aVar.equals(aVar3);
    }

    public final void l() {
        int count = getCount() / 7;
        this.f31155d = (this.f31152a - (this.resources.getDimension(R.dimen.gcm_calendar_grid_vertical_spacing) * (count - 1))) / count;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/presentation/d$b;", "", "<init>", "()V", "Lorg/joda/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "SHORT_DATE_TIME_FORMAT", "Lorg/joda/time/format/DateTimeFormatter;", "", "ITEM_NOT_FOUND", "I", "", "TAG", "Ljava/lang/String;", "DEFAULT_HEIGHT", "HIGHLIGHTED_PERIOD_START_END_COLOR", "HIGHLIGHTED_PERIOD_DAYS_COLOR", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ d(Context context, int i14, int i15, HashMap map, HashMap map2, float f14, h03.a aVar, h03.a aVar2, boolean z14, int i16, j jVar) {
        this(context, i14, i15, map, map2, f14, aVar, aVar2, (i16 & 256) != 0 ? true : z14);
    }
}
