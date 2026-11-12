package com.huami.bluetooth.profile.channel.module.hearing;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.annotation.ChannelModule;
import com.huami.bluetooth.profile.channel.module.hearing.entity.HearingDeviceListener;
import com.huami.bluetooth.profile.channel.module.hearing.entity.battery.BatteryInfo;
import com.huami.bluetooth.profile.channel.module.hearing.entity.battery.DeviceParts;
import com.huami.bluetooth.profile.channel.module.hearing.entity.battery.EarphoneStatus;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@ChannelModule(id = 53)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J<\u0010\t\u001a\u00020\u000722\u0010\b\u001a.\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006\u0012\u0004\u0012\u00020\u00070\u0002H&J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&J\u001c\u0010\u000e\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u0002H&R\u0016\u0010\u0012\u001a\u00020\u000f8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingBatteryApi;", "", "Lkotlin/Function1;", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/hearing/entity/battery/DeviceParts;", "Lcom/huami/bluetooth/profile/channel/module/hearing/entity/battery/BatteryInfo;", "Lkotlin/collections/HashMap;", "", "onResult", "queryBattery", "Lcom/huami/bluetooth/profile/channel/module/hearing/entity/HearingDeviceListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnHearingListener", "Lcom/huami/bluetooth/profile/channel/module/hearing/entity/battery/EarphoneStatus;", "queryEarphoneStatus", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidProtocolVersion;", "getVersion", "()Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidProtocolVersion;", "version", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface HearingBatteryApi {
    @NotNull
    HearingAidProtocolVersion getVersion();

    void queryBattery(@NotNull Function1<? super HashMap<DeviceParts, BatteryInfo>, Unit> onResult);

    void queryEarphoneStatus(@NotNull Function1<? super EarphoneStatus, Unit> onResult);

    void setOnHearingListener(@NotNull HearingDeviceListener listener);
}
