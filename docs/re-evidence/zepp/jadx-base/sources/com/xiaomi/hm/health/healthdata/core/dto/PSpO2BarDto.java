package com.xiaomi.hm.health.healthdata.core.dto;

import defpackage.b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003J\u0017\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003JC\u0010\u000b\u001a\u00020\u00002\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R'\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R'\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/dto/PSpO2BarDto;", "", "Lkotlin/Pair;", "", "component1", "component2", "", "component3", "normalRange", "abnormalRange", "uploadTime", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "Lkotlin/Pair;", "getNormalRange", "()Lkotlin/Pair;", "b", "getAbnormalRange", "c", "J", "getUploadTime", "()J", "<init>", "(Lkotlin/Pair;Lkotlin/Pair;J)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PSpO2BarDto {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final Pair<Integer, Integer> normalRange;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final Pair<Integer, Integer> abnormalRange;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long uploadTime;

    public PSpO2BarDto(@Nullable Pair<Integer, Integer> pair, @Nullable Pair<Integer, Integer> pair2, long j) {
        this.normalRange = pair;
        this.abnormalRange = pair2;
        this.uploadTime = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PSpO2BarDto copy$default(PSpO2BarDto pSpO2BarDto, Pair pair, Pair pair2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            pair = pSpO2BarDto.normalRange;
        }
        if ((i & 2) != 0) {
            pair2 = pSpO2BarDto.abnormalRange;
        }
        if ((i & 4) != 0) {
            j = pSpO2BarDto.uploadTime;
        }
        return pSpO2BarDto.copy(pair, pair2, j);
    }

    @Nullable
    public final Pair<Integer, Integer> component1() {
        return this.normalRange;
    }

    @Nullable
    public final Pair<Integer, Integer> component2() {
        return this.abnormalRange;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getUploadTime() {
        return this.uploadTime;
    }

    @NotNull
    public final PSpO2BarDto copy(@Nullable Pair<Integer, Integer> normalRange, @Nullable Pair<Integer, Integer> abnormalRange, long uploadTime) {
        return new PSpO2BarDto(normalRange, abnormalRange, uploadTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PSpO2BarDto)) {
            return false;
        }
        PSpO2BarDto pSpO2BarDto = (PSpO2BarDto) other;
        return Intrinsics.areEqual(this.normalRange, pSpO2BarDto.normalRange) && Intrinsics.areEqual(this.abnormalRange, pSpO2BarDto.abnormalRange) && this.uploadTime == pSpO2BarDto.uploadTime;
    }

    @Nullable
    public final Pair<Integer, Integer> getAbnormalRange() {
        return this.abnormalRange;
    }

    @Nullable
    public final Pair<Integer, Integer> getNormalRange() {
        return this.normalRange;
    }

    public final long getUploadTime() {
        return this.uploadTime;
    }

    public int hashCode() {
        Pair<Integer, Integer> pair = this.normalRange;
        int iHashCode = (pair == null ? 0 : pair.hashCode()) * 31;
        Pair<Integer, Integer> pair2 = this.abnormalRange;
        return ((iHashCode + (pair2 != null ? pair2.hashCode() : 0)) * 31) + b.a(this.uploadTime);
    }

    @NotNull
    public String toString() {
        return "PSpO2BarDto(normalRange=" + this.normalRange + ", abnormalRange=" + this.abnormalRange + ", uploadTime=" + this.uploadTime + ")";
    }
}
