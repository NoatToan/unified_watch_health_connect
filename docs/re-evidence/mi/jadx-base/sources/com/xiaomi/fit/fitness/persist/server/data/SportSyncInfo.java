package com.xiaomi.fit.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\tHÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR&\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/SportSyncInfo;", "", "sportKey", "Lcom/xiaomi/fit/fitness/persist/server/data/FitnessDataKey;", "<init>", "(Lcom/xiaomi/fit/fitness/persist/server/data/FitnessDataKey;)V", "getSportKey", "()Lcom/xiaomi/fit/fitness/persist/server/data/FitnessDataKey;", "fileState", "", "getFileState", "()I", "setFileState", "(I)V", "trackPoint", "", "getTrackPoint", "()Ljava/util/List;", "setTrackPoint", "(Ljava/util/List;)V", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SportSyncInfo {

    @SerializedName("content_state")
    private int fileState;

    @SerializedName("sport_key")
    @NotNull
    private final FitnessDataKey sportKey;

    @SerializedName("track_point")
    @Nullable
    private List<Integer> trackPoint;

    public SportSyncInfo(@NotNull FitnessDataKey sportKey) {
        Intrinsics.checkNotNullParameter(sportKey, "sportKey");
        this.sportKey = sportKey;
    }

    public static /* synthetic */ SportSyncInfo copy$default(SportSyncInfo sportSyncInfo, FitnessDataKey fitnessDataKey, int i, Object obj) {
        if ((i & 1) != 0) {
            fitnessDataKey = sportSyncInfo.sportKey;
        }
        return sportSyncInfo.copy(fitnessDataKey);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FitnessDataKey getSportKey() {
        return this.sportKey;
    }

    @NotNull
    public final SportSyncInfo copy(@NotNull FitnessDataKey sportKey) {
        Intrinsics.checkNotNullParameter(sportKey, "sportKey");
        return new SportSyncInfo(sportKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SportSyncInfo) && Intrinsics.areEqual(this.sportKey, ((SportSyncInfo) other).sportKey);
    }

    public final int getFileState() {
        return this.fileState;
    }

    @NotNull
    public final FitnessDataKey getSportKey() {
        return this.sportKey;
    }

    @Nullable
    public final List<Integer> getTrackPoint() {
        return this.trackPoint;
    }

    public int hashCode() {
        return this.sportKey.hashCode();
    }

    public final void setFileState(int i) {
        this.fileState = i;
    }

    public final void setTrackPoint(@Nullable List<Integer> list) {
        this.trackPoint = list;
    }

    @NotNull
    public String toString() {
        return "SportSyncInfo(sportKey=" + this.sportKey + ")";
    }
}
