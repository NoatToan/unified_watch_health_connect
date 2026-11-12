package com.huawei.ui.homehealth.runcard.trackfragments;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.knit.section.view.BaseSection;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.homehealth.R;
import defpackage.qre;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
public class BikeStatisticProvider extends SportStatisticProvider {
    private Context e;

    @Override // com.huawei.ui.homehealth.runcard.trackfragments.SportStatisticProvider
    protected int getSportType() {
        return 259;
    }

    @Override // com.huawei.ui.homehealth.runcard.trackfragments.SportStatisticProvider
    protected String getTag() {
        return "Track_Provider_Track_BikeStatisticProvider";
    }

    @Override // com.huawei.ui.homehealth.runcard.trackfragments.SportStatisticProvider
    protected void setData(Context context, HashMap<String, Object> map, Object obj) {
        String string;
        this.e = context == null ? BaseApplication.getContext() : context;
        if (obj instanceof HiHealthData) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(R.drawable.ic_sport_tab_bg_map));
            arrayList.add(Integer.valueOf(R.drawable.ic_sport_tab_bg_map_ws));
            map.put("BACKGROUND", arrayList);
            map.put("MARKER", Integer.valueOf(R.drawable.ic_sport_tab_loction_new));
            map.put("SECTION_STYLE", BaseSection.BIKE_STYLE);
            if (UnitUtil.f()) {
                string = super.getContext().getResources().getString(R.string.IDS_band_data_sport_distance_unit_en);
            } else {
                string = super.getContext().getResources().getString(R.string.IDS_hw_health_show_distance_unit);
            }
            map.put("ACCUMULATED_DURATION_TEXT", super.getContext().getResources().getString(R.string.IDS_track_total_cycle, string));
            if (LoginInit.getInstance(context).getIsLogined()) {
                map.put("IS_GOAL_BUTTON_SHOW", true);
            }
            map.put("GOAL_BUTTON", context.getResources().getString(R.string.IDS_hwh_motiontrack_set_target));
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(Integer.valueOf(R.drawable.ic_track_start_cycle));
            arrayList2.add(Integer.valueOf(R.drawable.ic_track_start_cycle));
            map.put("MIDDLE_IMAGEVIEW", arrayList2);
            map.put("MIDDLE_IMAGEVIEW_DESC", qre.f(R.string.IDS_main_time_line_start_cycling));
            ArrayList arrayList3 = new ArrayList(4);
            arrayList3.add(String.valueOf(e()));
            arrayList3.add(super.getContext().getResources().getString(R.string.IDS_hwh_outdoor_cycling_tips));
            arrayList3.add(Integer.valueOf(R.drawable.ic_public_select_cancel));
            arrayList3.add(Integer.valueOf(R.drawable.ic_public_select_cancel));
            map.put("CANCEL_GUIDE_BUBBLE_TEXT", arrayList3);
            if (Utils.j()) {
                map.put("LEFT_IMAGEVIEW", getWarmUpIcon());
            }
            LogUtil.a("Track_Provider_Track_BikeStatisticProvider", map.toString());
        }
    }

    public boolean e() {
        Context context = this.e;
        if (context == null) {
            LogUtil.e("Track_Provider_Track_BikeStatisticProvider", "isShowOutdoorCycleTip ", "mContext is null");
            return false;
        }
        String strE = SharedPreferenceManager.e(context, Integer.toString(20002), "show_outdoor_cycle_tip");
        if (TextUtils.isEmpty(strE)) {
            return true;
        }
        return Boolean.parseBoolean(strE);
    }

    @Override // com.huawei.ui.homehealth.runcard.trackfragments.SportStatisticProvider
    protected double getHiHealthDataDistance(HiHealthData hiHealthData) {
        return hiHealthData.getDouble("Track_Ride_Distance_Sum");
    }

    @Override // com.huawei.ui.homehealth.runcard.trackfragments.SportStatisticProvider
    protected String getHiHealthDataDistanceKey() {
        return "Track_Ride_Distance_Sum";
    }
}
