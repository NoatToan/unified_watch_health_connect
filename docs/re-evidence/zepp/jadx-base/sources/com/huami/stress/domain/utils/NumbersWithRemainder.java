package com.huami.stress.domain.utils;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/huami/stress/domain/utils/NumbersWithRemainder;", "", "", "component1", "", "component2", "component3", "floor", "remainder", "index", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getFloor", "()I", "setFloor", "(I)V", "b", "F", "getRemainder", "()F", "c", "getIndex", "<init>", "(IFI)V", "domain_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class NumbersWithRemainder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private int floor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final float remainder;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int index;

    public NumbersWithRemainder(int i, float f, int i2) {
        this.floor = i;
        this.remainder = f;
        this.index = i2;
    }

    public static /* synthetic */ NumbersWithRemainder copy$default(NumbersWithRemainder numbersWithRemainder, int i, float f, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = numbersWithRemainder.floor;
        }
        if ((i3 & 2) != 0) {
            f = numbersWithRemainder.remainder;
        }
        if ((i3 & 4) != 0) {
            i2 = numbersWithRemainder.index;
        }
        return numbersWithRemainder.copy(i, f, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getFloor() {
        return this.floor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getRemainder() {
        return this.remainder;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final NumbersWithRemainder copy(int floor, float remainder, int index) {
        return new NumbersWithRemainder(floor, remainder, index);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NumbersWithRemainder)) {
            return false;
        }
        NumbersWithRemainder numbersWithRemainder = (NumbersWithRemainder) other;
        return this.floor == numbersWithRemainder.floor && Intrinsics.areEqual((Object) Float.valueOf(this.remainder), (Object) Float.valueOf(numbersWithRemainder.remainder)) && this.index == numbersWithRemainder.index;
    }

    public final int getFloor() {
        return this.floor;
    }

    public final int getIndex() {
        return this.index;
    }

    public final float getRemainder() {
        return this.remainder;
    }

    public int hashCode() {
        return (((this.floor * 31) + Float.floatToIntBits(this.remainder)) * 31) + this.index;
    }

    public final void setFloor(int i) {
        this.floor = i;
    }

    @NotNull
    public String toString() {
        return "NumbersWithRemainder(floor=" + this.floor + ", remainder=" + this.remainder + ", index=" + this.index + ')';
    }
}
