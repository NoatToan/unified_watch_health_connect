package com.huawei.ui.homehealth.runcard.trackfragments;

import android.content.Context;
import com.huawei.hihealth.HiHealthData;
import com.huawei.ui.homehealth.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
public class OutdoorRunStatisticProvider extends SportStatisticProvider {
    @Override // com.huawei.ui.homehealth.runcard.trackfragments.SportStatisticProvider
    protected int getSportType() {
        return 258;
    }

    @Override // com.huawei.ui.homehealth.runcard.trackfragments.SportStatisticProvider
    protected String getTag() {
        return "Track_Provider_Track_OutdoorRunStatisticProvider";
    }

    @Override // com.huawei.ui.homehealth.runcard.trackfragments.SportStatisticProvider
    protected void setData(Context context, HashMap<String, Object> map, Object obj) {
        setInitData(context, map, obj, true, Integer.valueOf(R.drawable.ic_track_start_run), "Track_Provider_Track_OutdoorRunStatisticProvider");
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
