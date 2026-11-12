package com.xiaomi.fitness.health.sleep.rhythm.calendar;

import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0013J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/calendar/CalendarViewItem;", "", "rect", "Landroid/graphics/Rect;", "line", "", "row", "sumLine", "sumRow", "<init>", "(Landroid/graphics/Rect;IIII)V", "getRect", "()Landroid/graphics/Rect;", "getLine", "()I", "getRow", "getSumLine", "getSumRow", "isLastLine", "", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CalendarViewItem {
    private final int line;

    @NotNull
    private final Rect rect;
    private final int row;
    private final int sumLine;
    private final int sumRow;

    public CalendarViewItem(@NotNull Rect rect, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.rect = rect;
        this.line = i;
        this.row = i2;
        this.sumLine = i3;
        this.sumRow = i4;
    }

    public static /* synthetic */ CalendarViewItem copy$default(CalendarViewItem calendarViewItem, Rect rect, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            rect = calendarViewItem.rect;
        }
        if ((i5 & 2) != 0) {
            i = calendarViewItem.line;
        }
        int i6 = i;
        if ((i5 & 4) != 0) {
            i2 = calendarViewItem.row;
        }
        int i7 = i2;
        if ((i5 & 8) != 0) {
            i3 = calendarViewItem.sumLine;
        }
        int i8 = i3;
        if ((i5 & 16) != 0) {
            i4 = calendarViewItem.sumRow;
        }
        return calendarViewItem.copy(rect, i6, i7, i8, i4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Rect getRect() {
        return this.rect;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLine() {
        return this.line;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRow() {
        return this.row;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSumLine() {
        return this.sumLine;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSumRow() {
        return this.sumRow;
    }

    @NotNull
    public final CalendarViewItem copy(@NotNull Rect rect, int line, int row, int sumLine, int sumRow) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return new CalendarViewItem(rect, line, row, sumLine, sumRow);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalendarViewItem)) {
            return false;
        }
        CalendarViewItem calendarViewItem = (CalendarViewItem) other;
        return Intrinsics.areEqual(this.rect, calendarViewItem.rect) && this.line == calendarViewItem.line && this.row == calendarViewItem.row && this.sumLine == calendarViewItem.sumLine && this.sumRow == calendarViewItem.sumRow;
    }

    public final int getLine() {
        return this.line;
    }

    @NotNull
    public final Rect getRect() {
        return this.rect;
    }

    public final int getRow() {
        return this.row;
    }

    public final int getSumLine() {
        return this.sumLine;
    }

    public final int getSumRow() {
        return this.sumRow;
    }

    public int hashCode() {
        return (((((((this.rect.hashCode() * 31) + Integer.hashCode(this.line)) * 31) + Integer.hashCode(this.row)) * 31) + Integer.hashCode(this.sumLine)) * 31) + Integer.hashCode(this.sumRow);
    }

    public final boolean isLastLine() {
        return this.line == this.sumLine - 1;
    }

    @NotNull
    public String toString() {
        return "CalendarViewItem(rect=" + this.rect + ", line=" + this.line + ", row=" + this.row + ", sumLine=" + this.sumLine + ", sumRow=" + this.sumRow + ")";
    }
}
