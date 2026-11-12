package com.xiaomi.fit.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/GetSwitchSongItem;", "", "time", "", "value", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getTime", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/xiaomi/fit/fitness/persist/server/data/GetSwitchSongItem;", "equals", "", "other", "hashCode", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetSwitchSongItem {

    @SerializedName("time")
    @Nullable
    private final Integer time;

    @SerializedName("value")
    @Nullable
    private final String value;

    public GetSwitchSongItem(@Nullable Integer num, @Nullable String str) {
        this.time = num;
        this.value = str;
    }

    public static /* synthetic */ GetSwitchSongItem copy$default(GetSwitchSongItem getSwitchSongItem, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = getSwitchSongItem.time;
        }
        if ((i & 2) != 0) {
            str = getSwitchSongItem.value;
        }
        return getSwitchSongItem.copy(num, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final GetSwitchSongItem copy(@Nullable Integer time, @Nullable String value) {
        return new GetSwitchSongItem(time, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetSwitchSongItem)) {
            return false;
        }
        GetSwitchSongItem getSwitchSongItem = (GetSwitchSongItem) other;
        return Intrinsics.areEqual(this.time, getSwitchSongItem.time) && Intrinsics.areEqual(this.value, getSwitchSongItem.value);
    }

    @Nullable
    public final Integer getTime() {
        return this.time;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        Integer num = this.time;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.value;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GetSwitchSongItem(time=" + this.time + ", value=" + this.value + ")";
    }
}
