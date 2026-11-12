package s92;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0011\u001a\u0004\b&\u0010\u0013¨\u0006'"}, d2 = {"Ls92/i;", "", "", "consentTypeId", "consentLocale", "consentSourceSystem", "consentVersion", "consentState", "consentEnforcementState", "garminGuid", "", "userProfilePk", "deleteStatus", "createDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getConsentTypeId", "()Ljava/lang/String;", "b", "getConsentLocale", "c", "getConsentSourceSystem", "d", "getConsentVersion", JWKParameterNames.RSA_EXPONENT, "getConsentState", "f", "getConsentEnforcementState", "g", "getGarminGuid", "h", "Ljava/lang/Integer;", "getUserProfilePk", "()Ljava/lang/Integer;", IntegerTokenConverter.CONVERTER_KEY, "j", "getCreateDate", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consentTypeId")
    private final String consentTypeId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consentLocale")
    private final String consentLocale;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consentSourceSystem")
    private final String consentSourceSystem;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consentVersion")
    private final String consentVersion;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consentState")
    private final String consentState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consentEnforcementState")
    private final String consentEnforcementState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("garminGuid")
    private final String garminGuid;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePk")
    private final Integer userProfilePk;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deleteStatus")
    private final String deleteStatus;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createDate")
    private final String createDate;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, String str9) {
        this.consentTypeId = str;
        this.consentLocale = str2;
        this.consentSourceSystem = str3;
        this.consentVersion = str4;
        this.consentState = str5;
        this.consentEnforcementState = str6;
        this.garminGuid = str7;
        this.userProfilePk = num;
        this.deleteStatus = str8;
        this.createDate = str9;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDeleteStatus() {
        return this.deleteStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return s.g(this.consentTypeId, iVar.consentTypeId) && s.g(this.consentLocale, iVar.consentLocale) && s.g(this.consentSourceSystem, iVar.consentSourceSystem) && s.g(this.consentVersion, iVar.consentVersion) && s.g(this.consentState, iVar.consentState) && s.g(this.consentEnforcementState, iVar.consentEnforcementState) && s.g(this.garminGuid, iVar.garminGuid) && s.g(this.userProfilePk, iVar.userProfilePk) && s.g(this.deleteStatus, iVar.deleteStatus) && s.g(this.createDate, iVar.createDate);
    }

    public final int hashCode() {
        String str = this.consentTypeId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.consentLocale;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.consentSourceSystem;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.consentVersion;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.consentState;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.consentEnforcementState;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.garminGuid;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.userProfilePk;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str8 = this.deleteStatus;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.createDate;
        return iHashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        String str = this.consentTypeId;
        String str2 = this.consentLocale;
        String str3 = this.consentSourceSystem;
        String str4 = this.consentVersion;
        String str5 = this.consentState;
        String str6 = this.consentEnforcementState;
        String str7 = this.garminGuid;
        Integer num = this.userProfilePk;
        String str8 = this.deleteStatus;
        String str9 = this.createDate;
        StringBuilder sbI = p6.b.i("ConsentUpdateResponse(consentTypeId=", str, ", consentLocale=", str2, ", consentSourceSystem=");
        sn.a.t(sbI, str3, ", consentVersion=", str4, ", consentState=");
        sn.a.t(sbI, str5, ", consentEnforcementState=", str6, ", garminGuid=");
        fb1.c.u(num, str7, ", userProfilePk=", ", deleteStatus=", sbI);
        return e5.h(sbI, str8, ", createDate=", str9, ")");
    }
}
