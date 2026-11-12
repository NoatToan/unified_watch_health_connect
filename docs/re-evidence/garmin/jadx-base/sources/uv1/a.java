package uv1;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.x;
import vt1.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Luv1/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum a {
    PERSONAL_RECORDS,
    VO2_MAX,
    LACTATE_THRESHOLD_PACE,
    LACTATE_THRESHOLD_HR,
    FASTEST_AVERAGE_PACE,
    HIGHEST_AVERAGE_POWER,
    HIGHEST_CALORIES_BURN,
    HIGHEST_VIGOROUS_MINUTES,
    CRITICAL_SWIM_SPEED,
    FUNCTIONAL_THRESHOLD_POWER,
    LONGEST_SWIM_IN_PLAN,
    LONGEST_RIDE_IN_PLAN,
    LONGEST_RUN_IN_PLAN,
    FITNESS_AGE,
    FURTHEST_WALKED_IN_A_DAY,
    LONGEST_STEP_GOAL_STREAK,
    MOST_STEPS_IN_A_DAY;


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3232a f172912a = new C3232a(null);

    /* JADX INFO: renamed from: uv1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luv1/a$a;", "", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3232a {

        /* JADX INFO: renamed from: uv1.a$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3233a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f172931a;

            static {
                int[] iArr = new int[o.values().length];
                try {
                    iArr[o.f180180k.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[o.f180179j.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[o.f180176g.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[o.f180175f.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[o.f180178i.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f172931a = iArr;
            }
        }

        public /* synthetic */ C3232a(j jVar) {
            this();
        }

        public static List a(o oVar) {
            oVar.getClass();
            int i14 = C3233a.f172931a[oVar.ordinal()];
            if (i14 == 1) {
                return x.k(a.FURTHEST_WALKED_IN_A_DAY, a.LONGEST_STEP_GOAL_STREAK, a.MOST_STEPS_IN_A_DAY, a.FITNESS_AGE);
            }
            if (i14 == 2) {
                return x.k(a.FITNESS_AGE, a.HIGHEST_VIGOROUS_MINUTES, a.HIGHEST_CALORIES_BURN);
            }
            if (i14 == 3) {
                return x.k(a.PERSONAL_RECORDS, a.FUNCTIONAL_THRESHOLD_POWER, a.VO2_MAX, a.HIGHEST_AVERAGE_POWER, a.LONGEST_RIDE_IN_PLAN);
            }
            if (i14 == 4) {
                return x.k(a.PERSONAL_RECORDS, a.LACTATE_THRESHOLD_PACE, a.LACTATE_THRESHOLD_HR, a.VO2_MAX, a.FASTEST_AVERAGE_PACE, a.LONGEST_RUN_IN_PLAN);
            }
            if (i14 != 5) {
                return null;
            }
            return x.k(a.PERSONAL_RECORDS, a.CRITICAL_SWIM_SPEED, a.FUNCTIONAL_THRESHOLD_POWER, a.LACTATE_THRESHOLD_PACE, a.LONGEST_SWIM_IN_PLAN, a.LONGEST_RIDE_IN_PLAN, a.LONGEST_RUN_IN_PLAN);
        }

        private C3232a() {
        }
    }
}
