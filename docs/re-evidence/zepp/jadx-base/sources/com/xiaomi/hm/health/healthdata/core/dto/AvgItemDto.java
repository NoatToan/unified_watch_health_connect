package com.xiaomi.hm.health.healthdata.core.dto;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.healthdata.dto.DataType;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003JG\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u000e\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001bR\u0019\u0010\u0011\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u0011\u0010(R\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010\u0019\u001a\u0004\b*\u0010\u001b¨\u0006-"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/dto/AvgItemDto;", "", "", "toString", "component1", "Ljava/util/Date;", "component2", "Lcom/xiaomi/hm/health/healthdata/dto/DataType;", "component3", "component4", "", "component5", "component6", "id", "uploadTime", "subType", "avgValue", "isOldData", "extra", "copy", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "Ljava/util/Date;", "getUploadTime", "()Ljava/util/Date;", "c", "Lcom/xiaomi/hm/health/healthdata/dto/DataType;", "getSubType", "()Lcom/xiaomi/hm/health/healthdata/dto/DataType;", GoogleApiAvailabilityLight.a, "getAvgValue", "e", "Z", "()Z", "f", "getExtra", "<init>", "(Ljava/lang/String;Ljava/util/Date;Lcom/xiaomi/hm/health/healthdata/dto/DataType;Ljava/lang/String;ZLjava/lang/String;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AvgItemDto {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final Date uploadTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final DataType subType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String avgValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final boolean isOldData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private final String extra;

    public AvgItemDto(@NotNull String str, @NotNull Date date, @NotNull DataType dataType, @NotNull String str2, boolean z, @Nullable String str3) {
        this.id = str;
        this.uploadTime = date;
        this.subType = dataType;
        this.avgValue = str2;
        this.isOldData = z;
        this.extra = str3;
    }

    public static /* synthetic */ AvgItemDto copy$default(AvgItemDto avgItemDto, String str, Date date, DataType dataType, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = avgItemDto.id;
        }
        if ((i & 2) != 0) {
            date = avgItemDto.uploadTime;
        }
        Date date2 = date;
        if ((i & 4) != 0) {
            dataType = avgItemDto.subType;
        }
        DataType dataType2 = dataType;
        if ((i & 8) != 0) {
            str2 = avgItemDto.avgValue;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            z = avgItemDto.isOldData;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str3 = avgItemDto.extra;
        }
        return avgItemDto.copy(str, date2, dataType2, str4, z2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getUploadTime() {
        return this.uploadTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DataType getSubType() {
        return this.subType;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAvgValue() {
        return this.avgValue;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsOldData() {
        return this.isOldData;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getExtra() {
        return this.extra;
    }

    @NotNull
    public final AvgItemDto copy(@NotNull String id, @NotNull Date uploadTime, @NotNull DataType subType, @NotNull String avgValue, boolean isOldData, @Nullable String extra) {
        return new AvgItemDto(id, uploadTime, subType, avgValue, isOldData, extra);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvgItemDto)) {
            return false;
        }
        AvgItemDto avgItemDto = (AvgItemDto) other;
        return Intrinsics.areEqual(this.id, avgItemDto.id) && Intrinsics.areEqual(this.uploadTime, avgItemDto.uploadTime) && Intrinsics.areEqual(this.subType, avgItemDto.subType) && Intrinsics.areEqual(this.avgValue, avgItemDto.avgValue) && this.isOldData == avgItemDto.isOldData && Intrinsics.areEqual(this.extra, avgItemDto.extra);
    }

    @NotNull
    public final String getAvgValue() {
        return this.avgValue;
    }

    @Nullable
    public final String getExtra() {
        return this.extra;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final DataType getSubType() {
        return this.subType;
    }

    @NotNull
    public final Date getUploadTime() {
        return this.uploadTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + this.uploadTime.hashCode()) * 31) + this.subType.hashCode()) * 31) + this.avgValue.hashCode()) * 31;
        boolean z = this.isOldData;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        String str = this.extra;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final boolean isOldData() {
        return this.isOldData;
    }

    @NotNull
    public String toString() {
        return "AvgItemDto(id='" + this.id + "', uploadTime=" + this.uploadTime + ", subType=" + this.subType + ", avgValue='" + this.avgValue + "', isOldData=" + this.isOldData + ")";
    }

    public /* synthetic */ AvgItemDto(String str, Date date, DataType dataType, String str2, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, date, dataType, str2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str3);
    }
}
