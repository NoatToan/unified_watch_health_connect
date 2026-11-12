package com.xiaomi.hm.health.device.setting.life.impl;

import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle;
import com.xiaomi.hm.health.ui.language.ruler.BaseLangRuler;
import com.xiaomi.hm.health.ui.language.ruler.BilateralLangRuler;
import com.xiaomi.hm.health.ui.language.ruler.KongmingLanguageRuler;
import com.xiaomi.hm.health.ui.language.ruler.LanguageRulerControllerImp;
import com.xiaomi.hm.health.ui.language.ruler.UnilateralLanguageRuler;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016J\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/impl/LanguageLifeCycle;", "Lcom/xiaomi/hm/health/device/setting/life/DeviceLifeCycle;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "hmBaseDevice", "Lcom/xiaomi/hm/health/ui/language/ruler/BaseLangRuler;", "a", "device", "", "onDeviceBind", "onDeviceUnBind", "onBoundedDeviceConnected", "", "deviceId", "onBoundedDeviceDisconnect", "Lcom/xiaomi/hm/health/databases/model/Device;", "", "status", "onDeviceStatusChange", "enable", WatchFaceApi.CUSTOMIZABLE_DISABLE, "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class LanguageLifeCycle implements DeviceLifeCycle, KoinComponent {
    private final BaseLangRuler a(HMBaseDevice hmBaseDevice) {
        return LanguageRulerControllerImp.INSTANCE.getInstance().getFitDeviceLanguageRuler(hmBaseDevice);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceVisibility
    public void disable(@NotNull HMBaseDevice device) {
        BaseLangRuler baseLangRulerA = a(device);
        if (baseLangRulerA == null) {
            return;
        }
        if ((baseLangRulerA instanceof BilateralLangRuler ? baseLangRulerA : null) == null) {
            return;
        }
        ((BilateralLangRuler) baseLangRulerA).disable(device);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceVisibility
    public void enable(@NotNull HMBaseDevice device) {
        BaseLangRuler baseLangRulerA = a(device);
        if (baseLangRulerA instanceof KongmingLanguageRuler) {
            LanguageRulerControllerImp.INSTANCE.getInstance().applyUnilateralLangRuler(false, device);
        } else {
            if (baseLangRulerA == null) {
                return;
            }
            if ((baseLangRulerA instanceof BilateralLangRuler ? baseLangRulerA : null) == null) {
                return;
            }
            ((BilateralLangRuler) baseLangRulerA).enable(device);
        }
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onBoundedDeviceConnected(@NotNull HMBaseDevice device) {
        BaseLangRuler baseLangRulerA = a(device);
        if (baseLangRulerA instanceof KongmingLanguageRuler) {
            LanguageRulerControllerImp.INSTANCE.getInstance().applyUnilateralLangRuler(false, device);
        } else {
            if (baseLangRulerA == null) {
                return;
            }
            if ((baseLangRulerA instanceof BilateralLangRuler ? baseLangRulerA : null) == null) {
                return;
            }
            ((BilateralLangRuler) baseLangRulerA).onBoundedDeviceConnected(device);
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onBoundedDeviceDisconnect(@NotNull String deviceId) {
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onDeviceBind(@NotNull HMBaseDevice device) {
        BaseLangRuler baseLangRulerA = a(device);
        if (baseLangRulerA instanceof UnilateralLanguageRuler) {
            LanguageRulerControllerImp.INSTANCE.getInstance().applyUnilateralLangRuler(true, device);
        } else if (baseLangRulerA instanceof BilateralLangRuler) {
            ((BilateralLangRuler) baseLangRulerA).onDeviceBind(device);
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onDeviceStatusChange(@Nullable Device device, int status) {
        Integer device_type;
        if (status == 1) {
            HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
            HMDeviceType hMDeviceTypeFromValue = (device == null || (device_type = device.getDevice_type()) == null) ? null : HMDeviceType.fromValue(device_type.intValue());
            if (hMDeviceTypeFromValue == null) {
                hMDeviceTypeFromValue = HMDeviceType.MILI;
            }
            BaseLangRuler baseLangRulerA = a(hMDeviceManager.getDevice(hMDeviceTypeFromValue));
            if (baseLangRulerA == null) {
                return;
            }
            if ((baseLangRulerA instanceof BilateralLangRuler ? baseLangRulerA : null) == null) {
                return;
            }
            ((BilateralLangRuler) baseLangRulerA).onDeviceStatusChange(device, status);
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onDeviceUnBind(@NotNull HMBaseDevice device) {
        BaseLangRuler baseLangRulerA = a(device);
        if (baseLangRulerA == null) {
            return;
        }
        if ((baseLangRulerA instanceof BilateralLangRuler ? baseLangRulerA : null) == null) {
            return;
        }
        ((BilateralLangRuler) baseLangRulerA).onDeviceUnBind(device);
    }
}
