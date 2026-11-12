package com.huawei.health.suggestion.model.customcourse;

import android.content.Context;
import com.huawei.health.suggestion.R;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes9.dex */
public class TargetDistance {
    public static final int DEFAULT_VALUE = 1;
    private static final int MAX_KM = 100;
    private static final int MAX_METER = 950;
    public static final int METER_INTERVAL = 50;

    public static String[] getKiloMeters(Context context) {
        String[] strArr = new String[101];
        for (int i = 0; i < 101; i++) {
            if (UnitUtil.f()) {
                strArr[i] = context.getResources().getQuantityString(R.plurals.IDS_hw_show_sport_kms_string_en, i, UnitUtil.e(i, 1, 0));
            } else {
                strArr[i] = context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_show_use_time_km, i, UnitUtil.e(i, 1, 0));
            }
        }
        return strArr;
    }

    public static String[] getMeters(Context context) {
        String[] strArr = new String[20];
        for (int i = 0; i < 20; i++) {
            int i2 = i * 50;
            if (UnitUtil.f()) {
                strArr[i] = context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit_mi, i, Integer.valueOf(i2));
            } else {
                strArr[i] = context.getResources().getQuantityString(R.plurals.IDS_altitude_meter, i2, UnitUtil.e(i2, 1, 0));
            }
        }
        return strArr;
    }
}
