package com.mi.fitness.ecg;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/mi/fitness/ecg/EcgOutputData;", "", "outputData", "", "avgHr", "", "<init>", "([FI)V", "getOutputData", "()[F", "getAvgHr", "()I", "toString", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "ecg-filter-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EcgOutputData {
    private final int avgHr;

    @NotNull
    private final float[] outputData;

    public EcgOutputData(@NotNull float[] outputData, int i) {
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        this.outputData = outputData;
        this.avgHr = i;
    }

    public static /* synthetic */ EcgOutputData copy$default(EcgOutputData ecgOutputData, float[] fArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            fArr = ecgOutputData.outputData;
        }
        if ((i2 & 2) != 0) {
            i = ecgOutputData.avgHr;
        }
        return ecgOutputData.copy(fArr, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float[] getOutputData() {
        return this.outputData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAvgHr() {
        return this.avgHr;
    }

    @NotNull
    public final EcgOutputData copy(@NotNull float[] outputData, int avgHr) {
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        return new EcgOutputData(outputData, avgHr);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcgOutputData)) {
            return false;
        }
        EcgOutputData ecgOutputData = (EcgOutputData) other;
        return Intrinsics.areEqual(this.outputData, ecgOutputData.outputData) && this.avgHr == ecgOutputData.avgHr;
    }

    public final int getAvgHr() {
        return this.avgHr;
    }

    @NotNull
    public final float[] getOutputData() {
        return this.outputData;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.outputData) * 31) + Integer.hashCode(this.avgHr);
    }

    @NotNull
    public String toString() {
        return "avgHr=" + this.avgHr + ", outputData=" + ArraysKt___ArraysKt.toList(this.outputData);
    }
}
