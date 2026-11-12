package com.xiaomi.hm.health.bt.model.appsort;

import android.util.SparseArray;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.milipro.DisplaySetting;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public abstract class SortableAppItems implements DisplaySetting {
    private HMDeviceSource a = HMDeviceSource.VDEVICE;
    public SparseArray<AppItem> sparseArrayApps = new SparseArray<>();

    public void addAppItem(AppItem appItem) {
        this.sparseArrayApps.put(appItem.getType(), appItem);
    }

    public void enableAppItem(int index, boolean enable) {
        AppItem appItemValueAt = this.sparseArrayApps.valueAt(index);
        if (appItemValueAt != null) {
            appItemValueAt.setEnable(enable);
        }
    }

    public void enableAppItemByType(int type, boolean enable) {
        AppItem appItemByType = getAppItemByType(type);
        if (appItemByType != null) {
            appItemByType.setEnable(enable);
        }
    }

    public int getAppCount() {
        return this.sparseArrayApps.size();
    }

    public AppItem getAppItem(int index) {
        return this.sparseArrayApps.valueAt(index);
    }

    public AppItem getAppItemByType(int type) {
        return this.sparseArrayApps.get(type);
    }

    public HMDeviceSource getSource() {
        return this.a;
    }

    public SparseArray<AppItem> getSparseArrayApps() {
        return this.sparseArrayApps;
    }

    public abstract int getType();

    public void setSource(HMDeviceSource source) {
        this.a = source;
    }

    public abstract void setType(int type);

    @Override // com.xiaomi.hm.health.bt.profile.milipro.DisplaySetting
    @NotNull
    public byte[] toBleBytes() {
        int size = this.sparseArrayApps.size();
        byte[] bArr = new byte[size + 2];
        short s = 0;
        for (int i = 0; i < size; i++) {
            AppItem appItemValueAt = this.sparseArrayApps.valueAt(i);
            int type = appItemValueAt.getType();
            if (appItemValueAt.isEnable()) {
                s = (short) (s | (1 << type));
            }
            bArr[type + 2] = (byte) appItemValueAt.getIndex();
        }
        bArr[0] = (byte) (s & 255);
        bArr[1] = (byte) (((s >> 8) & 255) | ((getType() << 4) & 240));
        return bArr;
    }

    public void enableAppItem(int type, int index, boolean enable) {
        AppItem appItemByType = getAppItemByType(type);
        if (appItemByType != null) {
            appItemByType.setEnable(enable);
            appItemByType.setIndex(index);
        }
    }
}
