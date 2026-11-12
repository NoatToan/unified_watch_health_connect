package com.huawei.health.sportservice.datasource;

import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.sportservice.inter.DeviceToSource;
import com.huawei.health.sportservice.manager.BaseSportManager;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 3, name = ComponentName.WEAR_STEP_SOURCE)
public class WearStepSource extends BaseSource<Integer> implements SportLifecycle, DeviceToSource {
    private static final String TAG = "SportService_WearStepSource";
    private int mPreWatchStep;
    private int mWatchStep;

    @Override // com.huawei.health.sportservice.datasource.BaseSource
    protected void updateSourceData() {
        BaseSportManager.getInstance().updateSourceData("06D", "STEP_DATA", Integer.valueOf(this.mWatchStep));
    }

    @Override // com.huawei.health.sportservice.datasource.BaseSource
    protected String getLogTag() {
        return TAG;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.sportservice.datasource.BaseSource
    public void generateData(Integer num) {
        this.mWatchStep = num.intValue();
        if (BaseSportManager.getInstance().getSportType() != 264 || num.intValue() <= this.mPreWatchStep) {
            return;
        }
        ReleaseLogUtil.d(TAG, "watchStep from report data", num);
        updateSourceData();
        this.mPreWatchStep = num.intValue();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("STEP_DATA");
        BaseSportManager.getInstance().subscribeToDevice(arrayList, this);
    }

    @Override // com.huawei.health.sportservice.inter.DeviceToSource
    public void onDeviceDataChanged(String str, Object obj) {
        if (obj instanceof Integer) {
            generateData((Integer) obj);
        }
    }
}
