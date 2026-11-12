package com.mi.fitness.course.schedule.bean;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000e\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\t\u0010/\u001a\u00020\tHÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\t0\u000eHÆ\u0003J\t\u00101\u001a\u00020\tHÆ\u0003J\t\u00102\u001a\u00020\tHÆ\u0003J\t\u00103\u001a\u00020\tHÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\tHÆ\u0003J\u009b\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\tHÆ\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\u0007HÖ\u0001J\t\u0010;\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0011\u0010\u0013\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001d¨\u0006<"}, d2 = {"Lcom/mi/fitness/course/schedule/bean/CourseScheduleData;", "", "attendTime", "", "createTime", "ctId", "day", "", "extent", "", "id", "name", "position", "sectionList", "", "sections", "style", "teacher", "updateTime", "weeks", "<init>", "(JJJILjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getAttendTime", "()J", "getCreateTime", "getCtId", "getDay", "()I", "getExtent", "()Ljava/lang/String;", "getId", "getName", "getPosition", "getSectionList", "()Ljava/util/List;", "getSections", "getStyle", "getTeacher", "getUpdateTime", "getWeeks", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "", "other", "hashCode", "toString", "course-schedule_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CourseScheduleData {
    private final long attendTime;
    private final long createTime;
    private final long ctId;
    private final int day;

    @NotNull
    private final String extent;
    private final long id;

    @NotNull
    private final String name;

    @NotNull
    private final String position;

    @NotNull
    private final List<String> sectionList;

    @NotNull
    private final String sections;

    @NotNull
    private final String style;

    @NotNull
    private final String teacher;
    private final long updateTime;

    @NotNull
    private final String weeks;

    public CourseScheduleData(long j, long j2, long j3, int i, @NotNull String extent, long j4, @NotNull String name, @NotNull String position, @NotNull List<String> sectionList, @NotNull String sections, @NotNull String style, @NotNull String teacher, long j5, @NotNull String weeks) {
        Intrinsics.checkNotNullParameter(extent, "extent");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(sectionList, "sectionList");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(teacher, "teacher");
        Intrinsics.checkNotNullParameter(weeks, "weeks");
        this.attendTime = j;
        this.createTime = j2;
        this.ctId = j3;
        this.day = i;
        this.extent = extent;
        this.id = j4;
        this.name = name;
        this.position = position;
        this.sectionList = sectionList;
        this.sections = sections;
        this.style = style;
        this.teacher = teacher;
        this.updateTime = j5;
        this.weeks = weeks;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getAttendTime() {
        return this.attendTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSections() {
        return this.sections;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTeacher() {
        return this.teacher;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getWeeks() {
        return this.weeks;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getCtId() {
        return this.ctId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDay() {
        return this.day;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getExtent() {
        return this.extent;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPosition() {
        return this.position;
    }

    @NotNull
    public final List<String> component9() {
        return this.sectionList;
    }

    @NotNull
    public final CourseScheduleData copy(long attendTime, long createTime, long ctId, int day, @NotNull String extent, long id, @NotNull String name, @NotNull String position, @NotNull List<String> sectionList, @NotNull String sections, @NotNull String style, @NotNull String teacher, long updateTime, @NotNull String weeks) {
        Intrinsics.checkNotNullParameter(extent, "extent");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(sectionList, "sectionList");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(teacher, "teacher");
        Intrinsics.checkNotNullParameter(weeks, "weeks");
        return new CourseScheduleData(attendTime, createTime, ctId, day, extent, id, name, position, sectionList, sections, style, teacher, updateTime, weeks);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CourseScheduleData)) {
            return false;
        }
        CourseScheduleData courseScheduleData = (CourseScheduleData) other;
        return this.attendTime == courseScheduleData.attendTime && this.createTime == courseScheduleData.createTime && this.ctId == courseScheduleData.ctId && this.day == courseScheduleData.day && Intrinsics.areEqual(this.extent, courseScheduleData.extent) && this.id == courseScheduleData.id && Intrinsics.areEqual(this.name, courseScheduleData.name) && Intrinsics.areEqual(this.position, courseScheduleData.position) && Intrinsics.areEqual(this.sectionList, courseScheduleData.sectionList) && Intrinsics.areEqual(this.sections, courseScheduleData.sections) && Intrinsics.areEqual(this.style, courseScheduleData.style) && Intrinsics.areEqual(this.teacher, courseScheduleData.teacher) && this.updateTime == courseScheduleData.updateTime && Intrinsics.areEqual(this.weeks, courseScheduleData.weeks);
    }

    public final long getAttendTime() {
        return this.attendTime;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final long getCtId() {
        return this.ctId;
    }

    public final int getDay() {
        return this.day;
    }

    @NotNull
    public final String getExtent() {
        return this.extent;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPosition() {
        return this.position;
    }

    @NotNull
    public final List<String> getSectionList() {
        return this.sectionList;
    }

    @NotNull
    public final String getSections() {
        return this.sections;
    }

    @NotNull
    public final String getStyle() {
        return this.style;
    }

    @NotNull
    public final String getTeacher() {
        return this.teacher;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    public final String getWeeks() {
        return this.weeks;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((Long.hashCode(this.attendTime) * 31) + Long.hashCode(this.createTime)) * 31) + Long.hashCode(this.ctId)) * 31) + Integer.hashCode(this.day)) * 31) + this.extent.hashCode()) * 31) + Long.hashCode(this.id)) * 31) + this.name.hashCode()) * 31) + this.position.hashCode()) * 31) + this.sectionList.hashCode()) * 31) + this.sections.hashCode()) * 31) + this.style.hashCode()) * 31) + this.teacher.hashCode()) * 31) + Long.hashCode(this.updateTime)) * 31) + this.weeks.hashCode();
    }

    @NotNull
    public String toString() {
        return "CourseScheduleData(attendTime=" + this.attendTime + ", createTime=" + this.createTime + ", ctId=" + this.ctId + ", day=" + this.day + ", extent=" + this.extent + ", id=" + this.id + ", name=" + this.name + ", position=" + this.position + ", sectionList=" + this.sectionList + ", sections=" + this.sections + ", style=" + this.style + ", teacher=" + this.teacher + ", updateTime=" + this.updateTime + ", weeks=" + this.weeks + ")";
    }
}
