package com.xiaomi.hm.health.temperature.model;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bodymeasurements.common.utils.TimeFormatUtils;
import com.xiaomi.hm.health.healthdata.dto.TemperatureDataType;
import defpackage.b;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010%\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/xiaomi/hm/health/temperature/model/Temperature;", "", "", "component1", "", "component2", "Lcom/xiaomi/hm/health/healthdata/dto/TemperatureDataType;", "component3", "timestamp", "temp", "type", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getTimestamp", "()J", "b", "F", "getTemp", "()F", "c", "Lcom/xiaomi/hm/health/healthdata/dto/TemperatureDataType;", "getType", "()Lcom/xiaomi/hm/health/healthdata/dto/TemperatureDataType;", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getDateStr", "()Ljava/lang/String;", "setDateStr", "(Ljava/lang/String;)V", "dateStr", "<init>", "(JFLcom/xiaomi/hm/health/healthdata/dto/TemperatureDataType;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Temperature {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final float temp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final TemperatureDataType type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private String dateStr;

    public Temperature(long j, float f, @NotNull TemperatureDataType temperatureDataType) {
        this.timestamp = j;
        this.temp = f;
        this.type = temperatureDataType;
        this.dateStr = new SimpleDateFormat(TimeFormatUtils.PATTERN_YYY_MM_DD, Locale.getDefault()).format(new Date(j));
    }

    public static /* synthetic */ Temperature copy$default(Temperature temperature, long j, float f, TemperatureDataType temperatureDataType, int i, Object obj) {
        if ((i & 1) != 0) {
            j = temperature.timestamp;
        }
        if ((i & 2) != 0) {
            f = temperature.temp;
        }
        if ((i & 4) != 0) {
            temperatureDataType = temperature.type;
        }
        return temperature.copy(j, f, temperatureDataType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getTemp() {
        return this.temp;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TemperatureDataType getType() {
        return this.type;
    }

    @NotNull
    public final Temperature copy(long timestamp, float temp, @NotNull TemperatureDataType type) {
        return new Temperature(timestamp, temp, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Temperature)) {
            return false;
        }
        Temperature temperature = (Temperature) other;
        return this.timestamp == temperature.timestamp && Intrinsics.areEqual((Object) Float.valueOf(this.temp), (Object) Float.valueOf(temperature.temp)) && this.type == temperature.type;
    }

    @NotNull
    public final String getDateStr() {
        return this.dateStr;
    }

    public final float getTemp() {
        return this.temp;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final TemperatureDataType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((b.a(this.timestamp) * 31) + Float.floatToIntBits(this.temp)) * 31) + this.type.hashCode();
    }

    public final void setDateStr(@NotNull String str) {
        this.dateStr = str;
    }

    @NotNull
    public String toString() {
        return "Temperature(timestamp=" + this.timestamp + ", temp=" + this.temp + ", type=" + this.type + ")";
    }
}
