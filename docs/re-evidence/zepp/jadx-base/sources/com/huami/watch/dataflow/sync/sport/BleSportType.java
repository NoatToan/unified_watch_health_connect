package com.huami.watch.dataflow.sync.sport;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b`\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\ba¨\u0006b"}, d2 = {"Lcom/huami/watch/dataflow/sync/sport/BleSportType;", "", "", "sportType", LogUtil.I, "getSportType", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "OUTDOOR", "WALKING", "CROSSCOUNTRY", "INDOOR", "BIKE", "BIKE_INDOOR", "SKIING", "ELLIPTICAL_TRAINER", "MOUNTAINEERING", "SWIM_INDOOR", "SWIM_OUTDOOR", "WORK_OUT", "TENNIS", "SOCCER", "CHILD_RUN", "CHILD_BIKE", "CHILD_SWIM", "TRIATHLON", "MULTI", "ROPE_SKIPPING", "HIKING", "ROWING_MACHINE", "INDOOR_FITNESS", "INDOOR_WALK", "CURLING", "BOARD_SKIING", "ALPINE_SKIING", "OUTDOOR_SKATING", "INDOOR_SKATING", "CROSS_DOUBLE_SKIING", "CROSS_COUNTRY_SKIING", "MOUNTAIN_RIDING", "BMX", "HIGH_INTENSITY_TRAINING", "CORE_TRAINING", "MIXED_AEROBIC", "STRENGTH_TRAINING", "STRETCH_TRAINING", "CLIMBING_TRAINING", "FLEXIBLE_TRAINING", "STEP_TRAINING", "STEPPER", "GYMNASTICS", "YOGA", "PILATES", "SURFING", "HUNTING", "FISHING", "SAILING", "OUTDOOR_ROWING", "SKATEBOARDING", "PADDLE_SURFING", "ROLLER_SKATING", "ROCK_CLIMBING", "BALLET_DANCE", "BELLY_DANCE", "SQUARE_DANCE", "STREET_DANCE", "SOCIAL_DANCE", "DANCE", "ZUMBA_DANCE", "CRICKET_BALL", "BASEBALL", "BOWLING", "SQUASH_BALL", "FOOTBALL", "GOLF", "GOLF_SWING", "BASKETBALL", "SOFTBALL", "GATEBALL", "VOLLEYBALL", "PINGPONG", "HOCKEY_BALL", "HANDBALL", "BADMINTON", "ARCHERY", "EQUESTIAN", "FENCING", "KARATE", "BOXING", "JUDO", "WRESTLING", "TAICHI", "MUAY_THAI", "TAEKWONDO", "MARTIAL_ARTS", "FREE_SPARRING", "companionlib_release"}, k = 1, mv = {1, 4, 0})
public enum BleSportType {
    OUTDOOR(1),
    WALKING(6),
    CROSSCOUNTRY(7),
    INDOOR(8),
    BIKE(9),
    BIKE_INDOOR(10),
    SKIING(11),
    ELLIPTICAL_TRAINER(12),
    MOUNTAINEERING(13),
    SWIM_INDOOR(14),
    SWIM_OUTDOOR(15),
    WORK_OUT(16),
    TENNIS(17),
    SOCCER(18),
    CHILD_RUN(1001),
    CHILD_BIKE(1009),
    CHILD_SWIM(1015),
    TRIATHLON(2001),
    MULTI(2002),
    ROPE_SKIPPING(21),
    HIKING(22),
    ROWING_MACHINE(23),
    INDOOR_FITNESS(24),
    INDOOR_WALK(40),
    CURLING(41),
    BOARD_SKIING(42),
    ALPINE_SKIING(43),
    OUTDOOR_SKATING(44),
    INDOOR_SKATING(45),
    CROSS_DOUBLE_SKIING(105),
    CROSS_COUNTRY_SKIING(46),
    MOUNTAIN_RIDING(47),
    BMX(48),
    HIGH_INTENSITY_TRAINING(49),
    CORE_TRAINING(50),
    MIXED_AEROBIC(51),
    STRENGTH_TRAINING(52),
    STRETCH_TRAINING(53),
    CLIMBING_TRAINING(54),
    FLEXIBLE_TRAINING(55),
    STEP_TRAINING(57),
    STEPPER(58),
    GYMNASTICS(59),
    YOGA(60),
    PILATES(61),
    SURFING(62),
    HUNTING(63),
    FISHING(64),
    SAILING(65),
    OUTDOOR_ROWING(66),
    SKATEBOARDING(67),
    PADDLE_SURFING(68),
    ROLLER_SKATING(69),
    ROCK_CLIMBING(70),
    BALLET_DANCE(71),
    BELLY_DANCE(72),
    SQUARE_DANCE(73),
    STREET_DANCE(74),
    SOCIAL_DANCE(75),
    DANCE(76),
    ZUMBA_DANCE(77),
    CRICKET_BALL(78),
    BASEBALL(79),
    BOWLING(80),
    SQUASH_BALL(81),
    FOOTBALL(82),
    GOLF(83),
    GOLF_SWING(84),
    BASKETBALL(85),
    SOFTBALL(86),
    GATEBALL(87),
    VOLLEYBALL(88),
    PINGPONG(89),
    HOCKEY_BALL(90),
    HANDBALL(91),
    BADMINTON(92),
    ARCHERY(93),
    EQUESTIAN(94),
    FENCING(95),
    KARATE(96),
    BOXING(97),
    JUDO(98),
    WRESTLING(99),
    TAICHI(100),
    MUAY_THAI(101),
    TAEKWONDO(102),
    MARTIAL_ARTS(103),
    FREE_SPARRING(104);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int sportType;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\f"}, d2 = {"Lcom/huami/watch/dataflow/sync/sport/BleSportType$Companion;", "", "", "sportType", "", "needRopeSkipping", "needStrokeSpeed", "needAltitudeOffset", "needTotalGroup", "needMarathonFaultTolerance", "<init>", "()V", "companionlib_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public final boolean needAltitudeOffset(int sportType) {
            Integer numValueOf = Integer.valueOf(sportType);
            int iIntValue = numValueOf.intValue();
            if (!(1001 <= iIntValue && 1999 >= iIntValue)) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                sportType = numValueOf.intValue() - 1000;
            }
            BleSportType[] bleSportTypeArr = {BleSportType.OUTDOOR, BleSportType.WALKING, BleSportType.CROSSCOUNTRY, BleSportType.BIKE, BleSportType.MOUNTAINEERING, BleSportType.SKIING, BleSportType.SWIM_OUTDOOR, BleSportType.SOCCER, BleSportType.HIKING, BleSportType.CHILD_RUN, BleSportType.CHILD_BIKE, BleSportType.TRIATHLON, BleSportType.MULTI, BleSportType.BOARD_SKIING, BleSportType.ALPINE_SKIING, BleSportType.OUTDOOR_SKATING, BleSportType.CROSS_DOUBLE_SKIING, BleSportType.CROSS_COUNTRY_SKIING, BleSportType.MOUNTAIN_RIDING, BleSportType.BMX, BleSportType.SURFING, BleSportType.HUNTING, BleSportType.SAILING, BleSportType.SKATEBOARDING, BleSportType.PADDLE_SURFING, BleSportType.ROLLER_SKATING, BleSportType.FOOTBALL, BleSportType.HOCKEY_BALL, BleSportType.EQUESTIAN};
            for (int i = 0; i < 29; i++) {
                if (bleSportTypeArr[i].getSportType() == sportType) {
                    return true;
                }
            }
            return false;
        }

        @JvmStatic
        public final boolean needMarathonFaultTolerance(int sportType) {
            BleSportType[] bleSportTypeArr = {BleSportType.OUTDOOR};
            for (int i = 0; i < 1; i++) {
                if (bleSportTypeArr[i].getSportType() == sportType) {
                    return true;
                }
            }
            return false;
        }

        public final boolean needRopeSkipping(int sportType) {
            BleSportType[] bleSportTypeArr = {BleSportType.ROPE_SKIPPING};
            for (int i = 0; i < 1; i++) {
                if (bleSportTypeArr[i].getSportType() == sportType) {
                    return true;
                }
            }
            return false;
        }

        public final boolean needStrokeSpeed(int sportType) {
            BleSportType[] bleSportTypeArr = {BleSportType.SWIM_INDOOR, BleSportType.SWIM_OUTDOOR, BleSportType.ROWING_MACHINE};
            for (int i = 0; i < 3; i++) {
                if (bleSportTypeArr[i].getSportType() == sportType) {
                    return true;
                }
            }
            return false;
        }

        @JvmStatic
        public final boolean needTotalGroup(int sportType) {
            BleSportType[] bleSportTypeArr = {BleSportType.ROWING_MACHINE, BleSportType.INDOOR_FITNESS};
            for (int i = 0; i < 2; i++) {
                if (bleSportTypeArr[i].getSportType() == sportType) {
                    return true;
                }
            }
            return false;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    BleSportType(int i) {
        this.sportType = i;
    }

    @JvmStatic
    public static final boolean needMarathonFaultTolerance(int i) {
        return INSTANCE.needMarathonFaultTolerance(i);
    }

    @JvmStatic
    public static final boolean needTotalGroup(int i) {
        return INSTANCE.needTotalGroup(i);
    }

    public final int getSportType() {
        return this.sportType;
    }
}
