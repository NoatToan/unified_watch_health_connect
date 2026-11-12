package com.xiaomi.hm.health.device.introduce.recocver;

import com.huami.bluetooth.profile.channel.module.syncable.DeviceDataRecover;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/device/introduce/recocver/IRecover;", "Lcom/huami/bluetooth/profile/channel/module/syncable/DeviceDataRecover;", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "device", "", "notRecover", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface IRecover extends DeviceDataRecover {
    boolean notRecover(@NotNull HMMiLiProDevice device);
}
