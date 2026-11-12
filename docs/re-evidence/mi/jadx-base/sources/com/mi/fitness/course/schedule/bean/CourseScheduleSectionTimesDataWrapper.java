package com.mi.fitness.course.schedule.bean;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/mi/fitness/course/schedule/bean/CourseScheduleSectionTimesDataWrapper;", "", "startHour", "", "startMinute", "endHour", "endMinute", "<init>", "(IIII)V", "getStartHour", "()I", "getStartMinute", "getEndHour", "getEndMinute", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "course-schedule_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CourseScheduleSectionTimesDataWrapper {
    private final int endHour;
    private final int endMinute;
    private final int startHour;
    private final int startMinute;

    public CourseScheduleSectionTimesDataWrapper(int i, int i2, int i3, int i4) {
        this.startHour = i;
        this.startMinute = i2;
        this.endHour = i3;
        this.endMinute = i4;
    }

    public static /* synthetic */ CourseScheduleSectionTimesDataWrapper copy$default(CourseScheduleSectionTimesDataWrapper courseScheduleSectionTimesDataWrapper, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = courseScheduleSectionTimesDataWrapper.startHour;
        }
        if ((i5 & 2) != 0) {
            i2 = courseScheduleSectionTimesDataWrapper.startMinute;
        }
        if ((i5 & 4) != 0) {
            i3 = courseScheduleSectionTimesDataWrapper.endHour;
        }
        if ((i5 & 8) != 0) {
            i4 = courseScheduleSectionTimesDataWrapper.endMinute;
        }
        return courseScheduleSectionTimesDataWrapper.copy(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStartHour() {
        return this.startHour;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStartMinute() {
        return this.startMinute;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getEndHour() {
        return this.endHour;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getEndMinute() {
        return this.endMinute;
    }

    @NotNull
    public final CourseScheduleSectionTimesDataWrapper copy(int startHour, int startMinute, int endHour, int endMinute) {
        return new CourseScheduleSectionTimesDataWrapper(startHour, startMinute, endHour, endMinute);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CourseScheduleSectionTimesDataWrapper)) {
            return false;
        }
        CourseScheduleSectionTimesDataWrapper courseScheduleSectionTimesDataWrapper = (CourseScheduleSectionTimesDataWrapper) other;
        return this.startHour == courseScheduleSectionTimesDataWrapper.startHour && this.startMinute == courseScheduleSectionTimesDataWrapper.startMinute && this.endHour == courseScheduleSectionTimesDataWrapper.endHour && this.endMinute == courseScheduleSectionTimesDataWrapper.endMinute;
    }

    public final int getEndHour() {
        return this.endHour;
    }

    public final int getEndMinute() {
        return this.endMinute;
    }

    public final int getStartHour() {
        return this.startHour;
    }

    public final int getStartMinute() {
        return this.startMinute;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.startHour) * 31) + Integer.hashCode(this.startMinute)) * 31) + Integer.hashCode(this.endHour)) * 31) + Integer.hashCode(this.endMinute);
    }

    @NotNull
    public String toString() {
        return "CourseScheduleSectionTimesDataWrapper(startHour=" + this.startHour + ", startMinute=" + this.startMinute + ", endHour=" + this.endHour + ", endMinute=" + this.endMinute + ")";
    }
}
