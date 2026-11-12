package com.xiaomi.fit.fitness.request;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.onetrack.OneTrack;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fit/fitness/request/LastSyncItem;", "", "tag", "", "key", "time", "", "timeZone", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;JI)V", "getTag", "()Ljava/lang/String;", "getKey", "getTime", "()J", "getTimeZone", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LastSyncItem {

    @NotNull
    private final String key;

    @NotNull
    private final String tag;
    private final long time;

    @SerializedName(OneTrack.Param.TZ)
    private final int timeZone;

    public LastSyncItem(@NotNull String tag, @NotNull String key, long j, int i) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(key, "key");
        this.tag = tag;
        this.key = key;
        this.time = j;
        this.timeZone = i;
    }

    public static /* synthetic */ LastSyncItem copy$default(LastSyncItem lastSyncItem, String str, String str2, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = lastSyncItem.tag;
        }
        if ((i2 & 2) != 0) {
            str2 = lastSyncItem.key;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            j = lastSyncItem.time;
        }
        long j2 = j;
        if ((i2 & 8) != 0) {
            i = lastSyncItem.timeZone;
        }
        return lastSyncItem.copy(str, str3, j2, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTimeZone() {
        return this.timeZone;
    }

    @NotNull
    public final LastSyncItem copy(@NotNull String tag, @NotNull String key, long time, int timeZone) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(key, "key");
        return new LastSyncItem(tag, key, time, timeZone);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LastSyncItem)) {
            return false;
        }
        LastSyncItem lastSyncItem = (LastSyncItem) other;
        return Intrinsics.areEqual(this.tag, lastSyncItem.tag) && Intrinsics.areEqual(this.key, lastSyncItem.key) && this.time == lastSyncItem.time && this.timeZone == lastSyncItem.timeZone;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public final long getTime() {
        return this.time;
    }

    public final int getTimeZone() {
        return this.timeZone;
    }

    public int hashCode() {
        return (((((this.tag.hashCode() * 31) + this.key.hashCode()) * 31) + Long.hashCode(this.time)) * 31) + Integer.hashCode(this.timeZone);
    }

    @NotNull
    public String toString() {
        return "LastSyncItem(tag=" + this.tag + ", key=" + this.key + ", time=" + this.time + ", timeZone=" + this.timeZone + ")";
    }
}
