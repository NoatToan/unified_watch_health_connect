package com.huami.watch.companion.sync.ble;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.battery.bean.BatteryInfo;
import com.huami.watch.companion.sync.BaseSyncHelper;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.smartwatch.HMSmartWatchDevice;

/* JADX INFO: loaded from: classes16.dex */
public class SyncBleBatteryInfoHelper extends BaseSyncHelper {
    private static final String f = "Sync-BLE-BatteryInfo";
    private BatteryChangedListener e;

    public interface BatteryChangedListener {
        void onBatteryChanged(BatteryInfo batteryInfo);
    }

    public class a extends HMCallback<com.xiaomi.hm.health.bt.profile.base.BatteryInfo> {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(BatteryInfo batteryInfo) {
            SyncBleBatteryInfoHelper.this.e.onBatteryChanged(batteryInfo);
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onData(@NonNull com.xiaomi.hm.health.bt.profile.base.BatteryInfo batteryInfo) {
            final BatteryInfo batteryInfoC = SyncBleBatteryInfoHelper.this.c(batteryInfo);
            if (SyncBleBatteryInfoHelper.this.e != null) {
                Log.d(SyncBleBatteryInfoHelper.f, "OnBatteryChanged: " + batteryInfoC, new Object[0]);
                Rx.mainThread(new Runnable() { // from class: com.huami.watch.companion.sync.ble.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b(batteryInfoC);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public BatteryInfo c(@NonNull com.xiaomi.hm.health.bt.profile.base.BatteryInfo batteryInfo) {
        BatteryInfo batteryInfo2 = new BatteryInfo();
        batteryInfo2.setBatteryCharging(batteryInfo.isCharging());
        batteryInfo2.setBatteryLevel(batteryInfo.getLevel());
        batteryInfo2.setBatteryChargingTime(batteryInfo.getLastCharge().getTimeInMillis());
        return batteryInfo2;
    }

    public static SyncBleBatteryInfoHelper getHelper() {
        return (SyncBleBatteryInfoHelper) BaseSyncHelper.getHelper(null, null, SyncBleBatteryInfoHelper.class);
    }

    @Nullable
    public BatteryInfo getBatteryInfo() {
        com.xiaomi.hm.health.bt.profile.base.BatteryInfo batteryInfo;
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        if (hMSmartWatchDevice == null || (batteryInfo = hMSmartWatchDevice.getBatteryInfo()) == null) {
            return null;
        }
        return c(batteryInfo);
    }

    public SyncBleBatteryInfoHelper listener(BatteryChangedListener batteryChangedListener) {
        this.e = batteryChangedListener;
        return this;
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public boolean onStart() {
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        if (hMSmartWatchDevice == null) {
            return true;
        }
        hMSmartWatchDevice.setBatteryChangedCallback(new a());
        if (this.e == null) {
            return true;
        }
        BatteryInfo batteryInfo = getBatteryInfo();
        Log.d(f, "OnBatteryChanged: " + batteryInfo, new Object[0]);
        if (batteryInfo == null) {
            return true;
        }
        this.e.onBatteryChanged(batteryInfo);
        return true;
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public void release() {
        super.release();
        this.e = null;
    }
}
