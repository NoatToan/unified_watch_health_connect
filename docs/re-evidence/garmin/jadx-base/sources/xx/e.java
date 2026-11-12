package xx;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'z' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB#\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB-\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\n¨\u0006\f"}, d2 = {"Lxx/e;", "", "", "nameResId", "sharedPreferenceKeyId", "Lcom/garmin/android/apps/connectmobile/calendar/model/CalendarItemDTO$b;", "calendarItemType", "<init>", "(Ljava/lang/String;IIILcom/garmin/android/apps/connectmobile/calendar/model/CalendarItemDTO$b;)V", "colorResId", "(Ljava/lang/String;IIILcom/garmin/android/apps/connectmobile/calendar/model/CalendarItemDTO$b;I)V", "a", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {
    public static final e A;
    public static final e B;
    public static final e C;
    public static final /* synthetic */ e[] D;
    public static final /* synthetic */ w13.c E;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f192475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f192476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f192477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f192478h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f192479i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f192480j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e f192481k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final e f192482l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e f192483m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final e f192484n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final e f192485o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final e f192486p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final e f192487q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e f192488r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final e f192489t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final e f192490v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final e f192491w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final e f192492x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final e f192493y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final e f192494z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f192495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f192496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f192497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CalendarItemDTO.b f192498d;

    static {
        e eVar = new e("CALENDAR_DEFAULT_CATEGORY", 0, -1, -1, null);
        f192476f = eVar;
        e eVar2 = new e("CALENDAR_SCHEDULED_CATEGORY", 1, R.string.lbl_scheduled, -1, null);
        f192477g = eVar2;
        e eVar3 = new e("CALENDAR_FILTER_STEPS", 2, R.string.snapshot_steps, R.string.key_steps_filter_enabled, CalendarItemDTO.b.STEPS, R.color.gcm_steps_color);
        f192478h = eVar3;
        e eVar4 = new e("CALENDAR_FILTER_PUSHES", 3, R.string.lbl_pushes, R.string.key_pushes_filter_enabled, CalendarItemDTO.b.PUSHES, R.color.gcm_steps_color);
        f192479i = eVar4;
        e eVar5 = new e("CALENDAR_FILTER_ACTIVITIES", 4, R.string.concept_activities, R.string.key_activities_filter_enabled, CalendarItemDTO.b.ACTIVITY, R.color.gcm_activity_color);
        f192480j = eVar5;
        e eVar6 = new e("CALENDAR_FILTER_ECG", 5, R.string.lbl_ecg_recordings, R.string.key_ecg_filter_enabled, CalendarItemDTO.b.ECG, R.color.gcm_ecg_color);
        f192481k = eVar6;
        e eVar7 = new e("CALENDAR_FILTER_HEALTH_SNAPSHOTS", 6, R.string.lbl_health_snapshots, R.string.key_health_snapshots_filter_enabled, CalendarItemDTO.b.HEALTH_SNAPSHOT, R.color.gcm_calendar_health_snapshot_color);
        f192482l = eVar7;
        e eVar8 = new e("CALENDAR_FILTER_MOVEIQ_EVENTS", 7, R.string.moveiq_events_lbl, R.string.key_moveiq_events_filter_enabled, CalendarItemDTO.b.MOVE_IQ_EVENT, R.color.gcm_move_iq_event_color);
        f192483m = eVar8;
        e eVar9 = new e("CALENDAR_FILTER_JET_LAG_TRIPS", 8, R.string.lbl_trips, R.string.key_jet_lag_trips_filter_enabled, CalendarItemDTO.b.JET_LAG_TRIP, R.color.gcm_jet_lag_color);
        f192484n = eVar9;
        e eVar10 = new e("CALENDAR_FILTER_HEART_RATE", 9, R.string.lbl_heart_rate_cap, R.string.key_heart_rate_filter_enabled, CalendarItemDTO.b.HEART_RATE, R.color.gcm_heart_rate_color);
        f192485o = eVar10;
        e eVar11 = new e("CALENDAR_FILTER_HRV_STATUS", 10, R.string.ohrv_status, R.string.key_hrv_status_filter_enabled, CalendarItemDTO.b.HRV_STATUS, R.color.gcm_hrv_status_color);
        f192486p = eVar11;
        e eVar12 = new e("CALENDAR_FILTER_BLOOD_PRESSURE", 11, R.string.lbl_blood_pressure, R.string.key_blood_pressure_filter_enabled, CalendarItemDTO.b.BLOOD_PRESSURE, R.color.gcm_blood_pressure_color);
        f192487q = eVar12;
        e eVar13 = new e("CALENDAR_FILTER_WEIGHT", 12, R.string.card_weight_title, R.string.key_weight_filter_enabled, CalendarItemDTO.b.WEIGHT, R.color.gcm_weight_color);
        f192488r = eVar13;
        e eVar14 = new e("CALENDAR_FILTER_EVENTS", 13, R.string.lbl_events, R.string.key_events_filter_enabled, CalendarItemDTO.b.EVENT, R.color.gds_data_viz_orange_primary);
        f192489t = eVar14;
        e eVar15 = new e("CALENDAR_FILTER_WORKOUTS", 14, R.string.concept_workouts, R.string.key_workouts_filter_enabled, CalendarItemDTO.b.WORKOUT, R.color.gcm_workouts_color);
        f192490v = eVar15;
        e eVar16 = new e("CALENDAR_FILTER_TRAINING_PLAN", 15, R.string.atp_lbl_plans_section_title, R.string.key_training_plan_filter_enabled, CalendarItemDTO.b.TRAINING_PLAN, R.color.gcm_training_plans_color);
        f192491w = eVar16;
        e eVar17 = new e("CALENDAR_FILTER_STRESS", 16, R.string.title_stress, R.string.key_stress_filter_enabled, CalendarItemDTO.b.STRESS, R.color.gcm_stress_color);
        f192492x = eVar17;
        e eVar18 = new e("CALENDAR_FILTER_BODY_BATTERY", 17, R.string.gcm_body_battery_lbl_body_battery, R.string.key_body_battery_filter_enabled, CalendarItemDTO.b.BODY_BATTERY, R.color.gcm_calendar_body_battery_color);
        f192493y = eVar18;
        CalendarItemDTO.b bVar = CalendarItemDTO.b.SLEEP;
        e eVar19 = new e("CALENDAR_FILTER_SLEEP", 18, R.string.sleep_lbl_sleep, R.string.key_sleep_filter_enabled, bVar, R.color.gcm_calendar_sleep_color);
        f192494z = eVar19;
        e eVar20 = new e("CALENDAR_FILTER_SLEEP_WITH_SLEEP_SORE", 19, R.string.lbl_sleep_score, R.string.key_sleep_filter_enabled, bVar, R.color.gcm_calendar_sleep_color);
        A = eVar20;
        e eVar21 = new e("CALENDAR_FILTER_NAP", 20, R.string.lbl_naps, R.string.key_naps_filter_enabled, CalendarItemDTO.b.NAP, R.color.gcm_calendar_sleep_color);
        B = eVar21;
        e eVar22 = new e("CALENDAR_FILTER_SLEEP_NEED", 21, R.string.lbl_sleep_coach, R.string.key_sleep_need_filter_enabled, CalendarItemDTO.b.SLEEP_COACH, R.color.gcm_calendar_sleep_color);
        C = eVar22;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13, eVar14, eVar15, eVar16, eVar17, eVar18, eVar19, eVar20, eVar21, eVar22};
        D = eVarArr;
        E = new w13.c(eVarArr);
        f192475e = new a(null);
    }

    public /* synthetic */ e(String str, int i14, int i15, int i16, CalendarItemDTO.b bVar, int i17, int i18, j jVar) {
        this(str, i14, i15, i16, bVar, (i18 & 8) != 0 ? 0 : i17);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) D.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxx/e$a;", "", "<init>", "()V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: xx.e$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3591a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f192499a;

            static {
                int[] iArr = new int[e.values().length];
                try {
                    iArr[e.f192476f.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[e.f192477g.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[e.f192478h.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[e.f192479i.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[e.f192480j.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[e.f192481k.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[e.f192482l.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[e.f192483m.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[e.f192484n.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[e.f192485o.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[e.f192486p.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[e.f192487q.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[e.f192488r.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[e.f192489t.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[e.f192490v.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[e.f192491w.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[e.f192492x.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[e.f192493y.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[e.f192494z.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[e.B.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[e.A.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[e.C.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                f192499a = iArr;
            }
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    private e(String str, int i14, int i15, int i16, CalendarItemDTO.b bVar) {
        super(str, i14);
        this.f192495a = i16;
        this.f192497c = i15;
        this.f192498d = bVar;
    }

    private e(String str, int i14, int i15, int i16, CalendarItemDTO.b bVar, int i17) {
        super(str, i14);
        this.f192495a = i16;
        this.f192497c = i15;
        this.f192496b = i17;
        this.f192498d = bVar;
    }
}
