package com.xiaomi.fit.data.common.data.annotation;

import com.amap.api.maps.utils.SpatialRelationUtil;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.mibi.sdk.common.CommonConstants;
import com.miui.tsmclient.model.mitsm.h;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fit.data.common.data.sport.SportCategoryData;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.heartrate.finger.CustomizedFingerprintAcquiredInfo;
import com.xiaomi.fitness.stand.StandDetectConstants;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import com.xiaomi.mi_connect_sdk.BuildConfig;
import defpackage.kzi;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/fit/data/common/data/annotation/SportCategory;", "", "Companion", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.LOCAL_VARIABLE})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
public @interface SportCategory {

    @NotNull
    public static final String AbdwheelTraining = "abdwheel_training";

    @NotNull
    public static final String Aerobics = "aerobics";

    @NotNull
    public static final String AllRockClimbing = "extreme_rock_climbing";

    @NotNull
    public static final String Archery = "archery";

    @NotNull
    public static final String Athletics = "track_and_field";

    @NotNull
    public static final String BackTraining = "back_training";

    @NotNull
    public static final String Badminton = "badminton";

    @NotNull
    public static final String BallRoomDance = "ballroom_dance";

    @NotNull
    public static final String Ballet = "ballet";

    @NotNull
    public static final String BarbellTraining = "barbell_training";

    @NotNull
    public static final String Baseball = "baseball";

    @NotNull
    public static final String Basketball = "basketball";

    @NotNull
    public static final String BattleRope = "battle_rope";

    @NotNull
    public static final String BeachBuggy = "atv";

    @NotNull
    public static final String BeachFootball = "beach_football";

    @NotNull
    public static final String BeachVolleyball = "beach_volleyball";

    @NotNull
    public static final String BellyDance = "belly_dance";

    @NotNull
    public static final String BikeMotocross = "bmx";

    @NotNull
    public static final String Billiards = "billiards";

    @NotNull
    public static final String BoardGame = "board_game";

    @NotNull
    public static final String Boating = "rowing";

    @NotNull
    public static final String BobbyJump = "bobby_jump";

    @NotNull
    public static final String BocceVolo = "bocci";

    @NotNull
    public static final String Bowling = "bowling";

    @NotNull
    public static final String Boxing = "boxing";

    @NotNull
    public static final String BreakDance = "break_dance";

    @NotNull
    public static final String Bridge = "bridge";

    @NotNull
    public static final String CarRacing = "racing_car";

    @NotNull
    public static final String Checkers = "draughts";

    @NotNull
    public static final String Climbing = "climbing";

    @NotNull
    public static final String ClimbingMachine = "climbing_machine";

    @NotNull
    public static final String ClimbingStairs = "climb_stairs";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String CoreTraining = "core_training";

    @NotNull
    public static final String Cricket = "cricket";

    @NotNull
    public static final String CrossCountrySkiing = "backcountry_skiing";

    @NotNull
    public static final String CrossHiking = "cross_hiking";

    @NotNull
    public static final String CrossTraining = "cross_fit";

    @NotNull
    public static final String Curling = "curling";

    @NotNull
    public static final String Dance = "dance";

    @NotNull
    public static final String Darts = "darts";

    @NotNull
    public static final String DeadLift = "dead_lift";

    @NotNull
    public static final String Diving = "driving";

    @NotNull
    public static final String DodgeBall = "dodgeball";

    @NotNull
    public static final String DoorKick = "gateball";

    @NotNull
    public static final String DragonBoats = "dragon_boat";

    @NotNull
    public static final String DumbbellTraining = "dumbbell_training";

    @NotNull
    public static final String E_Sports = "e_sports";

    @NotNull
    public static final String EllipticalTrainer = "elliptical_trainer";

    @NotNull
    public static final String Equestrian = "equestrian";

    @NotNull
    public static final String FakeAll = "sport_stats_all";

    @NotNull
    public static final String Fencing = "fencing";

    @NotNull
    public static final String FinSwimming = "web_swimming";

    @NotNull
    public static final String Fishing = "fishing";

    @NotNull
    public static final String FlexibilityTraining = "flexibility_training";

    @NotNull
    public static final String FlyAKite = "fly_kite";

    @NotNull
    public static final String Football = "football";

    @NotNull
    public static final String FreeDiving = "diving";

    @NotNull
    public static final String FreeSparring = "free_sparring";

    @NotNull
    public static final String FreeTraining = "free_training";

    @NotNull
    public static final String Frisbee = "frisbee";

    @NotNull
    public static final String FunctionalTraining = "functional_training";

    @NotNull
    public static final String Go = "go";

    @NotNull
    public static final String Golf = "golf";

    @NotNull
    public static final String GroupGymnastics = "group_callisthenics";

    @NotNull
    public static final String Gymnastics = "gymnastics";

    @NotNull
    public static final String Handball = "handball";

    @NotNull
    public static final String HeelToToeWalk = "race_walking";

    @NotNull
    public static final String HighBar = "high_bar";

    @NotNull
    public static final String HighIntervalTraining = "high_interval_training";

    @NotNull
    public static final String HipHopDance = "hip_hop_dance";

    @NotNull
    public static final String Hockey = "hockey";

    @NotNull
    public static final String HorseRiding = "horse_riding";

    @NotNull
    public static final String HulaHoop = "hula_hoop";

    @NotNull
    public static final String IndoorFit = "indoor_fitness";

    @NotNull
    public static final String IndoorFootBall = "futsal";

    @NotNull
    public static final String IndoorRiding = "indoor_riding";

    @NotNull
    public static final String IndoorSkating = "indoor_skating";

    @NotNull
    public static final String IndoorSurfing = "indoor_surfing";

    @NotNull
    public static final String InternationalChess = "chess";

    @NotNull
    public static final String JaiBall = "pelota";

    @NotNull
    public static final String Jazz = "jazz";

    @NotNull
    public static final String JuJitSu = "jiujitsu";

    @NotNull
    public static final String Judo = "judo";

    @NotNull
    public static final String JustDance = "switch_just_dance";

    @NotNull
    public static final String Karate = "karate";

    @NotNull
    public static final String KayakRafting = "kayak_rafting";

    @NotNull
    public static final String Kayaking = "canoeing";

    @NotNull
    public static final String Kendo = "swordswanship";

    @NotNull
    public static final String KickBoxing = "kickboxing";

    @NotNull
    public static final String KickShuttleCock = "shuttlecock_kicking";

    @NotNull
    public static final String KiteSurfing = "kite_surfing";

    @NotNull
    public static final String LatinDance = "latin_dance";

    @NotNull
    public static final String LowerLimbTraining = "lower_limb_training";

    @NotNull
    public static final String MartialArts = "martial_arts";

    @NotNull
    public static final String MixedAerobic = "mixed_aerobics";

    @NotNull
    public static final String ModernDance = "modern_dance";

    @NotNull
    public static final String MotorBoat = "motorboat";

    @NotNull
    public static final String MuayThai = "muay_thai";

    @NotNull
    public static final String NationalDance = "national_dance";

