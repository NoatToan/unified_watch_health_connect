package com.huami.mifit.sportlib.common;

import android.text.TextUtils;
import com.huami.mifit.sportlib.logkit.LogKit;
import com.huami.watch.companion.device.DeviceSource;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class DataTypeSource {
    public static final int BRACELET = 0;
    public static final String CHAOHU = "CHAOHU";
    public static final String EARPHONE = "EP";
    public static final String FORE_FEET_SHOES = "LN-3";
    public static final int GPS_LOST_METER = 200;
    public static final int GPS_LOST_TIME = 20;
    public static final int MASK_ACC = -1;
    public static final float MASK_ALTITUDE = -20000.0f;
    public static final int MASK_ALTITUDE_ASCEND = -1;
    public static final int MASK_ALTITUDE_DESCEND = -1;
    public static final int MASK_AVG_CADENCE = -1;
    public static final int MASK_AVG_STEP_FREQUENCY = -1;
    public static final int MASK_AVG_STRIDE_LENGTH = -1;
    public static final float MASK_BAR = -1.0f;
    public static final int MASK_CLIMB_DISASCEND = -1;
    public static final int MASK_CLIMB_DIS_ASCEND_TIME = -1;
    public static final int MASK_CLIMB_DIS_DESCEND = -1;
    public static final int MASK_CLIMB_DIS_DESCEND_TIME = -1;
    public static final int MASK_FLIGHT_RATIO = -1;
    public static final int MASK_FOREFOOT_RATIO = -1;
    public static final int MASK_GPS_STATUS = 0;
    public static final int MASK_HR = -1;
    public static final int MASK_LANDING_TIME = -1;
    public static final double MASK_LAT_LON = 181.0d;
    public static final int MASK_MAX_CADENCE = -1;
    public static final double MASK_MAX_PACE = -1.0d;
    public static final double MASK_MIN_PACE = -1.0d;
    public static final int MASK_STEP = -1;
    public static final int MASK_TOTAL_STEP = -1;
    public static final int MAX_PACE_SECOND = 1800;
    public static final int MAX_PACE_SECOND_VALID = 18000;
    public static final float MAX_VALID_PACE = 1.8f;
    public static final String MILI = "MILI";
    public static final int ROPESKIPPING = 1;
    public static final int RUNNING = 4;
    public static final int RUNNING_VERSION = 12;
    public static final int RUNNING_VERSION_13 = 13;
    public static final int RUNNING_VERSION_14 = 14;
    public static final int RUNNING_VERSION_15 = 15;
    public static final int RUNNING_VERSION_16 = 16;
    public static final int RUNNING_VERSION_LAST = 11;
    public static final int RUNNING_VERSION_OLD = 3;
    public static final int RUN_SOURCE_BASE_OFFSET = 100;
    public static final int RUN_SOURCE_BEATS = 6;
    public static final int RUN_SOURCE_BEATS_P = 7;
    public static final int RUN_SOURCE_CHAOHU = 2;
    public static final int RUN_SOURCE_CHONGQING = 9;
    public static final int RUN_SOURCE_CINCO = 123;
    public static final int RUN_SOURCE_CROSSFIT_ADVANCE = 21;
    public static final int RUN_SOURCE_CROSSFIT_ENTRY = 20;
    public static final int RUN_SOURCE_DONGTINGHU = 10;
    public static final int RUN_SOURCE_PHONE = 0;
    public static final int RUN_SOURCE_SIMPLYFIT_GPS = 22;
    public static final int RUN_SOURCE_TEMPO = 3;
    public static final int RUN_SOURCE_TIMEX_SMART = 23;
    public static final int RUN_SOURCE_WATCH = 1;
    public static final int RUN_SOURCE_WATCH_EVERREST = 4;
    public static final int RUN_SOURCE_WATCH_EVERREST_2 = 35;
    public static final int RUN_SOURCE_WATCH_EVERREST_S = 5;
    public static final int RUN_SOURCE_WATCH_QOGIR = 11;
    public static final int RUN_SOURCE_WATCH_XIHU = 31;
    public static final int RUN_SOURCE_WATCH_XIHU_E = 32;
    public static final int RUN_SOURCE_WATCH_XIHU_EA = 33;
    public static final int RUN_SOURCE_WATCH_XIHU_MARVEL = 34;
    public static final int RUN_SOURCE_WUHAN = 8;
    public static final int RUN_TYPE_CALORIE = 4;
    public static final int RUN_TYPE_CROSSCOUNTRY = 7;
    public static final int RUN_TYPE_DISTANCE = 2;
    public static final int RUN_TYPE_INDOOR = 8;
    public static final int RUN_TYPE_INTERVAL = 5;
    public static final int RUN_TYPE_OUTDOOR = 1;
    public static final int RUN_TYPE_STRIDES = 6;
    public static final int RUN_TYPE_TIME = 3;
    public static final int SENSORHUB_STEP = 3;
    public static final String SHOES = "LN";
    public static final int SITUPS = 2;
    public static final int SOURCE_1A = 5;
    public static final int SOURCE_1S = 4;
    public static final int SOURCE_DEFAULT = 0;
    public static final int SOURCE_IGNORE = -1;
    public static final int SOURCE_SENSORHUB = 2;
    public static final int SPORT_CHILD_TYPE_BIKE = 1009;
    public static final int SPORT_CHILD_TYPE_RUN = 1001;
    public static final int SPORT_CHILD_TYPE_SWIM = 1015;
    public static final int SPORT_MIX_TYPE_TRIATHLON = 2001;
    public static final int SPORT_TYPE_AEROBICS = 109;
    public static final int SPORT_TYPE_ALPINE_SKIING = 43;
    public static final int SPORT_TYPE_ANY = 32;
    public static final int SPORT_TYPE_ANY_GPS = 33;
    public static final int SPORT_TYPE_ARCHERY = 93;
    public static final int SPORT_TYPE_ATV = 190;
    public static final int SPORT_TYPE_BADMINTON = 92;
    public static final int SPORT_TYPE_BALLET_DANCE = 71;
    public static final int SPORT_TYPE_BASEBALL = 79;
    public static final int SPORT_TYPE_BASKETBALL = 85;
    public static final int SPORT_TYPE_BATTLE_ROPE = 167;
    public static final int SPORT_TYPE_BEACH_SOCCER = 121;
    public static final int SPORT_TYPE_BEACH_VOLLEYBALL = 122;
    public static final int SPORT_TYPE_BELLY_DANCE = 72;
    public static final int SPORT_TYPE_BIATHLON = 128;
    public static final int SPORT_TYPE_BIKE = 9;
    public static final int SPORT_TYPE_BIKE_INDOOR_RIDE = 10;
    public static final int SPORT_TYPE_BILLIARDS = 151;
    public static final int SPORT_TYPE_BMX = 48;
    public static final int SPORT_TYPE_BOARD_GAMES = 177;
    public static final int SPORT_TYPE_BOARD_SKIING = 42;
    public static final int SPORT_TYPE_BOULDERING = 184;
    public static final int SPORT_TYPE_BOWLING = 80;
    public static final int SPORT_TYPE_BOXING = 97;
    public static final int SPORT_TYPE_BREAK_DANCING = 168;
    public static final int SPORT_TYPE_BRIDGE = 176;
    public static final int SPORT_TYPE_BUNGEE_JUMPING = 182;
    public static final int SPORT_TYPE_CHECKERS = 174;
    public static final int SPORT_TYPE_CHESS = 173;
    public static final int SPORT_TYPE_CLIMBING_STAIRS = 108;
    public static final int SPORT_TYPE_CLIMBING_TRAINING = 54;
    public static final int SPORT_TYPE_COACHING = 30;
    public static final int SPORT_TYPE_CORE_TRAINING = 50;
    public static final int SPORT_TYPE_CRICKET_BALL = 78;
    public static final int SPORT_TYPE_CROSSFIT = 31;
    public static final int SPORT_TYPE_CROSS_COUNTRY_SKIING = 46;
    public static final int SPORT_TYPE_CROSS_DOUBLE_SKIING = 105;
    public static final int SPORT_TYPE_CROSS_TRAINING = 130;
    public static final int SPORT_TYPE_CURLING = 41;
    public static final int SPORT_TYPE_DANCE = 76;
    public static final int SPORT_TYPE_DARTS = 117;
    public static final int SPORT_TYPE_DISCO = 186;
    public static final int SPORT_TYPE_DODGE_BALL = 153;
    public static final int SPORT_TYPE_DOWNHILL = 181;
    public static final int SPORT_TYPE_DRAGON_BOAT = 138;
    public static final int SPORT_TYPE_DRIFTING = 123;
    public static final int SPORT_TYPE_DRIVE = 132;
    public static final int SPORT_TYPE_ELLIPTICAL_TRAINER = 12;
    public static final int SPORT_TYPE_EQUESTIAN = 94;
    public static final int SPORT_TYPE_E_SPORTS = 189;
    public static final int SPORT_TYPE_FENCING = 95;
    public static final int SPORT_TYPE_FENCING_INDOOR = 148;
    public static final int SPORT_TYPE_FIN_SWIMMING = 155;
    public static final int SPORT_TYPE_FISHING = 64;
    public static final int SPORT_TYPE_FLEXIBLE_TRAINING = 55;
    public static final int SPORT_TYPE_FLOOR_BALL = 188;
    public static final int SPORT_TYPE_FLY_A_KITE = 118;
    public static final int SPORT_TYPE_FOLK_DANCE = 146;
    public static final int SPORT_TYPE_FOOTBALL = 82;
    public static final int SPORT_TYPE_FREE_SPARRING = 104;
    public static final int SPORT_TYPE_FREE_TRAINING = 56;
    public static final int SPORT_TYPE_FRISBEE = 116;
    public static final int SPORT_TYPE_FUJIKI = 152;
    public static final int SPORT_TYPE_GATEBALL = 87;
    public static final int SPORT_TYPE_GO = 175;
    public static final int SPORT_TYPE_GOLF = 83;
    public static final int SPORT_TYPE_GOLF_SWING = 84;
    public static final int SPORT_TYPE_GROUND_THROW = 170;
    public static final int SPORT_TYPE_GROUP_CALISTHENICS = 111;
    public static final int SPORT_TYPE_GYMNASTICS = 59;
    public static final int SPORT_TYPE_HANDBALL = 91;
    public static final int SPORT_TYPE_HIGH_INTENSITY_TRAINING = 49;
    public static final int SPORT_TYPE_HIKING = 22;
    public static final int SPORT_TYPE_HIP_HOP = 165;
    public static final int SPORT_TYPE_HOCKEY_BALL = 90;
    public static final int SPORT_TYPE_HORIZONTAL_BAR = 149;
    public static final int SPORT_TYPE_HUNTING = 63;
    public static final int SPORT_TYPE_HU_LA_HOOP = 115;
    public static final int SPORT_TYPE_ICE_HOCKEY = 158;
    public static final int SPORT_TYPE_INDOOR_FITNESS = 24;
    public static final int SPORT_TYPE_INDOOR_FOOTBALL = 164;
    public static final int SPORT_TYPE_INDOOR_SKATING = 45;
    public static final int SPORT_TYPE_INDOOR_SURFING = 172;
    public static final int SPORT_TYPE_INDOOR_WALK = 40;
    public static final int SPORT_TYPE_JAI_LI_BALL = 171;
    public static final int SPORT_TYPE_JAZZ = 113;
    public static final int SPORT_TYPE_JUDO = 98;
    public static final int SPORT_TYPE_JUJITSU = 147;
    public static final int SPORT_TYPE_KARATE = 96;
    public static final int SPORT_TYPE_KAYAK = 140;
    public static final int SPORT_TYPE_KICKBOXING = 114;
    public static final int SPORT_TYPE_KICK_SHUTTLECOCK = 120;
    public static final int SPORT_TYPE_KITE_SURFING = 106;
    public static final int SPORT_TYPE_LATIN_DANCE = 112;
    public static final int SPORT_TYPE_MARTIAL_ARTS = 103;
    public static final int SPORT_TYPE_MIXED_AEROBIC = 51;
    public static final int SPORT_TYPE_MODERN_DANCE = 185;
    public static final int SPORT_TYPE_MOTORBOAT = 124;
    public static final int SPORT_TYPE_MOUNTAINEERING = 13;
    public static final int SPORT_TYPE_MOUNTAIN_RIDING = 47;
    public static final int SPORT_TYPE_MUAY_THAI = 101;
    public static final int SPORT_TYPE_MULTI = 2002;
    public static final int SPORT_TYPE_NO_GPS_SOCCER = 191;
    public static final int SPORT_TYPE_OFF_ROAD_MOTORCYCLE = 137;
    public static final int SPORT_TYPE_ORIENTEERING = 110;
    public static final int SPORT_TYPE_ORIENTEERING_SKIING = 127;
    public static final int SPORT_TYPE_OUTDOOR_BOATING = 107;
    public static final int SPORT_TYPE_OUTDOOR_ROWING = 66;
    public static final int SPORT_TYPE_OUTDOOR_SKATING = 44;
    public static final int SPORT_TYPE_PADDLE_SURFING = 68;
    public static final int SPORT_TYPE_PARAGLIDING = 133;
    public static final int SPORT_TYPE_PARALLEL_BARS = 150;
    public static final int SPORT_TYPE_PARKOUR = 129;
    public static final int SPORT_TYPE_PILATES = 61;
    public static final int SPORT_TYPE_PINGPONG = 89;
    public static final int SPORT_TYPE_POLE_DANCING = 166;
    public static final int SPORT_TYPE_POLO = 142;
    public static final int SPORT_TYPE_RACE_WALKING = 131;
    public static final int SPORT_TYPE_ROCK_CLIMBING = 70;
    public static final int SPORT_TYPE_ROLLER_SKATING = 69;
    public static final int SPORT_TYPE_ROPE_SKIPPING = 21;
    public static final int SPORT_TYPE_ROUTE_RUN = 26;
    public static final int SPORT_TYPE_ROWING = 141;
    public static final int SPORT_TYPE_ROWING_MACHINE = 23;
    public static final int SPORT_TYPE_RUN_PLAYGROUND = 192;
    public static final int SPORT_TYPE_SAILING = 65;
    public static final int SPORT_TYPE_SANDBAG_BALL = 169;
    public static final int SPORT_TYPE_SHOOT = 179;
    public static final int SPORT_TYPE_SHUFFLEBOARD = 160;
    public static final int SPORT_TYPE_SHUTTLECOCK = 162;
    public static final int SPORT_TYPE_SKATEBOARDING = 67;
    public static final int SPORT_TYPE_SKI = 11;
    public static final int SPORT_TYPE_SKYDIVING = 180;
    public static final int SPORT_TYPE_SLED = 126;
    public static final int SPORT_TYPE_SNORKELING = 157;
    public static final int SPORT_TYPE_SNOWMOBILE = 125;
    public static final int SPORT_TYPE_SNOWSHOE_HIKING = 178;
    public static final int SPORT_TYPE_SNOW_MOBILE = 136;
    public static final int SPORT_TYPE_SOCCER = 18;
    public static final int SPORT_TYPE_SOCIAL_DANCE = 75;
    public static final int SPORT_TYPE_SOFTBALL = 86;
    public static final int SPORT_TYPE_SOMATOSENSORY_GAME = 163;
    public static final int SPORT_TYPE_SPINNING_BIKE = 143;
    public static final int SPORT_TYPE_SQUARE_DANCE = 73;
    public static final int SPORT_TYPE_SQUASH_BALL = 81;
    public static final int SPORT_TYPE_STEPPER = 58;
    public static final int SPORT_TYPE_STEP_TRAINING = 57;
    public static final int SPORT_TYPE_STREET_DANCE = 74;
    public static final int SPORT_TYPE_STRENGTH_TRAINING = 52;
    public static final int SPORT_TYPE_STRETCH_TRAINING = 53;
    public static final int SPORT_TYPE_SURFING = 62;
    public static final int SPORT_TYPE_SWIM_INDOOR = 14;
    public static final int SPORT_TYPE_SWIM_OUTDOOR = 15;
    public static final int SPORT_TYPE_SWING = 159;
    public static final int SPORT_TYPE_SYNCHRONIZED_SWIMMING = 156;
    public static final int SPORT_TYPE_TABLE_FOOTBALL = 161;
    public static final int SPORT_TYPE_TAEKWONDO = 102;
    public static final int SPORT_TYPE_TAICHI = 100;
    public static final int SPORT_TYPE_TAP_DANCE = 187;
    public static final int SPORT_TYPE_TENNIS = 17;
    public static final int SPORT_TYPE_THRADMILL_RUN = 25;
    public static final int SPORT_TYPE_TRAMPOLINE = 183;
    public static final int SPORT_TYPE_TUG_OF_WAR = 119;
    public static final int SPORT_TYPE_VOLLEYBALL = 88;
    public static final int SPORT_TYPE_WALKING_MACHINE = 144;
    public static final int SPORT_TYPE_WALL_BALL = 145;
    public static final int SPORT_TYPE_WATER_POLO = 154;
    public static final int SPORT_TYPE_WATER_SKIING = 139;
    public static final int SPORT_TYPE_WORKOUT = 16;
    public static final int SPORT_TYPE_WRESTLING = 99;
    public static final int SPORT_TYPE_YOGA = 60;
    public static final int SPORT_TYPE_ZUMBA_DANCE = 77;
    public static final int STATISTICS_STATE_FINISH = 1;
    public static final int STATISTICS_STATE_UNDO = 0;
    public static final String TEMPO = "TEMPO";
    public static final int TYPE_BRACELET = 0;
    public static final int TYPE_MERGED = -1;
    public static final int TYPE_SENSORHUB = 2;
    public static final int TYPE_SHOES = 3;
    public static final int TYPE_SUMMARY_DEFAULT = -1;
    public static final int TYPE_SUMMARY_HR = 1;
    public static final int TYPE_WEIGHT = 1;
    public static final int VALUE_DEFAULT = -1;
    private static final String c = "run.%d.huami.com";
    private static boolean d = false;
    private static boolean e = false;
    private int a;
    private int b;

    public enum RunSource {
        RUN_SOURCE_DEFAULT(-1, ""),
        RUN_SOURCE_PHONE(0, "run.mifit.huami.com"),
        RUN_SOURCE_WATCH(1, DeviceSource.DATA_SOURCE_HUANGHE),
        RUN_SOURCE_CHAOHU(2, "run.chaohu.huami.com"),
        RUN_SOURCE_TEMPO(3, "run.tempo.huami.com"),
        RUN_SOURCE_WATCH_2(4, DeviceSource.DATA_SOURCE_EVEREST),
        RUN_SOURCE_WATCH_2S(5, DeviceSource.DATA_SOURCE_EVEREST_S),
        RUN_SOURCE_BEATS(6, "run.beats.huami.com"),
        RUN_SOURCE_BEATS_P(7, "run.beatsp.huami.com"),
        RUN_SOURCE_WUHAN(8, "run.wuhan.huami.com"),
        RUN_SOURCE_CHONGQING(9, "run.chongqing.huami.com"),
        RUN_SOURCE_DONGTINGHU(10, "run.dongtinghu.huami.com"),
        RUN_SOURCE_WATCH_QOGIR(11, DeviceSource.DATA_SOURCE_QOGIR),
        RUN_SOURCE_SIMPLYFIT_GPS(22, "run.simplefit.gps.timex.com"),
        RUN_SOURCE_CROSSFIT_ENTRY(20, "run.crossfit.entry.timex.com"),
        RUN_SOURCE_CROSSFIT_ADVANCE(21, "run.crossfit.advanced.timex.com"),
        RUN_SOURCE_TIMEX_SMART(23, "run.smart.timex.com"),
        RUN_SOURCE_WATCH_XIHU(31, DeviceSource.DATA_SOURCE_XIHU),
        RUN_SOURCE_WATCH_XIHU_E(32, DeviceSource.DATA_SOURCE_XIHUE),
        RUN_SOURCE_WATCH_XIHU_EA(33, DeviceSource.DATA_SOURCE_XIHUEA),
        RUN_SOURCE_WATCH_XIHU_MARVEL(34, DeviceSource.DATA_SOURCE_XIHU_DISNEY),
        RUN_SOURCE_WATCH_EVERREST_2(35, "run.watch.everest2.huami.com");

        private String source;
        private int value;

        RunSource(int i, String str) {
            this.value = i;
            this.source = str;
        }

        public static String getSourceByValue(int i) {
            if (i > 100) {
                return String.format(Locale.ENGLISH, DataTypeSource.c, Integer.valueOf(i - 100));
            }
            for (RunSource runSource : values()) {
                if (runSource.getValue() == i) {
                    return runSource.getSource();
                }
            }
            return RUN_SOURCE_DEFAULT.getSource();
        }

        public static int getValueBySource(String str) {
            for (RunSource runSource : values()) {
                if (runSource.getSource().equals(str)) {
                    return runSource.getValue();
                }
            }
            if (!TextUtils.isEmpty(str)) {
                String[] strArrSplit = str.split("\\.");
                if (strArrSplit.length == 4) {
                    try {
                        return Integer.parseInt(strArrSplit[1]) + 100;
                    } catch (NumberFormatException unused) {
                        LogKit.w2f("DataTypeSource", "invalid run source!!");
                    }
                }
            }
            return RUN_SOURCE_DEFAULT.getValue();
        }

        public String getSource() {
            return this.source;
        }

        public int getValue() {
            return this.value;
        }

        public void setRunSourcePhone(int i, String str) {
            RunSource runSource = RUN_SOURCE_PHONE;
            runSource.value = i;
            runSource.source = str;
        }
    }

    public DataTypeSource() {
        this.a = 0;
        this.b = 0;
    }

    public static boolean isCreateTestPoint() {
        return e;
    }

    public static boolean isCyclingSport(int i) {
        return i == 9 || i == 10 || i == 12;
    }

    public static boolean isDrawRealGPSLine() {
        return d;
    }

    public static boolean isGPSSportType(int i) {
        return i == 4;
    }

    public static boolean isIndoorRun(int i) {
        return i == 8;
    }

    public static boolean isIndoorSport(int i) {
        return i == 8 || i == 10 || i == 12;
    }

    public static boolean isLabType(int i) {
        return i == 2 || i == 1;
    }

    public static boolean isNeedGpsListener(int i) {
        return i != 8;
    }

    public static boolean isSportType(int i) {
        return i == 4 || i == 2 || i == 1;
    }

    public static boolean isSwimSport(int i) {
        return i == 15 || i == 1015 || i == 14 || i == 155 || i == 156;
    }

    public static void setCreateTestPoint(boolean z) {
        e = z;
    }

    public static void setIsDrawRealGPSLine(boolean z) {
        d = z;
    }

    public int getSource() {
        return this.b;
    }

    public int getType() {
        return this.a;
    }

    public DataTypeSource(int i) {
        this.a = 0;
        this.b = 0;
        this.a = i;
    }

    public DataTypeSource(int i, int i2) {
        this.a = 0;
        this.b = 0;
        this.a = i;
        this.b = i2;
    }
}
