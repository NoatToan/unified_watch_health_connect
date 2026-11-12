package com.huami.heartrate.dto;

import defpackage.b;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/heartrate/dto/BarDto;", "", "", "component1", "", "component2", "heartRange", "timeStamp", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "[I", "getHeartRange", "()[I", "b", "J", "getTimeStamp", "()J", "<init>", "([IJ)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BarDto {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final int[] heartRange;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long timeStamp;

    public BarDto(@Nullable int[] iArr, long j) {
        this.heartRange = iArr;
        this.timeStamp = j;
    }

    public static /* synthetic */ BarDto copy$default(BarDto barDto, int[] iArr, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            iArr = barDto.heartRange;
        }
        if ((i & 2) != 0) {
            j = barDto.timeStamp;
        }
        return barDto.copy(iArr, j);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int[] getHeartRange() {
        return this.heartRange;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    @NotNull
    public final BarDto copy(@Nullable int[] heartRange, long timeStamp) {
        return new BarDto(heartRange, timeStamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarDto)) {
            return false;
        }
        BarDto barDto = (BarDto) other;
        return Intrinsics.areEqual(this.heartRange, barDto.heartRange) && this.timeStamp == barDto.timeStamp;
    }

    @Nullable
    public final int[] getHeartRange() {
        return this.heartRange;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        int[] iArr = this.heartRange;
        return ((iArr == null ? 0 : Arrays.hashCode(iArr)) * 31) + b.a(this.timeStamp);
    }

    @NotNull
    public String toString() {
        return "BarDto(heartRange=" + Arrays.toString(this.heartRange) + ", timeStamp=" + this.timeStamp + ")";
    }
}
