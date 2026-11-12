package com.huami.bodymeasurements.temperature.view.vo;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bodymeasurements.common.utils.TimeFormatUtils;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b,\u0010-J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\tHÆ\u0001J\t\u0010\u000f\u001a\u00020\tHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000b\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\r\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\"\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0019\u0010%\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u0019\u0010(\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u0019\u0010+\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b*\u0010\u001f¨\u0006."}, d2 = {"Lcom/huami/bodymeasurements/temperature/view/vo/TemperatureVo;", "", "", "isNormal", "isAbnormal", "", "component1", "", "component2", "", "component3", "timestamp", "temp", "type", "copy", "toString", "", "hashCode", "other", "equals", "a", "J", "getTimestamp", "()J", "b", "F", "getTemp", "()F", "c", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", GoogleApiAvailabilityLight.a, "getDateStr", "dateStr", "e", "getWeekGroupStr", "weekGroupStr", "f", "getMonthGroupStr", "monthGroupStr", "g", "getYearGroupStr", "yearGroupStr", "<init>", "(JFLjava/lang/String;)V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TemperatureVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final float temp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String dateStr;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final String weekGroupStr;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final String monthGroupStr;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final String yearGroupStr;

    public TemperatureVo(long j, float f, @NotNull String str) {
        this.timestamp = j;
        this.temp = f;
        this.type = str;
        TimeFormatUtils timeFormatUtils = TimeFormatUtils.INSTANCE;
        this.dateStr = timeFormatUtils.formatTime(TimeFormatUtils.PATTERN_YYY_MM_DD_HH_MM, j);
        this.weekGroupStr = timeFormatUtils.formatTime(TimeFormatUtils.PATTERN_YYY_MM_DD, j);
        this.monthGroupStr = timeFormatUtils.formatTime(TimeFormatUtils.PATTERN_YYY_MM_DD, j);
        this.yearGroupStr = timeFormatUtils.formatTime(TimeFormatUtils.PATTERN_YYY_MM, j);
    }

    public static /* synthetic */ TemperatureVo copy$default(TemperatureVo temperatureVo, long j, float f, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = temperatureVo.timestamp;
        }
        if ((i & 2) != 0) {
            f = temperatureVo.temp;
        }
        if ((i & 4) != 0) {
            str = temperatureVo.type;
        }
        return temperatureVo.copy(j, f, str);
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
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final TemperatureVo copy(long timestamp, float temp, @NotNull String type) {
        return new TemperatureVo(timestamp, temp, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TemperatureVo)) {
            return false;
        }
        TemperatureVo temperatureVo = (TemperatureVo) other;
        return this.timestamp == temperatureVo.timestamp && Intrinsics.areEqual((Object) Float.valueOf(this.temp), (Object) Float.valueOf(temperatureVo.temp)) && Intrinsics.areEqual(this.type, temperatureVo.type);
    }

    @NotNull
    public final String getDateStr() {
        return this.dateStr;
    }

    @NotNull
    public final String getMonthGroupStr() {
        return this.monthGroupStr;
    }

    public final float getTemp() {
        return this.temp;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getWeekGroupStr() {
        return this.weekGroupStr;
    }

    @NotNull
    public final String getYearGroupStr() {
        return this.yearGroupStr;
    }

    public int hashCode() {
        return (((b.a(this.timestamp) * 31) + Float.floatToIntBits(this.temp)) * 31) + this.type.hashCode();
    }

    public final boolean isAbnormal() {
        return this.temp > 37.2f;
    }

    public final boolean isNormal() {
        float f = this.temp;
        return 35.0f <= f && f <= 37.2f;
    }

    @NotNull
    public String toString() {
        return "TemperatureVo(timestamp=" + this.timestamp + ", temp=" + this.temp + ", type=" + this.type + ')';
    }
}
