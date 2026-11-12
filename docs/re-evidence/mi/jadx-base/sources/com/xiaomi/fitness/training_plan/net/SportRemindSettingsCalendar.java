package com.xiaomi.fitness.training_plan.net;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0007j\b\u0012\u0004\u0012\u00020\u0006`\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0007j\b\u0012\u0004\u0012\u00020\u0006`\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ2\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0007j\b\u0012\u0004\u0012\u00020\u0006`\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR(\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0007j\b\u0012\u0004\u0012\u00020\u0006`\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/training_plan/net/SportRemindSettingsCalendar;", "", "datetamp", "", "courses", "Lkotlin/collections/ArrayList;", "Lcom/xiaomi/fitness/training_plan/net/SportRemindSettingsCalendarCourse;", "Ljava/util/ArrayList;", "<init>", "(JLjava/util/ArrayList;)V", "getDatetamp", "()J", "getCourses", "()Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "component1", "component2", "copy", "(JLjava/util/ArrayList;)Lcom/xiaomi/fitness/training_plan/net/SportRemindSettingsCalendar;", "equals", "", "other", "hashCode", "", "toString", "", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SportRemindSettingsCalendar {

    @SerializedName("courses")
    @NotNull
    private final ArrayList<SportRemindSettingsCalendarCourse> courses;

    @SerializedName("datestamp")
    private final long datetamp;

    public SportRemindSettingsCalendar(long j, @NotNull ArrayList<SportRemindSettingsCalendarCourse> courses) {
        Intrinsics.checkNotNullParameter(courses, "courses");
        this.datetamp = j;
        this.courses = courses;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SportRemindSettingsCalendar copy$default(SportRemindSettingsCalendar sportRemindSettingsCalendar, long j, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            j = sportRemindSettingsCalendar.datetamp;
        }
        if ((i & 2) != 0) {
            arrayList = sportRemindSettingsCalendar.courses;
        }
        return sportRemindSettingsCalendar.copy(j, arrayList);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getDatetamp() {
        return this.datetamp;
    }

    @NotNull
    public final ArrayList<SportRemindSettingsCalendarCourse> component2() {
        return this.courses;
    }

    @NotNull
    public final SportRemindSettingsCalendar copy(long datetamp, @NotNull ArrayList<SportRemindSettingsCalendarCourse> courses) {
        Intrinsics.checkNotNullParameter(courses, "courses");
        return new SportRemindSettingsCalendar(datetamp, courses);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportRemindSettingsCalendar)) {
            return false;
        }
        SportRemindSettingsCalendar sportRemindSettingsCalendar = (SportRemindSettingsCalendar) other;
        return this.datetamp == sportRemindSettingsCalendar.datetamp && Intrinsics.areEqual(this.courses, sportRemindSettingsCalendar.courses);
    }

    @NotNull
    public final ArrayList<SportRemindSettingsCalendarCourse> getCourses() {
        return this.courses;
    }

    public final long getDatetamp() {
        return this.datetamp;
    }

    public int hashCode() {
        return (Long.hashCode(this.datetamp) * 31) + this.courses.hashCode();
    }

    @NotNull
    public String toString() {
        return "SportRemindSettingsCalendar(datetamp=" + this.datetamp + ", courses=" + this.courses + ")";
    }
}
