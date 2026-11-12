package com.mi.fitness.course.schedule.bean;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\t\u0010%\u001a\u00020\u000fHÆ\u0003JW\u0010&\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010'\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0006HÖ\u0001J\t\u0010*\u001a\u00020\u000bHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006+"}, d2 = {"Lcom/mi/fitness/course/schedule/bean/CourseScheduleDefaultResult;", "", "courses", "", "Lcom/mi/fitness/course/schedule/bean/CourseScheduleData;", "current", "", "id", "", "level", "name", "", "setLevel", "", "setting", "Lcom/mi/fitness/course/schedule/bean/CourseScheduleSettingData;", "<init>", "(Ljava/util/List;IJILjava/lang/String;ZLcom/mi/fitness/course/schedule/bean/CourseScheduleSettingData;)V", "getCourses", "()Ljava/util/List;", "getCurrent", "()I", "getId", "()J", "getLevel", "getName", "()Ljava/lang/String;", "getSetLevel", "()Z", "getSetting", "()Lcom/mi/fitness/course/schedule/bean/CourseScheduleSettingData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "course-schedule_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CourseScheduleDefaultResult {

    @NotNull
    private final List<CourseScheduleData> courses;
    private final int current;
    private final long id;
    private final int level;

    @NotNull
    private final String name;
    private final boolean setLevel;

    @NotNull
    private final CourseScheduleSettingData setting;

    public CourseScheduleDefaultResult(@NotNull List<CourseScheduleData> courses, int i, long j, int i2, @NotNull String name, boolean z, @NotNull CourseScheduleSettingData setting) {
        Intrinsics.checkNotNullParameter(courses, "courses");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(setting, "setting");
        this.courses = courses;
        this.current = i;
        this.id = j;
        this.level = i2;
        this.name = name;
        this.setLevel = z;
        this.setting = setting;
    }

    @NotNull
    public final List<CourseScheduleData> component1() {
        return this.courses;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCurrent() {
        return this.current;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getSetLevel() {
        return this.setLevel;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final CourseScheduleSettingData getSetting() {
        return this.setting;
    }

    @NotNull
    public final CourseScheduleDefaultResult copy(@NotNull List<CourseScheduleData> courses, int current, long id, int level, @NotNull String name, boolean setLevel, @NotNull CourseScheduleSettingData setting) {
        Intrinsics.checkNotNullParameter(courses, "courses");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(setting, "setting");
        return new CourseScheduleDefaultResult(courses, current, id, level, name, setLevel, setting);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CourseScheduleDefaultResult)) {
            return false;
        }
        CourseScheduleDefaultResult courseScheduleDefaultResult = (CourseScheduleDefaultResult) other;
        return Intrinsics.areEqual(this.courses, courseScheduleDefaultResult.courses) && this.current == courseScheduleDefaultResult.current && this.id == courseScheduleDefaultResult.id && this.level == courseScheduleDefaultResult.level && Intrinsics.areEqual(this.name, courseScheduleDefaultResult.name) && this.setLevel == courseScheduleDefaultResult.setLevel && Intrinsics.areEqual(this.setting, courseScheduleDefaultResult.setting);
    }

    @NotNull
    public final List<CourseScheduleData> getCourses() {
        return this.courses;
    }

    public final int getCurrent() {
        return this.current;
    }

    public final long getId() {
        return this.id;
    }

    public final int getLevel() {
        return this.level;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean getSetLevel() {
        return this.setLevel;
    }

    @NotNull
    public final CourseScheduleSettingData getSetting() {
        return this.setting;
    }

    public int hashCode() {
        return (((((((((((this.courses.hashCode() * 31) + Integer.hashCode(this.current)) * 31) + Long.hashCode(this.id)) * 31) + Integer.hashCode(this.level)) * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.setLevel)) * 31) + this.setting.hashCode();
    }

    @NotNull
    public String toString() {
        return "CourseScheduleDefaultResult(courses=" + this.courses + ", current=" + this.current + ", id=" + this.id + ", level=" + this.level + ", name=" + this.name + ", setLevel=" + this.setLevel + ", setting=" + this.setting + ")";
    }
}
