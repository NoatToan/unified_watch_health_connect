package zo2;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import fo2.p;
import g22.n;
import gt2.c;
import okhttp3.internal.http2.Http2Connection;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\bQ\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"BÉ\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010(R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010(R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010(R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010(R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010'\u001a\u0004\b1\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b+\u0010%R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010#\u001a\u0004\b3\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010#\u001a\u0004\b5\u0010%R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b4\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010#\u001a\u0004\b7\u0010%R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010#\u001a\u0004\b9\u0010%R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010#\u001a\u0004\b;\u0010%R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b<\u0010%R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010#\u001a\u0004\b>\u0010%R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010#\u001a\u0004\b2\u0010%R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010#\u001a\u0004\bA\u0010%R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010#\u001a\u0004\bC\u0010%R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010#\u001a\u0004\bE\u0010%R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010#\u001a\u0004\bG\u0010%R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010#\u001a\u0004\bI\u0010%R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010#\u001a\u0004\bK\u0010%R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010#\u001a\u0004\bM\u0010%R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010#\u001a\u0004\bO\u0010%R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010#\u001a\u0004\bQ\u0010%R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010#\u001a\u0004\b0\u0010%R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010#\u001a\u0004\bT\u0010%¨\u0006U"}, d2 = {"Lzo2/a;", "Landroid/os/Parcelable;", "", "paymentCardId", "Lfo2/p;", "addressLink", "paymentCardLink", "creditCardsLink", "credentialsLink", "makePaymentLink", "termsAndConditionsLink", "cardType", "cardTypeDisplayName", "userId", "maskedPan", "createdTs", "createdTsEpoch", "foreGroundColor", "issuerName", "shortDescription", "longDescription", "issuerContactUrl", "issuerContactPhone", "issuerContactEmail", "issuerTermsAndConditionsUrl", "issuerPrivacyPolicyUrl", "privacyPolicyUrl", "addressId", "brandLogo", "brandLogoEcom", "creditCardImage", "creditCardImageEmbossed", "<init>", "(Ljava/lang/String;Lfo2/p;Lfo2/p;Lfo2/p;Lfo2/p;Lfo2/p;Lfo2/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", JWKParameterNames.OCT_KEY_VALUE, "()Ljava/lang/String;", "b", "Lfo2/p;", "()Lfo2/p;", "c", "o", "d", "h", JWKParameterNames.RSA_EXPONENT, "f", "getMakePaymentLink", "g", "getTermsAndConditionsLink", IntegerTokenConverter.CONVERTER_KEY, "getCardTypeDisplayName", "j", "getUserId", "l", "getCreatedTs", "m", "getCreatedTsEpoch", JWKParameterNames.RSA_MODULUS, "getForeGroundColor", "getIssuerName", "p", "getShortDescription", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "getIssuerContactUrl", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "getIssuerContactPhone", "v", "getIssuerContactEmail", "w", "getIssuerTermsAndConditionsUrl", "x", "getIssuerPrivacyPolicyUrl", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "getPrivacyPolicyUrl", "z", "getAddressId", "A", "getBrandLogo", "B", "getBrandLogoEcom", "C", "D", "getCreditCardImageEmbossed", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR;
    public static final Logger E;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @SerializedName("brandLogo")
    private final String brandLogo;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @SerializedName("brandLogoEcom")
    private final String brandLogoEcom;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @SerializedName("creditCardImage")
    private final String creditCardImage;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @SerializedName("creditCardImageEmbossed")
    private final String creditCardImageEmbossed;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("paymentCardId")
    private final String paymentCardId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("addressLink")
    private final p addressLink;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("paymentCardLink")
    private final p paymentCardLink;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("creditCardsLink")
    private final p creditCardsLink;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("credentialsLink")
    private final p credentialsLink;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("makePayment")
    private final p makePaymentLink;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("termsAndConditionsLink")
    private final p termsAndConditionsLink;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cardType")
    private final String cardType;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cardTypeDisplayName")
    private final String cardTypeDisplayName;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userId")
    private final String userId;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maskedPan")
    private final String maskedPan;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createdTs")
    private final String createdTs;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createdTsEpoch")
    private final String createdTsEpoch;

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
    @SerializedName("privacyPolicyUrl")
    private final String privacyPolicyUrl;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @SerializedName("addressId")
    private final String addressId;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            Parcelable.Creator<p> creator = p.CREATOR;
            return new a(string, creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    static {
        new C3846a(null);
        CREATOR = new b();
        int i14 = c.f79010a;
        E = gt2.b.f79005a.h("PAY#NEW_FITPAY#PaymentCard");
    }

    public /* synthetic */ a(String str, p pVar, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? new p(null, false, 3, null) : pVar, (i14 & 4) != 0 ? new p(null, false, 3, null) : pVar2, (i14 & 8) != 0 ? new p(null, false, 3, null) : pVar3, (i14 & 16) != 0 ? new p(null, false, 3, null) : pVar4, (i14 & 32) != 0 ? new p(null, false, 3, null) : pVar5, (i14 & 64) != 0 ? null : pVar6, (i14 & 128) != 0 ? null : str2, (i14 & 256) != 0 ? null : str3, (i14 & 512) != 0 ? null : str4, (i14 & 1024) != 0 ? null : str5, (i14 & 2048) != 0 ? null : str6, (i14 & 4096) != 0 ? null : str7, (i14 & 8192) != 0 ? null : str8, (i14 & 16384) != 0 ? null : str9, (i14 & 32768) != 0 ? null : str10, (i14 & 65536) != 0 ? null : str11, (i14 & 131072) != 0 ? null : str12, (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : str13, (i14 & 524288) != 0 ? null : str14, (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str15, (i14 & 2097152) != 0 ? null : str16, (i14 & 4194304) != 0 ? null : str17, (i14 & 8388608) != 0 ? null : str18, (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : str19, (i14 & 33554432) != 0 ? null : str20, (i14 & 67108864) != 0 ? null : str21, (i14 & 134217728) != 0 ? null : str22);
    }

    public static String m(a aVar) {
        E.debug("getPaymentCardImage: true, " + ((Object) null));
        if (n.d(aVar.creditCardImageEmbossed)) {
            return aVar.creditCardImageEmbossed;
        }
        if (n.d(aVar.creditCardImage)) {
            return aVar.creditCardImage;
        }
        return null;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final p getAddressLink() {
        return this.addressLink;
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
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.paymentCardId, aVar.paymentCardId) && s.g(this.addressLink, aVar.addressLink) && s.g(this.paymentCardLink, aVar.paymentCardLink) && s.g(this.creditCardsLink, aVar.creditCardsLink) && s.g(this.credentialsLink, aVar.credentialsLink) && s.g(this.makePaymentLink, aVar.makePaymentLink) && s.g(this.termsAndConditionsLink, aVar.termsAndConditionsLink) && s.g(this.cardType, aVar.cardType) && s.g(this.cardTypeDisplayName, aVar.cardTypeDisplayName) && s.g(this.userId, aVar.userId) && s.g(this.maskedPan, aVar.maskedPan) && s.g(this.createdTs, aVar.createdTs) && s.g(this.createdTsEpoch, aVar.createdTsEpoch) && s.g(this.foreGroundColor, aVar.foreGroundColor) && s.g(this.issuerName, aVar.issuerName) && s.g(this.shortDescription, aVar.shortDescription) && s.g(this.longDescription, aVar.longDescription) && s.g(this.issuerContactUrl, aVar.issuerContactUrl) && s.g(this.issuerContactPhone, aVar.issuerContactPhone) && s.g(this.issuerContactEmail, aVar.issuerContactEmail) && s.g(this.issuerTermsAndConditionsUrl, aVar.issuerTermsAndConditionsUrl) && s.g(this.issuerPrivacyPolicyUrl, aVar.issuerPrivacyPolicyUrl) && s.g(this.privacyPolicyUrl, aVar.privacyPolicyUrl) && s.g(this.addressId, aVar.addressId) && s.g(this.brandLogo, aVar.brandLogo) && s.g(this.brandLogoEcom, aVar.brandLogoEcom) && s.g(this.creditCardImage, aVar.creditCardImage) && s.g(this.creditCardImageEmbossed, aVar.creditCardImageEmbossed);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final p getCredentialsLink() {
        return this.credentialsLink;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getCreditCardImage() {
        return this.creditCardImage;
    }

    public final String getDisplayName() {
        String str = this.shortDescription;
        if (str != null) {
            return str;
        }
        String str2 = this.longDescription;
        if (str2 != null) {
            return str2;
        }
        String str3 = this.issuerName;
        if (str3 != null) {
            return str3;
        }
        String str4 = this.cardTypeDisplayName;
        return str4 == null ? "" : str4;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final p getCreditCardsLink() {
        return this.creditCardsLink;
    }

    public final int hashCode() {
        int iE = fb1.c.e(this.makePaymentLink, fb1.c.e(this.credentialsLink, fb1.c.e(this.creditCardsLink, fb1.c.e(this.paymentCardLink, fb1.c.e(this.addressLink, this.paymentCardId.hashCode() * 31, 31), 31), 31), 31), 31);
        p pVar = this.termsAndConditionsLink;
        int iHashCode = (iE + (pVar == null ? 0 : pVar.hashCode())) * 31;
        String str = this.cardType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cardTypeDisplayName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.maskedPan;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.createdTs;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.createdTsEpoch;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.foreGroundColor;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.issuerName;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.shortDescription;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.longDescription;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.issuerContactUrl;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.issuerContactPhone;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.issuerContactEmail;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.issuerTermsAndConditionsUrl;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.issuerPrivacyPolicyUrl;
        int iHashCode16 = (iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.privacyPolicyUrl;
        int iHashCode17 = (iHashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.addressId;
        int iHashCode18 = (iHashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.brandLogo;
        int iHashCode19 = (iHashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.brandLogoEcom;
        int iHashCode20 = (iHashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.creditCardImage;
        int iHashCode21 = (iHashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.creditCardImageEmbossed;
        return iHashCode21 + (str21 != null ? str21.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getLongDescription() {
        return this.longDescription;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getMaskedPan() {
        return this.maskedPan;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getPaymentCardId() {
        return this.paymentCardId;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final p getPaymentCardLink() {
        return this.paymentCardLink;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final int q() {
        String str = this.cardType;
        if (str == null) {
            return 0;
        }
        switch (str.hashCode()) {
            case -1553624974:
                if (str.equals("MASTERCARD")) {
                    return qs2.a.f147379h.f147398c;
                }
                return 0;
            case 73257:
                if (str.equals("JCB")) {
                    return qs2.a.f147392w.f147398c;
                }
                return 0;
            case 2634817:
                if (str.equals("VISA")) {
                    return qs2.a.f147378g.f147398c;
                }
                return 0;
            case 1055811561:
                if (str.equals("DISCOVER")) {
                    return qs2.a.f147380i.f147398c;
                }
                return 0;
            case 1512044081:
                if (str.equals("AMERICAN_EXPRESS")) {
                    return qs2.a.f147390t.f147398c;
                }
                return 0;
            case 1545480463:
                if (str.equals("MAESTRO")) {
                    return qs2.a.f147381j.f147398c;
                }
                return 0;
            case 2016591933:
                if (str.equals("DINERS")) {
                    return qs2.a.f147391v.f147398c;
                }
                return 0;
            default:
                return 0;
        }
    }

    public final boolean r() {
        return n.d(this.makePaymentLink.getLink());
    }

    public final String toString() {
        String str = this.paymentCardId;
        String str2 = this.cardType;
        String str3 = this.cardTypeDisplayName;
        String str4 = this.userId;
        String str5 = this.maskedPan;
        String str6 = this.createdTs;
        String str7 = this.createdTsEpoch;
        String str8 = this.foreGroundColor;
        String str9 = this.issuerName;
        String str10 = this.shortDescription;
        String str11 = this.longDescription;
        String str12 = this.issuerContactUrl;
        String str13 = this.issuerContactPhone;
        String str14 = this.issuerContactEmail;
        String str15 = this.issuerTermsAndConditionsUrl;
        String str16 = this.issuerPrivacyPolicyUrl;
        String str17 = this.privacyPolicyUrl;
        String str18 = this.brandLogo;
        String str19 = this.brandLogoEcom;
        String str20 = this.creditCardImage;
        String str21 = this.creditCardImageEmbossed;
        StringBuilder sbI = p6.b.i("PaymentCard(paymentCardId='", str, "', cardType='", str2, "', cardTypeDisplayName='");
        sn.a.t(sbI, str3, "', userId='", str4, "', maskedPan='");
        sn.a.t(sbI, str5, "', createdTs='", str6, "', createdTsEpoch=");
        sn.a.t(sbI, str7, "', foreGroundColor=", str8, "', issuerName=");
        sn.a.t(sbI, str9, "', shortDescription=", str10, "', longDescription=");
        sn.a.t(sbI, str11, "', issuerContactUrl=", str12, "', issuerContactPhone=");
        sn.a.t(sbI, str13, "', issuerContactEmail=", str14, "', issuerTermsAndConditionsUrl=");
        sn.a.t(sbI, str15, "', issuerPrivacyPolicyUrl=", str16, "', privacyPolicyUrl=");
        sn.a.t(sbI, str17, "', brandLogo=", str18, "', brandLogoEcom=");
        sn.a.t(sbI, str19, "', creditCardImage=", str20, "', creditCardImageEmbossed=");
        return am.j.o(str21, ")", sbI);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.paymentCardId);
        this.addressLink.writeToParcel(parcel, i14);
        this.paymentCardLink.writeToParcel(parcel, i14);
        this.creditCardsLink.writeToParcel(parcel, i14);
        this.credentialsLink.writeToParcel(parcel, i14);
        this.makePaymentLink.writeToParcel(parcel, i14);
        p pVar = this.termsAndConditionsLink;
        if (pVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.cardType);
        parcel.writeString(this.cardTypeDisplayName);
        parcel.writeString(this.userId);
        parcel.writeString(this.maskedPan);
        parcel.writeString(this.createdTs);
        parcel.writeString(this.createdTsEpoch);
        parcel.writeString(this.foreGroundColor);
        parcel.writeString(this.issuerName);
        parcel.writeString(this.shortDescription);
        parcel.writeString(this.longDescription);
        parcel.writeString(this.issuerContactUrl);
        parcel.writeString(this.issuerContactPhone);
        parcel.writeString(this.issuerContactEmail);
        parcel.writeString(this.issuerTermsAndConditionsUrl);
        parcel.writeString(this.issuerPrivacyPolicyUrl);
        parcel.writeString(this.privacyPolicyUrl);
        parcel.writeString(this.addressId);
        parcel.writeString(this.brandLogo);
        parcel.writeString(this.brandLogoEcom);
        parcel.writeString(this.creditCardImage);
        parcel.writeString(this.creditCardImageEmbossed);
    }

    /* JADX INFO: renamed from: zo2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzo2/a$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3846a {
        public /* synthetic */ C3846a(j jVar) {
            this();
        }

        private C3846a() {
        }
    }

    public a(String str, p pVar, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22) {
        str.getClass();
        pVar.getClass();
        pVar2.getClass();
        pVar3.getClass();
        pVar4.getClass();
        pVar5.getClass();
        this.paymentCardId = str;
        this.addressLink = pVar;
        this.paymentCardLink = pVar2;
        this.creditCardsLink = pVar3;
        this.credentialsLink = pVar4;
        this.makePaymentLink = pVar5;
        this.termsAndConditionsLink = pVar6;
        this.cardType = str2;
        this.cardTypeDisplayName = str3;
        this.userId = str4;
        this.maskedPan = str5;
        this.createdTs = str6;
        this.createdTsEpoch = str7;
        this.foreGroundColor = str8;
        this.issuerName = str9;
        this.shortDescription = str10;
        this.longDescription = str11;
        this.issuerContactUrl = str12;
        this.issuerContactPhone = str13;
        this.issuerContactEmail = str14;
        this.issuerTermsAndConditionsUrl = str15;
        this.issuerPrivacyPolicyUrl = str16;
        this.privacyPolicyUrl = str17;
        this.addressId = str18;
        this.brandLogo = str19;
        this.brandLogoEcom = str20;
        this.creditCardImage = str21;
        this.creditCardImageEmbossed = str22;
    }
}
