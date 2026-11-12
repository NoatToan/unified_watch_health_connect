package com.xiaomi.hm.health.dataprocess;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001R\u0019\u0010\u000b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\r\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/dataprocess/SleepFluctuationData;", "", "other", "", "equals", "", "hashCode", "", "component1", "component2", "component3", "sleepStarts", "sleepDurations", "size", "copy", "", "toString", "[I", "getSleepStarts", "()[I", "getSleepDurations", LogUtil.I, "getSize", "()I", "<init>", "([I[II)V", "dataprocess_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SleepFluctuationData {
    private final int size;

    @NotNull
    private final int[] sleepDurations;

    @NotNull
    private final int[] sleepStarts;

    public SleepFluctuationData(@NotNull int[] iArr, @NotNull int[] iArr2, int i) {
        this.sleepStarts = iArr;
        this.sleepDurations = iArr2;
        this.size = i;
    }

    public static /* synthetic */ SleepFluctuationData copy$default(SleepFluctuationData sleepFluctuationData, int[] iArr, int[] iArr2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            iArr = sleepFluctuationData.sleepStarts;
        }
        if ((i2 & 2) != 0) {
            iArr2 = sleepFluctuationData.sleepDurations;
        }
        if ((i2 & 4) != 0) {
            i = sleepFluctuationData.size;
        }
        return sleepFluctuationData.copy(iArr, iArr2, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int[] getSleepStarts() {
        return this.sleepStarts;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int[] getSleepDurations() {
        return this.sleepDurations;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    @NotNull
    public final SleepFluctuationData copy(@NotNull int[] sleepStarts, @NotNull int[] sleepDurations, int size) {
        return new SleepFluctuationData(sleepStarts, sleepDurations, size);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(SleepFluctuationData.class, other == null ? null : other.getClass())) {
            return false;
        }
        Objects.requireNonNull(other, "null cannot be cast to non-null type com.xiaomi.hm.health.dataprocess.SleepFluctuationData");
        SleepFluctuationData sleepFluctuationData = (SleepFluctuationData) other;
        return Arrays.equals(this.sleepStarts, sleepFluctuationData.sleepStarts) && Arrays.equals(this.sleepDurations, sleepFluctuationData.sleepDurations);
    }

    public final int getSize() {
        return this.size;
    }

    @NotNull
    public final int[] getSleepDurations() {
        return this.sleepDurations;
    }

    @NotNull
    public final int[] getSleepStarts() {
        return this.sleepStarts;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.sleepStarts) * 31) + Arrays.hashCode(this.sleepDurations);
    }

    @NotNull
    public String toString() {
        return "SleepFluctuationData(sleepStarts=" + Arrays.toString(this.sleepStarts) + ", sleepDurations=" + Arrays.toString(this.sleepDurations) + ", size=" + this.size + ")";
    }
}
