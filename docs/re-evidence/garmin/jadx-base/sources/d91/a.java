package d91;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Ld91/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", JWKParameterNames.RSA_EXPONENT, "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", JWKParameterNames.OCT_KEY_VALUE, "l", "m", JWKParameterNames.RSA_MODULUS, "o", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum a {
    INTENSITY_MINUTES,
    ACUTE_LOAD,
    STRESS,
    BODY_BATTERY,
    TRAINING_STATUS,
    HRV_STATUS,
    HEALTH_STATUS,
    STEPS,
    ACTIVITIES,
    WEIGHT_EDIT,
    SLEEP_NEED,
    SLEEP_SCORE,
    LOAD_FOCUS,
    PUSHES,
    FLOORS;

    /* JADX INFO: renamed from: d91.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1249a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f58496a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.INTENSITY_MINUTES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.ACUTE_LOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.STRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.BODY_BATTERY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.TRAINING_STATUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.HRV_STATUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[a.HEALTH_STATUS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[a.STEPS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[a.ACTIVITIES.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[a.WEIGHT_EDIT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[a.SLEEP_NEED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[a.SLEEP_SCORE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[a.LOAD_FOCUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[a.PUSHES.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[a.FLOORS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            f58496a = iArr;
        }
    }

    public final String a() {
        switch (C1249a.f58496a[ordinal()]) {
            case 1:
                return "intensity-minutes";
            case 2:
                return "report/-1/all/current/acuteload";
            case 3:
                return "stress";
            case 4:
                return "body-battery";
            case 5:
                return "report/-1/all";
            case 6:
                return "hrv-status";
            case 7:
                return "health-status";
            case 8:
                return "steps";
            case 9:
            default:
                return "";
            case 10:
                return "weight";
            case 11:
            case 12:
                return "sleep";
            case 13:
                return "report/-1/all/current/loadfocus";
            case 14:
                return "pushes";
            case 15:
                return "floors";
        }
    }
}
