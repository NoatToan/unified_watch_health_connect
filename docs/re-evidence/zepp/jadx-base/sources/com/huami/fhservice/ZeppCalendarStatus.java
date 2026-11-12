package com.huami.fhservice;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J:\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0007¨\u0006!"}, d2 = {"Lcom/huami/fhservice/ZeppCalendarStatus;", "", "", "component1", "component2", "component3", "component4", "()Ljava/lang/Integer;", "year", "month", "day", "status", "copy", "(IIILjava/lang/Integer;)Lcom/huami/fhservice/ZeppCalendarStatus;", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getYear", "()I", "b", "getMonth", "c", "getDay", GoogleApiAvailabilityLight.a, "Ljava/lang/Integer;", "getStatus", "<init>", "(IIILjava/lang/Integer;)V", "servicelib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ZeppCalendarStatus {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int year;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int month;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int day;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer status;

    public ZeppCalendarStatus(int i, int i2, int i3, @Nullable Integer num) {
        this.year = i;
        this.month = i2;
        this.day = i3;
        this.status = num;
    }

    public static /* synthetic */ ZeppCalendarStatus copy$default(ZeppCalendarStatus zeppCalendarStatus, int i, int i2, int i3, Integer num, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = zeppCalendarStatus.year;
        }
        if ((i4 & 2) != 0) {
            i2 = zeppCalendarStatus.month;
        }
        if ((i4 & 4) != 0) {
            i3 = zeppCalendarStatus.day;
        }
        if ((i4 & 8) != 0) {
            num = zeppCalendarStatus.status;
        }
        return zeppCalendarStatus.copy(i, i2, i3, num);
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

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    @NotNull
    public final ZeppCalendarStatus copy(int year, int month, int day, @Nullable Integer status) {
        return new ZeppCalendarStatus(year, month, day, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ZeppCalendarStatus)) {
            return false;
        }
        ZeppCalendarStatus zeppCalendarStatus = (ZeppCalendarStatus) other;
        return this.year == zeppCalendarStatus.year && this.month == zeppCalendarStatus.month && this.day == zeppCalendarStatus.day && Intrinsics.areEqual(this.status, zeppCalendarStatus.status);
    }

    public final int getDay() {
        return this.day;
    }

    public final int getMonth() {
        return this.month;
    }

    @Nullable
    public final Integer getStatus() {
        return this.status;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        int i = ((((this.year * 31) + this.month) * 31) + this.day) * 31;
        Integer num = this.status;
        return i + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "ZeppCalendarStatus(year=" + this.year + ", month=" + this.month + ", day=" + this.day + ", status=" + this.status + ')';
    }
}
