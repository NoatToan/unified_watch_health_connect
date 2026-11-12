package com.huami.respiratoryrate.core.data.remote.entity;

import android.util.Base64;
import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J#\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/huami/respiratoryrate/core/data/remote/entity/RespRateEventValue;", "", "", "measurements", "getMeasureString", "toString", "component1", "", "Lcom/huami/respiratoryrate/core/data/remote/entity/EventValueOffset;", "component2", "timeZone", "copy", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getMeasurements", "()Ljava/lang/String;", "setMeasurements", "(Ljava/lang/String;)V", "Ljava/util/List;", "getTimeZone", "()Ljava/util/List;", "setTimeZone", "(Ljava/util/List;)V", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RespRateEventValue {

    @NotNull
    private String measurements;

    @NotNull
    private List<Offset> timeZone;

    public RespRateEventValue(@NotNull String str, @NotNull List<Offset> list) {
        this.measurements = str;
        this.timeZone = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RespRateEventValue copy$default(RespRateEventValue respRateEventValue, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = respRateEventValue.measurements;
        }
        if ((i & 2) != 0) {
            list = respRateEventValue.timeZone;
        }
        return respRateEventValue.copy(str, list);
    }

    private final String getMeasureString(String measurements) {
        byte[] bArrDecode = Base64.decode(measurements, 2);
        StringBuilder sb = new StringBuilder("[");
        int length = bArrDecode.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArrDecode[i];
            int i3 = i2 + 1;
            if (b > 0) {
                sb.append("{index:" + i2 + ",value:" + ((int) b) + "},");
            }
            i++;
            i2 = i3;
        }
        sb.append("]");
        return sb.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMeasurements() {
        return this.measurements;
    }

    @NotNull
    public final List<Offset> component2() {
        return this.timeZone;
    }

    @NotNull
    public final RespRateEventValue copy(@NotNull String measurements, @NotNull List<Offset> timeZone) {
        return new RespRateEventValue(measurements, timeZone);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RespRateEventValue)) {
            return false;
        }
        RespRateEventValue respRateEventValue = (RespRateEventValue) other;
        return Intrinsics.areEqual(this.measurements, respRateEventValue.measurements) && Intrinsics.areEqual(this.timeZone, respRateEventValue.timeZone);
    }

    @NotNull
    public final String getMeasurements() {
        return this.measurements;
    }

    @NotNull
    public final List<Offset> getTimeZone() {
        return this.timeZone;
    }

    public int hashCode() {
        return (this.measurements.hashCode() * 31) + this.timeZone.hashCode();
    }

    public final void setMeasurements(@NotNull String str) {
        this.measurements = str;
    }

    public final void setTimeZone(@NotNull List<Offset> list) {
        this.timeZone = list;
    }

    @NotNull
    public String toString() {
        return "RespRateEventValue(measurements=" + getMeasureString(this.measurements) + ", timeZone=[" + CollectionsKt___CollectionsKt.joinToString$default(this.timeZone, null, null, null, 0, null, null, 63, null) + "])";
    }
}
