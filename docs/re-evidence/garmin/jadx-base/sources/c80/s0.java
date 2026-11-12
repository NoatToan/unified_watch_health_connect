package c80;

import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.common.Scopes;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v25 c80.s0[], still in use, count: 1, list:
  (r0v25 c80.s0[]) from 0x0179: CONSTRUCTOR (r0v25 c80.s0[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lc80/s0;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s0 {
    HOME("home"),
    LEADERBOARD("leaderboard"),
    FIND_A_WORKOUT("findAWorkout"),
    ACTIVITY_REPORTS("activityReport"),
    ACTIVITY_DETAILS("activityDetails"),
    TRAIL_DETAILS("trailDetails"),
    HIDDEN("hidden"),
    PROFILE_FRAME_LIST("profileFrameList"),
    GARMIN_COACH_PLAN("garminCoachPlan"),
    LIVE_TRACK_MAIN("liveTrackMain"),
    WHATS_NEW("whatsNew"),
    PROFILE(Scopes.PROFILE),
    SLEEP("sleep"),
    HYDRATION("hydration"),
    WEIGHT("weight"),
    CALORIES_BURNED("caloriesBurned"),
    NUTRITION("nutritionTracking"),
    MCT_GENESIS("mctGenesis"),
    MCT_REPORT("mctReport"),
    NEWS_FEED("newsfeed"),
    FIND_PLAN("findPlan"),
    HOME_MAINTENANCE("homeMaintenance"),
    TRAINING_STATUS("trainingStatus"),
    TRAINING_READINESS("trainingReadiness"),
    VO2_MAX("vo2Max");

    public static final /* synthetic */ w13.c E;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f25561b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25584a;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25585a;

        static {
            int[] iArr = new int[s0.values().length];
            try {
                iArr[s0.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s0.LEADERBOARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s0.FIND_A_WORKOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s0.ACTIVITY_REPORTS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[s0.ACTIVITY_DETAILS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[s0.TRAIL_DETAILS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[s0.HIDDEN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[s0.PROFILE_FRAME_LIST.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[s0.GARMIN_COACH_PLAN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[s0.LIVE_TRACK_MAIN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[s0.WHATS_NEW.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[s0.PROFILE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[s0.SLEEP.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[s0.HYDRATION.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[s0.WEIGHT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[s0.CALORIES_BURNED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[s0.NUTRITION.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[s0.MCT_GENESIS.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[s0.MCT_REPORT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[s0.NEWS_FEED.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[s0.FIND_PLAN.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[s0.HOME_MAINTENANCE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[s0.TRAINING_STATUS.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[s0.TRAINING_READINESS.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[s0.VO2_MAX.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            f25585a = iArr;
        }
    }

    static {
        E = new w13.c(new s0[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1});
    }

    private s0(String str) {
        super(str, i);
        this.f25584a = str;
    }

    public static s0 valueOf(String str) {
        return (s0) Enum.valueOf(s0.class, str);
    }

    public static s0[] values() {
        return (s0[]) D.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc80/s0$a;", "", "<init>", "()V", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
