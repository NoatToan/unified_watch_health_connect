package com.xiaomi.fit.data.common.data.annotation;

import com.xiaomi.fit.data.common.data.sport.SportRes;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import defpackage.bni;
import defpackage.kzi;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/fit/data/common/data/annotation/FitnessSportType;", "", "Companion", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.LOCAL_VARIABLE})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
public @interface FitnessSportType {
    public static final int ABDWHEEL_TRAINING = 334;
    public static final int AEROBICS = 310;
    public static final int ARCHERY = 800;
    public static final int ARTISTIC_SWIMMING = 111;
    public static final int ATHLETICS = 10001;
    public static final int BACK_TRAINING = 323;
    public static final int BADMINTON = 608;
    public static final int BALLET = 402;
    public static final int BALLROOM_DANCE = 411;
    public static final int BARBELL_TRAINING = 314;
    public static final int BASEBALL = 603;
    public static final int BASKETBALL = 19;
    public static final int BATTLE_ROPE = 331;
    public static final int BEACH_BUGGY = 204;
    public static final int BEACH_FOOTBALL = 616;
    public static final int BEACH_VOLLEYBALL = 617;
    public static final int BELLY_DANCE = 401;
    public static final int BIKE_MOTOCROSS = 206;
    public static final int BIKING_INDOOR = 7;
    public static final int BIKING_OUTDOOR = 6;
    public static final int BILLIARDS = 614;
    public static final int BOARD_GAME = 904;
    public static final int BOATING = 107;
    public static final int BOBBY_JUMP = 317;
    public static final int BOCCE_VOLO = 623;
    public static final int BOWLING = 612;
    public static final int BOXING = 500;
    public static final int BREAK_DANCE = 410;
    public static final int BRIDGE = 903;
    public static final int CAR_RACING = 10002;
    public static final int CHECKERS = 901;
    public static final int CLIMBING_MACHINE = 300;
    public static final int CLIMBING_STAIRS = 301;
    public static final int CORE_TRAINING = 303;
    public static final int CRICKET = 610;
    public static final int CROSS_COUNTRY = 5;
    public static final int CROSS_COUNTRY_SKIING = 710;
    public static final int CROSS_TRAINING = 309;
    public static final int CURLING = 701;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int DANCE = 499;
    public static final int DARTS = 801;
    public static final int DEAD_LIFT = 316;
    public static final int DIVING = 110;
    public static final int DODGE_BALL = 626;
    public static final int DOOR_KICK = 625;
    public static final int DRAGON_BOATS = 115;
    public static final int DUMBBELL_TRAINING = 313;
    public static final int ELLIPTICAL_MACHINE = 11;
    public static final int EQUESTRIAN = 10000;
    public static final int E_SPORTS = 811;
    public static final int FENCING = 510;
    public static final int FIN_SWIMMING = 109;
    public static final int FISHING = 806;
    public static final int FLEXIBILITY_TRAINING = 304;
    public static final int FLY_KITE = 805;
    public static final int FOOTBALL = 600;
    public static final int FREED_DIVING = 116;
    public static final int FREE_SPARRING = 508;
    public static final int FRISBEE = 807;
    public static final int FUNCTIONAL_TRAINING = 319;
    public static final int GO = 902;
    public static final int GOLF = 20;
    public static final int GROUP_GYMNASTICS = 329;
    public static final int GYMNASTICS = 306;
    public static final int HANDBALL = 611;
    public static final int HEALTH_WALKING_OUTDOOR = 2;
    public static final int HEEL_TO_TOE_WALK = 207;
    public static final int HIGH_BAR = 327;
    public static final int HIGH_INTERVAL_TRAINING = 16;
    public static final int HIKING_OUTDOOR = 15;
    public static final int HIP_HOP_DANCE = 408;
    public static final int HOCKEY = 606;
    public static final int HORSE_RIDING = 802;
    public static final int HULA_HOOP = 804;
    public static final int HUNDRED_BASKETBALL = 601;
    public static final int HUNDRED_GOLF = 619;
    public static final int INDOOR_FIT = 399;
    public static final int INDOOR_FOOTBALL = 621;
    public static final int INDOOR_ROCK_CLIMBING = 1000;
    public static final int INDOOR_SKATING = 707;
    public static final int INDOOR_SURFING = 114;
    public static final int INSTRUMENT_DIVING = 118;
    public static final int INTERNATIONAL_CHESS = 900;
    public static final int JAI_BALL = 624;
    public static final int JAZZ = 406;
    public static final int JUDO = 505;
    public static final int JUJITSU = 511;
    public static final int KARATE = 507;
    public static final int KAYAKING = 105;
    public static final int KAYAK_RAFTING = 106;
    public static final int KENDO = 509;
    public static final int KICKBOXING = 330;
    public static final int KICK_SHUTTLECOCK = 808;
    public static final int KITE_SURFING = 113;
    public static final int LATIN_DANCE = 407;
    public static final int LOWER_LIMB_TRAINING = 321;
    public static final int MARTIAL_ARTS = 502;
    public static final int MIXED_AEROBIC = 332;
    public static final int MODERN_DANCE = 412;
    public static final int MOTOR_BOAT = 108;
    public static final int MOUNTAINEERING = 4;
    public static final int MUAY_THAI = 504;
    public static final int NATIONAL_DANCE = 405;
    public static final int NINTENDO_JUSTDANCE = 812;
    public static final int NONE = 0;
    public static final int OUTDOOR_ROCK_CLIMBING = 1001;
    public static final int OUTDOOR_SKATING = 700;
    public static final int PADDLE_BOARD = 101;
    public static final int PARAGLIDING = 205;
    public static final int PARALLEL_BARS = 328;
    public static final int PARKOUR = 203;
    public static final int PHYSICAL_TRAINING = 311;
    public static final int PILATES = 305;
    public static final int PING_PONG = 607;
    public static final int POLE_DANCE = 409;
    public static final int PUCK = 704;
    public static final int RECREATIONAL_SCUBA_DIVING = 117;
    public static final int ROCK_CLIMBING = 200;
    public static final int ROLLER_SKATING = 202;
    public static final int ROPE_SKIPPING = 14;
    public static final int ROWING_MACHINE = 13;
    public static final int RUGBY = 605;
    public static final int RUNNING_INDOOR = 3;
    public static final int RUNNING_OUTDOOR = 1;
    public static final int SAIL_BOAT = 100;
    public static final int SAND_BAG = 622;
    public static final int SEPAKTAKRAW = 618;
    public static final int SHUFFLE_BALL = 627;
    public static final int SHUTTLECOCK = 615;
    public static final int SIT_UPS = 318;
    public static final int SKATE_BOARD = 201;
    public static final int SKI = 21;
    public static final int SKIING = 709;
    public static final int SLED = 706;
    public static final int SNORKELING = 112;
    public static final int SNOW_BOARD = 708;
    public static final int SNOW_CAR = 705;
    public static final int SNOW_MOBILE = 703;
    public static final int SNOW_SPORTS = 702;
    public static final int SOFTBALL = 604;
    public static final int SOMATOSENSORY_GAME = 810;
    public static final int SPINNING = 324;
    public static final int SPORT_FREE_TRAINING = 8;
    public static final int SQUARE_DANCE = 400;
    public static final int SQUASH = 613;
    public static final int STEPPER = 302;
    public static final int STEP_TRAINING = 326;
    public static final int STREET_DANCE = 403;
    public static final int STRENGTH_TRAINING = 308;
    public static final int STRETCH = 307;
    public static final int STROLLER = 325;
    public static final int SWIMMING_OPEN_WATER = 10;
    public static final int SWIMMING_POOL = 9;
    public static final int SWING = 809;
    public static final int TABLE_FOOTBALL = 620;
    public static final int TAEKWONDO = 506;
    public static final int TAICHI = 503;
    public static final int TENNIS = 609;
    public static final int TRIATHLON = 17;
    public static final int TUG_OF_WAR = 803;
    public static final int UPPER_LIMB_TRAINING = 320;
    public static final int VOLLEYBALL = 602;
    public static final int WAIST_ABDOMEN_TRAINING = 322;
    public static final int WALK_INDOOR = 333;
    public static final int WALL_BALL = 312;
    public static final int WATER_POLO = 102;
    public static final int WATER_SKIING = 104;
    public static final int WATER_SPORTS = 103;
    public static final int WEIGHT_LIFTING = 315;
    public static final int WRESTLING = 501;
    public static final int YOGA = 12;
    public static final int ZUMBA = 404;

