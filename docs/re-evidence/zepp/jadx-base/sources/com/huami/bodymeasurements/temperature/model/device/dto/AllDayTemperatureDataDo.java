package com.huami.bodymeasurements.temperature.model.device.dto;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bodymeasurements.common.ext.NumberFormatExKt;
import com.huami.bodymeasurements.common.utils.TimeFormatUtils;
import defpackage.b;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b4\u00105J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\tHÆ\u0003J\t\u0010\r\u001a\u00020\tHÆ\u0003J;\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\tHÆ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u000f\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0010\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0019\u0010\u0011\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 R\u0019\u0010\u0012\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010 R\u0019\u0010,\u001a\u00020'8\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0019\u00103\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u00102¨\u00066"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/device/dto/AllDayTemperatureDataDo;", "", "Lcom/huami/bodymeasurements/temperature/model/device/dto/TemperatureDataDo;", "getAlgTemperatureDataDo", "getOriginalRawTemperatureDataDo", "", "toString", "", "component1", "", "component2", "component3", "component4", "component5", "timestamp", "algEnvTemp", "algBodyTemp", "envTemp", "bodyTemp", "copy", "", "hashCode", "other", "", "equals", "a", "J", "getTimestamp", "()J", "b", ExifInterface.LATITUDE_SOUTH, "getAlgEnvTemp", "()S", "c", "getAlgBodyTemp", GoogleApiAvailabilityLight.a, "getEnvTemp", "e", "getBodyTemp", "", "f", "F", "getTemp", "()F", "temp", "g", "Ljava/lang/String;", "dateStr", "h", "getDayStr", "()Ljava/lang/String;", "dayStr", "<init>", "(JSSSS)V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AllDayTemperatureDataDo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final short algEnvTemp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final short algBodyTemp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final short envTemp;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final short bodyTemp;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float temp;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final String dateStr;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final String dayStr;

    public AllDayTemperatureDataDo(long j, short s, short s2, short s3, short s4) {
        this.timestamp = j;
        this.algEnvTemp = s;
        this.algBodyTemp = s2;
        this.envTemp = s3;
        this.bodyTemp = s4;
        Float withDecimalFloat = NumberFormatExKt.formatWithDecimalFloat(Float.valueOf(s2 / 100.0f), 1);
        this.temp = withDecimalFloat == null ? 0.0f : withDecimalFloat.floatValue();
        String time = TimeFormatUtils.INSTANCE.formatTime(TimeFormatUtils.PATTERN_YYY_MM_DD_HH_MM, j);
        this.dateStr = time;
        Objects.requireNonNull(time, "null cannot be cast to non-null type java.lang.String");
        this.dayStr = time.substring(0, 10);
    }

    public static /* synthetic */ AllDayTemperatureDataDo copy$default(AllDayTemperatureDataDo allDayTemperatureDataDo, long j, short s, short s2, short s3, short s4, int i, Object obj) {
        if ((i & 1) != 0) {
            j = allDayTemperatureDataDo.timestamp;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            s = allDayTemperatureDataDo.algEnvTemp;
        }
        short s5 = s;
        if ((i & 4) != 0) {
            s2 = allDayTemperatureDataDo.algBodyTemp;
        }
        short s6 = s2;
        if ((i & 8) != 0) {
            s3 = allDayTemperatureDataDo.envTemp;
        }
        short s7 = s3;
        if ((i & 16) != 0) {
            s4 = allDayTemperatureDataDo.bodyTemp;
        }
        return allDayTemperatureDataDo.copy(j2, s5, s6, s7, s4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final short getAlgEnvTemp() {
        return this.algEnvTemp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final short getAlgBodyTemp() {
        return this.algBodyTemp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final short getEnvTemp() {
        return this.envTemp;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final short getBodyTemp() {
        return this.bodyTemp;
    }

    @NotNull
    public final AllDayTemperatureDataDo copy(long timestamp, short algEnvTemp, short algBodyTemp, short envTemp, short bodyTemp) {
        return new AllDayTemperatureDataDo(timestamp, algEnvTemp, algBodyTemp, envTemp, bodyTemp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AllDayTemperatureDataDo)) {
            return false;
        }
        AllDayTemperatureDataDo allDayTemperatureDataDo = (AllDayTemperatureDataDo) other;
        return this.timestamp == allDayTemperatureDataDo.timestamp && this.algEnvTemp == allDayTemperatureDataDo.algEnvTemp && this.algBodyTemp == allDayTemperatureDataDo.algBodyTemp && this.envTemp == allDayTemperatureDataDo.envTemp && this.bodyTemp == allDayTemperatureDataDo.bodyTemp;
    }

    public final short getAlgBodyTemp() {
        return this.algBodyTemp;
    }

    public final short getAlgEnvTemp() {
        return this.algEnvTemp;
    }

    @NotNull
    public final TemperatureDataDo getAlgTemperatureDataDo() {
        return new TemperatureDataDo(this.timestamp, this.algEnvTemp, this.algBodyTemp);
    }

    public final short getBodyTemp() {
        return this.bodyTemp;
    }

    @NotNull
    public final String getDayStr() {
        return this.dayStr;
    }

    public final short getEnvTemp() {
        return this.envTemp;
    }

    @NotNull
    public final TemperatureDataDo getOriginalRawTemperatureDataDo() {
        return new TemperatureDataDo(this.timestamp, this.envTemp, this.bodyTemp);
    }

    public final float getTemp() {
        return this.temp;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((((((b.a(this.timestamp) * 31) + this.algEnvTemp) * 31) + this.algBodyTemp) * 31) + this.envTemp) * 31) + this.bodyTemp;
    }

    @NotNull
    public String toString() {
        return "timestamp:" + this.timestamp + ",envTempe:" + ((int) this.algEnvTemp) + ",bodyTempe:" + ((int) this.algBodyTemp) + ",dateStr:" + this.dateStr;
    }

    public /* synthetic */ AllDayTemperatureDataDo(long j, short s, short s2, short s3, short s4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? (short) 255 : s, (i & 4) != 0 ? (short) 255 : s2, (i & 8) != 0 ? (short) 255 : s3, (i & 16) != 0 ? (short) 255 : s4);
    }
}
