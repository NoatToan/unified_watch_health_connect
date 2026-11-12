package com.xiaomi.hm.health.bt.profile.gdsp.common.param;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.device.HMBaseBleDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import java.util.Calendar;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\u0006\u0010 \u001a\u00020\u001b¢\u0006\u0004\b!\u0010\"J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\u0002R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0019\u0010\u0014\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u001a\u001a\u00020\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010 \u001a\u00020\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/GdspDeviceParam;", "", "", "isConnect", "", "getVersion", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "getDeviceSource", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", "getDeviceFeature", "supportSpo2Version", "Lcom/xiaomi/hm/health/bt/device/HMBaseBleDevice;", "a", "Lcom/xiaomi/hm/health/bt/device/HMBaseBleDevice;", "device", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "b", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "getGattPeripheral", "()Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "Ljava/util/Calendar;", "c", "Ljava/util/Calendar;", "getStartTime", "()Ljava/util/Calendar;", "startTime", "", GoogleApiAvailabilityLight.a, "B", "getType", "()B", "type", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMBaseBleDevice;Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;Ljava/util/Calendar;B)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class GdspDeviceParam {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HMBaseBleDevice device;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final GattPeripheral gattPeripheral;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Calendar startTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final byte type;

    public GdspDeviceParam(@NotNull HMBaseBleDevice hMBaseBleDevice, @NotNull GattPeripheral gattPeripheral, @NotNull Calendar calendar, byte b) {
        this.device = hMBaseBleDevice;
        this.gattPeripheral = gattPeripheral;
        this.startTime = calendar;
        this.type = b;
    }

    @NotNull
    public final Feature getDeviceFeature() {
        Feature deviceFeature = this.device.getDeviceInfo().getDeviceFeature();
        return deviceFeature == null ? new Feature() : deviceFeature;
    }

    @NotNull
    public final HMDeviceSource getDeviceSource() {
        return this.device.getDeviceSource();
    }

    @NotNull
    public final GattPeripheral getGattPeripheral() {
        return this.gattPeripheral;
    }

    @NotNull
    public final Calendar getStartTime() {
        return this.startTime;
    }

    public final byte getType() {
        return this.type;
    }

    public final int getVersion() {
        return getDeviceFeature().hasBase(4) ? 1 : 0;
    }

    public final boolean isConnect() {
        return this.device.isConnected();
    }

    public final boolean supportSpo2Version() {
        return getDeviceFeature().hasSw(25);
    }
}
