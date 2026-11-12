package ep2;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import fo2.p;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bM\b\u0087\b\u0018\u00002\u00020\u0001B³\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b.\u0010)R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010'\u001a\u0004\b0\u0010)R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b$\u0010)R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b*\u0010)R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010'\u001a\u0004\b3\u0010)R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010'\u001a\u0004\b5\u0010)R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010'\u001a\u0004\b1\u0010)R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010'\u001a\u0004\b8\u0010)R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010'\u001a\u0004\b:\u0010)R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010'\u001a\u0004\b<\u0010)R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010'\u001a\u0004\b>\u0010)R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010'\u001a\u0004\b/\u0010)R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010'\u001a\u0004\bA\u0010)R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010'\u001a\u0004\bC\u0010)R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010'\u001a\u0004\bE\u0010)R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010'\u001a\u0004\bG\u0010)R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010'\u001a\u0004\bI\u0010)R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010!\u001a\u0004\bK\u0010#R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010'\u001a\u0004\bM\u0010)R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010'\u001a\u0004\bO\u0010)R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010'\u001a\u0004\bQ\u0010)¨\u0006R"}, d2 = {"Lep2/d;", "Landroid/os/Parcelable;", "Lfo2/p;", "credentialLink", "paymentCardLink", "", "credentialId", "paymentCardId", "userId", RemoteConfigConstants.ResponseFieldKey.STATE, "usages", "capabilities", "cardType", "credentialType", "tokenLastFour", "maskedPan", "labelColor", "foreGroundColor", "issuerName", "shortDescription", "longDescription", "issuerContactUrl", "issuerContactPhone", "issuerContactEmail", "issuerTermsAndConditionsUrl", "issuerPrivacyPolicyUrl", "termsAndConditionsLink", "privacyPolicyUrl", "creditCardImage", "creditCardImageEmbossed", "<init>", "(Lfo2/p;Lfo2/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfo2/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Lfo2/p;", "getCredentialLink", "()Lfo2/p;", "b", "getPaymentCardLink", "c", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "d", "getPaymentCardId", JWKParameterNames.RSA_EXPONENT, "getUserId", IntegerTokenConverter.CONVERTER_KEY, "g", "getUsages", "h", "j", "getCredentialType", JWKParameterNames.OCT_KEY_VALUE, "getTokenLastFour", "l", "m", "getLabelColor", JWKParameterNames.RSA_MODULUS, "getForeGroundColor", "o", "getIssuerName", "p", "getShortDescription", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "getIssuerContactUrl", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "getIssuerContactPhone", "v", "getIssuerContactEmail", "w", "getIssuerTermsAndConditionsUrl", "x", "getIssuerPrivacyPolicyUrl", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "getTermsAndConditionsLink", "z", "getPrivacyPolicyUrl", "A", "getCreditCardImage", "B", "getCreditCardImageEmbossed", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @SerializedName("creditCardImage")
    private final String creditCardImage;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @SerializedName("creditCardImageEmbossed")
    private final String creditCardImageEmbossed;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("credentialLink")
    private final p credentialLink;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("paymentCardLink")
    private final p paymentCardLink;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("credentialId")
    private final String credentialId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("paymentCardId")
    private final String paymentCardId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userId")
    private final String userId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.ResponseFieldKey.STATE)
    private final String state;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("usages")
    private final String usages;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("capabilities")
    private final String capabilities;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cardType")
    private final String cardType;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("credentialType")
    private final String credentialType;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tokenLastFour")
    private final String tokenLastFour;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maskedPan")
    private final String maskedPan;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("labelColor")
    private final String labelColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("foreGroundColor")
    private final String foreGroundColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("issuerName")
    private final String issuerName;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("shortDescription")
    private final String shortDescription;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("longDescription")
    private final String longDescription;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("issuerContactUrl")
    private final String issuerContactUrl;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("issuerContactPhone")
    private final String issuerContactPhone;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("issuerContactEmail")
    private final String issuerContactEmail;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @SerializedName("issuerTermsAndConditionsUrl")
    private final String issuerTermsAndConditionsUrl;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @SerializedName("issuerPrivacyPolicyUrl")
    private final String issuerPrivacyPolicyUrl;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @SerializedName("termsAndConditionsLink")
    private final p termsAndConditionsLink;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @SerializedName("privacyPolicyUrl")
    private final String privacyPolicyUrl;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            Parcelable.Creator<p> creator = p.CREATOR;
            return new d(creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public /* synthetic */ d(p pVar, p pVar2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, p pVar3, String str21, String str22, String str23, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? new p(null, false, 3, null) : pVar, (i14 & 2) != 0 ? new p(null, false, 3, null) : pVar2, str, str2, (i14 & 16) != 0 ? null : str3, (i14 & 32) != 0 ? null : str4, (i14 & 64) != 0 ? null : str5, (i14 & 128) != 0 ? null : str6, (i14 & 256) != 0 ? null : str7, (i14 & 512) != 0 ? null : str8, (i14 & 1024) != 0 ? null : str9, (i14 & 2048) != 0 ? null : str10, (i14 & 4096) != 0 ? null : str11, (i14 & 8192) != 0 ? null : str12, (i14 & 16384) != 0 ? null : str13, (32768 & i14) != 0 ? null : str14, (65536 & i14) != 0 ? null : str15, (131072 & i14) != 0 ? null : str16, (262144 & i14) != 0 ? null : str17, (524288 & i14) != 0 ? null : str18, (1048576 & i14) != 0 ? null : str19, (2097152 & i14) != 0 ? null : str20, (4194304 & i14) != 0 ? null : pVar3, (8388608 & i14) != 0 ? null : str21, (16777216 & i14) != 0 ? null : str22, (i14 & 33554432) != 0 ? null : str23);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCapabilities() {
        return this.capabilities;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCardType() {
        return this.cardType;
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
        return s.g(this.credentialLink, dVar.credentialLink) && s.g(this.paymentCardLink, dVar.paymentCardLink) && s.g(this.credentialId, dVar.credentialId) && s.g(this.paymentCardId, dVar.paymentCardId) && s.g(this.userId, dVar.userId) && s.g(this.state, dVar.state) && s.g(this.usages, dVar.usages) && s.g(this.capabilities, dVar.capabilities) && s.g(this.cardType, dVar.cardType) && s.g(this.credentialType, dVar.credentialType) && s.g(this.tokenLastFour, dVar.tokenLastFour) && s.g(this.maskedPan, dVar.maskedPan) && s.g(this.labelColor, dVar.labelColor) && s.g(this.foreGroundColor, dVar.foreGroundColor) && s.g(this.issuerName, dVar.issuerName) && s.g(this.shortDescription, dVar.shortDescription) && s.g(this.longDescription, dVar.longDescription) && s.g(this.issuerContactUrl, dVar.issuerContactUrl) && s.g(this.issuerContactPhone, dVar.issuerContactPhone) && s.g(this.issuerContactEmail, dVar.issuerContactEmail) && s.g(this.issuerTermsAndConditionsUrl, dVar.issuerTermsAndConditionsUrl) && s.g(this.issuerPrivacyPolicyUrl, dVar.issuerPrivacyPolicyUrl) && s.g(this.termsAndConditionsLink, dVar.termsAndConditionsLink) && s.g(this.privacyPolicyUrl, dVar.privacyPolicyUrl) && s.g(this.creditCardImage, dVar.creditCardImage) && s.g(this.creditCardImageEmbossed, dVar.creditCardImageEmbossed);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCredentialId() {
        return this.credentialId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getLongDescription() {
        return this.longDescription;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getMaskedPan() {
        return this.maskedPan;
    }

    public final int hashCode() {
        int iJ = wr.g.j(wr.g.j(fb1.c.e(this.paymentCardLink, this.credentialLink.hashCode() * 31, 31), 31, this.credentialId), 31, this.paymentCardId);
        String str = this.userId;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.state;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.usages;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.capabilities;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cardType;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.credentialType;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.tokenLastFour;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.maskedPan;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.labelColor;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.foreGroundColor;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.issuerName;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.shortDescription;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.longDescription;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.issuerContactUrl;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.issuerContactPhone;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.issuerContactEmail;
        int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.issuerTermsAndConditionsUrl;
        int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.issuerPrivacyPolicyUrl;
        int iHashCode18 = (iHashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        p pVar = this.termsAndConditionsLink;
        int iHashCode19 = (iHashCode18 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        String str19 = this.privacyPolicyUrl;
        int iHashCode20 = (iHashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.creditCardImage;
        int iHashCode21 = (iHashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.creditCardImageEmbossed;
        return iHashCode21 + (str21 != null ? str21.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final String toString() {
        p pVar = this.credentialLink;
        p pVar2 = this.paymentCardLink;
        String str = this.credentialId;
        String str2 = this.paymentCardId;
        String str3 = this.userId;
        String str4 = this.state;
        String str5 = this.usages;
        String str6 = this.capabilities;
        String str7 = this.cardType;
        String str8 = this.credentialType;
        String str9 = this.tokenLastFour;
        String str10 = this.maskedPan;
        String str11 = this.labelColor;
        String str12 = this.foreGroundColor;
        String str13 = this.issuerName;
        String str14 = this.shortDescription;
        String str15 = this.longDescription;
        String str16 = this.issuerContactUrl;
        String str17 = this.issuerContactPhone;
        String str18 = this.issuerContactEmail;
        String str19 = this.issuerTermsAndConditionsUrl;
        String str20 = this.issuerPrivacyPolicyUrl;
        p pVar3 = this.termsAndConditionsLink;
        String str21 = this.privacyPolicyUrl;
        String str22 = this.creditCardImage;
        String str23 = this.creditCardImageEmbossed;
        StringBuilder sb3 = new StringBuilder("FitPayCredentialDTO(credentialLink=");
        sb3.append(pVar);
        sb3.append(", paymentCardLink=");
        sb3.append(pVar2);
        sb3.append(", credentialId=");
        sn.a.t(sb3, str, ", paymentCardId=", str2, ", userId=");
        sn.a.t(sb3, str3, ", state=", str4, ", usages=");
        sn.a.t(sb3, str5, ", capabilities=", str6, ", cardType=");
        sn.a.t(sb3, str7, ", credentialType=", str8, ", tokenLastFour=");
        sn.a.t(sb3, str9, ", maskedPan=", str10, ", labelColor=");
        sn.a.t(sb3, str11, ", foreGroundColor=", str12, ", issuerName=");
        sn.a.t(sb3, str13, ", shortDescription=", str14, ", longDescription=");
        sn.a.t(sb3, str15, ", issuerContactUrl=", str16, ", issuerContactPhone=");
        sn.a.t(sb3, str17, ", issuerContactEmail=", str18, ", issuerTermsAndConditionsUrl=");
        sn.a.t(sb3, str19, ", issuerPrivacyPolicyUrl=", str20, ", termsAndConditionsLink=");
        sb3.append(pVar3);
        sb3.append(", privacyPolicyUrl=");
        sb3.append(str21);
        sb3.append(", creditCardImage=");
        return e5.h(sb3, str22, ", creditCardImageEmbossed=", str23, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.credentialLink.writeToParcel(parcel, i14);
        this.paymentCardLink.writeToParcel(parcel, i14);
        parcel.writeString(this.credentialId);
        parcel.writeString(this.paymentCardId);
        parcel.writeString(this.userId);
        parcel.writeString(this.state);
        parcel.writeString(this.usages);
        parcel.writeString(this.capabilities);
        parcel.writeString(this.cardType);
        parcel.writeString(this.credentialType);
        parcel.writeString(this.tokenLastFour);
        parcel.writeString(this.maskedPan);
        parcel.writeString(this.labelColor);
        parcel.writeString(this.foreGroundColor);
        parcel.writeString(this.issuerName);
        parcel.writeString(this.shortDescription);
        parcel.writeString(this.longDescription);
        parcel.writeString(this.issuerContactUrl);
        parcel.writeString(this.issuerContactPhone);
        parcel.writeString(this.issuerContactEmail);
        parcel.writeString(this.issuerTermsAndConditionsUrl);
        parcel.writeString(this.issuerPrivacyPolicyUrl);
        p pVar = this.termsAndConditionsLink;
        if (pVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.privacyPolicyUrl);
        parcel.writeString(this.creditCardImage);
        parcel.writeString(this.creditCardImageEmbossed);
    }

    public d(p pVar, p pVar2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, p pVar3, String str21, String str22, String str23) {
        pVar.getClass();
        pVar2.getClass();
        str.getClass();
        str2.getClass();
        this.credentialLink = pVar;
        this.paymentCardLink = pVar2;
        this.credentialId = str;
        this.paymentCardId = str2;
        this.userId = str3;
        this.state = str4;
        this.usages = str5;
        this.capabilities = str6;
        this.cardType = str7;
        this.credentialType = str8;
        this.tokenLastFour = str9;
        this.maskedPan = str10;
        this.labelColor = str11;
        this.foreGroundColor = str12;
        this.issuerName = str13;
        this.shortDescription = str14;
        this.longDescription = str15;
        this.issuerContactUrl = str16;
        this.issuerContactPhone = str17;
        this.issuerContactEmail = str18;
        this.issuerTermsAndConditionsUrl = str19;
        this.issuerPrivacyPolicyUrl = str20;
        this.termsAndConditionsLink = pVar3;
        this.privacyPolicyUrl = str21;
        this.creditCardImage = str22;
        this.creditCardImageEmbossed = str23;
    }
}
