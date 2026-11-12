package com.xiaomi.fit.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/FitnessDataResultByWM;", "", "dataList", "", "Lcom/xiaomi/fit/fitness/persist/server/data/FitnessDataModel;", "waterMark", "", "hasMore", "", "<init>", "(Ljava/util/List;JZ)V", "getDataList", "()Ljava/util/List;", "getWaterMark", "()J", "getHasMore", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FitnessDataResultByWM {

    @SerializedName("data_list")
    @NotNull
    private final List<FitnessDataModel> dataList;

    @SerializedName("has_more")
    private final boolean hasMore;

    @SerializedName("watermark")
    private final long waterMark;

    public FitnessDataResultByWM(@NotNull List<FitnessDataModel> dataList, long j, boolean z) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.dataList = dataList;
        this.waterMark = j;
        this.hasMore = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FitnessDataResultByWM copy$default(FitnessDataResultByWM fitnessDataResultByWM, List list, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fitnessDataResultByWM.dataList;
        }
        if ((i & 2) != 0) {
            j = fitnessDataResultByWM.waterMark;
        }
        if ((i & 4) != 0) {
            z = fitnessDataResultByWM.hasMore;
        }
        return fitnessDataResultByWM.copy(list, j, z);
    }

    @NotNull
    public final List<FitnessDataModel> component1() {
        return this.dataList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getWaterMark() {
        return this.waterMark;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    @NotNull
    public final FitnessDataResultByWM copy(@NotNull List<FitnessDataModel> dataList, long waterMark, boolean hasMore) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        return new FitnessDataResultByWM(dataList, waterMark, hasMore);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FitnessDataResultByWM)) {
            return false;
        }
        FitnessDataResultByWM fitnessDataResultByWM = (FitnessDataResultByWM) other;
        return Intrinsics.areEqual(this.dataList, fitnessDataResultByWM.dataList) && this.waterMark == fitnessDataResultByWM.waterMark && this.hasMore == fitnessDataResultByWM.hasMore;
    }

    @NotNull
    public final List<FitnessDataModel> getDataList() {
        return this.dataList;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final long getWaterMark() {
        return this.waterMark;
    }

    public int hashCode() {
        return (((this.dataList.hashCode() * 31) + Long.hashCode(this.waterMark)) * 31) + Boolean.hashCode(this.hasMore);
    }

    @NotNull
    public String toString() {
        return "FitnessDataResultByWM(dataList=" + this.dataList + ", waterMark=" + this.waterMark + ", hasMore=" + this.hasMore + ")";
    }
}
