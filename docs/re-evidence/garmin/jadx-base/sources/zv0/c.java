package zv0;

import p005kotlin.Metadata;
import pv0.w;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzv0/c;", "", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f207167a = new c();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f207168a;

        static {
            int[] iArr = new int[w.values().length];
            try {
                iArr[w.ALCOHOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w.MORNING_CAFFEINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w.LATE_CAFFEINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[w.LIGHT_EXERCISE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[w.MODERATE_EXERCISE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[w.VIGOROUS_EXERCISE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[w.HEALTHY_MEALS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[w.HEAVY_MEALS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[w.LATE_MEALS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[w.COLD_SHOWERS_BATHS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[w.INTERMITTENT_FASTING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[w.JOURNALING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[w.SAUNA_STEAM_ROOM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[w.STRETCHING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[w.SUNLIGHT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[w.ACUPUNCTURE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[w.CHIROPRACTOR.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[w.COMPRESSION_THERAPY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[w.CUPPING.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[w.LIGHT_THERAPY.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[w.MASSAGE_THERAPY.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[w.PHYSICAL_THERAPY.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[w.CPAP_MACHINE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[w.EAR_PLUGS_HEADPHONES.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[w.EYE_MASK.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[w.HUMIDIFIER_USE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[w.NASAL_STRIPS.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[w.OVERSLEEPING.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[w.PET_IN_BEDROOM.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[w.READING_IN_BED.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[w.SCREENS_BEFORE_BED.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[w.SHARED_BED.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[w.SLEEP_SOUNDS.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[w.ALLERGY_SYMPTOMS.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[w.BREASTFEEDING.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[w.CAREGIVING.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[w.HIGH_ALTITUDE.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[w.ILLNESS.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[w.INFANT_AT_HOME.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[w.INJURED.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[w.MIGRAINES.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[w.PERIOD_DAY.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[w.TRAVELING_VACATION.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[w.LIGHT_EXERCISE_BEFORE_BED.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[w.MODERATE_EXERCISE_BEFORE_BED.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[w.VIGOROUS_EXERCISE_BEFORE_BED.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            f207168a = iArr;
        }
    }

    private c() {
    }
}
