package com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/parse/repo/sportrecord/data/AltitudeItem;", "", "value", "", "interval", "<init>", "(FF)V", "getValue", "()F", "getInterval", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AltitudeItem {
    private final float interval;
    private final float value;

    public AltitudeItem(float f, float f2) {
        this.value = f;
        this.interval = f2;
    }

    public static /* synthetic */ AltitudeItem copy$default(AltitudeItem altitudeItem, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = altitudeItem.value;
        }
        if ((i & 2) != 0) {
            f2 = altitudeItem.interval;
        }
        return altitudeItem.copy(f, f2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getInterval() {
        return this.interval;
    }

    @NotNull
    public final AltitudeItem copy(float value, float interval) {
        return new AltitudeItem(value, interval);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AltitudeItem)) {
            return false;
        }
        AltitudeItem altitudeItem = (AltitudeItem) other;
        return Float.compare(this.value, altitudeItem.value) == 0 && Float.compare(this.interval, altitudeItem.interval) == 0;
    }

    public final float getInterval() {
        return this.interval;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return (Float.hashCode(this.value) * 31) + Float.hashCode(this.interval);
    }

    @NotNull
    public String toString() {
        return "AltitudeItem(value=" + this.value + ", interval=" + this.interval + ")";
    }
}
