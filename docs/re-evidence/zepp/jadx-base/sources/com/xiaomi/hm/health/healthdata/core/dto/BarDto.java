package com.xiaomi.hm.health.healthdata.core.dto;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.b;
import java.lang.Number;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003Bc\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b&\u0010'J\u0015\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u0017\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u0017\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003Ju\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u00042\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u00042\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\tHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÖ\u0003R%\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR'\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR%\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR'\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u0019\u0010\u000f\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/dto/BarDto;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/Pair;", "component1", "component2", "component3", "component4", "", "component5", "highRange", "highValue", "lowRange", "lowValue", "uploadTime", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lkotlin/Pair;", "getHighRange", "()Lkotlin/Pair;", "b", "getHighValue", "c", "getLowRange", GoogleApiAvailabilityLight.a, "getLowValue", "e", "J", "getUploadTime", "()J", "<init>", "(Lkotlin/Pair;Lkotlin/Pair;Lkotlin/Pair;Lkotlin/Pair;J)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BarDto<T extends Number> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final Pair<T, T> highRange;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final Pair<T, T> highValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final Pair<T, T> lowRange;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final Pair<T, T> lowValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final long uploadTime;

    /* JADX WARN: Multi-variable type inference failed */
    public BarDto(@NotNull Pair<? extends T, ? extends T> pair, @Nullable Pair<? extends T, ? extends T> pair2, @NotNull Pair<? extends T, ? extends T> pair3, @Nullable Pair<? extends T, ? extends T> pair4, long j) {
        this.highRange = pair;
        this.highValue = pair2;
        this.lowRange = pair3;
        this.lowValue = pair4;
        this.uploadTime = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BarDto copy$default(BarDto barDto, Pair pair, Pair pair2, Pair pair3, Pair pair4, long j, int i, Object obj) {
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
            j = barDto.uploadTime;
        }
        return barDto.copy(pair, pair5, pair6, pair7, j);
    }

    @NotNull
    public final Pair<T, T> component1() {
        return this.highRange;
    }

    @Nullable
    public final Pair<T, T> component2() {
        return this.highValue;
    }

    @NotNull
    public final Pair<T, T> component3() {
        return this.lowRange;
    }

    @Nullable
    public final Pair<T, T> component4() {
        return this.lowValue;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getUploadTime() {
        return this.uploadTime;
    }

    @NotNull
    public final BarDto<T> copy(@NotNull Pair<? extends T, ? extends T> highRange, @Nullable Pair<? extends T, ? extends T> highValue, @NotNull Pair<? extends T, ? extends T> lowRange, @Nullable Pair<? extends T, ? extends T> lowValue, long uploadTime) {
        return new BarDto<>(highRange, highValue, lowRange, lowValue, uploadTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarDto)) {
            return false;
        }
        BarDto barDto = (BarDto) other;
        return Intrinsics.areEqual(this.highRange, barDto.highRange) && Intrinsics.areEqual(this.highValue, barDto.highValue) && Intrinsics.areEqual(this.lowRange, barDto.lowRange) && Intrinsics.areEqual(this.lowValue, barDto.lowValue) && this.uploadTime == barDto.uploadTime;
    }

    @NotNull
    public final Pair<T, T> getHighRange() {
        return this.highRange;
    }

    @Nullable
    public final Pair<T, T> getHighValue() {
        return this.highValue;
    }

    @NotNull
    public final Pair<T, T> getLowRange() {
        return this.lowRange;
    }

    @Nullable
    public final Pair<T, T> getLowValue() {
        return this.lowValue;
    }

    public final long getUploadTime() {
        return this.uploadTime;
    }

    public int hashCode() {
        int iHashCode = this.highRange.hashCode() * 31;
        Pair<T, T> pair = this.highValue;
        int iHashCode2 = (((iHashCode + (pair == null ? 0 : pair.hashCode())) * 31) + this.lowRange.hashCode()) * 31;
        Pair<T, T> pair2 = this.lowValue;
        return ((iHashCode2 + (pair2 != null ? pair2.hashCode() : 0)) * 31) + b.a(this.uploadTime);
    }

    @NotNull
    public String toString() {
        return "BarDto(highRange=" + this.highRange + ", highValue=" + this.highValue + ", lowRange=" + this.lowRange + ", lowValue=" + this.lowValue + ", uploadTime=" + this.uploadTime + ")";
    }
}
