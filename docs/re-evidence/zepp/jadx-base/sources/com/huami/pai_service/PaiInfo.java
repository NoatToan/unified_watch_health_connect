package com.huami.pai_service;

import androidx.annotation.Keep;
import com.xiaomi.hm.health.Constant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\u000b\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\f\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/huami/pai_service/PaiInfo;", "", "", "component1", "component2", "Lcom/huami/pai_service/PaiStatuInfo;", "component3", "", "component4", "tp", Constant.PAI_KEY_DAILY_PAI, "paiStatu", "isPredict", "copy", "", "toString", "", "hashCode", "other", "equals", "F", "getTp", "()F", "getDp", "Lcom/huami/pai_service/PaiStatuInfo;", "getPaiStatu", "()Lcom/huami/pai_service/PaiStatuInfo;", "Z", "()Z", "<init>", "(FFLcom/huami/pai_service/PaiStatuInfo;Z)V", "pai-service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PaiInfo {
    private final float dp;
    private final boolean isPredict;

    @NotNull
    private final PaiStatuInfo paiStatu;
    private final float tp;

    public PaiInfo(float f, float f2, @NotNull PaiStatuInfo paiStatuInfo, boolean z) {
        this.tp = f;
        this.dp = f2;
        this.paiStatu = paiStatuInfo;
        this.isPredict = z;
    }

    public static /* synthetic */ PaiInfo copy$default(PaiInfo paiInfo, float f, float f2, PaiStatuInfo paiStatuInfo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            f = paiInfo.tp;
        }
        if ((i & 2) != 0) {
            f2 = paiInfo.dp;
        }
        if ((i & 4) != 0) {
            paiStatuInfo = paiInfo.paiStatu;
        }
        if ((i & 8) != 0) {
            z = paiInfo.isPredict;
        }
        return paiInfo.copy(f, f2, paiStatuInfo, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getTp() {
        return this.tp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getDp() {
        return this.dp;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PaiStatuInfo getPaiStatu() {
        return this.paiStatu;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsPredict() {
        return this.isPredict;
    }

    @NotNull
    public final PaiInfo copy(float tp, float dp, @NotNull PaiStatuInfo paiStatu, boolean isPredict) {
        return new PaiInfo(tp, dp, paiStatu, isPredict);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaiInfo)) {
            return false;
        }
        PaiInfo paiInfo = (PaiInfo) other;
        return Intrinsics.areEqual((Object) Float.valueOf(this.tp), (Object) Float.valueOf(paiInfo.tp)) && Intrinsics.areEqual((Object) Float.valueOf(this.dp), (Object) Float.valueOf(paiInfo.dp)) && Intrinsics.areEqual(this.paiStatu, paiInfo.paiStatu) && this.isPredict == paiInfo.isPredict;
    }

    public final float getDp() {
        return this.dp;
    }

    @NotNull
    public final PaiStatuInfo getPaiStatu() {
        return this.paiStatu;
    }

    public final float getTp() {
        return this.tp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iFloatToIntBits = ((((Float.floatToIntBits(this.tp) * 31) + Float.floatToIntBits(this.dp)) * 31) + this.paiStatu.hashCode()) * 31;
        boolean z = this.isPredict;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iFloatToIntBits + r1;
    }

    public final boolean isPredict() {
        return this.isPredict;
    }

    @NotNull
    public String toString() {
        return "PaiInfo(tp=" + this.tp + ", dp=" + this.dp + ", paiStatu=" + this.paiStatu + ", isPredict=" + this.isPredict + ")";
    }
}
