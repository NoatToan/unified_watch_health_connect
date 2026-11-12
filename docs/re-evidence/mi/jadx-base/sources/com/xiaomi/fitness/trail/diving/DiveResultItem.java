package com.xiaomi.fitness.trail.diving;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/trail/diving/DiveResultItem;", "", "pointList", "", "Lcom/xiaomi/fitness/trail/diving/DivePointItem;", "<init>", "(Ljava/util/List;)V", "getPointList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DiveResultItem {

    @SerializedName("point_list")
    @NotNull
    private final List<DivePointItem> pointList;

    public DiveResultItem(@NotNull List<DivePointItem> pointList) {
        Intrinsics.checkNotNullParameter(pointList, "pointList");
        this.pointList = pointList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DiveResultItem copy$default(DiveResultItem diveResultItem, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = diveResultItem.pointList;
        }
        return diveResultItem.copy(list);
    }

    @NotNull
    public final List<DivePointItem> component1() {
        return this.pointList;
    }

    @NotNull
    public final DiveResultItem copy(@NotNull List<DivePointItem> pointList) {
        Intrinsics.checkNotNullParameter(pointList, "pointList");
        return new DiveResultItem(pointList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DiveResultItem) && Intrinsics.areEqual(this.pointList, ((DiveResultItem) other).pointList);
    }

    @NotNull
    public final List<DivePointItem> getPointList() {
        return this.pointList;
    }

    public int hashCode() {
        return this.pointList.hashCode();
    }

    @NotNull
    public String toString() {
        return "DiveResultItem(pointList=" + this.pointList + ")";
    }
}
