package com.huami.watch.companion.sport.utils;

import android.graphics.Color;
import com.huami.watch.companion.device.DeviceSource;

/* JADX INFO: loaded from: classes16.dex */
public enum SportType {
    OUTDOOR(1),
    STRIDES(6),
    BIKE(9),
    SWIM_INDOOR(14),
    SWIM_OPEN(15),
    INDOOR(8),
    BIKE_INDOOR_RIDE(10),
    ELLIPTICAL_TRAINER(12),
    HIKING(22),
    MOUNTAINEERING(13),
    CROSSCOUNTRY(7),
    TRIATHLON(2001),
    SKIING(11),
    TENNIS(17),
    SOCCER(18),
    MULTISPORT(2002),
    ROPE_SKIPPING(21),
    ROWING(23),
    INDOOR_FITNESS(24);

    public static final int SPORT_CHILD_TYPE_BIKE = 1009;
    public static final int SPORT_CHILD_TYPE_RUN = 1001;
    public static final int SPORT_CHILD_TYPE_SWIM = 1015;
    public static final int SPORT_MIX_TYPE_TRIATHLON = 2001;
    public static final int SPORT_TYPE_ALL = 0;
    public static final int SPORT_TYPE_ALPINE_SKIING = 43;
    public static final int SPORT_TYPE_ANY = 32;
    public static final int SPORT_TYPE_ANY_GPS = 33;
    public static final int SPORT_TYPE_ARCHERY = 93;
    public static final int SPORT_TYPE_BADMINTON = 92;
    public static final int SPORT_TYPE_BALLET_DANCE = 71;
    public static final int SPORT_TYPE_BASEBALL = 79;
    public static final int SPORT_TYPE_BASKETBALL = 85;
    public static final int SPORT_TYPE_BELLY_DANCE = 72;
    public static final int SPORT_TYPE_BIKE = 9;
    public static final int SPORT_TYPE_BIKE_INDOOR = 10;
    public static final int SPORT_TYPE_BMX = 48;
    public static final int SPORT_TYPE_BOARD_SKIING = 42;
    public static final int SPORT_TYPE_BOWLING = 80;
    public static final int SPORT_TYPE_BOXING = 97;
    public static final int SPORT_TYPE_CLIMBING_TRAINING = 54;
    public static final int SPORT_TYPE_COACHING = 30;
    public static final int SPORT_TYPE_CORE_TRAINING = 50;
    public static final int SPORT_TYPE_CRICKET_BALL = 78;
    public static final int SPORT_TYPE_CROSSCOUNTRY = 7;
    public static final int SPORT_TYPE_CROSSFIT = 31;
    public static final int SPORT_TYPE_CROSS_COUNTRY_SKIING = 46;
    public static final int SPORT_TYPE_CROSS_DOUBLE_SKIING = 105;
    public static final int SPORT_TYPE_CURLING = 41;
    public static final int SPORT_TYPE_DANCE = 76;
    public static final int SPORT_TYPE_ELLIPTICAL_TRAINER = 12;
    public static final int SPORT_TYPE_EQUESTIAN = 94;
    public static final int SPORT_TYPE_FENCING = 95;
    public static final int SPORT_TYPE_FISHING = 64;
    public static final int SPORT_TYPE_FLEXIBLE_TRAINING = 55;
    public static final int SPORT_TYPE_FOOTBALL = 82;
    public static final int SPORT_TYPE_FREE_SPARRING = 104;
    public static final int SPORT_TYPE_GATEBALL = 87;
    public static final int SPORT_TYPE_GOLF = 83;
    public static final int SPORT_TYPE_GOLF_SWING = 84;
    public static final int SPORT_TYPE_GYMNASTICS = 59;
    public static final int SPORT_TYPE_HANDBALL = 91;
    public static final int SPORT_TYPE_HIGH_INTENSITY_TRAINING = 49;
    public static final int SPORT_TYPE_HIKING = 22;
    public static final int SPORT_TYPE_HOCKEY_BALL = 90;
    public static final int SPORT_TYPE_HUNTING = 63;
    public static final int SPORT_TYPE_INDOOR_FITNESS = 24;
    public static final int SPORT_TYPE_INDOOR_RUN = 8;
    public static final int SPORT_TYPE_INDOOR_SKATING = 45;
    public static final int SPORT_TYPE_INDOOR_WALK = 40;
    public static final int SPORT_TYPE_JUDO = 98;
    public static final int SPORT_TYPE_KARATE = 96;
    public static final int SPORT_TYPE_MARTIAL_ARTS = 103;
    public static final int SPORT_TYPE_MIXED_AEROBIC = 51;
    public static final int SPORT_TYPE_MOUNTAINEERING = 13;
    public static final int SPORT_TYPE_MOUNTAIN_RIDING = 47;
    public static final int SPORT_TYPE_MUAY_THAI = 101;
    public static final int SPORT_TYPE_MULTI = 2002;
    public static final int SPORT_TYPE_OUTDOOR_ROWING = 66;
    public static final int SPORT_TYPE_OUTDOOR_RUN = 1;
    public static final int SPORT_TYPE_OUTDOOR_SKATING = 44;
    public static final int SPORT_TYPE_PADDLE_SURFING = 68;
    public static final int SPORT_TYPE_PILATES = 61;
    public static final int SPORT_TYPE_PINGPONG = 89;
    public static final int SPORT_TYPE_ROCK_CLIMBING = 70;
    public static final int SPORT_TYPE_ROLLER_SKATING = 69;
    public static final int SPORT_TYPE_ROPE_SKIPPING = 21;
    public static final int SPORT_TYPE_ROUTE_RUN = 26;
    public static final int SPORT_TYPE_ROWING_MACHINE = 23;
    public static final int SPORT_TYPE_SAILING = 65;
    public static final int SPORT_TYPE_SKATEBOARDING = 67;
    public static final int SPORT_TYPE_SKIING = 11;
    public static final int SPORT_TYPE_SOCCER = 18;
    public static final int SPORT_TYPE_SOCIAL_DANCE = 75;
    public static final int SPORT_TYPE_SOFTBALL = 86;
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
    public static final int SPORT_TYPE_TAEKWONDO = 102;
    public static final int SPORT_TYPE_TAICHI = 100;
    public static final int SPORT_TYPE_TENNIS = 17;
    public static final int SPORT_TYPE_THRADMILL_RUN = 25;
    public static final int SPORT_TYPE_VOLLEYBALL = 88;
    public static final int SPORT_TYPE_WALKING = 6;
    public static final int SPORT_TYPE_WORK_OUT = 16;
    public static final int SPORT_TYPE_WRESTLING = 99;
    public static final int SPORT_TYPE_YOGA = 60;
    public static final int SPORT_TYPE_ZUMBA_DANCE = 77;
    public int type;

