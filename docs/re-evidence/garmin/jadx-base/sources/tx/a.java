package tx;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltx/a;", "", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f166805a;

    /* JADX INFO: renamed from: tx.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C3138a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f166806a;

        static {
            int[] iArr = new int[cx.a.values().length];
            try {
                iArr[cx.a.ETE_BODY_BATTERY_EVENT_RECOVERY_SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[cx.a.ETE_BODY_BATTERY_EVENT_RECOVERY_BB_INCREASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[cx.a.ETE_BODY_BATTERY_EVENT_RECOVERY_BB_NOT_INCREASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[cx.a.ETE_BODY_BATTERY_EVENT_RECOVERY_LONG_BB_INCREASE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[cx.a.ETE_BODY_BATTERY_EVENT_RECOVERY_LONG_BB_NOT_INCREASE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[cx.a.ETE_BODY_BATTERY_EVENT_RECOVERY_EVENING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[cx.a.ETE_BODY_BATTERY_EVENT_STRESS_WARNING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[cx.a.ETE_BODY_BATTERY_EVENT_STRESS_LONG_CONTINUES_WARNING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[cx.a.ETE_BODY_BATTERY_EVENT_STRESS_EVENING_WARNING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[cx.a.ETE_BODY_BATTERY_EVENT_STRESS_LONG_EVENING_CONTINUES_WARNING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[cx.a.ETE_BODY_BATTERY_EVENT_STRESS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[cx.a.ETE_BODY_BATTERY_EVENT_STRESS_LONG.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[cx.a.ETE_BODY_BATTERY_EVENT_STRESS_EVENING.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[cx.a.ETE_BODY_BATTERY_EVENT_STRESS_LONG_EVENING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[cx.a.ETE_BODY_BATTERY_EVENT_NAP_RECOVERING_BB_INCREASE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[cx.a.ETE_BODY_BATTERY_EVENT_NAP_RECOVERING_BB_MAINTAIN.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[cx.a.ETE_BODY_BATTERY_EVENT_NAP_RECOVERING_BB_DECREASE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[cx.a.ETE_BODY_BATTERY_EVENT_NAP_NOT_RECOVERING_BB_INCREASE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[cx.a.ETE_BODY_BATTERY_EVENT_NAP_NOT_RECOVERING_BB_MAINTAIN.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[cx.a.ETE_BODY_BATTERY_EVENT_NAP_NOT_RECOVERING_BB_DECREASE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[cx.a.ETE_BODY_BATTERY_EVENT_EXERCISE_TE5.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[cx.a.ETE_BODY_BATTERY_EVENT_EXERCISE_TE5_LATE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[cx.a.ETE_BODY_BATTERY_EVENT_EXERCISE_TE5_GOOD_TIMING.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[cx.a.ETE_BODY_BATTERY_EVENT_EXERCISE_TE4.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[cx.a.ETE_BODY_BATTERY_EVENT_EXERCISE_TE4_LATE.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[cx.a.ETE_BODY_BATTERY_EVENT_EXERCISE_TE4_GOOD_TIMING.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[cx.a.ETE_BODY_BATTERY_EVENT_EXERCISE_TE3.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[cx.a.ETE_BODY_BATTERY_EVENT_EXERCISE_TE2.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[cx.a.ETE_BODY_BATTERY_EVENT_EXERCISE_TE_BELOW_2.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            f166806a = iArr;
        }
    }

    public a(l22.b bVar) {
        bVar.getClass();
        this.f166805a = bVar;
    }
}
