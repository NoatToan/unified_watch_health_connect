package s92;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import ds.e0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR$\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR$\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010\u001d\"\u0004\b(\u0010\u001fR$\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001b\u001a\u0004\b&\u0010\u001d\"\u0004\b)\u0010\u001fR$\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001b\u001a\u0004\b \u0010\u001d\"\u0004\b+\u0010\u001fR$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001b\u001a\u0004\b\u0017\u0010\u001d\"\u0004\b-\u0010\u001fR$\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001b\u001a\u0004\b,\u0010\u001d\"\u0004\b.\u0010\u001fR$\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001b\u001a\u0004\b*\u0010\u001d\"\u0004\b0\u0010\u001f¨\u00061"}, d2 = {"Ls92/c;", "Landroid/os/Parcelable;", "", "userFeaturePk", "userProfilePk", "", "garminGuid", "featureType", "userOption", "sourceType", "deleteStatus", "consentTypeId", "consentEnforcementState", "userMetadata", "updateDate", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "J", "getUserFeaturePk", "()J", "setUserFeaturePk", "(J)V", "b", "getUserProfilePk", "setUserProfilePk", "c", "Ljava/lang/String;", "getGarminGuid", "()Ljava/lang/String;", "setGarminGuid", "(Ljava/lang/String;)V", "d", "getFeatureType", "setFeatureType", JWKParameterNames.RSA_EXPONENT, "j", "setUserOption", "f", "g", "setSourceType", "setDeleteStatus", "h", "setConsentTypeId", IntegerTokenConverter.CONVERTER_KEY, "setConsentEnforcementState", "setUserMetadata", JWKParameterNames.OCT_KEY_VALUE, "setUpdateDate", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userFeaturePk")
    private long userFeaturePk;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePk")
    private long userProfilePk;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("garminGuid")
    private String garminGuid;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("featureType")
    private String featureType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userOption")
    private String userOption;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sourceType")
    private String sourceType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deleteStatus")
    private String deleteStatus;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consentTypeId")
    private String consentTypeId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consentEnforcementState")
    private String consentEnforcementState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userMetadata")
    private String userMetadata;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("updateDate")
    private String updateDate;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(long j8, long j14, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, str, str2, str3, str4, str5, str6, str7, (i14 & 512) != 0 ? null : str8, (i14 & 1024) != 0 ? null : str9);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getConsentEnforcementState() {
        return this.consentEnforcementState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getConsentTypeId() {
        return this.consentTypeId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.userFeaturePk == cVar.userFeaturePk && this.userProfilePk == cVar.userProfilePk && s.g(this.garminGuid, cVar.garminGuid) && s.g(this.featureType, cVar.featureType) && s.g(this.userOption, cVar.userOption) && s.g(this.sourceType, cVar.sourceType) && s.g(this.deleteStatus, cVar.deleteStatus) && s.g(this.consentTypeId, cVar.consentTypeId) && s.g(this.consentEnforcementState, cVar.consentEnforcementState) && s.g(this.userMetadata, cVar.userMetadata) && s.g(this.updateDate, cVar.updateDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDeleteStatus() {
        return this.deleteStatus;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSourceType() {
        return this.sourceType;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getUpdateDate() {
        return this.updateDate;
    }

    public final int hashCode() {
        int iE = q6.f.e(Long.hashCode(this.userFeaturePk) * 31, 31, this.userProfilePk);
        String str = this.garminGuid;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.featureType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userOption;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sourceType;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.deleteStatus;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.consentTypeId;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.consentEnforcementState;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.userMetadata;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.updateDate;
        return iHashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getUserMetadata() {
        return this.userMetadata;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getUserOption() {
        return this.userOption;
    }

    public final String toString() {
        long j8 = this.userFeaturePk;
        long j14 = this.userProfilePk;
        String str = this.garminGuid;
        String str2 = this.featureType;
        String str3 = this.userOption;
        String str4 = this.sourceType;
        String str5 = this.deleteStatus;
        String str6 = this.consentTypeId;
        String str7 = this.consentEnforcementState;
        String str8 = this.userMetadata;
        String str9 = this.updateDate;
        StringBuilder sbK = e0.k(j8, "ConsentDTO(userFeaturePk=", ", userProfilePk=");
        p6.b.k(j14, ", garminGuid=", str, sbK);
        sn.a.t(sbK, ", featureType=", str2, ", userOption=", str3);
        sn.a.t(sbK, ", sourceType=", str4, ", deleteStatus=", str5);
        sn.a.t(sbK, ", consentTypeId=", str6, ", consentEnforcementState=", str7);
        sn.a.t(sbK, ", userMetadata=", str8, ", updateDate=", str9);
        sbK.append(")");
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.userFeaturePk);
        parcel.writeLong(this.userProfilePk);
        parcel.writeString(this.garminGuid);
        parcel.writeString(this.featureType);
        parcel.writeString(this.userOption);
        parcel.writeString(this.sourceType);
        parcel.writeString(this.deleteStatus);
        parcel.writeString(this.consentTypeId);
        parcel.writeString(this.consentEnforcementState);
        parcel.writeString(this.userMetadata);
        parcel.writeString(this.updateDate);
    }

    public c(long j8, long j14, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.userFeaturePk = j8;
        this.userProfilePk = j14;
        this.garminGuid = str;
        this.featureType = str2;
        this.userOption = str3;
        this.sourceType = str4;
        this.deleteStatus = str5;
        this.consentTypeId = str6;
        this.consentEnforcementState = str7;
        this.userMetadata = str8;
        this.updateDate = str9;
    }
}
