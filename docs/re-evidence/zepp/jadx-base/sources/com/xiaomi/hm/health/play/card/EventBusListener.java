package com.xiaomi.hm.health.play.card;

import com.huami.account.event.EventAccountStatus;
import com.xiaomi.hm.health.device.event.HMDeviceBatteryEvent;
import com.xiaomi.hm.health.device.event.HMDeviceBindEvent;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.event.HMDeviceUnUseUnbindEvent;
import com.xiaomi.hm.health.eventbus.EventUnitChanged;
import com.xiaomi.hm.health.traininglib.event.EventFinishCurrentTraining;
import de.greenrobot.event.EventBus;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0007J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\bJ\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tJ\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\fJ\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\r¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/play/card/EventBusListener;", "", "", "registerEventBus", "Lcom/xiaomi/hm/health/device/event/HMDeviceConnectionEvent;", "event", "onEventMainThread", "Lcom/xiaomi/hm/health/device/event/HMDeviceBindEvent;", "Lcom/xiaomi/hm/health/device/event/HMDeviceUnUseUnbindEvent;", "Lcom/huami/account/event/EventAccountStatus;", "Lcom/xiaomi/hm/health/device/event/HMDeviceBatteryEvent;", "eventBattery", "Lcom/xiaomi/hm/health/traininglib/event/EventFinishCurrentTraining;", "Lcom/xiaomi/hm/health/eventbus/EventUnitChanged;", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class EventBusListener {

    @NotNull
    public static final EventBusListener INSTANCE = new EventBusListener();

    private EventBusListener() {
    }

    public final void onEventMainThread(@NotNull HMDeviceConnectionEvent event) {
        DataNotifiers.INSTANCE.getDeviceConnectNotifier().notifyInvalidated(event);
    }

    public final void registerEventBus() {
        if (EventBus.getDefault().isRegistered(this)) {
            return;
        }
        EventBus.getDefault().register(this);
    }

    public final void onEventMainThread(@NotNull HMDeviceBindEvent event) {
        DataNotifiers.INSTANCE.getDeviceBoundNotifier().notifyInvalidated(event);
    }

    public final void onEventMainThread(@NotNull HMDeviceUnUseUnbindEvent event) {
        DataNotifiers.INSTANCE.getUnUseDeviceBoundNotifier().notifyInvalidated(event);
    }

    public final void onEventMainThread(@NotNull EventAccountStatus event) {
        DataNotifiers.INSTANCE.getLoginNotifier().notifyInvalidated(event);
    }

    public final void onEventMainThread(@NotNull HMDeviceBatteryEvent eventBattery) {
        DataNotifiers.INSTANCE.getDeviceBatteryNotifier().notifyInvalidated(eventBattery);
    }

    public final void onEventMainThread(@NotNull EventFinishCurrentTraining event) {
        DataNotifiers.INSTANCE.getFreeTrainingFinishNotifier().notifyInvalidated(event);
    }

    public final void onEventMainThread(@NotNull EventUnitChanged event) {
        DataNotifiers.INSTANCE.getUnitNotifier().notifyInvalidated(event);
    }
}
