package com.huawei.ui.main.stories.history.adapter.monthdatashower.totalshower;

import com.huawei.haf.bundle.extension.ComponentInfo;
import com.huawei.healthcloud.plugintrack.ui.sporttypeconfig.bean.HwSportTypeInfo;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthStatisticViewType;
import defpackage.jry;
import defpackage.njy;
import defpackage.vpr;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
@MonthStatisticViewType(type = "TIME")
public class TimesShower extends vpr {
    private static final String TAG = "Track_TimeShower";
    private static final int TIME_INDEX = 2;

    @Override // defpackage.vpr, com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthDataShower
    public String getMainMonthData() {
        int sportTypeId = this.mHwSportTypeInfo.getSportTypeId();
        if (sportTypeId == 286 || sportTypeId == 287) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.mHwSportTypeInfo);
            arrayList.add(jry.a(this.mContext).b(sportTypeId == 286 ? HeartRateThresholdConfig.HEART_RATE_LIMIT : ComponentInfo.PluginPay_A_N));
            getGolfAndDivingMonthData(arrayList);
        } else {
            ArrayList<String> trackRequestDataBase = this.mHwSportTypeInfo.getHistoryList().getTrackRequestDataBase(this.mHwSportTypeInfo.getSportTypeId());
            if (trackRequestDataBase == null || trackRequestDataBase.size() < 3 || trackRequestDataBase.get(2) == null) {
                LogUtil.a(TAG, "getMainMonthData TimesShower");
                return "--";
            }
            if (this.mMonthData != null && this.mMonthData.containsKey(trackRequestDataBase.get(2))) {
                this.mMainData = this.mMonthData.get(trackRequestDataBase.get(2));
            } else {
                return UnitUtil.e(0.0d, 1, 0);
            }
        }
        if (this.mMainData == null) {
            return "--";
        }
        return processDataToString(standardization(this.mMainData.doubleValue()));
    }

    private void getGolfAndDivingMonthData(List<HwSportTypeInfo> list) {
        if (njy.e(list)) {
            return;
        }
        Double dValueOf = Double.valueOf(0.0d);
        for (HwSportTypeInfo hwSportTypeInfo : list) {
            ArrayList<String> trackRequestDataBase = hwSportTypeInfo.getHistoryList().getTrackRequestDataBase(hwSportTypeInfo.getSportTypeId());
            if (trackRequestDataBase != null && trackRequestDataBase.size() >= 3 && trackRequestDataBase.get(2) != null) {
                String str = trackRequestDataBase.get(2);
                if (this.mMonthData != null && this.mMonthData.containsKey(str)) {
                    dValueOf = Double.valueOf(dValueOf.doubleValue() + this.mMonthData.get(str).doubleValue());
                    this.mMainData = dValueOf;
                }
            }
        }
    }

    @Override // defpackage.vpr, com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthDataShower
    public String getUnit() {
        if (this.mContext == null) {
            LogUtil.e(TAG, "TimesShower  mContext is null");
            return "";
        }
        if (this.mHwSportTypeInfo != null && this.mHwSportTypeInfo.getSportTypeId() == 271) {
            return this.mContext.getResources().getString(R.string.IDS_aw_version2_basketball_unit);
        }
        return this.mContext.getResources().getString(R.string.IDS_hw_show_main_home_page_sport_frequency);
    }
}