    @NotNull
    public static final String OutdoorHiking = "outdoor_hiking";

    @NotNull
    public static final String OutdoorRiding = "outdoor_riding";

    @NotNull
    public static final String OutdoorSkating = "outdoor_skating";

    @NotNull
    public static final String PaddleBoard = "paddle_board";

    @NotNull
    public static final String Paragliding = "paraglider";

    @NotNull
    public static final String ParallelBars = "parallel_bars";

    @NotNull
    public static final String ParallelSkiing = "parallel_skiing";

    @NotNull
    public static final String Parkour = "parkour";

    @NotNull
    public static final String PhysicalTraining = "physical_training";

    @NotNull
    public static final String Pilates = "pilates";

    @NotNull
    public static final String PingPong = "pingpong";

    @NotNull
    public static final String PoleDance = "pole_dance";

    @NotNull
    public static final String Puck = "puck";

    @NotNull
    public static final String RockClimbing = "rock_climbing";

    @NotNull
    public static final String RollerSkating = "roller_skating";

    @NotNull
    public static final String RopeSkipping = "rope_skipping";

    @NotNull
    public static final String RowingMachine = "rowing_machine";

    @NotNull
    public static final String Rugby = "rugby";

    @NotNull
    public static final String Running = "running";

    @NotNull
    public static final String SailBoat = "sailboat";

    @NotNull
    public static final String SandBag = "footbag";

    @NotNull
    public static final String SepakTakraw = "sepak_takraw";

    @NotNull
    public static final String ShuffleBall = "shuffle_board";

    @NotNull
    public static final String Shuttlecock = "shuttlecock";

    @NotNull
    public static final String SitUps = "sit_ups";

    @NotNull
    public static final String SkateBoard = "skate";

    @NotNull
    public static final String Sled = "sled";

    @NotNull
    public static final String Snorkeling = "snorkeling";

    @NotNull
    public static final String SnowBoard = "snowboarding";

    @NotNull
    public static final String SnowCar = "snow_car";

    @NotNull
    public static final String SnowMobile = "snowmobile";

    @NotNull
    public static final String SnowSports = "snow_sports";

    @NotNull
    public static final String Softball = "softball";

    @NotNull
    public static final String SomatosensoryGame = "motion_sensing_game";

    @NotNull
    public static final String Spinning = "spinning";

    @NotNull
    public static final String SquareDance = "square_dance";

    @NotNull
    public static final String Squash = "squash";

    @NotNull
    public static final String StepTraining = "step_training";

    @NotNull
    public static final String Stepper = "stepper";

    @NotNull
    public static final String StreetDance = "street_dance";

    @NotNull
    public static final String StrengthTraining = "strength_training";

    @NotNull
    public static final String Stretch = "stretch";

    @NotNull
    public static final String Stroller = "walking_machine";

    @NotNull
    public static final String Swimming = "swimming";

    @NotNull
    public static final String Swing = "swing";

    @NotNull
    public static final String TableFootBall = "foosball";

    @NotNull
    public static final String Taekwondo = "taekwondo";

    @NotNull
    public static final String TaiChi = "taichi";

    @NotNull
    public static final String Tennis = "tennis";

    @NotNull
    public static final String Triathlon = "triathlon";

    @NotNull
    public static final String TugOfWar = "tug_of_war";

    @NotNull
    public static final String UpperLimbTraining = "upper_limb_training";

    @NotNull
    public static final String Volleyball = "volleyball";

    @NotNull
    public static final String WaistAbdomenTraining = "waist_training";

    @NotNull
    public static final String Walking = "walking";

    @NotNull
    public static final String WallBall = "wall_ball";

    @NotNull
    public static final String WaterPolo = "water_polo";

    @NotNull
    public static final String WaterSkiing = "surfing";

    @NotNull
    public static final String WaterSports = "aquatic_sport";

    @NotNull
    public static final String WeightLifting = "weight_lifting";

    @NotNull
    public static final String Wrestling = "wrestling";

    @NotNull
    public static final String Yoga = "yoga";

    @NotNull
    public static final String Zumba = "zumba";

