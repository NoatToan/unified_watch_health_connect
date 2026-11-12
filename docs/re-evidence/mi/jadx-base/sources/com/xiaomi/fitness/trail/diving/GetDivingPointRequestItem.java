package com.xiaomi.fitness.trail.diving;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/trail/diving/GetDivingPointRequestItem;", "", "inItem", "Lcom/xiaomi/fitness/trail/diving/LatLngItem;", "outItem", "<init>", "(Lcom/xiaomi/fitness/trail/diving/LatLngItem;Lcom/xiaomi/fitness/trail/diving/LatLngItem;)V", "getInItem", "()Lcom/xiaomi/fitness/trail/diving/LatLngItem;", "getOutItem", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetDivingPointRequestItem {

    @SerializedName("in")
    @NotNull
    private final LatLngItem inItem;

    @SerializedName("out")
    @NotNull
    private final LatLngItem outItem;

    public GetDivingPointRequestItem(@NotNull LatLngItem inItem, @NotNull LatLngItem outItem) {
        Intrinsics.checkNotNullParameter(inItem, "inItem");
        Intrinsics.checkNotNullParameter(outItem, "outItem");
        this.inItem = inItem;
        this.outItem = outItem;
    }

    public static /* synthetic */ GetDivingPointRequestItem copy$default(GetDivingPointRequestItem getDivingPointRequestItem, LatLngItem latLngItem, LatLngItem latLngItem2, int i, Object obj) {
        if ((i & 1) != 0) {
            latLngItem = getDivingPointRequestItem.inItem;
        }
        if ((i & 2) != 0) {
            latLngItem2 = getDivingPointRequestItem.outItem;
        }
        return getDivingPointRequestItem.copy(latLngItem, latLngItem2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LatLngItem getInItem() {
        return this.inItem;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LatLngItem getOutItem() {
        return this.outItem;
    }

    @NotNull
    public final GetDivingPointRequestItem copy(@NotNull LatLngItem inItem, @NotNull LatLngItem outItem) {
        Intrinsics.checkNotNullParameter(inItem, "inItem");
        Intrinsics.checkNotNullParameter(outItem, "outItem");
        return new GetDivingPointRequestItem(inItem, outItem);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetDivingPointRequestItem)) {
            return false;
        }
        GetDivingPointRequestItem getDivingPointRequestItem = (GetDivingPointRequestItem) other;
        return Intrinsics.areEqual(this.inItem, getDivingPointRequestItem.inItem) && Intrinsics.areEqual(this.outItem, getDivingPointRequestItem.outItem);
    }

    @NotNull
    public final LatLngItem getInItem() {
        return this.inItem;
    }

    @NotNull
    public final LatLngItem getOutItem() {
        return this.outItem;
    }

    public int hashCode() {
        return (this.inItem.hashCode() * 31) + this.outItem.hashCode();
    }

    @NotNull
    public String toString() {
        return "GetDivingPointRequestItem(inItem=" + this.inItem + ", outItem=" + this.outItem + ")";
    }
}
