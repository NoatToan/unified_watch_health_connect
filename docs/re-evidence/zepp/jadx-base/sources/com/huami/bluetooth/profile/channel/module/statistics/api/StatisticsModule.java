package com.huami.bluetooth.profile.channel.module.statistics.api;

import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.module.base.SimpleModule;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/statistics/api/StatisticsModule;", "Lcom/huami/bluetooth/profile/channel/module/base/SimpleModule;", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelController", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class StatisticsModule extends SimpleModule {
    public static final int MODULE_ID = 39;

    public StatisticsModule(@NotNull ChannelApi channelApi) {
        super(39, channelApi);
    }
}
