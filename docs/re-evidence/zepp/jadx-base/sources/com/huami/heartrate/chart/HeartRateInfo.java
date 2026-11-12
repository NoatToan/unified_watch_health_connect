package com.huami.heartrate.chart;

import com.huami.heartrate.model.HeartRateSection;
import com.huami.widget.colorbar.ColorItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0011\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004HÆ\u0003J7\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R!\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR!\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/huami/heartrate/chart/HeartRateInfo;", "", "", "component1", "", "Lcom/huami/widget/colorbar/ColorItem;", "component2", "Lcom/huami/heartrate/model/HeartRateSection;", "component3", "visibility", "colorItemList", "hrSectionItemList", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Z", "getVisibility", "()Z", "b", "Ljava/util/List;", "getColorItemList", "()Ljava/util/List;", "c", "getHrSectionItemList", "<init>", "(ZLjava/util/List;Ljava/util/List;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HeartRateInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean visibility;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final List<ColorItem> colorItemList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final List<HeartRateSection> hrSectionItemList;

    /* JADX WARN: Multi-variable type inference failed */
    public HeartRateInfo(boolean z, @Nullable List<? extends ColorItem> list, @Nullable List<HeartRateSection> list2) {
        this.visibility = z;
        this.colorItemList = list;
        this.hrSectionItemList = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HeartRateInfo copy$default(HeartRateInfo heartRateInfo, boolean z, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = heartRateInfo.visibility;
        }
        if ((i & 2) != 0) {
            list = heartRateInfo.colorItemList;
        }
        if ((i & 4) != 0) {
            list2 = heartRateInfo.hrSectionItemList;
        }
        return heartRateInfo.copy(z, list, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getVisibility() {
        return this.visibility;
    }

    @Nullable
    public final List<ColorItem> component2() {
        return this.colorItemList;
    }

    @Nullable
    public final List<HeartRateSection> component3() {
        return this.hrSectionItemList;
    }

    @NotNull
    public final HeartRateInfo copy(boolean visibility, @Nullable List<? extends ColorItem> colorItemList, @Nullable List<HeartRateSection> hrSectionItemList) {
        return new HeartRateInfo(visibility, colorItemList, hrSectionItemList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeartRateInfo)) {
            return false;
        }
        HeartRateInfo heartRateInfo = (HeartRateInfo) other;
        return this.visibility == heartRateInfo.visibility && Intrinsics.areEqual(this.colorItemList, heartRateInfo.colorItemList) && Intrinsics.areEqual(this.hrSectionItemList, heartRateInfo.hrSectionItemList);
    }

    @Nullable
    public final List<ColorItem> getColorItemList() {
        return this.colorItemList;
    }

    @Nullable
    public final List<HeartRateSection> getHrSectionItemList() {
        return this.hrSectionItemList;
    }

    public final boolean getVisibility() {
        return this.visibility;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.visibility;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        List<ColorItem> list = this.colorItemList;
        int iHashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
        List<HeartRateSection> list2 = this.hrSectionItemList;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HeartRateInfo(visibility=" + this.visibility + ", colorItemList=" + this.colorItemList + ", hrSectionItemList=" + this.hrSectionItemList + ")";
    }

    public /* synthetic */ HeartRateInfo(boolean z, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}
