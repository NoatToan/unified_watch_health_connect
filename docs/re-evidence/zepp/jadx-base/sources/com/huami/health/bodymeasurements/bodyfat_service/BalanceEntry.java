package com.huami.health.bodymeasurements.bodyfat_service;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.db.entity.EcgData;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b+\u0010,J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003JE\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\nHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0014\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\r\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u000e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\u000f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0019\u0010\u0010\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0011\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/huami/health/bodymeasurements/bodyfat_service/BalanceEntry;", "", "", "component1", "", "component2", "component3", "component4", "", "component5", "", "component6", EcgData.TIMESTAMP_SERVER_UPDATED, "balanceKeepTime", "balanceKeepTimeUnit", "balanceKeepDescription", "currentBalanceState", "canAnalyze", "copy", "toString", "hashCode", "other", "equals", "a", "J", "getUpdateTime", "()J", "b", "Ljava/lang/String;", "getBalanceKeepTime", "()Ljava/lang/String;", "c", "getBalanceKeepTimeUnit", GoogleApiAvailabilityLight.a, "getBalanceKeepDescription", "e", LogUtil.I, "getCurrentBalanceState", "()I", "f", "Z", "getCanAnalyze", "()Z", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "bodyfat-service_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class BalanceEntry {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long updateTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String balanceKeepTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String balanceKeepTimeUnit;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String balanceKeepDescription;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int currentBalanceState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final boolean canAnalyze;

    public BalanceEntry(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, int i, boolean z) {
        this.updateTime = j;
        this.balanceKeepTime = str;
        this.balanceKeepTimeUnit = str2;
        this.balanceKeepDescription = str3;
        this.currentBalanceState = i;
        this.canAnalyze = z;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBalanceKeepTime() {
        return this.balanceKeepTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBalanceKeepTimeUnit() {
        return this.balanceKeepTimeUnit;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBalanceKeepDescription() {
        return this.balanceKeepDescription;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getCurrentBalanceState() {
        return this.currentBalanceState;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getCanAnalyze() {
        return this.canAnalyze;
    }

    @NotNull
    public final BalanceEntry copy(long updateTime, @NotNull String balanceKeepTime, @NotNull String balanceKeepTimeUnit, @NotNull String balanceKeepDescription, int currentBalanceState, boolean canAnalyze) {
        return new BalanceEntry(updateTime, balanceKeepTime, balanceKeepTimeUnit, balanceKeepDescription, currentBalanceState, canAnalyze);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BalanceEntry)) {
            return false;
        }
        BalanceEntry balanceEntry = (BalanceEntry) other;
        return this.updateTime == balanceEntry.updateTime && Intrinsics.areEqual(this.balanceKeepTime, balanceEntry.balanceKeepTime) && Intrinsics.areEqual(this.balanceKeepTimeUnit, balanceEntry.balanceKeepTimeUnit) && Intrinsics.areEqual(this.balanceKeepDescription, balanceEntry.balanceKeepDescription) && this.currentBalanceState == balanceEntry.currentBalanceState && this.canAnalyze == balanceEntry.canAnalyze;
    }

    @NotNull
    public final String getBalanceKeepDescription() {
        return this.balanceKeepDescription;
    }

    @NotNull
    public final String getBalanceKeepTime() {
        return this.balanceKeepTime;
    }

    @NotNull
    public final String getBalanceKeepTimeUnit() {
        return this.balanceKeepTimeUnit;
    }

    public final boolean getCanAnalyze() {
        return this.canAnalyze;
    }

    public final int getCurrentBalanceState() {
        return this.currentBalanceState;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    public int hashCode() {
        int iA = b.a(this.updateTime) * 31;
        String str = this.balanceKeepTime;
        int iHashCode = (iA + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.balanceKeepTimeUnit;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.balanceKeepDescription;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.currentBalanceState) * 31;
        boolean z = this.canAnalyze;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode3 + r1;
    }

    @NotNull
    public String toString() {
        return "BalanceEntry(updateTime=" + this.updateTime + ", balanceKeepTime=" + this.balanceKeepTime + ", balanceKeepTimeUnit=" + this.balanceKeepTimeUnit + ", balanceKeepDescription=" + this.balanceKeepDescription + ", currentBalanceState=" + this.currentBalanceState + ", canAnalyze=" + this.canAnalyze + ")";
    }
}
