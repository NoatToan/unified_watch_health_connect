package mt2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmt2/l;", "", "<init>", "(Ljava/lang/String;I)V", "workoutcommon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum l {
    WARM_UP,
    COOL_DOWN,
    INTERVAL,
    RECOVERY,
    REST,
    OTHER;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f121080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f121081b;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.CYCLING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.SWIMMING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k.STRENGTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[k.CARDIO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[k.PILATES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[k.HIIT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[k.MOBILITY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[k.YOGA.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[k.OTHER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f121080a = iArr;
            int[] iArr2 = new int[l.values().length];
            try {
                iArr2[l.INTERVAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[l.WARM_UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[l.COOL_DOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[l.RECOVERY.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[l.REST.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[l.OTHER.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            f121081b = iArr2;
        }
    }
}
