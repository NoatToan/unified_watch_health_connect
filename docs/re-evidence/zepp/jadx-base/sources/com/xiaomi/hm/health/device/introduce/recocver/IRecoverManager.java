package com.xiaomi.hm.health.device.introduce.recocver;

import com.huami.bluetooth.profile.channel.module.syncable.DeviceDataRecover;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.introduce.RestoreItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/device/introduce/recocver/IRecoverManager;", "", "Ljava/lang/Class;", "Lcom/xiaomi/hm/health/device/introduce/RestoreItem;", "clazz", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "", "Lcom/xiaomi/hm/health/device/introduce/recocver/IRecover;", "getRestoreList", "Lcom/huami/bluetooth/profile/channel/module/syncable/DeviceDataRecover;", "getForceRestoreList", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface IRecoverManager {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @NotNull
        public static List<DeviceDataRecover> getForceRestoreList(@NotNull IRecoverManager iRecoverManager, @NotNull HMDeviceSource hMDeviceSource) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    @NotNull
    List<DeviceDataRecover> getForceRestoreList(@NotNull HMDeviceSource deviceSource);

    @NotNull
    List<IRecover> getRestoreList(@NotNull Class<? extends RestoreItem> clazz, @NotNull HMDeviceSource deviceSource);
}
