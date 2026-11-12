package com.huami.bodymeasurements.temperature.model.device.dto;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bodymeasurements.common.ext.NumberFormatExKt;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b.\u0010/J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J;\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\tHÆ\u0001J\t\u0010\u0011\u001a\u00020\tHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\r\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\u000e\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u000f\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010-\u001a\u00020(8\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/device/dto/EightySecondsTemperatureDo;", "", "", "component1", "", "component2", "component3", "", "component4", "", "component5", "timestamp", "flag", "wearDuration", "bodyTemp", "rawData", "copy", "toString", "hashCode", "other", "", "equals", "a", "J", "getTimestamp", "()J", "b", LogUtil.I, "getFlag", "()I", "c", "getWearDuration", GoogleApiAvailabilityLight.a, ExifInterface.LATITUDE_SOUTH, "getBodyTemp", "()S", "e", "Ljava/lang/String;", "getRawData", "()Ljava/lang/String;", "", "f", "F", "getTemp", "()F", "temp", "<init>", "(JIISLjava/lang/String;)V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class EightySecondsTemperatureDo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int flag;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int wearDuration;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final short bodyTemp;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final String rawData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float temp;

    public EightySecondsTemperatureDo(long j, int i, int i2, short s, @NotNull String str) {
        this.timestamp = j;
        this.flag = i;
        this.wearDuration = i2;
        this.bodyTemp = s;
        this.rawData = str;
        Float withDecimalFloat = NumberFormatExKt.formatWithDecimalFloat(Float.valueOf(s / 100.0f), 1);
        this.temp = withDecimalFloat == null ? 0.0f : withDecimalFloat.floatValue();
    }

    public static /* synthetic */ EightySecondsTemperatureDo copy$default(EightySecondsTemperatureDo eightySecondsTemperatureDo, long j, int i, int i2, short s, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = eightySecondsTemperatureDo.timestamp;
        }
        long j2 = j;
        if ((i3 & 2) != 0) {
            i = eightySecondsTemperatureDo.flag;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = eightySecondsTemperatureDo.wearDuration;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            s = eightySecondsTemperatureDo.bodyTemp;
        }
        short s2 = s;
        if ((i3 & 16) != 0) {
            str = eightySecondsTemperatureDo.rawData;
        }
        return eightySecondsTemperatureDo.copy(j2, i4, i5, s2, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getFlag() {
        return this.flag;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getWearDuration() {
        return this.wearDuration;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final short getBodyTemp() {
        return this.bodyTemp;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRawData() {
        return this.rawData;
    }

    @NotNull
    public final EightySecondsTemperatureDo copy(long timestamp, int flag, int wearDuration, short bodyTemp, @NotNull String rawData) {
        return new EightySecondsTemperatureDo(timestamp, flag, wearDuration, bodyTemp, rawData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EightySecondsTemperatureDo)) {
            return false;
        }
        EightySecondsTemperatureDo eightySecondsTemperatureDo = (EightySecondsTemperatureDo) other;
        return this.timestamp == eightySecondsTemperatureDo.timestamp && this.flag == eightySecondsTemperatureDo.flag && this.wearDuration == eightySecondsTemperatureDo.wearDuration && this.bodyTemp == eightySecondsTemperatureDo.bodyTemp && Intrinsics.areEqual(this.rawData, eightySecondsTemperatureDo.rawData);
    }

    public final short getBodyTemp() {
        return this.bodyTemp;
    }

    public final int getFlag() {
        return this.flag;
    }

    @NotNull
    public final String getRawData() {
        return this.rawData;
    }

    public final float getTemp() {
        return this.temp;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final int getWearDuration() {
        return this.wearDuration;
    }

    public int hashCode() {
        return (((((((b.a(this.timestamp) * 31) + this.flag) * 31) + this.wearDuration) * 31) + this.bodyTemp) * 31) + this.rawData.hashCode();
    }

    @NotNull
    public String toString() {
        return "EightySecondsTemperatureDo(timestamp=" + this.timestamp + ", flag=" + this.flag + ", wearDuration=" + this.wearDuration + ", bodyTemp=" + ((int) this.bodyTemp) + ", rawData=" + this.rawData + ')';
    }
}
