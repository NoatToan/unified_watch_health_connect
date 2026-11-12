package com.xiaomi.hm.health.bt.profile.grsp;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b#\u0010$B\u001f\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b#\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0014J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ6\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\nR\u0013\u0010\"\u001a\u00020\u00108F@\u0006¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/grsp/CommonSensorData;", "Lcom/xiaomi/hm/health/bt/profile/grsp/SensorData;", "Lcom/xiaomi/hm/health/bt/profile/grsp/SensorType;", "a", "getType", "", "", "component2", "", "component3", "()Ljava/lang/Long;", "dataType", "data", "timestamp", "copy", "(Lcom/xiaomi/hm/health/bt/profile/grsp/SensorType;Ljava/util/List;Ljava/lang/Long;)Lcom/xiaomi/hm/health/bt/profile/grsp/CommonSensorData;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/xiaomi/hm/health/bt/profile/grsp/SensorType;", "b", "Ljava/util/List;", "getData", "()Ljava/util/List;", "c", "Ljava/lang/Long;", "getTimestamp", "getDataLog", "()Ljava/lang/String;", "dataLog", "<init>", "(Lcom/xiaomi/hm/health/bt/profile/grsp/SensorType;Ljava/util/List;Ljava/lang/Long;)V", "(Lcom/xiaomi/hm/health/bt/profile/grsp/SensorType;Ljava/util/List;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CommonSensorData extends SensorData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final SensorType dataType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<Number> data;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long timestamp;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonSensorData(@NotNull SensorType sensorType, @NotNull List<? extends Number> list, @Nullable Long l) {
        this.dataType = sensorType;
        this.data = list;
        this.timestamp = l;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    private final SensorType getDataType() {
        return this.dataType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommonSensorData copy$default(CommonSensorData commonSensorData, SensorType sensorType, List list, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            sensorType = commonSensorData.dataType;
        }
        if ((i & 2) != 0) {
            list = commonSensorData.data;
        }
        if ((i & 4) != 0) {
            l = commonSensorData.timestamp;
        }
        return commonSensorData.copy(sensorType, list, l);
    }

    @NotNull
    public final List<Number> component2() {
        return this.data;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final CommonSensorData copy(@NotNull SensorType dataType, @NotNull List<? extends Number> data, @Nullable Long timestamp) {
        return new CommonSensorData(dataType, data, timestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonSensorData)) {
            return false;
        }
        CommonSensorData commonSensorData = (CommonSensorData) other;
        return this.dataType == commonSensorData.dataType && Intrinsics.areEqual(this.data, commonSensorData.data) && Intrinsics.areEqual(this.timestamp, commonSensorData.timestamp);
    }

    @NotNull
    public final List<Number> getData() {
        return this.data;
    }

    @NotNull
    public final String getDataLog() {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Number number : this.data) {
            if (z) {
                z = false;
            } else {
                sb.append(",");
            }
            sb.append(number);
        }
        if (this.timestamp == null) {
            return sb.toString();
        }
        if (sb.length() > 0) {
            sb.append(",");
        }
        sb.append(this.timestamp.longValue());
        return sb.toString();
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Override // com.xiaomi.hm.health.bt.profile.grsp.SensorData
    @NotNull
    public SensorType getType() {
        return this.dataType;
    }

    public int hashCode() {
        int iHashCode = ((this.dataType.hashCode() * 31) + this.data.hashCode()) * 31;
        Long l = this.timestamp;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    @NotNull
    public String toString() {
        return "CommonSensorData(dataType=" + this.dataType + ", data=" + this.data + ", timestamp=" + this.timestamp + ')';
    }

    public CommonSensorData(@NotNull SensorType sensorType, @NotNull List<? extends Number> list) {
        this(sensorType, list, null);
    }
}
