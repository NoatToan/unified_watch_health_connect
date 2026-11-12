package rf2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v52 rf2.a[], still in use, count: 1, list:
  (r0v52 rf2.a[]) from 0x03cb: CONSTRUCTOR (r0v52 rf2.a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lrf2/a;", "", "", TtmlNode.ATTR_ID, "<init>", "(Ljava/lang/String;II)V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {
    CALORIES(0),
    CADENCE(3),
    CADENCE_AVG(4),
    DISTANCE(6),
    DISTANCE_LAP(7),
    ELEVATION(9),
    HEART_RATE(13),
    HEART_RATE_AVG(14),
    HEART_RATE_LAP(15),
    /* JADX INFO: Fake field, exist only in values array */
    HEART_RATE_PERCENT_MAX(16),
    HEART_RATE_ZONE_NUMBER(22),
    LAPS(24),
    PACE(33),
    PACE_AVG(34),
    PACE_LAP(35),
    POWER(36),
    POWER_AVG(37),
    POWER_LAP(39),
    POWER_ZONE(43),
    STEPS(45),
    SPEED(48),
    SPEED_AVG(49),
    TIME_ELAPSED(55),
    TIME(56),
    TIME_LAP(58),
    TOTAL_ASCENT(60),
    TOTAL_DESCENT(61),
    WORKOUT_CALS_TO_GO(64),
    WORKOUT_DIST_TO_GO(65),
    WORKOUT_REPS_TO_GO(67),
    WORKOUT_TIME_TO_GO(68),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_TO_DEPLETION(109),
    STROKES(126),
    DISTANCE_SET(130),
    STROKE_RATE_AVG(132),
    ESTIMATED_FINISH_TIME(196),
    DISTANCE_REMAINING(197),
    STROKE_RATE(MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR),
    ACTIVE_CALORIES(245),
    WORKOUT_INTERVAL_TIMER(303),
    /* JADX INFO: Fake field, exist only in values array */
    WORKOUT_INTERVAL_POWER_AVG(304),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_TO_DEPLETION(305),
    /* JADX INFO: Fake field, exist only in values array */
    WORKOUT_INTERVAL_POWER_AVG(306),
    WORKOUT_SET_COUNT(434),
    WORKOUT_SET_REPS(435),
    FLOORS_CLIMBED(449),
    FLOOR_CLIMB_RATE(451),
    BREATHING_RATE(452),
    STRESS(499),
    TIME_ACTIVE(503),
    WORKOUT_CURRENT_REPEAT_TIME_TO_GO(513),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_TO_DEPLETION(519),
    MAX_STRESS(567),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_TO_DEPLETION(583),
    GRADE_ADJUSTED_PACE(656),
    JUMP_ROPE_NUM_COUNT(702),
    JUMP_ROPE_NUM_ROUNDS(703),
    JUMP_ROPE_NUM_LAST_ROUND_COUNT(704),
    JUMP_ROPE_AVG_SPEED(705),
    JUMP_ROPE_ACTIVE_TIME(706),
    STRESS_AVG(966);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2866a f152429b = new C2866a(null);

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final /* synthetic */ w13.c f152430b1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f152454a;

    static {
        f152430b1 = new w13.c(new a[]{r1, r2, r3, r0, r5, r6, r4, r7, r9, r8, r10, r13, r13, r14, r15, r0, r1, r0, r2, r1, r0, r2, r1, r2, r0, r2, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1});
    }

    private a(int i14) {
        super(str, i);
        this.f152454a = i14;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f152428a1.clone();
    }

    /* JADX INFO: renamed from: rf2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrf2/a$a;", "", "<init>", "()V", "", "ERROR_METRIC_NUMBER", "F", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2866a {
        public /* synthetic */ C2866a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2866a() {
        }
    }
}
