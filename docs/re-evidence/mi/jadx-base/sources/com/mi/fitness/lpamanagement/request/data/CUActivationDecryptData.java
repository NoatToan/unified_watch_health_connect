package com.mi.fitness.lpamanagement.request.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/mi/fitness/lpamanagement/request/data/CUActivationDecryptData;", "", "activationCode", "", "timeTemp", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getActivationCode", "()Ljava/lang/String;", "getTimeTemp", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CUActivationDecryptData {

    @NotNull
    private final String activationCode;

    @NotNull
    private final String timeTemp;

    public CUActivationDecryptData(@NotNull String activationCode, @NotNull String timeTemp) {
        Intrinsics.checkNotNullParameter(activationCode, "activationCode");
        Intrinsics.checkNotNullParameter(timeTemp, "timeTemp");
        this.activationCode = activationCode;
        this.timeTemp = timeTemp;
    }

    public static /* synthetic */ CUActivationDecryptData copy$default(CUActivationDecryptData cUActivationDecryptData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cUActivationDecryptData.activationCode;
        }
        if ((i & 2) != 0) {
            str2 = cUActivationDecryptData.timeTemp;
        }
        return cUActivationDecryptData.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getActivationCode() {
        return this.activationCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTimeTemp() {
        return this.timeTemp;
    }

    @NotNull
    public final CUActivationDecryptData copy(@NotNull String activationCode, @NotNull String timeTemp) {
        Intrinsics.checkNotNullParameter(activationCode, "activationCode");
        Intrinsics.checkNotNullParameter(timeTemp, "timeTemp");
        return new CUActivationDecryptData(activationCode, timeTemp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CUActivationDecryptData)) {
            return false;
        }
        CUActivationDecryptData cUActivationDecryptData = (CUActivationDecryptData) other;
        return Intrinsics.areEqual(this.activationCode, cUActivationDecryptData.activationCode) && Intrinsics.areEqual(this.timeTemp, cUActivationDecryptData.timeTemp);
    }

    @NotNull
    public final String getActivationCode() {
        return this.activationCode;
    }

    @NotNull
    public final String getTimeTemp() {
        return this.timeTemp;
    }

    public int hashCode() {
        return (this.activationCode.hashCode() * 31) + this.timeTemp.hashCode();
    }

    @NotNull
    public String toString() {
        return "CUActivationDecryptData(activationCode=" + this.activationCode + ", timeTemp=" + this.timeTemp + ")";
    }
}
