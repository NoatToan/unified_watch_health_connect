package com.xiaomi.hm.health.device.recover;

import com.huami.bluetooth.profile.channel.module.syncable.DeviceDataRecover;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.introduce.RestoreItem;
import com.xiaomi.hm.health.device.introduce.recocver.DeviceConfigRestore;
import com.xiaomi.hm.health.device.introduce.recocver.IRecover;
import com.xiaomi.hm.health.device.introduce.recocver.IRecoverManager;
import com.xiaomi.hm.health.device.introduce.recocver.PaiRestore;
import com.xiaomi.hm.health.device.introduce.recocver.ScheduleRestore;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/device/recover/RecoverManager;", "Lcom/xiaomi/hm/health/device/introduce/recocver/IRecoverManager;", "Ljava/lang/Class;", "Lcom/xiaomi/hm/health/device/introduce/RestoreItem;", "clazz", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "", "Lcom/xiaomi/hm/health/device/introduce/recocver/IRecover;", "getRestoreList", "Lcom/huami/bluetooth/profile/channel/module/syncable/DeviceDataRecover;", "getForceRestoreList", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class RecoverManager implements IRecoverManager {
    @Override // com.xiaomi.hm.health.device.introduce.recocver.IRecoverManager
    @NotNull
    public List<DeviceDataRecover> getForceRestoreList(@NotNull HMDeviceSource deviceSource) {
        ArrayList arrayList = new ArrayList(IRecoverManager.DefaultImpls.getForceRestoreList(this, deviceSource));
        arrayList.add(new MemberRestore());
        arrayList.add(new ScheduleRestore());
        return arrayList;
    }

    @Override // com.xiaomi.hm.health.device.introduce.recocver.IRecoverManager
    @NotNull
    public List<IRecover> getRestoreList(@NotNull Class<? extends RestoreItem> clazz, @NotNull HMDeviceSource deviceSource) {
        ArrayList arrayList = new ArrayList();
        if (Intrinsics.areEqual(clazz, DeviceConfigRestore.class)) {
            arrayList.add(new VibrateRestore());
            arrayList.add(new WatchSettingsRecover());
            arrayList.add(new SportHrBroadcastRecover());
            arrayList.add(new HealthRecover());
            if (ConfigHelperKt.hasFeature(deviceSource, Feature.BACK_LIGHT_SOURCE_S)) {
                arrayList.add(new NightModeRecover());
            }
            arrayList.add(new WeatherRecover());
            arrayList.add(new NotificationRecover());
            arrayList.add(new WomenHealthRecover());
            if (HMDeviceConfig.hasFeaturePro(deviceSource)) {
                arrayList.add(new LongSitRecover());
            }
            arrayList.add(new UnitRecover());
            arrayList.add(new SleepDataRecover());
            arrayList.add(new ZeppCoachRecover());
        } else {
            Intrinsics.areEqual(clazz, PaiRestore.class);
        }
        return arrayList;
    }
}
