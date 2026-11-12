package com.xiaomi.wearable.yrn.components.amap;

import com.xiaomi.smarthome.homeroom.model.Home;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jh\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u000bHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006*"}, d2 = {"Lcom/xiaomi/wearable/yrn/components/amap/POI;", "", "id", "", "name", Home.JSON_KEY_ADDRESS, "type", "tel", "coordinate", "Lcom/xiaomi/wearable/yrn/components/amap/Coordinate;", "distance", "", "adcode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/xiaomi/wearable/yrn/components/amap/Coordinate;Ljava/lang/Integer;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getAddress", "getType", "getTel", "getCoordinate", "()Lcom/xiaomi/wearable/yrn/components/amap/Coordinate;", "getDistance", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAdcode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/xiaomi/wearable/yrn/components/amap/Coordinate;Ljava/lang/Integer;Ljava/lang/String;)Lcom/xiaomi/wearable/yrn/components/amap/POI;", "equals", "", "other", "hashCode", "toString", "components_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class POI {

    @Nullable
    private final String adcode;

    @Nullable
    private final String address;

    @NotNull
    private final Coordinate coordinate;

    @Nullable
    private final Integer distance;

    @NotNull
    private final String id;

    @NotNull
    private final String name;

    @Nullable
    private final String tel;

    @Nullable
    private final String type;

    public POI(@NotNull String id, @NotNull String name, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull Coordinate coordinate, @Nullable Integer num, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(coordinate, "coordinate");
        this.id = id;
        this.name = name;
        this.address = str;
        this.type = str2;
        this.tel = str3;
        this.coordinate = coordinate;
        this.distance = num;
        this.adcode = str4;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTel() {
        return this.tel;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Coordinate getCoordinate() {
        return this.coordinate;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getDistance() {
        return this.distance;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAdcode() {
        return this.adcode;
    }

    @NotNull
    public final POI copy(@NotNull String id, @NotNull String name, @Nullable String address, @Nullable String type, @Nullable String tel, @NotNull Coordinate coordinate, @Nullable Integer distance, @Nullable String adcode) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(coordinate, "coordinate");
        return new POI(id, name, address, type, tel, coordinate, distance, adcode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof POI)) {
            return false;
        }
        POI poi = (POI) other;
        return Intrinsics.areEqual(this.id, poi.id) && Intrinsics.areEqual(this.name, poi.name) && Intrinsics.areEqual(this.address, poi.address) && Intrinsics.areEqual(this.type, poi.type) && Intrinsics.areEqual(this.tel, poi.tel) && Intrinsics.areEqual(this.coordinate, poi.coordinate) && Intrinsics.areEqual(this.distance, poi.distance) && Intrinsics.areEqual(this.adcode, poi.adcode);
    }

    @Nullable
    public final String getAdcode() {
        return this.adcode;
    }

    @Nullable
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    public final Coordinate getCoordinate() {
        return this.coordinate;
    }

    @Nullable
    public final Integer getDistance() {
        return this.distance;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getTel() {
        return this.tel;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.name.hashCode()) * 31;
        String str = this.address;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tel;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.coordinate.hashCode()) * 31;
        Integer num = this.distance;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.adcode;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "POI(id=" + this.id + ", name=" + this.name + ", address=" + this.address + ", type=" + this.type + ", tel=" + this.tel + ", coordinate=" + this.coordinate + ", distance=" + this.distance + ", adcode=" + this.adcode + ")";
    }
}
