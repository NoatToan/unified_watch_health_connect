package com.xiaomi.fitness.trail.diving;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/trail/diving/LatLngItem;", "", "lat", "", "lng", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;)V", "getLat", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getLng", "component1", "component2", "copy", "(Ljava/lang/Float;Ljava/lang/Float;)Lcom/xiaomi/fitness/trail/diving/LatLngItem;", "equals", "", "other", "hashCode", "", "toString", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LatLngItem {

    @SerializedName("lat")
    @Nullable
    private final Float lat;

    @SerializedName("lng")
    @Nullable
    private final Float lng;

    public LatLngItem(@Nullable Float f, @Nullable Float f2) {
        this.lat = f;
        this.lng = f2;
    }

    public static /* synthetic */ LatLngItem copy$default(LatLngItem latLngItem, Float f, Float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = latLngItem.lat;
        }
        if ((i & 2) != 0) {
            f2 = latLngItem.lng;
        }
        return latLngItem.copy(f, f2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Float getLat() {
        return this.lat;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Float getLng() {
        return this.lng;
    }

    @NotNull
    public final LatLngItem copy(@Nullable Float lat, @Nullable Float lng) {
        return new LatLngItem(lat, lng);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LatLngItem)) {
            return false;
        }
        LatLngItem latLngItem = (LatLngItem) other;
        return Intrinsics.areEqual((Object) this.lat, (Object) latLngItem.lat) && Intrinsics.areEqual((Object) this.lng, (Object) latLngItem.lng);
    }

    @Nullable
    public final Float getLat() {
        return this.lat;
    }

    @Nullable
    public final Float getLng() {
        return this.lng;
    }

    public int hashCode() {
        Float f = this.lat;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.lng;
        return iHashCode + (f2 != null ? f2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LatLngItem(lat=" + this.lat + ", lng=" + this.lng + ")";
    }
}
