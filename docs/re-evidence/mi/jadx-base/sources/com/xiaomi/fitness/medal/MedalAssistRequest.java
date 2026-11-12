package com.xiaomi.fitness.medal;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/medal/MedalAssistRequest;", "", "medalType", "", "data", "Lcom/xiaomi/fitness/medal/MedalAssistFaceDownload;", "<init>", "(ILcom/xiaomi/fitness/medal/MedalAssistFaceDownload;)V", "getMedalType", "()I", "getData", "()Lcom/xiaomi/fitness/medal/MedalAssistFaceDownload;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MedalAssistRequest {

    @NotNull
    private final MedalAssistFaceDownload data;
    private final int medalType;

    public MedalAssistRequest(int i, @NotNull MedalAssistFaceDownload data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.medalType = i;
        this.data = data;
    }

    public static /* synthetic */ MedalAssistRequest copy$default(MedalAssistRequest medalAssistRequest, int i, MedalAssistFaceDownload medalAssistFaceDownload, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = medalAssistRequest.medalType;
        }
        if ((i2 & 2) != 0) {
            medalAssistFaceDownload = medalAssistRequest.data;
        }
        return medalAssistRequest.copy(i, medalAssistFaceDownload);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMedalType() {
        return this.medalType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MedalAssistFaceDownload getData() {
        return this.data;
    }

    @NotNull
    public final MedalAssistRequest copy(int medalType, @NotNull MedalAssistFaceDownload data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new MedalAssistRequest(medalType, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MedalAssistRequest)) {
            return false;
        }
        MedalAssistRequest medalAssistRequest = (MedalAssistRequest) other;
        return this.medalType == medalAssistRequest.medalType && Intrinsics.areEqual(this.data, medalAssistRequest.data);
    }

    @NotNull
    public final MedalAssistFaceDownload getData() {
        return this.data;
    }

    public final int getMedalType() {
        return this.medalType;
    }

    public int hashCode() {
        return (Integer.hashCode(this.medalType) * 31) + this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "MedalAssistRequest(medalType=" + this.medalType + ", data=" + this.data + ")";
    }
}
