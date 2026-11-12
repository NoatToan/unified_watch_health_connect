package cn.eid.service;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b(\u0010)J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003JQ\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\n\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a\"\u0004\b\u001c\u0010\u001dR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001dR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0018\u001a\u0004\b \u0010\u001a\"\u0004\b!\u0010\u001dR\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\"\u0010\u001a\"\u0004\b#\u0010\u001dR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001dR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b&\u0010\u001a\"\u0004\b'\u0010\u001d¨\u0006*"}, d2 = {"Lcn/eid/service/EidInfo;", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "idCarrier", "issuerOrg", "carrierType", "cosVersion", "fwVersion", "developer", "appletVersion", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getIdCarrier", "()Ljava/lang/String;", "getIssuerOrg", "setIssuerOrg", "(Ljava/lang/String;)V", "getCarrierType", "setCarrierType", "getCosVersion", "setCosVersion", "getFwVersion", "setFwVersion", "getDeveloper", "setDeveloper", "getAppletVersion", "setAppletVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "eid_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class EidInfo {

    @SerializedName("appletVersion")
    @NotNull
    private String appletVersion;

    @SerializedName("carrierType")
    @NotNull
    private String carrierType;

    @SerializedName("cosVersion")
    @NotNull
    private String cosVersion;

    @SerializedName("developer")
    @Nullable
    private String developer;

    @SerializedName("fwVersion")
    @NotNull
    private String fwVersion;

    @SerializedName("idcarrier")
    @NotNull
    private final String idCarrier;

    @SerializedName("issuerOrg")
    @NotNull
    private String issuerOrg;

    public EidInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @Nullable String str6, @NotNull String str7) {
        this.idCarrier = str;
        this.issuerOrg = str2;
        this.carrierType = str3;
        this.cosVersion = str4;
        this.fwVersion = str5;
        this.developer = str6;
        this.appletVersion = str7;
    }

    public static /* synthetic */ EidInfo copy$default(EidInfo eidInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eidInfo.idCarrier;
        }
        if ((i & 2) != 0) {
            str2 = eidInfo.issuerOrg;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = eidInfo.carrierType;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = eidInfo.cosVersion;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = eidInfo.fwVersion;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = eidInfo.developer;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = eidInfo.appletVersion;
        }
        return eidInfo.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIdCarrier() {
        return this.idCarrier;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIssuerOrg() {
        return this.issuerOrg;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCarrierType() {
        return this.carrierType;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCosVersion() {
        return this.cosVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFwVersion() {
        return this.fwVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDeveloper() {
        return this.developer;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAppletVersion() {
        return this.appletVersion;
    }

    @NotNull
    public final EidInfo copy(@NotNull String idCarrier, @NotNull String issuerOrg, @NotNull String carrierType, @NotNull String cosVersion, @NotNull String fwVersion, @Nullable String developer, @NotNull String appletVersion) {
        return new EidInfo(idCarrier, issuerOrg, carrierType, cosVersion, fwVersion, developer, appletVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EidInfo)) {
            return false;
        }
        EidInfo eidInfo = (EidInfo) other;
        return Intrinsics.areEqual(this.idCarrier, eidInfo.idCarrier) && Intrinsics.areEqual(this.issuerOrg, eidInfo.issuerOrg) && Intrinsics.areEqual(this.carrierType, eidInfo.carrierType) && Intrinsics.areEqual(this.cosVersion, eidInfo.cosVersion) && Intrinsics.areEqual(this.fwVersion, eidInfo.fwVersion) && Intrinsics.areEqual(this.developer, eidInfo.developer) && Intrinsics.areEqual(this.appletVersion, eidInfo.appletVersion);
    }

    @NotNull
    public final String getAppletVersion() {
        return this.appletVersion;
    }

    @NotNull
    public final String getCarrierType() {
        return this.carrierType;
    }

    @NotNull
    public final String getCosVersion() {
        return this.cosVersion;
    }

    @Nullable
    public final String getDeveloper() {
        return this.developer;
    }

    @NotNull
    public final String getFwVersion() {
        return this.fwVersion;
    }

    @NotNull
    public final String getIdCarrier() {
        return this.idCarrier;
    }

    @NotNull
    public final String getIssuerOrg() {
        return this.issuerOrg;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.idCarrier.hashCode() * 31) + this.issuerOrg.hashCode()) * 31) + this.carrierType.hashCode()) * 31) + this.cosVersion.hashCode()) * 31) + this.fwVersion.hashCode()) * 31;
        String str = this.developer;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.appletVersion.hashCode();
    }

    public final void setAppletVersion(@NotNull String str) {
        this.appletVersion = str;
    }

    public final void setCarrierType(@NotNull String str) {
        this.carrierType = str;
    }

    public final void setCosVersion(@NotNull String str) {
        this.cosVersion = str;
    }

    public final void setDeveloper(@Nullable String str) {
        this.developer = str;
    }

    public final void setFwVersion(@NotNull String str) {
        this.fwVersion = str;
    }

    public final void setIssuerOrg(@NotNull String str) {
        this.issuerOrg = str;
    }

    @NotNull
    public String toString() {
        return "EidInfo(idCarrier=" + this.idCarrier + ", issuerOrg=" + this.issuerOrg + ", carrierType=" + this.carrierType + ", cosVersion=" + this.cosVersion + ", fwVersion=" + this.fwVersion + ", developer=" + this.developer + ", appletVersion=" + this.appletVersion + ")";
    }

    public /* synthetic */ EidInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? "rongcard" : str6, str7);
    }
}
