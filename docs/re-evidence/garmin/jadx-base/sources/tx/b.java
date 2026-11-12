package tx;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltx/b;", "", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f166807a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f166808a;

        static {
            int[] iArr = new int[cx.b.values().length];
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_BODY_BATTERY_RECHARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_RESTFUL_PERIOD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_LONG_RESTFUL_PERIOD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_STRESSFUL_PERIOD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_NEED_A_LITTLE_BREAK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_TRY_TO_RELAX.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_RESTFUL_NAP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_NAP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_MAINTAINING_AEROBIC.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_EASY_AEROBIC_BASE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_MAINTAINING_AEROBIC_BASE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_IMPROVING_AEROBIC_BASE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_IMPROVING_AEROBIC_ENDURANCE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_HIGHLY_IMPROVING_AEROBIC_ENDURANCE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_IMPROVING_VO2MAX.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_HIGHLY_IMPROVING_VO2MAX.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_EASY_AEROBIC.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_EASY_RECOVERY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_NO_AEROBIC_EFFECT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_MAINTAINING_VO2MAX.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_MAINTAINING_LACTATE_THRESHOLD.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_MAINTAINING_TEMPO.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_IMPROVING_AEROBIC.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_HIGHLY_IMPROVING_AEROBIC.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_IMPROVING_LACTATE_THRESHOLD.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_HIGHLY_IMPROVING_LACTATE_THRESHOLD.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_IMPROVING_TEMPO.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_HIGHLY_IMPROVING_TEMPO.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_EASY_SPEED.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_MAINTAINING_SPEED.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_VERY_EASY_SPEED.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_IMPROVING_ANAEROBIC_CAPACITY_AND_SPEED.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_HIGHLY_IMPROVING_ANAEROBIC_CAPACITY_AND_SPEED.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_MAINTAINING_ANAEROBIC_FITNESS.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_IMPROVING_ANAEROBIC_FITNESS.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_HIGHLY_IMPROVING_ANAEROBIC_FITNESS.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_MAINTAINING_ANAEROBIC_POWER.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_IMPROVING_ANAEROBIC_POWER_AND_CAPACITY.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_MAINTAINING_ANAEROBIC_BASE_AND_ECONOMY.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_IMPROVING_ANAEROBIC_BASE_AND_ECONOMY.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_HIGHLY_IMPROVING_ANAEROBIC_BASE_AND_ECONOMY.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_MINOR_ANAEROBIC_EFFECT.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_OVERREACHING_AEROBIC.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_OVERREACHING_AEROBIC_ENDURANCE.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_OVERREACHING_LACTATE_THRESHOLD.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_OVERREACHING_VO2MAX.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_OVERREACHING_TEMPO.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_OVERREACHING.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[cx.b.ETE_BODY_BATTERY_EVENT_SHORT_OVERREACHING_SPEED.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            f166808a = iArr;
        }
    }

    public b(l22.b bVar) {
        bVar.getClass();
        this.f166807a = bVar;
    }
}
