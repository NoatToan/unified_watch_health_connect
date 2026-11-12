package com.xiaomi.hm.health.device;

import com.huami.bluetooth.profile.channel.module.ConnectStatus;
import com.huami.core.device.wifi_settings.bean.WiFiConnectStatus;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/ConnectStatus;", "Lcom/huami/core/device/wifi_settings/bean/WiFiConnectStatus;", "toWoFiConnectStatus", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class BindWiFISettingHelperKt {
    @NotNull
    public static final WiFiConnectStatus toWoFiConnectStatus(@NotNull ConnectStatus connectStatus) {
        return new WiFiConnectStatus(connectStatus.getSsid(), com.huami.core.device.wifi_settings.bean.ConnectStatus.INSTANCE.fromValue(connectStatus.getStatus().getValue()), connectStatus.getErrorCode());
    }
}
