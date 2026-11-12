package com.xiaomi.fitness.habit.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/habit/bean/CalendarReminderEvent;", "", "title", "", "des", "startTime", "", "endTime", "rule", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDes", "getStartTime", "()J", "getEndTime", "getRule", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CalendarReminderEvent {

    @NotNull
    private final String des;
    private final long endTime;

    @NotNull
    private final String rule;
    private final long startTime;

    @NotNull
    private final String title;

    public CalendarReminderEvent(@NotNull String title, @NotNull String des, long j, long j2, @NotNull String rule) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(des, "des");
        Intrinsics.checkNotNullParameter(rule, "rule");
        this.title = title;
        this.des = des;
        this.startTime = j;
        this.endTime = j2;
        this.rule = rule;
    }

    public static /* synthetic */ CalendarReminderEvent copy$default(CalendarReminderEvent calendarReminderEvent, String str, String str2, long j, long j2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = calendarReminderEvent.title;
        }
        if ((i & 2) != 0) {
            str2 = calendarReminderEvent.des;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            j = calendarReminderEvent.startTime;
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = calendarReminderEvent.endTime;
        }
        long j4 = j2;
        if ((i & 16) != 0) {
            str3 = calendarReminderEvent.rule;
        }
        return calendarReminderEvent.copy(str, str4, j3, j4, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDes() {
        return this.des;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRule() {
        return this.rule;
    }

    @NotNull
    public final CalendarReminderEvent copy(@NotNull String title, @NotNull String des, long startTime, long endTime, @NotNull String rule) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(des, "des");
        Intrinsics.checkNotNullParameter(rule, "rule");
        return new CalendarReminderEvent(title, des, startTime, endTime, rule);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalendarReminderEvent)) {
            return false;
        }
        CalendarReminderEvent calendarReminderEvent = (CalendarReminderEvent) other;
        return Intrinsics.areEqual(this.title, calendarReminderEvent.title) && Intrinsics.areEqual(this.des, calendarReminderEvent.des) && this.startTime == calendarReminderEvent.startTime && this.endTime == calendarReminderEvent.endTime && Intrinsics.areEqual(this.rule, calendarReminderEvent.rule);
    }

    @NotNull
    public final String getDes() {
        return this.des;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final String getRule() {
        return this.rule;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((this.title.hashCode() * 31) + this.des.hashCode()) * 31) + Long.hashCode(this.startTime)) * 31) + Long.hashCode(this.endTime)) * 31) + this.rule.hashCode();
    }

    @NotNull
    public String toString() {
        return "CalendarReminderEvent(title=" + this.title + ", des=" + this.des + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", rule=" + this.rule + ")";
    }
}
