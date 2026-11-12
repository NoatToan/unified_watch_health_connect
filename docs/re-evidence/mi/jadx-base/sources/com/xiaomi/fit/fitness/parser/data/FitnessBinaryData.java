package com.xiaomi.fit.fitness.parser.data;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", "", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "dataValid", "", "bodyData", "<init>", "(Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;[B[B)V", "getDataId", "()Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "getDataValid", "()[B", "getBodyData", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FitnessBinaryData {

    @NotNull
    private final byte[] bodyData;

    @NotNull
    private final FitnessDataId dataId;

    @Nullable
    private final byte[] dataValid;

    public FitnessBinaryData(@NotNull FitnessDataId dataId, @Nullable byte[] bArr, @NotNull byte[] bodyData) {
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(bodyData, "bodyData");
        this.dataId = dataId;
        this.dataValid = bArr;
        this.bodyData = bodyData;
    }

    public static /* synthetic */ FitnessBinaryData copy$default(FitnessBinaryData fitnessBinaryData, FitnessDataId fitnessDataId, byte[] bArr, byte[] bArr2, int i, Object obj) {
        if ((i & 1) != 0) {
            fitnessDataId = fitnessBinaryData.dataId;
        }
        if ((i & 2) != 0) {
            bArr = fitnessBinaryData.dataValid;
        }
        if ((i & 4) != 0) {
            bArr2 = fitnessBinaryData.bodyData;
        }
        return fitnessBinaryData.copy(fitnessDataId, bArr, bArr2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FitnessDataId getDataId() {
        return this.dataId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte[] getDataValid() {
        return this.dataValid;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final byte[] getBodyData() {
        return this.bodyData;
    }

    @NotNull
    public final FitnessBinaryData copy(@NotNull FitnessDataId dataId, @Nullable byte[] dataValid, @NotNull byte[] bodyData) {
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(bodyData, "bodyData");
        return new FitnessBinaryData(dataId, dataValid, bodyData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FitnessBinaryData)) {
            return false;
        }
        FitnessBinaryData fitnessBinaryData = (FitnessBinaryData) other;
        return Intrinsics.areEqual(this.dataId, fitnessBinaryData.dataId) && Intrinsics.areEqual(this.dataValid, fitnessBinaryData.dataValid) && Intrinsics.areEqual(this.bodyData, fitnessBinaryData.bodyData);
    }

    @NotNull
    public final byte[] getBodyData() {
        return this.bodyData;
    }

    @NotNull
    public final FitnessDataId getDataId() {
        return this.dataId;
    }

    @Nullable
    public final byte[] getDataValid() {
        return this.dataValid;
    }

    public int hashCode() {
        int iHashCode = this.dataId.hashCode() * 31;
        byte[] bArr = this.dataValid;
        return ((iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31) + Arrays.hashCode(this.bodyData);
    }

    @NotNull
    public String toString() {
        return "FitnessBinaryData(dataId=" + this.dataId + ", dataValid=" + Arrays.toString(this.dataValid) + ", bodyData=" + Arrays.toString(this.bodyData) + ")";
    }
}
