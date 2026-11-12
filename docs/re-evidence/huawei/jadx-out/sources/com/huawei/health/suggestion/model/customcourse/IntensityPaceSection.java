package com.huawei.health.suggestion.model.customcourse;

import android.content.Context;
import com.huawei.health.suggestion.R;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes9.dex */
public class IntensityPaceSection {
    public static String[] getPaceSectionArrays(Context context) {
        return new String[]{context.getResources().getString(R.string.IDS_pace_range_run_type, UnitUtil.e(1.0d, 1, 0), context.getResources().getString(R.string.IDS_pace_range_remark_easy_run)), context.getResources().getString(R.string.IDS_pace_range_run_type, UnitUtil.e(2.0d, 1, 0), context.getResources().getString(R.string.IDS_pace_range_remark_marathon)), context.getResources().getString(R.string.IDS_pace_range_run_type, UnitUtil.e(3.0d, 1, 0), context.getResources().getString(R.string.IDS_pace_range_remark_threshold)), context.getResources().getString(R.string.IDS_pace_range_run_type, UnitUtil.e(4.0d, 1, 0), context.getResources().getString(R.string.IDS_pace_range_remark_anaerobic)), context.getResources().getString(R.string.IDS_pace_range_run_type, UnitUtil.e(5.0d, 1, 0), context.getResources().getString(R.string.IDS_pace_range_remark_intensity))};
    }
}
