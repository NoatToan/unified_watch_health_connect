package com.huami.treadmill.data;

import android.view.View;
import com.huami.mifit.sportlib.model.GPSPoint;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003JI\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0015\u001a\u0004\b\r\u0010\u0017\"\u0004\b\u001e\u0010\u0019¨\u0006!"}, d2 = {"Lcom/huami/treadmill/data/MarkerList;", "", "", "Lcom/huami/mifit/sportlib/model/GPSPoint;", "component1", "Landroid/view/View;", "component2", "", "component3", "component4", "pointList", "viewList", "refreshList", "isMeList", "copy", "", "toString", "", "hashCode", "other", "equals", "Ljava/util/List;", "getPointList", "()Ljava/util/List;", "setPointList", "(Ljava/util/List;)V", "getViewList", "setViewList", "getRefreshList", "setRefreshList", "setMeList", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MarkerList {

    @NotNull
    private List<Boolean> isMeList;

    @NotNull
    private List<GPSPoint> pointList;

    @NotNull
    private List<Boolean> refreshList;

    @NotNull
    private List<View> viewList;

    public MarkerList(@NotNull List<GPSPoint> list, @NotNull List<View> list2, @NotNull List<Boolean> list3, @NotNull List<Boolean> list4) {
        this.pointList = list;
        this.viewList = list2;
        this.refreshList = list3;
        this.isMeList = list4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarkerList copy$default(MarkerList markerList, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = markerList.pointList;
        }
        if ((i & 2) != 0) {
            list2 = markerList.viewList;
        }
        if ((i & 4) != 0) {
            list3 = markerList.refreshList;
        }
        if ((i & 8) != 0) {
            list4 = markerList.isMeList;
        }
        return markerList.copy(list, list2, list3, list4);
    }

    @NotNull
    public final List<GPSPoint> component1() {
        return this.pointList;
    }

    @NotNull
    public final List<View> component2() {
        return this.viewList;
    }

    @NotNull
    public final List<Boolean> component3() {
        return this.refreshList;
    }

    @NotNull
    public final List<Boolean> component4() {
        return this.isMeList;
    }

    @NotNull
    public final MarkerList copy(@NotNull List<GPSPoint> pointList, @NotNull List<View> viewList, @NotNull List<Boolean> refreshList, @NotNull List<Boolean> isMeList) {
        return new MarkerList(pointList, viewList, refreshList, isMeList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarkerList)) {
            return false;
        }
        MarkerList markerList = (MarkerList) other;
        return Intrinsics.areEqual(this.pointList, markerList.pointList) && Intrinsics.areEqual(this.viewList, markerList.viewList) && Intrinsics.areEqual(this.refreshList, markerList.refreshList) && Intrinsics.areEqual(this.isMeList, markerList.isMeList);
    }

    @NotNull
    public final List<GPSPoint> getPointList() {
        return this.pointList;
    }

    @NotNull
    public final List<Boolean> getRefreshList() {
        return this.refreshList;
    }

    @NotNull
    public final List<View> getViewList() {
        return this.viewList;
    }

    public int hashCode() {
        return (((((this.pointList.hashCode() * 31) + this.viewList.hashCode()) * 31) + this.refreshList.hashCode()) * 31) + this.isMeList.hashCode();
    }

    @NotNull
    public final List<Boolean> isMeList() {
        return this.isMeList;
    }

    public final void setMeList(@NotNull List<Boolean> list) {
        this.isMeList = list;
    }

    public final void setPointList(@NotNull List<GPSPoint> list) {
        this.pointList = list;
    }

    public final void setRefreshList(@NotNull List<Boolean> list) {
        this.refreshList = list;
    }

    public final void setViewList(@NotNull List<View> list) {
        this.viewList = list;
    }

    @NotNull
    public String toString() {
        return "MarkerList(pointList=" + this.pointList + ", viewList=" + this.viewList + ", refreshList=" + this.refreshList + ", isMeList=" + this.isMeList + ')';
    }
}
