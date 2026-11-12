package com.huawei.ui.main.stories.history.adapter.monthdatashower.totalshower;

import com.huawei.healthcloud.plugintrack.ui.sporttypeconfig.bean.HwSportTypeInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthStatisticViewType;
import defpackage.jry;
import defpackage.njy;
import defpackage.nub;
import defpackage.vpr;
import defpackage.vrg;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@MonthStatisticViewType(type = "DISTANCE")
public class DistanceShower extends vpr {
    private static final int DISTANCE_INDEX = 0;
    private static final String TAG = "Track_DistanceShower";

    @Override // defpackage.vpr
    public double standardization(double d) {
        return d / 1000.0d;
    }

    @Override // defpackage.vpr, com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthDataShower
    public String getMainMonthData() {
        if (this.mHwSportTypeInfo.getSportTypeId() == 217) {
            ArrayList arrayList = new ArrayList();
            jry jryVarA = jry.a(this.mContext);
            arrayList.add(this.mHwSportTypeInfo);
            for (int i : nub.f43727a) {
                arrayList.add(jryVarA.b(i));
            }
            getSkiMonthData(arrayList);
        } else {
            String str = "Track_" + this.mHwSportTypeInfo.getSportTypeId() + this.mHwSportTypeInfo.getHistoryList().mainPositionData(true);
            if (this.mMonthData != null && this.mMonthData.containsKey(str)) {
                this.mMainData = this.mMonthData.get(str);
            } else {
                return UnitUtil.e(0.0d, 1, 2);
            }
        }
        if (this.mMainData == null) {
            return "--";
        }
        return processDataToString(standardization(this.mMainData.doubleValue()));
    }

    private void getSkiMonthData(List<HwSportTypeInfo> list) {
        if (njy.e(list)) {
            return;
        }
        Double dValueOf = Double.valueOf(0.0d);
        for (HwSportTypeInfo hwSportTypeInfo : list) {
            ArrayList<String> trackRequestDataBase = hwSportTypeInfo.getHistoryList().getTrackRequestDataBase(hwSportTypeInfo.getSportTypeId());
            if (trackRequestDataBase != null && trackRequestDataBase.size() >= 1 && trackRequestDataBase.get(0) != null) {
                String str = trackRequestDataBase.get(0);
                if (this.mMonthData != null && this.mMonthData.containsKey(str)) {
                    dValueOf = Double.valueOf(dValueOf.doubleValue() + this.mMonthData.get(str).doubleValue());
                    this.mMainData = dValueOf;
                }
            }
        }
    }

    @Override // defpackage.vpr
    public String processDataToString(double d) {
        if (UnitUtil.f()) {
            return UnitUtil.e(UnitUtil.e(d, 3), 1, 2);
        }
        return UnitUtil.e(d, 1, 2);
    }

    @Override // defpackage.vpr, com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthDataShower
    public String getUnit() {
        if (this.mHwSportTypeInfo == null) {
            LogUtil.e(TAG, "DistanceShower mHwSportTypeInfo is null");
            return "";
        }
        if (vrg.b(this.mHwSportTypeInfo.getSportTypeId(), this.mContext) == null) {
            LogUtil.e(TAG, "DistanceShower TrackSportHistoryUtils.getSportTypeString(mHwSportTypeInfo.getSportTypeId(), mContext) == null");
            return "";
        }
        if (UnitUtil.f()) {
            return this.mContext.getResources().getString(R.string.IDS_motiontrack_history_all_unit, vrg.b(this.mHwSportTypeInfo.getSportTypeId(), this.mContext), this.mContext.getResources().getString(R.string.IDS_band_data_sport_distance_unit_en));
        }
        return this.mContext.getResources().getString(R.string.IDS_motiontrack_history_all_unit, vrg.b(this.mHwSportTypeInfo.getSportTypeId(), this.mContext), this.mContext.getResources().getString(R.string.IDS_band_data_sport_distance_unit));
    }
}
