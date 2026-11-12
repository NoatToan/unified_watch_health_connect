package com.huami.feedback.sync.api.device;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b&\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b0\u00101J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J^\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0014\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u000f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\tR\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\"R\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\"R\u0019\u0010\u0014\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/huami/feedback/sync/api/device/FeedbackDevice;", "", "Lcom/huami/feedback/sync/api/device/DeviceType;", "component1", "", "component2", "component3", "", "component4", "()Ljava/lang/Integer;", "component5", "component6", "", "component7", "deviceType", "descriptionName", "deviceSourceName", "deviceSource", "fwVersion", "deviceSN", "supportDeviceLog", "copy", "(Lcom/huami/feedback/sync/api/device/DeviceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Z)Lcom/huami/feedback/sync/api/device/FeedbackDevice;", "toString", "hashCode", "other", "equals", "a", "Lcom/huami/feedback/sync/api/device/DeviceType;", "getDeviceType", "()Lcom/huami/feedback/sync/api/device/DeviceType;", "b", "Ljava/lang/String;", "getDescriptionName", "()Ljava/lang/String;", "c", "getDeviceSourceName", GoogleApiAvailabilityLight.a, "Ljava/lang/Integer;", "getDeviceSource", "e", "getFwVersion", "f", "getDeviceSN", "g", "Z", "getSupportDeviceLog", "()Z", "<init>", "(Lcom/huami/feedback/sync/api/device/DeviceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Z)V", "feedback-sync-device-log-api_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class FeedbackDevice {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final DeviceType deviceType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String descriptionName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String deviceSourceName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer deviceSource;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final String fwVersion;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final String deviceSN;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final boolean supportDeviceLog;

    public FeedbackDevice(@NotNull DeviceType deviceType, @NotNull String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable String str4, boolean z) {
        this.deviceType = deviceType;
        this.descriptionName = str;
        this.deviceSourceName = str2;
        this.deviceSource = num;
        this.fwVersion = str3;
        this.deviceSN = str4;
        this.supportDeviceLog = z;
    }

    public static /* synthetic */ FeedbackDevice copy$default(FeedbackDevice feedbackDevice, DeviceType deviceType, String str, String str2, Integer num, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            deviceType = feedbackDevice.deviceType;
        }
        if ((i & 2) != 0) {
            str = feedbackDevice.descriptionName;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = feedbackDevice.deviceSourceName;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            num = feedbackDevice.deviceSource;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            str3 = feedbackDevice.fwVersion;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = feedbackDevice.deviceSN;
        }
        String str8 = str4;
        if ((i & 64) != 0) {
            z = feedbackDevice.supportDeviceLog;
        }
        return feedbackDevice.copy(deviceType, str5, str6, num2, str7, str8, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DeviceType getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescriptionName() {
        return this.descriptionName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeviceSourceName() {
        return this.deviceSourceName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getDeviceSource() {
        return this.deviceSource;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFwVersion() {
        return this.fwVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDeviceSN() {
        return this.deviceSN;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getSupportDeviceLog() {
        return this.supportDeviceLog;
    }

    @NotNull
    public final FeedbackDevice copy(@NotNull DeviceType deviceType, @NotNull String descriptionName, @Nullable String deviceSourceName, @Nullable Integer deviceSource, @Nullable String fwVersion, @Nullable String deviceSN, boolean supportDeviceLog) {
        return new FeedbackDevice(deviceType, descriptionName, deviceSourceName, deviceSource, fwVersion, deviceSN, supportDeviceLog);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedbackDevice)) {
            return false;
        }
        FeedbackDevice feedbackDevice = (FeedbackDevice) other;
        return this.deviceType == feedbackDevice.deviceType && Intrinsics.areEqual(this.descriptionName, feedbackDevice.descriptionName) && Intrinsics.areEqual(this.deviceSourceName, feedbackDevice.deviceSourceName) && Intrinsics.areEqual(this.deviceSource, feedbackDevice.deviceSource) && Intrinsics.areEqual(this.fwVersion, feedbackDevice.fwVersion) && Intrinsics.areEqual(this.deviceSN, feedbackDevice.deviceSN) && this.supportDeviceLog == feedbackDevice.supportDeviceLog;
    }

    @NotNull
    public final String getDescriptionName() {
        return this.descriptionName;
    }

    @Nullable
    public final String getDeviceSN() {
        return this.deviceSN;
    }

    @Nullable
    public final Integer getDeviceSource() {
        return this.deviceSource;
    }

    @Nullable
    public final String getDeviceSourceName() {
        return this.deviceSourceName;
    }

    @NotNull
    public final DeviceType getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    public final String getFwVersion() {
        return this.fwVersion;
    }

    public final boolean getSupportDeviceLog() {
        return this.supportDeviceLog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v18 */
    public int hashCode() {
        int iHashCode = ((this.deviceType.hashCode() * 31) + this.descriptionName.hashCode()) * 31;
        String str = this.deviceSourceName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.deviceSource;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.fwVersion;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deviceSN;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.supportDeviceLog;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode5 + r1;
    }

    @NotNull
    public String toString() {
        return "FeedbackDevice(deviceType=" + this.deviceType + ", descriptionName=" + this.descriptionName + ", deviceSourceName=" + ((Object) this.deviceSourceName) + ", deviceSource=" + this.deviceSource + ", fwVersion=" + ((Object) this.fwVersion) + ", deviceSN=" + ((Object) this.deviceSN) + ", supportDeviceLog=" + this.supportDeviceLog + ')';
    }
}
