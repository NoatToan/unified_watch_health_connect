package com.huami.bodymeasurements.temperature.model.device.dto;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bodymeasurements.common.ext.NumberFormatExKt;
import com.huami.bodymeasurements.common.utils.TimeFormatUtils;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b'\u0010(J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\tHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\r\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u000e\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010#\u001a\u00020\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/device/dto/TemperatureDataDo;", "", "", "isValidRange", "isValid", "", "toString", "", "component1", "", "component2", "component3", "timestamp", "envTemp", "bodyTemp", "copy", "", "hashCode", "other", "equals", "a", "J", "getTimestamp", "()J", "b", ExifInterface.LATITUDE_SOUTH, "getEnvTemp", "()S", "c", "getBodyTemp", "", GoogleApiAvailabilityLight.a, "F", "getTemp", "()F", "temp", "e", "Ljava/lang/String;", "timeStr", "<init>", "(JSS)V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TemperatureDataDo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final short envTemp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final short bodyTemp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float temp;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final String timeStr;

    public TemperatureDataDo(long j, short s, short s2) {
        this.timestamp = j;
        this.envTemp = s;
        this.bodyTemp = s2;
        Float withDecimalFloat = NumberFormatExKt.formatWithDecimalFloat(Float.valueOf(s2 / 100.0f), 1);
        this.temp = withDecimalFloat == null ? 0.0f : withDecimalFloat.floatValue();
        this.timeStr = TimeFormatUtils.INSTANCE.formatTime(TimeFormatUtils.PATTERN_YYY_MM_DD_HH_MM, j);
    }

    public static /* synthetic */ TemperatureDataDo copy$default(TemperatureDataDo temperatureDataDo, long j, short s, short s2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = temperatureDataDo.timestamp;
        }
        if ((i & 2) != 0) {
            s = temperatureDataDo.envTemp;
        }
        if ((i & 4) != 0) {
            s2 = temperatureDataDo.bodyTemp;
        }
        return temperatureDataDo.copy(j, s, s2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final short getEnvTemp() {
        return this.envTemp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final short getBodyTemp() {
        return this.bodyTemp;
    }

    @NotNull
    public final TemperatureDataDo copy(long timestamp, short envTemp, short bodyTemp) {
        return new TemperatureDataDo(timestamp, envTemp, bodyTemp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TemperatureDataDo)) {
            return false;
        }
        TemperatureDataDo temperatureDataDo = (TemperatureDataDo) other;
        return this.timestamp == temperatureDataDo.timestamp && this.envTemp == temperatureDataDo.envTemp && this.bodyTemp == temperatureDataDo.bodyTemp;
    }

    public final short getBodyTemp() {
        return this.bodyTemp;
    }

    public final short getEnvTemp() {
        return this.envTemp;
    }

    public final float getTemp() {
        return this.temp;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((b.a(this.timestamp) * 31) + this.envTemp) * 31) + this.bodyTemp;
    }

    public final boolean isValid() {
        return (this.envTemp == 255 || this.bodyTemp == 255) ? false : true;
    }

    public final boolean isValidRange() {
        float f = this.bodyTemp / 100.0f;
        return 35.0f <= f && f <= 42.0f;
    }

    @NotNull
    public String toString() {
        return "timeStr:" + this.timeStr + ",envTempe:" + ((int) this.envTemp) + ",bodyTempe:" + ((int) this.bodyTemp);
    }

    public /* synthetic */ TemperatureDataDo(long j, short s, short s2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? (short) 255 : s, (i & 4) != 0 ? (short) 255 : s2);
    }
}
