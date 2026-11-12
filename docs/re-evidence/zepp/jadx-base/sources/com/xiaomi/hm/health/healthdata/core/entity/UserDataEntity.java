package com.xiaomi.hm.health.healthdata.core.entity;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleepassistant.apilib.utils.WebConst;
import com.loc.z;
import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerialName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Entity
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bF\u0010GJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003Jn\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u001b\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010#R\u0019\u0010\u0011\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R$\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R$\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010/\u0012\u0004\b2\u0010-\u001a\u0004\b0\u00101R$\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u0010/\u0012\u0004\b5\u0010-\u001a\u0004\b4\u00101R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b6\u0010%\u001a\u0004\b7\u0010'R\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b8\u0010%\u001a\u0004\b9\u0010'R\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b:\u0010%\u001a\u0004\b;\u0010'R\"\u0010?\u001a\u00020\u00028\u0006@\u0007X\u0087D¢\u0006\u0012\n\u0004\b<\u0010%\u0012\u0004\b>\u0010-\u001a\u0004\b=\u0010'R\"\u0010B\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006H"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/entity/UserDataEntity;", "", "", "toString", "", "component1", "()Ljava/lang/Long;", "component2", "Lcom/xiaomi/hm/health/healthdata/dto/HealthDataType;", "component3", "Ljava/util/Date;", "component4", "component5", "component6", "component7", "component8", "id", "userId", "type", "uploadTime", "lastUpdateTime", "eventValue", "extValue", "dateStr", "copy", "(Ljava/lang/Long;Ljava/lang/String;Lcom/xiaomi/hm/health/healthdata/dto/HealthDataType;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/xiaomi/hm/health/healthdata/core/entity/UserDataEntity;", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/Long;", "getId", WebConst.QueryParam.SET_ID, "(Ljava/lang/Long;)V", "b", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "c", "Lcom/xiaomi/hm/health/healthdata/dto/HealthDataType;", "getType", "()Lcom/xiaomi/hm/health/healthdata/dto/HealthDataType;", "getType$annotations", "()V", GoogleApiAvailabilityLight.a, "Ljava/util/Date;", "getUploadTime", "()Ljava/util/Date;", "getUploadTime$annotations", "e", "getLastUpdateTime", "getLastUpdateTime$annotations", "f", "getEventValue", "g", "getExtValue", "h", "getDateStr", "i", "getMainType", "getMainType$annotations", "mainType", z.j, "Z", "isOldData", "()Z", "setOldData", "(Z)V", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Lcom/xiaomi/hm/health/healthdata/dto/HealthDataType;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class UserDataEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @PrimaryKey(autoGenerate = true)
    @Nullable
    private Long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final HealthDataType type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final Date uploadTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final Date lastUpdateTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final String eventValue;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private final String extValue;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private final String dateStr;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Ignore
    @NotNull
    private final String mainType;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Ignore
    private boolean isOldData;

    public UserDataEntity(@Nullable Long l, @NotNull String str, @Nullable HealthDataType healthDataType, @Nullable Date date, @Nullable Date date2, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.id = l;
        this.userId = str;
        this.type = healthDataType;
        this.uploadTime = date;
        this.lastUpdateTime = date2;
        this.eventValue = str2;
        this.extValue = str3;
        this.dateStr = str4;
        this.mainType = "health_data";
    }

    @SerialName("lastUpdateTime")
    public static /* synthetic */ void getLastUpdateTime$annotations() {
    }

    @SerialName("eventType")
    public static /* synthetic */ void getMainType$annotations() {
    }

    @SerialName("subType")
    public static /* synthetic */ void getType$annotations() {
    }

    @SerialName("timestamp")
    public static /* synthetic */ void getUploadTime$annotations() {
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HealthDataType getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getUploadTime() {
        return this.uploadTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getExtValue() {
        return this.extValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDateStr() {
        return this.dateStr;
    }

    @NotNull
    public final UserDataEntity copy(@Nullable Long id, @NotNull String userId, @Nullable HealthDataType type, @Nullable Date uploadTime, @Nullable Date lastUpdateTime, @Nullable String eventValue, @Nullable String extValue, @Nullable String dateStr) {
        return new UserDataEntity(id, userId, type, uploadTime, lastUpdateTime, eventValue, extValue, dateStr);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserDataEntity)) {
            return false;
        }
        UserDataEntity userDataEntity = (UserDataEntity) other;
        return Intrinsics.areEqual(this.id, userDataEntity.id) && Intrinsics.areEqual(this.userId, userDataEntity.userId) && this.type == userDataEntity.type && Intrinsics.areEqual(this.uploadTime, userDataEntity.uploadTime) && Intrinsics.areEqual(this.lastUpdateTime, userDataEntity.lastUpdateTime) && Intrinsics.areEqual(this.eventValue, userDataEntity.eventValue) && Intrinsics.areEqual(this.extValue, userDataEntity.extValue) && Intrinsics.areEqual(this.dateStr, userDataEntity.dateStr);
    }

    @Nullable
    public final String getDateStr() {
        return this.dateStr;
    }

    @Nullable
    public final String getEventValue() {
        return this.eventValue;
    }

    @Nullable
    public final String getExtValue() {
        return this.extValue;
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    @Nullable
    public final Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    @NotNull
    public final String getMainType() {
        return this.mainType;
    }

    @Nullable
    public final HealthDataType getType() {
        return this.type;
    }

    @Nullable
    public final Date getUploadTime() {
        return this.uploadTime;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        Long l = this.id;
        int iHashCode = (((l == null ? 0 : l.hashCode()) * 31) + this.userId.hashCode()) * 31;
        HealthDataType healthDataType = this.type;
        int iHashCode2 = (iHashCode + (healthDataType == null ? 0 : healthDataType.hashCode())) * 31;
        Date date = this.uploadTime;
        int iHashCode3 = (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.lastUpdateTime;
        int iHashCode4 = (iHashCode3 + (date2 == null ? 0 : date2.hashCode())) * 31;
        String str = this.eventValue;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.extValue;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dateStr;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: isOldData, reason: from getter */
    public final boolean getIsOldData() {
        return this.isOldData;
    }

    public final void setId(@Nullable Long l) {
        this.id = l;
    }

    public final void setOldData(boolean z) {
        this.isOldData = z;
    }

    @NotNull
    public String toString() {
        return "UserDataEntity(id=" + this.id + ", userId='" + this.userId + "', type=" + this.type + ", uploadTime=" + this.uploadTime + ", lastUpdateTime=" + this.lastUpdateTime + ", eventValue=" + this.eventValue + ", extValue=" + this.extValue + ", dateStr=" + this.dateStr + ", mainType='" + this.mainType + "', isOldData=" + this.isOldData + ")";
    }

    public /* synthetic */ UserDataEntity(Long l, String str, HealthDataType healthDataType, Date date, Date date2, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, str, healthDataType, (i & 8) != 0 ? null : date, (i & 16) != 0 ? null : date2, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4);
    }
}
