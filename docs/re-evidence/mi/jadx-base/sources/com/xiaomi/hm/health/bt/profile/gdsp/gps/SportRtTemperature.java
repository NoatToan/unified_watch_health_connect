package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportRtTemperature;", "", "time", "", "temperature", "", "(JF)V", "getTemperature", "()F", "getTime", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class SportRtTemperature {
    private final float temperature;
    private final long time;

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
        return this.time == sportRtTemperature.time && Float.compare(this.temperature, sportRtTemperature.temperature) == 0;
    }

    public final float getTemperature() {
        return this.temperature;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (Long.hashCode(this.time) * 31) + Float.hashCode(this.temperature);
    }

    @NotNull
    public String toString() {
        return "SportRtTemperature(time=" + this.time + ", temperature=" + this.temperature + ')';
    }
}