    SportType(int i) {
        this.type = i;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0035  */
    /* JADX WARN: Code duplicated, block: B:28:0x003e  */
    public static int getFocusColor(int i) {
        String str;
        if (isChildSportType(i)) {
            i -= 1000;
        }
        if (i == 1) {
            str = "#FFE0402D";
        } else if (i == 17 || i == 18) {
            str = "#FF9ACC00";
        } else if (i == 21) {
            str = "#FFF2B41D";
        } else if (i != 22) {
            if (i != 2001 && i != 2002) {
                switch (i) {
                    case 6:
                    case 12:
                        str = "#FF24C74E";
                        break;
                    case 7:
                    case 8:
                        str = "#FFE0402D";
                        break;
                    case 9:
                    case 10:
                        str = "#FF25BEE3";
                        break;
                    case 11:
                    case 14:
                    case 15:
                        str = "#FF3B8CFF";
                        break;
                    case 13:
                        str = "#FFE93461";
                        break;
                    default:
                        str = "#FF000000";
                        break;
                }
            } else {
                str = "#FF6E58E7";
            }
        } else {
            str = "#FFE93461";
        }
        return Color.parseColor(str);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0035  */
    /* JADX WARN: Code duplicated, block: B:28:0x003e  */
    public static int getNormalColor(int i) {
        String str;
        if (isChildSportType(i)) {
            i -= 1000;
        }
        if (i == 1) {
            str = "#7FE0402D";
        } else if (i == 17 || i == 18) {
            str = "#7F9ACC00";
        } else if (i == 21) {
            str = "#7FF2B41D";
        } else if (i != 22) {
            if (i != 2001 && i != 2002) {
                switch (i) {
                    case 6:
                    case 12:
                        str = "#7F24C74E";
                        break;
                    case 7:
                    case 8:
                        str = "#7FE0402D";
                        break;
                    case 9:
                    case 10:
                        str = "#7F25BEE3";
                        break;
                    case 11:
                    case 14:
                    case 15:
                        str = "#7F3B8CFF";
                        break;
                    case 13:
                        str = "#7FE93461";
                        break;
                    default:
                        str = "#7F000000";
                        break;
                }
            } else {
                str = "#7F6E58E7";
            }
        } else {
            str = "#7FE93461";
        }
        return Color.parseColor(str);
    }

    public static boolean isChildSportType(int i) {
        return i > 1000 && i < 2000;
    }

    public static boolean isComplexSportType(int i) {
        return i >= 2001;
    }

    public static boolean isShowAltitude(int i) {
        if (isChildSportType(i)) {
            i -= 1000;
        }
        return i == 1 || i == 9 || i == 7 || i == 13 || i == 11 || i == 22;
    }

    public static boolean isShowCadence(int i) {
        return false;
    }

    public static boolean isShowHR(int i) {
        if (isChildSportType(i)) {
            i -= 1000;
        }
        return (i == 14 || i == 15) ? false : true;
    }

    public static boolean isShowMileage(int i) {
        if (isChildSportType(i)) {
            i -= 1000;
        }
        return (i == 12 || i == 10 || i == 11) ? false : true;
    }

    public static boolean isShowPace(int i) {
        if (isChildSportType(i)) {
            i -= 1000;
        }
        return i == 1 || i == 22 || i == 6 || i == 7 || i == 8 || i == 14 || i == 15;
    }

    public static boolean isShowSlope(int i) {
        if (isChildSportType(i)) {
            i -= 1000;
        }
        return i == 9 || i == 7 || i == 1 || i == 13 || i == 22;
    }

    public static boolean isShowSpeed(int i) {
        if (isChildSportType(i)) {
            i -= 1000;
        }
        if (i != 1 && i != 11 && i != 13 && i != 22) {
            switch (i) {
                case 6:
                case 7:
                case 8:
                case 9:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public static boolean isShowStride(int i) {
        if (isChildSportType(i)) {
            i -= 1000;
        }
        return i == 1 || i == 8 || i == 6 || i == 7 || i == 22;
    }

    public static boolean isShowSwim(int i) {
        if (isChildSportType(i)) {
            i -= 1000;
        }
        return i == 14 || i == 15;
    }

    public static boolean isShowTE(int i) {
        if (isChildSportType(i)) {
            i -= 1000;
        }
        return (i == 14 || i == 15) ? false : true;
    }

    public static boolean isSupportIntervalSegment(int i, int i2) {
        return i == 1 && i2 == 1;
    }

    public static boolean isSupportRopeSkippingSegment(int i) {
        return i == 21;
    }

    public static boolean isSupportSegmentMode(String str, int i) {
        if (isChildSportType(i)) {
            i -= 1000;
        }
        if (i == 17 || i == 18) {
            return false;
        }
        if (i == 21) {
            return (DeviceSource.isDataSourceHuangehe(str) || DeviceSource.isDataSourceQogir(str)) ? false : true;
        }
        return true;
    }

    public static boolean isSupportSkiingSegment(int i) {
        return i == 11;
    }

    public static boolean isSupportSpeedMode(int i) {
        if (isChildSportType(i)) {
            i -= 1000;
        }
        return (i == 8 || i == 10 || i == 12) ? false : true;
    }

    public static boolean isSupportTrackMode(int i) {
        if (isChildSportType(i)) {
            i -= 1000;
        }
        return (i == 8 || i == 10 || i == 12 || i == 14 || i == 17 || i == 21) ? false : true;
    }

    public int type() {
        return this.type;
    }

    public static SportType valueOf(int i) {
        if (isChildSportType(i)) {
            i -= 1000;
        }
        if (i == 1) {
            return OUTDOOR;
        }
        if (i == 17) {
            return TENNIS;
        }
        if (i == 18) {
            return SOCCER;
        }
        if (i == 2001) {
            return TRIATHLON;
        }
        if (i == 2002) {
            return MULTISPORT;
        }
        switch (i) {
            case 6:
                return STRIDES;
            case 7:
                return CROSSCOUNTRY;
            case 8:
                return INDOOR;
            case 9:
                return BIKE;
            case 10:
                return BIKE_INDOOR_RIDE;
            case 11:
                return SKIING;
            case 12:
                return ELLIPTICAL_TRAINER;
            case 13:
                return MOUNTAINEERING;
            case 14:
                return SWIM_INDOOR;
            case 15:
                return SWIM_OPEN;
            default:
                switch (i) {
                    case 21:
                        return ROPE_SKIPPING;
                    case 22:
                        return HIKING;
                    case 23:
                        return ROWING;
                    case 24:
                        return INDOOR_FITNESS;
                    default:
                        return OUTDOOR;
                }
        }
    }
}
