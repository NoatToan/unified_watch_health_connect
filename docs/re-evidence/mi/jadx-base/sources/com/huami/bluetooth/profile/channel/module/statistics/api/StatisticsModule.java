package com.huami.bluetooth.profile.channel.module.statistics.api;

import com.huami.bluetooth.profile.channel.module.base.SimpleModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import defpackage.r3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/statistics/api/StatisticsModule;", "Lcom/huami/bluetooth/profile/channel/module/base/SimpleModule;", "Lr3;", "channelController", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class StatisticsModule extends SimpleModule {
    public static final int MODULE_ID = 39;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatisticsModule(@NotNull r3 channelController) {
        super(39, channelController);
        Intrinsics.checkNotNullParameter(channelController, "channelController");
    }
}