    @Metadata(d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0003\b¢\u0001\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010§\u0001\u001a\u00030¨\u00012\u0007\u0010©\u0001\u001a\u00020\u0005J\u0011\u0010ª\u0001\u001a\u00030¨\u00012\u0007\u0010©\u0001\u001a\u00020\u0005J\u0012\u0010«\u0001\u001a\u00030¨\u00012\b\u0010¬\u0001\u001a\u00030\u00ad\u0001J\u0012\u0010®\u0001\u001a\u00030¨\u00012\b\u0010¬\u0001\u001a\u00030\u00ad\u0001J\u0012\u0010¯\u0001\u001a\u00030¨\u00012\b\u0010¬\u0001\u001a\u00030\u00ad\u0001J\u0013\u0010°\u0001\u001a\u0005\u0018\u00010±\u00012\u0007\u0010²\u0001\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010m\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010o\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010q\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010u\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010v\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010w\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010x\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010y\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010z\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010{\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010|\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010}\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010~\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u007f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0080\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0081\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0082\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0083\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0084\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0085\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0086\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0087\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0088\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0089\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008a\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008b\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008c\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008d\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008e\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008f\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0090\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0091\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0092\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0093\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0094\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0095\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0096\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0097\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0098\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0099\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u009a\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u009b\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u009c\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u009d\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u009e\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u009f\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010 \u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¡\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¢\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010£\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¤\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¥\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¦\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006³\u0001"}, d2 = {"Lcom/xiaomi/fit/data/common/data/annotation/SportCategory$Companion;", "", "<init>", "()V", "FakeAll", "", "Running", "Walking", "Swimming", "Climbing", "CrossHiking", "OutdoorRiding", "IndoorRiding", "FreeTraining", "EllipticalTrainer", "Yoga", "RowingMachine", "RopeSkipping", "OutdoorHiking", "HighIntervalTraining", "Triathlon", "AbdwheelTraining", "SailBoat", "PaddleBoard", "WaterPolo", "WaterSports", "WaterSkiing", "Kayaking", "KayakRafting", "Boating", "MotorBoat", "FinSwimming", "Diving", "Snorkeling", "KiteSurfing", "IndoorSurfing", "DragonBoats", "FreeDiving", "RockClimbing", "SkateBoard", "RollerSkating", "Parkour", "BeachBuggy", "Paragliding", "BikeMotocross", "HeelToToeWalk", "ClimbingMachine", "ClimbingStairs", "Stepper", "CoreTraining", "FlexibilityTraining", "Pilates", "Gymnastics", "Stretch", "StrengthTraining", "CrossTraining", "Aerobics", "PhysicalTraining", "WallBall", "DumbbellTraining", "BarbellTraining", "WeightLifting", "DeadLift", "BobbyJump", "SitUps", "FunctionalTraining", "UpperLimbTraining", "LowerLimbTraining", "WaistAbdomenTraining", "BackTraining", "Spinning", "Stroller", "StepTraining", "HighBar", "ParallelBars", "GroupGymnastics", "KickBoxing", "BattleRope", "MixedAerobic", "IndoorFit", "SquareDance", "BellyDance", "Ballet", "StreetDance", "Zumba", "NationalDance", "Jazz", "LatinDance", "HipHopDance", "PoleDance", "BreakDance", "BallRoomDance", "ModernDance", "Dance", "Boxing", "Wrestling", "MartialArts", "TaiChi", "MuayThai", "Judo", "Taekwondo", "Karate", "FreeSparring", "Kendo", "Fencing", "JuJitSu", "Football", "Basketball", "Volleyball", "Baseball", "Softball", "Rugby", "Hockey", "PingPong", "Badminton", "Tennis", "Cricket", "Handball", "Bowling", "Squash", "Billiards", "Shuttlecock", "BeachFootball", "BeachVolleyball", "SepakTakraw", "Golf", "TableFootBall", "IndoorFootBall", "SandBag", "BocceVolo", "JaiBall", "DoorKick", "DodgeBall", "ShuffleBall", "OutdoorSkating", "Curling", "SnowSports", "SnowMobile", "Puck", "SnowCar", "Sled", "IndoorSkating", "SnowBoard", "ParallelSkiing", "CrossCountrySkiing", "Archery", "Darts", "HorseRiding", "TugOfWar", "HulaHoop", "FlyAKite", "Fishing", "Frisbee", "KickShuttleCock", "Swing", "SomatosensoryGame", "JustDance", "E_Sports", "InternationalChess", "Checkers", "Go", "Bridge", "BoardGame", "Equestrian", "Athletics", "CarRacing", "AllRockClimbing", "showDistance", "", "sportCategory", "showCount", "isSwimming", "type", "", "isWalking", "isRunning", "getSportCategory", "Lcom/xiaomi/fit/data/common/data/sport/SportCategoryData;", "categoryKey", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String AbdwheelTraining = "abdwheel_training";

        @NotNull
        public static final String Aerobics = "aerobics";

        @NotNull
        public static final String AllRockClimbing = "extreme_rock_climbing";

        @NotNull
        public static final String Archery = "archery";

        @NotNull
        public static final String Athletics = "track_and_field";

        @NotNull
        public static final String BackTraining = "back_training";

        @NotNull
        public static final String Badminton = "badminton";

        @NotNull
        public static final String BallRoomDance = "ballroom_dance";

        @NotNull
        public static final String Ballet = "ballet";

        @NotNull
        public static final String BarbellTraining = "barbell_training";

        @NotNull
        public static final String Baseball = "baseball";

        @NotNull
        public static final String Basketball = "basketball";

        @NotNull
        public static final String BattleRope = "battle_rope";

        @NotNull
        public static final String BeachBuggy = "atv";

        @NotNull
        public static final String BeachFootball = "beach_football";

        @NotNull
        public static final String BeachVolleyball = "beach_volleyball";

        @NotNull
        public static final String BellyDance = "belly_dance";

        @NotNull
        public static final String BikeMotocross = "bmx";

        @NotNull
        public static final String Billiards = "billiards";

        @NotNull
        public static final String BoardGame = "board_game";

        @NotNull
        public static final String Boating = "rowing";

        @NotNull
        public static final String BobbyJump = "bobby_jump";

        @NotNull
        public static final String BocceVolo = "bocci";

        @NotNull
        public static final String Bowling = "bowling";

        @NotNull
        public static final String Boxing = "boxing";

        @NotNull
        public static final String BreakDance = "break_dance";

        @NotNull
        public static final String Bridge = "bridge";

        @NotNull
        public static final String CarRacing = "racing_car";

        @NotNull
        public static final String Checkers = "draughts";

        @NotNull
        public static final String Climbing = "climbing";

        @NotNull
        public static final String ClimbingMachine = "climbing_machine";

        @NotNull
        public static final String ClimbingStairs = "climb_stairs";

        @NotNull
        public static final String CoreTraining = "core_training";

        @NotNull
        public static final String Cricket = "cricket";

        @NotNull
        public static final String CrossCountrySkiing = "backcountry_skiing";

        @NotNull
        public static final String CrossHiking = "cross_hiking";

        @NotNull
        public static final String CrossTraining = "cross_fit";

        @NotNull
        public static final String Curling = "curling";

        @NotNull
        public static final String Dance = "dance";

        @NotNull
        public static final String Darts = "darts";

        @NotNull
        public static final String DeadLift = "dead_lift";

        @NotNull
        public static final String Diving = "driving";

        @NotNull
        public static final String DodgeBall = "dodgeball";

        @NotNull
        public static final String DoorKick = "gateball";

        @NotNull
        public static final String DragonBoats = "dragon_boat";

        @NotNull
        public static final String DumbbellTraining = "dumbbell_training";

        @NotNull
        public static final String E_Sports = "e_sports";

        @NotNull
        public static final String EllipticalTrainer = "elliptical_trainer";

        @NotNull
        public static final String Equestrian = "equestrian";

        @NotNull
        public static final String FakeAll = "sport_stats_all";

        @NotNull
        public static final String Fencing = "fencing";

        @NotNull
        public static final String FinSwimming = "web_swimming";

        @NotNull
        public static final String Fishing = "fishing";

        @NotNull
        public static final String FlexibilityTraining = "flexibility_training";

        @NotNull
        public static final String FlyAKite = "fly_kite";

        @NotNull
        public static final String Football = "football";

        @NotNull
        public static final String FreeDiving = "diving";

        @NotNull
        public static final String FreeSparring = "free_sparring";

        @NotNull
        public static final String FreeTraining = "free_training";

        @NotNull
        public static final String Frisbee = "frisbee";

        @NotNull
        public static final String FunctionalTraining = "functional_training";

        @NotNull
        public static final String Go = "go";

        @NotNull
        public static final String Golf = "golf";

        @NotNull
        public static final String GroupGymnastics = "group_callisthenics";

        @NotNull
        public static final String Gymnastics = "gymnastics";

        @NotNull
        public static final String Handball = "handball";

        @NotNull
        public static final String HeelToToeWalk = "race_walking";

        @NotNull
        public static final String HighBar = "high_bar";

        @NotNull
        public static final String HighIntervalTraining = "high_interval_training";

        @NotNull
        public static final String HipHopDance = "hip_hop_dance";

        @NotNull
        public static final String Hockey = "hockey";

        @NotNull
        public static final String HorseRiding = "horse_riding";

        @NotNull
        public static final String HulaHoop = "hula_hoop";

        @NotNull
        public static final String IndoorFit = "indoor_fitness";

        @NotNull
        public static final String IndoorFootBall = "futsal";

        @NotNull
        public static final String IndoorRiding = "indoor_riding";

        @NotNull
        public static final String IndoorSkating = "indoor_skating";

        @NotNull
        public static final String IndoorSurfing = "indoor_surfing";

        @NotNull
        public static final String InternationalChess = "chess";

        @NotNull
        public static final String JaiBall = "pelota";

        @NotNull
        public static final String Jazz = "jazz";

        @NotNull
        public static final String JuJitSu = "jiujitsu";

        @NotNull
        public static final String Judo = "judo";

        @NotNull
        public static final String JustDance = "switch_just_dance";

        @NotNull
        public static final String Karate = "karate";

        @NotNull
        public static final String KayakRafting = "kayak_rafting";

        @NotNull
        public static final String Kayaking = "canoeing";

        @NotNull
        public static final String Kendo = "swordswanship";

        @NotNull
        public static final String KickBoxing = "kickboxing";

        @NotNull
        public static final String KickShuttleCock = "shuttlecock_kicking";

        @NotNull
        public static final String KiteSurfing = "kite_surfing";

        @NotNull
        public static final String LatinDance = "latin_dance";

        @NotNull
        public static final String LowerLimbTraining = "lower_limb_training";

        @NotNull
        public static final String MartialArts = "martial_arts";

        @NotNull
        public static final String MixedAerobic = "mixed_aerobics";

        @NotNull
        public static final String ModernDance = "modern_dance";

        @NotNull
        public static final String MotorBoat = "motorboat";

        @NotNull
        public static final String MuayThai = "muay_thai";

        @NotNull
        public static final String NationalDance = "national_dance";

        @NotNull
        public static final String OutdoorHiking = "outdoor_hiking";

        @NotNull
        public static final String OutdoorRiding = "outdoor_riding";

        @NotNull
        public static final String OutdoorSkating = "outdoor_skating";

        @NotNull
        public static final String PaddleBoard = "paddle_board";

        @NotNull
        public static final String Paragliding = "paraglider";

        @NotNull
        public static final String ParallelBars = "parallel_bars";

        @NotNull
        public static final String ParallelSkiing = "parallel_skiing";

        @NotNull
        public static final String Parkour = "parkour";

        @NotNull
        public static final String PhysicalTraining = "physical_training";

        @NotNull
        public static final String Pilates = "pilates";

        @NotNull
        public static final String PingPong = "pingpong";

        @NotNull
        public static final String PoleDance = "pole_dance";

        @NotNull
        public static final String Puck = "puck";

        @NotNull
        public static final String RockClimbing = "rock_climbing";

        @NotNull
        public static final String RollerSkating = "roller_skating";

        @NotNull
        public static final String RopeSkipping = "rope_skipping";

        @NotNull
        public static final String RowingMachine = "rowing_machine";

        @NotNull
        public static final String Rugby = "rugby";

        @NotNull
        public static final String Running = "running";

        @NotNull
        public static final String SailBoat = "sailboat";

        @NotNull
        public static final String SandBag = "footbag";

        @NotNull
        public static final String SepakTakraw = "sepak_takraw";

        @NotNull
        public static final String ShuffleBall = "shuffle_board";

        @NotNull
        public static final String Shuttlecock = "shuttlecock";

        @NotNull
        public static final String SitUps = "sit_ups";

        @NotNull
        public static final String SkateBoard = "skate";

        @NotNull
        public static final String Sled = "sled";

        @NotNull
        public static final String Snorkeling = "snorkeling";

        @NotNull
        public static final String SnowBoard = "snowboarding";

        @NotNull
        public static final String SnowCar = "snow_car";

        @NotNull
        public static final String SnowMobile = "snowmobile";

        @NotNull
        public static final String SnowSports = "snow_sports";

        @NotNull
        public static final String Softball = "softball";

        @NotNull
        public static final String SomatosensoryGame = "motion_sensing_game";

        @NotNull
        public static final String Spinning = "spinning";

        @NotNull
        public static final String SquareDance = "square_dance";

        @NotNull
        public static final String Squash = "squash";

        @NotNull
        public static final String StepTraining = "step_training";

        @NotNull
        public static final String Stepper = "stepper";

        @NotNull
        public static final String StreetDance = "street_dance";

        @NotNull
        public static final String StrengthTraining = "strength_training";

        @NotNull
        public static final String Stretch = "stretch";

        @NotNull
        public static final String Stroller = "walking_machine";

        @NotNull
        public static final String Swimming = "swimming";

        @NotNull
        public static final String Swing = "swing";

        @NotNull
        public static final String TableFootBall = "foosball";

        @NotNull
        public static final String Taekwondo = "taekwondo";

        @NotNull
        public static final String TaiChi = "taichi";

        @NotNull
        public static final String Tennis = "tennis";

        @NotNull
        public static final String Triathlon = "triathlon";

        @NotNull
        public static final String TugOfWar = "tug_of_war";

        @NotNull
        public static final String UpperLimbTraining = "upper_limb_training";

        @NotNull
        public static final String Volleyball = "volleyball";

        @NotNull
        public static final String WaistAbdomenTraining = "waist_training";

        @NotNull
        public static final String Walking = "walking";

        @NotNull
        public static final String WallBall = "wall_ball";

        @NotNull
        public static final String WaterPolo = "water_polo";

        @NotNull
        public static final String WaterSkiing = "surfing";

        @NotNull
        public static final String WaterSports = "aquatic_sport";

        @NotNull
        public static final String WeightLifting = "weight_lifting";

        @NotNull
        public static final String Wrestling = "wrestling";

        @NotNull
        public static final String Yoga = "yoga";

        @NotNull
        public static final String Zumba = "zumba";

        private Companion() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Nullable
        public final SportCategoryData getSportCategory(@NotNull String categoryKey) {
            Intrinsics.checkNotNullParameter(categoryKey, "categoryKey");
            switch (categoryKey.hashCode()) {
                case -2104237534:
                    if (categoryKey.equals("roller_skating")) {
                        return new SportCategoryData(categoryKey, kzi.C1, 660);
                    }
                    return null;
                case -2098654365:
                    if (categoryKey.equals("barbell_training")) {
                        return new SportCategoryData(categoryKey, kzi.o, 250);
                    }
                    return null;
                case -2091312415:
                    if (categoryKey.equals("jiujitsu")) {
                        return new SportCategoryData(categoryKey, kzi.V0, 900);
                    }
                    return null;
                case -2089992084:
                    if (categoryKey.equals("pole_dance")) {
                        return new SportCategoryData(categoryKey, kzi.x1, 820);
                    }
                    return null;
                case -2008047626:
                    if (categoryKey.equals("spinning")) {
                        return new SportCategoryData(categoryKey, kzi.a2, 110);
                    }
                    return null;
                case -2005973498:
                    if (categoryKey.equals("badminton")) {
                        return new SportCategoryData(categoryKey, kzi.l, h.I);
                    }
                    return null;
                case -2000668517:
                    if (categoryKey.equals("fly_kite")) {
                        return new SportCategoryData(categoryKey, kzi.m0, StandDetectConstants.DETECT_IGNORE_NOTICE_END);
                    }
                    return null;
                case -1936268394:
                    if (categoryKey.equals("functional_training")) {
                        return new SportCategoryData(categoryKey, kzi.t0, 260);
                    }
                    return null;
                case -1922710856:
                    if (categoryKey.equals("latin_dance")) {
                        return new SportCategoryData(categoryKey, kzi.c1, 800);
                    }
                    return null;
                case -1893554479:
                    if (categoryKey.equals("stepper")) {
                        return new SportCategoryData(categoryKey, kzi.g2, 330);
                    }
                    return null;
                case -1881872635:
                    if (categoryKey.equals("stretch")) {
                        return new SportCategoryData(categoryKey, kzi.j2, SpatialRelationUtil.A_CIRCLE_DEGREE);
                    }
                    return null;
                case -1859381011:
                    if (categoryKey.equals("step_training")) {
                        return new SportCategoryData(categoryKey, kzi.f2, 140);
                    }
                    return null;
                case -1853223924:
                    if (categoryKey.equals("surfing")) {
                        return new SportCategoryData(categoryKey, kzi.l2, 530);
                    }
                    return null;
                case -1829196422:
                    if (categoryKey.equals("core_training")) {
                        return new SportCategoryData(categoryKey, kzi.O, 210);
                    }
                    return null;
                case -1766699165:
                    if (categoryKey.equals("racing_car")) {
                        return new SportCategoryData(categoryKey, kzi.z1, 1470);
                    }
                    return null;
                case -1766182882:
                    if (categoryKey.equals("rope_skipping")) {
                        return new SportCategoryData(categoryKey, kzi.D1, 290);
                    }
                    return null;
                case -1754386404:
                    if (categoryKey.equals("kite_surfing")) {
                        return new SportCategoryData(categoryKey, kzi.a1, 630);
                    }
                    return null;
                case -1721090992:
                    if (categoryKey.equals("baseball")) {
                        return new SportCategoryData(categoryKey, kzi.p, 1070);
                    }
                    return null;
                case -1684936714:
                    if (categoryKey.equals("high_bar")) {
                        return new SportCategoryData(categoryKey, kzi.B0, 340);
                    }
                    return null;
                case -1669134356:
                    if (categoryKey.equals("dragon_boat")) {
                        return new SportCategoryData(categoryKey, kzi.b0, SportSummary.VERSION_208);
                    }
                    return null;
                case -1637263861:
                    if (categoryKey.equals("race_walking")) {
                        return new SportCategoryData(categoryKey, kzi.A0, 40);
                    }
                    return null;
                case -1623971967:
                    if (categoryKey.equals("walking_machine")) {
                        return new SportCategoryData(categoryKey, kzi.k2, 120);
                    }
                    return null;
                case -1579120122:
                    if (categoryKey.equals("dead_lift")) {
                        return new SportCategoryData(categoryKey, kzi.Y, 400);
                    }
                    return null;
                case -1568344758:
                    if (categoryKey.equals("gateball")) {
                        return new SportCategoryData(categoryKey, kzi.a0, 1090);
                    }
                    return null;
                case -1561805207:
                    if (categoryKey.equals("parallel_skiing")) {
                        return new SportCategoryData(categoryKey, kzi.R1, 1520);
                    }
                    return null;
                case -1541726557:
                    if (categoryKey.equals("elliptical_trainer")) {
                        return new SportCategoryData(categoryKey, kzi.e0, 270);
                    }
                    return null;
                case -1530180391:
                    if (categoryKey.equals("tug_of_war")) {
                        return new SportCategoryData(categoryKey, kzi.x2, 1380);
                    }
                    return null;
                case -1509532735:
                    if (categoryKey.equals("bobby_jump")) {
                        return new SportCategoryData(categoryKey, kzi.E, 410);
                    }
                    return null;
                case -1497614913:
                    if (categoryKey.equals("snowboarding")) {
                        return new SportCategoryData(categoryKey, kzi.U1, CommonConstants.Mgc.THIRD_PART_ORDER_ID_ERROR);
                    }
                    return null;
                case -1445173514:
                    if (categoryKey.equals("sport_stats_all")) {
                        return new SportCategoryData(categoryKey, kzi.b2, 0);
                    }
                    return null;
                case -1427535202:
                    if (categoryKey.equals("track_and_field")) {
                        return new SportCategoryData(categoryKey, kzi.v2, 1460);
                    }
                    return null;
                case -1420118892:
                    if (categoryKey.equals("group_callisthenics")) {
                        return new SportCategoryData(categoryKey, kzi.w0, 730);
                    }
                    return null;
                case -1405255155:
                    if (categoryKey.equals("shuttlecock")) {
                        return new SportCategoryData(categoryKey, kzi.O1, 1200);
                    }
                    return null;
                case -1396404498:
                    if (categoryKey.equals("ballet")) {
                        return new SportCategoryData(categoryKey, kzi.m, HMSedentaryConfig.INGORE_START_INDEX);
                    }
                    return null;
                case -1383120329:
                    if (categoryKey.equals("boxing")) {
                        return new SportCategoryData(categoryKey, kzi.H, HMSedentaryConfig.INGORE_STOP_INDEX);
                    }
                    return null;
                case -1380801655:
                    if (categoryKey.equals("bridge")) {
                        return new SportCategoryData(categoryKey, kzi.J, 1580);
                    }
                    return null;
                case -1354490485:
                    if (categoryKey.equals("indoor_skating")) {
                        return new SportCategoryData(categoryKey, kzi.N0, 1490);
                    }
                    return null;
                case -1331462735:
                    if (categoryKey.equals("diving")) {
                        return new SportCategoryData(categoryKey, kzi.g, 1602);
                    }
                    return null;
                case -1312203771:
                    if (categoryKey.equals("hula_hoop")) {
                        return new SportCategoryData(categoryKey, kzi.J0, 1390);
                    }
                    return null;
                case -1263172551:
                    if (categoryKey.equals("futsal")) {
                        return new SportCategoryData(categoryKey, kzi.O0, 930);
                    }
                    return null;
                case -1235097835:
                    if (categoryKey.equals("climbing_machine")) {
                        return new SportCategoryData(categoryKey, kzi.N, 320);
                    }
                    return null;
                case -1211969373:
                    if (categoryKey.equals("hockey")) {
                        return new SportCategoryData(categoryKey, kzi.G0, 1110);
                    }
                    return null;
                case -1160328212:
                    if (categoryKey.equals("volleyball")) {
                        return new SportCategoryData(categoryKey, kzi.z2, 1050);
                    }
                    return null;
                case -1157819320:
                    if (categoryKey.equals("beach_volleyball")) {
                        return new SportCategoryData(categoryKey, kzi.y, 1230);
                    }
                    return null;
                case -1138573514:
                    if (categoryKey.equals("karate")) {
                        return new SportCategoryData(categoryKey, kzi.W0, 870);
                    }
                    return null;
                case -1052916192:
                    if (categoryKey.equals("indoor_surfing")) {
                        return new SportCategoryData(categoryKey, kzi.P0, 940);
                    }
                    return null;
                case -991898971:
                    if (categoryKey.equals("pelota")) {
                        return new SportCategoryData(categoryKey, kzi.S0, 970);
                    }
                    return null;
                case -967719762:
                    if (categoryKey.equals("fencing")) {
                        return new SportCategoryData(categoryKey, kzi.j0, 990);
                    }
                    return null;
                case -941171890:
                    if (categoryKey.equals("snorkeling")) {
                        return new SportCategoryData(categoryKey, kzi.T1, 620);
                    }
                    return null;
                case -927876182:
                    if (categoryKey.equals("shuttlecock_kicking")) {
                        return new SportCategoryData(categoryKey, kzi.Z0, 1210);
                    }
                    return null;
                case -925083704:
                    if (categoryKey.equals("rowing")) {
                        return new SportCategoryData(categoryKey, kzi.E1, 570);
                    }
                    return null;
                case -903503343:
                    if (categoryKey.equals("square_dance")) {
                        return new SportCategoryData(categoryKey, kzi.d2, 700);
                    }
                    return null;
                case -894674625:
                    if (categoryKey.equals("squash")) {
                        return new SportCategoryData(categoryKey, kzi.e2, 1180);
                    }
                    return null;
                case -881177720:
                    if (categoryKey.equals("taichi")) {
                        return new SportCategoryData(categoryKey, kzi.t2, 1020);
                    }
                    return null;
                case -877324069:
                    if (categoryKey.equals("tennis")) {
                        return new SportCategoryData(categoryKey, kzi.u2, 1140);
                    }
                    return null;
                case -848436598:
                    if (categoryKey.equals("fishing")) {
                        return new SportCategoryData(categoryKey, kzi.k0, 1410);
                    }
                    return null;
                case -828169374:
                    if (categoryKey.equals("draughts")) {
                        return new SportCategoryData(categoryKey, kzi.L, 1560);
                    }
                    return null;
                case -826532964:
                    if (categoryKey.equals("mixed_aerobics")) {
                        return new SportCategoryData(categoryKey, kzi.g1, 1440);
                    }
                    return null;
                case -808437247:
                    if (categoryKey.equals("triathlon")) {
                        return new SportCategoryData(categoryKey, kzi.w2, 450);
                    }
                    return null;
                case -803777417:
                    if (categoryKey.equals("street_dance")) {
                        return new SportCategoryData(categoryKey, kzi.h2, 750);
                    }
                    return null;
                case -793195742:
                    if (categoryKey.equals("parkour")) {
                        return new SportCategoryData(categoryKey, kzi.t1, 670);
                    }
                    return null;
                case -785810185:
                    if (categoryKey.equals("cross_hiking")) {
                        return new SportCategoryData(categoryKey, kzi.R, 50);
                    }
                    return null;
                case -757151180:
                    if (categoryKey.equals("outdoor_skating")) {
                        return new SportCategoryData(categoryKey, kzi.p1, 1250);
                    }
                    return null;
                case -749364199:
                    if (categoryKey.equals("battle_rope")) {
                        return new SportCategoryData(categoryKey, kzi.w, 910);
                    }
                    return null;
                case -748105386:
                    if (categoryKey.equals("archery")) {
                        return new SportCategoryData(categoryKey, kzi.i, 1350);
                    }
                    return null;
                case -732425243:
                    if (categoryKey.equals("snowmobile")) {
                        return new SportCategoryData(categoryKey, kzi.X1, 1290);
                    }
                    return null;
                case -706898072:
                    if (categoryKey.equals("web_swimming")) {
                        return new SportCategoryData(categoryKey, kzi.H2, 600);
                    }
                    return null;
                case -680005414:
                    if (categoryKey.equals("footbag")) {
                        return new SportCategoryData(categoryKey, kzi.L1, 950);
                    }
                    return null;
                case -675439807:
                    if (categoryKey.equals("wrestling")) {
                        return new SportCategoryData(categoryKey, kzi.J2, 850);
                    }
                    return null;
                case -642864709:
                    if (categoryKey.equals("snow_sports")) {
                        return new SportCategoryData(categoryKey, kzi.W1, 1280);
                    }
                    return null;
                case -612129680:
                    if (categoryKey.equals("dumbbell_training")) {
                        return new SportCategoryData(categoryKey, kzi.d0, 240);
                    }
                    return null;
                case -599688756:
                    if (categoryKey.equals("frisbee")) {
                        return new SportCategoryData(categoryKey, kzi.s0, 1420);
                    }
                    return null;
                case -569997260:
                    if (categoryKey.equals("pilates")) {
                        return new SportCategoryData(categoryKey, kzi.v1, 430);
                    }
                    return null;
                case -526241795:
                    if (categoryKey.equals("kickboxing")) {
                        return new SportCategoryData(categoryKey, kzi.Y0, 740);
                    }
                    return null;
                case -522736044:
                    if (categoryKey.equals("extreme_rock_climbing")) {
                        return new SportCategoryData(categoryKey, kzi.h0, 1601);
                    }
                    return null;
                case -436626099:
                    if (categoryKey.equals("free_training")) {
                        return new SportCategoryData(categoryKey, kzi.r0, 130);
                    }
                    return null;
                case -433961545:
                    if (categoryKey.equals("high_interval_training")) {
                        return new SportCategoryData(categoryKey, kzi.D0, 300);
                    }
                    return null;
                case -427356054:
                    if (categoryKey.equals("pingpong")) {
                        return new SportCategoryData(categoryKey, kzi.w1, 1120);
                    }
                    return null;
                case -403230923:
                    if (categoryKey.equals("motorboat")) {
                        return new SportCategoryData(categoryKey, kzi.i1, 590);
                    }
                    return null;
                case -402668470:
                    if (categoryKey.equals("swordswanship")) {
                        return new SportCategoryData(categoryKey, kzi.q2, 980);
                    }
                    return null;
                case -346328179:
                    if (categoryKey.equals("hip_hop_dance")) {
                        return new SportCategoryData(categoryKey, kzi.F0, 810);
                    }
                    return null;
                case -239310106:
                    if (categoryKey.equals("national_dance")) {
                        return new SportCategoryData(categoryKey, kzi.l1, 780);
                    }
                    return null;
                case -155000383:
                    if (categoryKey.equals("equestrian")) {
                        return new SportCategoryData(categoryKey, kzi.f0, 1430);
                    }
                    return null;
                case -112094084:
                    if (categoryKey.equals("canoeing")) {
                        return new SportCategoryData(categoryKey, kzi.K, 540);
                    }
                    return null;
                case -91442467:
                    if (categoryKey.equals("swimming")) {
                        return new SportCategoryData(categoryKey, kzi.o2, 80);
                    }
                    return null;
                case -47030276:
                    if (categoryKey.equals("indoor_fitness")) {
                        return new SportCategoryData(categoryKey, kzi.L0, 460);
                    }
                    return null;
                case -3964758:
                    if (categoryKey.equals("gymnastics")) {
                        return new SportCategoryData(categoryKey, kzi.x0, BuildConfig.MiConnectVersionBuild);
                    }
                    return null;
                case 3304:
                    if (categoryKey.equals("go")) {
                        return new SportCategoryData(categoryKey, kzi.u0, 1570);
                    }
                    return null;
                case 96931:
                    if (categoryKey.equals("atv")) {
                        return new SportCategoryData(categoryKey, kzi.j, 680);
                    }
                    return null;
                case 97677:
                    if (categoryKey.equals("bmx")) {
                        return new SportCategoryData(categoryKey, kzi.A, 1600);
                    }
                    return null;
                case 1767150:
                    if (categoryKey.equals("handball")) {
                        return new SportCategoryData(categoryKey, kzi.y0, 1160);
                    }
                    return null;
                case 3178594:
                    if (categoryKey.equals("golf")) {
                        return new SportCategoryData(categoryKey, kzi.v0, 1060);
                    }
                    return null;
                case 3254967:
                    if (categoryKey.equals("jazz")) {
                        return new SportCategoryData(categoryKey, kzi.T0, 790);
                    }
                    return null;
                case 3273494:
                    if (categoryKey.equals("judo")) {
                        return new SportCategoryData(categoryKey, kzi.U0, 890);
                    }
                    return null;
                case 3452205:
                    if (categoryKey.equals("puck")) {
                        return new SportCategoryData(categoryKey, kzi.y1, 1300);
                    }
                    return null;
                case 3532984:
                    if (categoryKey.equals("sled")) {
                        return new SportCategoryData(categoryKey, kzi.S1, 1340);
                    }
                    return null;
                case 3714672:
                    if (categoryKey.equals("yoga")) {
                        return new SportCategoryData(categoryKey, kzi.K2, 100);
                    }
                    return null;
                case 21336384:
                    if (categoryKey.equals("flexibility_training")) {
                        return new SportCategoryData(categoryKey, kzi.l0, 220);
                    }
                    return null;
                case 30210768:
                    if (categoryKey.equals("rowing_machine")) {
                        return new SportCategoryData(categoryKey, kzi.F1, 280);
                    }
                    return null;
                case 66726872:
                    if (categoryKey.equals("aerobics")) {
                        return new SportCategoryData(categoryKey, kzi.f, 380);
                    }
                    return null;
                case 72104128:
                    if (categoryKey.equals("bowling")) {
                        return new SportCategoryData(categoryKey, kzi.G, 1170);
                    }
                    return null;
                case 93910172:
                    if (categoryKey.equals("bocci")) {
                        return new SportCategoryData(categoryKey, kzi.F, 960);
                    }
                    return null;
                case 94627584:
                    if (categoryKey.equals("chess")) {
                        return new SportCategoryData(categoryKey, kzi.R0, 1550);
                    }
                    return null;
                case 95350707:
                    if (categoryKey.equals("dance")) {
                        return new SportCategoryData(categoryKey, kzi.W, 1480);
                    }
                    return null;
                case 95355092:
                    if (categoryKey.equals("darts")) {
                        return new SportCategoryData(categoryKey, kzi.X, 1360);
                    }
                    return null;
                case 108869083:
                    if (categoryKey.equals("rugby")) {
                        return new SportCategoryData(categoryKey, kzi.G1, 1100);
                    }
                    return null;
                case 109489466:
                    if (categoryKey.equals("skate")) {
                        return new SportCategoryData(categoryKey, kzi.Q1, 650);
                    }
                    return null;
                case 109854462:
                    if (categoryKey.equals("swing")) {
                        return new SportCategoryData(categoryKey, kzi.p2, 1310);
                    }
                    return null;
                case 116262993:
                    if (categoryKey.equals("zumba")) {
                        return new SportCategoryData(categoryKey, kzi.L2, 770);
                    }
                    return null;
                case 223189585:
                    if (categoryKey.equals("martial_arts")) {
                        return new SportCategoryData(categoryKey, kzi.e1, 1010);
                    }
                    return null;
                case 251569249:
                    if (categoryKey.equals("abdwheel_training")) {
                        return new SportCategoryData(categoryKey, kzi.f24449a, 1610);
                    }
                    return null;
                case 293096781:
                    if (categoryKey.equals("paraglider")) {
                        return new SportCategoryData(categoryKey, kzi.r1, 690);
                    }
                    return null;
                case 329103904:
                    if (categoryKey.equals("shuffle_board")) {
                        return new SportCategoryData(categoryKey, kzi.N1, 1320);
                    }
                    return null;
                case 348954353:
                    if (categoryKey.equals("free_sparring")) {
                        return new SportCategoryData(categoryKey, kzi.q0, 1000);
                    }
                    return null;
                case 393745388:
                    if (categoryKey.equals("foosball")) {
                        return new SportCategoryData(categoryKey, kzi.r2, 920);
                    }
                    return null;
                case 394668909:
                    if (categoryKey.equals("football")) {
                        return new SportCategoryData(categoryKey, kzi.n0, 1030);
                    }
                    return null;
                case 421562081:
                    if (categoryKey.equals("sepak_takraw")) {
                        return new SportCategoryData(categoryKey, kzi.M1, 1240);
                    }
                    return null;
                case 424635041:
                    if (categoryKey.equals("backcountry_skiing")) {
                        return new SportCategoryData(categoryKey, kzi.P, 1530);
                    }
                    return null;
                case 474266763:
                    if (categoryKey.equals("switch_just_dance")) {
                        return new SportCategoryData(categoryKey, kzi.m1, 1541);
                    }
                    return null;
                case 498417144:
                    if (categoryKey.equals("parallel_bars")) {
                        return new SportCategoryData(categoryKey, kzi.s1, 350);
                    }
                    return null;
                case 514366922:
                    if (categoryKey.equals("upper_limb_training")) {
                        return new SportCategoryData(categoryKey, kzi.y2, 170);
                    }
                    return null;
                case 662782894:
                    if (categoryKey.equals("taekwondo")) {
                        return new SportCategoryData(categoryKey, kzi.s2, 860);
                    }
                    return null;
                case 691545880:
                    if (categoryKey.equals("snow_car")) {
                        return new SportCategoryData(categoryKey, kzi.V1, 1330);
                    }
                    return null;
                case 724859440:
                    if (categoryKey.equals("weight_lifting")) {
                        return new SportCategoryData(categoryKey, kzi.I2, 390);
                    }
                    return null;
                case 727149765:
                    if (categoryKey.equals("basketball")) {
                        return new SportCategoryData(categoryKey, kzi.v, CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_HBM_TOO_SLOW);
                    }
                    return null;
                case 757193505:
                    if (categoryKey.equals("indoor_riding")) {
                        return new SportCategoryData(categoryKey, kzi.U, 90);
                    }
                    return null;
                case 776971032:
                    if (categoryKey.equals("strength_training")) {
                        return new SportCategoryData(categoryKey, kzi.i2, 150);
                    }
                    return null;
                case 818894478:
                    if (categoryKey.equals("ballroom_dance")) {
                        return new SportCategoryData(categoryKey, kzi.n, 760);
                    }
                    return null;
                case 896775343:
                    if (categoryKey.equals("motion_sensing_game")) {
                        return new SportCategoryData(categoryKey, kzi.Z1, 1450);
                    }
                    return null;
                case 915429645:
                    if (categoryKey.equals("climbing")) {
                        return new SportCategoryData(categoryKey, kzi.j1, 70);
                    }
                    return null;
                case 957401394:
                    if (categoryKey.equals("back_training")) {
                        return new SportCategoryData(categoryKey, kzi.f24451k, 200);
                    }
                    return null;
                case 1032299505:
                    if (categoryKey.equals("cricket")) {
                        return new SportCategoryData(categoryKey, kzi.Q, 1150);
                    }
                    return null;
                case 1118815609:
                    if (categoryKey.equals("walking")) {
                        return new SportCategoryData(categoryKey, kzi.E2, 10);
                    }
                    return null;
                case 1126765110:
                    if (categoryKey.equals("curling")) {
                        return new SportCategoryData(categoryKey, kzi.T, HMSedentaryConfig.DEFAULT_STOP_INDEX);
                    }
                    return null;
                case 1232416071:
                    if (categoryKey.equals("aquatic_sport")) {
                        return new SportCategoryData(categoryKey, kzi.h, 510);
                    }
                    return null;
                case 1242164883:
                    if (categoryKey.equals("kayak_rafting")) {
                        return new SportCategoryData(categoryKey, kzi.X0, 560);
                    }
                    return null;
                case 1306646292:
                    if (categoryKey.equals("climb_stairs")) {
                        return new SportCategoryData(categoryKey, kzi.M, 310);
                    }
                    return null;
                case 1318704425:
                    if (categoryKey.equals("softball")) {
                        return new SportCategoryData(categoryKey, kzi.Y1, Constants.FHD_WIDTH);
                    }
                    return null;
                case 1397699474:
                    if (categoryKey.equals("cross_fit")) {
                        return new SportCategoryData(categoryKey, kzi.S, 230);
                    }
                    return null;
                case 1404984809:
                    if (categoryKey.equals("lower_limb_training")) {
                        return new SportCategoryData(categoryKey, kzi.d1, 180);
                    }
                    return null;
                case 1422748246:
                    if (categoryKey.equals("dodgeball")) {
                        return new SportCategoryData(categoryKey, kzi.Z, 1270);
                    }
                    return null;
                case 1459010388:
                    if (categoryKey.equals("wall_ball")) {
                        return new SportCategoryData(categoryKey, kzi.F2, 440);
                    }
                    return null;
                case 1550783935:
                    if (categoryKey.equals("running")) {
                        return new SportCategoryData(categoryKey, kzi.J1, 20);
                    }
                    return null;
                case 1719380627:
                    if (categoryKey.equals("modern_dance")) {
                        return new SportCategoryData(categoryKey, kzi.h1, 835);
                    }
                    return null;
                case 1737305531:
                    if (categoryKey.equals("outdoor_hiking")) {
                        return new SportCategoryData(categoryKey, kzi.E0, 30);
                    }
                    return null;
                case 1738059891:
                    if (categoryKey.equals("break_dance")) {
                        return new SportCategoryData(categoryKey, kzi.I, 830);
                    }
                    return null;
                case 1742895257:
                    if (categoryKey.equals("e_sports")) {
                        return new SportCategoryData(categoryKey, kzi.g0, CommonConstants.Mgc.PAGE_SIZE_ERROR);
                    }
                    return null;
                case 1756460459:
                    if (categoryKey.equals("board_game")) {
                        return new SportCategoryData(categoryKey, kzi.D, 1590);
                    }
                    return null;
                case 1761682954:
                    if (categoryKey.equals("belly_dance")) {
                        return new SportCategoryData(categoryKey, kzi.z, 710);
                    }
                    return null;
                case 1780144841:
                    if (categoryKey.equals("beach_football")) {
                        return new SportCategoryData(categoryKey, kzi.x, 1220);
                    }
                    return null;
                case 1796459705:
                    if (categoryKey.equals("waist_training")) {
                        return new SportCategoryData(categoryKey, kzi.A2, SportReportBaseParser.ReportType.maxWaterTemperature);
                    }
                    return null;
                case 1827650754:
                    if (categoryKey.equals("billiards")) {
                        return new SportCategoryData(categoryKey, kzi.B, 1190);
                    }
                    return null;
                case 1857067185:
                    if (categoryKey.equals("sailboat")) {
                        return new SportCategoryData(categoryKey, kzi.K1, 470);
                    }
                    return null;
                case 1920367559:
                    if (categoryKey.equals("driving")) {
                        return new SportCategoryData(categoryKey, kzi.c0, 610);
                    }
                    return null;
                case 1961304554:
                    if (categoryKey.equals("water_polo")) {
                        return new SportCategoryData(categoryKey, kzi.G2, 500);
                    }
                    return null;
                case 1970494274:
                    if (categoryKey.equals("physical_training")) {
                        return new SportCategoryData(categoryKey, kzi.u1, 160);
                    }
                    return null;
                case 2004389031:
                    if (categoryKey.equals("rock_climbing")) {
                        return new SportCategoryData(categoryKey, kzi.B1, GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH);
                    }
                    return null;
                case 2022491735:
                    if (categoryKey.equals("horse_riding")) {
                        return new SportCategoryData(categoryKey, kzi.I0, 1370);
                    }
                    return null;
                case 2023388504:
                    if (categoryKey.equals("outdoor_riding")) {
                        return new SportCategoryData(categoryKey, kzi.V, 60);
                    }
                    return null;
                case 2035630545:
                    if (categoryKey.equals("paddle_board")) {
                        return new SportCategoryData(categoryKey, kzi.q1, 490);
                    }
                    return null;
                case 2050269851:
                    if (categoryKey.equals("muay_thai")) {
                        return new SportCategoryData(categoryKey, kzi.k1, 880);
                    }
                    return null;
                case 2099843671:
                    if (categoryKey.equals("sit_ups")) {
                        return new SportCategoryData(categoryKey, kzi.P1, 420);
                    }
                    return null;
                default:
                    return null;
            }
        }

        public final boolean isRunning(int type) {
            return type == 3 || type == 1;
        }

        public final boolean isSwimming(int type) {
            return type == 10 || type == 9 || type == 111;
        }

        public final boolean isWalking(int type) {
            return type == 2 || type == 333;
        }

        public final boolean showCount(@NotNull String sportCategory) {
            Intrinsics.checkNotNullParameter(sportCategory, "sportCategory");
            return Intrinsics.areEqual(sportCategory, "abdwheel_training") || Intrinsics.areEqual(sportCategory, "dumbbell_training");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:25:0x004b A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:26:0x004d A[ORIG_RETURN, RETURN] */
        public final boolean showDistance(@NotNull String sportCategory) {
            Intrinsics.checkNotNullParameter(sportCategory, "sportCategory");
            switch (sportCategory) {
                case "cross_hiking":
                case "swimming":
                case "climbing":
                case "walking":
                case "running":
                case "outdoor_hiking":
                case "outdoor_riding":
                    return true;
                default:
                    return false;
            }
        }
    }
}
