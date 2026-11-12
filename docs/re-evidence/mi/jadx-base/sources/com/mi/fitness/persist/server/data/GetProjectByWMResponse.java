package com.mi.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/mi/fitness/persist/server/data/GetProjectByWMResponse;", "", "dataList", "", "Lcom/mi/fitness/persist/server/data/ProjectDataModel;", "waterMark", "", "hasMore", "", "<init>", "(Ljava/util/List;JZ)V", "getDataList", "()Ljava/util/List;", "getWaterMark", "()J", "getHasMore", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetProjectByWMResponse {

    @SerializedName("data_list")
    @Nullable
    private final List<ProjectDataModel> dataList;

    @SerializedName("has_more")
    private final boolean hasMore;

    @SerializedName("watermark")
    private final long waterMark;

    public GetProjectByWMResponse(@Nullable List<ProjectDataModel> list, long j, boolean z) {
        this.dataList = list;
        this.waterMark = j;
        this.hasMore = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetProjectByWMResponse copy$default(GetProjectByWMResponse getProjectByWMResponse, List list, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getProjectByWMResponse.dataList;
        }
        if ((i & 2) != 0) {
            j = getProjectByWMResponse.waterMark;
        }
        if ((i & 4) != 0) {
            z = getProjectByWMResponse.hasMore;
        }
        return getProjectByWMResponse.copy(list, j, z);
    }

    @Nullable
    public final List<ProjectDataModel> component1() {
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
    public final GetProjectByWMResponse copy(@Nullable List<ProjectDataModel> dataList, long waterMark, boolean hasMore) {
        return new GetProjectByWMResponse(dataList, waterMark, hasMore);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetProjectByWMResponse)) {
            return false;
        }
        GetProjectByWMResponse getProjectByWMResponse = (GetProjectByWMResponse) other;
        return Intrinsics.areEqual(this.dataList, getProjectByWMResponse.dataList) && this.waterMark == getProjectByWMResponse.waterMark && this.hasMore == getProjectByWMResponse.hasMore;
    }

    @Nullable
    public final List<ProjectDataModel> getDataList() {
        return this.dataList;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final long getWaterMark() {
        return this.waterMark;
    }

    public int hashCode() {
        List<ProjectDataModel> list = this.dataList;
        return ((((list == null ? 0 : list.hashCode()) * 31) + Long.hashCode(this.waterMark)) * 31) + Boolean.hashCode(this.hasMore);
    }

    @NotNull
    public String toString() {
        return "GetProjectByWMResponse(dataList=" + this.dataList + ", waterMark=" + this.waterMark + ", hasMore=" + this.hasMore + ")";
    }
}
