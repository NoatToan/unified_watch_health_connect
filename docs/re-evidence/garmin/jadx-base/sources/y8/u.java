package y8;

import ch.qos.logback.core.CoreConstants;
import java.time.Instant;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\nB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ly8/u;", "", "Ljava/time/Instant;", "startTime", "endTime", "", "segmentType", "repetitions", "<init>", "(Ljava/time/Instant;Ljava/time/Instant;II)V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f194975e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set<Integer> f194976f = p13.u.m0(new Integer[]{10, 36, 0});

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Set<Integer> f194977g = p13.u.m0(new Integer[]{38, 39, 44, 54, 0});

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Set<Integer> f194978h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Set<Integer> f194979i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f194980j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f194981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f194982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f194983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f194984d;

    static {
        Set<Integer> setM0 = p13.u.m0(new Integer[]{1, 2, 3, 4, 5, 6, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 23, 25, 26, 28, 27, 29, 30, 31, 32, 33, 34, 35, 36, 37, 41, 42, 43, 48, 49, 50, 51, 63, 65});
        f194978h = setM0;
        Set<Integer> setM1 = p13.u.m0(new Integer[]{55, 56, 58, 57, 59, 61});
        f194979i = setM1;
        o13.p pVar = new o13.p(8, p13.a1.b(7));
        o13.p pVar2 = new o13.p(9, p13.a1.b(8));
        o13.p pVar3 = new o13.p(13, setM0);
        o13.p pVar4 = new o13.p(25, p13.a1.b(21));
        o13.p pVar5 = new o13.p(26, p13.u.m0(new Integer[]{67, 8, 40, 24}));
        o13.p pVar6 = new o13.p(34, setM0);
        o13.p pVar7 = new o13.p(37, p13.u.m0(new Integer[]{64, 66}));
        o13.p pVar8 = new o13.p(48, p13.a1.b(40));
        o13.p pVar9 = new o13.p(54, p13.a1.b(45));
        o13.p pVar10 = new o13.p(56, p13.u.m0(new Integer[]{46, 64}));
        o13.p pVar11 = new o13.p(57, p13.a1.b(47));
        o13.p pVar12 = new o13.p(70, setM0);
        o13.p pVar13 = new o13.p(68, p13.a1.b(52));
        o13.p pVar14 = new o13.p(69, p13.a1.b(53));
        q13.g gVar = new q13.g();
        gVar.add(60);
        Set<Integer> set = setM1;
        gVar.addAll(set);
        Unit unit = Unit.INSTANCE;
        o13.p pVar15 = new o13.p(73, p13.a1.a(gVar));
        q13.g gVar2 = new q13.g();
        gVar2.add(62);
        gVar2.addAll(set);
        f194980j = p13.u0.e(pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, pVar9, pVar10, pVar11, pVar12, pVar13, pVar14, pVar15, new o13.p(74, p13.a1.a(gVar2)), new o13.p(79, p13.a1.b(64)), new o13.p(82, p13.a1.b(66)), new o13.p(81, setM0), new o13.p(83, p13.a1.b(67)));
    }

    public u(Instant instant, Instant instant2, int i14, int i15) {
        instant.getClass();
        instant2.getClass();
        this.f194981a = instant;
        this.f194982b = instant2;
        this.f194983c = i14;
        this.f194984d = i15;
        if (!instant.isBefore(instant2)) {
            vb.h.s("startTime must be before endTime.");
            throw null;
        }
        if (i15 >= 0) {
            return;
        }
        vb.h.s("repetitions can not be negative.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return p005kotlin.jvm.internal.s.g(this.f194981a, uVar.f194981a) && p005kotlin.jvm.internal.s.g(this.f194982b, uVar.f194982b) && this.f194983c == uVar.f194983c && this.f194984d == uVar.f194984d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f194984d) + q2.d(this.f194983c, wr.g.k(this.f194982b, this.f194981a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ExerciseSegment(startTime=");
        sb3.append(this.f194981a);
        sb3.append(", endTime=");
        sb3.append(this.f194982b);
        sb3.append(", segmentType=");
        sb3.append(this.f194983c);
        sb3.append(", repetitions=");
        return ds.e0.j(sb3, this.f194984d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\bE\n\u0002\u0010$\n\u0002\u0010\"\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006R\u0014\u0010 \u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0006R\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0006R\u0014\u0010$\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0006R\u0014\u0010%\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0006R\u0014\u0010&\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0006R\u0014\u0010'\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0006R\u0014\u0010(\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0006R\u0014\u0010)\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0006R\u0014\u0010*\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0006R\u0014\u0010+\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u0006R\u0014\u0010,\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u0006R\u0014\u0010-\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\u0006R\u0014\u0010.\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u0006R\u0014\u0010/\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\u0006R\u0014\u00100\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\u0006R\u0014\u00101\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\u0006R\u0014\u00102\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\u0006R\u0014\u00103\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\u0006R\u0014\u00104\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\u0006R\u0014\u00105\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010\u0006R\u0014\u00106\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\u0006R\u0014\u00107\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010\u0006R\u0014\u00108\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u0010\u0006R\u0014\u00109\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010\u0006R\u0014\u0010:\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010\u0006R\u0014\u0010;\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010\u0006R\u0014\u0010<\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010\u0006R\u0014\u0010=\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010\u0006R\u0014\u0010>\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010\u0006R\u0014\u0010?\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b?\u0010\u0006R\u0014\u0010@\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b@\u0010\u0006R\u0014\u0010A\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bA\u0010\u0006R\u0014\u0010B\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bB\u0010\u0006R\u0014\u0010C\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bC\u0010\u0006R\u0014\u0010D\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bD\u0010\u0006R\u0014\u0010E\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bE\u0010\u0006R\u0014\u0010F\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bF\u0010\u0006R\u0014\u0010G\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bG\u0010\u0006R\u0014\u0010H\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bH\u0010\u0006R\u0014\u0010I\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bI\u0010\u0006R&\u0010L\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040K0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006N"}, d2 = {"Ly8/u$a;", "", "<init>", "()V", "", "EXERCISE_SEGMENT_TYPE_UNKNOWN", "I", "EXERCISE_SEGMENT_TYPE_ARM_CURL", "EXERCISE_SEGMENT_TYPE_BACK_EXTENSION", "EXERCISE_SEGMENT_TYPE_BALL_SLAM", "EXERCISE_SEGMENT_TYPE_BARBELL_SHOULDER_PRESS", "EXERCISE_SEGMENT_TYPE_BENCH_PRESS", "EXERCISE_SEGMENT_TYPE_BENCH_SIT_UP", "EXERCISE_SEGMENT_TYPE_BIKING", "EXERCISE_SEGMENT_TYPE_BIKING_STATIONARY", "EXERCISE_SEGMENT_TYPE_BURPEE", "EXERCISE_SEGMENT_TYPE_CRUNCH", "EXERCISE_SEGMENT_TYPE_DEADLIFT", "EXERCISE_SEGMENT_TYPE_DOUBLE_ARM_TRICEPS_EXTENSION", "EXERCISE_SEGMENT_TYPE_DUMBBELL_CURL_LEFT_ARM", "EXERCISE_SEGMENT_TYPE_DUMBBELL_CURL_RIGHT_ARM", "EXERCISE_SEGMENT_TYPE_DUMBBELL_FRONT_RAISE", "EXERCISE_SEGMENT_TYPE_DUMBBELL_LATERAL_RAISE", "EXERCISE_SEGMENT_TYPE_DUMBBELL_ROW", "EXERCISE_SEGMENT_TYPE_DUMBBELL_TRICEPS_EXTENSION_LEFT_ARM", "EXERCISE_SEGMENT_TYPE_DUMBBELL_TRICEPS_EXTENSION_RIGHT_ARM", "EXERCISE_SEGMENT_TYPE_DUMBBELL_TRICEPS_EXTENSION_TWO_ARM", "EXERCISE_SEGMENT_TYPE_ELLIPTICAL", "EXERCISE_SEGMENT_TYPE_FORWARD_TWIST", "EXERCISE_SEGMENT_TYPE_FRONT_RAISE", "EXERCISE_SEGMENT_TYPE_HIGH_INTENSITY_INTERVAL_TRAINING", "EXERCISE_SEGMENT_TYPE_HIP_THRUST", "EXERCISE_SEGMENT_TYPE_HULA_HOOP", "EXERCISE_SEGMENT_TYPE_JUMPING_JACK", "EXERCISE_SEGMENT_TYPE_JUMP_ROPE", "EXERCISE_SEGMENT_TYPE_KETTLEBELL_SWING", "EXERCISE_SEGMENT_TYPE_LATERAL_RAISE", "EXERCISE_SEGMENT_TYPE_LAT_PULL_DOWN", "EXERCISE_SEGMENT_TYPE_LEG_CURL", "EXERCISE_SEGMENT_TYPE_LEG_EXTENSION", "EXERCISE_SEGMENT_TYPE_LEG_PRESS", "EXERCISE_SEGMENT_TYPE_LEG_RAISE", "EXERCISE_SEGMENT_TYPE_LUNGE", "EXERCISE_SEGMENT_TYPE_MOUNTAIN_CLIMBER", "EXERCISE_SEGMENT_TYPE_OTHER_WORKOUT", "EXERCISE_SEGMENT_TYPE_PAUSE", "EXERCISE_SEGMENT_TYPE_PILATES", "EXERCISE_SEGMENT_TYPE_PLANK", "EXERCISE_SEGMENT_TYPE_PULL_UP", "EXERCISE_SEGMENT_TYPE_PUNCH", "EXERCISE_SEGMENT_TYPE_REST", "EXERCISE_SEGMENT_TYPE_ROWING_MACHINE", "EXERCISE_SEGMENT_TYPE_RUNNING", "EXERCISE_SEGMENT_TYPE_RUNNING_TREADMILL", "EXERCISE_SEGMENT_TYPE_SHOULDER_PRESS", "EXERCISE_SEGMENT_TYPE_SINGLE_ARM_TRICEPS_EXTENSION", "EXERCISE_SEGMENT_TYPE_SIT_UP", "EXERCISE_SEGMENT_TYPE_SQUAT", "EXERCISE_SEGMENT_TYPE_STAIR_CLIMBING", "EXERCISE_SEGMENT_TYPE_STAIR_CLIMBING_MACHINE", "EXERCISE_SEGMENT_TYPE_STRETCHING", "EXERCISE_SEGMENT_TYPE_SWIMMING_BACKSTROKE", "EXERCISE_SEGMENT_TYPE_SWIMMING_BREASTSTROKE", "EXERCISE_SEGMENT_TYPE_SWIMMING_BUTTERFLY", "EXERCISE_SEGMENT_TYPE_SWIMMING_FREESTYLE", "EXERCISE_SEGMENT_TYPE_SWIMMING_MIXED", "EXERCISE_SEGMENT_TYPE_SWIMMING_OPEN_WATER", "EXERCISE_SEGMENT_TYPE_SWIMMING_OTHER", "EXERCISE_SEGMENT_TYPE_SWIMMING_POOL", "EXERCISE_SEGMENT_TYPE_UPPER_TWIST", "EXERCISE_SEGMENT_TYPE_WALKING", "EXERCISE_SEGMENT_TYPE_WEIGHTLIFTING", "EXERCISE_SEGMENT_TYPE_WHEELCHAIR", "EXERCISE_SEGMENT_TYPE_YOGA", "", "", "SESSION_TO_SEGMENTS_MAPPING", "Ljava/util/Map;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ u(Instant instant, Instant instant2, int i14, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        this(instant, instant2, i14, (i16 & 8) != 0 ? 0 : i15);
    }
}
