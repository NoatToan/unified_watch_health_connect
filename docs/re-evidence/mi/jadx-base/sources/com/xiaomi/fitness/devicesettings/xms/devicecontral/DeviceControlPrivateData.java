package com.xiaomi.fitness.devicesettings.xms.devicecontral;

import com.miui.circulate.api.service.CirculateDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/xms/devicecontral/DeviceControlPrivateData;", "", CirculateDeviceInfo.IS_SUPPORT_STOP_FIND, "", "radius", "", "width", "height", "model", "", "<init>", "(ZIIILjava/lang/String;)V", "()Z", "getRadius", "()I", "getWidth", "getHeight", "getModel", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceControlPrivateData {
    private final int height;
    private final boolean isSupportStopFind;

    @Nullable
    private final String model;
    private final int radius;
    private final int width;

    public DeviceControlPrivateData(boolean z, int i, int i2, int i3, @Nullable String str) {
        this.isSupportStopFind = z;
        this.radius = i;
        this.width = i2;
        this.height = i3;
        this.model = str;
    }

    public static /* synthetic */ DeviceControlPrivateData copy$default(DeviceControlPrivateData deviceControlPrivateData, boolean z, int i, int i2, int i3, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = deviceControlPrivateData.isSupportStopFind;
        }
        if ((i4 & 2) != 0) {
            i = deviceControlPrivateData.radius;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = deviceControlPrivateData.width;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            i3 = deviceControlPrivateData.height;
        }
        int i7 = i3;
        if ((i4 & 16) != 0) {
            str = deviceControlPrivateData.model;
        }
        return deviceControlPrivateData.copy(z, i5, i6, i7, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsSupportStopFind() {
        return this.isSupportStopFind;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRadius() {
        return this.radius;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final DeviceControlPrivateData copy(boolean isSupportStopFind, int radius, int width, int height, @Nullable String model) {
        return new DeviceControlPrivateData(isSupportStopFind, radius, width, height, model);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceControlPrivateData)) {
            return false;
        }
        DeviceControlPrivateData deviceControlPrivateData = (DeviceControlPrivateData) other;
        return this.isSupportStopFind == deviceControlPrivateData.isSupportStopFind && this.radius == deviceControlPrivateData.radius && this.width == deviceControlPrivateData.width && this.height == deviceControlPrivateData.height && Intrinsics.areEqual(this.model, deviceControlPrivateData.model);
    }

    public final int getHeight() {
        return this.height;
    }

    @Nullable
    public final String getModel() {
        return this.model;
    }

    public final int getRadius() {
        return this.radius;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.isSupportStopFind) * 31) + Integer.hashCode(this.radius)) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31;
        String str = this.model;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean isSupportStopFind() {
        return this.isSupportStopFind;
    }

    @NotNull
    public String toString() {
        return "DeviceControlPrivateData(isSupportStopFind=" + this.isSupportStopFind + ", radius=" + this.radius + ", width=" + this.width + ", height=" + this.height + ", model=" + this.model + ")";
    }
}
