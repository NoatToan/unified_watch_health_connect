package com.xiaomi.fit.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/StatDataKey;", "", "tag", "", "key", "time", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "getTag", "()Ljava/lang/String;", "getKey", "getTime", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StatDataKey {

    @SerializedName("key")
    @NotNull
    private final String key;

    @SerializedName("tag")
    @NotNull
    private final String tag;

    @SerializedName("time")
    private final long time;

    public StatDataKey(@NotNull String tag, @NotNull String key, long j) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(key, "key");
        this.tag = tag;
        this.key = key;
        this.time = j;
    }

    public static /* synthetic */ StatDataKey copy$default(StatDataKey statDataKey, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = statDataKey.tag;
        }
        if ((i & 2) != 0) {
            str2 = statDataKey.key;
        }
        if ((i & 4) != 0) {
            j = statDataKey.time;
        }
        return statDataKey.copy(str, str2, j);
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

    @NotNull
    public final StatDataKey copy(@NotNull String tag, @NotNull String key, long time) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(key, "key");
        return new StatDataKey(tag, key, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatDataKey)) {
            return false;
        }
        StatDataKey statDataKey = (StatDataKey) other;
        return Intrinsics.areEqual(this.tag, statDataKey.tag) && Intrinsics.areEqual(this.key, statDataKey.key) && this.time == statDataKey.time;
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

    public int hashCode() {
        return (((this.tag.hashCode() * 31) + this.key.hashCode()) * 31) + Long.hashCode(this.time);
    }

    @NotNull
    public String toString() {
        return "StatDataKey(tag=" + this.tag + ", key=" + this.key + ", time=" + this.time + ")";
    }
}
