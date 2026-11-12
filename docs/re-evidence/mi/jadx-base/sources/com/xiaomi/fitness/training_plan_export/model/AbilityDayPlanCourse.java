package com.xiaomi.fitness.training_plan_export.model;

import com.google.gson.annotations.SerializedName;
import com.mi.health.course.activity.CourseCatalogActivityKt;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\t\u00108\u001a\u00020\u000bHÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010(J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010?\u001a\u00020\u0007HÆ\u0003J\u0096\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010EHÖ\u0003J\t\u0010F\u001a\u00020\u0007HÖ\u0001J\t\u0010G\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u001e\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001b\"\u0004\b\u001e\u0010\u001fR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010%R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010%R \u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0016\u0010\u0013\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001b¨\u0006H"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlanCourse;", "Ljava/io/Serializable;", "name", "", "courseId", "", "type", "", "duration", "status", "courseContent", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanCourseContent;", "courseCode", "planId", "desc", "startTime", DialWidgetType.DATE, "sportKey", "Lcom/xiaomi/fitness/training_plan_export/model/SportKey;", "from", "<init>", "(Ljava/lang/String;JIIILcom/xiaomi/fitness/training_plan_export/model/AbilityPlanCourseContent;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;JLcom/xiaomi/fitness/training_plan_export/model/SportKey;I)V", "getName", "()Ljava/lang/String;", "getCourseId", "()J", "getType", "()I", "getDuration", "getStatus", "setStatus", "(I)V", "getCourseContent", "()Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanCourseContent;", "getCourseCode", "getPlanId", "setPlanId", "(J)V", "getDesc", "getStartTime", "()Ljava/lang/Integer;", "setStartTime", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDate", "setDate", "getSportKey", "()Lcom/xiaomi/fitness/training_plan_export/model/SportKey;", "setSportKey", "(Lcom/xiaomi/fitness/training_plan_export/model/SportKey;)V", "getFrom", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;JIIILcom/xiaomi/fitness/training_plan_export/model/AbilityPlanCourseContent;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;JLcom/xiaomi/fitness/training_plan_export/model/SportKey;I)Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlanCourse;", "equals", "", "other", "", "hashCode", "toString", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AbilityDayPlanCourse implements Serializable {

    @SerializedName("course_code")
    @NotNull
    private final String courseCode;

    @SerializedName("course_content")
    @NotNull
    private final AbilityPlanCourseContent courseContent;

    @SerializedName("course_id")
    private final long courseId;
    private long date;

    @Nullable
    private final String desc;

    @SerializedName("course_duration")
    private final int duration;

    @SerializedName("from")
    private final int from;

    @SerializedName("course_name")
    @NotNull
    private final String name;
    private long planId;

    @SerializedName(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_RECORD_KEY)
    @Nullable
    private SportKey sportKey;

    @Nullable
    private Integer startTime;

    @SerializedName("course_status")
    private int status;

    @SerializedName(CourseCatalogActivityKt.KEY_COURSER_TYPE)
    private final int type;

    public AbilityDayPlanCourse(@NotNull String name, long j, int i, int i2, int i3, @NotNull AbilityPlanCourseContent courseContent, @NotNull String courseCode, long j2, @Nullable String str, @Nullable Integer num, long j3, @Nullable SportKey sportKey, int i4) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(courseContent, "courseContent");
        Intrinsics.checkNotNullParameter(courseCode, "courseCode");
        this.name = name;
        this.courseId = j;
        this.type = i;
        this.duration = i2;
        this.status = i3;
        this.courseContent = courseContent;
        this.courseCode = courseCode;
        this.planId = j2;
        this.desc = str;
        this.startTime = num;
        this.date = j3;
        this.sportKey = sportKey;
        this.from = i4;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final SportKey getSportKey() {
        return this.sportKey;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getFrom() {
        return this.from;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AbilityPlanCourseContent getCourseContent() {
        return this.courseContent;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCourseCode() {
        return this.courseCode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getPlanId() {
        return this.planId;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final AbilityDayPlanCourse copy(@NotNull String name, long courseId, int type, int duration, int status, @NotNull AbilityPlanCourseContent courseContent, @NotNull String courseCode, long planId, @Nullable String desc, @Nullable Integer startTime, long date, @Nullable SportKey sportKey, int from) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(courseContent, "courseContent");
        Intrinsics.checkNotNullParameter(courseCode, "courseCode");
        return new AbilityDayPlanCourse(name, courseId, type, duration, status, courseContent, courseCode, planId, desc, startTime, date, sportKey, from);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AbilityDayPlanCourse)) {
            return false;
        }
        AbilityDayPlanCourse abilityDayPlanCourse = (AbilityDayPlanCourse) other;
        return Intrinsics.areEqual(this.name, abilityDayPlanCourse.name) && this.courseId == abilityDayPlanCourse.courseId && this.type == abilityDayPlanCourse.type && this.duration == abilityDayPlanCourse.duration && this.status == abilityDayPlanCourse.status && Intrinsics.areEqual(this.courseContent, abilityDayPlanCourse.courseContent) && Intrinsics.areEqual(this.courseCode, abilityDayPlanCourse.courseCode) && this.planId == abilityDayPlanCourse.planId && Intrinsics.areEqual(this.desc, abilityDayPlanCourse.desc) && Intrinsics.areEqual(this.startTime, abilityDayPlanCourse.startTime) && this.date == abilityDayPlanCourse.date && Intrinsics.areEqual(this.sportKey, abilityDayPlanCourse.sportKey) && this.from == abilityDayPlanCourse.from;
    }

    @NotNull
    public final String getCourseCode() {
        return this.courseCode;
    }

    @NotNull
    public final AbilityPlanCourseContent getCourseContent() {
        return this.courseContent;
    }

    public final long getCourseId() {
        return this.courseId;
    }

    public final long getDate() {
        return this.date;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getFrom() {
        return this.from;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final long getPlanId() {
        return this.planId;
    }

    @Nullable
    public final SportKey getSportKey() {
        return this.sportKey;
    }

    @Nullable
    public final Integer getStartTime() {
        return this.startTime;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.name.hashCode() * 31) + Long.hashCode(this.courseId)) * 31) + Integer.hashCode(this.type)) * 31) + Integer.hashCode(this.duration)) * 31) + Integer.hashCode(this.status)) * 31) + this.courseContent.hashCode()) * 31) + this.courseCode.hashCode()) * 31) + Long.hashCode(this.planId)) * 31;
        String str = this.desc;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.startTime;
        int iHashCode3 = (((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + Long.hashCode(this.date)) * 31;
        SportKey sportKey = this.sportKey;
        return ((iHashCode3 + (sportKey != null ? sportKey.hashCode() : 0)) * 31) + Integer.hashCode(this.from);
    }

    public final void setDate(long j) {
        this.date = j;
    }

    public final void setPlanId(long j) {
        this.planId = j;
    }

    public final void setSportKey(@Nullable SportKey sportKey) {
        this.sportKey = sportKey;
    }

    public final void setStartTime(@Nullable Integer num) {
        this.startTime = num;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    @NotNull
    public String toString() {
        return "AbilityDayPlanCourse(name=" + this.name + ", courseId=" + this.courseId + ", type=" + this.type + ", duration=" + this.duration + ", status=" + this.status + ", courseContent=" + this.courseContent + ", courseCode=" + this.courseCode + ", planId=" + this.planId + ", desc=" + this.desc + ", startTime=" + this.startTime + ", date=" + this.date + ", sportKey=" + this.sportKey + ", from=" + this.from + ")";
    }

    public /* synthetic */ AbilityDayPlanCourse(String str, long j, int i, int i2, int i3, AbilityPlanCourseContent abilityPlanCourseContent, String str2, long j2, String str3, Integer num, long j3, SportKey sportKey, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, i, i2, i3, abilityPlanCourseContent, (i5 & 64) != 0 ? "" : str2, (i5 & 128) != 0 ? 0L : j2, (i5 & 256) != 0 ? null : str3, num, (i5 & 1024) != 0 ? 0L : j3, (i5 & 2048) != 0 ? null : sportKey, (i5 & 4096) != 0 ? 0 : i4);
    }
}
