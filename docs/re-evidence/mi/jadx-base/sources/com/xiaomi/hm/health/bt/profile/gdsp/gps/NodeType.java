package com.xiaomi.hm.health.bt.profile.gdsp.gps;

/* JADX INFO: loaded from: classes11.dex */
public enum NodeType {
    NODE_TYPE_UNKNOWN(-1),
    NODE_TYPE_GPS_POINT(0),
    NODE_TYPE_HEARTRATE(1),
    NODE_TYPE_SPORT_PAUSE(2),
    NODE_TYPE_SPORT_RESUME(3),
    NODE_TYPE_PACE_KM(4),
    NODE_TYPE_PACE_MILE(5),
    NODE_TYPE_REALTIME_PACE(6),
    NODE_TYPE_TIME_CHANGE(7),
    NODE_TYPE_SWIM(8),
    NODE_TYPE_STEP_MODE(11),
    NODE_TYPE_LAP_PACE_KM(12),
    NODE_TYPE_SEGMENT_DETAIL(13),
    NODE_TYPE_LAP_PACE_MILE(14),
    NODE_TYPE_PACE_100METER(9),
    NODE_TYPE_PACE_100YARD(10),
    NODE_TYPE_RT_VAL(11),
    NODE_TYPE_KM_0(12),
    NODE_TYPE_KM_1(13),
    NODE_TYPE_LAP_COMMON_0(14),
    NODE_TYPE_LAP_COMMON_1(15),
    NODE_TYPE_LAP_COMMON_2(16),
    NODE_TYPE_LAP_SWIM(17),
    NODE_TYPE_LAP_RUN_RIDE(18),
    NODE_TYPE_LAP_FOOT(19),
    NODE_TYPE_MARATHON_0(20),
    NODE_TYPE_MARATHON_1(21),
    NODE_TYPE_ROW(22),
    NODE_TYPE_SKIPROPE(23),
    NODE_TYPE_DUMMY(255);

    public int mValue;

    NodeType(int i) {
        this.mValue = i;
    }

    public static NodeType fromValue(int i) {
        for (NodeType nodeType : values()) {
            if (nodeType.getValue() == i) {
                return nodeType;
            }
        }
        return NODE_TYPE_UNKNOWN;
    }

    public int getValue() {
        return this.mValue;
    }
}
