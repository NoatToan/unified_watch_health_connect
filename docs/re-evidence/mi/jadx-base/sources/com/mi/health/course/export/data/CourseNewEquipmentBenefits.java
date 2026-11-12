package com.mi.health.course.export.data;

import com.google.gson.annotations.SerializedName;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ>\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/mi/health/course/export/data/CourseNewEquipmentBenefits;", "", "code", "", "activityId", "did", "status", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getCode", "()Ljava/lang/String;", "getActivityId", "getDid", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/mi/health/course/export/data/CourseNewEquipmentBenefits;", "equals", "", "other", "hashCode", "toString", "course-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CourseNewEquipmentBenefits {

    @SerializedName(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID)
    @Nullable
    private final String activityId;

    @Nullable
    private final String code;

    @Nullable
    private final String did;

    @Nullable
    private Integer status;

    public CourseNewEquipmentBenefits(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num) {
        this.code = str;
        this.activityId = str2;
        this.did = str3;
        this.status = num;
    }

    public static /* synthetic */ CourseNewEquipmentBenefits copy$default(CourseNewEquipmentBenefits courseNewEquipmentBenefits, String str, String str2, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = courseNewEquipmentBenefits.code;
        }
        if ((i & 2) != 0) {
            str2 = courseNewEquipmentBenefits.activityId;
        }
        if ((i & 4) != 0) {
            str3 = courseNewEquipmentBenefits.did;
        }
        if ((i & 8) != 0) {
            num = courseNewEquipmentBenefits.status;
        }
        return courseNewEquipmentBenefits.copy(str, str2, str3, num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getActivityId() {
        return this.activityId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDid() {
        return this.did;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    @NotNull
    public final CourseNewEquipmentBenefits copy(@Nullable String code, @Nullable String activityId, @Nullable String did, @Nullable Integer status) {
        return new CourseNewEquipmentBenefits(code, activityId, did, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CourseNewEquipmentBenefits)) {
            return false;
        }
        CourseNewEquipmentBenefits courseNewEquipmentBenefits = (CourseNewEquipmentBenefits) other;
        return Intrinsics.areEqual(this.code, courseNewEquipmentBenefits.code) && Intrinsics.areEqual(this.activityId, courseNewEquipmentBenefits.activityId) && Intrinsics.areEqual(this.did, courseNewEquipmentBenefits.did) && Intrinsics.areEqual(this.status, courseNewEquipmentBenefits.status);
    }

    @Nullable
    public final String getActivityId() {
        return this.activityId;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getDid() {
        return this.did;
    }

    @Nullable
    public final Integer getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.activityId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.did;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.status;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final void setStatus(@Nullable Integer num) {
        this.status = num;
    }

    @NotNull
    public String toString() {
        return "CourseNewEquipmentBenefits(code=" + this.code + ", activityId=" + this.activityId + ", did=" + this.did + ", status=" + this.status + ")";
    }
}
