package com.app.calorie.service;

import com.baidu.ocr.sdk.utils.LogUtil;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/app/calorie/service/CalorieEntry;", "", "", "component1", "", "component2", "", "component3", "time", "calorie", "activityConsumeRatio", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "J", "getTime", "()J", "b", LogUtil.I, "getCalorie", "()I", "c", "F", "getActivityConsumeRatio", "()F", "<init>", "(JIF)V", "calorie-service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CalorieEntry {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long time;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int calorie;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final float activityConsumeRatio;

    public CalorieEntry(long j, int i, float f) {
        this.time = j;
        this.calorie = i;
        this.activityConsumeRatio = f;
    }

    public static /* synthetic */ CalorieEntry copy$default(CalorieEntry calorieEntry, long j, int i, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = calorieEntry.time;
        }
        if ((i2 & 2) != 0) {
            i = calorieEntry.calorie;
        }
        if ((i2 & 4) != 0) {
            f = calorieEntry.activityConsumeRatio;
        }
        return calorieEntry.copy(j, i, f);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCalorie() {
        return this.calorie;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getActivityConsumeRatio() {
        return this.activityConsumeRatio;
    }

    @NotNull
    public final CalorieEntry copy(long time, int calorie, float activityConsumeRatio) {
        return new CalorieEntry(time, calorie, activityConsumeRatio);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalorieEntry)) {
            return false;
        }
        CalorieEntry calorieEntry = (CalorieEntry) other;
        return this.time == calorieEntry.time && this.calorie == calorieEntry.calorie && Intrinsics.areEqual((Object) Float.valueOf(this.activityConsumeRatio), (Object) Float.valueOf(calorieEntry.activityConsumeRatio));
    }

    public final float getActivityConsumeRatio() {
        return this.activityConsumeRatio;
    }

    public final int getCalorie() {
        return this.calorie;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((b.a(this.time) * 31) + this.calorie) * 31) + Float.floatToIntBits(this.activityConsumeRatio);
    }

    @NotNull
    public String toString() {
        return "CalorieEntry(time=" + this.time + ", calorie=" + this.calorie + ", activityConsumeRatio=" + this.activityConsumeRatio + ')';
    }
}
