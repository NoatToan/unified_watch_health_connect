package zv0;

import com.garmin.android.apps.connectmobile.R;
import lc.u0;
import p005kotlin.Metadata;
import pv0.k;
import pv0.p;
import pv0.w;
import pv0.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzv0/a;", "", "<init>", "()V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f207158a = new a();

    /* JADX INFO: renamed from: zv0.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C3863a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f207159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f207160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f207161c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f207162d;

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
            f207159a = iArr;
            int[] iArr2 = new int[pv0.b.values().length];
            try {
                iArr2[pv0.b.LIFESTYLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr2[pv0.b.SELF_CARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr2[pv0.b.TREATMENTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr2[pv0.b.SLEEP_RELATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr2[pv0.b.LIFE_STATUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr2[pv0.b.CUSTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr2[pv0.b.CUSTOM_SLEEP_RELATED.ordinal()] = 7;
            } catch (NoSuchFieldError unused53) {
            }
            f207160b = iArr2;
            int[] iArr3 = new int[k.values().length];
            try {
                iArr3[k.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr3[k.QUANTITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused55) {
            }
            f207161c = iArr3;
            int[] iArr4 = new int[p.values().length];
            try {
                iArr4[p.DAYTIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr4[p.SLEEP_RELATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused57) {
            }
            f207162d = iArr4;
        }
    }

    private a() {
    }

    public static String a(pv0.b bVar, l22.a aVar) {
        bVar.getClass();
        switch (C3863a.f207160b[bVar.ordinal()]) {
            case 1:
                return aVar.getString(R.string.lbl_lifestyle);
            case 2:
                return aVar.getString(R.string.lbl_self_care);
            case 3:
                return aVar.getString(R.string.lbl_treatments);
            case 4:
                return aVar.getString(R.string.lbl_sleep_related);
            case 5:
                return aVar.getString(R.string.lbl_life_status);
            case 6:
            case 7:
                return aVar.getString(R.string.lbl_custom);
            default:
                u0.r();
                return null;
        }
    }

    public static String b(w wVar, l22.b bVar) {
        wVar.getClass();
        switch (C3863a.f207159a[wVar.ordinal()]) {
            case 1:
                return bVar.getString(R.string.lbl_alcohol);
            case 2:
                return bVar.getString(R.string.lbl_morning_caffeine);
            case 3:
                return bVar.getString(R.string.lbl_late_caffeine);
            case 4:
                return bVar.getString(R.string.lbl_light_exercise);
            case 5:
                return bVar.getString(R.string.lbl_moderate_exercise);
            case 6:
                return bVar.getString(R.string.lbl_vigorous_exercise);
            case 7:
                return bVar.getString(R.string.lbl_healthy_meals);
            case 8:
                return bVar.getString(R.string.lbl_heavy_meals);
            case 9:
                return bVar.getString(R.string.lbl_late_meals);
            case 10:
                return bVar.getString(R.string.lbl_cold_showers_baths);
            case 11:
                return bVar.getString(R.string.lbl_intermittent_fasting);
            case 12:
                return bVar.getString(R.string.lbl_journaling);
            case 13:
                return bVar.getString(R.string.lbl_sauna_steam_room);
            case 14:
                return bVar.getString(R.string.lbl_stretching);
            case 15:
                return bVar.getString(R.string.lbl_sunlight);
            case 16:
                return bVar.getString(R.string.lbl_acupuncture);
            case 17:
                return bVar.getString(R.string.lbl_chiropractor);
            case 18:
                return bVar.getString(R.string.lbl_compression_therapy);
            case 19:
                return bVar.getString(R.string.lbl_cupping);
            case 20:
                return bVar.getString(R.string.lbl_light_therapy);
            case 21:
                return bVar.getString(R.string.lbl_massage_therapy);
            case 22:
                return bVar.getString(R.string.lbl_physical_therapy);
            case 23:
                return bVar.getString(R.string.lbl_cpap_machine);
            case 24:
                return bVar.getString(R.string.lbl_ear_plugs_headphones);
            case 25:
                return bVar.getString(R.string.lbl_eye_mask);
            case 26:
                return bVar.getString(R.string.lbl_humidifier_use);
            case 27:
                return bVar.getString(R.string.lbl_nasal_strips);
            case 28:
                return bVar.getString(R.string.lbl_oversleeping);
            case 29:
                return bVar.getString(R.string.lbl_pet_in_bedroom);
            case 30:
                return bVar.getString(R.string.lbl_reading_in_bed);
            case 31:
                return bVar.getString(R.string.lbl_screens_before_bed);
            case 32:
                return bVar.getString(R.string.lbl_shared_bed);
            case 33:
                return bVar.getString(R.string.lbl_sleep_sounds);
            case 34:
                return bVar.getString(R.string.lbl_allergy_symptoms);
            case 35:
                return bVar.getString(R.string.lbl_breastfeeding);
            case 36:
                return bVar.getString(R.string.lbl_caregiving);
            case 37:
                return bVar.getString(R.string.lbl_high_altitude);
            case 38:
                return bVar.getString(R.string.title_illness);
            case 39:
                return bVar.getString(R.string.lbl_infant_at_home);
            case 40:
                return bVar.getString(R.string.lbl_injured);
            case 41:
                return bVar.getString(R.string.lbl_migraines);
            case 42:
                return bVar.getString(R.string.mct_period_day);
            case 43:
                return bVar.getString(R.string.lbl_traveling_vacation);
            case 44:
                return bVar.getString(R.string.lbl_light_exercise_before_bed);
            case 45:
                return bVar.getString(R.string.lbl_moderate_exercise_before_bed);
            case 46:
                return bVar.getString(R.string.lbl_vigorous_exercise_before_bed);
            default:
                u0.r();
                return null;
        }
    }

    public static String c(y yVar, l22.b bVar) {
        yVar.getClass();
        if (yVar == y.b.COFFEE) {
            return bVar.getString(R.string.lbl_coffee);
        }
        if (yVar == y.b.TEA) {
            return bVar.getString(R.string.lbl_tea);
        }
        if (yVar == y.b.SODA) {
            return bVar.getString(R.string.lbl_soda);
        }
        if (yVar == y.b.ENERGY_DRINK) {
            return bVar.getString(R.string.lbl_energy);
        }
        if (yVar == y.a.BEER) {
            return bVar.getString(R.string.lbl_beer);
        }
        if (yVar == y.a.WINE) {
            return bVar.getString(R.string.lbl_wine);
        }
        if (yVar == y.a.SPIRIT) {
            return bVar.getString(R.string.lbl_spirit);
        }
        if (yVar != y.a.OTHER && yVar != y.b.OTHER) {
            u0.r();
            return null;
        }
        return bVar.getString(R.string.lbl_other);
    }
}
