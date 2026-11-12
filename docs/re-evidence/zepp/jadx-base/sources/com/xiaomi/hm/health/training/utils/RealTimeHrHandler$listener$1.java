package com.xiaomi.hm.health.training.utils;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.mifit.sportlib.common.Constants;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.devicelib.DeviceCenter;
import com.xiaomi.hm.health.devicelib.DeviceConnectionStatus;
import com.xiaomi.hm.health.devicelib.DeviceHr;
import com.xiaomi.hm.health.devicelib.DeviceHrEvent;
import com.xiaomi.hm.health.devicelib.DeviceStep;
import com.xiaomi.hm.health.devicelib.PhonePressure;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.api.util.Loggers;
import com.xiaomi.hm.health.training.ui.widget.RealTimeHrView;
import com.xiaomi.hm.health.training.utils.RealTimeHrHandler$listener$1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¨\u0006\u0017"}, d2 = {"com/xiaomi/hm/health/training/utils/RealTimeHrHandler$listener$1", "Lcom/xiaomi/hm/health/devicelib/DeviceCenter$IPeripheralListener;", "Lcom/xiaomi/hm/health/devicelib/DeviceStep;", "step", "", "onStepData", "Lcom/xiaomi/hm/health/devicelib/DeviceHr;", Constants.DATA_KEY_HR, "onHrData", "Lcom/xiaomi/hm/health/devicelib/PhonePressure;", "pressure", "onPressureData", "Lcom/xiaomi/hm/health/devicelib/DeviceHrEvent;", "stateEvent", "onHrState", "", FirebaseAnalytics.Param.LEVEL, "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "onBatteryLevelChanged", "Lcom/xiaomi/hm/health/devicelib/DeviceConnectionStatus;", "status", "onConnectionStatusChanged", "trainingcomponent_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class RealTimeHrHandler$listener$1 implements DeviceCenter.IPeripheralListener {
    public final /* synthetic */ RealTimeHrHandler a;

    public RealTimeHrHandler$listener$1(RealTimeHrHandler realTimeHrHandler) {
        this.a = realTimeHrHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(DeviceHr deviceHr) {
        return Intrinsics.stringPlus("实时心率：", deviceHr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(DeviceHrEvent deviceHrEvent) {
        return Intrinsics.stringPlus("心率检测状态发生变化：", deviceHrEvent);
    }

    @Override // com.xiaomi.hm.health.devicelib.DeviceCenter.IPeripheralListener
    public void onBatteryLevelChanged(int level, @NotNull HMDeviceSource source) {
    }

    @Override // com.xiaomi.hm.health.devicelib.DeviceCenter.IPeripheralListener
    public void onConnectionStatusChanged(@NotNull DeviceConnectionStatus status, @NotNull HMDeviceSource source) {
    }

    @Override // com.xiaomi.hm.health.devicelib.DeviceCenter.IPeripheralListener
    public void onHrData(@NotNull final DeviceHr hr) {
        if (this.a.hrReceiveListener != null) {
            this.a.hrReceiveListener.onHrReceive(hr.getHr(), RealTimeHrView.HrDetectState.SUCCESS);
        }
        Loggers.getLogger().v(RealTimeHrHandler.e, new Supplier() { // from class: a76
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return RealTimeHrHandler$listener$1.c(hr);
            }
        });
    }

    @Override // com.xiaomi.hm.health.devicelib.DeviceCenter.IPeripheralListener
    public void onHrState(@NotNull final DeviceHrEvent stateEvent) {
        Loggers.getLogger().v(RealTimeHrHandler.e, new Supplier() { // from class: b76
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return RealTimeHrHandler$listener$1.d(stateEvent);
            }
        });
        if (this.a.hrReceiveListener != null) {
            RealTimeHrView.HrDetectState hrDetectState = null;
            int state = stateEvent.getState();
            if (state == 1) {
                hrDetectState = RealTimeHrView.HrDetectState.SUCCESS;
            } else if (state == 2) {
                hrDetectState = RealTimeHrView.HrDetectState.DISCONNECTED;
            } else if (state == 3) {
                hrDetectState = RealTimeHrView.HrDetectState.LOW_BATTERY;
            } else if (state == 4) {
                hrDetectState = RealTimeHrView.HrDetectState.TIMEOUT;
            }
            if (hrDetectState != null) {
                this.a.hrReceiveListener.onHrReceive(stateEvent.getHr(), hrDetectState);
            }
        }
    }

    @Override // com.xiaomi.hm.health.devicelib.DeviceCenter.IPeripheralListener
    public void onPressureData(@NotNull PhonePressure pressure) {
    }

    @Override // com.xiaomi.hm.health.devicelib.DeviceCenter.IPeripheralListener
    public void onStepData(@NotNull DeviceStep step) {
    }
}
