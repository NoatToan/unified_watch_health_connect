package yo2;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.common.base.Ascii;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d53.u;
import d53.w;
import fo2.p;
import g22.n;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import wr2.k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bG\b\u0087\b\u0018\u00002\u00020\u0001:\u0001.B¡\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b9\u00107R\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b;\u00107R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u00105\u001a\u0004\b=\u00107R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u00105\u001a\u0004\b?\u00107R\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u00105\u001a\u0004\bA\u00107R\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u00105\u001a\u0004\b>\u00107R\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u00105\u001a\u0004\bD\u00107R\u001a\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00105\u001a\u0004\bE\u00107R\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u00105\u001a\u0004\bG\u00107R\u001a\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u00105\u001a\u0004\bI\u00107R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010/\u001a\u0004\bK\u00101R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010/\u001a\u0004\b@\u00101R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010/\u001a\u0004\bN\u00101R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bC\u0010QR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010/\u001a\u0004\bB\u00101R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010/\u001a\u0004\bR\u00101R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010/\u001a\u0004\bT\u00101R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010/\u001a\u0004\bV\u00101R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010/\u001a\u0004\bX\u00101R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010/\u001a\u0004\bY\u00101R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010/\u001a\u0004\bZ\u00101R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010/\u001a\u0004\b\\\u00101R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010/\u001a\u0004\b^\u00101R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010/\u001a\u0004\b`\u00101R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b`\u0010/\u001a\u0004\b_\u00101R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\ba\u0010/\u001a\u0004\b[\u00101R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010/\u001a\u0004\bb\u00101R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010/\u001a\u0004\bc\u00101R\u001c\u0010$\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bd\u00105\u001a\u0004\be\u00107R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bf\u0010/\u001a\u0004\bg\u00101R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bh\u0010/\u001a\u0004\bH\u00101R\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bi\u0010/\u001a\u0004\bj\u00101R\u001c\u0010)\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010k\u001a\u0004\bO\u0010lR\u001c\u0010+\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p¨\u0006q"}, d2 = {"Lyo2/b;", "Landroid/os/Parcelable;", "", "creditCardId", "paymentCardId", "Lfo2/p;", "creditCardLink", "deactivateLink", "reactivateLink", "selectedVerification", "verificationMethods", "webAppCardLink", "acceptTermsLink", "acceptTermsWithAdditionalDataLink", "declineTermsLink", "transactionsLink", "deviceUpdateOperation", "userId", "cardState", "stateReason", "Lop2/a;", "causedBy", "cardType", "externalTokenReference", "deviceId", "tokenLastFour", "labelColor", "foreGroundColor", "issuerName", "shortDescription", "longDescription", "issuerContactUrl", "issuerContactPhone", "issuerContactEmail", "issuerTermsAndConditionsUrl", "issuerPrivacyPolicyUrl", "termsAndConditionsLink", "privacyPolicyUrl", "creditCardImage", "creditCardImageEmbossed", "Lyo2/d;", "creditCardInfo", "Lyo2/e;", "offlineActions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lfo2/p;Lfo2/p;Lfo2/p;Lfo2/p;Lfo2/p;Lfo2/p;Lfo2/p;Lfo2/p;Lfo2/p;Lfo2/p;Lfo2/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lop2/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfo2/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyo2/d;Lyo2/e;)V", "a", "Ljava/lang/String;", JWKParameterNames.OCT_KEY_VALUE, "()Ljava/lang/String;", "b", "M", "c", "Lfo2/p;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "()Lfo2/p;", "d", "s", JWKParameterNames.RSA_EXPONENT, "Z", "f", "getSelectedVerification", "g", "h0", "h", "getWebAppCardLink", IntegerTokenConverter.CONVERTER_KEY, "j", "getAcceptTermsWithAdditionalDataLink", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "l", "g0", "m", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, JWKParameterNames.RSA_MODULUS, "getUserId", "o", "p", "c0", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "Lop2/a;", "()Lop2/a;", "z", "v", "u", "w", "getTokenLastFour", "x", "getLabelColor", "getForeGroundColor", "F", "A", "a0", "B", "I", "C", "D", "E", "H", "G", "P", "e0", "T", "getPrivacyPolicyUrl", "X", "Y", "getCreditCardImageEmbossed", "Lyo2/d;", "()Lyo2/d;", "k0", "Lyo2/e;", "getOfflineActions", "()Lyo2/e;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR;
    public static final Logger H0;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @SerializedName("shortDescription")
    private final String shortDescription;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @SerializedName("longDescription")
    private final String longDescription;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @SerializedName("issuerContactUrl")
    private final String issuerContactUrl;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @SerializedName("issuerContactPhone")
    private final String issuerContactPhone;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @SerializedName("issuerContactEmail")
    private final String issuerContactEmail;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @SerializedName("issuerTermsAndConditionsUrl")
    private final String issuerTermsAndConditionsUrl;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @SerializedName("issuerPrivacyPolicyUrl")
    private final String issuerPrivacyPolicyUrl;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @SerializedName("termsAndConditionsLink")
    private final p termsAndConditionsLink;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @SerializedName("privacyPolicyUrl")
    private final String privacyPolicyUrl;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @SerializedName("creditCardImage")
    private final String creditCardImage;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @SerializedName("creditCardImageEmbossed")
    private final String creditCardImageEmbossed;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @SerializedName("creditCardInfo")
    private final d creditCardInfo;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("creditCardId")
    private final String creditCardId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("paymentCardId")
    private final String paymentCardId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("creditCardLink")
    private final p creditCardLink;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deactivateLink")
    private final p deactivateLink;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reactivateLink")
    private final p reactivateLink;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("selectedVerification")
    private final p selectedVerification;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("verificationMethods")
    private final p verificationMethods;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("webAppCardLink")
    private final p webAppCardLink;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("acceptTermsLink")
    private final p acceptTermsLink;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("acceptTermsWithAdditionalDataLink")
    private final p acceptTermsWithAdditionalDataLink;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("declineTermsLink")
    private final p declineTermsLink;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("offlineActions")
    private final e offlineActions;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("transactionsLink")
    private final p transactionsLink;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceUpdateOperation")
    private final p deviceUpdateOperation;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userId")
    private final String userId;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cardState")
    private final String cardState;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("stateReason")
    private final String stateReason;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("causedBy")
    private final op2.a causedBy;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cardType")
    private final String cardType;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("externalTokenReference")
    private final String externalTokenReference;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private final String deviceId;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tokenLastFour")
    private final String tokenLastFour;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @SerializedName("labelColor")
    private final String labelColor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @SerializedName("foreGroundColor")
    private final String foreGroundColor;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @SerializedName("issuerName")
    private final String issuerName;

    /* JADX INFO: renamed from: yo2.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3718b implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            Parcelable.Creator<p> creator = p.CREATOR;
            return new b(string, string2, creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : op2.a.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new C3718b();
        int i14 = gt2.c.f79010a;
        H0 = gt2.b.f79005a.h("PAY#NEW_FITPAY#NewCreditCard");
    }

    public /* synthetic */ b(String str, String str2, p pVar, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, p pVar7, p pVar8, p pVar9, p pVar10, p pVar11, String str3, String str4, String str5, op2.a aVar, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, p pVar12, String str20, String str21, String str22, d dVar, e eVar, int i14, int i15, j jVar) {
        this(str, str2, (i14 & 4) != 0 ? new p(null, false, 3, null) : pVar, (i14 & 8) != 0 ? new p(null, false, 3, null) : pVar2, (i14 & 16) != 0 ? new p(null, false, 3, null) : pVar3, (i14 & 32) != 0 ? new p(null, false, 3, null) : pVar4, (i14 & 64) != 0 ? new p(null, false, 3, null) : pVar5, (i14 & 128) != 0 ? new p(null, false, 3, null) : pVar6, (i14 & 256) != 0 ? new p(null, false, 3, null) : pVar7, (i14 & 512) != 0 ? new p(null, false, 3, null) : pVar8, (i14 & 1024) != 0 ? new p(null, false, 3, null) : pVar9, (i14 & 2048) != 0 ? new p(null, false, 3, null) : pVar10, (i14 & 4096) != 0 ? new p(null, false, 3, null) : pVar11, (i14 & 8192) != 0 ? null : str3, str4, (32768 & i14) != 0 ? null : str5, (65536 & i14) != 0 ? null : aVar, (131072 & i14) != 0 ? null : str6, (262144 & i14) != 0 ? null : str7, (524288 & i14) != 0 ? null : str8, (1048576 & i14) != 0 ? null : str9, (2097152 & i14) != 0 ? null : str10, (4194304 & i14) != 0 ? null : str11, (8388608 & i14) != 0 ? null : str12, (16777216 & i14) != 0 ? null : str13, (33554432 & i14) != 0 ? null : str14, (67108864 & i14) != 0 ? null : str15, (134217728 & i14) != 0 ? null : str16, (268435456 & i14) != 0 ? null : str17, (536870912 & i14) != 0 ? null : str18, (1073741824 & i14) != 0 ? null : str19, (i14 & Integer.MIN_VALUE) != 0 ? null : pVar12, (i15 & 1) != 0 ? null : str20, (i15 & 2) != 0 ? null : str21, (i15 & 4) != 0 ? null : str22, (i15 & 8) != 0 ? null : dVar, (i15 & 16) != 0 ? null : eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String o(b bVar, o13.p pVar, int i14) {
        String str;
        boolean z14 = (i14 & 1) != 0;
        o13.p pVar2 = (i14 & 2) != 0 ? null : pVar;
        bVar.getClass();
        H0.debug("getCreditCardImage: " + z14 + ", " + pVar2);
        if (z14 && n.d(bVar.creditCardImageEmbossed)) {
            str = bVar.creditCardImageEmbossed;
        } else {
            str = n.d(bVar.creditCardImage) ? bVar.creditCardImage : null;
        }
        if (pVar2 == null) {
            return str;
        }
        if (str != null) {
            try {
                Uri uri = Uri.parse(str);
                int iIntValue = ((Number) pVar2.f128594a).intValue();
                int iIntValue2 = ((Number) pVar2.f128595b).intValue();
                String queryParameter = uri.getQueryParameter(c.a.FONT_SCALE.f198586a);
                int i15 = queryParameter != null ? Integer.parseInt(queryParameter) : -1;
                String queryParameter2 = uri.getQueryParameter(c.a.TEXT_POSITION_X_SCALE.f198586a);
                float f14 = queryParameter2 != null ? Float.parseFloat(queryParameter2) : 0.95f;
                String queryParameter3 = uri.getQueryParameter(c.a.TEXT_POSITION_Y_SCALE.f198586a);
                float f15 = queryParameter3 != null ? Float.parseFloat(queryParameter3) : 0.125f;
                String queryParameter4 = uri.getQueryParameter(c.a.EMBOSSED_TEXT.f198586a);
                if (TextUtils.isEmpty(queryParameter4)) {
                    d dVar = bVar.creditCardInfo;
                    String strF = dVar != null ? dVar.getPan() : null;
                    if (strF != null && strF.length() >= 4) {
                        queryParameter4 = "%E2%80%A2%E2%80%A2%E2%80%A2%E2%80%A2 ".concat(strF.substring(strF.length() - 4));
                    }
                }
                if (queryParameter4 == null) {
                    queryParameter4 = "";
                }
                String str2 = queryParameter4;
                String queryParameter5 = uri.getQueryParameter(c.a.EMBOSSED_TEXT_FOREGROUND.f198586a);
                if (queryParameter5 == null && (queryParameter5 = bVar.foreGroundColor) == null) {
                    queryParameter5 = "ffffff";
                }
                String str3 = queryParameter5;
                String queryParameter6 = uri.getQueryParameter(c.a.FONT_NAME.f198586a);
                if (queryParameter6 == null) {
                    queryParameter6 = "Arial";
                }
                String str4 = queryParameter6;
                String queryParameter7 = uri.getQueryParameter(c.a.FONT_BOLD.f198586a);
                return new c(iIntValue, iIntValue2, str2, str3, i15, f14, f15, str4, queryParameter7 != null ? Boolean.parseBoolean(queryParameter7) : false, true).a(str);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final String getIssuerContactEmail() {
        return this.issuerContactEmail;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final String getIssuerContactPhone() {
        return this.issuerContactPhone;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final String getIssuerContactUrl() {
        return this.issuerContactUrl;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final String getIssuerName() {
        return this.issuerName;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final String getIssuerPrivacyPolicyUrl() {
        return this.issuerPrivacyPolicyUrl;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final String getIssuerTermsAndConditionsUrl() {
        return this.issuerTermsAndConditionsUrl;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final String getLongDescription() {
        return this.longDescription;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final String getPaymentCardId() {
        return this.paymentCardId;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final p getReactivateLink() {
        return this.reactivateLink;
    }

    /* JADX INFO: renamed from: a0, reason: from getter */
    public final String getShortDescription() {
        return this.shortDescription;
    }

    public final byte[] b() {
        String strF;
        byte[] bytes;
        Integer numB;
        Logger logger = H0;
        e eVar = this.offlineActions;
        byte[] bArrCopyOfRange = null;
        List<xo2.a> list = eVar != null ? eVar.f198593a : null;
        d dVar = this.creditCardInfo;
        if (dVar == null || (strF = dVar.getPan()) == null) {
            strF = "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                try {
                    try {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                        d dVar2 = this.creditCardInfo;
                        if (dVar2 != null && (numB = dVar2.getExpMonth()) != null) {
                            byteArrayOutputStream.write(byteBufferAllocate.putInt(numB.intValue()).array());
                            byteBufferAllocate.clear();
                        }
                        d dVar3 = this.creditCardInfo;
                        if (dVar3 != null && dVar3.getExpYear() != null) {
                            byteArrayOutputStream.write(byteBufferAllocate.putInt(this.creditCardInfo.getExpYear().intValue()).array());
                            byteBufferAllocate.clear();
                        }
                        String str = this.shortDescription;
                        if (str != null) {
                            byte[] bytes2 = str.getBytes(d53.c.f57666b);
                            bytes2.getClass();
                            byteArrayOutputStream.write(bytes2);
                        }
                        if (list != null) {
                            if (list.isEmpty()) {
                                logger.error("computeCreditCardHash: no top of wallet apdu commands found");
                            } else {
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    byte[] bArrD = ((xo2.a) it.next()).d();
                                    if (bArrD != null) {
                                        if (!(bArrD.length == 0)) {
                                            byteArrayOutputStream.write(bArrD);
                                        }
                                    }
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(strF)) {
                            byte[] bytes3 = strF.getBytes(d53.c.f57666b);
                            bytes3.getClass();
                            byteArrayOutputStream.write(bytes3);
                        }
                        String str2 = this.cardType;
                        if (str2 != null && str2.length() != 0) {
                            byte[] bytes4 = this.cardType.getBytes(d53.c.f57666b);
                            bytes4.getClass();
                            byteArrayOutputStream.write(bytes4);
                        }
                        String str3 = this.issuerName;
                        if (str3 != null && str3.length() != 0) {
                            byte[] bytes5 = this.issuerName.getBytes(d53.c.f57666b);
                            bytes5.getClass();
                            byteArrayOutputStream.write(bytes5);
                        }
                        String str4 = this.cardState;
                        if (str4 != null && str4.length() != 0) {
                            if (u.q(this.cardState, "ACTIVE", true)) {
                                bytes = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.getBytes(d53.c.f57666b);
                                bytes.getClass();
                            } else {
                                bytes = "0".getBytes(d53.c.f57666b);
                                bytes.getClass();
                            }
                            byteArrayOutputStream.write(bytes);
                        }
                        String str5 = this.labelColor;
                        if (str5 != null && str5.length() != 0) {
                            byte[] bytes6 = this.labelColor.getBytes(d53.c.f57666b);
                            bytes6.getClass();
                            byteArrayOutputStream.write(bytes6);
                        }
                        byteArrayOutputStream.flush();
                        MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
                        messageDigest.update(byteArrayOutputStream.toByteArray());
                        bArrCopyOfRange = Arrays.copyOfRange(messageDigest.digest(), 0, 8);
                    } catch (Throwable th3) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e4) {
                            logger.error("computeCreditCardHash: computeCreditCardHash", (Throwable) e4);
                        }
                        throw th3;
                    }
                } catch (IOException e14) {
                    logger.error("computeCreditCardHash: computeCreditCardHash", (Throwable) e14);
                }
            } catch (NoSuchAlgorithmException e15) {
                logger.error("computeCreditCardHash: computeCreditCardHash", (Throwable) e15);
            }
        } catch (NullPointerException e16) {
            logger.error("computeCreditCardHash: computeCreditCardHash", (Throwable) e16);
        }
        try {
            byteArrayOutputStream.close();
        } catch (IOException e17) {
            logger.error("computeCreditCardHash: computeCreditCardHash", (Throwable) e17);
        }
        if (bArrCopyOfRange != null) {
            logger.debug("computeCreditCardHash: returning hash " + aq2.h.a(bArrCopyOfRange) + " for PAN " + strF);
        } else {
            logger.error("computeCreditCardHash: returning NULL hash for PAN ".concat(strF));
        }
        return bArrCopyOfRange;
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final String getStateReason() {
        return this.stateReason;
    }

    public final com.garmin.device.nfc.h[] d() {
        int size;
        Integer numD;
        Integer numB;
        byte[] bArrB = b();
        Logger logger = H0;
        if (bArrB == null) {
            logger.error("createTlv: hash is null, execution halted");
            return null;
        }
        d dVar = this.creditCardInfo;
        String strF = dVar != null ? dVar.getPan() : null;
        String str = this.cardState;
        if (strF == null || str == null) {
            logger.error("createTlv: cardMetaData is null, execution halted");
            return null;
        }
        com.garmin.device.nfc.h[] hVarArr = new com.garmin.device.nfc.h[10];
        String strSubstring = strF.substring(strF.length() - 4);
        UUID uuidFromString = UUID.fromString(this.creditCardId);
        uuidFromString.getClass();
        byte[] bArrArray = ByteBuffer.allocate(16).putLong(uuidFromString.getMostSignificantBits()).putLong(uuidFromString.getLeastSignificantBits()).array();
        bArrArray.getClass();
        hVarArr[0] = com.garmin.device.nfc.h.i(bArrArray);
        String str2 = this.cardType;
        if (str2 == null) {
            str2 = "    ";
        }
        hVarArr[1] = com.garmin.device.nfc.h.h(str2);
        String str3 = this.issuerName;
        if (str3 == null) {
            str3 = "    ";
        }
        hVarArr[2] = new com.garmin.device.nfc.h(com.garmin.device.nfc.h.c.TAG_ISSUER_NAME, str3.getBytes());
        hVarArr[3] = new com.garmin.device.nfc.h(com.garmin.device.nfc.h.c.TAG_CARD_ACTIVE, new byte[]{s.g(this.cardState, "ACTIVE") ? (byte) 1 : (byte) 0});
        int i14 = Integer.parseInt(strSubstring);
        hVarArr[4] = new com.garmin.device.nfc.h(com.garmin.device.nfc.h.c.TAG_PAN, new byte[]{(byte) i14, (byte) (i14 >> 8)});
        hVarArr[5] = new com.garmin.device.nfc.h(com.garmin.device.nfc.h.c.TAG_CREDIT_CARD_HASH, bArrB);
        d dVar2 = this.creditCardInfo;
        hVarArr[6] = new com.garmin.device.nfc.h(com.garmin.device.nfc.h.c.TAG_EXP_MONTH, new byte[]{(byte) ((dVar2 == null || (numB = dVar2.getExpMonth()) == null) ? 0 : numB.intValue())});
        d dVar3 = this.creditCardInfo;
        int iIntValue = (dVar3 == null || (numD = dVar3.getExpYear()) == null) ? 0 : numD.intValue();
        hVarArr[7] = new com.garmin.device.nfc.h(com.garmin.device.nfc.h.c.TAG_EXP_YEAR, new byte[]{(byte) iIntValue, (byte) (iIntValue >> 8)});
        String str4 = this.shortDescription;
        hVarArr[8] = new com.garmin.device.nfc.h(com.garmin.device.nfc.h.c.TAG_DESCRIPTION, (str4 != null ? str4 : "    ").getBytes());
        e eVar = this.offlineActions;
        List<xo2.a> list = eVar != null ? eVar.f198593a : null;
        if (list != null) {
            size = list.size();
            if (size > 0) {
                byte[] bArrD = ((xo2.a) com.airbnb.lottie.animation.keyframe.a.c(1, list)).d();
                if (bArrD != null && bArrD.length > 1 && bArrD[1] == -16) {
                    try {
                        bArrD[1] = -63;
                        bArrD[2] = 0;
                        bArrD[3] = 0;
                        int length = bArrD.length;
                        byte[] bArr = new byte[length - 2];
                        try {
                            System.arraycopy(bArrD, 0, bArr, 0, 4);
                            System.arraycopy(bArrD, 6, bArr, 4, length - 6);
                            bArrD = bArr;
                        } catch (Exception unused) {
                            bArrD = bArr;
                            logger.error("Bad TOW Command");
                        }
                    } catch (Exception unused2) {
                    }
                }
                hVarArr[9] = new com.garmin.device.nfc.h(com.garmin.device.nfc.h.c.TAG_TOP_OF_WALLET_APDU, bArrD);
            }
        } else {
            size = 0;
        }
        String strE = sn.a.e(size, "createTlv: ", " TOW commands, card ", strSubstring);
        if (size > 0) {
            logger.debug(strE);
        } else {
            logger.error(strE);
        }
        return (com.garmin.device.nfc.h[]) p13.u.C(hVarArr).toArray(new com.garmin.device.nfc.h[0]);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final p getTermsAndConditionsLink() {
        return this.termsAndConditionsLink;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.creditCardId, bVar.creditCardId) && s.g(this.paymentCardId, bVar.paymentCardId) && s.g(this.creditCardLink, bVar.creditCardLink) && s.g(this.deactivateLink, bVar.deactivateLink) && s.g(this.reactivateLink, bVar.reactivateLink) && s.g(this.selectedVerification, bVar.selectedVerification) && s.g(this.verificationMethods, bVar.verificationMethods) && s.g(this.webAppCardLink, bVar.webAppCardLink) && s.g(this.acceptTermsLink, bVar.acceptTermsLink) && s.g(this.acceptTermsWithAdditionalDataLink, bVar.acceptTermsWithAdditionalDataLink) && s.g(this.declineTermsLink, bVar.declineTermsLink) && s.g(this.transactionsLink, bVar.transactionsLink) && s.g(this.deviceUpdateOperation, bVar.deviceUpdateOperation) && s.g(this.userId, bVar.userId) && s.g(this.cardState, bVar.cardState) && s.g(this.stateReason, bVar.stateReason) && this.causedBy == bVar.causedBy && s.g(this.cardType, bVar.cardType) && s.g(this.externalTokenReference, bVar.externalTokenReference) && s.g(this.deviceId, bVar.deviceId) && s.g(this.tokenLastFour, bVar.tokenLastFour) && s.g(this.labelColor, bVar.labelColor) && s.g(this.foreGroundColor, bVar.foreGroundColor) && s.g(this.issuerName, bVar.issuerName) && s.g(this.shortDescription, bVar.shortDescription) && s.g(this.longDescription, bVar.longDescription) && s.g(this.issuerContactUrl, bVar.issuerContactUrl) && s.g(this.issuerContactPhone, bVar.issuerContactPhone) && s.g(this.issuerContactEmail, bVar.issuerContactEmail) && s.g(this.issuerTermsAndConditionsUrl, bVar.issuerTermsAndConditionsUrl) && s.g(this.issuerPrivacyPolicyUrl, bVar.issuerPrivacyPolicyUrl) && s.g(this.termsAndConditionsLink, bVar.termsAndConditionsLink) && s.g(this.privacyPolicyUrl, bVar.privacyPolicyUrl) && s.g(this.creditCardImage, bVar.creditCardImage) && s.g(this.creditCardImageEmbossed, bVar.creditCardImageEmbossed) && s.g(this.creditCardInfo, bVar.creditCardInfo) && s.g(this.offlineActions, bVar.offlineActions);
    }

    public final String f() {
        String strValueOf;
        d dVar = this.creditCardInfo;
        if ((dVar != null ? dVar.getPan() : null) == null || TextUtils.isEmpty(this.creditCardInfo.getPan()) || w.i0(this.creditCardInfo.getPan()).toString().length() < 4) {
            strValueOf = String.valueOf(new Random().nextInt(10000));
        } else {
            try {
                strValueOf = this.creditCardInfo.getPan().substring(this.creditCardInfo.getPan().length() - 4);
            } catch (Exception unused) {
                strValueOf = String.valueOf(new Random().nextInt(10000));
            }
        }
        k kVar = k.f186863a;
        String[] strArr = {this.cardType, strValueOf, this.issuerName};
        kVar.getClass();
        String strP = p13.u.P(strArr, ":", null, null, null, 62);
        MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
        byte[] bytes = strP.getBytes(d53.c.f57666b);
        bytes.getClass();
        byte[] bArrDigest = messageDigest.digest(bytes);
        StringBuilder sb3 = new StringBuilder(bArrDigest.length * 2);
        for (byte b14 : bArrDigest) {
            sb3.append("0123456789ABCDEF".charAt((b14 >> 4) & 15));
            sb3.append("0123456789ABCDEF".charAt(b14 & Ascii.SI));
        }
        return sb3.toString();
    }

    public final String f0(boolean z14) {
        String strSubstring;
        String strF;
        if (n.d(this.tokenLastFour)) {
            strSubstring = this.tokenLastFour;
        } else {
            d dVar = this.creditCardInfo;
            strSubstring = (dVar == null || (strF = dVar.getPan()) == null) ? null : strF.substring(strF.length() - 4);
        }
        if (strSubstring != null) {
            return z14 ? "•••• ".concat(strSubstring) : strSubstring;
        }
        return null;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final p getAcceptTermsLink() {
        return this.acceptTermsLink;
    }

    /* JADX INFO: renamed from: g0, reason: from getter */
    public final p getTransactionsLink() {
        return this.transactionsLink;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getCardState() {
        return this.cardState;
    }

    /* JADX INFO: renamed from: h0, reason: from getter */
    public final p getVerificationMethods() {
        return this.verificationMethods;
    }

    public final int hashCode() {
        int iE = fb1.c.e(this.deviceUpdateOperation, fb1.c.e(this.transactionsLink, fb1.c.e(this.declineTermsLink, fb1.c.e(this.acceptTermsWithAdditionalDataLink, fb1.c.e(this.acceptTermsLink, fb1.c.e(this.webAppCardLink, fb1.c.e(this.verificationMethods, fb1.c.e(this.selectedVerification, fb1.c.e(this.reactivateLink, fb1.c.e(this.deactivateLink, fb1.c.e(this.creditCardLink, wr.g.j(this.creditCardId.hashCode() * 31, 31, this.paymentCardId), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        String str = this.userId;
        int iJ = wr.g.j((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.cardState);
        String str2 = this.stateReason;
        int iHashCode = (iJ + (str2 == null ? 0 : str2.hashCode())) * 31;
        op2.a aVar = this.causedBy;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str3 = this.cardType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.externalTokenReference;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.deviceId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.tokenLastFour;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.labelColor;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.foreGroundColor;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.issuerName;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.shortDescription;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.longDescription;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.issuerContactUrl;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.issuerContactPhone;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.issuerContactEmail;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.issuerTermsAndConditionsUrl;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.issuerPrivacyPolicyUrl;
        int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        p pVar = this.termsAndConditionsLink;
        int iHashCode17 = (iHashCode16 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        String str17 = this.privacyPolicyUrl;
        int iHashCode18 = (iHashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.creditCardImage;
        int iHashCode19 = (iHashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.creditCardImageEmbossed;
        int iHashCode20 = (iHashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        d dVar = this.creditCardInfo;
        int iHashCode21 = (iHashCode20 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        e eVar = this.offlineActions;
        return iHashCode21 + (eVar != null ? eVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getCardType() {
        return this.cardType;
    }

    public final void i0() {
        String link;
        p pVar = this.acceptTermsLink;
        if (pVar == null || (link = pVar.getLink()) == null) {
            return;
        }
        String strC0 = w.c0(link, "sessionData=", link);
        wr2.p pVar2 = wr2.p.f186870a;
        String str = this.creditCardId;
        pVar2.getClass();
        wr2.p.f("dynamic_feature_app", str, strC0);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final op2.a getCausedBy() {
        return this.causedBy;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getCreditCardId() {
        return this.creditCardId;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getCreditCardImage() {
        return this.creditCardImage;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final d getCreditCardInfo() {
        return this.creditCardInfo;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final p getCreditCardLink() {
        return this.creditCardLink;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final p getDeactivateLink() {
        return this.deactivateLink;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final p getDeclineTermsLink() {
        return this.declineTermsLink;
    }

    public final String toString() {
        String str = this.creditCardId;
        String str2 = this.paymentCardId;
        p pVar = this.creditCardLink;
        p pVar2 = this.deactivateLink;
        p pVar3 = this.reactivateLink;
        p pVar4 = this.selectedVerification;
        p pVar5 = this.verificationMethods;
        p pVar6 = this.webAppCardLink;
        p pVar7 = this.acceptTermsLink;
        p pVar8 = this.acceptTermsWithAdditionalDataLink;
        p pVar9 = this.declineTermsLink;
        p pVar10 = this.transactionsLink;
        p pVar11 = this.deviceUpdateOperation;
        String str3 = this.userId;
        String str4 = this.cardState;
        String str5 = this.stateReason;
        op2.a aVar = this.causedBy;
        String str6 = this.cardType;
        String str7 = this.externalTokenReference;
        String str8 = this.deviceId;
        String str9 = this.tokenLastFour;
        String str10 = this.labelColor;
        String str11 = this.foreGroundColor;
        String str12 = this.issuerName;
        String str13 = this.shortDescription;
        String str14 = this.longDescription;
        String str15 = this.issuerContactUrl;
        String str16 = this.issuerContactPhone;
        String str17 = this.issuerContactEmail;
        String str18 = this.issuerTermsAndConditionsUrl;
        String str19 = this.issuerPrivacyPolicyUrl;
        p pVar12 = this.termsAndConditionsLink;
        String str20 = this.privacyPolicyUrl;
        String str21 = this.creditCardImage;
        String str22 = this.creditCardImageEmbossed;
        d dVar = this.creditCardInfo;
        e eVar = this.offlineActions;
        StringBuilder sbI = p6.b.i("NewCreditCard(creditCardId=", str, ", paymentCardId=", str2, ", creditCardLink=");
        sbI.append(pVar);
        sbI.append(", deactivateLink=");
        sbI.append(pVar2);
        sbI.append(", reactivateLink=");
        sbI.append(pVar3);
        sbI.append(", selectedVerification=");
        sbI.append(pVar4);
        sbI.append(", verificationMethods=");
        sbI.append(pVar5);
        sbI.append(", webAppCardLink=");
        sbI.append(pVar6);
        sbI.append(", acceptTermsLink=");
        sbI.append(pVar7);
        sbI.append(", acceptTermsWithAdditionalDataLink=");
        sbI.append(pVar8);
        sbI.append(", declineTermsLink=");
        sbI.append(pVar9);
        sbI.append(", transactionsLink=");
        sbI.append(pVar10);
        sbI.append(", deviceUpdateOperation=");
        sbI.append(pVar11);
        sbI.append(", userId=");
        sbI.append(str3);
        sbI.append(", cardState=");
        sn.a.t(sbI, str4, ", stateReason=", str5, ", causedBy=");
        sbI.append(aVar);
        sbI.append(", cardType=");
        sbI.append(str6);
        sbI.append(", externalTokenReference=");
        sn.a.t(sbI, str7, ", deviceId=", str8, ", tokenLastFour=");
        sn.a.t(sbI, str9, ", labelColor=", str10, ", foreGroundColor=");
        sn.a.t(sbI, str11, ", issuerName=", str12, ", shortDescription=");
        sn.a.t(sbI, str13, ", longDescription=", str14, ", issuerContactUrl=");
        sn.a.t(sbI, str15, ", issuerContactPhone=", str16, ", issuerContactEmail=");
        sn.a.t(sbI, str17, ", issuerTermsAndConditionsUrl=", str18, ", issuerPrivacyPolicyUrl=");
        sbI.append(str19);
        sbI.append(", termsAndConditionsLink=");
        sbI.append(pVar12);
        sbI.append(", privacyPolicyUrl=");
        sn.a.t(sbI, str20, ", creditCardImage=", str21, ", creditCardImageEmbossed=");
        sbI.append(str22);
        sbI.append(", creditCardInfo=");
        sbI.append(dVar);
        sbI.append(", offlineActions=");
        sbI.append(eVar);
        sbI.append(")");
        return sbI.toString();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.creditCardId);
        parcel.writeString(this.paymentCardId);
        this.creditCardLink.writeToParcel(parcel, i14);
        this.deactivateLink.writeToParcel(parcel, i14);
        this.reactivateLink.writeToParcel(parcel, i14);
        this.selectedVerification.writeToParcel(parcel, i14);
        this.verificationMethods.writeToParcel(parcel, i14);
        this.webAppCardLink.writeToParcel(parcel, i14);
        this.acceptTermsLink.writeToParcel(parcel, i14);
        this.acceptTermsWithAdditionalDataLink.writeToParcel(parcel, i14);
        this.declineTermsLink.writeToParcel(parcel, i14);
        this.transactionsLink.writeToParcel(parcel, i14);
        this.deviceUpdateOperation.writeToParcel(parcel, i14);
        parcel.writeString(this.userId);
        parcel.writeString(this.cardState);
        parcel.writeString(this.stateReason);
        op2.a aVar = this.causedBy;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(aVar.name());
        }
        parcel.writeString(this.cardType);
        parcel.writeString(this.externalTokenReference);
        parcel.writeString(this.deviceId);
        parcel.writeString(this.tokenLastFour);
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
        d dVar = this.creditCardInfo;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar.writeToParcel(parcel, i14);
        }
        e eVar = this.offlineActions;
        if (eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar.writeToParcel(parcel, i14);
        }
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final p getDeviceUpdateOperation() {
        return this.deviceUpdateOperation;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final String getExternalTokenReference() {
        return this.externalTokenReference;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lyo2/b$a;", "", "<init>", "()V", "", "HIDDEN_DIGITS", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public b(String str, String str2, p pVar, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, p pVar7, p pVar8, p pVar9, p pVar10, p pVar11, String str3, String str4, String str5, op2.a aVar, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, p pVar12, String str20, String str21, String str22, d dVar, e eVar) {
        str.getClass();
        str2.getClass();
        pVar.getClass();
        pVar2.getClass();
        pVar3.getClass();
        pVar4.getClass();
        pVar5.getClass();
        pVar6.getClass();
        pVar7.getClass();
        pVar8.getClass();
        pVar9.getClass();
        pVar10.getClass();
        pVar11.getClass();
        str4.getClass();
        this.creditCardId = str;
        this.paymentCardId = str2;
        this.creditCardLink = pVar;
        this.deactivateLink = pVar2;
        this.reactivateLink = pVar3;
        this.selectedVerification = pVar4;
        this.verificationMethods = pVar5;
        this.webAppCardLink = pVar6;
        this.acceptTermsLink = pVar7;
        this.acceptTermsWithAdditionalDataLink = pVar8;
        this.declineTermsLink = pVar9;
        this.transactionsLink = pVar10;
        this.deviceUpdateOperation = pVar11;
        this.userId = str3;
        this.cardState = str4;
        this.stateReason = str5;
        this.causedBy = aVar;
        this.cardType = str6;
        this.externalTokenReference = str7;
        this.deviceId = str8;
        this.tokenLastFour = str9;
        this.labelColor = str10;
        this.foreGroundColor = str11;
        this.issuerName = str12;
        this.shortDescription = str13;
        this.longDescription = str14;
        this.issuerContactUrl = str15;
        this.issuerContactPhone = str16;
        this.issuerContactEmail = str17;
        this.issuerTermsAndConditionsUrl = str18;
        this.issuerPrivacyPolicyUrl = str19;
        this.termsAndConditionsLink = pVar12;
        this.privacyPolicyUrl = str20;
        this.creditCardImage = str21;
        this.creditCardImageEmbossed = str22;
        this.creditCardInfo = dVar;
        this.offlineActions = eVar;
    }
}
