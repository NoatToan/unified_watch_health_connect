package com.xiaomi.hm.health.play.card;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.event.EventAccountStatus;
import com.xiaomi.hm.health.device.event.HMDeviceBatteryEvent;
import com.xiaomi.hm.health.device.event.HMDeviceBindEvent;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.event.HMDeviceUnUseUnbindEvent;
import com.xiaomi.hm.health.eventbus.EventUnitChanged;
import com.xiaomi.hm.health.traininglib.event.EventFinishCurrentTraining;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007R\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0005\u001a\u0004\b\u000f\u0010\u0007R\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0005\u001a\u0004\b\u0013\u0010\u0007R\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0005\u001a\u0004\b\u0017\u0010\u0007R\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0005\u001a\u0004\b\u001b\u0010\u0007R\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0005\u001a\u0004\b\u001f\u0010\u0007¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/play/card/DataNotifiers;", "", "Lcom/xiaomi/hm/health/play/card/DataNotifier;", "Lcom/xiaomi/hm/health/device/event/HMDeviceConnectionEvent;", "a", "Lcom/xiaomi/hm/health/play/card/DataNotifier;", "getDeviceConnectNotifier", "()Lcom/xiaomi/hm/health/play/card/DataNotifier;", "deviceConnectNotifier", "Lcom/xiaomi/hm/health/device/event/HMDeviceBindEvent;", "b", "getDeviceBoundNotifier", "deviceBoundNotifier", "Lcom/xiaomi/hm/health/device/event/HMDeviceUnUseUnbindEvent;", "c", "getUnUseDeviceBoundNotifier", "unUseDeviceBoundNotifier", "Lcom/huami/account/event/EventAccountStatus;", GoogleApiAvailabilityLight.a, "getLoginNotifier", "loginNotifier", "Lcom/xiaomi/hm/health/device/event/HMDeviceBatteryEvent;", "e", "getDeviceBatteryNotifier", "deviceBatteryNotifier", "Lcom/xiaomi/hm/health/traininglib/event/EventFinishCurrentTraining;", "f", "getFreeTrainingFinishNotifier", "freeTrainingFinishNotifier", "Lcom/xiaomi/hm/health/eventbus/EventUnitChanged;", "g", "getUnitNotifier", "unitNotifier", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DataNotifiers {

    @NotNull
    public static final DataNotifiers INSTANCE = new DataNotifiers();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final DataNotifier<HMDeviceConnectionEvent> deviceConnectNotifier = new DataNotifier<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final DataNotifier<HMDeviceBindEvent> deviceBoundNotifier = new DataNotifier<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final DataNotifier<HMDeviceUnUseUnbindEvent> unUseDeviceBoundNotifier = new DataNotifier<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final DataNotifier<EventAccountStatus> loginNotifier = new DataNotifier<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final DataNotifier<HMDeviceBatteryEvent> deviceBatteryNotifier = new DataNotifier<>();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final DataNotifier<EventFinishCurrentTraining> freeTrainingFinishNotifier = new DataNotifier<>();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final DataNotifier<EventUnitChanged> unitNotifier = new DataNotifier<>();

    private DataNotifiers() {
    }

    @NotNull
    public final DataNotifier<HMDeviceBatteryEvent> getDeviceBatteryNotifier() {
        return deviceBatteryNotifier;
    }

    @NotNull
    public final DataNotifier<HMDeviceBindEvent> getDeviceBoundNotifier() {
        return deviceBoundNotifier;
    }

    @NotNull
    public final DataNotifier<HMDeviceConnectionEvent> getDeviceConnectNotifier() {
        return deviceConnectNotifier;
    }

    @NotNull
    public final DataNotifier<EventFinishCurrentTraining> getFreeTrainingFinishNotifier() {
        return freeTrainingFinishNotifier;
    }

    @NotNull
    public final DataNotifier<EventAccountStatus> getLoginNotifier() {
        return loginNotifier;
    }

    @NotNull
    public final DataNotifier<HMDeviceUnUseUnbindEvent> getUnUseDeviceBoundNotifier() {
        return unUseDeviceBoundNotifier;
    }

    @NotNull
    public final DataNotifier<EventUnitChanged> getUnitNotifier() {
        return unitNotifier;
    }
}
