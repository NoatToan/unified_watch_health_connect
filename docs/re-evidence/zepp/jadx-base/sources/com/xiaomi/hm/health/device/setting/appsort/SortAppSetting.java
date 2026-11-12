package com.xiaomi.hm.health.device.setting.appsort;

import android.util.SparseArray;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.model.appsort.SortableAppItems;

/* JADX INFO: loaded from: classes18.dex */
public class SortAppSetting extends SortableAppItems {
    public SortAppSetting(HMDeviceSource hMDeviceSource, SparseArray<com.xiaomi.hm.health.bt.model.appsort.AppItem> sparseArray) {
        this.sparseArrayApps = sparseArray;
        setSource(hMDeviceSource);
    }

    @Override // com.xiaomi.hm.health.bt.model.appsort.SortableAppItems
    public int getType() {
        return -1;
    }

    @Override // com.xiaomi.hm.health.bt.model.appsort.SortableAppItems
    public void setType(int i) {
    }
}
