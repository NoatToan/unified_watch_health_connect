package com.xiaomi.hm.health.device.medical;

import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0012\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0004\u001a\u0012\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0004¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "isMedicalDevice", "", "isMedicalCollectDevice", "isMedicalHealthData", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class MedicalUtilKt {
    public static final boolean isMedicalCollectDevice(@Nullable HMDeviceSource hMDeviceSource) {
        if (DeviceXFunctionsKt.getBuildConfigApi().isForceMedicalCollectDevice()) {
            return true;
        }
        Boolean boolValueOf = hMDeviceSource == null ? null : Boolean.valueOf(ConfigHelperKt.hasFeature(hMDeviceSource, Feature.IS_MEDICAL_COLLECT_DEVICE));
        return boolValueOf == null ? ConfigHelperKt.hasFeature(Feature.IS_MEDICAL_COLLECT_DEVICE) : boolValueOf.booleanValue();
    }

    public static /* synthetic */ boolean isMedicalCollectDevice$default(HMDeviceSource hMDeviceSource, int i, Object obj) {
        if ((i & 1) != 0) {
            hMDeviceSource = null;
        }
        return isMedicalCollectDevice(hMDeviceSource);
    }

    public static final boolean isMedicalDevice(@Nullable HMDeviceSource hMDeviceSource) {
        if (DeviceXFunctionsKt.getBuildConfigApi().isForceMedicalDevice()) {
            return true;
        }
        Boolean boolValueOf = hMDeviceSource == null ? null : Boolean.valueOf(ConfigHelperKt.hasFeature(hMDeviceSource, Feature.IS_MEDICAL_DEVICE));
        return boolValueOf == null ? ConfigHelperKt.hasFeature(Feature.IS_MEDICAL_DEVICE) : boolValueOf.booleanValue();
    }

    public static /* synthetic */ boolean isMedicalDevice$default(HMDeviceSource hMDeviceSource, int i, Object obj) {
        if ((i & 1) != 0) {
            hMDeviceSource = null;
        }
        return isMedicalDevice(hMDeviceSource);
    }

    public static final boolean isMedicalHealthData(@Nullable HMDeviceSource hMDeviceSource) {
        return isMedicalDevice(hMDeviceSource) || isMedicalCollectDevice(hMDeviceSource);
    }

    public static /* synthetic */ boolean isMedicalHealthData$default(HMDeviceSource hMDeviceSource, int i, Object obj) {
        if ((i & 1) != 0) {
            hMDeviceSource = null;
        }
        return isMedicalHealthData(hMDeviceSource);
    }

    public static final boolean isMedicalHealthData(int i) {
        return isMedicalHealthData(i);
    }

    public static final boolean isMedicalCollectDevice(int i) {
        return isMedicalCollectDevice(HMDeviceSource.fromValue(i));
    }

    public static final boolean isMedicalDevice(int i) {
        return isMedicalDevice(HMDeviceSource.fromValue(i));
    }
}
