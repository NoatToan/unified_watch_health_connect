package com.xiaomi.wearable.yrn.components.amap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/wearable/yrn/components/amap/ClusterData;", "", "position", "Lcom/xiaomi/wearable/yrn/components/amap/Coordinate;", "count", "", "markers", "", "Lcom/xiaomi/wearable/yrn/components/amap/MarkerProps;", "<init>", "(Lcom/xiaomi/wearable/yrn/components/amap/Coordinate;ILjava/util/List;)V", "getPosition", "()Lcom/xiaomi/wearable/yrn/components/amap/Coordinate;", "getCount", "()I", "getMarkers", "()Ljava/util/List;", "equals", "", "other", "hashCode", "component1", "component2", "component3", "copy", "toString", "", "components_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nYRNAMapProps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YRNAMapProps.kt\ncom/xiaomi/wearable/yrn/components/amap/ClusterData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,211:1\n1557#2:212\n1628#2,3:213\n1557#2:216\n1628#2,3:217\n1053#2:220\n*S KotlinDebug\n*F\n+ 1 YRNAMapProps.kt\ncom/xiaomi/wearable/yrn/components/amap/ClusterData\n*L\n42#1:212\n42#1:213,3\n48#1:216\n48#1:217,3\n50#1:220\n*E\n"})
public final /* data */ class ClusterData {
    private final int count;

    @NotNull
    private final List<MarkerProps> markers;

    @NotNull
    private final Coordinate position;

    public ClusterData(@NotNull Coordinate position, int i, @NotNull List<MarkerProps> markers) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(markers, "markers");
        this.position = position;
        this.count = i;
        this.markers = markers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ClusterData copy$default(ClusterData clusterData, Coordinate coordinate, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coordinate = clusterData.position;
        }
        if ((i2 & 2) != 0) {
            i = clusterData.count;
        }
        if ((i2 & 4) != 0) {
            list = clusterData.markers;
        }
        return clusterData.copy(coordinate, i, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Coordinate getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final List<MarkerProps> component3() {
        return this.markers;
    }

    @NotNull
    public final ClusterData copy(@NotNull Coordinate position, int count, @NotNull List<MarkerProps> markers) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(markers, "markers");
        return new ClusterData(position, count, markers);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClusterData)) {
            return false;
        }
        ClusterData clusterData = (ClusterData) other;
        if (this.count == clusterData.count && Intrinsics.areEqual(this.position, clusterData.position) && this.markers.size() == clusterData.markers.size()) {
            List<MarkerProps> list = this.markers;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (true) {
                String icon = null;
                if (!it.hasNext()) {
                    break;
                }
                MarkerIcon icon2 = ((MarkerProps) it.next()).getIcon();
                if (icon2 != null) {
                    icon = icon2.getIcon();
                }
                arrayList.add(icon);
            }
            Set set = CollectionsKt___CollectionsKt.toSet(arrayList);
            List<MarkerProps> list2 = clusterData.markers;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                MarkerIcon icon3 = ((MarkerProps) it2.next()).getIcon();
                arrayList2.add(icon3 != null ? icon3.getIcon() : null);
            }
            if (Intrinsics.areEqual(set, CollectionsKt___CollectionsKt.toSet(arrayList2))) {
                return true;
            }
        }
        return false;
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final List<MarkerProps> getMarkers() {
        return this.markers;
    }

    @NotNull
    public final Coordinate getPosition() {
        return this.position;
    }

    public int hashCode() {
        int iHashCode = (this.position.hashCode() * 31) + this.count;
        List<MarkerProps> list = this.markers;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            MarkerIcon icon = ((MarkerProps) it.next()).getIcon();
            arrayList.add(icon != null ? icon.getIcon() : null);
        }
        return (iHashCode * 31) + CollectionsKt___CollectionsKt.sortedWith(CollectionsKt___CollectionsKt.toSet(arrayList), new Comparator() { // from class: com.xiaomi.wearable.yrn.components.amap.ClusterData$hashCode$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                String str = (String) t;
                if (str == null) {
                    str = "";
                }
                String str2 = (String) t2;
                return ComparisonsKt__ComparisonsKt.compareValues(str, str2 != null ? str2 : "");
            }
        }).hashCode();
    }

    @NotNull
    public String toString() {
        return "ClusterData(position=" + this.position + ", count=" + this.count + ", markers=" + this.markers + ")";
    }
}
