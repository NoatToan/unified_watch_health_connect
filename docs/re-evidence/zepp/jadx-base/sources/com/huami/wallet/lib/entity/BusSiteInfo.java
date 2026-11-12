package com.huami.wallet.lib.entity;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J7\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/huami/wallet/lib/entity/BusSiteInfo;", "Ljava/io/Serializable;", "", "component1", "component2", "component3", "component4", "trafficType", "siteName", "consumptionType", "lineNo", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getTrafficType", "()Ljava/lang/String;", "b", "getSiteName", "c", "getConsumptionType", GoogleApiAvailabilityLight.a, "getLineNo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "core-api_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BusSiteInfo implements Serializable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String trafficType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String siteName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String consumptionType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final String lineNo;

    public BusSiteInfo(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.trafficType = str;
        this.siteName = str2;
        this.consumptionType = str3;
        this.lineNo = str4;
    }

    public static /* synthetic */ BusSiteInfo copy$default(BusSiteInfo busSiteInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = busSiteInfo.trafficType;
        }
        if ((i & 2) != 0) {
            str2 = busSiteInfo.siteName;
        }
        if ((i & 4) != 0) {
            str3 = busSiteInfo.consumptionType;
        }
        if ((i & 8) != 0) {
            str4 = busSiteInfo.lineNo;
        }
        return busSiteInfo.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTrafficType() {
        return this.trafficType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSiteName() {
        return this.siteName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getConsumptionType() {
        return this.consumptionType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLineNo() {
        return this.lineNo;
    }

    @NotNull
    public final BusSiteInfo copy(@NotNull String trafficType, @Nullable String siteName, @Nullable String consumptionType, @Nullable String lineNo) {
        return new BusSiteInfo(trafficType, siteName, consumptionType, lineNo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BusSiteInfo)) {
            return false;
        }
        BusSiteInfo busSiteInfo = (BusSiteInfo) other;
        return Intrinsics.areEqual(this.trafficType, busSiteInfo.trafficType) && Intrinsics.areEqual(this.siteName, busSiteInfo.siteName) && Intrinsics.areEqual(this.consumptionType, busSiteInfo.consumptionType) && Intrinsics.areEqual(this.lineNo, busSiteInfo.lineNo);
    }

    @Nullable
    public final String getConsumptionType() {
        return this.consumptionType;
    }

    @Nullable
    public final String getLineNo() {
        return this.lineNo;
    }

    @Nullable
    public final String getSiteName() {
        return this.siteName;
    }

    @NotNull
    public final String getTrafficType() {
        return this.trafficType;
    }

    public int hashCode() {
        int iHashCode = this.trafficType.hashCode() * 31;
        String str = this.siteName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.consumptionType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lineNo;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BusSiteInfo(trafficType=" + this.trafficType + ", siteName=" + ((Object) this.siteName) + ", consumptionType=" + ((Object) this.consumptionType) + ", lineNo=" + ((Object) this.lineNo) + ')';
    }

    public /* synthetic */ BusSiteInfo(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
