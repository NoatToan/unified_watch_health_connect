package com.huami.bluetooth.profile.channel.module.statistics.api;

import com.huami.bluetooth.profile.channel.module.BuiltInModule;
import com.huami.bluetooth.profile.channel.module.statistics.ICompatStatisticsApi;
import com.huami.bluetooth.profile.channel.module.statistics.IOldStatisticsApiDelegate;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/statistics/api/StatisticsApiFactory;", "", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "Lcom/huami/bluetooth/profile/channel/module/statistics/IOldStatisticsApiDelegate;", "oldProtocolDelegate", "Lcom/huami/bluetooth/profile/channel/module/statistics/ICompatStatisticsApi;", "createStatisticsApi", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class StatisticsApiFactory {

    @NotNull
    public static final StatisticsApiFactory INSTANCE = new StatisticsApiFactory();

    private StatisticsApiFactory() {
    }

    @JvmStatic
    @NotNull
    public static final ICompatStatisticsApi createStatisticsApi(@NotNull HMBaseDevice device, @NotNull IOldStatisticsApiDelegate oldProtocolDelegate) {
        BuiltInModule builtInModule = (BuiltInModule) device.getChannelModule(BuiltInModule.class);
        return builtInModule == null ? false : builtInModule.supportModule(39) ? new StatisticsApi(device) : new CompatStatisticsApi(oldProtocolDelegate);
    }
}
