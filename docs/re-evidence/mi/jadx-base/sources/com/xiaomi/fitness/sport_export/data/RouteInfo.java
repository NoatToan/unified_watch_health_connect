package com.xiaomi.fitness.sport_export.data;

import com.google.gson.annotations.SerializedName;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b1\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\bHÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u000bHÆ\u0003J\t\u0010;\u001a\u00020\bHÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0010HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00101J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u001aHÆ\u0003JÐ\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u001aHÆ\u0001¢\u0006\u0002\u0010IJ\u0013\u0010J\u001a\u00020\u001a2\b\u0010K\u001a\u0004\u0018\u00010LHÖ\u0003J\t\u0010M\u001a\u00020\u0003HÖ\u0001J\t\u0010N\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u001eR\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u001eR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00102\u001a\u0004\b0\u00101R\u0016\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001eR\u0016\u0010\u0019\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u00104¨\u0006O"}, d2 = {"Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "Ljava/io/Serializable;", "id", "", "name", "", "icon", "length", "", "category", "startPoint", "Lcom/xiaomi/fitness/sport_export/data/StartPoint;", "distance", "file", "kmlFile", "createTimestamp", "", "heat", "isRecommend", "clockInTimes", "routeStatus", Constants.KEY_RECHARGE_IS_FAVORITE, "fileSuffix", "officialRouteType", "rotateAngle", "isForbidTrans", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;DILcom/xiaomi/fitness/sport_export/data/StartPoint;DLjava/lang/String;Ljava/lang/String;JIIIIILjava/lang/String;Ljava/lang/Integer;IZ)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getIcon", "getLength", "()D", "getCategory", "getStartPoint", "()Lcom/xiaomi/fitness/sport_export/data/StartPoint;", "getDistance", "getFile", "getKmlFile", "getCreateTimestamp", "()J", "getHeat", "getClockInTimes", "getRouteStatus", "getFileSuffix", "getOfficialRouteType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRotateAngle", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(ILjava/lang/String;Ljava/lang/String;DILcom/xiaomi/fitness/sport_export/data/StartPoint;DLjava/lang/String;Ljava/lang/String;JIIIIILjava/lang/String;Ljava/lang/Integer;IZ)Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "equals", "other", "", "hashCode", "toString", "sport-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteInfo implements Serializable {

    @SerializedName("category")
    private final int category;

    @SerializedName("clock_in_times")
    private final int clockInTimes;

    @SerializedName(MiuiCursorConstants.CREATE_TIME)
    private final long createTimestamp;

    @SerializedName("distance")
    private final double distance;

    @SerializedName("file")
    @NotNull
    private final String file;

    @SerializedName("file_suffix")
    @Nullable
    private final String fileSuffix;

    @SerializedName("heat")
    private final int heat;

    @SerializedName("icon")
    @NotNull
    private final String icon;

    @SerializedName("id")
    private final int id;

    @SerializedName("is_favorite")
    private final int isFavorite;

    @SerializedName("is_forbid_trans")
    private final boolean isForbidTrans;

    @SerializedName("is_recommend")
    private final int isRecommend;

    @SerializedName("kml_file")
    @NotNull
    private final String kmlFile;

    @SerializedName("length")
    private final double length;

    @SerializedName("name")
    @NotNull
    private final String name;

    @SerializedName("official_route_type")
    @Nullable
    private final Integer officialRouteType;

    @SerializedName("rotate_angle")
    private final int rotateAngle;

    @SerializedName("route_status")
    private final int routeStatus;

    @SerializedName("start_point")
    @NotNull
    private final StartPoint startPoint;

    public RouteInfo(int i, @NotNull String name, @NotNull String icon, double d, int i2, @NotNull StartPoint startPoint, double d2, @NotNull String file, @NotNull String kmlFile, long j, int i3, int i4, int i5, int i6, int i7, @Nullable String str, @Nullable Integer num, int i8, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(startPoint, "startPoint");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(kmlFile, "kmlFile");
        this.id = i;
        this.name = name;
        this.icon = icon;
        this.length = d;
        this.category = i2;
        this.startPoint = startPoint;
        this.distance = d2;
        this.file = file;
        this.kmlFile = kmlFile;
        this.createTimestamp = j;
        this.heat = i3;
        this.isRecommend = i4;
        this.clockInTimes = i5;
        this.routeStatus = i6;
        this.isFavorite = i7;
        this.fileSuffix = str;
        this.officialRouteType = num;
        this.rotateAngle = i8;
        this.isForbidTrans = z;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getCreateTimestamp() {
        return this.createTimestamp;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getHeat() {
        return this.heat;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getIsRecommend() {
        return this.isRecommend;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getClockInTimes() {
        return this.clockInTimes;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getRouteStatus() {
        return this.routeStatus;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getIsFavorite() {
        return this.isFavorite;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getFileSuffix() {
        return this.fileSuffix;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Integer getOfficialRouteType() {
        return this.officialRouteType;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getRotateAngle() {
        return this.rotateAngle;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getIsForbidTrans() {
        return this.isForbidTrans;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getLength() {
        return this.length;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getCategory() {
        return this.category;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final StartPoint getStartPoint() {
        return this.startPoint;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getDistance() {
        return this.distance;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getFile() {
        return this.file;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getKmlFile() {
        return this.kmlFile;
    }

    @NotNull
    public final RouteInfo copy(int id, @NotNull String name, @NotNull String icon, double length, int category, @NotNull StartPoint startPoint, double distance, @NotNull String file, @NotNull String kmlFile, long createTimestamp, int heat, int isRecommend, int clockInTimes, int routeStatus, int isFavorite, @Nullable String fileSuffix, @Nullable Integer officialRouteType, int rotateAngle, boolean isForbidTrans) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(startPoint, "startPoint");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(kmlFile, "kmlFile");
        return new RouteInfo(id, name, icon, length, category, startPoint, distance, file, kmlFile, createTimestamp, heat, isRecommend, clockInTimes, routeStatus, isFavorite, fileSuffix, officialRouteType, rotateAngle, isForbidTrans);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RouteInfo)) {
            return false;
        }
        RouteInfo routeInfo = (RouteInfo) other;
        return this.id == routeInfo.id && Intrinsics.areEqual(this.name, routeInfo.name) && Intrinsics.areEqual(this.icon, routeInfo.icon) && Double.compare(this.length, routeInfo.length) == 0 && this.category == routeInfo.category && Intrinsics.areEqual(this.startPoint, routeInfo.startPoint) && Double.compare(this.distance, routeInfo.distance) == 0 && Intrinsics.areEqual(this.file, routeInfo.file) && Intrinsics.areEqual(this.kmlFile, routeInfo.kmlFile) && this.createTimestamp == routeInfo.createTimestamp && this.heat == routeInfo.heat && this.isRecommend == routeInfo.isRecommend && this.clockInTimes == routeInfo.clockInTimes && this.routeStatus == routeInfo.routeStatus && this.isFavorite == routeInfo.isFavorite && Intrinsics.areEqual(this.fileSuffix, routeInfo.fileSuffix) && Intrinsics.areEqual(this.officialRouteType, routeInfo.officialRouteType) && this.rotateAngle == routeInfo.rotateAngle && this.isForbidTrans == routeInfo.isForbidTrans;
    }

    public final int getCategory() {
        return this.category;
    }

    public final int getClockInTimes() {
        return this.clockInTimes;
    }

    public final long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public final double getDistance() {
        return this.distance;
    }

    @NotNull
    public final String getFile() {
        return this.file;
    }

    @Nullable
    public final String getFileSuffix() {
        return this.fileSuffix;
    }

    public final int getHeat() {
        return this.heat;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getKmlFile() {
        return this.kmlFile;
    }

    public final double getLength() {
        return this.length;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getOfficialRouteType() {
        return this.officialRouteType;
    }

    public final int getRotateAngle() {
        return this.rotateAngle;
    }

    public final int getRouteStatus() {
        return this.routeStatus;
    }

    @NotNull
    public final StartPoint getStartPoint() {
        return this.startPoint;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.icon.hashCode()) * 31) + Double.hashCode(this.length)) * 31) + Integer.hashCode(this.category)) * 31) + this.startPoint.hashCode()) * 31) + Double.hashCode(this.distance)) * 31) + this.file.hashCode()) * 31) + this.kmlFile.hashCode()) * 31) + Long.hashCode(this.createTimestamp)) * 31) + Integer.hashCode(this.heat)) * 31) + Integer.hashCode(this.isRecommend)) * 31) + Integer.hashCode(this.clockInTimes)) * 31) + Integer.hashCode(this.routeStatus)) * 31) + Integer.hashCode(this.isFavorite)) * 31;
        String str = this.fileSuffix;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.officialRouteType;
        return ((((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + Integer.hashCode(this.rotateAngle)) * 31) + Boolean.hashCode(this.isForbidTrans);
    }

    public final int isFavorite() {
        return this.isFavorite;
    }

    public final boolean isForbidTrans() {
        return this.isForbidTrans;
    }

    public final int isRecommend() {
        return this.isRecommend;
    }

    @NotNull
    public String toString() {
        return "RouteInfo(id=" + this.id + ", name=" + this.name + ", icon=" + this.icon + ", length=" + this.length + ", category=" + this.category + ", startPoint=" + this.startPoint + ", distance=" + this.distance + ", file=" + this.file + ", kmlFile=" + this.kmlFile + ", createTimestamp=" + this.createTimestamp + ", heat=" + this.heat + ", isRecommend=" + this.isRecommend + ", clockInTimes=" + this.clockInTimes + ", routeStatus=" + this.routeStatus + ", isFavorite=" + this.isFavorite + ", fileSuffix=" + this.fileSuffix + ", officialRouteType=" + this.officialRouteType + ", rotateAngle=" + this.rotateAngle + ", isForbidTrans=" + this.isForbidTrans + ")";
    }

    public /* synthetic */ RouteInfo(int i, String str, String str2, double d, int i2, StartPoint startPoint, double d2, String str3, String str4, long j, int i3, int i4, int i5, int i6, int i7, String str5, Integer num, int i8, boolean z, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i9 & 2) != 0 ? "" : str, str2, d, i2, startPoint, d2, str3, str4, j, i3, i4, i5, i6, i7, str5, num, i8, z);
    }
}
