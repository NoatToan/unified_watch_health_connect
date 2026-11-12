package com.xiaomi.fitness.sync.export.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/sync/export/model/Wind;", "", "direction", "Lcom/xiaomi/fitness/sync/export/model/Unit;", "speed", "<init>", "(Lcom/xiaomi/fitness/sync/export/model/Unit;Lcom/xiaomi/fitness/sync/export/model/Unit;)V", "getDirection", "()Lcom/xiaomi/fitness/sync/export/model/Unit;", "getSpeed", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sync-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Wind {

    @SerializedName("direction")
    @NotNull
    private final Unit direction;

    @SerializedName("speed")
    @NotNull
    private final Unit speed;

    public Wind(@NotNull Unit direction, @NotNull Unit speed) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(speed, "speed");
        this.direction = direction;
        this.speed = speed;
    }

    public static /* synthetic */ Wind copy$default(Wind wind, Unit unit, Unit unit2, int i, Object obj) {
        if ((i & 1) != 0) {
            unit = wind.direction;
        }
        if ((i & 2) != 0) {
            unit2 = wind.speed;
        }
        return wind.copy(unit, unit2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Unit getDirection() {
        return this.direction;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Unit getSpeed() {
        return this.speed;
    }

    @NotNull
    public final Wind copy(@NotNull Unit direction, @NotNull Unit speed) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(speed, "speed");
        return new Wind(direction, speed);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Wind)) {
            return false;
        }
        Wind wind = (Wind) other;
        return Intrinsics.areEqual(this.direction, wind.direction) && Intrinsics.areEqual(this.speed, wind.speed);
    }

    @NotNull
    public final Unit getDirection() {
        return this.direction;
    }

    @NotNull
    public final Unit getSpeed() {
        return this.speed;
    }

    public int hashCode() {
        return (this.direction.hashCode() * 31) + this.speed.hashCode();
    }

    @NotNull
    public String toString() {
        return "Wind(direction=" + this.direction + ", speed=" + this.speed + ")";
    }
}
