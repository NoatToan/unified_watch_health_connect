package com.huami.nfc.bus.entities;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003JC\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u001e\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017¨\u0006\""}, d2 = {"Lcom/huami/nfc/bus/entities/SiteInfo;", "", "", "component1", "component2", "component3", "component4", "component5", "trafficType", "siteName", "consumptionType", "lineNo", "appCode", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getTrafficType", "()Ljava/lang/String;", "b", "getSiteName", "c", "getConsumptionType", GoogleApiAvailabilityLight.a, "getLineNo", "e", "getAppCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SiteInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("trafficType")
    @NotNull
    private final String trafficType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("siteName")
    @Nullable
    private final String siteName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("consumptionType")
    @Nullable
    private final String consumptionType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("lineNo")
    @Nullable
    private final String lineNo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("appCode")
    @Nullable
    private final String appCode;

    public SiteInfo(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.trafficType = str;
        this.siteName = str2;
        this.consumptionType = str3;
        this.lineNo = str4;
        this.appCode = str5;
    }

    public static /* synthetic */ SiteInfo copy$default(SiteInfo siteInfo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = siteInfo.trafficType;
        }
        if ((i & 2) != 0) {
            str2 = siteInfo.siteName;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = siteInfo.consumptionType;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = siteInfo.lineNo;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = siteInfo.appCode;
        }
        return siteInfo.copy(str, str6, str7, str8, str5);
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

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAppCode() {
        return this.appCode;
    }

    @NotNull
    public final SiteInfo copy(@NotNull String trafficType, @Nullable String siteName, @Nullable String consumptionType, @Nullable String lineNo, @Nullable String appCode) {
        return new SiteInfo(trafficType, siteName, consumptionType, lineNo, appCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SiteInfo)) {
            return false;
        }
        SiteInfo siteInfo = (SiteInfo) other;
        return Intrinsics.areEqual(this.trafficType, siteInfo.trafficType) && Intrinsics.areEqual(this.siteName, siteInfo.siteName) && Intrinsics.areEqual(this.consumptionType, siteInfo.consumptionType) && Intrinsics.areEqual(this.lineNo, siteInfo.lineNo) && Intrinsics.areEqual(this.appCode, siteInfo.appCode);
    }

    @Nullable
    public final String getAppCode() {
        return this.appCode;
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
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.appCode;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SiteInfo(trafficType=" + this.trafficType + ", siteName=" + ((Object) this.siteName) + ", consumptionType=" + ((Object) this.consumptionType) + ", lineNo=" + ((Object) this.lineNo) + ", appCode=" + ((Object) this.appCode) + ')';
    }

    public /* synthetic */ SiteInfo(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
