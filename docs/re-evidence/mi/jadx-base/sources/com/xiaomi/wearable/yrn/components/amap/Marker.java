package com.xiaomi.wearable.yrn.components.amap;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u0010\"\u001a\u00020\fHÆ\u0003J\\\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lcom/xiaomi/wearable/yrn/components/amap/Marker;", "", "id", "", "coordinate", "Lcom/xiaomi/wearable/yrn/components/amap/Coordinate;", "title", "", "description", "image", "count", "joined", "", "<init>", "(ILcom/xiaomi/wearable/yrn/components/amap/Coordinate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)V", "getId", "()I", "getCoordinate", "()Lcom/xiaomi/wearable/yrn/components/amap/Coordinate;", "getTitle", "()Ljava/lang/String;", "getDescription", "getImage", "getCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getJoined", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ILcom/xiaomi/wearable/yrn/components/amap/Coordinate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)Lcom/xiaomi/wearable/yrn/components/amap/Marker;", "equals", "other", "hashCode", "toString", "components_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Marker {

    @NotNull
    private final Coordinate coordinate;

    @Nullable
    private final Integer count;

    @Nullable
    private final String description;
    private final int id;

    @Nullable
    private final String image;
    private final boolean joined;

    @Nullable
    private final String title;

    public Marker(int i, @NotNull Coordinate coordinate, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, boolean z) {
        Intrinsics.checkNotNullParameter(coordinate, "coordinate");
        this.id = i;
        this.coordinate = coordinate;
        this.title = str;
        this.description = str2;
        this.image = str3;
        this.count = num;
        this.joined = z;
    }

    public static /* synthetic */ Marker copy$default(Marker marker, int i, Coordinate coordinate, String str, String str2, String str3, Integer num, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = marker.id;
        }
        if ((i2 & 2) != 0) {
            coordinate = marker.coordinate;
        }
        Coordinate coordinate2 = coordinate;
        if ((i2 & 4) != 0) {
            str = marker.title;
        }
        String str4 = str;
        if ((i2 & 8) != 0) {
            str2 = marker.description;
        }
        String str5 = str2;
        if ((i2 & 16) != 0) {
            str3 = marker.image;
        }
        String str6 = str3;
        if ((i2 & 32) != 0) {
            num = marker.count;
        }
        Integer num2 = num;
        if ((i2 & 64) != 0) {
            z = marker.joined;
        }
        return marker.copy(i, coordinate2, str4, str5, str6, num2, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Coordinate getCoordinate() {
        return this.coordinate;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getJoined() {
        return this.joined;
    }

    @NotNull
    public final Marker copy(int id, @NotNull Coordinate coordinate, @Nullable String title, @Nullable String description, @Nullable String image, @Nullable Integer count, boolean joined) {
        Intrinsics.checkNotNullParameter(coordinate, "coordinate");
        return new Marker(id, coordinate, title, description, image, count, joined);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Marker)) {
            return false;
        }
        Marker marker = (Marker) other;
        return this.id == marker.id && Intrinsics.areEqual(this.coordinate, marker.coordinate) && Intrinsics.areEqual(this.title, marker.title) && Intrinsics.areEqual(this.description, marker.description) && Intrinsics.areEqual(this.image, marker.image) && Intrinsics.areEqual(this.count, marker.count) && this.joined == marker.joined;
    }

    @NotNull
    public final Coordinate getCoordinate() {
        return this.coordinate;
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    public final boolean getJoined() {
        return this.joined;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.id) * 31) + this.coordinate.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.image;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.count;
        return ((iHashCode4 + (num != null ? num.hashCode() : 0)) * 31) + Boolean.hashCode(this.joined);
    }

    @NotNull
    public String toString() {
        return "Marker(id=" + this.id + ", coordinate=" + this.coordinate + ", title=" + this.title + ", description=" + this.description + ", image=" + this.image + ", count=" + this.count + ", joined=" + this.joined + ")";
    }
}
