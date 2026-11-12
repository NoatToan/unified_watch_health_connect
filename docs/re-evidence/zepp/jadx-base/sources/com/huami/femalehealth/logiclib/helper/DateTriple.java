package com.huami.femalehealth.logiclib.helper;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.femalehealth.logiclib.calculation.AidKt;
import com.huami.passport.Configs;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u0000 %2\u00020\u0001:\u0001%B\u001f\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b!\u0010\"B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b!\u0010#B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b!\u0010$J\u0010\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002J$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bJ\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\bH\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\bJ$\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bJ\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001R\u0019\u0010\t\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\n\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\u000b\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c¨\u0006&"}, d2 = {"Lcom/huami/femalehealth/logiclib/helper/DateTriple;", "", "", "split", "toYearMonthDayString", "toYearMonthString", "toYearString", "toMonthDayString", "", "year", "month", "day", Configs.Params.RESET, "other", "", "equals", "hashCode", "toString", "offset", "offsetDay", "clone", "component1", "component2", "component3", "copy", "a", LogUtil.I, "getYear", "()I", "b", "getMonth", "c", "getDay", "<init>", "(III)V", "(I)V", "(II)V", "Companion", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DateTriple {
    public static final int UNKNOWN = -1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int year;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int month;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int day;

    public DateTriple(int i, int i2, int i3) {
        this.year = i;
        this.month = i2;
        this.day = i3;
    }

    public static /* synthetic */ DateTriple clone$default(DateTriple dateTriple, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = dateTriple.year;
        }
        if ((i4 & 2) != 0) {
            i2 = dateTriple.month;
        }
        if ((i4 & 4) != 0) {
            i3 = dateTriple.day;
        }
        return dateTriple.clone(i, i2, i3);
    }

    public static /* synthetic */ DateTriple copy$default(DateTriple dateTriple, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = dateTriple.year;
        }
        if ((i4 & 2) != 0) {
            i2 = dateTriple.month;
        }
        if ((i4 & 4) != 0) {
            i3 = dateTriple.day;
        }
        return dateTriple.copy(i, i2, i3);
    }

    public static /* synthetic */ DateTriple reset$default(DateTriple dateTriple, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = dateTriple.year;
        }
        if ((i4 & 2) != 0) {
            i2 = dateTriple.month;
        }
        if ((i4 & 4) != 0) {
            i3 = dateTriple.day;
        }
        return dateTriple.reset(i, i2, i3);
    }

    public static /* synthetic */ String toMonthDayString$default(DateTriple dateTriple, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        }
        return dateTriple.toMonthDayString(str);
    }

    public static /* synthetic */ String toYearMonthDayString$default(DateTriple dateTriple, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        }
        return dateTriple.toYearMonthDayString(str);
    }

    public static /* synthetic */ String toYearMonthString$default(DateTriple dateTriple, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        }
        return dateTriple.toYearMonthString(str);
    }

    @NotNull
    public final DateTriple clone(int year, int month, int day) {
        return new DateTriple(year, month, day);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMonth() {
        return this.month;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDay() {
        return this.day;
    }

    @NotNull
    public final DateTriple copy(int year, int month, int day) {
        return new DateTriple(year, month, day);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(DateTriple.class, other == null ? null : other.getClass())) {
            return false;
        }
        Objects.requireNonNull(other, "null cannot be cast to non-null type com.huami.femalehealth.logiclib.helper.DateTriple");
        DateTriple dateTriple = (DateTriple) other;
        return this.year == dateTriple.year && this.month == dateTriple.month && this.day == dateTriple.day;
    }

    public final int getDay() {
        return this.day;
    }

    public final int getMonth() {
        return this.month;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        return (((this.year * 31) + this.month) * 31) + this.day;
    }

    @NotNull
    public final DateTriple offsetDay(int offset) {
        return DateHelper.INSTANCE.offsetDay(offset, AidKt.toMilli(this).getValue());
    }

    @NotNull
    public final DateTriple reset(int year, int month, int day) {
        return new DateTriple(year, month, day);
    }

    @NotNull
    public final String toMonthDayString(@NotNull String split) {
        return this.month + split + this.day;
    }

    @NotNull
    public String toString() {
        return Intrinsics.stringPlus("DateTriple -> ", toYearMonthDayString$default(this, null, 1, null));
    }

    @NotNull
    public final String toYearMonthDayString(@NotNull String split) {
        return this.year + split + this.month + split + this.day;
    }

    @NotNull
    public final String toYearMonthString(@NotNull String split) {
        return this.year + split + this.month;
    }

    @NotNull
    public final String toYearString() {
        return String.valueOf(this.year);
    }

    public DateTriple(int i) {
        this(i, -1);
    }

    public DateTriple(int i, int i2) {
        this(i, i2, -1);
    }
}
