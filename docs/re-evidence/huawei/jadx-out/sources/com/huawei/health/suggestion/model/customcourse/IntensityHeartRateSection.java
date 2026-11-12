package com.huawei.health.suggestion.model.customcourse;

import android.content.Context;
import com.huawei.health.suggestion.R;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes9.dex */
public class IntensityHeartRateSection {
    public static String[] getMaxHeartRateSectionArray(Context context) {
        return new String[]{context.getResources().getString(R.string.IDS_pace_range_run_type, UnitUtil.e(1.0d, 1, 0), context.getResources().getString(R.string.IDS_motiontrack_detail_fm_heart_hot)), context.getResources().getString(R.string.IDS_pace_range_run_type, UnitUtil.e(2.0d, 1, 0), context.getResources().getString(R.string.IDS_motiontrack_detail_fm_heart_burn)), context.getResources().getString(R.string.IDS_pace_range_run_type, UnitUtil.e(3.0d, 1, 0), context.getResources().getString(R.string.IDS_motiontrack_detail_fm_heart_yynl)), context.getResources().getString(R.string.IDS_pace_range_run_type, UnitUtil.e(4.0d, 1, 0), context.getResources().getString(R.string.IDS_motiontrack_detail_fm_heart_wynl)), context.getResources().getString(R.string.IDS_pace_range_run_type, UnitUtil.e(5.0d, 1, 0), context.getResources().getString(R.string.IDS_motiontrack_detail_fm_heart_limit))};
    }

    public static String[] getReserveHeartRateSectionArray(Context context) {
        return new String[]{context.getResources().getString(R.string.IDS_pace_range_run_type, UnitUtil.e(1.0d, 1, 0), context.getResources().getString(R.string.IDS_rate_zone_hrr_aerobicBase_threshold)), context.getResources().getString(R.string.IDS_pace_range_run_type, UnitUtil.e(2.0d, 1, 0), context.getResources().getString(R.string.IDS_rate_zone_hrr_aerobicAdvance_threshold)), context.getResources().getString(R.string.IDS_pace_range_run_type, UnitUtil.e(3.0d, 1, 0), context.getResources().getString(R.string.IDS_rate_zone_hrr_lacticAcid_threshold)), context.getResources().getString(R.string.IDS_pace_range_run_type, UnitUtil.e(4.0d, 1, 0), context.getResources().getString(R.string.IDS_rate_zone_hrr_anaerobicBase_threshold)), context.getResources().getString(R.string.IDS_pace_range_run_type, UnitUtil.e(5.0d, 1, 0), context.getResources().getString(R.string.IDS_rate_zone_hrr_anaerobicAdvance_threshold))};
    }
}
