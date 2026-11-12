package com.xiaomi.fit.fitness.parser.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/data/DivingPosition;", "", "lat", "", "lng", "<init>", "(FF)V", "getLat", "()F", "setLat", "(F)V", "getLng", "setLng", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DivingPosition {

    @SerializedName("lat")
    private float lat;

    @SerializedName("lng")
    private float lng;

    public DivingPosition(float f, float f2) {
        this.lat = f;
        this.lng = f2;
    }

    public static /* synthetic */ DivingPosition copy$default(DivingPosition divingPosition, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = divingPosition.lat;
        }
        if ((i & 2) != 0) {
            f2 = divingPosition.lng;
        }
        return divingPosition.copy(f, f2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getLat() {
        return this.lat;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getLng() {
        return this.lng;
    }

    @NotNull
    public final DivingPosition copy(float lat, float lng) {
        return new DivingPosition(lat, lng);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DivingPosition)) {
            return false;
        }
        DivingPosition divingPosition = (DivingPosition) other;
        return Float.compare(this.lat, divingPosition.lat) == 0 && Float.compare(this.lng, divingPosition.lng) == 0;
    }

    public final float getLat() {
        return this.lat;
    }

    public final float getLng() {
        return this.lng;
    }

    public int hashCode() {
        return (Float.hashCode(this.lat) * 31) + Float.hashCode(this.lng);
    }

    public final void setLat(float f) {
        this.lat = f;
    }

    public final void setLng(float f) {
        this.lng = f;
    }

    @NotNull
    public String toString() {
        return "DivingPosition(lat=" + this.lat + ", lng=" + this.lng + ")";
    }
}
