package mt2;

import lc.u0;
import o73.u;
import o73.v;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmt2/c;", "", "<init>", "(Ljava/lang/String;I)V", "workoutcommon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum c {
    LAP_BUTTON,
    TIME,
    DISTANCE,
    CALORIES,
    POWER,
    HEART_RATE,
    FIXED_REST,
    FIXED_REPETITION,
    REPS,
    INVALID;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f121008a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.LAP_BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.DISTANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.CALORIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.POWER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c.HEART_RATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[c.FIXED_REST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[c.FIXED_REPETITION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[c.REPS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[c.INVALID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f121008a = iArr;
        }
    }

    public final Object a(boolean z14, ot2.g gVar) {
        u uVar;
        switch (a.f121008a[ordinal()]) {
            case 1:
                if (z14) {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    uVar = (u) kt2.e.N.getValue();
                } else {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    uVar = (u) kt2.e.f106476f0.getValue();
                }
                return v.a(uVar, gVar);
            case 2:
                kt2.f.f106534a.getClass();
                kt2.e.f106460a.getClass();
                return v.a((u) kt2.e.I0.getValue(), gVar);
            case 3:
                kt2.f.f106534a.getClass();
                kt2.e.f106460a.getClass();
                return v.a((u) kt2.e.V.getValue(), gVar);
            case 4:
                kt2.f.f106534a.getClass();
                kt2.e.f106460a.getClass();
                return v.a((u) kt2.e.T.getValue(), gVar);
            case 5:
                kt2.f.f106534a.getClass();
                kt2.e.f106460a.getClass();
                return v.a((u) kt2.e.f106466c.getValue(), gVar);
            case 6:
                kt2.f.f106534a.getClass();
                kt2.e.f106460a.getClass();
                return v.a((u) kt2.e.S0.getValue(), gVar);
            case 7:
                kt2.f.f106534a.getClass();
                kt2.e.f106460a.getClass();
                return v.a((u) kt2.e.f106498m1.getValue(), gVar);
            case 8:
                kt2.f.f106534a.getClass();
                kt2.e.f106460a.getClass();
                return v.a((u) kt2.e.f106495l1.getValue(), gVar);
            case 9:
                kt2.f.f106534a.getClass();
                kt2.e.f106460a.getClass();
                return v.a((u) kt2.e.T0.getValue(), gVar);
            case 10:
                kt2.f.f106534a.getClass();
                kt2.e.f106460a.getClass();
                return v.a((u) kt2.e.f106494l0.getValue(), gVar);
            default:
                u0.r();
                return null;
        }
    }
}
