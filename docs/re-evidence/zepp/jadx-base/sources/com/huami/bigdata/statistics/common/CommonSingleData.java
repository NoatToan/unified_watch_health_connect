package com.huami.bigdata.statistics.common;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bigdata.statistics.core.entity.AbstractSingleData;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/huami/bigdata/statistics/common/CommonSingleData;", "Lcom/huami/bigdata/statistics/core/entity/AbstractSingleData;", "", "component1", "", "component2", "", "component3", "timestamp", "timezoneId", "value", "copy", "toString", "hashCode", "", "other", "", "equals", "c", "J", "getTimestamp", "()J", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getTimezoneId", "()Ljava/lang/String;", "e", LogUtil.I, "getValue", "()I", "<init>", "(JLjava/lang/String;I)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CommonSingleData extends AbstractSingleData {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String timezoneId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int value;

    public CommonSingleData(long j, @NotNull String str, int i) {
        super(j, str);
        this.timestamp = j;
        this.timezoneId = str;
        this.value = i;
    }

    public static /* synthetic */ CommonSingleData copy$default(CommonSingleData commonSingleData, long j, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = commonSingleData.timestamp;
        }
        if ((i2 & 2) != 0) {
            str = commonSingleData.timezoneId;
        }
        if ((i2 & 4) != 0) {
            i = commonSingleData.value;
        }
        return commonSingleData.copy(j, str, i);
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
    public final int getValue() {
        return this.value;
    }

    @NotNull
    public final CommonSingleData copy(long timestamp, @NotNull String timezoneId, int value) {
        return new CommonSingleData(timestamp, timezoneId, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonSingleData)) {
            return false;
        }
        CommonSingleData commonSingleData = (CommonSingleData) other;
        return this.timestamp == commonSingleData.timestamp && Intrinsics.areEqual(this.timezoneId, commonSingleData.timezoneId) && this.value == commonSingleData.value;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getTimezoneId() {
        return this.timezoneId;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((b.a(this.timestamp) * 31) + this.timezoneId.hashCode()) * 31) + this.value;
    }

    @NotNull
    public String toString() {
        return "CommonSingleData(timestamp=" + this.timestamp + ", timezoneId=" + this.timezoneId + ", value=" + this.value + ")";
    }
}
