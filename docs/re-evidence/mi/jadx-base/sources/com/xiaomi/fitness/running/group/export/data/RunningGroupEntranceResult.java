package com.xiaomi.fitness.running.group.export.data;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/running/group/export/data/RunningGroupEntranceResult;", "", "list", "", "Lcom/xiaomi/fitness/running/group/export/data/RunningGroupEntranceItemData;", "discover", "Lcom/xiaomi/fitness/running/group/export/data/RunningGroupFindItemData;", "url", "", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getList", "()Ljava/util/List;", "getDiscover", "getUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "running-group-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RunningGroupEntranceResult {

    @SerializedName("discovery_team")
    @Nullable
    private final List<RunningGroupFindItemData> discover;

    @SerializedName("entrance_list")
    @Nullable
    private final List<RunningGroupEntranceItemData> list;

    @NotNull
    private final String url;

    public RunningGroupEntranceResult(@Nullable List<RunningGroupEntranceItemData> list, @Nullable List<RunningGroupFindItemData> list2, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.list = list;
        this.discover = list2;
        this.url = url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RunningGroupEntranceResult copy$default(RunningGroupEntranceResult runningGroupEntranceResult, List list, List list2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = runningGroupEntranceResult.list;
        }
        if ((i & 2) != 0) {
            list2 = runningGroupEntranceResult.discover;
        }
        if ((i & 4) != 0) {
            str = runningGroupEntranceResult.url;
        }
        return runningGroupEntranceResult.copy(list, list2, str);
    }

    @Nullable
    public final List<RunningGroupEntranceItemData> component1() {
        return this.list;
    }

    @Nullable
    public final List<RunningGroupFindItemData> component2() {
        return this.discover;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final RunningGroupEntranceResult copy(@Nullable List<RunningGroupEntranceItemData> list, @Nullable List<RunningGroupFindItemData> discover, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new RunningGroupEntranceResult(list, discover, url);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RunningGroupEntranceResult)) {
            return false;
        }
        RunningGroupEntranceResult runningGroupEntranceResult = (RunningGroupEntranceResult) other;
        return Intrinsics.areEqual(this.list, runningGroupEntranceResult.list) && Intrinsics.areEqual(this.discover, runningGroupEntranceResult.discover) && Intrinsics.areEqual(this.url, runningGroupEntranceResult.url);
    }

    @Nullable
    public final List<RunningGroupFindItemData> getDiscover() {
        return this.discover;
    }

    @Nullable
    public final List<RunningGroupEntranceItemData> getList() {
        return this.list;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        List<RunningGroupEntranceItemData> list = this.list;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<RunningGroupFindItemData> list2 = this.discover;
        return ((iHashCode + (list2 != null ? list2.hashCode() : 0)) * 31) + this.url.hashCode();
    }

    @NotNull
    public String toString() {
        return "RunningGroupEntranceResult(list=" + this.list + ", discover=" + this.discover + ", url=" + this.url + ")";
    }
}
