package com.mi.fitness.course.schedule.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b2\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\bHÆ\u0003J\t\u00103\u001a\u00020\bHÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J«\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u0003HÆ\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\u0003HÖ\u0001J\t\u0010>\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0011\u0010\u0013\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018¨\u0006?"}, d2 = {"Lcom/mi/fitness/course/schedule/bean/CourseScheduleSettingData;", "", "afternoonNum", "", "confirm", "createTime", "", "extend", "", "id", "isWeekend", "morningNum", "nightNum", "presentWeek", "school", "sectionTimes", "speak", "startSemester", "totalWeek", "updateTime", "weekStart", "<init>", "(IIJLjava/lang/String;JIIIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;IJI)V", "getAfternoonNum", "()I", "getConfirm", "getCreateTime", "()J", "getExtend", "()Ljava/lang/String;", "getId", "getMorningNum", "getNightNum", "getPresentWeek", "getSchool", "getSectionTimes", "getSpeak", "getStartSemester", "getTotalWeek", "getUpdateTime", "getWeekStart", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "", "other", "hashCode", "toString", "course-schedule_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CourseScheduleSettingData {
    private final int afternoonNum;
    private final int confirm;
    private final long createTime;

    @NotNull
    private final String extend;
    private final long id;
    private final int isWeekend;
    private final int morningNum;
    private final int nightNum;
    private final int presentWeek;

    @NotNull
    private final String school;

    @NotNull
    private final String sectionTimes;
    private final int speak;

    @Nullable
    private final String startSemester;
    private final int totalWeek;
    private final long updateTime;
    private final int weekStart;

    public CourseScheduleSettingData(int i, int i2, long j, @NotNull String extend, long j2, int i3, int i4, int i5, int i6, @NotNull String school, @NotNull String sectionTimes, int i7, @Nullable String str, int i8, long j3, int i9) {
        Intrinsics.checkNotNullParameter(extend, "extend");
        Intrinsics.checkNotNullParameter(school, "school");
        Intrinsics.checkNotNullParameter(sectionTimes, "sectionTimes");
        this.afternoonNum = i;
        this.confirm = i2;
        this.createTime = j;
        this.extend = extend;
        this.id = j2;
        this.isWeekend = i3;
        this.morningNum = i4;
        this.nightNum = i5;
        this.presentWeek = i6;
        this.school = school;
        this.sectionTimes = sectionTimes;
        this.speak = i7;
        this.startSemester = str;
        this.totalWeek = i8;
        this.updateTime = j3;
        this.weekStart = i9;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAfternoonNum() {
        return this.afternoonNum;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSchool() {
        return this.school;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSectionTimes() {
        return this.sectionTimes;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getSpeak() {
        return this.speak;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getStartSemester() {
        return this.startSemester;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getTotalWeek() {
        return this.totalWeek;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getWeekStart() {
        return this.weekStart;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getConfirm() {
        return this.confirm;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExtend() {
        return this.extend;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getIsWeekend() {
        return this.isWeekend;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getMorningNum() {
        return this.morningNum;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getNightNum() {
        return this.nightNum;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getPresentWeek() {
        return this.presentWeek;
    }

    @NotNull
    public final CourseScheduleSettingData copy(int afternoonNum, int confirm, long createTime, @NotNull String extend, long id, int isWeekend, int morningNum, int nightNum, int presentWeek, @NotNull String school, @NotNull String sectionTimes, int speak, @Nullable String startSemester, int totalWeek, long updateTime, int weekStart) {
        Intrinsics.checkNotNullParameter(extend, "extend");
        Intrinsics.checkNotNullParameter(school, "school");
        Intrinsics.checkNotNullParameter(sectionTimes, "sectionTimes");
        return new CourseScheduleSettingData(afternoonNum, confirm, createTime, extend, id, isWeekend, morningNum, nightNum, presentWeek, school, sectionTimes, speak, startSemester, totalWeek, updateTime, weekStart);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CourseScheduleSettingData)) {
            return false;
        }
        CourseScheduleSettingData courseScheduleSettingData = (CourseScheduleSettingData) other;
        return this.afternoonNum == courseScheduleSettingData.afternoonNum && this.confirm == courseScheduleSettingData.confirm && this.createTime == courseScheduleSettingData.createTime && Intrinsics.areEqual(this.extend, courseScheduleSettingData.extend) && this.id == courseScheduleSettingData.id && this.isWeekend == courseScheduleSettingData.isWeekend && this.morningNum == courseScheduleSettingData.morningNum && this.nightNum == courseScheduleSettingData.nightNum && this.presentWeek == courseScheduleSettingData.presentWeek && Intrinsics.areEqual(this.school, courseScheduleSettingData.school) && Intrinsics.areEqual(this.sectionTimes, courseScheduleSettingData.sectionTimes) && this.speak == courseScheduleSettingData.speak && Intrinsics.areEqual(this.startSemester, courseScheduleSettingData.startSemester) && this.totalWeek == courseScheduleSettingData.totalWeek && this.updateTime == courseScheduleSettingData.updateTime && this.weekStart == courseScheduleSettingData.weekStart;
    }

    public final int getAfternoonNum() {
        return this.afternoonNum;
    }

    public final int getConfirm() {
        return this.confirm;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    @NotNull
    public final String getExtend() {
        return this.extend;
    }

    public final long getId() {
        return this.id;
    }

    public final int getMorningNum() {
        return this.morningNum;
    }

    public final int getNightNum() {
        return this.nightNum;
    }

    public final int getPresentWeek() {
        return this.presentWeek;
    }

    @NotNull
    public final String getSchool() {
        return this.school;
    }

    @NotNull
    public final String getSectionTimes() {
        return this.sectionTimes;
    }

    public final int getSpeak() {
        return this.speak;
    }

    @Nullable
    public final String getStartSemester() {
        return this.startSemester;
    }

    public final int getTotalWeek() {
        return this.totalWeek;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final int getWeekStart() {
        return this.weekStart;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((Integer.hashCode(this.afternoonNum) * 31) + Integer.hashCode(this.confirm)) * 31) + Long.hashCode(this.createTime)) * 31) + this.extend.hashCode()) * 31) + Long.hashCode(this.id)) * 31) + Integer.hashCode(this.isWeekend)) * 31) + Integer.hashCode(this.morningNum)) * 31) + Integer.hashCode(this.nightNum)) * 31) + Integer.hashCode(this.presentWeek)) * 31) + this.school.hashCode()) * 31) + this.sectionTimes.hashCode()) * 31) + Integer.hashCode(this.speak)) * 31;
        String str = this.startSemester;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.totalWeek)) * 31) + Long.hashCode(this.updateTime)) * 31) + Integer.hashCode(this.weekStart);
    }

    public final int isWeekend() {
        return this.isWeekend;
    }

    @NotNull
    public String toString() {
        return "CourseScheduleSettingData(afternoonNum=" + this.afternoonNum + ", confirm=" + this.confirm + ", createTime=" + this.createTime + ", extend=" + this.extend + ", id=" + this.id + ", isWeekend=" + this.isWeekend + ", morningNum=" + this.morningNum + ", nightNum=" + this.nightNum + ", presentWeek=" + this.presentWeek + ", school=" + this.school + ", sectionTimes=" + this.sectionTimes + ", speak=" + this.speak + ", startSemester=" + this.startSemester + ", totalWeek=" + this.totalWeek + ", updateTime=" + this.updateTime + ", weekStart=" + this.weekStart + ")";
    }
}
