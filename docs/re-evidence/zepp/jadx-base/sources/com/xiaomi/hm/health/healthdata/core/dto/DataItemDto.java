package com.xiaomi.hm.health.healthdata.core.dto;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.healthdata.dto.DataType;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003JI\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u0019\u0010\u0010\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0011\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u0011\u0010(R\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010\u0019\u001a\u0004\b*\u0010\u001b¨\u0006-"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/dto/DataItemDto;", "", "", "toString", "component1", "Ljava/util/Date;", "component2", "component3", "Lcom/xiaomi/hm/health/healthdata/dto/DataType;", "component4", "", "component5", "component6", "id", "uploadTime", "value", "subType", "isOldData", "extra", "copy", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "Ljava/util/Date;", "getUploadTime", "()Ljava/util/Date;", "c", "getValue", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/healthdata/dto/DataType;", "getSubType", "()Lcom/xiaomi/hm/health/healthdata/dto/DataType;", "e", "Z", "()Z", "f", "getExtra", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lcom/xiaomi/hm/health/healthdata/dto/DataType;ZLjava/lang/String;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DataItemDto {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final Date uploadTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String value;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final DataType subType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final boolean isOldData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final String extra;

    public DataItemDto(@NotNull String str, @Nullable Date date, @NotNull String str2, @NotNull DataType dataType, boolean z, @Nullable String str3) {
        this.id = str;
        this.uploadTime = date;
        this.value = str2;
        this.subType = dataType;
        this.isOldData = z;
        this.extra = str3;
    }

    public static /* synthetic */ DataItemDto copy$default(DataItemDto dataItemDto, String str, Date date, String str2, DataType dataType, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dataItemDto.id;
        }
        if ((i & 2) != 0) {
            date = dataItemDto.uploadTime;
        }
        Date date2 = date;
        if ((i & 4) != 0) {
            str2 = dataItemDto.value;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            dataType = dataItemDto.subType;
        }
        DataType dataType2 = dataType;
        if ((i & 16) != 0) {
            z = dataItemDto.isOldData;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str3 = dataItemDto.extra;
        }
        return dataItemDto.copy(str, date2, str4, dataType2, z2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getUploadTime() {
        return this.uploadTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DataType getSubType() {
        return this.subType;
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
    public final DataItemDto copy(@NotNull String id, @Nullable Date uploadTime, @NotNull String value, @NotNull DataType subType, boolean isOldData, @Nullable String extra) {
        return new DataItemDto(id, uploadTime, value, subType, isOldData, extra);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataItemDto)) {
            return false;
        }
        DataItemDto dataItemDto = (DataItemDto) other;
        return Intrinsics.areEqual(this.id, dataItemDto.id) && Intrinsics.areEqual(this.uploadTime, dataItemDto.uploadTime) && Intrinsics.areEqual(this.value, dataItemDto.value) && Intrinsics.areEqual(this.subType, dataItemDto.subType) && this.isOldData == dataItemDto.isOldData && Intrinsics.areEqual(this.extra, dataItemDto.extra);
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

    @Nullable
    public final Date getUploadTime() {
        return this.uploadTime;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Date date = this.uploadTime;
        int iHashCode2 = (((((iHashCode + (date == null ? 0 : date.hashCode())) * 31) + this.value.hashCode()) * 31) + this.subType.hashCode()) * 31;
        boolean z = this.isOldData;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode2 + r1) * 31;
        String str = this.extra;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final boolean isOldData() {
        return this.isOldData;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        Date date = this.uploadTime;
        return "DataItemDto(id='" + str + "', uploadTime=" + date + "(" + HealthDataTimeUtils.INSTANCE.formatTime(date) + "), value='" + this.value + "', subType=" + this.subType + ", extra=" + this.extra + ", isOldData=" + this.isOldData + ")";
    }

    public /* synthetic */ DataItemDto(String str, Date date, String str2, DataType dataType, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, date, str2, dataType, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str3);
    }
}