    @Metadata(d1 = {"\u0000#\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0003\b¬\u0001\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010±\u0001\u001a\u00030²\u00012\u0007\u0010³\u0001\u001a\u00020\u0005J\u0011\u0010´\u0001\u001a\u00030µ\u00012\u0007\u0010³\u0001\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010m\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010o\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010q\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010u\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010v\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010w\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010x\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010y\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010z\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010{\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010|\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010}\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010~\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u007f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0080\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0081\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0082\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0083\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0084\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0085\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0086\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0087\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0088\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0089\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008a\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008b\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008c\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008d\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008e\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008f\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0090\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0091\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0092\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0093\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0094\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0095\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0096\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0097\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0098\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0099\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u009a\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u009b\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u009c\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u009d\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u009e\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u009f\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010 \u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¡\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¢\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010£\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¤\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¥\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¦\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010§\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¨\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010©\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010ª\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010«\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¬\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u00ad\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010®\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¯\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010°\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006¶\u0001"}, d2 = {"Lcom/xiaomi/fit/data/common/data/annotation/FitnessSportType$Companion;", "", "<init>", "()V", "NONE", "", "RUNNING_OUTDOOR", "HEALTH_WALKING_OUTDOOR", "RUNNING_INDOOR", "MOUNTAINEERING", "CROSS_COUNTRY", "BIKING_OUTDOOR", "BIKING_INDOOR", "SPORT_FREE_TRAINING", "SWIMMING_POOL", "SWIMMING_OPEN_WATER", "ELLIPTICAL_MACHINE", "YOGA", "ROWING_MACHINE", "ROPE_SKIPPING", "HIKING_OUTDOOR", "HIGH_INTERVAL_TRAINING", "TRIATHLON", "BASKETBALL", "GOLF", "SKI", "SAIL_BOAT", "PADDLE_BOARD", "WATER_POLO", "WATER_SPORTS", "WATER_SKIING", "KAYAKING", "KAYAK_RAFTING", "BOATING", "MOTOR_BOAT", "FIN_SWIMMING", "DIVING", "ARTISTIC_SWIMMING", "SNORKELING", "KITE_SURFING", "INDOOR_SURFING", "DRAGON_BOATS", "FREED_DIVING", "RECREATIONAL_SCUBA_DIVING", "INSTRUMENT_DIVING", "ROCK_CLIMBING", "SKATE_BOARD", "ROLLER_SKATING", "PARKOUR", "BEACH_BUGGY", "PARAGLIDING", "BIKE_MOTOCROSS", "HEEL_TO_TOE_WALK", "CLIMBING_MACHINE", "CLIMBING_STAIRS", "STEPPER", "CORE_TRAINING", "FLEXIBILITY_TRAINING", "PILATES", "GYMNASTICS", "STRETCH", "STRENGTH_TRAINING", "CROSS_TRAINING", "AEROBICS", "PHYSICAL_TRAINING", "WALL_BALL", "DUMBBELL_TRAINING", "BARBELL_TRAINING", "WEIGHT_LIFTING", "DEAD_LIFT", "BOBBY_JUMP", "SIT_UPS", "FUNCTIONAL_TRAINING", "UPPER_LIMB_TRAINING", "LOWER_LIMB_TRAINING", "WAIST_ABDOMEN_TRAINING", "BACK_TRAINING", "SPINNING", "STROLLER", "STEP_TRAINING", "HIGH_BAR", "PARALLEL_BARS", "GROUP_GYMNASTICS", "KICKBOXING", "BATTLE_ROPE", "MIXED_AEROBIC", "WALK_INDOOR", "ABDWHEEL_TRAINING", "INDOOR_FIT", "SQUARE_DANCE", "BELLY_DANCE", "BALLET", "STREET_DANCE", "ZUMBA", "NATIONAL_DANCE", "JAZZ", "LATIN_DANCE", "HIP_HOP_DANCE", "POLE_DANCE", "BREAK_DANCE", "BALLROOM_DANCE", "MODERN_DANCE", "DANCE", "BOXING", "WRESTLING", "MARTIAL_ARTS", "TAICHI", "MUAY_THAI", "JUDO", "TAEKWONDO", "KARATE", "FREE_SPARRING", "KENDO", "FENCING", "JUJITSU", "FOOTBALL", "HUNDRED_BASKETBALL", "VOLLEYBALL", "BASEBALL", "SOFTBALL", "RUGBY", "HOCKEY", "PING_PONG", "BADMINTON", "TENNIS", "CRICKET", "HANDBALL", "BOWLING", "SQUASH", "BILLIARDS", "SHUTTLECOCK", "BEACH_FOOTBALL", "BEACH_VOLLEYBALL", "SEPAKTAKRAW", "HUNDRED_GOLF", "TABLE_FOOTBALL", "INDOOR_FOOTBALL", "SAND_BAG", "BOCCE_VOLO", "JAI_BALL", "DOOR_KICK", "DODGE_BALL", "SHUFFLE_BALL", "OUTDOOR_SKATING", "CURLING", "SNOW_SPORTS", "SNOW_MOBILE", "PUCK", "SNOW_CAR", "SLED", "INDOOR_SKATING", "SNOW_BOARD", "SKIING", "CROSS_COUNTRY_SKIING", "ARCHERY", "DARTS", "HORSE_RIDING", "TUG_OF_WAR", "HULA_HOOP", "FLY_KITE", "FISHING", "FRISBEE", "KICK_SHUTTLECOCK", "SWING", "SOMATOSENSORY_GAME", "E_SPORTS", "NINTENDO_JUSTDANCE", "INTERNATIONAL_CHESS", "CHECKERS", "GO", "BRIDGE", "BOARD_GAME", "INDOOR_ROCK_CLIMBING", "OUTDOOR_ROCK_CLIMBING", "EQUESTRIAN", "ATHLETICS", "CAR_RACING", "supportNotifySport", "", DailyRecordKey.sportType, "getSportRes", "Lcom/xiaomi/fit/data/common/data/sport/SportRes;", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int ABDWHEEL_TRAINING = 334;
        public static final int AEROBICS = 310;
        public static final int ARCHERY = 800;
        public static final int ARTISTIC_SWIMMING = 111;
        public static final int ATHLETICS = 10001;
        public static final int BACK_TRAINING = 323;
        public static final int BADMINTON = 608;
        public static final int BALLET = 402;
        public static final int BALLROOM_DANCE = 411;
        public static final int BARBELL_TRAINING = 314;
        public static final int BASEBALL = 603;
        public static final int BASKETBALL = 19;
        public static final int BATTLE_ROPE = 331;
        public static final int BEACH_BUGGY = 204;
        public static final int BEACH_FOOTBALL = 616;
        public static final int BEACH_VOLLEYBALL = 617;
        public static final int BELLY_DANCE = 401;
        public static final int BIKE_MOTOCROSS = 206;
        public static final int BIKING_INDOOR = 7;
        public static final int BIKING_OUTDOOR = 6;
        public static final int BILLIARDS = 614;
        public static final int BOARD_GAME = 904;
        public static final int BOATING = 107;
        public static final int BOBBY_JUMP = 317;
        public static final int BOCCE_VOLO = 623;
        public static final int BOWLING = 612;
        public static final int BOXING = 500;
        public static final int BREAK_DANCE = 410;
        public static final int BRIDGE = 903;
        public static final int CAR_RACING = 10002;
        public static final int CHECKERS = 901;
        public static final int CLIMBING_MACHINE = 300;
        public static final int CLIMBING_STAIRS = 301;
        public static final int CORE_TRAINING = 303;
        public static final int CRICKET = 610;
        public static final int CROSS_COUNTRY = 5;
        public static final int CROSS_COUNTRY_SKIING = 710;
        public static final int CROSS_TRAINING = 309;
        public static final int CURLING = 701;
        public static final int DANCE = 499;
        public static final int DARTS = 801;
        public static final int DEAD_LIFT = 316;
        public static final int DIVING = 110;
        public static final int DODGE_BALL = 626;
        public static final int DOOR_KICK = 625;
        public static final int DRAGON_BOATS = 115;
        public static final int DUMBBELL_TRAINING = 313;
        public static final int ELLIPTICAL_MACHINE = 11;
        public static final int EQUESTRIAN = 10000;
        public static final int E_SPORTS = 811;
        public static final int FENCING = 510;
        public static final int FIN_SWIMMING = 109;
        public static final int FISHING = 806;
        public static final int FLEXIBILITY_TRAINING = 304;
        public static final int FLY_KITE = 805;
        public static final int FOOTBALL = 600;
        public static final int FREED_DIVING = 116;
        public static final int FREE_SPARRING = 508;
        public static final int FRISBEE = 807;
        public static final int FUNCTIONAL_TRAINING = 319;
        public static final int GO = 902;
        public static final int GOLF = 20;
        public static final int GROUP_GYMNASTICS = 329;
        public static final int GYMNASTICS = 306;
        public static final int HANDBALL = 611;
        public static final int HEALTH_WALKING_OUTDOOR = 2;
        public static final int HEEL_TO_TOE_WALK = 207;
        public static final int HIGH_BAR = 327;
        public static final int HIGH_INTERVAL_TRAINING = 16;
        public static final int HIKING_OUTDOOR = 15;
        public static final int HIP_HOP_DANCE = 408;
        public static final int HOCKEY = 606;
        public static final int HORSE_RIDING = 802;
        public static final int HULA_HOOP = 804;
        public static final int HUNDRED_BASKETBALL = 601;
        public static final int HUNDRED_GOLF = 619;
        public static final int INDOOR_FIT = 399;
        public static final int INDOOR_FOOTBALL = 621;
        public static final int INDOOR_ROCK_CLIMBING = 1000;
        public static final int INDOOR_SKATING = 707;
        public static final int INDOOR_SURFING = 114;
        public static final int INSTRUMENT_DIVING = 118;
        public static final int INTERNATIONAL_CHESS = 900;
        public static final int JAI_BALL = 624;
        public static final int JAZZ = 406;
        public static final int JUDO = 505;
        public static final int JUJITSU = 511;
        public static final int KARATE = 507;
        public static final int KAYAKING = 105;
        public static final int KAYAK_RAFTING = 106;
        public static final int KENDO = 509;
        public static final int KICKBOXING = 330;
        public static final int KICK_SHUTTLECOCK = 808;
        public static final int KITE_SURFING = 113;
        public static final int LATIN_DANCE = 407;
        public static final int LOWER_LIMB_TRAINING = 321;
        public static final int MARTIAL_ARTS = 502;
        public static final int MIXED_AEROBIC = 332;
        public static final int MODERN_DANCE = 412;
        public static final int MOTOR_BOAT = 108;
        public static final int MOUNTAINEERING = 4;
        public static final int MUAY_THAI = 504;
        public static final int NATIONAL_DANCE = 405;
        public static final int NINTENDO_JUSTDANCE = 812;
        public static final int NONE = 0;
        public static final int OUTDOOR_ROCK_CLIMBING = 1001;
        public static final int OUTDOOR_SKATING = 700;
        public static final int PADDLE_BOARD = 101;
        public static final int PARAGLIDING = 205;
        public static final int PARALLEL_BARS = 328;
        public static final int PARKOUR = 203;
        public static final int PHYSICAL_TRAINING = 311;
        public static final int PILATES = 305;
        public static final int PING_PONG = 607;
        public static final int POLE_DANCE = 409;
        public static final int PUCK = 704;
        public static final int RECREATIONAL_SCUBA_DIVING = 117;
        public static final int ROCK_CLIMBING = 200;
        public static final int ROLLER_SKATING = 202;
        public static final int ROPE_SKIPPING = 14;
        public static final int ROWING_MACHINE = 13;
        public static final int RUGBY = 605;
        public static final int RUNNING_INDOOR = 3;
        public static final int RUNNING_OUTDOOR = 1;
        public static final int SAIL_BOAT = 100;
        public static final int SAND_BAG = 622;
        public static final int SEPAKTAKRAW = 618;
        public static final int SHUFFLE_BALL = 627;
        public static final int SHUTTLECOCK = 615;
        public static final int SIT_UPS = 318;
        public static final int SKATE_BOARD = 201;
        public static final int SKI = 21;
        public static final int SKIING = 709;
        public static final int SLED = 706;
        public static final int SNORKELING = 112;
        public static final int SNOW_BOARD = 708;
        public static final int SNOW_CAR = 705;
        public static final int SNOW_MOBILE = 703;
        public static final int SNOW_SPORTS = 702;
        public static final int SOFTBALL = 604;
        public static final int SOMATOSENSORY_GAME = 810;
        public static final int SPINNING = 324;
        public static final int SPORT_FREE_TRAINING = 8;
        public static final int SQUARE_DANCE = 400;
        public static final int SQUASH = 613;
        public static final int STEPPER = 302;
        public static final int STEP_TRAINING = 326;
        public static final int STREET_DANCE = 403;
        public static final int STRENGTH_TRAINING = 308;
        public static final int STRETCH = 307;
        public static final int STROLLER = 325;
        public static final int SWIMMING_OPEN_WATER = 10;
        public static final int SWIMMING_POOL = 9;
        public static final int SWING = 809;
        public static final int TABLE_FOOTBALL = 620;
        public static final int TAEKWONDO = 506;
        public static final int TAICHI = 503;
        public static final int TENNIS = 609;
        public static final int TRIATHLON = 17;
        public static final int TUG_OF_WAR = 803;
        public static final int UPPER_LIMB_TRAINING = 320;
        public static final int VOLLEYBALL = 602;
        public static final int WAIST_ABDOMEN_TRAINING = 322;
        public static final int WALK_INDOOR = 333;
        public static final int WALL_BALL = 312;
        public static final int WATER_POLO = 102;
        public static final int WATER_SKIING = 104;
        public static final int WATER_SPORTS = 103;
        public static final int WEIGHT_LIFTING = 315;
        public static final int WRESTLING = 501;
        public static final int YOGA = 12;
        public static final int ZUMBA = 404;

        private Companion() {
        }

        @NotNull
        public final SportRes getSportRes(int sportType) {
            if (sportType == 19) {
                return new SportRes(ResourceExtKt.getString(kzi.v), bni.j);
            }
            if (sportType == 20) {
                return new SportRes(ResourceExtKt.getString(kzi.v0), bni.i0);
            }
            switch (sportType) {
                case 1:
                    return new SportRes(ResourceExtKt.getString(kzi.I1), bni.p1);
                case 2:
                    return new SportRes(ResourceExtKt.getString(kzi.z0), bni.m0);
                case 3:
                    return new SportRes(ResourceExtKt.getString(kzi.H1), bni.o1);
                case 4:
                    return new SportRes(ResourceExtKt.getString(kzi.j1), bni.B);
                case 5:
                    return new SportRes(ResourceExtKt.getString(kzi.R), bni.F);
                case 6:
                    return new SportRes(ResourceExtKt.getString(kzi.V), bni.K);
                case 7:
                    return new SportRes(ResourceExtKt.getString(kzi.U), bni.J);
                case 8:
                    return new SportRes(ResourceExtKt.getString(kzi.o0), bni.c0);
                case 9:
                    return new SportRes(ResourceExtKt.getString(kzi.m2), bni.Q1);
                case 10:
                    return new SportRes(ResourceExtKt.getString(kzi.n2), bni.R1);
                case 11:
                    return new SportRes(ResourceExtKt.getString(kzi.e0), bni.U);
                case 12:
                    return new SportRes(ResourceExtKt.getString(kzi.K2), bni.l2);
                case 13:
                    return new SportRes(ResourceExtKt.getString(kzi.F1), bni.m1);
                case 14:
                    return new SportRes(ResourceExtKt.getString(kzi.D1), bni.l1);
                case 15:
                    return new SportRes(ResourceExtKt.getString(kzi.n1), bni.V0);
                case 16:
                    return new SportRes(ResourceExtKt.getString(kzi.C0), bni.p0);
                case 17:
                    return new SportRes(ResourceExtKt.getString(kzi.w2), bni.Z1);
                default:
                    switch (sportType) {
                        case 100:
                            return new SportRes(ResourceExtKt.getString(kzi.K1), bni.q1);
                        case 101:
                            return new SportRes(ResourceExtKt.getString(kzi.q1), bni.Y0);
                        case 102:
                            return new SportRes(ResourceExtKt.getString(kzi.G2), bni.g2);
                        case 103:
                            return new SportRes(ResourceExtKt.getString(kzi.h), bni.i2);
                        case 104:
                            return new SportRes(ResourceExtKt.getString(kzi.l2), bni.h2);
                        case 105:
                            return new SportRes(ResourceExtKt.getString(kzi.K), bni.J0);
                        case 106:
                            return new SportRes(ResourceExtKt.getString(kzi.X0), bni.I0);
                        case 107:
                            return new SportRes(ResourceExtKt.getString(kzi.E1), bni.s);
                        case 108:
                            return new SportRes(ResourceExtKt.getString(kzi.i1), bni.S0);
                        case 109:
                            return new SportRes(ResourceExtKt.getString(kzi.H2), bni.X);
                        case 110:
                            return new SportRes(ResourceExtKt.getString(kzi.c0), bni.O);
                        case 111:
                            return new SportRes(ResourceExtKt.getString(kzi.i0), bni.P1);
                        case 112:
                            return new SportRes(ResourceExtKt.getString(kzi.T1), bni.z1);
                        case 113:
                            return new SportRes(ResourceExtKt.getString(kzi.a1), bni.M0);
                        case 114:
                            return new SportRes(ResourceExtKt.getString(kzi.P0), bni.z0);
                        case 115:
                            return new SportRes(ResourceExtKt.getString(kzi.b0), bni.R);
                        case 116:
                            return new SportRes(ResourceExtKt.getString(kzi.p0), bni.d0);
                        case 117:
                            return new SportRes(ResourceExtKt.getString(kzi.A1), bni.i1);
                        case 118:
                            return new SportRes(ResourceExtKt.getString(kzi.Q0), bni.A0);
                        default:
                            switch (sportType) {
                                case 200:
                                    return new SportRes(ResourceExtKt.getString(kzi.B1), bni.j1);
                                case 201:
                                    return new SportRes(ResourceExtKt.getString(kzi.Q1), bni.w1);
                                case 202:
                                    return new SportRes(ResourceExtKt.getString(kzi.C1), bni.k1);
                                case 203:
                                    return new SportRes(ResourceExtKt.getString(kzi.t1), bni.b1);
                                case 204:
                                    return new SportRes(ResourceExtKt.getString(kzi.j), bni.l);
                                case 205:
                                    return new SportRes(ResourceExtKt.getString(kzi.r1), bni.Z0);
                                case 206:
                                    return new SportRes(ResourceExtKt.getString(kzi.A), bni.p);
                                case 207:
                                    return new SportRes(ResourceExtKt.getString(kzi.A0), bni.n0);
                                default:
                                    switch (sportType) {
                                        case 300:
                                            return new SportRes(ResourceExtKt.getString(kzi.N), bni.C);
                                        case 301:
                                            return new SportRes(ResourceExtKt.getString(kzi.M), bni.A);
                                        case 302:
                                            return new SportRes(ResourceExtKt.getString(kzi.g2), bni.K1);
                                        case 303:
                                            return new SportRes(ResourceExtKt.getString(kzi.O), bni.D);
                                        case 304:
                                            return new SportRes(ResourceExtKt.getString(kzi.l0), bni.Z);
                                        case 305:
                                            return new SportRes(ResourceExtKt.getString(kzi.v1), bni.d1);
                                        case 306:
                                            return new SportRes(ResourceExtKt.getString(kzi.x0), bni.k0);
                                        case 307:
                                            return new SportRes(ResourceExtKt.getString(kzi.j2), bni.N1);
                                        case 308:
                                            return new SportRes(ResourceExtKt.getString(kzi.i2), bni.M1);
                                        case 309:
                                            return new SportRes(ResourceExtKt.getString(kzi.S), bni.H);
                                        case 310:
                                            return new SportRes(ResourceExtKt.getString(kzi.f), bni.f4398b);
                                        case 311:
                                            return new SportRes(ResourceExtKt.getString(kzi.u1), bni.c1);
                                        case 312:
                                            return new SportRes(ResourceExtKt.getString(kzi.F2), bni.f2);
                                        case 313:
                                            return new SportRes(ResourceExtKt.getString(kzi.d0), bni.S);
                                        case 314:
                                            return new SportRes(ResourceExtKt.getString(kzi.o), bni.h);
                                        case 315:
                                            return new SportRes(ResourceExtKt.getString(kzi.I2), bni.j2);
                                        case 316:
                                            return new SportRes(ResourceExtKt.getString(kzi.Y), bni.N);
                                        case 317:
                                            return new SportRes(ResourceExtKt.getString(kzi.E), bni.t);
                                        case 318:
                                            return new SportRes(ResourceExtKt.getString(kzi.P1), bni.v1);
                                        case 319:
                                            return new SportRes(ResourceExtKt.getString(kzi.t0), bni.g0);
                                        case 320:
                                            return new SportRes(ResourceExtKt.getString(kzi.y2), bni.b2);
                                        case 321:
                                            return new SportRes(ResourceExtKt.getString(kzi.d1), bni.O0);
                                        case 322:
                                            return new SportRes(ResourceExtKt.getString(kzi.A2), bni.d2);
                                        case 323:
                                            return new SportRes(ResourceExtKt.getString(kzi.f24451k), bni.d);
                                        case 324:
                                            return new SportRes(ResourceExtKt.getString(kzi.a2), bni.G1);
                                        case 325:
                                            return new SportRes(ResourceExtKt.getString(kzi.k2), bni.O1);
                                        case 326:
                                            return new SportRes(ResourceExtKt.getString(kzi.f2), bni.J1);
                                        case 327:
                                            return new SportRes(ResourceExtKt.getString(kzi.B0), bni.o0);
                                        case 328:
                                            return new SportRes(ResourceExtKt.getString(kzi.s1), bni.a1);
                                        case 329:
                                            return new SportRes(ResourceExtKt.getString(kzi.w0), bni.j0);
                                        case 330:
                                            return new SportRes(ResourceExtKt.getString(kzi.Y0), bni.L0);
                                        case 331:
                                            return new SportRes(ResourceExtKt.getString(kzi.w), bni.f4399k);
                                        case 332:
                                            return new SportRes(ResourceExtKt.getString(kzi.g1), bni.Q0);
                                        case 333:
                                            return new SportRes(ResourceExtKt.getString(kzi.c2), bni.e2);
                                        case 334:
                                            return new SportRes(ResourceExtKt.getString(kzi.f24449a), bni.f4397a);
                                        case 900:
                                            return new SportRes(ResourceExtKt.getString(kzi.R0), bni.B0);
                                        case 901:
                                            return new SportRes(ResourceExtKt.getString(kzi.L), bni.z);
                                        case 902:
                                            return new SportRes(ResourceExtKt.getString(kzi.u0), bni.h0);
                                        case 903:
                                            return new SportRes(ResourceExtKt.getString(kzi.J), bni.y);
                                        case 904:
                                            return new SportRes(ResourceExtKt.getString(kzi.D), bni.f4400r);
                                        case 1000:
                                            return new SportRes(ResourceExtKt.getString(kzi.M0), bni.x0);
                                        case 1001:
                                            return new SportRes(ResourceExtKt.getString(kzi.o1), bni.W0);
                                        case 10000:
                                            return new SportRes(ResourceExtKt.getString(kzi.f0), bni.V);
                                        case 10001:
                                            return new SportRes(ResourceExtKt.getString(kzi.v2), bni.Y1);
                                        case 10002:
                                            return new SportRes(ResourceExtKt.getString(kzi.z1), bni.h1);
                                        default:
                                            switch (sportType) {
                                                case 399:
                                                    return new SportRes(ResourceExtKt.getString(kzi.L0), bni.v0);
                                                case 400:
                                                    return new SportRes(ResourceExtKt.getString(kzi.d2), bni.H1);
                                                case 401:
                                                    return new SportRes(ResourceExtKt.getString(kzi.z), bni.o);
                                                case 402:
                                                    return new SportRes(ResourceExtKt.getString(kzi.m), bni.f);
                                                case 403:
                                                    return new SportRes(ResourceExtKt.getString(kzi.h2), bni.L1);
                                                case 404:
                                                    return new SportRes(ResourceExtKt.getString(kzi.L2), bni.m2);
                                                case 405:
                                                    return new SportRes(ResourceExtKt.getString(kzi.l1), bni.U0);
                                                case 406:
                                                    return new SportRes(ResourceExtKt.getString(kzi.T0), bni.D0);
                                                case 407:
                                                    return new SportRes(ResourceExtKt.getString(kzi.c1), bni.N0);
                                                case 408:
                                                    return new SportRes(ResourceExtKt.getString(kzi.F0), bni.q0);
                                                case 409:
                                                    return new SportRes(ResourceExtKt.getString(kzi.x1), bni.f1);
                                                case 410:
                                                    return new SportRes(ResourceExtKt.getString(kzi.I), bni.x);
                                                case 411:
                                                    return new SportRes(ResourceExtKt.getString(kzi.n), bni.g);
                                                case 412:
                                                    return new SportRes(ResourceExtKt.getString(kzi.h1), bni.R0);
                                                default:
                                                    switch (sportType) {
                                                        case 499:
                                                            return new SportRes(ResourceExtKt.getString(kzi.W), bni.L);
                                                        case 500:
                                                            return new SportRes(ResourceExtKt.getString(kzi.H), bni.w);
                                                        case 501:
                                                            return new SportRes(ResourceExtKt.getString(kzi.J2), bni.k2);
                                                        case 502:
                                                            return new SportRes(ResourceExtKt.getString(kzi.e1), bni.P0);
                                                        case 503:
                                                            return new SportRes(ResourceExtKt.getString(kzi.t2), bni.W1);
                                                        case 504:
                                                            return new SportRes(ResourceExtKt.getString(kzi.k1), bni.T0);
                                                        case 505:
                                                            return new SportRes(ResourceExtKt.getString(kzi.U0), bni.E0);
                                                        case 506:
                                                            return new SportRes(ResourceExtKt.getString(kzi.s2), bni.V1);
                                                        case 507:
                                                            return new SportRes(ResourceExtKt.getString(kzi.W0), bni.H0);
                                                        case 508:
                                                            return new SportRes(ResourceExtKt.getString(kzi.q0), bni.e0);
                                                        case 509:
                                                            return new SportRes(ResourceExtKt.getString(kzi.q2), bni.T1);
                                                        case 510:
                                                            return new SportRes(ResourceExtKt.getString(kzi.j0), bni.W);
                                                        case 511:
                                                            return new SportRes(ResourceExtKt.getString(kzi.V0), bni.F0);
                                                        default:
                                                            switch (sportType) {
                                                                case 600:
                                                                    return new SportRes(ResourceExtKt.getString(kzi.n0), bni.b0);
                                                                case 601:
                                                                    return new SportRes(ResourceExtKt.getString(kzi.v), bni.j);
                                                                case 602:
                                                                    return new SportRes(ResourceExtKt.getString(kzi.z2), bni.c2);
                                                                case 603:
                                                                    return new SportRes(ResourceExtKt.getString(kzi.p), bni.i);
                                                                case 604:
                                                                    return new SportRes(ResourceExtKt.getString(kzi.Y1), bni.E1);
                                                                case 605:
                                                                    return new SportRes(ResourceExtKt.getString(kzi.G1), bni.n1);
                                                                case 606:
                                                                    return new SportRes(ResourceExtKt.getString(kzi.G0), bni.r0);
                                                                case 607:
                                                                    return new SportRes(ResourceExtKt.getString(kzi.w1), bni.e1);
                                                                case 608:
                                                                    return new SportRes(ResourceExtKt.getString(kzi.l), bni.e);
                                                                case 609:
                                                                    return new SportRes(ResourceExtKt.getString(kzi.u2), bni.X1);
                                                                case 610:
                                                                    return new SportRes(ResourceExtKt.getString(kzi.Q), bni.E);
                                                                case 611:
                                                                    return new SportRes(ResourceExtKt.getString(kzi.y0), bni.l0);
                                                                case 612:
                                                                    return new SportRes(ResourceExtKt.getString(kzi.G), bni.v);
                                                                case 613:
                                                                    return new SportRes(ResourceExtKt.getString(kzi.e2), bni.I1);
                                                                case 614:
                                                                    return new SportRes(ResourceExtKt.getString(kzi.B), bni.q);
                                                                case 615:
                                                                    return new SportRes(ResourceExtKt.getString(kzi.O1), bni.u1);
                                                                case 616:
                                                                    return new SportRes(ResourceExtKt.getString(kzi.x), bni.m);
                                                                case 617:
                                                                    return new SportRes(ResourceExtKt.getString(kzi.y), bni.n);
                                                                case 618:
                                                                    return new SportRes(ResourceExtKt.getString(kzi.M1), bni.s1);
                                                                case 619:
                                                                    return new SportRes(ResourceExtKt.getString(kzi.v0), bni.i0);
                                                                case 620:
                                                                    return new SportRes(ResourceExtKt.getString(kzi.r2), bni.U1);
                                                                case 621:
                                                                    return new SportRes(ResourceExtKt.getString(kzi.O0), bni.w0);
                                                                case 622:
                                                                    return new SportRes(ResourceExtKt.getString(kzi.L1), bni.r1);
                                                                case 623:
                                                                    return new SportRes(ResourceExtKt.getString(kzi.F), bni.u);
                                                                case 624:
                                                                    return new SportRes(ResourceExtKt.getString(kzi.S0), bni.C0);
                                                                case 625:
                                                                    return new SportRes(ResourceExtKt.getString(kzi.a0), bni.Q);
                                                                case 626:
                                                                    return new SportRes(ResourceExtKt.getString(kzi.Z), bni.P);
                                                                case 627:
                                                                    return new SportRes(ResourceExtKt.getString(kzi.N1), bni.t1);
                                                                default:
                                                                    switch (sportType) {
                                                                        case 700:
                                                                            return new SportRes(ResourceExtKt.getString(kzi.p1), bni.X0);
                                                                        case 701:
                                                                            return new SportRes(ResourceExtKt.getString(kzi.T), bni.I);
                                                                        case 702:
                                                                            return new SportRes(ResourceExtKt.getString(kzi.W1), bni.B1);
                                                                        case 703:
                                                                            return new SportRes(ResourceExtKt.getString(kzi.X1), bni.D1);
                                                                        case 704:
                                                                            return new SportRes(ResourceExtKt.getString(kzi.y1), bni.g1);
                                                                        case 705:
                                                                            return new SportRes(ResourceExtKt.getString(kzi.V1), bni.A1);
                                                                        case 706:
                                                                            return new SportRes(ResourceExtKt.getString(kzi.S1), bni.y1);
                                                                        case 707:
                                                                            return new SportRes(ResourceExtKt.getString(kzi.N0), bni.y0);
                                                                        case 708:
                                                                            return new SportRes(ResourceExtKt.getString(kzi.U1), bni.C1);
                                                                        case 709:
                                                                            return new SportRes(ResourceExtKt.getString(kzi.R1), bni.x1);
                                                                        case 710:
                                                                            return new SportRes(ResourceExtKt.getString(kzi.P), bni.G);
                                                                        default:
                                                                            switch (sportType) {
                                                                                case 800:
                                                                                    return new SportRes(ResourceExtKt.getString(kzi.i), bni.c);
                                                                                case 801:
                                                                                    return new SportRes(ResourceExtKt.getString(kzi.X), bni.M);
                                                                                case 802:
                                                                                    return new SportRes(ResourceExtKt.getString(kzi.I0), bni.s0);
                                                                                case 803:
                                                                                    return new SportRes(ResourceExtKt.getString(kzi.x2), bni.a2);
                                                                                case 804:
                                                                                    return new SportRes(ResourceExtKt.getString(kzi.J0), bni.t0);
                                                                                case 805:
                                                                                    return new SportRes(ResourceExtKt.getString(kzi.m0), bni.a0);
                                                                                case 806:
                                                                                    return new SportRes(ResourceExtKt.getString(kzi.k0), bni.Y);
                                                                                case 807:
                                                                                    return new SportRes(ResourceExtKt.getString(kzi.s0), bni.f0);
                                                                                case 808:
                                                                                    return new SportRes(ResourceExtKt.getString(kzi.Z0), bni.K0);
                                                                                case 809:
                                                                                    return new SportRes(ResourceExtKt.getString(kzi.p2), bni.S1);
                                                                                case 810:
                                                                                    return new SportRes(ResourceExtKt.getString(kzi.Z1), bni.F1);
                                                                                case 811:
                                                                                    return new SportRes(ResourceExtKt.getString(kzi.g0), bni.T);
                                                                                case 812:
                                                                                    return new SportRes(ResourceExtKt.getString(kzi.m1), bni.G0);
                                                                                default:
                                                                                    return new SportRes("", 0);
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }

        public final boolean supportNotifySport(int sportType) {
            return sportType == 1 || sportType == 2 || sportType == 3 || sportType == 6;
        }
    }
}
