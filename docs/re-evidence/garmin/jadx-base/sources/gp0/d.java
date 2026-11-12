package gp0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.acclimation.reports.presentation.activity.PulseOxAcclimationReportsActivity;
import com.garmin.android.apps.connectmobile.blood_pressure.presentation.BloodPressureReportsActivity;
import com.garmin.android.apps.connectmobile.bodybattery.presentation.BodyBatteryReportsActivity;
import com.garmin.android.apps.connectmobile.calories.presentation.CaloriesReportsActivity;
import com.garmin.android.apps.connectmobile.floors.presentation.FloorsActivity;
import com.garmin.android.apps.connectmobile.heartrate.presentation.HeartRateReportsActivity;
import com.garmin.android.apps.connectmobile.hydration.presentation.summary.HydrationActivity;
import com.garmin.android.apps.connectmobile.intensityminutes.presentation.IntensityMinutesReportsActivity;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import com.garmin.android.apps.connectmobile.overnighthrv.OvernightHrvActivity;
import com.garmin.android.apps.connectmobile.pulseox.presentation.PulseOxActivity;
import com.garmin.android.apps.connectmobile.respiration.presentation.RespirationReportsActivity;
import com.garmin.android.apps.connectmobile.steps.presentation.StepsActivity;
import com.garmin.android.apps.connectmobile.stress.presentation.view.StressReportsActivity;
import com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsActivity;
import e32.o;
import ep0.b0;
import o70.t;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import pm1.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgp0/d;", "Lgp0/c;", "Lpm1/f;", "sleepDelegate", "Lmq1/a;", "stepsDelegate", "<init>", "(Lpm1/f;Lmq1/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f78429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mq1.a f78430b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f78432b;

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
            f78431a = iArr;
            int[] iArr2 = new int[t.values().length];
            try {
                iArr2[t.f130064h.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[t.f130065i.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[t.f130066j.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[t.f130075r.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[t.f130077v.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[t.A.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[t.B.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[t.C.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[t.T.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[t.Y.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[t.Z.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[t.I0.ordinal()] = 12;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[t.Q0.ordinal()] = 13;
            } catch (NoSuchFieldError unused17) {
            }
            f78432b = iArr2;
        }
    }

    public d(f fVar, mq1.a aVar) {
        fVar.getClass();
        aVar.getClass();
        this.f78429a = fVar;
        this.f78430b = aVar;
    }

    @Override // gp0.c
    public final void a(Context context, b0 b0Var) {
        context.getClass();
        b0Var.getClass();
        DateTime dateTimeMinusDays = DateTime.now().minusDays(1);
        t.a aVar = t.f130062f;
        String str = b0Var.f64869b;
        aVar.getClass();
        t.b bVarD = t.a.d(str);
        int i14 = bVarD == null ? -1 : a.f78431a[bVarD.ordinal()];
        if (i14 == 1) {
            context.startActivity(dh.b.z(PulseOxActivity.class, context, dateTimeMinusDays, false));
        } else if (i14 == 2) {
            PulseOxAcclimationReportsActivity.a aVar2 = PulseOxAcclimationReportsActivity.f28764a;
            dateTimeMinusDays.getClass();
            aVar2.getClass();
            PulseOxAcclimationReportsActivity.a.a(context, dateTimeMinusDays);
        } else if (i14 == 3) {
            context.startActivity(dh.b.z(StepsActivity.class, context, dateTimeMinusDays, false));
        } else if (i14 == 4) {
            context.startActivity(this.f78430b.b(dateTimeMinusDays, false));
        }
        t tVarA = t.a.a(b0Var.f64868a);
        switch (tVarA != null ? a.f78432b[tVarA.ordinal()] : -1) {
            case 1:
                context.startActivity(dh.b.z(BloodPressureReportsActivity.class, context, dateTimeMinusDays, false));
                break;
            case 2:
                context.startActivity(dh.b.z(BodyBatteryReportsActivity.class, context, dateTimeMinusDays, false));
                break;
            case 3:
                context.startActivity(dh.b.z(CaloriesReportsActivity.class, context, dateTimeMinusDays, false));
                break;
            case 4:
                context.startActivity(dh.b.z(FloorsActivity.class, context, dateTimeMinusDays, false));
                break;
            case 5:
                context.startActivity(dh.b.z(HeartRateReportsActivity.class, context, dateTimeMinusDays, false));
                break;
            case 6:
                OvernightHrvActivity.f39738n.getClass();
                context.startActivity(OvernightHrvActivity.a.a(context, dateTimeMinusDays, null));
                break;
            case 7:
                HydrationActivity.f36739o.getClass();
                context.startActivity(HydrationActivity.a.a(context, dateTimeMinusDays, false));
                break;
            case 8:
                IntensityMinutesReportsActivity.f36935b.getClass();
                context.startActivity(IntensityMinutesReportsActivity.a.a(context, dateTimeMinusDays, null));
                break;
            case 9:
                context.startActivity(dh.b.z(NutritionActivity.class, context, dateTimeMinusDays, false));
                break;
            case 10:
                context.startActivity(dh.b.z(RespirationReportsActivity.class, context, dateTimeMinusDays, false));
                break;
            case 11:
                this.f78429a.i(context, dateTimeMinusDays.toLocalDate(), o.f62806i);
                break;
            case 12:
                context.startActivity(dh.b.z(StressReportsActivity.class, context, dateTimeMinusDays, false));
                break;
            case 13:
                context.startActivity(dh.b.z(WeightReportsActivity.class, context, dateTimeMinusDays, false));
                break;
        }
    }
}
