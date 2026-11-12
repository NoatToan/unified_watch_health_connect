package hk1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u007f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019R\u001a\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010\u0019R\u001a\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0017\u001a\u0004\b)\u0010\u0019R\u001a\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0017\u001a\u0004\b+\u0010\u0019R\u001a\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u0017\u001a\u0004\b-\u0010\u0019R\u001a\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u0017\u001a\u0004\b/\u0010\u0019R\u001a\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u0017\u001a\u0004\b1\u0010\u0019R\u001a\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\u0017\u001a\u0004\b3\u0010\u0019R\u001a\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u00068"}, d2 = {"Lhk1/b;", "Landroid/os/Parcelable;", "Lhk1/r;", "", "clientId", "", "scopes", "redirectUri", "consumerKey", "applicationName", "clientDescription", "companyName", "imageUrl", "termsOfUseUrl", "privacyPolicyUrl", "companyWebsite", "consumerName", "consentTypeId", "", "unverified", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "a", "Ljava/lang/String;", "getClientId", "()Ljava/lang/String;", "b", "Ljava/util/List;", "getScopes", "()Ljava/util/List;", "c", "getRedirectUri", "d", "getConsumerKey", JWKParameterNames.RSA_EXPONENT, "getApplicationName", "f", "getClientDescription", "g", "getCompanyName", "h", "getImageUrl", IntegerTokenConverter.CONVERTER_KEY, "getTermsOfUseUrl", "j", "getPrivacyPolicyUrl", JWKParameterNames.OCT_KEY_VALUE, "getCompanyWebsite", "l", "getConsumerName", "m", "getConsentTypeId", JWKParameterNames.RSA_MODULUS, "Z", "getUnverified", "()Z", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable, r {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("clientId")
    private final String clientId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("scopes")
    private final List<String> scopes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("redirectUri")
    private final String redirectUri;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consumerKey")
    private final String consumerKey;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("applicationName")
    private final String applicationName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("clientDescription")
    private final String clientDescription;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("companyName")
    private final String companyName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("imageUrl")
    private final String imageUrl;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("termsOfUseUrl")
    private final String termsOfUseUrl;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("privacyPolicyUrl")
    private final String privacyPolicyUrl;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("companyWebsite")
    private final String companyWebsite;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consumerName")
    private final String consumerName;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consentTypeId")
    private final String consentTypeId;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("unverified")
    private final boolean unverified;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(String str, List<String> list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z14) {
        str.getClass();
        list.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        hb.a.p(str6, str7, str8, str9, str10);
        str11.getClass();
        str12.getClass();
        this.clientId = str;
        this.scopes = list;
        this.redirectUri = str2;
        this.consumerKey = str3;
        this.applicationName = str4;
        this.clientDescription = str5;
        this.companyName = str6;
        this.imageUrl = str7;
        this.termsOfUseUrl = str8;
        this.privacyPolicyUrl = str9;
        this.companyWebsite = str10;
        this.consumerName = str11;
        this.consentTypeId = str12;
        this.unverified = z14;
    }

    @Override // hk1.r
    /* JADX INFO: renamed from: b */
    public final boolean getIsFirstBeatEnabled() {
        return false;
    }

    @Override // hk1.r
    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getUnverified() {
        return this.unverified;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return p005kotlin.jvm.internal.s.g(this.clientId, bVar.clientId) && p005kotlin.jvm.internal.s.g(this.scopes, bVar.scopes) && p005kotlin.jvm.internal.s.g(this.redirectUri, bVar.redirectUri) && p005kotlin.jvm.internal.s.g(this.consumerKey, bVar.consumerKey) && p005kotlin.jvm.internal.s.g(this.applicationName, bVar.applicationName) && p005kotlin.jvm.internal.s.g(this.clientDescription, bVar.clientDescription) && p005kotlin.jvm.internal.s.g(this.companyName, bVar.companyName) && p005kotlin.jvm.internal.s.g(this.imageUrl, bVar.imageUrl) && p005kotlin.jvm.internal.s.g(this.termsOfUseUrl, bVar.termsOfUseUrl) && p005kotlin.jvm.internal.s.g(this.privacyPolicyUrl, bVar.privacyPolicyUrl) && p005kotlin.jvm.internal.s.g(this.companyWebsite, bVar.companyWebsite) && p005kotlin.jvm.internal.s.g(this.consumerName, bVar.consumerName) && p005kotlin.jvm.internal.s.g(this.consentTypeId, bVar.consentTypeId) && this.unverified == bVar.unverified;
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

    @Override // hk1.r
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final int hashCode() {
        int iB = u0.b(this.clientId.hashCode() * 31, 31, this.scopes);
        String str = this.redirectUri;
        return Boolean.hashCode(this.unverified) + wr.g.j(wr.g.j(wr.g.j(wr.g.j(wr.g.j(wr.g.j(wr.g.j(wr.g.j(wr.g.j(wr.g.j((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.consumerKey), 31, this.applicationName), 31, this.clientDescription), 31, this.companyName), 31, this.imageUrl), 31, this.termsOfUseUrl), 31, this.privacyPolicyUrl), 31, this.companyWebsite), 31, this.consumerName), 31, this.consentTypeId);
    }

    @Override // hk1.r
    /* JADX INFO: renamed from: i */
    public final boolean getIsAuthProhibited() {
        return false;
    }

    @Override // hk1.r
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getCallbackUrl() {
        return this.redirectUri;
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

    public final String toString() {
        String str = this.clientId;
        List<String> list = this.scopes;
        String str2 = this.redirectUri;
        String str3 = this.consumerKey;
        String str4 = this.applicationName;
        String str5 = this.clientDescription;
        String str6 = this.companyName;
        String str7 = this.imageUrl;
        String str8 = this.termsOfUseUrl;
        String str9 = this.privacyPolicyUrl;
        String str10 = this.companyWebsite;
        String str11 = this.consumerName;
        String str12 = this.consentTypeId;
        boolean z14 = this.unverified;
        StringBuilder sbG = l2.g("AuthorizationCodeValidationRequestDTO(clientId=", str, ", scopes=", list, ", redirectUri=");
        sn.a.t(sbG, str2, ", consumerKey=", str3, ", applicationName=");
        sn.a.t(sbG, str4, ", clientDescription=", str5, ", companyName=");
        sn.a.t(sbG, str6, ", imageUrl=", str7, ", termsOfUseUrl=");
        sn.a.t(sbG, str8, ", privacyPolicyUrl=", str9, ", companyWebsite=");
        sn.a.t(sbG, str10, ", consumerName=", str11, ", consentTypeId=");
        return am.j.n(str12, ", unverified=", ")", sbG, z14);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.clientId);
        parcel.writeStringList(this.scopes);
        parcel.writeString(this.redirectUri);
        parcel.writeString(this.consumerKey);
        parcel.writeString(this.applicationName);
        parcel.writeString(this.clientDescription);
        parcel.writeString(this.companyName);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.termsOfUseUrl);
        parcel.writeString(this.privacyPolicyUrl);
        parcel.writeString(this.companyWebsite);
        parcel.writeString(this.consumerName);
        parcel.writeString(this.consentTypeId);
        parcel.writeInt(this.unverified ? 1 : 0);
    }
}
