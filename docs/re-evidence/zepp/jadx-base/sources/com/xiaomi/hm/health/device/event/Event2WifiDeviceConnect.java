package com.xiaomi.hm.health.device.event;

import com.huami.core.device.wifi_settings.bean.WifiDeviceConnect;
import com.huami.core.device.wifi_settings.service.WiFiSettingInit;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.jeremyliao.liveeventbus.LiveEventBus;
import de.greenrobot.event.EventBus;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/device/event/Event2WifiDeviceConnect;", "", "", "register", "", "eventBusConnect", "Lcom/xiaomi/hm/health/device/event/HMDeviceConnectionEvent;", "event", "onEventMainThread", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class Event2WifiDeviceConnect {
    public final void eventBusConnect(boolean register) {
        if (register) {
            EventBus.getDefault().register(this);
        } else {
            EventBus.getDefault().unregister(this);
        }
    }

    public final void onEventMainThread(@NotNull HMDeviceConnectionEvent event) {
        LiveEventBus.get(WiFiSettingInit.KEY_DEVICE_EVENT, WifiDeviceConnect.class).post(new WifiDeviceConnect(event.getConnectionType(), ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(event.getDeviceType()).getValue()));
    }
}
