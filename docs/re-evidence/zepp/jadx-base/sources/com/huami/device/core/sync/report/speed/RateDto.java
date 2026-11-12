package com.huami.device.core.sync.report.speed;

import com.huami.device.core.sync.api.type.JobType;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/huami/device/core/sync/report/speed/RateDto;", "", "Lcom/huami/device/core/sync/api/type/JobType;", "component1", "", "component2", "component3", "", "Lcom/huami/device/core/sync/report/speed/TransferItem;", "component4", "jobType", "dataSize", "bleCost", "subTasks", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/huami/device/core/sync/api/type/JobType;", "getJobType", "()Lcom/huami/device/core/sync/api/type/JobType;", "J", "getDataSize", "()J", "getBleCost", "Ljava/lang/Iterable;", "getSubTasks", "()Ljava/lang/Iterable;", "<init>", "(Lcom/huami/device/core/sync/api/type/JobType;JJLjava/lang/Iterable;)V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RateDto {
    private final long bleCost;
    private final long dataSize;

    @NotNull
    private final JobType jobType;

    @NotNull
    private final Iterable<TransferItem> subTasks;

    public RateDto(@NotNull JobType jobType, long j, long j2, @NotNull Iterable<TransferItem> iterable) {
        this.jobType = jobType;
        this.dataSize = j;
        this.bleCost = j2;
        this.subTasks = iterable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RateDto copy$default(RateDto rateDto, JobType jobType, long j, long j2, Iterable iterable, int i, Object obj) {
        if ((i & 1) != 0) {
            jobType = rateDto.jobType;
        }
        if ((i & 2) != 0) {
            j = rateDto.dataSize;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = rateDto.bleCost;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            iterable = rateDto.subTasks;
        }
        return rateDto.copy(jobType, j3, j4, iterable);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final JobType getJobType() {
        return this.jobType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDataSize() {
        return this.dataSize;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getBleCost() {
        return this.bleCost;
    }

    @NotNull
    public final Iterable<TransferItem> component4() {
        return this.subTasks;
    }

    @NotNull
    public final RateDto copy(@NotNull JobType jobType, long dataSize, long bleCost, @NotNull Iterable<TransferItem> subTasks) {
        return new RateDto(jobType, dataSize, bleCost, subTasks);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RateDto)) {
            return false;
        }
        RateDto rateDto = (RateDto) other;
        return Intrinsics.areEqual(this.jobType, rateDto.jobType) && this.dataSize == rateDto.dataSize && this.bleCost == rateDto.bleCost && Intrinsics.areEqual(this.subTasks, rateDto.subTasks);
    }

    public final long getBleCost() {
        return this.bleCost;
    }

    public final long getDataSize() {
        return this.dataSize;
    }

    @NotNull
    public final JobType getJobType() {
        return this.jobType;
    }

    @NotNull
    public final Iterable<TransferItem> getSubTasks() {
        return this.subTasks;
    }

    public int hashCode() {
        return (((((this.jobType.hashCode() * 31) + b.a(this.dataSize)) * 31) + b.a(this.bleCost)) * 31) + this.subTasks.hashCode();
    }

    @NotNull
    public String toString() {
        return "RateDto(jobType=" + this.jobType + ", dataSize=" + this.dataSize + ", bleCost=" + this.bleCost + ", subTasks=" + this.subTasks + ')';
    }
}
