package com.garmin.android.apps.connectmobile.gsm;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ProgressBar;
import androidx.lifecycle.v1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.GCMActivityStartup;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.UserDevicesActivity;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.calendar.presentation.GCMCalendarActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.logging.presentation.LifestyleLoggingActivity;
import com.garmin.android.apps.connectmobile.running_economy.presentation.RunningEconomyReportsActivity;
import com.garmin.android.apps.connectmobile.training.CompletedTrainingPlansActivity;
import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.EventDetailsActivity;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutScheduleDTO;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.MultiSportsDetailsActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutPreCreateActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.msn.MSNWorkoutListActivity;
import com.garmin.android.gncs.NotificationConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.mlkit.common.MlKitException;
import e23.s;
import fw.p;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.BooleanUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes8.dex */
public class GSMRedirectActivity extends i.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f36440e = Pattern.compile("connectagent://launch/activity/(\\d+)\\?userId=(\\d+)");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f36441f = Pattern.compile("connectagent://launch/modern/activity/(\\d+)\\?userId=(\\d+)");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f36442g = Pattern.compile("connectagent://launch/workout(?:.*(?<workoutId>(?<=workout/)\\d+))?(?:.*(?<userId>(?<=userId=)\\d+))?(?:.*(?<type>(?<=type=)scheduled|generic|msn))?(?:.*(?<action>(?<=action=)view|edit|find|create))?(?:.*(?<getConfirmation>(?<=getConfirmation=)\\w+))?(?:.*(?<workoutName>(?<=workoutName=)[^&]+))?(?:.*(?<fitSport>(?<=fit_sport=)\\w+))?(?:.*(?<fitSubSport>(?<=fit_sub_sport=)\\w+))?(?:.*(?<deviceId>(?<=deviceId=)\\w+))?");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f36443h = Pattern.compile("connectagent://launch/event(?:.*(?<eventId>(?<=eventId=)\\d+))?(?:.*(?<eventUuid>(?<=eventUuid=)[^&]+))?(?:.*(?<action>(?<=action=)view|edit|find|create))?");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f36444i = Pattern.compile("connectagent://launch/trainingPlan(?:.*(?<type>(?<=type=)[^&]+))?(?:.*(?<destination>(?<=destination=)[^&]+))?");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f36445j = Pattern.compile("connectagent://launch/calendar\\?date=(\\d{4})-(1[0-2]|0[1-9])&userId=(\\d+)");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f36446k = Pattern.compile("connectagent://launch/snapshots\\?userId=(\\d+)");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f36447l = Pattern.compile("connectagent://launch/devicelist\\?userId=(\\d+)");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f36448m = Pattern.compile("connectagent://launch/running-economy(?:.*(?<action>(?<=action=)help))?");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f36449n = Pattern.compile("connectagent://launch/gear");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f36450o = Pattern.compile("connectagent://launch/sleep\\?showHistory=(\\w+)(?:.*(?<resetBreathingDisruptionsEducation>(?<=resetBreathingDisruptionsEducation=)[^&]+))?(?:.*(?<resetWhatsNewSleepCoach>(?<=resetWhatsNewSleepCoach=)\\w+))?(?:.*(?<resetWhatsNewSleep>(?<=resetWhatsNewSleep=)\\w+))?");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f36451p = Pattern.compile("connectagent://launch//lifestyle-logging");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f36452q = Pattern.compile("connectagent://launch/lifestyle-logging");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f36453r = Pattern.compile("connectagent://launch/alipayappletinstallation(\\?device_id=(\\d+))?$");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f36454t = Pattern.compile("connectagent://launch/home");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Pattern f36455v = Pattern.compile("connectagent://launch/health-status");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public dn0.k f36456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f36457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ProgressBar f36458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public dn0.l f36459d;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f36461b;

        static {
            int[] iArr = new int[fw.p.values().length];
            f36461b = iArr;
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36461b[fw.p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[t10.n.values().length];
            f36460a = iArr2;
            try {
                iArr2[t10.n.CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36460a[t10.n.FIND.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36460a[t10.n.EDIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36460a[t10.n.VIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public class c extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f36463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f36464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f36465d;

        public c(Matcher matcher) {
            super(GSMRedirectActivity.this, 0);
            this.f36463b = Long.parseLong(matcher.group(1));
            this.f36464c = Long.parseLong(matcher.group(2));
            this.f36465d = false;
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.b, com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.j
        public final void a(int i14, int i15, Intent intent) {
            super.a(i14, i15, intent);
            if (i14 == 50) {
                GSMRedirectActivity gSMRedirectActivity = GSMRedirectActivity.this;
                if (i15 == 1) {
                    GSMRedirectActivity.O9(gSMRedirectActivity, R.string.gsm_redirect_message_activity_not_found, new ai1.a(this, 27));
                    this.f36465d = true;
                } else {
                    gSMRedirectActivity.setResult(1);
                    gSMRedirectActivity.finish();
                }
            }
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.b
        public final boolean c(long j8) {
            return j8 == this.f36464c;
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.b
        public final void d() {
            if (this.f36465d) {
                return;
            }
            aq.b bVar = new aq.b();
            bVar.f11823b = this.f36463b;
            am.h hVar = am.h.VIEW_ONLY;
            if (hVar != null) {
                bVar.f11824c = hVar;
            }
            GSMRedirectActivity gSMRedirectActivity = GSMRedirectActivity.this;
            Intent intentA = bVar.a(gSMRedirectActivity);
            intentA.putExtra("GCM_extra_request_code", 50);
            gSMRedirectActivity.startActivityForResult(intentA, 50);
        }
    }

    public class d implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matcher f36467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t10.b f36468b;

        public d(Matcher matcher) {
            this.f36468b = new t10.b(GSMRedirectActivity.this);
            this.f36467a = matcher;
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.j
        public final void a(int i14, int i15, Intent intent) {
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.j
        public final void b(dn0.l lVar, dn0.k kVar) {
            try {
                this.f36468b.a(Long.parseLong(this.f36467a.group(2)), true, new com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l(this, 24), new s() { // from class: dn0.a
                    @Override // e23.s
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                        com.garmin.android.apps.connectmobile.connectiq.requests.deeplinking.a.C0518a c0518a = com.garmin.android.apps.connectmobile.connectiq.requests.deeplinking.a.f31960b;
                        GSMRedirectActivity gSMRedirectActivity = GSMRedirectActivity.this;
                        int iCurrentTimeMillis = (int) System.currentTimeMillis();
                        c0518a.getClass();
                        com.garmin.android.apps.connectmobile.connectiq.requests.deeplinking.a.C0518a.a(gSMRedirectActivity, (String) obj, (String) obj2, (String) obj3, (sz0.e) obj4, (PendingIntent) obj5, iCurrentTimeMillis);
                        return Unit.INSTANCE;
                    }
                });
            } catch (Throwable th3) {
                i2.o("GSMRedirectActivity", th3);
                GSMRedirectActivity gSMRedirectActivity = GSMRedirectActivity.this;
                gSMRedirectActivity.setResult(0);
                gSMRedirectActivity.finish();
            }
        }
    }

    public class e extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f36470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f36471c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f36472d;

        public e(Matcher matcher) {
            super(GSMRedirectActivity.this, 0);
            this.f36470b = Integer.parseInt(matcher.group(1));
            this.f36471c = Integer.parseInt(matcher.group(2));
            this.f36472d = Long.parseLong(matcher.group(3));
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.b
        public final boolean c(long j8) {
            return j8 == this.f36472d;
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.b
        public final void d() {
            GSMRedirectActivity gSMRedirectActivity = GSMRedirectActivity.this;
            Intent intent = new Intent(gSMRedirectActivity, (Class<?>) GCMCalendarActivity.class);
            intent.putExtra("extra.specified_year", this.f36470b);
            intent.putExtra("extra.specified_month", this.f36471c);
            gSMRedirectActivity.startActivity(intent);
            gSMRedirectActivity.setResult(1);
            gSMRedirectActivity.finish();
        }
    }

    public class f extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f36474b;

        public f(Matcher matcher) {
            super(GSMRedirectActivity.this, 0);
            this.f36474b = Long.parseLong(matcher.group(1));
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.b
        public final boolean c(long j8) {
            return j8 == this.f36474b;
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.b
        public final void d() {
            GSMRedirectActivity gSMRedirectActivity = GSMRedirectActivity.this;
            UserDevicesActivity.ca(gSMRedirectActivity);
            gSMRedirectActivity.setResult(1);
            gSMRedirectActivity.finish();
        }
    }

    public interface j {
        void a(int i14, int i15, Intent intent);

        void b(dn0.l lVar, dn0.k kVar);
    }

    public class p extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f36488b;

        public p(Matcher matcher) {
            super(GSMRedirectActivity.this, 0);
            this.f36488b = Long.parseLong(matcher.group(1));
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.b
        public final boolean c(long j8) {
            return j8 == this.f36488b;
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.b
        public final void d() {
            com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
            GSMRedirectActivity gSMRedirectActivity = GSMRedirectActivity.this;
            com.garmin.android.apps.connectmobile.navigation.b.a.c(gSMRedirectActivity, null, 0);
            gSMRedirectActivity.setResult(1);
            gSMRedirectActivity.finish();
        }
    }

    public class r extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Activity f36493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Long f36494c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Long f36495d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Long f36496e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f36497f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final t10.n f36498g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Boolean f36499h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f36500i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Integer f36501j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Integer f36502k;

        public r(Matcher matcher, Activity activity) {
            super(GSMRedirectActivity.this, 0);
            this.f36494c = null;
            this.f36495d = null;
            this.f36496e = null;
            this.f36497f = null;
            this.f36498g = t10.n.VIEW;
            this.f36499h = null;
            this.f36500i = null;
            this.f36501j = null;
            this.f36502k = null;
            if (matcher.group("workoutId") != null) {
                this.f36494c = Long.valueOf(Long.parseLong(matcher.group("workoutId")));
            }
            if (matcher.group("userId") != null) {
                this.f36495d = Long.valueOf(Long.parseLong(matcher.group("userId")));
            }
            if (matcher.group("deviceId") != null) {
                this.f36496e = Long.valueOf(Long.parseLong(matcher.group("deviceId")));
            }
            if (matcher.group(NotificationConstants.KEY_DATA_MIME_TYPE) != null) {
                this.f36497f = matcher.group(NotificationConstants.KEY_DATA_MIME_TYPE);
            }
            if (matcher.group("action") != null) {
                t10.n.a aVar = t10.n.f161700e;
                String strGroup = matcher.group("action");
                aVar.getClass();
                this.f36498g = t10.n.a.a(strGroup);
            }
            if (matcher.group("getConfirmation") != null) {
                this.f36499h = Boolean.valueOf(Boolean.parseBoolean(matcher.group("getConfirmation")));
            }
            if (matcher.group("workoutName") != null) {
                this.f36500i = matcher.group("workoutName");
            }
            if (matcher.group("fitSport") != null) {
                this.f36501j = Integer.valueOf(Integer.parseInt(matcher.group("fitSport")));
            }
            if (matcher.group("fitSubSport") != null) {
                this.f36502k = Integer.valueOf(Integer.parseInt(matcher.group("fitSubSport")));
            }
            this.f36493b = activity;
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.b
        public final boolean c(long j8) {
            Long l14 = this.f36495d;
            return l14 == null || this.f36499h != null || j8 == l14.longValue();
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.b
        public final void d() {
            String str;
            int[] iArr = a.f36460a;
            t10.n nVar = this.f36498g;
            int iOrdinal = nVar.ordinal();
            int i14 = nVar.f161708c;
            int i15 = iArr[iOrdinal];
            Activity activity = this.f36493b;
            GSMRedirectActivity gSMRedirectActivity = GSMRedirectActivity.this;
            final int i16 = 1;
            if (i15 == 1 || i15 == 2) {
                Boolean bool = this.f36499h;
                if (bool != null) {
                    if (!bool.booleanValue()) {
                        e(nVar, null);
                        return;
                    }
                    Context applicationContext = gSMRedirectActivity.getApplicationContext();
                    d32.b bVar = new d32.b(activity);
                    if (nVar != t10.n.EDIT || (str = this.f36500i) == null) {
                        bVar.setTitle(applicationContext.getString(i14));
                    } else {
                        bVar.setTitle(String.format(applicationContext.getString(i14), str));
                    }
                    bVar.setMessage(applicationContext.getString(nVar.f161709d));
                    bVar.setPositiveButton(R.string.lbl_common_continue, new ag0.d(19, this, nVar));
                    bVar.setNegativeButton(R.string.common_cancel, new dn0.f(this, 2));
                    bVar.show();
                    return;
                }
                return;
            }
            Long l14 = this.f36494c;
            if (i15 == 3) {
                Context applicationContext2 = gSMRedirectActivity.getApplicationContext();
                d32.b bVar2 = new d32.b(activity);
                dn0.k kVar = gSMRedirectActivity.f36456a;
                long jLongValue = l14.longValue();
                kVar.getClass();
                y0 y0Var = new y0();
                ge1.b.T(v1.a(kVar), null, null, new dn0.h(jLongValue, y0Var, null), 3);
                y0Var.f(gSMRedirectActivity, new dn0.g(this, this.f36499h, this.f36500i, bVar2, applicationContext2, this.f36498g, 0));
                return;
            }
            if (i15 != 4) {
                return;
            }
            String str2 = this.f36497f;
            str2.getClass();
            final int i17 = 0;
            if (str2.equals("scheduled")) {
                gSMRedirectActivity.f36458c.setVisibility(0);
                dn0.k kVar2 = gSMRedirectActivity.f36456a;
                long jLongValue2 = l14.longValue();
                kVar2.getClass();
                y0 y0Var2 = new y0();
                ge1.b.T(v1.a(kVar2), null, null, new dn0.i(jLongValue2, y0Var2, null), 3);
                y0Var2.f(gSMRedirectActivity, new z0(this) { // from class: dn0.e

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ GSMRedirectActivity.r f60500b;

                    {
                        this.f60500b = this;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // androidx.lifecycle.z0
                    public final void onChanged(Object obj) {
                        g3 g3Var = (g3) obj;
                        switch (i17) {
                            case 0:
                                GSMRedirectActivity.r rVar = this.f60500b;
                                GSMRedirectActivity gSMRedirectActivity2 = GSMRedirectActivity.this;
                                int i18 = GSMRedirectActivity.a.f36461b[g3Var.f35300a.ordinal()];
                                if (i18 == 1) {
                                    WorkoutScheduleDTO workoutScheduleDTO = (WorkoutScheduleDTO) g3Var.f35301b;
                                    m52.k kVar3 = workoutScheduleDTO.f48065a.f48044e;
                                    m52.k kVar4 = m52.k.A;
                                    long j8 = workoutScheduleDTO.f48067c;
                                    if (kVar3 == kVar4) {
                                        MultiSportsDetailsActivity.f48440z.getClass();
                                        gSMRedirectActivity2.getClass();
                                        Intent intent = new Intent(gSMRedirectActivity2, (Class<?>) MultiSportsDetailsActivity.class);
                                        intent.putExtra("GCM_extra_activity_type", MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD);
                                        intent.putExtra("EXTRA_SCHEDULE_WORKOUT_ID", j8);
                                        gSMRedirectActivity2.startActivity(intent);
                                    } else {
                                        WorkoutDetailsActivity.f48482f.getClass();
                                        gSMRedirectActivity2.getClass();
                                        Intent intent2 = new Intent(gSMRedirectActivity2, (Class<?>) WorkoutDetailsActivity.class);
                                        intent2.putExtra("GCM_extra_activity_type", MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD);
                                        intent2.putExtra("GCM_workout_schedule_id", j8);
                                        gSMRedirectActivity2.startActivity(intent2);
                                    }
                                    gSMRedirectActivity2.f36458c.setVisibility(8);
                                    gSMRedirectActivity2.setResult(1);
                                    gSMRedirectActivity2.finish();
                                    break;
                                } else if (i18 == 2) {
                                    i2.i("GSMRedirectActivity", "Loading workout detail fails, " + g3Var.f35303d.getMessage());
                                    gSMRedirectActivity2.f36458c.setVisibility(8);
                                    GSMRedirectActivity.O9(gSMRedirectActivity2, R.string.gsm_redirect_message_workout_not_found, new f(rVar, 0));
                                    break;
                                }
                                break;
                            default:
                                GSMRedirectActivity.r rVar2 = this.f60500b;
                                GSMRedirectActivity gSMRedirectActivity3 = GSMRedirectActivity.this;
                                int[] iArr2 = GSMRedirectActivity.a.f36461b;
                                p pVar = g3Var.f35300a;
                                T t7 = g3Var.f35301b;
                                int i19 = iArr2[pVar.ordinal()];
                                if (i19 == 1) {
                                    WorkoutDetailsDTO workoutDetailsDTO = (WorkoutDetailsDTO) t7;
                                    if (workoutDetailsDTO.f48044e == m52.k.A) {
                                        Intent intent3 = new Intent(gSMRedirectActivity3, (Class<?>) MultiSportsDetailsActivity.class);
                                        intent3.putExtra("GCM_workout_id", workoutDetailsDTO.f48040a);
                                        gSMRedirectActivity3.startActivity(intent3);
                                    } else {
                                        Intent intent4 = new Intent(gSMRedirectActivity3, (Class<?>) WorkoutDetailsActivity.class);
                                        intent4.putExtra("GCM_workout_id", workoutDetailsDTO.f48040a);
                                        gSMRedirectActivity3.startActivity(intent4);
                                    }
                                    gSMRedirectActivity3.f36458c.setVisibility(8);
                                    gSMRedirectActivity3.setResult(1);
                                    gSMRedirectActivity3.finish();
                                    break;
                                } else if (i19 == 2) {
                                    i2.i("GSMRedirectActivity", "Loading workout detail fails, " + g3Var.f35303d);
                                    gSMRedirectActivity3.f36458c.setVisibility(8);
                                    GSMRedirectActivity.O9(gSMRedirectActivity3, R.string.gsm_redirect_message_workout_not_found, new f(rVar2, 1));
                                    break;
                                }
                                break;
                        }
                    }
                });
                return;
            }
            if (!str2.equals("generic")) {
                gSMRedirectActivity.setResult(0);
                gSMRedirectActivity.finish();
                return;
            }
            gSMRedirectActivity.f36458c.setVisibility(0);
            dn0.k kVar3 = gSMRedirectActivity.f36456a;
            long jLongValue3 = l14.longValue();
            kVar3.getClass();
            y0 y0Var3 = new y0();
            ge1.b.T(v1.a(kVar3), null, null, new dn0.h(jLongValue3, y0Var3, null), 3);
            y0Var3.f(gSMRedirectActivity, new z0(this) { // from class: dn0.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ GSMRedirectActivity.r f60500b;

                {
                    this.f60500b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // androidx.lifecycle.z0
                public final void onChanged(Object obj) {
                    g3 g3Var = (g3) obj;
                    switch (i16) {
                        case 0:
                            GSMRedirectActivity.r rVar = this.f60500b;
                            GSMRedirectActivity gSMRedirectActivity2 = GSMRedirectActivity.this;
                            int i18 = GSMRedirectActivity.a.f36461b[g3Var.f35300a.ordinal()];
                            if (i18 == 1) {
                                WorkoutScheduleDTO workoutScheduleDTO = (WorkoutScheduleDTO) g3Var.f35301b;
                                m52.k kVar4 = workoutScheduleDTO.f48065a.f48044e;
                                m52.k kVar5 = m52.k.A;
                                long j8 = workoutScheduleDTO.f48067c;
                                if (kVar4 == kVar5) {
                                    MultiSportsDetailsActivity.f48440z.getClass();
                                    gSMRedirectActivity2.getClass();
                                    Intent intent = new Intent(gSMRedirectActivity2, (Class<?>) MultiSportsDetailsActivity.class);
                                    intent.putExtra("GCM_extra_activity_type", MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD);
                                    intent.putExtra("EXTRA_SCHEDULE_WORKOUT_ID", j8);
                                    gSMRedirectActivity2.startActivity(intent);
                                } else {
                                    WorkoutDetailsActivity.f48482f.getClass();
                                    gSMRedirectActivity2.getClass();
                                    Intent intent2 = new Intent(gSMRedirectActivity2, (Class<?>) WorkoutDetailsActivity.class);
                                    intent2.putExtra("GCM_extra_activity_type", MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD);
                                    intent2.putExtra("GCM_workout_schedule_id", j8);
                                    gSMRedirectActivity2.startActivity(intent2);
                                }
                                gSMRedirectActivity2.f36458c.setVisibility(8);
                                gSMRedirectActivity2.setResult(1);
                                gSMRedirectActivity2.finish();
                                break;
                            } else if (i18 == 2) {
                                i2.i("GSMRedirectActivity", "Loading workout detail fails, " + g3Var.f35303d.getMessage());
                                gSMRedirectActivity2.f36458c.setVisibility(8);
                                GSMRedirectActivity.O9(gSMRedirectActivity2, R.string.gsm_redirect_message_workout_not_found, new f(rVar, 0));
                                break;
                            }
                            break;
                        default:
                            GSMRedirectActivity.r rVar2 = this.f60500b;
                            GSMRedirectActivity gSMRedirectActivity3 = GSMRedirectActivity.this;
                            int[] iArr2 = GSMRedirectActivity.a.f36461b;
                            p pVar = g3Var.f35300a;
                            T t7 = g3Var.f35301b;
                            int i19 = iArr2[pVar.ordinal()];
                            if (i19 == 1) {
                                WorkoutDetailsDTO workoutDetailsDTO = (WorkoutDetailsDTO) t7;
                                if (workoutDetailsDTO.f48044e == m52.k.A) {
                                    Intent intent3 = new Intent(gSMRedirectActivity3, (Class<?>) MultiSportsDetailsActivity.class);
                                    intent3.putExtra("GCM_workout_id", workoutDetailsDTO.f48040a);
                                    gSMRedirectActivity3.startActivity(intent3);
                                } else {
                                    Intent intent4 = new Intent(gSMRedirectActivity3, (Class<?>) WorkoutDetailsActivity.class);
                                    intent4.putExtra("GCM_workout_id", workoutDetailsDTO.f48040a);
                                    gSMRedirectActivity3.startActivity(intent4);
                                }
                                gSMRedirectActivity3.f36458c.setVisibility(8);
                                gSMRedirectActivity3.setResult(1);
                                gSMRedirectActivity3.finish();
                                break;
                            } else if (i19 == 2) {
                                i2.i("GSMRedirectActivity", "Loading workout detail fails, " + g3Var.f35303d);
                                gSMRedirectActivity3.f36458c.setVisibility(8);
                                GSMRedirectActivity.O9(gSMRedirectActivity3, R.string.gsm_redirect_message_workout_not_found, new f(rVar2, 1));
                                break;
                            }
                            break;
                    }
                }
            });
        }

        /* JADX WARN: Code duplicated, block: B:43:0x008d  */
        public final void e(t10.n nVar, m52.k kVar) {
            j62.b bVar;
            int i14 = a.f36460a[nVar.ordinal()];
            Long l14 = this.f36496e;
            GSMRedirectActivity gSMRedirectActivity = GSMRedirectActivity.this;
            if (i14 == 1) {
                Intent intent = new Intent(gSMRedirectActivity, (Class<?>) WorkoutPreCreateActivity.class);
                if (l14 != null) {
                    intent.putExtra("GCM_workout_queue_download_to_device", l14);
                }
                gSMRedirectActivity.startActivity(intent);
                gSMRedirectActivity.finish();
                return;
            }
            if (i14 != 2) {
                if (i14 != 3) {
                    return;
                }
                Intent intent2 = kVar == m52.k.A ? new Intent(gSMRedirectActivity, (Class<?>) MultiSportsDetailsActivity.class) : new Intent(gSMRedirectActivity, (Class<?>) WorkoutDetailsActivity.class);
                intent2.putExtra("GCM_extra_activity_type", 212);
                intent2.putExtra("GCM_workout_id", this.f36494c);
                if (l14 != null) {
                    intent2.putExtra("GCM_workout_queue_download_to_device", l14);
                }
                gSMRedirectActivity.startActivity(intent2);
                gSMRedirectActivity.finish();
                return;
            }
            Intent intent3 = new Intent(gSMRedirectActivity, (Class<?>) MSNWorkoutListActivity.class);
            Integer num = this.f36501j;
            if (num != null) {
                int iIntValue = num.intValue();
                Integer num2 = this.f36502k;
                if (iIntValue != 10) {
                    if (iIntValue == 62 && (num2 == null || num2.intValue() == 0)) {
                        bVar = j62.b.STRENGTH;
                    } else {
                        bVar = null;
                    }
                } else if (num2 == null) {
                    bVar = null;
                } else {
                    int iIntValue2 = num2.intValue();
                    if (iIntValue2 == 20) {
                        bVar = j62.b.STRENGTH;
                    } else if (iIntValue2 == 26) {
                        bVar = j62.b.CARDIO;
                    } else if (iIntValue2 == 43) {
                        bVar = j62.b.YOGA;
                    } else if (iIntValue2 != 44) {
                        bVar = null;
                    } else {
                        bVar = j62.b.PILATES;
                    }
                }
            } else {
                bVar = null;
            }
            if (bVar != null) {
                intent3.putExtra("GCM_extra_activity_type", bVar.f97407a);
            }
            if (l14 != null) {
                intent3.putExtra("GCM_workout_queue_download_to_device", l14);
            }
            gSMRedirectActivity.startActivity(intent3);
            gSMRedirectActivity.finish();
        }
    }

    public static void O9(GSMRedirectActivity gSMRedirectActivity, int i14, DialogInterface.OnClickListener onClickListener) {
        gSMRedirectActivity.getClass();
        new androidx.appcompat.app.e.a(gSMRedirectActivity).setMessage(i14).setCancelable(false).setPositiveButton(R.string.lbl_ok, onClickListener).show();
    }

    @Override // androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        this.f36457b.a(i14, i15, intent);
    }

    @Override // androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        j lVar;
        super.onCreate(bundle);
        setContentView(R.layout.simple_progress_bar);
        this.f36456a = (dn0.k) new x1(this).b(s0.f105811a.b(dn0.k.class));
        Uri data = getIntent().getData();
        if (data != null) {
            try {
                String strDecode = URLDecoder.decode(data.toString(), "UTF-8");
                Matcher matcher = f36440e.matcher(strDecode);
                Matcher matcher2 = f36441f.matcher(strDecode);
                Matcher matcher3 = f36442g.matcher(strDecode);
                Matcher matcher4 = f36445j.matcher(strDecode);
                Matcher matcher5 = f36446k.matcher(strDecode);
                Matcher matcher6 = f36447l.matcher(strDecode);
                Matcher matcher7 = f36444i.matcher(strDecode);
                Matcher matcher8 = f36443h.matcher(strDecode);
                Matcher matcher9 = f36448m.matcher(strDecode);
                Matcher matcher10 = f36449n.matcher(strDecode);
                Matcher matcher11 = f36450o.matcher(strDecode);
                Matcher matcher12 = f36451p.matcher(strDecode);
                Matcher matcher13 = f36452q.matcher(strDecode);
                Matcher matcher14 = f36453r.matcher(strDecode);
                Matcher matcher15 = f36454t.matcher(strDecode);
                Matcher matcher16 = f36455v.matcher(strDecode);
                i2.d("GSMRedirectActivity", "uriString = " + strDecode);
                if (matcher.matches()) {
                    this.f36459d = dn0.l.ACTIVITY;
                    lVar = new c(matcher);
                } else if (matcher2.matches()) {
                    this.f36459d = dn0.l.ACTIVITY;
                    lVar = new c(matcher2);
                } else if (matcher3.matches()) {
                    this.f36459d = dn0.l.WORKOUT;
                    lVar = new r(matcher3, this);
                } else if (matcher4.matches()) {
                    this.f36459d = dn0.l.CALENDAR;
                    lVar = new e(matcher4);
                } else if (matcher5.matches()) {
                    this.f36459d = dn0.l.SNAPSHOTS;
                    lVar = new p(matcher5);
                } else if (matcher6.matches()) {
                    this.f36459d = dn0.l.DEVICE_LIST;
                    lVar = new f(matcher6);
                } else if (matcher7.matches()) {
                    this.f36459d = dn0.l.TRAINING_PLAN;
                    lVar = new q(this, matcher7, 0);
                } else {
                    int i14 = 0;
                    if (matcher8.matches()) {
                        this.f36459d = dn0.l.EVENTS;
                        lVar = new g(this, matcher8, i14);
                    } else if (matcher9.matches()) {
                        this.f36459d = dn0.l.RUNNING_ECONOMY;
                        lVar = new n(this, matcher9, i14);
                    } else if (matcher10.matches()) {
                        this.f36459d = dn0.l.GEAR;
                        lVar = new h(this, i14);
                    } else if (matcher11.matches()) {
                        this.f36459d = dn0.l.SLEEP;
                        lVar = new o(this, data, i14);
                    } else if (matcher13.matches() || matcher12.matches()) {
                        int i15 = 0;
                        this.f36459d = dn0.l.LIFESTYLE_LOGGING;
                        lVar = new k(this, i15);
                    } else if (matcher14.matches()) {
                        this.f36459d = dn0.l.ALIPAY_APPLET_INSTALLATION;
                        lVar = new d(matcher14);
                    } else if (matcher15.matches()) {
                        com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                        com.garmin.android.apps.connectmobile.navigation.b.a.c(this, null, 0);
                        lVar = new m(this, 0);
                    } else {
                        int i16 = 0;
                        if (matcher16.matches()) {
                            this.f36459d = dn0.l.HEALTH_STATUS;
                            lVar = new i(this, i16);
                        } else {
                            this.f36459d = dn0.l.FAILED;
                            i2.i("GSMRedirectActivity", "Matching failed ");
                            lVar = new l(this, i16);
                        }
                    }
                }
            } catch (UnsupportedEncodingException unused) {
                lVar = new l(this, 0);
            }
        } else {
            this.f36459d = dn0.l.FAILED;
            lVar = new l(this, 0);
        }
        this.f36457b = lVar;
        this.f36458c = (ProgressBar) findViewById(R.id.progress_bar);
    }

    @Override // androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f36457b.b(this.f36459d, this.f36456a);
    }

    public abstract class b implements j {
        private b() {
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.j
        public void a(int i14, int i15, Intent intent) {
            if (i14 == 51) {
                GSMRedirectActivity gSMRedirectActivity = GSMRedirectActivity.this;
                gSMRedirectActivity.setResult(5);
                gSMRedirectActivity.finish();
            }
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.j
        public final void b(dn0.l lVar, dn0.k kVar) {
            boolean zC = ((f12.b) KoinJavaComponent.get(f12.b.class)).c();
            GSMRedirectActivity gSMRedirectActivity = GSMRedirectActivity.this;
            if (!zC) {
                GarminConnectMobileApp.f28687i.d();
                ((e80.a) KoinJavaComponent.get(e80.a.class)).a(gSMRedirectActivity.getIntent().getDataString() != null ? gSMRedirectActivity.getIntent().getDataString() : "", f80.b.GSM_REDIRECT_ACTIVITY);
                gSMRedirectActivity.finish();
            } else if (c(((f12.b) KoinJavaComponent.get(f12.b.class)).getUserProfilePk())) {
                d();
            } else {
                new androidx.appcompat.app.e.a(gSMRedirectActivity).setTitle(R.string.gsm_redirect_title_mismatched_account).setMessage(lVar == dn0.l.DEVICE_LIST ? String.format(gSMRedirectActivity.getApplicationContext().getString(R.string.gsm_redirect_message_mismatched_account_general), gSMRedirectActivity.getApplicationContext().getString(R.string.garmin_explore_name)) : gSMRedirectActivity.getApplicationContext().getString(R.string.gsm_redirect_message_mismatched_account)).setPositiveButton(R.string.lbl_yes, new ai1.a(kVar, 25)).setNegativeButton(R.string.lbl_no, new ai1.a(this, 26)).setCancelable(false).show();
            }
        }

        public abstract boolean c(long j8);

        public abstract void d();

        public /* synthetic */ b(GSMRedirectActivity gSMRedirectActivity, int i14) {
            this();
        }
    }

    public class l implements j {
        private l() {
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.j
        public final void a(int i14, int i15, Intent intent) {
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.j
        public final void b(dn0.l lVar, dn0.k kVar) {
            GSMRedirectActivity gSMRedirectActivity = GSMRedirectActivity.this;
            gSMRedirectActivity.setResult(0);
            gSMRedirectActivity.finish();
        }

        public /* synthetic */ l(GSMRedirectActivity gSMRedirectActivity, int i14) {
            this();
        }
    }

    public class m implements j {
        private m() {
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.j
        public final void a(int i14, int i15, Intent intent) {
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.j
        public final void b(dn0.l lVar, dn0.k kVar) {
            GSMRedirectActivity gSMRedirectActivity = GSMRedirectActivity.this;
            gSMRedirectActivity.setResult(1);
            gSMRedirectActivity.finish();
        }

        public /* synthetic */ m(GSMRedirectActivity gSMRedirectActivity, int i14) {
            this();
        }
    }

    public class h extends b {
        private h() {
            super(GSMRedirectActivity.this, 0);
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.b
        public final boolean c(long j8) {
            return true;
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.b
        public final void d() {
            GearActivity.f35500b.getClass();
            GSMRedirectActivity gSMRedirectActivity = GSMRedirectActivity.this;
            gSMRedirectActivity.startActivity(GearActivity.a.a(gSMRedirectActivity));
            gSMRedirectActivity.finish();
        }

        public /* synthetic */ h(GSMRedirectActivity gSMRedirectActivity, int i14) {
            this();
        }
    }

    public class i extends b {
        private i() {
            super(GSMRedirectActivity.this, 0);
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.b
        public final boolean c(long j8) {
            return true;
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.b
        public final void d() {
            ty0.b bVar = ty0.b.f166875h1;
            com.garmin.android.apps.connectmobile.navigation.b.a aVar = com.garmin.android.apps.connectmobile.navigation.b.f39357a;
            aVar.getClass();
            bVar.getClass();
            GSMRedirectActivity gSMRedirectActivity = GSMRedirectActivity.this;
            gSMRedirectActivity.getClass();
            com.garmin.android.apps.connectmobile.navigation.b.a.b(aVar, bVar, gSMRedirectActivity, null, 12);
            gSMRedirectActivity.setResult(1);
            gSMRedirectActivity.finish();
        }

        public /* synthetic */ i(GSMRedirectActivity gSMRedirectActivity, int i14) {
            this();
        }
    }

    public class k extends b {
        private k() {
            super(GSMRedirectActivity.this, 0);
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.b, com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.j
        public final void a(int i14, int i15, Intent intent) {
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.b
        public final boolean c(long j8) {
            return true;
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.b
        public final void d() {
            zd1.a aVar = zd1.a.f204221a;
            GSMRedirectActivity gSMRedirectActivity = GSMRedirectActivity.this;
            Context applicationContext = gSMRedirectActivity.getApplicationContext();
            aVar.getClass();
            applicationContext.getClass();
            Intent intent = new Intent(applicationContext, (Class<?>) LifestyleLoggingActivity.class);
            new zd1.a.C3809a(intent);
            Unit unit = Unit.INSTANCE;
            if (gSMRedirectActivity.isTaskRoot()) {
                gSMRedirectActivity.startActivity(GCMActivityStartup.P9(gSMRedirectActivity, intent));
            } else {
                gSMRedirectActivity.startActivity(intent);
            }
            gSMRedirectActivity.finish();
        }

        public /* synthetic */ k(GSMRedirectActivity gSMRedirectActivity, int i14) {
            this();
        }
    }

    public class o extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f36486b;

        private o(Uri uri) {
            super(GSMRedirectActivity.this, 0);
            this.f36486b = uri;
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.b
        public final boolean c(long j8) {
            return true;
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.b
        public final void d() {
            Bundle bundle = new Bundle();
            Uri uri = this.f36486b;
            String queryParameter = uri.getQueryParameter("showHistory");
            bundle.putSerializable("EXTRA_SELECTED_INTERVAL_TYPE", (queryParameter == null || !queryParameter.equals(BooleanUtils.TRUE)) ? o82.g.f130850c : o82.g.f130851d);
            String queryParameter2 = uri.getQueryParameter("resetBreathingDisruptionsEducation");
            if (queryParameter2 != null) {
                bundle.putBoolean("resetBreathingDisruptionsEducation", Boolean.parseBoolean(queryParameter2));
            }
            ty0.b bVar = ty0.b.S0;
            GSMRedirectActivity gSMRedirectActivity = GSMRedirectActivity.this;
            com.garmin.android.apps.connectmobile.navigation.b.a(bVar, gSMRedirectActivity, bundle);
            gSMRedirectActivity.setResult(1);
            gSMRedirectActivity.finish();
        }

        public /* synthetic */ o(GSMRedirectActivity gSMRedirectActivity, Uri uri, int i14) {
            this(uri);
        }
    }

    public class n extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t10.j f36484b;

        private n(Matcher matcher) {
            super(GSMRedirectActivity.this, 0);
            this.f36484b = t10.j.HELP;
            if (matcher.group("action") != null) {
                t10.j.a aVar = t10.j.f161689c;
                String strGroup = matcher.group("action");
                aVar.getClass();
                this.f36484b = t10.j.a.a(strGroup);
            }
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.b
        public final boolean c(long j8) {
            return this.f36484b != null;
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.b
        public final void d() {
            if (GarminConnectMobileApp.f28687i.f28689a) {
                e();
                return;
            }
            d32.b bVar = new d32.b(GSMRedirectActivity.this);
            bVar.setTitle(R.string.common_learn_more);
            bVar.setMessage(R.string.continue_learn_about_running_economy);
            final int i14 = 0;
            bVar.setPositiveButton(R.string.lbl_common_continue, new DialogInterface.OnClickListener(this) { // from class: dn0.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ GSMRedirectActivity.n f60496b;

                {
                    this.f60496b = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i15) {
                    switch (i14) {
                        case 0:
                            dialogInterface.dismiss();
                            GSMRedirectActivity.n nVar = this.f60496b;
                            nVar.e();
                            GSMRedirectActivity.this.finish();
                            break;
                        default:
                            dialogInterface.dismiss();
                            GSMRedirectActivity.this.finish();
                            break;
                    }
                }
            });
            final int i15 = 1;
            bVar.setNegativeButton(R.string.common_cancel, new DialogInterface.OnClickListener(this) { // from class: dn0.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ GSMRedirectActivity.n f60496b;

                {
                    this.f60496b = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i16) {
                    switch (i15) {
                        case 0:
                            dialogInterface.dismiss();
                            GSMRedirectActivity.n nVar = this.f60496b;
                            nVar.e();
                            GSMRedirectActivity.this.finish();
                            break;
                        default:
                            dialogInterface.dismiss();
                            GSMRedirectActivity.this.finish();
                            break;
                    }
                }
            });
            bVar.show();
        }

        public final void e() {
            GSMRedirectActivity gSMRedirectActivity = GSMRedirectActivity.this;
            Context applicationContext = gSMRedirectActivity.getApplicationContext();
            RunningEconomyReportsActivity.f41149c.getClass();
            applicationContext.getClass();
            Intent intent = new Intent(applicationContext, (Class<?>) RunningEconomyReportsActivity.class);
            intent.putExtra("HELP_NAVIGATION_EXTRA", true);
            gSMRedirectActivity.startActivity(intent);
        }

        public /* synthetic */ n(GSMRedirectActivity gSMRedirectActivity, Matcher matcher, int i14) {
            this(matcher);
        }
    }

    public class q extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f36490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Boolean f36491c;

        private q(Matcher matcher) {
            super(GSMRedirectActivity.this, 0);
            this.f36490b = null;
            if (matcher.group(NotificationConstants.KEY_DATA_MIME_TYPE) != null) {
                matcher.group(NotificationConstants.KEY_DATA_MIME_TYPE);
            }
            if (matcher.group(FirebaseAnalytics.Param.DESTINATION) != null) {
                this.f36490b = matcher.group(FirebaseAnalytics.Param.DESTINATION);
            }
            this.f36491c = Boolean.valueOf(GarminConnectMobileApp.f28687i.f28689a);
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.b
        public final boolean c(long j8) {
            return true;
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.b
        public final void d() {
            if (this.f36491c.booleanValue()) {
                e();
                return;
            }
            d32.b bVar = new d32.b(GSMRedirectActivity.this);
            bVar.setTitle(R.string.lbl_adaptive_training_plan);
            bVar.setMessage(R.string.continue_to_garmin_coach);
            final int i14 = 0;
            bVar.setPositiveButton(R.string.lbl_common_continue, new DialogInterface.OnClickListener(this) { // from class: dn0.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ GSMRedirectActivity.q f60498b;

                {
                    this.f60498b = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i15) {
                    switch (i14) {
                        case 0:
                            dialogInterface.dismiss();
                            GSMRedirectActivity.q qVar = this.f60498b;
                            qVar.e();
                            GSMRedirectActivity.this.finish();
                            break;
                        default:
                            dialogInterface.dismiss();
                            GSMRedirectActivity.this.finish();
                            break;
                    }
                }
            });
            final int i15 = 1;
            bVar.setNegativeButton(R.string.common_cancel, new DialogInterface.OnClickListener(this) { // from class: dn0.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ GSMRedirectActivity.q f60498b;

                {
                    this.f60498b = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i16) {
                    switch (i15) {
                        case 0:
                            dialogInterface.dismiss();
                            GSMRedirectActivity.q qVar = this.f60498b;
                            qVar.e();
                            GSMRedirectActivity.this.finish();
                            break;
                        default:
                            dialogInterface.dismiss();
                            GSMRedirectActivity.this.finish();
                            break;
                    }
                }
            });
            bVar.show();
        }

        public final void e() {
            Intent intentA;
            GSMRedirectActivity gSMRedirectActivity = GSMRedirectActivity.this;
            String str = this.f36490b;
            if (str == null || !str.equals("completedPlan")) {
                boolean z14 = str != null && str.equals("preferences");
                ActiveTrainingPlansActivity.f45098w.getClass();
                intentA = ActiveTrainingPlansActivity.a.a(gSMRedirectActivity, false, true, false, null, true, z14);
            } else {
                CompletedTrainingPlansActivity.f45088h.getClass();
                gSMRedirectActivity.getClass();
                intentA = new Intent(gSMRedirectActivity, (Class<?>) CompletedTrainingPlansActivity.class);
                intentA.putExtra("is_from_deeplink_key", true);
            }
            if (gSMRedirectActivity.isTaskRoot()) {
                gSMRedirectActivity.startActivity(GCMActivityStartup.P9(gSMRedirectActivity, intentA));
            } else {
                gSMRedirectActivity.startActivity(intentA);
            }
            gSMRedirectActivity.finish();
        }

        public /* synthetic */ q(GSMRedirectActivity gSMRedirectActivity, Matcher matcher, int i14) {
            this(matcher);
        }
    }

    public class g extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f36476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f36477c;

        private g(Matcher matcher) {
            super(GSMRedirectActivity.this, 0);
            this.f36476b = null;
            this.f36477c = null;
            t10.d.a aVar = t10.d.f161677c;
            if (matcher.group("eventId") != null) {
                this.f36476b = Long.valueOf(Long.parseLong(matcher.group("eventId")));
            }
            if (matcher.group("eventUuid") != null) {
                this.f36477c = matcher.group("eventUuid");
            }
            if (matcher.group("action") != null) {
                t10.d.a aVar2 = t10.d.f161677c;
                String strGroup = matcher.group("action");
                aVar2.getClass();
                t10.d.a.a(strGroup);
            }
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.b, com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.j
        public final void a(int i14, int i15, Intent intent) {
            super.a(i14, i15, intent);
            if (i14 == 52) {
                GSMRedirectActivity gSMRedirectActivity = GSMRedirectActivity.this;
                if (i15 != 0) {
                    gSMRedirectActivity.setResult(1);
                    gSMRedirectActivity.finish();
                    return;
                }
                String string = gSMRedirectActivity.getString(R.string.event_not_found_alert_title);
                dn0.b bVar = new dn0.b(this, 0);
                Pattern pattern = GSMRedirectActivity.f36440e;
                androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(gSMRedirectActivity);
                aVar.setTitle(string);
                aVar.setMessage(R.string.event_not_found_alert_msg).setCancelable(false).setPositiveButton(R.string.lbl_ok, bVar).show();
            }
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.b
        public final boolean c(long j8) {
            return (this.f36476b == null && this.f36477c == null) ? false : true;
        }

        @Override // com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity.b
        public final void d() {
            if (GarminConnectMobileApp.f28687i.f28689a) {
                e();
                return;
            }
            d32.b bVar = new d32.b(GSMRedirectActivity.this);
            bVar.setTitle(R.string.view_event);
            bVar.setMessage(R.string.view_event_message);
            bVar.setPositiveButton(R.string.lbl_common_continue, new dn0.b(this, 1));
            bVar.setNegativeButton(R.string.common_cancel, new dn0.b(this, 2));
            bVar.show();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void e() {
            EventDetailsActivity.f45692o.getClass();
            GSMRedirectActivity gSMRedirectActivity = GSMRedirectActivity.this;
            gSMRedirectActivity.getClass();
            Intent intent = new Intent(gSMRedirectActivity, (Class<?>) EventDetailsActivity.class);
            CalendarItemDTO calendarItemDTO = new CalendarItemDTO();
            String str = this.f36477c;
            if (str != null) {
                calendarItemDTO.I1 = true;
                calendarItemDTO.H1 = str;
            } else {
                Long l14 = this.f36476b;
                if (l14 != null) {
                    calendarItemDTO.f30967a = (int) l14.longValue();
                }
            }
            intent.putExtra("GCM_calendar_items", calendarItemDTO);
            gSMRedirectActivity.startActivityForResult(intent, 52);
        }

        public /* synthetic */ g(GSMRedirectActivity gSMRedirectActivity, Matcher matcher, int i14) {
            this(matcher);
        }
    }
}
