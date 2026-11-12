package mt2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmt2/i;", "", "<init>", "(Ljava/lang/String;I)V", "workoutcommon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum i {
    NONE,
    CADENCE,
    SPEED,
    PACE,
    CUSTOM_HEART_RATE,
    HEART_RATE_ZONE,
    CUSTOM_POWER,
    POWER_ZONE,
    POWER_CURVE,
    INHALE,
    INHALE_HOLD,
    EXHALE,
    EXHALE_HOLD;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f121058a;

        static {
            int[] iArr = new int[i.values().length];
            try {
                iArr[i.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.CADENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i.SPEED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[i.PACE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[i.CUSTOM_HEART_RATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[i.HEART_RATE_ZONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[i.CUSTOM_POWER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[i.POWER_ZONE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[i.POWER_CURVE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[i.INHALE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[i.INHALE_HOLD.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[i.EXHALE_HOLD.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[i.EXHALE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f121058a = iArr;
        }
    }
}
