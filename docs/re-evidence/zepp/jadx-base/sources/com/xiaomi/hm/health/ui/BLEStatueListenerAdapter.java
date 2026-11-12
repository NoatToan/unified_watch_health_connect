package com.xiaomi.hm.health.ui;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import defpackage.ul;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public abstract class BLEStatueListenerAdapter implements BTStatusFragment.BLEStatueListener {
    public static List<HMDeviceSource> getProDevices() {
        return HMDeviceConfig.getProDevices();
    }

    @Override // com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
    public HMDeviceType getHMDeviceType() {
        return HMDeviceType.MILI;
    }

    @Override // com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
    public List<HMDeviceSource> getSupportDevices() {
        return null;
    }

    @Override // com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
    public CharSequence getUnbindStr() {
        return null;
    }

    @Override // com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
    public /* synthetic */ boolean isActivatedDevice() {
        return ul.a(this);
    }

    @Override // com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
    public /* synthetic */ void notifyStatusWhenSetting(boolean z) {
        ul.b(this, z);
    }

    @Override // com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
    public void onEnableChange(boolean z) {
    }

    @Override // com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
    public BTStatusFragment.TopTips setTopTips() {
        return new BTStatusFragment.TopTips(false, "");
    }
}
