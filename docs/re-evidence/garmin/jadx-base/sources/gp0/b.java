package gp0;

import am.x0;
import am.z0;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.acclimation.reports.presentation.activity.PulseOxAcclimationReportsActivity;
import com.garmin.android.apps.connectmobile.activities.health.presentation.HealthSnapshotActivity;
import com.garmin.android.apps.connectmobile.activities.reports.ActivityReportsActivity;
import com.garmin.android.apps.connectmobile.blood_pressure.presentation.BloodPressureReportsActivity;
import com.garmin.android.apps.connectmobile.calories.presentation.CaloriesReportsActivity;
import com.garmin.android.apps.connectmobile.ecg.presentation.stats.EcgActivity;
import com.garmin.android.apps.connectmobile.ecg.presentation.stats.EcgDetailActivity;
import com.garmin.android.apps.connectmobile.floors.presentation.FloorsActivity;
import com.garmin.android.apps.connectmobile.golf.DownloadGolfAppDeepLinkActivity;
import com.garmin.android.apps.connectmobile.heartrate.presentation.HeartRateReportsActivity;
import com.garmin.android.apps.connectmobile.hydration.presentation.summary.HydrationActivity;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import com.garmin.android.apps.connectmobile.pending.activities.presentation.PendingActivitiesActivity;
import com.garmin.android.apps.connectmobile.pulseox.presentation.PulseOxActivity;
import com.garmin.android.apps.connectmobile.respiration.presentation.RespirationReportsActivity;
import com.garmin.android.apps.connectmobile.steps.presentation.StepsActivity;
import com.garmin.android.apps.connectmobile.stress.presentation.view.StressReportsActivity;
import com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsActivity;
import e32.o;
import en.i;
import ep0.b0;
import hb2.g;
import o70.t;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import pm1.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgp0/b;", "Lgp0/a;", "Lpm1/f;", "sleepDelegate", "Lmq1/a;", "stepsDelegate", "<init>", "(Lpm1/f;Lmq1/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements gp0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f78424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mq1.a f78425b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f78427b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f78428c;

        static {
            int[] iArr = new int[t.b.values().length];
            try {
                iArr[t.b.f130089d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.b.f130090e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.b.f130091f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t.b.f130092g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f78426a = iArr;
            int[] iArr2 = new int[x0.values().length];
            try {
                iArr2[x0.P1.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[x0.D.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f78427b = iArr2;
            int[] iArr3 = new int[t.values().length];
            try {
                iArr3[t.f130064h.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[t.f130066j.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[t.f130075r.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[t.f130077v.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[t.B.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[t.T.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[t.Y.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[t.Z.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[t.I0.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[t.Q0.ordinal()] = 10;
            } catch (NoSuchFieldError unused16) {
            }
            f78428c = iArr3;
        }
    }

    public b(f fVar, mq1.a aVar) {
        fVar.getClass();
        aVar.getClass();
        this.f78424a = fVar;
        this.f78425b = aVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gp0.a
    public final void a(Context context, b0 b0Var, Object obj) {
        x0 x0VarM;
        context.getClass();
        b0Var.getClass();
        String str = b0Var.f64868a;
        DateTime dateTimeMinusDays = DateTime.now().minusDays(1);
        t.a aVar = t.f130062f;
        String str2 = b0Var.f64869b;
        aVar.getClass();
        t.b bVarD = t.a.d(str2);
        int i14 = bVarD == null ? -1 : a.f78426a[bVarD.ordinal()];
        if (i14 == 1) {
            context.startActivity(dh.b.z(PulseOxActivity.class, context, DateTime.now(), true));
        } else if (i14 == 2) {
            PulseOxAcclimationReportsActivity.f28764a.getClass();
            context.startActivity(new Intent(context, (Class<?>) PulseOxAcclimationReportsActivity.class));
        } else if (i14 == 3) {
            context.startActivity(dh.b.z(StepsActivity.class, context, dateTimeMinusDays, true));
        } else if (i14 == 4) {
            context.startActivity(this.f78425b.b(dateTimeMinusDays, true));
        }
        t tVarA = t.a.a(str);
        switch (tVarA != null ? a.f78428c[tVarA.ordinal()] : -1) {
            case 1:
                context.startActivity(dh.b.z(BloodPressureReportsActivity.class, context, dateTimeMinusDays, true));
                break;
            case 2:
                context.startActivity(dh.b.z(CaloriesReportsActivity.class, context, null, true));
                break;
            case 3:
                context.startActivity(dh.b.z(FloorsActivity.class, context, dateTimeMinusDays, true));
                break;
            case 4:
                context.startActivity(dh.b.z(HeartRateReportsActivity.class, context, dateTimeMinusDays, true));
                break;
            case 5:
                HydrationActivity.f36739o.getClass();
                context.startActivity(HydrationActivity.a.a(context, dateTimeMinusDays, true));
                break;
            case 6:
                context.startActivity(dh.b.z(NutritionActivity.class, context, dateTimeMinusDays, true));
                break;
            case 7:
                context.startActivity(dh.b.z(RespirationReportsActivity.class, context, dateTimeMinusDays, true));
                break;
            case 8:
                this.f78424a.i(context, dateTimeMinusDays.toLocalDate(), o.f62807j);
                break;
            case 9:
                context.startActivity(dh.b.z(StressReportsActivity.class, context, dateTimeMinusDays, true));
                break;
            case 10:
                context.startActivity(dh.b.z(WeightReportsActivity.class, context, dateTimeMinusDays, true));
                break;
            default:
                switch (str.hashCode()) {
                    case -873340145:
                        if (str.equals("ACTIVITY") && (x0VarM = z0.m(str2)) != null) {
                            int i15 = a.f78427b[x0VarM.ordinal()];
                            if (i15 == 1) {
                                DownloadGolfAppDeepLinkActivity.f35745a.getClass();
                                Intent intent = new Intent(context, (Class<?>) DownloadGolfAppDeepLinkActivity.class);
                                intent.putExtra("action", "scorecard.list");
                                context.startActivity(intent);
                            } else if (i15 == 2 && g.b(context, g.a.GARMIN_DIVE)) {
                                new i(context).execute();
                            } else {
                                ActivityReportsActivity.a.a(ActivityReportsActivity.f29758a, context, x0VarM, null, null, 0, 12);
                            }
                        }
                        break;
                    case -764663883:
                        if (str.equals("PENDING_ACTIVITIES")) {
                            PendingActivitiesActivity.a aVar2 = PendingActivitiesActivity.f39793d;
                            com.garmin.android.apps.connectmobile.pending.activities.presentation.a.C0723a c0723a = com.garmin.android.apps.connectmobile.pending.activities.presentation.a.C0723a.INSTANCE;
                            aVar2.getClass();
                            c0723a.getClass();
                            context.startActivity(PendingActivitiesActivity.a.a(context, c0723a));
                            break;
                        }
                        break;
                    case -751343545:
                        if (str.equals("HEALTH_SNAPSHOT")) {
                            HealthSnapshotActivity.f29015d.getClass();
                            context.startActivity(new Intent(context, (Class<?>) HealthSnapshotActivity.class));
                            break;
                        }
                        break;
                    case 550380667:
                        if (str.equals("ECG_RECORDING")) {
                            if (obj == null) {
                                EcgActivity.f34850a.getClass();
                                context.startActivity(new Intent(context, (Class<?>) EcgActivity.class));
                            } else {
                                EcgDetailActivity.f34869p.getClass();
                                context.startActivity(EcgDetailActivity.a.a(context, (String) obj));
                            }
                            break;
                        }
                        break;
                }
                break;
        }
    }
}
