package com.mi.fitness.course.schedule.bean;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/mi/fitness/course/schedule/bean/CourseScheduleSectionTimesData;", "", "i", "", "s", "", PluginDeviceInfo.FICONOFFLINE, "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getI", "()I", "getS", "()Ljava/lang/String;", "getE", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "course-schedule_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CourseScheduleSectionTimesData {

    @NotNull
    private final String e;
    private final int i;

    @NotNull
    private final String s;

    public CourseScheduleSectionTimesData(int i, @NotNull String s, @NotNull String e) {
        Intrinsics.checkNotNullParameter(s, "s");
        Intrinsics.checkNotNullParameter(e, "e");
        this.i = i;
        this.s = s;
        this.e = e;
    }

    public static /* synthetic */ CourseScheduleSectionTimesData copy$default(CourseScheduleSectionTimesData courseScheduleSectionTimesData, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = courseScheduleSectionTimesData.i;
        }
        if ((i2 & 2) != 0) {
            str = courseScheduleSectionTimesData.s;
        }
        if ((i2 & 4) != 0) {
            str2 = courseScheduleSectionTimesData.e;
        }
        return courseScheduleSectionTimesData.copy(i, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getI() {
        return this.i;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getS() {
        return this.s;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getE() {
        return this.e;
    }

    @NotNull
    public final CourseScheduleSectionTimesData copy(int i, @NotNull String s, @NotNull String e) {
        Intrinsics.checkNotNullParameter(s, "s");
        Intrinsics.checkNotNullParameter(e, "e");
        return new CourseScheduleSectionTimesData(i, s, e);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CourseScheduleSectionTimesData)) {
            return false;
        }
        CourseScheduleSectionTimesData courseScheduleSectionTimesData = (CourseScheduleSectionTimesData) other;
        return this.i == courseScheduleSectionTimesData.i && Intrinsics.areEqual(this.s, courseScheduleSectionTimesData.s) && Intrinsics.areEqual(this.e, courseScheduleSectionTimesData.e);
    }

    @NotNull
    public final String getE() {
        return this.e;
    }

    public final int getI() {
        return this.i;
    }

    @NotNull
    public final String getS() {
        return this.s;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.i) * 31) + this.s.hashCode()) * 31) + this.e.hashCode();
    }

    @NotNull
    public String toString() {
        return "CourseScheduleSectionTimesData(i=" + this.i + ", s=" + this.s + ", e=" + this.e + ")";
    }
}
