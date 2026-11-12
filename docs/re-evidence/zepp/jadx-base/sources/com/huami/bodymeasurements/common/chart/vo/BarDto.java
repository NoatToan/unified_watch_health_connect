package com.huami.bodymeasurements.common.chart.vo;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b%\u0010&J\u0015\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0017\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0017\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003Jo\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R%\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR'\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR%\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR'\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u0019\u0010\u000e\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/huami/bodymeasurements/common/chart/vo/BarDto;", "", "Lkotlin/Pair;", "", "component1", "component2", "component3", "component4", "Ljava/util/Date;", "component5", "highRange", "highValue", "lowRange", "lowValue", "uploadTime", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lkotlin/Pair;", "getHighRange", "()Lkotlin/Pair;", "b", "getHighValue", "c", "getLowRange", GoogleApiAvailabilityLight.a, "getLowValue", "e", "Ljava/util/Date;", "getUploadTime", "()Ljava/util/Date;", "<init>", "(Lkotlin/Pair;Lkotlin/Pair;Lkotlin/Pair;Lkotlin/Pair;Ljava/util/Date;)V", "common_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BarDto {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final Pair<Float, Float> highRange;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final Pair<Float, Float> highValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final Pair<Float, Float> lowRange;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final Pair<Float, Float> lowValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final Date uploadTime;

    public BarDto(@NotNull Pair<Float, Float> pair, @Nullable Pair<Float, Float> pair2, @NotNull Pair<Float, Float> pair3, @Nullable Pair<Float, Float> pair4, @NotNull Date date) {
        this.highRange = pair;
        this.highValue = pair2;
        this.lowRange = pair3;
        this.lowValue = pair4;
        this.uploadTime = date;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BarDto copy$default(BarDto barDto, Pair pair, Pair pair2, Pair pair3, Pair pair4, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            pair = barDto.highRange;
        }
        if ((i & 2) != 0) {
            pair2 = barDto.highValue;
        }
        Pair pair5 = pair2;
        if ((i & 4) != 0) {
            pair3 = barDto.lowRange;
        }
        Pair pair6 = pair3;
        if ((i & 8) != 0) {
            pair4 = barDto.lowValue;
        }
        Pair pair7 = pair4;
        if ((i & 16) != 0) {
            date = barDto.uploadTime;
        }
        return barDto.copy(pair, pair5, pair6, pair7, date);
    }

    @NotNull
    public final Pair<Float, Float> component1() {
        return this.highRange;
    }

    @Nullable
    public final Pair<Float, Float> component2() {
        return this.highValue;
    }

    @NotNull
    public final Pair<Float, Float> component3() {
        return this.lowRange;
    }

    @Nullable
    public final Pair<Float, Float> component4() {
        return this.lowValue;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getUploadTime() {
        return this.uploadTime;
    }

    @NotNull
    public final BarDto copy(@NotNull Pair<Float, Float> highRange, @Nullable Pair<Float, Float> highValue, @NotNull Pair<Float, Float> lowRange, @Nullable Pair<Float, Float> lowValue, @NotNull Date uploadTime) {
        return new BarDto(highRange, highValue, lowRange, lowValue, uploadTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarDto)) {
            return false;
        }
        BarDto barDto = (BarDto) other;
        return Intrinsics.areEqual(this.highRange, barDto.highRange) && Intrinsics.areEqual(this.highValue, barDto.highValue) && Intrinsics.areEqual(this.lowRange, barDto.lowRange) && Intrinsics.areEqual(this.lowValue, barDto.lowValue) && Intrinsics.areEqual(this.uploadTime, barDto.uploadTime);
    }

    @NotNull
    public final Pair<Float, Float> getHighRange() {
        return this.highRange;
    }

    @Nullable
    public final Pair<Float, Float> getHighValue() {
        return this.highValue;
    }

    @NotNull
    public final Pair<Float, Float> getLowRange() {
        return this.lowRange;
    }

    @Nullable
    public final Pair<Float, Float> getLowValue() {
        return this.lowValue;
    }

    @NotNull
    public final Date getUploadTime() {
        return this.uploadTime;
    }

    public int hashCode() {
        int iHashCode = this.highRange.hashCode() * 31;
        Pair<Float, Float> pair = this.highValue;
        int iHashCode2 = (((iHashCode + (pair == null ? 0 : pair.hashCode())) * 31) + this.lowRange.hashCode()) * 31;
        Pair<Float, Float> pair2 = this.lowValue;
        return ((iHashCode2 + (pair2 != null ? pair2.hashCode() : 0)) * 31) + this.uploadTime.hashCode();
    }

    @NotNull
    public String toString() {
        return "BarDto(highRange=" + this.highRange + ", highValue=" + this.highValue + ", lowRange=" + this.lowRange + ", lowValue=" + this.lowValue + ", uploadTime=" + this.uploadTime + ')';
    }
}
