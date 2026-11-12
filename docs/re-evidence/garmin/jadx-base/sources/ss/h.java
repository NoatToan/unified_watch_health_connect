package ss;

import p005kotlin.Metadata;
import qs.o;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lss/h;", "", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f160604a = new h();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f160605a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.ROWER_FITNESS_EQUIPMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.CROSS_TRAINER_FITNESS_EQUIPMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.TREADMILL_FITNESS_EQUIPMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o.INDOOR_BIKE_FITNESS_EQUIPMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[o.STAIR_CLIMBER_FITNESS_EQUIPMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[o.STEP_CLIMBER_FITNESS_EQUIPMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f160605a = iArr;
        }
    }

    private h() {
    }
}
