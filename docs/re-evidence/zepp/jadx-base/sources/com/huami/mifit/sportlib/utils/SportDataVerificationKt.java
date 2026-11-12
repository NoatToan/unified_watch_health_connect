package com.huami.mifit.sportlib.utils;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.mifit.sportlib.common.DataTypeSource;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\u001a\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002\u001a\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002\"\u0016\u0010\n\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0016\u0010\f\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b\"\u0016\u0010\r\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000b\"\u0016\u0010\u000e\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b\"\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010\"\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010\"\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010\"\u0016\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010\"\u0016\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010\"\u0016\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010¨\u0006\u0017"}, d2 = {"", "pace", "", "sportType", "", "isValidPace", "altitude", "isValidAltitude", Constants.DATA_KEY_HR, "isValidHeartrate", "SWIM_MAX_PACE", "F", "COMMON_MAX_PACE", "TREADMILL_MAX_PACE", "COMMON_MIN_PACE", "COMMON_MAX_ALTITUDE", LogUtil.I, "COMMON_MIN_ALTITUDE", "COMMON_MAX_HR", "COMMON_MIN_HR", "COMMON_FLATTEN_TIME_DELTA_3S", "COMMON_FLATTEN_TIME_DELTA_15S", "CHART_POINT_SIZE", "sportlib_release"}, k = 2, mv = {1, 5, 1})
public final class SportDataVerificationKt {
    public static final int CHART_POINT_SIZE = 300;
    public static final int COMMON_FLATTEN_TIME_DELTA_15S = 15;
    public static final int COMMON_FLATTEN_TIME_DELTA_3S = 3;
    public static final int COMMON_MAX_ALTITUDE = 1000000;
    public static final int COMMON_MAX_HR = 220;
    public static final float COMMON_MAX_PACE = 1.8f;
    public static final int COMMON_MIN_ALTITUDE = -2000000;
    public static final int COMMON_MIN_HR = 39;
    public static final float COMMON_MIN_PACE = 1.0E-4f;
    public static final float SWIM_MAX_PACE = 6.0f;
    public static final float TREADMILL_MAX_PACE = 1.8f;

    public static final boolean isValidAltitude(int i) {
        return -1999999 <= i && i < 1000000;
    }

    public static final boolean isValidHeartrate(int i) {
        return 40 <= i && i < 220;
    }

    public static final boolean isValidPace(float f, int i) {
        if (DataTypeSource.isSwimSport(i)) {
            if (f <= 6.0f && f > 1.0E-4f) {
                return true;
            }
        } else if (i == 25 || i == 26) {
            if (f <= 1.8f && f > 1.0E-4f) {
                return true;
            }
        } else if (f <= 1.8f && f > 1.0E-4f) {
            return true;
        }
        return false;
    }
}
