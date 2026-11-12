package com.huami.bluetooth.profile.channel.module.battery;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.base.IHMBatteryInfoCallback;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/battery/BatteryApi;", "", "Lcom/xiaomi/hm/health/bt/profile/base/BatteryInfo;", "getBatteryInfo", "Lcom/xiaomi/hm/health/bt/profile/base/IHMBatteryInfoCallback;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "registerBatteryInfoCallback", "", "unregisterBatteryListener", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface BatteryApi {
    @Nullable
    BatteryInfo getBatteryInfo();

    boolean registerBatteryInfoCallback(@NotNull IHMBatteryInfoCallback listener);

    void unregisterBatteryListener(@NotNull IHMBatteryInfoCallback listener);
}
