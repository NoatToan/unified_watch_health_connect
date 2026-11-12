package com.huami.sleep.daysleep.daydetail.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/huami/sleep/daysleep/daydetail/vo/SleepCompareModel;", "", "", "component1", "component2", "component3", "count", "category", "categoryCount", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getCount", "()I", "setCount", "(I)V", "b", "getCategory", "setCategory", "c", "getCategoryCount", "setCategoryCount", "<init>", "(III)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SleepCompareModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private int count;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private int category;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private int categoryCount;

    public SleepCompareModel() {
        this(0, 0, 0, 7, null);
    }

    public SleepCompareModel(int i, int i2, int i3) {
        this.count = i;
        this.category = i2;
        this.categoryCount = i3;
    }

    public static /* synthetic */ SleepCompareModel copy$default(SleepCompareModel sleepCompareModel, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = sleepCompareModel.count;
        }
        if ((i4 & 2) != 0) {
            i2 = sleepCompareModel.category;
        }
        if ((i4 & 4) != 0) {
            i3 = sleepCompareModel.categoryCount;
        }
        return sleepCompareModel.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCategoryCount() {
        return this.categoryCount;
    }

    @NotNull
    public final SleepCompareModel copy(int count, int category, int categoryCount) {
        return new SleepCompareModel(count, category, categoryCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepCompareModel)) {
            return false;
        }
        SleepCompareModel sleepCompareModel = (SleepCompareModel) other;
        return this.count == sleepCompareModel.count && this.category == sleepCompareModel.category && this.categoryCount == sleepCompareModel.categoryCount;
    }

    public final int getCategory() {
        return this.category;
    }

    public final int getCategoryCount() {
        return this.categoryCount;
    }

    public final int getCount() {
        return this.count;
    }

    public int hashCode() {
        return (((this.count * 31) + this.category) * 31) + this.categoryCount;
    }

    public final void setCategory(int i) {
        this.category = i;
    }

    public final void setCategoryCount(int i) {
        this.categoryCount = i;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    @NotNull
    public String toString() {
        return "SleepCompareModel(count=" + this.count + ", category=" + this.category + ", categoryCount=" + this.categoryCount + ")";
    }

    public /* synthetic */ SleepCompareModel(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
