package com.mi.health.message.center.entity;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.sport_eco.SportConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/mi/health/message/center/entity/AbnormalData;", "", "key", "", SportConstants.KEY_TIMESTAMP, "", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "getKey", "()Ljava/lang/String;", "getTimeStamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Long;)Lcom/mi/health/message/center/entity/AbnormalData;", "equals", "", "other", "hashCode", "", "toString", "message-center_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AbnormalData {

    @SerializedName("key")
    @Nullable
    private final String key;

    @SerializedName("timestamp")
    @Nullable
    private final Long timeStamp;

    public AbnormalData(@Nullable String str, @Nullable Long l) {
        this.key = str;
        this.timeStamp = l;
    }

    public static /* synthetic */ AbnormalData copy$default(AbnormalData abnormalData, String str, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = abnormalData.key;
        }
        if ((i & 2) != 0) {
            l = abnormalData.timeStamp;
        }
        return abnormalData.copy(str, l);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getTimeStamp() {
        return this.timeStamp;
    }

    @NotNull
    public final AbnormalData copy(@Nullable String key, @Nullable Long timeStamp) {
        return new AbnormalData(key, timeStamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AbnormalData)) {
            return false;
        }
        AbnormalData abnormalData = (AbnormalData) other;
        return Intrinsics.areEqual(this.key, abnormalData.key) && Intrinsics.areEqual(this.timeStamp, abnormalData.timeStamp);
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final Long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.timeStamp;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AbnormalData(key=" + this.key + ", timeStamp=" + this.timeStamp + ")";
    }
}
