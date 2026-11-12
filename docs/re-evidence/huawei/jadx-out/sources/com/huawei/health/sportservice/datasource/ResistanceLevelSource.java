package com.huawei.health.sportservice.datasource;

import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.sportservice.inter.IndoorToSource;
import com.huawei.health.sportservice.manager.BaseSportManager;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 3, name = ComponentName.RESISTANCE_LEVEL_SOURCE)
public class ResistanceLevelSource extends BaseSource<Integer> implements SportLifecycle, IndoorToSource {
    private static final String TAG = "SportService_ResistanceSource";
    private int mResistanceLevel;

    @Override // com.huawei.health.sportservice.datasource.BaseSource
    protected void updateSourceData() {
        BaseSportManager.getInstance().updateSourceData(getLogTag(), "RESISTANCE_LEVEL_DATA", Integer.valueOf(this.mResistanceLevel));
    }

    @Override // com.huawei.health.sportservice.datasource.BaseSource
    protected String getLogTag() {
        return TAG;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.sportservice.datasource.BaseSource
    public void generateData(Integer num) {
        LogUtil.a(TAG, "onIndoorDataChanged resistance", num);
        if (BaseSportManager.getInstance().getSportType() == 273) {
            this.mResistanceLevel = num.intValue() / 10;
        } else {
            this.mResistanceLevel = num.intValue();
        }
        updateSourceData();
    }

    @Override // com.huawei.health.sportservice.inter.IndoorToSource
    public void onIndoorDataChanged(int i, Object obj) {
        Integer num = (Integer) obj;
        num.intValue();
        generateData(num);
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(22);
        BaseSportManager.getInstance().subscribeToIndoorEquipment(arrayList, this);
    }
}
