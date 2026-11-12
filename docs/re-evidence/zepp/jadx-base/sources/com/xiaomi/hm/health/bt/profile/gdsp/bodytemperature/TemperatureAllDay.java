package com.xiaomi.hm.health.bt.profile.gdsp.bodytemperature;

import com.xiaomi.hm.health.bt.utils.ArraysUtil;
import com.xiaomi.hm.health.bt.utils.BytesUtil;
import com.xiaomi.hm.health.bt.utils.TimeUtil;
import defpackage.b;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000b\u001a\u00020\nHÆ\u0003J4\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00042\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u000e\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\tR\u0019\u0010\u000e\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/TemperatureAllDay;", "", "", "toString", "", "component1", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/TemperatureAllDayItem;", "component2", "()[Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/TemperatureAllDayItem;", "", "component3", "timeMillis", "values", "rawData", "copy", "(J[Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/TemperatureAllDayItem;[B)Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/TemperatureAllDay;", "", "hashCode", "other", "", "equals", "a", "J", "getTimeMillis", "()J", "b", "[Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/TemperatureAllDayItem;", "getValues", "c", "[B", "getRawData", "()[B", "<init>", "(J[Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/TemperatureAllDayItem;[B)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TemperatureAllDay {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long timeMillis;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final TemperatureAllDayItem[] values;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final byte[] rawData;

    public TemperatureAllDay(long j, @NotNull TemperatureAllDayItem[] temperatureAllDayItemArr, @NotNull byte[] bArr) {
        this.timeMillis = j;
        this.values = temperatureAllDayItemArr;
        this.rawData = bArr;
    }

    public static /* synthetic */ TemperatureAllDay copy$default(TemperatureAllDay temperatureAllDay, long j, TemperatureAllDayItem[] temperatureAllDayItemArr, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            j = temperatureAllDay.timeMillis;
        }
        if ((i & 2) != 0) {
            temperatureAllDayItemArr = temperatureAllDay.values;
        }
        if ((i & 4) != 0) {
            bArr = temperatureAllDay.rawData;
        }
        return temperatureAllDay.copy(j, temperatureAllDayItemArr, bArr);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimeMillis() {
        return this.timeMillis;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TemperatureAllDayItem[] getValues() {
        return this.values;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final byte[] getRawData() {
        return this.rawData;
    }

    @NotNull
    public final TemperatureAllDay copy(long timeMillis, @NotNull TemperatureAllDayItem[] values, @NotNull byte[] rawData) {
        return new TemperatureAllDay(timeMillis, values, rawData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TemperatureAllDay)) {
            return false;
        }
        TemperatureAllDay temperatureAllDay = (TemperatureAllDay) other;
        return this.timeMillis == temperatureAllDay.timeMillis && Intrinsics.areEqual(this.values, temperatureAllDay.values) && Intrinsics.areEqual(this.rawData, temperatureAllDay.rawData);
    }

    @NotNull
    public final byte[] getRawData() {
        return this.rawData;
    }

    public final long getTimeMillis() {
        return this.timeMillis;
    }

    @NotNull
    public final TemperatureAllDayItem[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return (((b.a(this.timeMillis) * 31) + Arrays.hashCode(this.values)) * 31) + Arrays.hashCode(this.rawData);
    }

    @NotNull
    public String toString() {
        return "Time: " + this.timeMillis + ", " + ((Object) TimeUtil.formatDateTime(this.timeMillis)) + ", Values: " + ((Object) ArraysUtil.toString(this.values)) + ", RawData: " + ((Object) BytesUtil.log(this.rawData));
    }
}
