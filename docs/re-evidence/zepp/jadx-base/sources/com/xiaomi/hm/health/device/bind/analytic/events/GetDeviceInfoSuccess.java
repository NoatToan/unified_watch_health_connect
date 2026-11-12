package com.xiaomi.hm.health.device.bind.analytic.events;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B%\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\u0014\u001a\u00020\u00028\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/device/bind/analytic/events/GetDeviceInfoSuccess;", "Lcom/xiaomi/hm/health/device/bind/analytic/events/BindEvent;", "", "toString", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "a", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "getDeviceSource", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "b", "Ljava/lang/String;", "getSn", "()Ljava/lang/String;", "sn", "c", "getFwVersion", "fwVersion", GoogleApiAvailabilityLight.a, "getEvent", "event", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class GetDeviceInfoSuccess extends BindEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final HMDeviceSource deviceSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final String sn;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final String fwVersion;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String event;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/bind/analytic/events/GetDeviceInfoSuccess$Companion;", "", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "baseDevice", "Lcom/xiaomi/hm/health/device/bind/analytic/events/GetDeviceInfoSuccess;", "newInstance", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final GetDeviceInfoSuccess newInstance(@Nullable HMBaseDevice baseDevice) {
            DeviceInfo deviceInfo;
            DeviceInfo deviceInfo2;
            String firmwareVersionStr = null;
            HMDeviceSource deviceSource = baseDevice == null ? null : baseDevice.getDeviceSource();
            String serialNumber = (baseDevice == null || (deviceInfo = baseDevice.getDeviceInfo()) == null) ? null : deviceInfo.getSerialNumber();
            if (baseDevice != null && (deviceInfo2 = baseDevice.getDeviceInfo()) != null) {
                firmwareVersionStr = deviceInfo2.getFirmwareVersionStr();
            }
            return new GetDeviceInfoSuccess(deviceSource, serialNumber, firmwareVersionStr);
        }
    }

    public GetDeviceInfoSuccess(@Nullable HMDeviceSource hMDeviceSource, @Nullable String str, @Nullable String str2) {
        super(null);
        this.deviceSource = hMDeviceSource;
        this.sn = str;
        this.fwVersion = str2;
        this.event = "BASE_LBE_BIND_READ_DIS_SUCCESS";
    }

    @JvmStatic
    @NotNull
    public static final GetDeviceInfoSuccess newInstance(@Nullable HMBaseDevice hMBaseDevice) {
        return INSTANCE.newInstance(hMBaseDevice);
    }

    @Nullable
    public final HMDeviceSource getDeviceSource() {
        return this.deviceSource;
    }

    @Override // com.xiaomi.hm.health.device.bind.analytic.events.BindEvent
    @NotNull
    public String getEvent() {
        return this.event;
    }

    @Nullable
    public final String getFwVersion() {
        return this.fwVersion;
    }

    @Nullable
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    public String toString() {
        return "GetDeviceInfoSuccess[]";
    }
}
