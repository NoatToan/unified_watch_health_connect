package com.huami.device.core.sync.api.dto;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.device.core.sync.api.type.JobType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0006HÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/huami/device/core/sync/api/dto/ProgressDto;", "", "Lcom/huami/device/core/sync/api/type/JobType;", "component1", "", "component2", "", "component3", "type", "progress", "errorMessage", "copy", "toString", "hashCode", "other", "", "equals", "Lcom/huami/device/core/sync/api/type/JobType;", "getType", "()Lcom/huami/device/core/sync/api/type/JobType;", LogUtil.I, "getProgress", "()I", "Ljava/lang/String;", "getErrorMessage", "()Ljava/lang/String;", "<init>", "(Lcom/huami/device/core/sync/api/type/JobType;ILjava/lang/String;)V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ProgressDto {

    @Nullable
    private final String errorMessage;
    private final int progress;

    @NotNull
    private final JobType type;

    public ProgressDto(@NotNull JobType jobType, int i, @Nullable String str) {
        this.type = jobType;
        this.progress = i;
        this.errorMessage = str;
    }

    public static /* synthetic */ ProgressDto copy$default(ProgressDto progressDto, JobType jobType, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            jobType = progressDto.type;
        }
        if ((i2 & 2) != 0) {
            i = progressDto.progress;
        }
        if ((i2 & 4) != 0) {
            str = progressDto.errorMessage;
        }
        return progressDto.copy(jobType, i, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final JobType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final ProgressDto copy(@NotNull JobType type, int progress, @Nullable String errorMessage) {
        return new ProgressDto(type, progress, errorMessage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressDto)) {
            return false;
        }
        ProgressDto progressDto = (ProgressDto) other;
        return Intrinsics.areEqual(this.type, progressDto.type) && this.progress == progressDto.progress && Intrinsics.areEqual(this.errorMessage, progressDto.errorMessage);
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final int getProgress() {
        return this.progress;
    }

    @NotNull
    public final JobType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((this.type.hashCode() * 31) + this.progress) * 31;
        String str = this.errorMessage;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "ProgressDto(type=" + this.type + ", progress=" + this.progress + ", errorMessage=" + ((Object) this.errorMessage) + ')';
    }

    public /* synthetic */ ProgressDto(JobType jobType, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(jobType, i, (i2 & 4) != 0 ? null : str);
    }
}
