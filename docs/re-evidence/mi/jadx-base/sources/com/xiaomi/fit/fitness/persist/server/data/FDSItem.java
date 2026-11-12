package com.xiaomi.fit.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.sport_eco.SportConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\u0005J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/FDSItem;", "", SportConstants.KEY_TIMESTAMP, "", "suffix", "", "<init>", "(JLjava/lang/String;)V", "getTimeStamp", "()J", "getSuffix", "()Ljava/lang/String;", "toServerKey", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FDSItem {

    @SerializedName("suffix")
    @NotNull
    private final String suffix;

    @SerializedName("timestamp")
    private final long timeStamp;

    public FDSItem(long j, @NotNull String suffix) {
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        this.timeStamp = j;
        this.suffix = suffix;
    }

    public static /* synthetic */ FDSItem copy$default(FDSItem fDSItem, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = fDSItem.timeStamp;
        }
        if ((i & 2) != 0) {
            str = fDSItem.suffix;
        }
        return fDSItem.copy(j, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSuffix() {
        return this.suffix;
    }

    @NotNull
    public final FDSItem copy(long timeStamp, @NotNull String suffix) {
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return new FDSItem(timeStamp, suffix);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FDSItem)) {
            return false;
        }
        FDSItem fDSItem = (FDSItem) other;
        return this.timeStamp == fDSItem.timeStamp && Intrinsics.areEqual(this.suffix, fDSItem.suffix);
    }

    @NotNull
    public final String getSuffix() {
        return this.suffix;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        return (Long.hashCode(this.timeStamp) * 31) + this.suffix.hashCode();
    }

    @NotNull
    public final String toServerKey() {
        return this.suffix + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + this.timeStamp;
    }

    @NotNull
    public String toString() {
        return "FDSItem(timeStamp=" + this.timeStamp + ", suffix=" + this.suffix + ")";
    }
}
