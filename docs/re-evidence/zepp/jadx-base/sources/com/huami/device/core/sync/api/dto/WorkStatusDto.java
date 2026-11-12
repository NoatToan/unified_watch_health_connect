package com.huami.device.core.sync.api.dto;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.device.core.sync.api.status.DeviceWorkStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J3\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/huami/device/core/sync/api/dto/WorkStatusDto;", "", "", "component1", "Lcom/huami/device/core/sync/api/status/DeviceWorkStatus;", "component2", "Lcom/huami/device/core/sync/api/dto/ProgressDto;", "component3", "", "component4", "deviceId", "workStatus", "progress", "errorCode", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getDeviceId", "()Ljava/lang/String;", "Lcom/huami/device/core/sync/api/status/DeviceWorkStatus;", "getWorkStatus", "()Lcom/huami/device/core/sync/api/status/DeviceWorkStatus;", "Lcom/huami/device/core/sync/api/dto/ProgressDto;", "getProgress", "()Lcom/huami/device/core/sync/api/dto/ProgressDto;", LogUtil.I, "getErrorCode", "()I", "<init>", "(Ljava/lang/String;Lcom/huami/device/core/sync/api/status/DeviceWorkStatus;Lcom/huami/device/core/sync/api/dto/ProgressDto;I)V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WorkStatusDto {

    @NotNull
    private final String deviceId;
    private final int errorCode;

    @Nullable
    private final ProgressDto progress;

    @NotNull
    private final DeviceWorkStatus workStatus;

    public WorkStatusDto(@NotNull String str, @NotNull DeviceWorkStatus deviceWorkStatus, @Nullable ProgressDto progressDto, int i) {
        this.deviceId = str;
        this.workStatus = deviceWorkStatus;
        this.progress = progressDto;
        this.errorCode = i;
    }

    public static /* synthetic */ WorkStatusDto copy$default(WorkStatusDto workStatusDto, String str, DeviceWorkStatus deviceWorkStatus, ProgressDto progressDto, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = workStatusDto.deviceId;
        }
        if ((i2 & 2) != 0) {
            deviceWorkStatus = workStatusDto.workStatus;
        }
        if ((i2 & 4) != 0) {
            progressDto = workStatusDto.progress;
        }
        if ((i2 & 8) != 0) {
            i = workStatusDto.errorCode;
        }
        return workStatusDto.copy(str, deviceWorkStatus, progressDto, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DeviceWorkStatus getWorkStatus() {
        return this.workStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ProgressDto getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final WorkStatusDto copy(@NotNull String deviceId, @NotNull DeviceWorkStatus workStatus, @Nullable ProgressDto progress, int errorCode) {
        return new WorkStatusDto(deviceId, workStatus, progress, errorCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkStatusDto)) {
            return false;
        }
        WorkStatusDto workStatusDto = (WorkStatusDto) other;
        return Intrinsics.areEqual(this.deviceId, workStatusDto.deviceId) && this.workStatus == workStatusDto.workStatus && Intrinsics.areEqual(this.progress, workStatusDto.progress) && this.errorCode == workStatusDto.errorCode;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final ProgressDto getProgress() {
        return this.progress;
    }

    @NotNull
    public final DeviceWorkStatus getWorkStatus() {
        return this.workStatus;
    }

    public int hashCode() {
        int iHashCode = ((this.deviceId.hashCode() * 31) + this.workStatus.hashCode()) * 31;
        ProgressDto progressDto = this.progress;
        return ((iHashCode + (progressDto == null ? 0 : progressDto.hashCode())) * 31) + this.errorCode;
    }

    @NotNull
    public String toString() {
        return "WorkStatusDto(deviceId=" + this.deviceId + ", workStatus=" + this.workStatus + ", progress=" + this.progress + ", errorCode=" + this.errorCode + ')';
    }

    public /* synthetic */ WorkStatusDto(String str, DeviceWorkStatus deviceWorkStatus, ProgressDto progressDto, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, deviceWorkStatus, (i2 & 4) != 0 ? null : progressDto, (i2 & 8) != 0 ? 0 : i);
    }
}
