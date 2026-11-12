package com.huami.bloodoxygen.ui.dto;

import defpackage.b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003J\u0017\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003JC\u0010\u000b\u001a\u00020\u00002\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R'\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R'\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/huami/bloodoxygen/ui/dto/BarDto;", "", "Lkotlin/Pair;", "", "component1", "component2", "", "component3", "normalRange", "abnormalRange", "timeStamp", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lkotlin/Pair;", "getNormalRange", "()Lkotlin/Pair;", "b", "getAbnormalRange", "c", "J", "getTimeStamp", "()J", "<init>", "(Lkotlin/Pair;Lkotlin/Pair;J)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BarDto {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final Pair<Float, Float> normalRange;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final Pair<Float, Float> abnormalRange;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long timeStamp;

    public BarDto(@Nullable Pair<Float, Float> pair, @Nullable Pair<Float, Float> pair2, long j) {
        this.normalRange = pair;
        this.abnormalRange = pair2;
        this.timeStamp = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BarDto copy$default(BarDto barDto, Pair pair, Pair pair2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            pair = barDto.normalRange;
        }
        if ((i & 2) != 0) {
            pair2 = barDto.abnormalRange;
        }
        if ((i & 4) != 0) {
            j = barDto.timeStamp;
        }
        return barDto.copy(pair, pair2, j);
    }

    @Nullable
    public final Pair<Float, Float> component1() {
        return this.normalRange;
    }

    @Nullable
    public final Pair<Float, Float> component2() {
        return this.abnormalRange;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    @NotNull
    public final BarDto copy(@Nullable Pair<Float, Float> normalRange, @Nullable Pair<Float, Float> abnormalRange, long timeStamp) {
        return new BarDto(normalRange, abnormalRange, timeStamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarDto)) {
            return false;
        }
        BarDto barDto = (BarDto) other;
        return Intrinsics.areEqual(this.normalRange, barDto.normalRange) && Intrinsics.areEqual(this.abnormalRange, barDto.abnormalRange) && this.timeStamp == barDto.timeStamp;
    }

    @Nullable
    public final Pair<Float, Float> getAbnormalRange() {
        return this.abnormalRange;
    }

    @Nullable
    public final Pair<Float, Float> getNormalRange() {
        return this.normalRange;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        Pair<Float, Float> pair = this.normalRange;
        int iHashCode = (pair == null ? 0 : pair.hashCode()) * 31;
        Pair<Float, Float> pair2 = this.abnormalRange;
        return ((iHashCode + (pair2 != null ? pair2.hashCode() : 0)) * 31) + b.a(this.timeStamp);
    }

    @NotNull
    public String toString() {
        return "BarDto(normalRange=" + this.normalRange + ", abnormalRange=" + this.abnormalRange + ", timeStamp=" + this.timeStamp + ")";
    }
}
