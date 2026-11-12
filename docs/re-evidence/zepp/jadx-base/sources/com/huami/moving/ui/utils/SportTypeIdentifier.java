package com.huami.moving.ui.utils;

import android.graphics.Color;
import com.huami.mifit.sportlib.common.DataTypeSource;

/* JADX INFO: loaded from: classes4.dex */
public class SportTypeIdentifier {
    public static final int CHILD_SPORT_DELTA = 1000;
    public static final int PARAM_MILESTONE_TYPE_AUTO = 2;
    public static final int PARAM_MILESTONE_TYPE_BACK = -1;
    public static final int PARAM_MILESTONE_TYPE_CLOSE = 0;
    public static final int PARAM_MILESTONE_TYPE_HEATMAP_ALL = 100;
    public static final int PARAM_MILESTONE_TYPE_HEATMAP_FIRST_HALF = 101;
    public static final int PARAM_MILESTONE_TYPE_HEATMAP_SECOND_HALF = 102;
    public static final int PARAM_MILESTONE_TYPE_INTERVAL = 4;
    public static final int PARAM_MILESTONE_TYPE_KM = 1;
    public static final int PARAM_MILESTONE_TYPE_MANUAL = 3;
    public static final int PARAM_MILESTONE_TYPE_SKIING = 5;

    public static int getLineColorBySportType(int i) {
        if (isSubSport(i)) {
            i -= 1000;
        }
        if (i == 1) {
            return Color.argb(255, 255, 156, 44);
        }
        if (i != 9) {
            return i != 15 ? Color.argb(255, 241, 116, 86) : Color.argb(255, 65, 145, 225);
        }
        return Color.argb(255, 6, DataTypeSource.SPORT_TYPE_BUNGEE_JUMPING, 102);
    }

    public static boolean isChildSportType(int i) {
        return i > 1000 && i < 2000;
    }

    public static boolean isChildSportTypeForComplex(Long l) {
        return l != null && l.longValue() > 0;
    }

    public static boolean isComplexSport(int i) {
        return i >= 2001;
    }

    public static boolean isDisUnitSupportMeterOrYads(int i) {
        return i == 14 || i == 15 || i == 1015;
    }

    public static boolean isOutdoorSportType(int i) {
        if (isSubSport(i)) {
            i -= 1000;
        }
        return i == 1 || i == 6 || i == 7 || i == 22 || i == 9 || i == 13 || i == 11 || i == 15 || i == 18 || i == 2001 || i == 2002 || i == 82 || i == 90 || i == 42 || i == 43 || i == 105 || i == 46 || i == 44 || i == 62 || i == 63 || i == 65 || i == 66 || i == 67 || i == 68 || i == 69 || i == 94 || i == 47 || i == 48 || i == 26 || i == 107 || i == 106 || i == 110 || i == 123 || i == 124 || i == 125 || i == 126 || i == 127 || i == 128 || i == 131 || i == 132 || i == 121 || i == 178 || i == 138 || i == 139 || i == 140 || i == 141 || i == 142 || i == 190 || i == 136 || i == 137 || i == 192;
    }

    public static boolean isShowSwim(int i) {
        if (isChildSportType(i)) {
            i -= 1000;
        }
        return i == 14 || i == 15;
    }

    public static boolean isSubSport(int i) {
        return i >= 1001 && i < 2001;
    }

    public static boolean isSupportAutoSegment(int i) {
        if (isSubSport(i)) {
            i -= 1000;
        }
        return i == 1 || i == 7 || i == 6 || i == 9 || i == 14 || i == 15 || i == 13 || i == 8 || i == 25 || i == 26 || i == 22 || i == 47 || i == 48 || i == 65 || i == 68 || i == 62 || i == 69 || i == 94 || i == 107 || i == 66 || i == 106 || i == 110 || i == 123 || i == 124 || i == 131 || i == 40 || i == 63 || i == 44 || i == 67 || i == 132 || i == 138 || i == 139 || i == 140 || i == 141 || i == 142 || i == 190 || i == 136 || i == 137;
    }

    public static boolean isSupportIndoorFitness(int i) {
        return i == 24;
    }

    public static boolean isSupportIntervalSegment(int i, int i2) {
        return i == 1 && i2 == 1;
    }

    public static boolean isSupportManualGroupSegment(int i) {
        if (isSubSport(i)) {
            i -= 1000;
        }
        return i == 12 || i == 21 || i == 23 || i == 24 || i == 71 || i == 78 || i == 79 || i == 80 || i == 81 || i == 41 || i == 72 || i == 64 || i == 73 || i == 49 || i == 50 || i == 51 || i == 93 || i == 74 || i == 75 || i == 96 || i == 85 || i == 86 || i == 52 || i == 53 || i == 87 || i == 88 || i == 70 || i == 89 || i == 54 || i == 61 || i == 97 || i == 98 || i == 55 || i == 45 || i == 91 || i == 99 || i == 58 || i == 57 || i == 100 || i == 59 || i == 101 || i == 102 || i == 76 || i == 103 || i == 60 || i == 92 || i == 77 || i == 104 || i == 56 || i == 109 || i == 111 || i == 112 || i == 113 || i == 114 || i == 115 || i == 116 || i == 117 || i == 118 || i == 119 || i == 120 || i == 122 || i == 129 || i == 130 || i == 84;
    }

    public static boolean isSupportManualSegment(int i) {
        return !isComplexSport(i);
    }

    public static boolean isSupportPerKmSegment(int i) {
        if (isSubSport(i)) {
            i -= 1000;
        }
        return i == 1 || i == 7 || i == 6 || i == 9 || i == 13 || i == 11 || i == 8 || i == 25 || i == 26 || i == 22 || i == 47 || i == 48 || i == 105 || i == 42 || i == 43 || i == 46 || i == 63 || i == 65 || i == 44 || i == 67 || i == 68 || i == 62 || i == 69 || i == 94 || i == 107 || i == 66 || i == 106 || i == 110 || i == 123 || i == 124 || i == 125 || i == 126 || i == 127 || i == 128 || i == 131 || i == 132 || i == 40 || i == 178 || i == 138 || i == 139 || i == 140 || i == 141 || i == 142 || i == 190 || i == 136 || i == 137 || i == 192;
    }

    public static boolean isSupportRopeSkippingSegment(int i) {
        return i == 21;
    }

    public static boolean isSupportRowingMachineSegment(int i) {
        return i == 23;
    }

    public static boolean isSupportSegmentMode(int i, int i2) {
        if (isChildSportType(i2)) {
            i2 -= 1000;
        }
        if (i2 == 17 || i2 == 18 || i2 == 82 || i2 == 90 || i2 == 121) {
            return false;
        }
        return (i2 == 21 && DataTypeSource.RunSource.RUN_SOURCE_WATCH.getValue() == i) ? false : true;
    }

    public static boolean isSupportSkiingSegment(int i) {
        return i == 11 || i == 42 || i == 43 || i == 105;
    }

    public static boolean isSupportTrainSegment(int i) {
        if (isSubSport(i)) {
            i -= 1000;
        }
        return i == 1 || i == 8 || i == 9 || i == 10 || i == 14 || i == 21 || i == 23 || i == 54 || i == 12 || i == 108 || i == 58 || i == 24 || i == 51 || i == 52 || i == 57 || i == 50 || i == 56 || i == 49;
    }
}
