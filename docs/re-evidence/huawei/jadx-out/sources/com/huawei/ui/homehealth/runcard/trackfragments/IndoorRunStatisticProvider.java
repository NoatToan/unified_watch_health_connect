package com.huawei.ui.homehealth.runcard.trackfragments;

import android.content.Context;
import com.huawei.hihealth.HiHealthData;
import com.huawei.ui.homehealth.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
public class IndoorRunStatisticProvider extends SportStatisticProvider {
    @Override // com.huawei.ui.homehealth.runcard.trackfragments.SportStatisticProvider
    protected int getSportType() {
        return 264;
    }

    @Override // com.huawei.ui.homehealth.runcard.trackfragments.SportStatisticProvider
    protected String getTag() {
        return "Track_Provider_Track_IndoorRunStatisticProvider";
    }

    @Override // com.huawei.ui.homehealth.runcard.trackfragments.SportStatisticProvider
    protected void setData(Context context, HashMap<String, Object> map, Object obj) {
        setInitData(context, map, obj, false, Integer.valueOf(R.drawable.ic_track_start_indoor_run), "IndoorRunStatisticProvider");
    }

    @Override // com.huawei.ui.homehealth.runcard.trackfragments.SportStatisticProvider
    protected double getHiHealthDataDistance(HiHealthData hiHealthData) {
        return SportStatisticProvider.getDataDistance(hiHealthData);
    }

    @Override // com.huawei.ui.homehealth.runcard.trackfragments.SportStatisticProvider
    protected String getHiHealthDataDistanceKey() {
        return "Track_Run_Distance_Sum";
    }
}
