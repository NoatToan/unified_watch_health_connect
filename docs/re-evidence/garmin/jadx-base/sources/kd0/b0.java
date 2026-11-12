package kd0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.format.DateFormat;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.health.presentation.HealthSnapshotActivity;
import com.garmin.android.apps.connectmobile.blood_pressure.presentation.BloodPressureReportsActivity;
import com.garmin.android.apps.connectmobile.bodybattery.presentation.BodyBatteryReportsActivity;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.calendar.presentation.GCMCalendarActivity;
import com.garmin.android.apps.connectmobile.calendar.presentation.detail.details.CalendarDetailsActivity;
import com.garmin.android.apps.connectmobile.devices.targetedselection.TDSActivity;
import com.garmin.android.apps.connectmobile.ecg.presentation.stats.EcgDetailActivity;
import com.garmin.android.apps.connectmobile.heartrate.presentation.HeartRateReportsActivity;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.JetLagSummaryActivity;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.TripSetupActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleDetailsActivity;
import com.garmin.android.apps.connectmobile.moveiq.MoveIQEventDetailsActivity;
import com.garmin.android.apps.connectmobile.overnighthrv.OvernightHrvActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyGenesisActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.thirdparty.Office365ConnectActivity;
import com.garmin.android.apps.connectmobile.sleep.presentation.SleepReportsActivity;
import com.garmin.android.apps.connectmobile.steps.presentation.StepsActivity;
import com.garmin.android.apps.connectmobile.stress.presentation.view.StressReportsActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.EventDetailsActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.TrainingInitiativeEventActivity;
import com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsActivity;
import com.garmin.android.apps.connectmobile.wheelchair.presentation.PushesActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.MultiSportsDetailsActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.list.WorkoutListActivity;
import com.google.mlkit.common.MlKitException;
import com.google.protobuf.DescriptorProtos;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkd0/b0;", "Lvx/f;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b0 implements vx.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f103987c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public hy.e f103988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yr1.q f103989b = new yr1.q("GCMCalendarDelegate", new c(), null, null, 12, null);

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f103990a;

        static {
            int[] iArr = new int[CalendarItemDTO.b.values().length];
            try {
                iArr[CalendarItemDTO.b.WEIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CalendarItemDTO.b.STEPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CalendarItemDTO.b.SLEEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CalendarItemDTO.b.SLEEP_AND_SCORE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CalendarItemDTO.b.SLEEP_COACH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CalendarItemDTO.b.NAP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CalendarItemDTO.b.HEART_RATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CalendarItemDTO.b.HRV_STATUS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CalendarItemDTO.b.BLOOD_PRESSURE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CalendarItemDTO.b.TRAINING_PLAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CalendarItemDTO.b.STRESS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CalendarItemDTO.b.BODY_BATTERY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CalendarItemDTO.b.PUSHES.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f103990a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"kd0/b0$c", "Lyr1/r;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements yr1.r {
        public c() {
        }

        @Override // yr1.r
        public final void B1(al2.c cVar) {
        }

        @Override // yr1.r
        public final void F1(al2.a aVar, boolean z14) {
        }

        @Override // yr1.r
        public final void g5(al2.c cVar, boolean z14) {
            com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "GCMCalendarDelegate", "syncEventReceiver: onSyncFinished() " + cVar);
            hy.e eVar = b0.this.f103988a;
            if (eVar != null) {
                eVar.invoke();
            }
        }
    }

    static {
        new a(null);
    }

    @Override // vx.f
    public final void A(CalendarDetailsActivity calendarDetailsActivity, CalendarItemDTO.b bVar, DateTime dateTime) {
        bVar.getClass();
        switch (b.f103990a[bVar.ordinal()]) {
            case 1:
                calendarDetailsActivity.startActivityForResult(dh.b.z(WeightReportsActivity.class, calendarDetailsActivity, dateTime, false), 1235);
                break;
            case 2:
                calendarDetailsActivity.startActivityForResult(dh.b.z(StepsActivity.class, calendarDetailsActivity, dateTime, false), 1239);
                break;
            case 3:
                calendarDetailsActivity.startActivity(SleepReportsActivity.a.b(SleepReportsActivity.f44239b, calendarDetailsActivity, dateTime, null, false, null, null, 60));
                break;
            case 4:
                calendarDetailsActivity.startActivity(SleepReportsActivity.a.b(SleepReportsActivity.f44239b, calendarDetailsActivity, dateTime, null, false, null, null, 60));
                break;
            case 5:
            case 6:
                calendarDetailsActivity.startActivity(SleepReportsActivity.a.b(SleepReportsActivity.f44239b, calendarDetailsActivity, dateTime, en1.c.COACH, false, null, null, 56));
                break;
            case 7:
                calendarDetailsActivity.startActivityForResult(dh.b.z(HeartRateReportsActivity.class, calendarDetailsActivity, new DateTime(dateTime), false), 1237);
                break;
            case 8:
                OvernightHrvActivity.a aVar = OvernightHrvActivity.f39738n;
                DateTime dateTime2 = new DateTime(dateTime);
                aVar.getClass();
                calendarDetailsActivity.startActivityForResult(OvernightHrvActivity.a.a(calendarDetailsActivity, dateTime2, null), 1241);
                break;
            case 9:
                calendarDetailsActivity.startActivity(dh.b.z(BloodPressureReportsActivity.class, calendarDetailsActivity, new DateTime(dateTime), false));
                break;
            case 10:
                new androidx.appcompat.app.e.a(calendarDetailsActivity).setTitle(R.string.lbl_no_workout_details).setMessage(R.string.msg_view_training_plan_details).setPositiveButton(R.string.lbl_ok, new jm0.c(6)).create().show();
                break;
            case 11:
                calendarDetailsActivity.startActivity(dh.b.z(StressReportsActivity.class, calendarDetailsActivity, dateTime, false));
                break;
            case 12:
                calendarDetailsActivity.startActivity(dh.b.z(BodyBatteryReportsActivity.class, calendarDetailsActivity, dateTime, false));
                break;
            case 13:
                calendarDetailsActivity.startActivityForResult(dh.b.z(PushesActivity.class, calendarDetailsActivity, dateTime, false), 1239);
                break;
        }
    }

    @Override // vx.f
    public final long B() {
        return GCMSettingManager.r(fd0.d.CALENDARS, null);
    }

    @Override // vx.f
    public final void C(int i14, boolean z14) {
        Set<String> stringSet = GCMSettingManager.f41536b.getStringSet(GCMSettingManager.f41535a.getString(R.string.key_calendar_filter), xx.c.a(GarminConnectMobileApp.f28688j));
        String string = GCMSettingManager.f41535a.getString(i14);
        if (z14) {
            if (!GCMSettingManager.y(i14)) {
                stringSet.add(string);
            }
            GCMSettingManager.f41536b.edit().remove(GCMSettingManager.f41535a.getString(R.string.key_calendar_filter)).apply();
            GCMSettingManager.f41536b.edit().putStringSet(GCMSettingManager.f41535a.getString(R.string.key_calendar_filter), stringSet).apply();
            return;
        }
        Set<String> stringSet2 = GCMSettingManager.f41536b.getStringSet(GCMSettingManager.f41535a.getString(R.string.key_calendar_filter), xx.c.a(GarminConnectMobileApp.f28688j));
        if (stringSet2.size() == 0) {
            return;
        }
        String string2 = GCMSettingManager.f41535a.getString(i14);
        HashSet hashSet = new HashSet();
        for (String str : stringSet2) {
            if (!str.equals(string2)) {
                hashSet.add(str);
            }
        }
        GCMSettingManager.f41536b.edit().remove(GCMSettingManager.f41535a.getString(R.string.key_calendar_filter)).apply();
        GCMSettingManager.f41536b.edit().putStringSet(GCMSettingManager.f41535a.getString(R.string.key_calendar_filter), hashSet).apply();
    }

    @Override // vx.f
    public final String D(Context context, CalendarItemDTO calendarItemDTO) {
        String string;
        String string2;
        String string3 = context.getString(R.string.gcm_body_battery_lbl_charged);
        int i14 = calendarItemDTO.f30986j1;
        if (i14 == 0) {
            string = String.valueOf(i14);
        } else {
            string = i14 > 0 ? context.getString(R.string.lbl_string_with_positive_sign, String.valueOf(i14)) : context.getString(R.string.no_value_card);
        }
        String string4 = context.getString(R.string.string_space_string_pattern, string3, string);
        string4.getClass();
        String string5 = context.getString(R.string.gcm_body_battery_lbl_drained);
        int i15 = calendarItemDTO.f30989k1;
        if (i15 == 0) {
            string2 = String.valueOf(i15);
        } else {
            string2 = i15 > 0 ? context.getString(R.string.lbl_string_with_negative_sign, String.valueOf(i15)) : context.getString(R.string.no_value_card);
        }
        String string6 = context.getString(R.string.string_space_string_pattern, string5, string2);
        string6.getClass();
        String string7 = context.getString(R.string.string_space_bullet_string_pattern, string4, string6);
        string7.getClass();
        return string7;
    }

    @Override // vx.f
    public final String E(Context context, CalendarItemDTO calendarItemDTO) {
        String strK0;
        l22.a aVar = new l22.a(context);
        b10.c cVar = new b10.c(aVar);
        mn1.d dVar = new mn1.d(aVar);
        int i14 = calendarItemDTO.E;
        if (i14 > 0) {
            String strValueOf = String.valueOf(i14);
            if (strValueOf == null) {
                strValueOf = dVar.e();
            }
            strK0 = p13.h0.k0(p13.x.k(strValueOf, dVar.d(calendarItemDTO.F)), ", ", null, null, null, 62);
        } else {
            strK0 = "";
        }
        String strC = cVar.f14213c.c((int) calendarItemDTO.D);
        if (strK0.length() <= 0) {
            return strC;
        }
        String string = context.getString(R.string.string_space_bullet_string_pattern, strK0, strC);
        string.getClass();
        return string;
    }

    @Override // vx.f
    public final String F(Context context, String str) {
        ks0.c cVar = new ks0.c(context);
        if (str == null) {
            str = "";
        }
        return cVar.f106382a.a(R.string.lbl_trip_to_city_name, str);
    }

    @Override // vx.f
    public final o13.p<LocalDate, LocalDate> G() {
        LocalDate localDateNow = LocalDate.now();
        return new o13.p<>(localDateNow.minusMonths(1).withDayOfMonth(1), localDateNow.plusYears(1));
    }

    @Override // vx.f
    public final String H(Context context, CalendarItemDTO calendarItemDTO) {
        return new pq1.d(context).e(calendarItemDTO.f31016z, calendarItemDTO.A);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007d  */
    @Override // vx.f
    public final ArrayList I(List list, Date date) {
        com.garmin.android.apps.connectmobile.calendar.presentation.b bVarA = com.garmin.android.apps.connectmobile.calendar.presentation.b.f31134b.a();
        if (bVarA == null) {
            return null;
        }
        List<CalendarItemDTO.b> listD = bVarA.d();
        ArrayList arrayList = new ArrayList();
        if (date != null) {
            bv.b.f21239a.getClass();
            bv.b.a();
            boolean zO = com.garmin.android.apps.connectmobile.k1.f37122a.o();
            String strI = com.nimbusds.jose.shaded.gson.internal.a.i("yyyy-MM-dd", new DateTime(date));
            if (list != null) {
                int size = list.size();
                for (int i14 = 0; i14 < size; i14++) {
                    CalendarItemDTO calendarItemDTO = (CalendarItemDTO) list.get(i14);
                    if (calendarItemDTO != null && strI.equals(calendarItemDTO.f30979g)) {
                        com.garmin.android.apps.connectmobile.calendar.presentation.b.f31134b.getClass();
                        if (!com.garmin.android.apps.connectmobile.calendar.presentation.b.a.b(calendarItemDTO)) {
                            CalendarItemDTO.b bVar = calendarItemDTO.f30973d;
                            if (!ey.b.a(bVar) || listD.contains(bVar)) {
                                if (zO) {
                                    CalendarItemDTO.b bVar2 = calendarItemDTO.f30973d;
                                    boolean z14 = bVar2 == CalendarItemDTO.b.SLEEP_AND_SCORE || bVar2 == CalendarItemDTO.b.SLEEP;
                                    boolean zContains = listD.contains(CalendarItemDTO.b.SLEEP);
                                    if (!z14 || zContains) {
                                        arrayList.add(calendarItemDTO);
                                    }
                                } else {
                                    arrayList.add(calendarItemDTO);
                                }
                            }
                        }
                    }
                }
            }
        }
        return com.garmin.android.apps.connectmobile.calendar.presentation.b.a(arrayList);
    }

    @Override // vx.f
    public final void J(CalendarDetailsActivity calendarDetailsActivity, int i14, DateTime dateTime) {
        CalendarDetailsActivity calendarDetailsActivity2;
        Intent intentB;
        if (new LocalDate(dateTime).isAfter(LocalDate.now())) {
            return;
        }
        if (i14 > 4) {
            PregnancyGenesisActivity.a aVar = PregnancyGenesisActivity.f40516b;
            tb1.e.f163745a.getClass();
            calendarDetailsActivity2 = calendarDetailsActivity;
            intentB = PregnancyGenesisActivity.a.a(aVar, calendarDetailsActivity2, false, tb1.e.a.h(), new DateTime(dateTime), false, false, 114);
        } else {
            calendarDetailsActivity2 = calendarDetailsActivity;
            intentB = MenstrualCycleDetailsActivity.a.b(MenstrualCycleDetailsActivity.f38784t, calendarDetailsActivity2, false, new DateTime(dateTime), 22);
        }
        calendarDetailsActivity2.startActivityForResult(intentB, 1503);
    }

    @Override // vx.f
    public final void K(CalendarDetailsActivity calendarDetailsActivity, CalendarItemDTO calendarItemDTO) {
        calendarItemDTO.getClass();
        if (calendarItemDTO.f30973d == CalendarItemDTO.b.ECG) {
            EcgDetailActivity.a aVar = EcgDetailActivity.f34869p;
            String str = calendarItemDTO.E1;
            aVar.getClass();
            calendarDetailsActivity.startActivityForResult(EcgDetailActivity.a.a(calendarDetailsActivity, str), 1235);
            return;
        }
        HealthSnapshotActivity.a aVar2 = HealthSnapshotActivity.f29015d;
        sn.h hVarB = ly.a.b(calendarItemDTO);
        aVar2.getClass();
        Intent intent = new Intent(calendarDetailsActivity, (Class<?>) HealthSnapshotActivity.class);
        intent.putExtra("ACTIVITY_EXTRA", hVarB);
        calendarDetailsActivity.startActivityForResult(intent, 1235);
    }

    @Override // vx.f
    public final void L(CalendarDetailsActivity calendarDetailsActivity, Long l14, LocalDate localDate) {
        JetLagSummaryActivity.f36977o.getClass();
        calendarDetailsActivity.startActivity(JetLagSummaryActivity.a.a(calendarDetailsActivity, false, l14, localDate));
    }

    @Override // vx.f
    public final void M(Context context, hy.e eVar) {
        this.f103988a = eVar;
        this.f103989b.b();
    }

    @Override // vx.f
    public final String N(Context context, CalendarItemDTO calendarItemDTO) {
        pn1.f fVar = new pn1.f(new l22.a(context));
        String str = calendarItemDTO.T;
        DateTime dateTimeQ = str != null ? g22.k.q(str, "yyyy-MM-dd'T'HH:mm:ss", null) : null;
        boolean zIs24HourFormat = DateFormat.is24HourFormat(context);
        int iF = (int) calendarItemDTO.F();
        fVar.f138687b.getClass();
        return fVar.a(b10.c.a(dateTimeQ, zIs24HourFormat), fVar.f138688c.c(iF));
    }

    @Override // vx.f
    public final void O(Activity activity) {
        TDSActivity.f34565f.getClass();
        Intent intent = new Intent(activity, (Class<?>) TDSActivity.class);
        intent.putExtra("arg.module.type", fd0.d.CALENDARS);
        activity.startActivityForResult(intent, 1239);
    }

    @Override // vx.f
    public final String P(Context context, CalendarItemDTO calendarItemDTO) {
        w00.b bVar = new w00.b(new l22.a(context));
        int i14 = calendarItemDTO.X;
        int i15 = calendarItemDTO.Y;
        String strValueOf = i14 > 0 ? String.valueOf(i14) : bVar.k();
        l22.b bVar2 = bVar.f180999a;
        return i3.e5.g(bVar2.a(R.string.lbl_heart_rate_zone_bpm, strValueOf), " • ", bVar2.a(R.string.lbl_heart_rate_zone_bpm, i15 > 0 ? String.valueOf(i15) : bVar.k()));
    }

    @Override // vx.f
    public final fy.e a() {
        return new fy.e((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null));
    }

    @Override // vx.f
    public final void b(Context context) {
        this.f103989b.e();
        this.f103988a = null;
    }

    @Override // vx.f
    public final String c(Context context, gs1.b bVar) {
        return fr.b.b(context, bVar);
    }

    @Override // vx.f
    public final boolean d() {
        lz1.f.f115404a.getClass();
        lz1.f.f115405b.info("isTrackingInitiativeEnabled");
        return ((jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null)).d();
    }

    @Override // vx.f
    public final void e(CalendarDetailsActivity calendarDetailsActivity, CalendarItemDTO calendarItemDTO) {
        calendarItemDTO.getClass();
        if (calendarItemDTO.f30998p == CalendarItemDTO.c.MULTISPORT) {
            MultiSportsDetailsActivity.f48440z.getClass();
            Intent intent = new Intent(calendarDetailsActivity, (Class<?>) MultiSportsDetailsActivity.class);
            intent.putExtra("GCM_extra_activity_type", MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR);
            intent.putExtra("GCM_calendar_items", calendarItemDTO);
            calendarDetailsActivity.startActivityForResult(intent, MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR);
            return;
        }
        WorkoutDetailsActivity.f48482f.getClass();
        Intent intent2 = new Intent(calendarDetailsActivity, (Class<?>) WorkoutDetailsActivity.class);
        intent2.putExtra("GCM_extra_activity_type", MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR);
        intent2.putExtra("GCM_calendar_items", calendarItemDTO);
        calendarDetailsActivity.startActivityForResult(intent2, MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR);
    }

    @Override // vx.f
    public final void f(CalendarDetailsActivity calendarDetailsActivity, String str, boolean z14) {
        str.getClass();
        if (z14) {
            MultiSportsDetailsActivity.f48440z.getClass();
            Intent intent = new Intent(calendarDetailsActivity, (Class<?>) MultiSportsDetailsActivity.class);
            intent.putExtra("EXTRA_SCHEDULE_WORKOUT_UUID", str);
            intent.putExtra("EXTRA_IS_FBT_WORKOUT", true);
            calendarDetailsActivity.startActivity(intent);
            return;
        }
        WorkoutDetailsActivity.f48482f.getClass();
        Intent intent2 = new Intent(calendarDetailsActivity, (Class<?>) WorkoutDetailsActivity.class);
        intent2.putExtra("EXTRA_SCHEDULE_WORKOUT_UUID", str);
        intent2.putExtra("EXTRA_IS_FBT_WORKOUT", true);
        calendarDetailsActivity.startActivity(intent2);
    }

    @Override // vx.f
    public final boolean g(int i14) {
        return GCMSettingManager.y(i14);
    }

    @Override // vx.f
    public final void h(CalendarDetailsActivity calendarDetailsActivity, DateTime dateTime) {
        dateTime.getClass();
        TrainingInitiativeEventActivity.f45718o.getClass();
        Intent intent = new Intent(calendarDetailsActivity, (Class<?>) TrainingInitiativeEventActivity.class);
        intent.putExtra("extra.date.time", dateTime);
        calendarDetailsActivity.startActivityForResult(intent, DescriptorProtos.Edition.EDITION_99999_TEST_ONLY_VALUE);
    }

    @Override // vx.f
    public final String i(Context context, CalendarItemDTO calendarItemDTO) {
        return new wn.c(context).b(ly.a.b(calendarItemDTO));
    }

    @Override // vx.f
    public final String j(Context context, CalendarItemDTO calendarItemDTO) {
        return new b10.c(new l22.a(context)).f14213c.c((g22.k.g(calendarItemDTO.D().toLocalDate(), LocalDate.now()) ? calendarItemDTO.P : calendarItemDTO.I) * 60);
    }

    @Override // vx.f
    public final String k(sd2.f fVar) {
        if (fVar != null) {
            return zb0.t.d(fVar);
        }
        return null;
    }

    @Override // vx.f
    public final long l(ey.n nVar) {
        nVar.getClass();
        cw.p.f55942b.getClass();
        cw.p pVarA = cw.p.a.a();
        if (pVarA != null) {
            return com.garmin.android.library.backgroundtaskmanagement.c.d(new gw.b0(pVarA), nVar);
        }
        return -1L;
    }

    @Override // vx.f
    public final String m(Context context, CalendarItemDTO calendarItemDTO) {
        pn1.f fVar = new pn1.f(new l22.a(context));
        String str = calendarItemDTO.T;
        return fVar.b(context, Integer.valueOf((int) calendarItemDTO.F()), str != null ? g22.k.q(str, "yyyy-MM-dd'T'HH:mm:ss", null) : null, DateFormat.is24HourFormat(context));
    }

    @Override // vx.f
    public final void n(CalendarDetailsActivity calendarDetailsActivity, CalendarItemDTO calendarItemDTO) {
        calendarItemDTO.getClass();
        EventDetailsActivity.f45692o.getClass();
        Intent intent = new Intent(calendarDetailsActivity, (Class<?>) EventDetailsActivity.class);
        intent.putExtra("GCM_calendar_items", calendarItemDTO);
        calendarDetailsActivity.startActivityForResult(intent, 1620);
    }

    @Override // vx.f
    public final String o(Context context, CalendarItemDTO calendarItemDTO) {
        double dC = k42.b.c(calendarItemDTO.f30990l / ((double) 1000));
        c22.l3.f23124b.getClass();
        return k42.b.j(context, dC, true, c22.l3.f23130h);
    }

    @Override // vx.f
    public final void p(CalendarDetailsActivity calendarDetailsActivity, gs1.b bVar) {
        calendarDetailsActivity.startActivityForResult(ar.a.a(calendarDetailsActivity, bVar), 1235);
    }

    @Override // vx.f
    public final String q(Context context, CalendarItemDTO calendarItemDTO) {
        return new pq1.d(context).e(calendarItemDTO.B, calendarItemDTO.C);
    }

    @Override // vx.f
    public final void r(CalendarDetailsActivity calendarDetailsActivity, gs1.f fVar) {
        if (fVar != null) {
            MoveIQEventDetailsActivity.f39211k.getClass();
            MoveIQEventDetailsActivity.a.a(calendarDetailsActivity, fVar, 1235);
        }
    }

    @Override // vx.f
    public final SpannableStringBuilder s(int i14, int i15, Context context) {
        tb1.e.f163745a.getClass();
        return tb1.e.a.e(context, i14, i15, true, null);
    }

    @Override // vx.f
    public final String t(Context context, CalendarItemDTO calendarItemDTO) {
        n41.a aVar = new n41.a(context);
        String str = calendarItemDTO.J0;
        int i14 = calendarItemDTO.I0;
        int iM = new i41.f((String) null, (Integer) null, (Integer) null, (Integer) null, (i41.a) null, str, (String) null, (String) null, 223, (p005kotlin.jvm.internal.j) null).m();
        Context context2 = aVar.f123601a;
        String string = context2.getString(iM);
        string.getClass();
        String string2 = context2.getString(R.string.string_space_bullet_string_pattern, aVar.b(i14), string);
        string2.getClass();
        return string2;
    }

    @Override // vx.f
    public final void u(CalendarDetailsActivity calendarDetailsActivity, DateTime dateTime) {
        dateTime.getClass();
        WorkoutListActivity.a aVar = WorkoutListActivity.f49414i;
        long millis = dateTime.getMillis();
        aVar.getClass();
        Intent intent = new Intent(calendarDetailsActivity, (Class<?>) WorkoutListActivity.class);
        intent.putExtra("extra.date.time", millis);
        intent.putExtra("extra.from.calender", true);
        calendarDetailsActivity.startActivityForResult(intent, 9487);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // vx.f
    public final Serializable v(DateTime dateTime, v13.c cVar) {
        c0 c0Var;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i14 = c0Var.f104010c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c0Var.f104010c = i14 - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(this, cVar);
            }
        } else {
            c0Var = new c0(this, cVar);
        }
        Object objD = c0Var.f104008a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c0Var.f104010c;
        if (i15 == 0) {
            o13.r.b(objD);
            c22.j0.f23099a.getClass();
            String string = c22.j0.S(dateTime).toString("yyyy-MM-dd");
            if (string == null) {
                string = "";
            }
            String string2 = c22.j0.Q(dateTime).toString("yyyy-MM-dd");
            String str = string2 != null ? string2 : "";
            ff0.l lVar = (ff0.l) KoinJavaComponent.get$default(ff0.l.class, null, null, 6, null);
            c0Var.f104010c = 1;
            objD = lVar.d(string, str, c0Var);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objD);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objD;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            pf0.s sVar = new pf0.s(((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c());
            List<gf0.a> listA = ((ff0.g) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a).a();
            if (listA != null) {
                ArrayList arrayList = new ArrayList(p13.y.r(listA, 10));
                for (gf0.a aVar2 : listA) {
                    CalendarItemDTO calendarItemDTO = new CalendarItemDTO();
                    calendarItemDTO.E1 = aVar2.getDetailId();
                    CalendarItemDTO.b bVar = CalendarItemDTO.b.ECG;
                    bVar.getClass();
                    calendarItemDTO.f30973d = bVar;
                    calendarItemDTO.f30977f = sVar.b(aVar2);
                    DateTime dateTimeK = aVar2.k();
                    if (dateTimeK == null) {
                        dateTimeK = DateTime.now();
                        dateTimeK.getClass();
                    }
                    calendarItemDTO.H(dateTimeK);
                    DateTime dateTimeK2 = aVar2.k();
                    calendarItemDTO.X0 = String.valueOf(dateTimeK2 != null ? new Long(dateTimeK2.getMillis()) : null);
                    Double heartRateAverage = aVar2.getHeartRateAverage();
                    if (heartRateAverage != null) {
                        calendarItemDTO.Z = heartRateAverage.doubleValue();
                    }
                    arrayList.add(calendarItemDTO);
                }
                return arrayList;
            }
        }
        return null;
    }

    @Override // vx.f
    public final String w(int i14, Context context) {
        return new b10.c(new l22.a(context)).b(i14);
    }

    @Override // vx.f
    public final Intent x(GCMCalendarActivity gCMCalendarActivity) {
        Office365ConnectActivity.f43946j.getClass();
        return new Intent(gCMCalendarActivity, (Class<?>) Office365ConnectActivity.class);
    }

    @Override // vx.f
    public final void y(CalendarDetailsActivity calendarDetailsActivity) {
        TripSetupActivity.a aVar = TripSetupActivity.f37081g;
        aVar.getClass();
        calendarDetailsActivity.startActivityForResult(TripSetupActivity.a.a(aVar, calendarDetailsActivity, null, null, true, false, 6), 9488);
    }

    @Override // vx.f
    public final String z(Context context, CalendarItemDTO calendarItemDTO) {
        return new yw.b(context).g(Double.valueOf(calendarItemDTO.K0), Double.valueOf(calendarItemDTO.L0), calendarItemDTO.M0, calendarItemDTO.N0, yw.c.DEFAULT, yw.a.DOT);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkd0/b0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
