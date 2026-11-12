package com.garmin.android.apps.connectmobile.googlehealthconnect;

import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/googlehealthconnect/b;", "", "<init>", "()V", "a", "c", "b", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f36013a = new b();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/googlehealthconnect/b$a;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        ACTIVE_CALORIES_BURNED,
        BODY_FAT,
        ACTIVE_DISTANCE,
        PASSIVE_DISTANCE,
        ELEVATION_GAINED,
        EXERCISE,
        EXERCISE_SEGMENT,
        CYCLING_PEDALING_CADENCE,
        FLOORS_CLIMBED,
        ACTIVE_HEART_RATE,
        PASSIVE_HEART_RATE,
        HEART_RATE_SAMPLES,
        RESTING_HEART_RATE,
        SLEEP,
        SLEEP_STAGE,
        SPEED,
        SPEED_SAMPLE,
        STEPS,
        ACTIVE_TOTAL_CALORIES_BURNED,
        PASSIVE_TOTAL_CALORIES_BURNED,
        WEIGHT,
        CREATING_RECORDS,
        WRITING_TO_HEALTH_CONNECT,
        DELETING_ACTIVITY,
        DELETING_WEIGHT,
        EDITING_ACTIVITY
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.googlehealthconnect.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/googlehealthconnect/b$b;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum EnumC0626b {
        OPT_IN,
        SETTINGS,
        LEARN_MORE
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/googlehealthconnect/b$c;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum c {
        DEVICE_SYNC,
        APP_STARTED,
        APP_FOREGROUNDED,
        ON_PERMISSIONS_CHANGE,
        ON_MANUAL_ACTIVITY_ENTRY,
        ON_MANUAL_WEIGHT_ENTRY,
        ON_EDIT_SLEEP_ENTRY,
        ON_DELETE_ACTIVITY,
        ON_EDIT_ACTIVITY
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f36053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f36054c;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.DEVICE_SYNC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.APP_STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.APP_FOREGROUNDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.ON_PERMISSIONS_CHANGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.ON_MANUAL_ACTIVITY_ENTRY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c.ON_MANUAL_WEIGHT_ENTRY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[c.ON_EDIT_SLEEP_ENTRY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[c.ON_DELETE_ACTIVITY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[c.ON_EDIT_ACTIVITY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f36052a = iArr;
            int[] iArr2 = new int[EnumC0626b.values().length];
            try {
                iArr2[EnumC0626b.OPT_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EnumC0626b.SETTINGS.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[EnumC0626b.LEARN_MORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            f36053b = iArr2;
            int[] iArr3 = new int[a.values().length];
            try {
                iArr3[a.ACTIVE_CALORIES_BURNED.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[a.BODY_FAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[a.ACTIVE_DISTANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[a.PASSIVE_DISTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[a.ELEVATION_GAINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[a.EXERCISE.ordinal()] = 6;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[a.EXERCISE_SEGMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[a.CYCLING_PEDALING_CADENCE.ordinal()] = 8;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[a.FLOORS_CLIMBED.ordinal()] = 9;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[a.ACTIVE_HEART_RATE.ordinal()] = 10;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[a.PASSIVE_HEART_RATE.ordinal()] = 11;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[a.HEART_RATE_SAMPLES.ordinal()] = 12;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[a.RESTING_HEART_RATE.ordinal()] = 13;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[a.SLEEP.ordinal()] = 14;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[a.SLEEP_STAGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr3[a.SPEED.ordinal()] = 16;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr3[a.SPEED_SAMPLE.ordinal()] = 17;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr3[a.STEPS.ordinal()] = 18;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr3[a.ACTIVE_TOTAL_CALORIES_BURNED.ordinal()] = 19;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr3[a.PASSIVE_TOTAL_CALORIES_BURNED.ordinal()] = 20;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr3[a.WEIGHT.ordinal()] = 21;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr3[a.CREATING_RECORDS.ordinal()] = 22;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr3[a.WRITING_TO_HEALTH_CONNECT.ordinal()] = 23;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr3[a.DELETING_ACTIVITY.ordinal()] = 24;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr3[a.DELETING_WEIGHT.ordinal()] = 25;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr3[a.EDITING_ACTIVITY.ordinal()] = 26;
            } catch (NoSuchFieldError unused38) {
            }
            f36054c = iArr3;
        }
    }

    private b() {
    }

    public static void a(a aVar) {
        String str;
        aVar.getClass();
        switch (d.f36054c[aVar.ordinal()]) {
            case 1:
                str = "GHCError_ActiveCaloriesBurned";
                break;
            case 2:
                str = "GHCError_BodyFat";
                break;
            case 3:
                str = "GHCError_ActiveDistance";
                break;
            case 4:
                str = "GHCError_PassiveDistance";
                break;
            case 5:
                str = "GHCError_ElevationGained";
                break;
            case 6:
                str = "GHCError_Exercise";
                break;
            case 7:
                str = "GHCError_ExerciseSegment";
                break;
            case 8:
                str = "GHCError_CyclingPedalingCadence";
                break;
            case 9:
                str = "GHCError_FloorsClimbed";
                break;
            case 10:
                str = "GHCError_ActiveHeartRate";
                break;
            case 11:
                str = "GHCError_PassiveHeartRate";
                break;
            case 12:
                str = "GHCError_HeartRateSamples";
                break;
            case 13:
                str = "GHCError_RestingHeartRate";
                break;
            case 14:
                str = "GHCError_Sleep";
                break;
            case 15:
                str = "GHCError_SleepStage";
                break;
            case 16:
                str = "GHCError_Speed";
                break;
            case 17:
                str = "GHCError_SpeedSample";
                break;
            case 18:
                str = "GHCError_Steps";
                break;
            case 19:
                str = "GHCError_ActiveTotalCaloriesBurned";
                break;
            case 20:
                str = "GHCError_PassiveTotalCaloriesBurned";
                break;
            case 21:
                str = "GHCError_Weight";
                break;
            case 22:
                str = "GHCError_CreatingRecords";
                break;
            case 23:
                str = "GHCError_WritingToHealthConnect";
                break;
            case 24:
                str = "GHCError_DeletingActivity";
                break;
            case 25:
                str = "GHCError_DeletingWeight";
                break;
            case 26:
                str = "GHCError_EditingActivity";
                break;
            default:
                u0.r();
                return;
        }
        ht.a.f85464a.getClass();
        ht.a.a(null, str);
    }

    public static void b(EnumC0626b enumC0626b) {
        String str;
        enumC0626b.getClass();
        int i14 = d.f36053b[enumC0626b.ordinal()];
        if (i14 == 1) {
            str = "GHCInteraction_OptIn";
        } else if (i14 == 2) {
            str = "GHCInteraction_Settings";
        } else {
            if (i14 != 3) {
                u0.r();
                return;
            }
            str = "GHCInteraction_LearnMore";
        }
        ht.a.f85464a.getClass();
        ht.a.a(null, str);
    }
}
