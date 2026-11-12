package com.xiaomi.hm.health.device.bind.analytic.events;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.hid.takepic.TakePicSettingActivity;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\u000e\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0014\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u001a\u001a\u00020\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\u00020\u00028\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010\u0005\u001a\u0004\b\u001c\u0010\u0007¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/device/bind/analytic/events/BindStart;", "Lcom/xiaomi/hm/health/device/bind/analytic/events/BindEvent;", "", "toString", "a", "Ljava/lang/String;", "getMacAddress", "()Ljava/lang/String;", TakePicSettingActivity.KEY_ADDRESS, "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "b", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "getDeviceSource", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "", "c", LogUtil.I, "getBindMode", "()I", "bindMode", "", GoogleApiAvailabilityLight.a, "Z", "getKnownDevice", "()Z", "knownDevice", "e", "getEvent", "event", "<init>", "(Ljava/lang/String;Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;IZ)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BindStart extends BindEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String macAddress;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HMDeviceSource deviceSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int bindMode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean knownDevice;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final String event;

    public BindStart(@NotNull String str, @NotNull HMDeviceSource hMDeviceSource, int i, boolean z) {
        super(null);
        this.macAddress = str;
        this.deviceSource = hMDeviceSource;
        this.bindMode = i;
        this.knownDevice = z;
        this.event = "BASE_LBE_BIND_START";
    }

    public final int getBindMode() {
        return this.bindMode;
    }

    @NotNull
    public final HMDeviceSource getDeviceSource() {
        return this.deviceSource;
    }

    @Override // com.xiaomi.hm.health.device.bind.analytic.events.BindEvent
    @NotNull
    public String getEvent() {
        return this.event;
    }

    public final boolean getKnownDevice() {
        return this.knownDevice;
    }

    @NotNull
    public final String getMacAddress() {
        return this.macAddress;
    }

    @NotNull
    public String toString() {
        return "BindStart[macAddress: " + this.macAddress + ", deviceSource: " + this.deviceSource + ", bindMode: " + this.bindMode + ", knownDevice: " + this.knownDevice + "]";
    }
}
