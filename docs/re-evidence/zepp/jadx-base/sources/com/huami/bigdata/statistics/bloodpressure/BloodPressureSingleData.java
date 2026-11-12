package com.huami.bigdata.statistics.bloodpressure;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bigdata.statistics.core.entity.AbstractSingleData;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001f¨\u0006$"}, d2 = {"Lcom/huami/bigdata/statistics/bloodpressure/BloodPressureSingleData;", "Lcom/huami/bigdata/statistics/core/entity/AbstractSingleData;", "", "component1", "", "component2", "", "component3", "component4", "timestamp", "timezoneId", "sbp", "dbp", "copy", "toString", "hashCode", "", "other", "", "equals", "c", "J", "getTimestamp", "()J", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getTimezoneId", "()Ljava/lang/String;", "e", LogUtil.I, "getSbp", "()I", "f", "getDbp", "<init>", "(JLjava/lang/String;II)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BloodPressureSingleData extends AbstractSingleData {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String timezoneId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int sbp;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int dbp;

    public BloodPressureSingleData(long j, @NotNull String str, int i, int i2) {
        super(j, str);
        this.timestamp = j;
        this.timezoneId = str;
        this.sbp = i;
        this.dbp = i2;
    }

    public static /* synthetic */ BloodPressureSingleData copy$default(BloodPressureSingleData bloodPressureSingleData, long j, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = bloodPressureSingleData.timestamp;
        }
        long j2 = j;
        if ((i3 & 2) != 0) {
            str = bloodPressureSingleData.timezoneId;
        }
        String str2 = str;
        if ((i3 & 4) != 0) {
            i = bloodPressureSingleData.sbp;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = bloodPressureSingleData.dbp;
        }
        return bloodPressureSingleData.copy(j2, str2, i4, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTimezoneId() {
        return this.timezoneId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSbp() {
        return this.sbp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDbp() {
        return this.dbp;
    }

    @NotNull
    public final BloodPressureSingleData copy(long timestamp, @NotNull String timezoneId, int sbp, int dbp) {
        return new BloodPressureSingleData(timestamp, timezoneId, sbp, dbp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodPressureSingleData)) {
            return false;
        }
        BloodPressureSingleData bloodPressureSingleData = (BloodPressureSingleData) other;
        return this.timestamp == bloodPressureSingleData.timestamp && Intrinsics.areEqual(this.timezoneId, bloodPressureSingleData.timezoneId) && this.sbp == bloodPressureSingleData.sbp && this.dbp == bloodPressureSingleData.dbp;
    }

    public final int getDbp() {
        return this.dbp;
    }

    public final int getSbp() {
        return this.sbp;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getTimezoneId() {
        return this.timezoneId;
    }

    public int hashCode() {
        return (((((b.a(this.timestamp) * 31) + this.timezoneId.hashCode()) * 31) + this.sbp) * 31) + this.dbp;
    }

    @NotNull
    public String toString() {
        return "BloodPressureSingleData(timestamp=" + this.timestamp + ", timezoneId=" + this.timezoneId + ", sbp=" + this.sbp + ", dbp=" + this.dbp + ")";
    }
}
