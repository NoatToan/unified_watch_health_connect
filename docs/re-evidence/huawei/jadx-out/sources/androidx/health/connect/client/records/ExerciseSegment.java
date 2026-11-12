package androidx.health.connect.client.records;

import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.yyu;
import defpackage.yyz;
import defpackage.yzc;
import defpackage.zae;
import defpackage.zaj;
import defpackage.zcm;
import defpackage.zcp;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.time.Instant;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\u0015\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0018J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u0006¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001c"}, d2 = {"Landroidx/health/connect/client/records/ExerciseSegment;", "", "startTime", "Ljava/time/Instant;", "endTime", "segmentType", "", "repetitions", "<init>", "(Ljava/time/Instant;Ljava/time/Instant;II)V", "getStartTime", "()Ljava/time/Instant;", "getEndTime", "getSegmentType$annotations", "()V", "getSegmentType", "()I", "getRepetitions", "equals", "", "other", WatchFaceConstant.HASHCODE, "isCompatibleWith", "sessionType", "isCompatibleWith$connect_client_release", "toString", "", "Companion", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExerciseSegment {
    private static final Set<Integer> EXERCISE_SEGMENTS;
    public static final int EXERCISE_SEGMENT_TYPE_ARM_CURL = 1;
    public static final int EXERCISE_SEGMENT_TYPE_BACK_EXTENSION = 2;
    public static final int EXERCISE_SEGMENT_TYPE_BALL_SLAM = 3;
    public static final int EXERCISE_SEGMENT_TYPE_BARBELL_SHOULDER_PRESS = 4;
    public static final int EXERCISE_SEGMENT_TYPE_BENCH_PRESS = 5;
    public static final int EXERCISE_SEGMENT_TYPE_BENCH_SIT_UP = 6;
    public static final int EXERCISE_SEGMENT_TYPE_BIKING = 7;
    public static final int EXERCISE_SEGMENT_TYPE_BIKING_STATIONARY = 8;
    public static final int EXERCISE_SEGMENT_TYPE_BURPEE = 9;
    public static final int EXERCISE_SEGMENT_TYPE_CRUNCH = 10;
    public static final int EXERCISE_SEGMENT_TYPE_DEADLIFT = 11;
    public static final int EXERCISE_SEGMENT_TYPE_DOUBLE_ARM_TRICEPS_EXTENSION = 12;
    public static final int EXERCISE_SEGMENT_TYPE_DUMBBELL_CURL_LEFT_ARM = 13;
    public static final int EXERCISE_SEGMENT_TYPE_DUMBBELL_CURL_RIGHT_ARM = 14;
    public static final int EXERCISE_SEGMENT_TYPE_DUMBBELL_FRONT_RAISE = 15;
    public static final int EXERCISE_SEGMENT_TYPE_DUMBBELL_LATERAL_RAISE = 16;
    public static final int EXERCISE_SEGMENT_TYPE_DUMBBELL_ROW = 17;
    public static final int EXERCISE_SEGMENT_TYPE_DUMBBELL_TRICEPS_EXTENSION_LEFT_ARM = 18;
    public static final int EXERCISE_SEGMENT_TYPE_DUMBBELL_TRICEPS_EXTENSION_RIGHT_ARM = 19;
    public static final int EXERCISE_SEGMENT_TYPE_DUMBBELL_TRICEPS_EXTENSION_TWO_ARM = 20;
    public static final int EXERCISE_SEGMENT_TYPE_ELLIPTICAL = 21;
    public static final int EXERCISE_SEGMENT_TYPE_FORWARD_TWIST = 22;
    public static final int EXERCISE_SEGMENT_TYPE_FRONT_RAISE = 23;
    public static final int EXERCISE_SEGMENT_TYPE_HIGH_INTENSITY_INTERVAL_TRAINING = 24;
    public static final int EXERCISE_SEGMENT_TYPE_HIP_THRUST = 25;
    public static final int EXERCISE_SEGMENT_TYPE_HULA_HOOP = 26;
    public static final int EXERCISE_SEGMENT_TYPE_JUMPING_JACK = 27;
    public static final int EXERCISE_SEGMENT_TYPE_JUMP_ROPE = 28;
    public static final int EXERCISE_SEGMENT_TYPE_KETTLEBELL_SWING = 29;
    public static final int EXERCISE_SEGMENT_TYPE_LATERAL_RAISE = 30;
    public static final int EXERCISE_SEGMENT_TYPE_LAT_PULL_DOWN = 31;
    public static final int EXERCISE_SEGMENT_TYPE_LEG_CURL = 32;
    public static final int EXERCISE_SEGMENT_TYPE_LEG_EXTENSION = 33;
    public static final int EXERCISE_SEGMENT_TYPE_LEG_PRESS = 34;
    public static final int EXERCISE_SEGMENT_TYPE_LEG_RAISE = 35;
    public static final int EXERCISE_SEGMENT_TYPE_LUNGE = 36;
    public static final int EXERCISE_SEGMENT_TYPE_MOUNTAIN_CLIMBER = 37;
    public static final int EXERCISE_SEGMENT_TYPE_OTHER_WORKOUT = 38;
    public static final int EXERCISE_SEGMENT_TYPE_PAUSE = 39;
    public static final int EXERCISE_SEGMENT_TYPE_PILATES = 40;
    public static final int EXERCISE_SEGMENT_TYPE_PLANK = 41;
    public static final int EXERCISE_SEGMENT_TYPE_PULL_UP = 42;
    public static final int EXERCISE_SEGMENT_TYPE_PUNCH = 43;
    public static final int EXERCISE_SEGMENT_TYPE_REST = 44;
    public static final int EXERCISE_SEGMENT_TYPE_ROWING_MACHINE = 45;
    public static final int EXERCISE_SEGMENT_TYPE_RUNNING = 46;
    public static final int EXERCISE_SEGMENT_TYPE_RUNNING_TREADMILL = 47;
    public static final int EXERCISE_SEGMENT_TYPE_SHOULDER_PRESS = 48;
    public static final int EXERCISE_SEGMENT_TYPE_SINGLE_ARM_TRICEPS_EXTENSION = 49;
    public static final int EXERCISE_SEGMENT_TYPE_SIT_UP = 50;
    public static final int EXERCISE_SEGMENT_TYPE_SQUAT = 51;
    public static final int EXERCISE_SEGMENT_TYPE_STAIR_CLIMBING = 52;
    public static final int EXERCISE_SEGMENT_TYPE_STAIR_CLIMBING_MACHINE = 53;
    public static final int EXERCISE_SEGMENT_TYPE_STRETCHING = 54;
    public static final int EXERCISE_SEGMENT_TYPE_SWIMMING_BACKSTROKE = 55;
    public static final int EXERCISE_SEGMENT_TYPE_SWIMMING_BREASTSTROKE = 56;
    public static final int EXERCISE_SEGMENT_TYPE_SWIMMING_BUTTERFLY = 57;
    public static final int EXERCISE_SEGMENT_TYPE_SWIMMING_FREESTYLE = 58;
    public static final int EXERCISE_SEGMENT_TYPE_SWIMMING_MIXED = 59;
    public static final int EXERCISE_SEGMENT_TYPE_SWIMMING_OPEN_WATER = 60;
    public static final int EXERCISE_SEGMENT_TYPE_SWIMMING_OTHER = 61;
    public static final int EXERCISE_SEGMENT_TYPE_SWIMMING_POOL = 62;
    public static final int EXERCISE_SEGMENT_TYPE_UNKNOWN = 0;
    public static final int EXERCISE_SEGMENT_TYPE_UPPER_TWIST = 63;
    public static final int EXERCISE_SEGMENT_TYPE_WALKING = 64;
    public static final int EXERCISE_SEGMENT_TYPE_WEIGHTLIFTING = 65;
    public static final int EXERCISE_SEGMENT_TYPE_WHEELCHAIR = 66;
    public static final int EXERCISE_SEGMENT_TYPE_YOGA = 67;
    private static final Map<Integer, Set<Integer>> SESSION_TO_SEGMENTS_MAPPING;
    private static final Set<Integer> SWIMMING_SEGMENTS;
    private final Instant endTime;
    private final int repetitions;
    private final int segmentType;
    private final Instant startTime;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Set<Integer> UNIVERSAL_SESSION_TYPES = zaj.e((Object[]) new Integer[]{10, 36, 0});
    private static final Set<Integer> UNIVERSAL_SEGMENTS = zaj.e((Object[]) new Integer[]{38, 39, 44, 54, 0});

    public static /* synthetic */ void getSegmentType$annotations() {
    }

    public ExerciseSegment(Instant instant, Instant instant2, int i, int i2) {
        zcp.c(instant, "");
        zcp.c(instant2, "");
        this.startTime = instant;
        this.endTime = instant2;
        this.segmentType = i;
        this.repetitions = i2;
        if (!instant.isBefore(instant2)) {
            throw new IllegalArgumentException("startTime must be before endTime.".toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("repetitions can not be negative.".toString());
        }
    }

    public /* synthetic */ ExerciseSegment(Instant instant, Instant instant2, int i, int i2, int i3, zcm zcmVar) {
        this(instant, instant2, i, (i3 & 8) != 0 ? 0 : i2);
    }

    public final Instant getStartTime() {
        return this.startTime;
    }

    public final Instant getEndTime() {
        return this.endTime;
    }

    public final int getSegmentType() {
        return this.segmentType;
    }

    public final int getRepetitions() {
        return this.repetitions;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExerciseSegment)) {
            return false;
        }
        ExerciseSegment exerciseSegment = (ExerciseSegment) other;
        return zcp.b(this.startTime, exerciseSegment.startTime) && zcp.b(this.endTime, exerciseSegment.endTime) && this.segmentType == exerciseSegment.segmentType && this.repetitions == exerciseSegment.repetitions;
    }

    public int hashCode() {
        int iHashCode = this.startTime.hashCode();
        return (((((iHashCode * 31) + this.endTime.hashCode()) * 31) + Integer.hashCode(this.segmentType)) * 31) + Integer.hashCode(this.repetitions);
    }

    public final boolean isCompatibleWith$connect_client_release(int sessionType) {
        if (UNIVERSAL_SESSION_TYPES.contains(Integer.valueOf(sessionType)) || UNIVERSAL_SEGMENTS.contains(Integer.valueOf(this.segmentType))) {
            return true;
        }
        Set<Integer> set = SESSION_TO_SEGMENTS_MAPPING.get(Integer.valueOf(sessionType));
        if (set != null) {
            return set.contains(Integer.valueOf(this.segmentType));
        }
        return false;
    }

    public String toString() {
        return "ExerciseSegment(startTime=" + this.startTime + ", endTime=" + this.endTime + ", segmentType=" + this.segmentType + ", repetitions=" + this.repetitions + g4.l;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\bD\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001UB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00050JX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00050JX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010LR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00050JX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010LR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00050JX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010LR \u0010S\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050J0TX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006V"}, d2 = {"Landroidx/health/connect/client/records/ExerciseSegment$Companion;", "", "<init>", "()V", "EXERCISE_SEGMENT_TYPE_UNKNOWN", "", "EXERCISE_SEGMENT_TYPE_ARM_CURL", "EXERCISE_SEGMENT_TYPE_BACK_EXTENSION", "EXERCISE_SEGMENT_TYPE_BALL_SLAM", "EXERCISE_SEGMENT_TYPE_BARBELL_SHOULDER_PRESS", "EXERCISE_SEGMENT_TYPE_BENCH_PRESS", "EXERCISE_SEGMENT_TYPE_BENCH_SIT_UP", "EXERCISE_SEGMENT_TYPE_BIKING", "EXERCISE_SEGMENT_TYPE_BIKING_STATIONARY", "EXERCISE_SEGMENT_TYPE_BURPEE", "EXERCISE_SEGMENT_TYPE_CRUNCH", "EXERCISE_SEGMENT_TYPE_DEADLIFT", "EXERCISE_SEGMENT_TYPE_DOUBLE_ARM_TRICEPS_EXTENSION", "EXERCISE_SEGMENT_TYPE_DUMBBELL_CURL_LEFT_ARM", "EXERCISE_SEGMENT_TYPE_DUMBBELL_CURL_RIGHT_ARM", "EXERCISE_SEGMENT_TYPE_DUMBBELL_FRONT_RAISE", "EXERCISE_SEGMENT_TYPE_DUMBBELL_LATERAL_RAISE", "EXERCISE_SEGMENT_TYPE_DUMBBELL_ROW", "EXERCISE_SEGMENT_TYPE_DUMBBELL_TRICEPS_EXTENSION_LEFT_ARM", "EXERCISE_SEGMENT_TYPE_DUMBBELL_TRICEPS_EXTENSION_RIGHT_ARM", "EXERCISE_SEGMENT_TYPE_DUMBBELL_TRICEPS_EXTENSION_TWO_ARM", "EXERCISE_SEGMENT_TYPE_ELLIPTICAL", "EXERCISE_SEGMENT_TYPE_FORWARD_TWIST", "EXERCISE_SEGMENT_TYPE_FRONT_RAISE", "EXERCISE_SEGMENT_TYPE_HIGH_INTENSITY_INTERVAL_TRAINING", "EXERCISE_SEGMENT_TYPE_HIP_THRUST", "EXERCISE_SEGMENT_TYPE_HULA_HOOP", "EXERCISE_SEGMENT_TYPE_JUMPING_JACK", "EXERCISE_SEGMENT_TYPE_JUMP_ROPE", "EXERCISE_SEGMENT_TYPE_KETTLEBELL_SWING", "EXERCISE_SEGMENT_TYPE_LATERAL_RAISE", "EXERCISE_SEGMENT_TYPE_LAT_PULL_DOWN", "EXERCISE_SEGMENT_TYPE_LEG_CURL", "EXERCISE_SEGMENT_TYPE_LEG_EXTENSION", "EXERCISE_SEGMENT_TYPE_LEG_PRESS", "EXERCISE_SEGMENT_TYPE_LEG_RAISE", "EXERCISE_SEGMENT_TYPE_LUNGE", "EXERCISE_SEGMENT_TYPE_MOUNTAIN_CLIMBER", "EXERCISE_SEGMENT_TYPE_OTHER_WORKOUT", "EXERCISE_SEGMENT_TYPE_PAUSE", "EXERCISE_SEGMENT_TYPE_PILATES", "EXERCISE_SEGMENT_TYPE_PLANK", "EXERCISE_SEGMENT_TYPE_PULL_UP", "EXERCISE_SEGMENT_TYPE_PUNCH", "EXERCISE_SEGMENT_TYPE_REST", "EXERCISE_SEGMENT_TYPE_ROWING_MACHINE", "EXERCISE_SEGMENT_TYPE_RUNNING", "EXERCISE_SEGMENT_TYPE_RUNNING_TREADMILL", "EXERCISE_SEGMENT_TYPE_SHOULDER_PRESS", "EXERCISE_SEGMENT_TYPE_SINGLE_ARM_TRICEPS_EXTENSION", "EXERCISE_SEGMENT_TYPE_SIT_UP", "EXERCISE_SEGMENT_TYPE_SQUAT", "EXERCISE_SEGMENT_TYPE_STAIR_CLIMBING", "EXERCISE_SEGMENT_TYPE_STAIR_CLIMBING_MACHINE", "EXERCISE_SEGMENT_TYPE_STRETCHING", "EXERCISE_SEGMENT_TYPE_SWIMMING_BACKSTROKE", "EXERCISE_SEGMENT_TYPE_SWIMMING_BREASTSTROKE", "EXERCISE_SEGMENT_TYPE_SWIMMING_BUTTERFLY", "EXERCISE_SEGMENT_TYPE_SWIMMING_FREESTYLE", "EXERCISE_SEGMENT_TYPE_SWIMMING_MIXED", "EXERCISE_SEGMENT_TYPE_SWIMMING_OPEN_WATER", "EXERCISE_SEGMENT_TYPE_SWIMMING_OTHER", "EXERCISE_SEGMENT_TYPE_SWIMMING_POOL", "EXERCISE_SEGMENT_TYPE_UPPER_TWIST", "EXERCISE_SEGMENT_TYPE_WALKING", "EXERCISE_SEGMENT_TYPE_WEIGHTLIFTING", "EXERCISE_SEGMENT_TYPE_WHEELCHAIR", "EXERCISE_SEGMENT_TYPE_YOGA", "UNIVERSAL_SESSION_TYPES", "", "getUNIVERSAL_SESSION_TYPES$connect_client_release", "()Ljava/util/Set;", "UNIVERSAL_SEGMENTS", "getUNIVERSAL_SEGMENTS$connect_client_release", "EXERCISE_SEGMENTS", "getEXERCISE_SEGMENTS$connect_client_release", "SWIMMING_SEGMENTS", "getSWIMMING_SEGMENTS$connect_client_release", "SESSION_TO_SEGMENTS_MAPPING", "", "ExerciseSegmentTypes", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/health/connect/client/records/ExerciseSegment$Companion$ExerciseSegmentTypes;", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        public @interface ExerciseSegmentTypes {
        }

        private Companion() {
        }

        public final Set<Integer> getUNIVERSAL_SESSION_TYPES$connect_client_release() {
            return ExerciseSegment.UNIVERSAL_SESSION_TYPES;
        }

        public final Set<Integer> getUNIVERSAL_SEGMENTS$connect_client_release() {
            return ExerciseSegment.UNIVERSAL_SEGMENTS;
        }

        public final Set<Integer> getEXERCISE_SEGMENTS$connect_client_release() {
            return ExerciseSegment.EXERCISE_SEGMENTS;
        }

        public final Set<Integer> getSWIMMING_SEGMENTS$connect_client_release() {
            return ExerciseSegment.SWIMMING_SEGMENTS;
        }

        public /* synthetic */ Companion(zcm zcmVar) {
            this();
        }
    }

    static {
        Set<Integer> setE = zaj.e((Object[]) new Integer[]{1, 2, 3, 4, 5, 6, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 23, 25, 26, 28, 27, 29, 30, 31, 32, 33, 34, 35, 36, 37, 41, 42, 43, 48, 49, 50, 51, 63, 65});
        EXERCISE_SEGMENTS = setE;
        Set<Integer> setE2 = zaj.e((Object[]) new Integer[]{55, 56, 58, 57, 59, 61});
        SWIMMING_SEGMENTS = setE2;
        yyu yyuVarC = yyz.c(8, zaj.e(7));
        yyu yyuVarC2 = yyz.c(9, zaj.e(8));
        yyu yyuVarC3 = yyz.c(13, setE);
        yyu yyuVarC4 = yyz.c(25, zaj.e(21));
        yyu yyuVarC5 = yyz.c(26, zaj.e((Object[]) new Integer[]{67, 8, 40, 24}));
        yyu yyuVarC6 = yyz.c(34, setE);
        yyu yyuVarC7 = yyz.c(37, zaj.e((Object[]) new Integer[]{64, 66}));
        yyu yyuVarC8 = yyz.c(48, zaj.e(40));
        yyu yyuVarC9 = yyz.c(54, zaj.e(45));
        yyu yyuVarC10 = yyz.c(56, zaj.e((Object[]) new Integer[]{46, 64}));
        yyu yyuVarC11 = yyz.c(57, zaj.e(47));
        yyu yyuVarC12 = yyz.c(70, setE);
        yyu yyuVarC13 = yyz.c(68, zaj.e(52));
        yyu yyuVarC14 = yyz.c(69, zaj.e(53));
        Set setE3 = zaj.e();
        setE3.add(60);
        Set<Integer> set = setE2;
        setE3.addAll(set);
        yzc yzcVar = yzc.e;
        yyu yyuVarC15 = yyz.c(73, zaj.d(setE3));
        Set setE4 = zaj.e();
        setE4.add(62);
        setE4.addAll(set);
        yzc yzcVar2 = yzc.e;
        SESSION_TO_SEGMENTS_MAPPING = zae.e(yyuVarC, yyuVarC2, yyuVarC3, yyuVarC4, yyuVarC5, yyuVarC6, yyuVarC7, yyuVarC8, yyuVarC9, yyuVarC10, yyuVarC11, yyuVarC12, yyuVarC13, yyuVarC14, yyuVarC15, yyz.c(74, zaj.d(setE4)), yyz.c(79, zaj.e(64)), yyz.c(82, zaj.e(66)), yyz.c(81, setE), yyz.c(83, zaj.e(67)));
    }
}
