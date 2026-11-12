package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public enum SportType implements Serializable {
    SPORT_TYPE_NONE(0),
    SPORT_TYPE_ODRUN(1),
    SPORT_TYPE_IDRUN(2),
    SPORT_TYPE_WALKING(3),
    SPORT_TYPE_RIDING(4),
    SPORT_TYPE_EXERCISE(5),
    SPORT_TYPE_POOL_SWIM(6),
    SPORT_TYPE_OPEN_WATER_SWIM(7),
    SPORT_TYPE_IDRIDING(8),
    SPORT_TYPE_ELLIPTICAL(9),
    SPORT_TYPE_CLIMB(10),
    SPORT_TYPE_CROSS_COUNTRY_RUN(11),
    SPORT_TYPE_SKIING(12),
    SPORT_TYPE_ANY(13),
    SPORT_TYPE_ANY_WITH_GPS(14),
    SPORT_TYPE_ODTREKKING(15),
    SPORT_TYPE_TENNIS(17),
    SPORT_TYPE_JUMP_ROPE(21),
    SPORT_TYPE_ROWING(23),
    SPORT_TYPE_YOGA(60),
    SPORT_TYPE_ORIENTEER_SKIING(127),
    SPORT_TYPE_BOARD_SKIING(42),
    SPORT_TYPE_ALPINE_SKIING(43),
    SPORT_TYPE_CROSS_COUNTRY_SKIING(46),
    SPORT_TYPE_SKIING_DOUBLE_BOARD(105);

    private static final long serialVersionUID = 1;
    public int mValue;
    public int typeValue = -1;

    SportType(int value) {
        this.mValue = 0;
        this.mValue = value;
    }

    public static SportType fromValue(int type) {
        SportType sportType = SPORT_TYPE_NONE;
        for (SportType sportType2 : values()) {
            if (sportType2.getValue() == type) {
                sportType = sportType2;
            }
        }
        sportType.setTypeValue(type);
        return sportType;
    }

    public int getTypeValue() {
        return this.typeValue;
    }

    public int getValue() {
        return this.mValue;
    }

    public SportType setTypeValue(int value) {
        this.typeValue = value;
        return this;
    }
}
