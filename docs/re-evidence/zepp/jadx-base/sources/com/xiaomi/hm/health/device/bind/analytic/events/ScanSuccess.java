package com.xiaomi.hm.health.device.bind.analytic.events;

import android.bluetooth.BluetoothDevice;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.hid.takepic.TakePicSettingActivity;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.scan.AdvData;
import com.xiaomi.hm.health.device.bind.analytic.ConstantKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB#\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\u00020\u00028\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/device/bind/analytic/events/ScanSuccess;", "Lcom/xiaomi/hm/health/device/bind/analytic/events/BindEvent;", "", "toString", "", "a", LogUtil.I, "getRssi", "()I", ConstantKt.KEY_RSSI, "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "b", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "getDeviceSource", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "c", "Ljava/lang/String;", "getMacAddress", "()Ljava/lang/String;", TakePicSettingActivity.KEY_ADDRESS, GoogleApiAvailabilityLight.a, "getEvent", "event", "<init>", "(ILcom/xiaomi/hm/health/bt/device/HMDeviceSource;Ljava/lang/String;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class ScanSuccess extends BindEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int rssi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final HMDeviceSource deviceSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final String macAddress;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String event;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/device/bind/analytic/events/ScanSuccess$Companion;", "", "", "name", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "a", "Lcom/xiaomi/hm/health/bt/scan/AdvData;", "advData", "Lcom/xiaomi/hm/health/device/bind/analytic/events/ScanSuccess;", "newInstance", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final HMDeviceSource a(String name) {
            if (name == null) {
                return null;
            }
            return ((DeviceUtilsApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), null, null)).nameToDeviceSource(name);
        }

        @JvmStatic
        @NotNull
        public final ScanSuccess newInstance(@NotNull AdvData advData) {
            int i = advData.rssi;
            HMDeviceSource hMDeviceSourceA = a(advData.getDeviceName());
            BluetoothDevice bluetoothDevice = advData.device;
            return new ScanSuccess(i, hMDeviceSourceA, bluetoothDevice == null ? null : bluetoothDevice.getAddress());
        }
    }

    public ScanSuccess(int i, @Nullable HMDeviceSource hMDeviceSource, @Nullable String str) {
        super(null);
        this.rssi = i;
        this.deviceSource = hMDeviceSource;
        this.macAddress = str;
        this.event = "BASE_LBE_BIND_SCAN_SUCCESS";
    }

    @JvmStatic
    @NotNull
    public static final ScanSuccess newInstance(@NotNull AdvData advData) {
        return INSTANCE.newInstance(advData);
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
    public final String getMacAddress() {
        return this.macAddress;
    }

    public final int getRssi() {
        return this.rssi;
    }

    @NotNull
    public String toString() {
        return "ScanSuccess[rssi: " + this.rssi + ", source: " + this.deviceSource + ", address: " + this.macAddress + "]";
    }
}
