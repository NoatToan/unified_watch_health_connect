package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/SyncHMDataModel;", "", "did", "", "key", "time", "", CloudContract.COL_ZONE_OFFSET, "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;)V", "getDid", "()Ljava/lang/String;", "getKey", "getTime", "()J", "getZoneOffset", "()I", "getValue", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SyncHMDataModel {

    @NotNull
    private final String did;

    @NotNull
    private final String key;
    private final long time;

    @NotNull
    private final String value;

    @SerializedName("zone_offset")
    private final int zoneOffset;

    public SyncHMDataModel(@NotNull String did, @NotNull String key, long j, int i, @NotNull String value) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.did = did;
        this.key = key;
        this.time = j;
        this.zoneOffset = i;
        this.value = value;
    }

    public static /* synthetic */ SyncHMDataModel copy$default(SyncHMDataModel syncHMDataModel, String str, String str2, long j, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = syncHMDataModel.did;
        }
        if ((i2 & 2) != 0) {
            str2 = syncHMDataModel.key;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            j = syncHMDataModel.time;
        }
        long j2 = j;
        if ((i2 & 8) != 0) {
            i = syncHMDataModel.zoneOffset;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str3 = syncHMDataModel.value;
        }
        return syncHMDataModel.copy(str, str4, j2, i3, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDid() {
        return this.did;
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
    public final int getZoneOffset() {
        return this.zoneOffset;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final SyncHMDataModel copy(@NotNull String did, @NotNull String key, long time, int zoneOffset, @NotNull String value) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return new SyncHMDataModel(did, key, time, zoneOffset, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SyncHMDataModel)) {
            return false;
        }
        SyncHMDataModel syncHMDataModel = (SyncHMDataModel) other;
        return Intrinsics.areEqual(this.did, syncHMDataModel.did) && Intrinsics.areEqual(this.key, syncHMDataModel.key) && this.time == syncHMDataModel.time && this.zoneOffset == syncHMDataModel.zoneOffset && Intrinsics.areEqual(this.value, syncHMDataModel.value);
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public final int getZoneOffset() {
        return this.zoneOffset;
    }

    public int hashCode() {
        return (((((((this.did.hashCode() * 31) + this.key.hashCode()) * 31) + Long.hashCode(this.time)) * 31) + Integer.hashCode(this.zoneOffset)) * 31) + this.value.hashCode();
    }

    @NotNull
    public String toString() {
        return "SyncHMDataModel(did=" + this.did + ", key=" + this.key + ", time=" + this.time + ", zoneOffset=" + this.zoneOffset + ", value=" + this.value + ")";
    }
}
