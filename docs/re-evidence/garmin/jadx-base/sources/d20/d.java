package d20;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import hk1.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import v.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0014B\u009f\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0015\u001a\u0004\b#\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0015\u001a\u0004\b'\u0010\u0017R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0015\u001a\u0004\b)\u0010\u0017R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0015\u001a\u0004\b+\u0010\u0017R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\u0010\u0010.R\u001a\u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b\u0011\u0010.¨\u00060"}, d2 = {"Ld20/d;", "Landroid/os/Parcelable;", "Lhk1/r;", "", "oAuthTokenId", "applicationName", "companyName", "imageUrl", "termsOfUseUrl", "privacyPolicyUrl", "companyWebsite", "consumerName", "callBackUrl", "consentTypeId", "consumerKey", "", "isFirstBeatEnabled", "isAuthProhibited", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "a", "Ljava/lang/String;", "getOAuthTokenId", "()Ljava/lang/String;", "b", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "c", "getCompanyName", "d", "getImageUrl", JWKParameterNames.RSA_EXPONENT, "getTermsOfUseUrl", "f", "s", "g", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "h", "getConsumerName", IntegerTokenConverter.CONVERTER_KEY, "getCallBackUrl", "j", "getConsentTypeId", JWKParameterNames.OCT_KEY_VALUE, "getConsumerKey", "l", "Z", "()Z", "m", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable, r {
    public static final Parcelable.Creator<d> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("oAuthTokenId")
    private final String oAuthTokenId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("applicationName")
    private final String applicationName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("companyName")
    private final String companyName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("imageUrl")
    private final String imageUrl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("termsOfUseUrl")
    private final String termsOfUseUrl;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("privacyPolicyUrl")
    private final String privacyPolicyUrl;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("companyWebsite")
    private final String companyWebsite;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consumerName")
    private final String consumerName;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("callBackUrl")
    private final String callBackUrl;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consentTypeId")
    private final String consentTypeId;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consumerKey")
    private final String consumerKey;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("firstbeatServerSideAnalysisEnabled")
    private final boolean isFirstBeatEnabled;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("requestTokenAuthorizationProhibited")
    private final boolean isAuthProhibited;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ d(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z14, boolean z15, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5, (i14 & 32) != 0 ? null : str6, (i14 & 64) != 0 ? null : str7, (i14 & 128) != 0 ? null : str8, (i14 & 256) != 0 ? null : str9, (i14 & 512) != 0 ? null : str10, (i14 & 1024) == 0 ? str11 : null, (i14 & 2048) != 0 ? false : z14, (i14 & 4096) != 0 ? false : z15);
    }

    public static d o(d dVar, String str) {
        String str2 = dVar.oAuthTokenId;
        String str3 = dVar.applicationName;
        String str4 = dVar.companyName;
        String str5 = dVar.termsOfUseUrl;
        String str6 = dVar.privacyPolicyUrl;
        String str7 = dVar.companyWebsite;
        String str8 = dVar.consumerName;
        String str9 = dVar.callBackUrl;
        String str10 = dVar.consentTypeId;
        String str11 = dVar.consumerKey;
        boolean z14 = dVar.isFirstBeatEnabled;
        boolean z15 = dVar.isAuthProhibited;
        dVar.getClass();
        return new d(str2, str3, str4, str, str5, str6, str7, str8, str9, str10, str11, z14, z15);
    }

    @Override // hk1.r
    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsFirstBeatEnabled() {
        return this.isFirstBeatEnabled;
    }

    @Override // hk1.r
    public final boolean d() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.oAuthTokenId, dVar.oAuthTokenId) && s.g(this.applicationName, dVar.applicationName) && s.g(this.companyName, dVar.companyName) && s.g(this.imageUrl, dVar.imageUrl) && s.g(this.termsOfUseUrl, dVar.termsOfUseUrl) && s.g(this.privacyPolicyUrl, dVar.privacyPolicyUrl) && s.g(this.companyWebsite, dVar.companyWebsite) && s.g(this.consumerName, dVar.consumerName) && s.g(this.callBackUrl, dVar.callBackUrl) && s.g(this.consentTypeId, dVar.consentTypeId) && s.g(this.consumerKey, dVar.consumerKey) && this.isFirstBeatEnabled == dVar.isFirstBeatEnabled && this.isAuthProhibited == dVar.isAuthProhibited;
    }

    @Override // hk1.r
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPrivacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }

    @Override // hk1.r
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getConsentTypeId() {
        return this.consentTypeId;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Override // hk1.r
    /* JADX INFO: renamed from: h */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final int hashCode() {
        String str = this.oAuthTokenId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.applicationName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.companyName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.imageUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.termsOfUseUrl;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.privacyPolicyUrl;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.companyWebsite;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.consumerName;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.callBackUrl;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.consentTypeId;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.consumerKey;
        return Boolean.hashCode(this.isAuthProhibited) + q6.f.g((iHashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31, 31, this.isFirstBeatEnabled);
    }

    @Override // hk1.r
    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsAuthProhibited() {
        return this.isAuthProhibited;
    }

    @Override // hk1.r
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getCallBackUrl() {
        return this.callBackUrl;
    }

    @Override // hk1.r
    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getConsumerKey() {
        return this.consumerKey;
    }

    @Override // hk1.r
    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getApplicationName() {
        return this.applicationName;
    }

    public final String q() {
        return this.applicationName;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getCompanyWebsite() {
        return this.companyWebsite;
    }

    public final String s() {
        return this.privacyPolicyUrl;
    }

    public final String toString() {
        String str = this.oAuthTokenId;
        String str2 = this.applicationName;
        String str3 = this.companyName;
        String str4 = this.imageUrl;
        String str5 = this.termsOfUseUrl;
        String str6 = this.privacyPolicyUrl;
        String str7 = this.companyWebsite;
        String str8 = this.consumerName;
        String str9 = this.callBackUrl;
        String str10 = this.consentTypeId;
        String str11 = this.consumerKey;
        boolean z14 = this.isFirstBeatEnabled;
        boolean z15 = this.isAuthProhibited;
        StringBuilder sbI = p6.b.i("ConsentPartnerConsumerDTO(oAuthTokenId=", str, ", applicationName=", str2, ", companyName=");
        sn.a.t(sbI, str3, ", imageUrl=", str4, ", termsOfUseUrl=");
        sn.a.t(sbI, str5, ", privacyPolicyUrl=", str6, ", companyWebsite=");
        sn.a.t(sbI, str7, ", consumerName=", str8, ", callBackUrl=");
        sn.a.t(sbI, str9, ", consentTypeId=", str10, ", consumerKey=");
        h.C(str11, ", isFirstBeatEnabled=", ", isAuthProhibited=", sbI, z14);
        return hb.a.k(sbI, z15, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.oAuthTokenId);
        parcel.writeString(this.applicationName);
        parcel.writeString(this.companyName);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.termsOfUseUrl);
        parcel.writeString(this.privacyPolicyUrl);
        parcel.writeString(this.companyWebsite);
        parcel.writeString(this.consumerName);
        parcel.writeString(this.callBackUrl);
        parcel.writeString(this.consentTypeId);
        parcel.writeString(this.consumerKey);
        parcel.writeInt(this.isFirstBeatEnabled ? 1 : 0);
        parcel.writeInt(this.isAuthProhibited ? 1 : 0);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006¨\u0006\u0013"}, d2 = {"Ld20/d$a;", "", "<init>", "()V", "", "OAUTH_TOKEN_ID_KEY", "Ljava/lang/String;", "APPLICATION_NAME_KEY", "COMPANY_NAME_KEY", "IMAGE_URL_KEY", "TERMS_OF_USE_URL_KEY", "PRIVACY_URL_KEY", "COMPANY_WEBSITE_KEY", "CONSUMER_NAME_KEY", "CALL_BACK_URL_KEY", "CONSENT_TYPE_ID_KEY", "CONSUMER_KEY", "FIRST_BEAT_KEY", "AUTH_PROHIBITED_KEY", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public d(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z14, boolean z15) {
        this.oAuthTokenId = str;
        this.applicationName = str2;
        this.companyName = str3;
        this.imageUrl = str4;
        this.termsOfUseUrl = str5;
        this.privacyPolicyUrl = str6;
        this.companyWebsite = str7;
        this.consumerName = str8;
        this.callBackUrl = str9;
        this.consentTypeId = str10;
        this.consumerKey = str11;
        this.isFirstBeatEnabled = z14;
        this.isAuthProhibited = z15;
    }

    public d() {
        this(null, null, null, null, null, null, null, null, null, null, null, false, false, 8191, null);
    }
}
