package com.huami.bodymeasurements.temperature.model.device.dto;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bodymeasurements.common.ext.NumberFormatExKt;
import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010!\u001a\u00020\u001c8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010$\u001a\u00020\u001c8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 ¨\u0006'"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/device/dto/SingleTemperatureDo;", "", "", "component1", "", "component2", "component3", "timestamp", "bodyTemp", "envTemp", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getTimestamp", "()J", "b", ExifInterface.LATITUDE_SOUTH, "getBodyTemp", "()S", "c", "getEnvTemp", "", GoogleApiAvailabilityLight.a, "F", "getTemp", "()F", "temp", "e", "getEnvTempFloat", "envTempFloat", "<init>", "(JSS)V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SingleTemperatureDo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final short bodyTemp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final short envTemp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float temp;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float envTempFloat;

    public SingleTemperatureDo(long j, short s, short s2) {
        this.timestamp = j;
        this.bodyTemp = s;
        this.envTemp = s2;
        Float withDecimalFloat = NumberFormatExKt.formatWithDecimalFloat(Float.valueOf(s / 100.0f), 1);
        this.temp = withDecimalFloat == null ? 0.0f : withDecimalFloat.floatValue();
        Float withDecimalFloat2 = NumberFormatExKt.formatWithDecimalFloat(Float.valueOf(s2 / 100.0f), 1);
        this.envTempFloat = withDecimalFloat2 != null ? withDecimalFloat2.floatValue() : 0.0f;
    }

    public static /* synthetic */ SingleTemperatureDo copy$default(SingleTemperatureDo singleTemperatureDo, long j, short s, short s2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = singleTemperatureDo.timestamp;
        }
        if ((i & 2) != 0) {
            s = singleTemperatureDo.bodyTemp;
        }
        if ((i & 4) != 0) {
            s2 = singleTemperatureDo.envTemp;
        }
        return singleTemperatureDo.copy(j, s, s2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final short getBodyTemp() {
        return this.bodyTemp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final short getEnvTemp() {
        return this.envTemp;
    }

    @NotNull
    public final SingleTemperatureDo copy(long timestamp, short bodyTemp, short envTemp) {
        return new SingleTemperatureDo(timestamp, bodyTemp, envTemp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleTemperatureDo)) {
            return false;
        }
        SingleTemperatureDo singleTemperatureDo = (SingleTemperatureDo) other;
        return this.timestamp == singleTemperatureDo.timestamp && this.bodyTemp == singleTemperatureDo.bodyTemp && this.envTemp == singleTemperatureDo.envTemp;
    }

    public final short getBodyTemp() {
        return this.bodyTemp;
    }

    public final short getEnvTemp() {
        return this.envTemp;
    }

    public final float getEnvTempFloat() {
        return this.envTempFloat;
    }

    public final float getTemp() {
        return this.temp;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((b.a(this.timestamp) * 31) + this.bodyTemp) * 31) + this.envTemp;
    }

    @NotNull
    public String toString() {
        return "SingleTemperatureDo(timestamp=" + this.timestamp + ", bodyTemp=" + ((int) this.bodyTemp) + ", envTemp=" + ((int) this.envTemp) + ')';
    }
}
