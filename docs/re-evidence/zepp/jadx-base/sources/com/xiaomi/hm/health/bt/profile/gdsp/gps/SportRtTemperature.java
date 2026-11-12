package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportRtTemperature;", "", "", "component1", "", "component2", "time", "temperature", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getTime", "()J", "b", "F", "getTemperature", "()F", "<init>", "(JF)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SportRtTemperature {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long time;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final float temperature;

    public SportRtTemperature(long j, float f) {
        this.time = j;
        this.temperature = f;
    }

    public static /* synthetic */ SportRtTemperature copy$default(SportRtTemperature sportRtTemperature, long j, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = sportRtTemperature.time;
        }
        if ((i & 2) != 0) {
            f = sportRtTemperature.temperature;
        }
        return sportRtTemperature.copy(j, f);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getTemperature() {
        return this.temperature;
    }

    @NotNull
    public final SportRtTemperature copy(long time, float temperature) {
        return new SportRtTemperature(time, temperature);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportRtTemperature)) {
            return false;
        }
        SportRtTemperature sportRtTemperature = (SportRtTemperature) other;
        return this.time == sportRtTemperature.time && Intrinsics.areEqual((Object) Float.valueOf(this.temperature), (Object) Float.valueOf(sportRtTemperature.temperature));
    }

    public final float getTemperature() {
        return this.temperature;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (defpackage.b.a(this.time) * 31) + Float.floatToIntBits(this.temperature);
    }

    @NotNull
    public String toString() {
        return "SportRtTemperature(time=" + this.time + ", temperature=" + this.temperature + ')';
    }
}
