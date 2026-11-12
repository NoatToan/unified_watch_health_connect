package fo2;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.gncs.NotificationConstants;
import com.garmin.feature.garminpay.providers.gpay.model.Links;
import com.garmin.feature.garminpay.providers.gpay.snowball.CurrencyValue;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b1\b\u0087\b\u0018\u00002\u00020\u0001B±\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010&R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010$\u001a\u0004\b2\u0010&R\u001a\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010$\u001a\u0004\b4\u0010&R\u001a\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b5\u0010&R\u001a\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010$\u001a\u0004\b6\u0010&R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u00107\u001a\u0004\b8\u00109R\u001a\u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u00109R\u001a\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b)\u0010AR\u001a\u0010\u0016\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010<\u001a\u0004\bB\u0010>R\u001a\u0010\u0017\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010@\u001a\u0004\bD\u0010AR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010E\u001a\u0004\b#\u0010FR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b-\u0010&R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010$\u001a\u0004\b1\u0010&R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010$\u001a\u0004\b3\u0010&¨\u0006I"}, d2 = {"Lfo2/a0;", "Landroid/os/Parcelable;", "Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "links", "", "purchaseId", "transitCardId", NotificationConstants.KEY_DATA_MIME_TYPE, RemoteConfigConstants.ResponseFieldKey.STATE, "Lfo2/x;", "paymentChannel", "userId", "deviceId", "productId", "providerId", "Lcom/garmin/feature/garminpay/providers/gpay/snowball/CurrencyValue;", "totalCost", "totalCredit", "", "createdTsEpoch", "Lorg/joda/time/DateTime;", "createdTs", "lastModifiedTsEpoch", "lastModifiedTs", "Lfo2/c;", "appToAppContext", "credentialId", "extOrderNumber", "extOrderStatus", "<init>", "(Lcom/garmin/feature/garminpay/providers/gpay/model/Links;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfo2/x;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/garmin/feature/garminpay/providers/gpay/snowball/CurrencyValue;Lcom/garmin/feature/garminpay/providers/gpay/snowball/CurrencyValue;JLorg/joda/time/DateTime;JLorg/joda/time/DateTime;Lfo2/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", IntegerTokenConverter.CONVERTER_KEY, "()Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "b", "Ljava/lang/String;", JWKParameterNames.OCT_KEY_VALUE, "()Ljava/lang/String;", "c", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "d", "s", JWKParameterNames.RSA_EXPONENT, "m", "f", "Lfo2/x;", "j", "()Lfo2/x;", "g", "getUserId", "h", "getDeviceId", "getProductId", "getProviderId", "Lcom/garmin/feature/garminpay/providers/gpay/snowball/CurrencyValue;", "o", "()Lcom/garmin/feature/garminpay/providers/gpay/snowball/CurrencyValue;", "l", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "J", "getCreatedTsEpoch", "()J", JWKParameterNames.RSA_MODULUS, "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "getLastModifiedTsEpoch", "p", "getLastModifiedTs", "Lfo2/c;", "()Lfo2/c;", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "v", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a0 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("_links")
    private final Links links;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("purchaseId")
    private final String purchaseId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("transitCardId")
    private final String transitCardId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    private final String type;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.ResponseFieldKey.STATE)
    private final String state;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("paymentChannel")
    private final x paymentChannel;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userId")
    private final String userId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private final String deviceId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("productId")
    private final String productId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("providerId")
    private final String providerId;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalCost")
    private final CurrencyValue totalCost;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalCredit")
    private final CurrencyValue totalCredit;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createdTsEpoch")
    private final long createdTsEpoch;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createdTs")
    private final DateTime createdTs;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastModifiedTsEpoch")
    private final long lastModifiedTsEpoch;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastModifiedTs")
    private final DateTime lastModifiedTs;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("appToAppContext")
    private final c appToAppContext;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("credentialId")
    private final String credentialId;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("extOrderNumber")
    private final String extOrderNumber;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("extOrderStatus")
    private final String extOrderStatus;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<a0> {
        @Override // android.os.Parcelable.Creator
        public final a0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a0((Links) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), x.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (CurrencyValue) parcel.readSerializable(), (CurrencyValue) parcel.readSerializable(), parcel.readLong(), (DateTime) parcel.readSerializable(), parcel.readLong(), (DateTime) parcel.readSerializable(), parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a0[] newArray(int i14) {
            return new a0[i14];
        }
    }

    public a0(Links links, String str, String str2, String str3, String str4, x xVar, String str5, String str6, String str7, String str8, CurrencyValue currencyValue, CurrencyValue currencyValue2, long j8, DateTime dateTime, long j14, DateTime dateTime2, c cVar, String str9, String str10, String str11) {
        links.getClass();
        str.getClass();
        str3.getClass();
        str4.getClass();
        xVar.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        currencyValue.getClass();
        currencyValue2.getClass();
        dateTime.getClass();
        dateTime2.getClass();
        this.links = links;
        this.purchaseId = str;
        this.transitCardId = str2;
        this.type = str3;
        this.state = str4;
        this.paymentChannel = xVar;
        this.userId = str5;
        this.deviceId = str6;
        this.productId = str7;
        this.providerId = str8;
        this.totalCost = currencyValue;
        this.totalCredit = currencyValue2;
        this.createdTsEpoch = j8;
        this.createdTs = dateTime;
        this.lastModifiedTsEpoch = j14;
        this.lastModifiedTs = dateTime2;
        this.appToAppContext = cVar;
        this.credentialId = str9;
        this.extOrderNumber = str10;
        this.extOrderStatus = str11;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getAppToAppContext() {
        return this.appToAppContext;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final DateTime getCreatedTs() {
        return this.createdTs;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return p005kotlin.jvm.internal.s.g(this.links, a0Var.links) && p005kotlin.jvm.internal.s.g(this.purchaseId, a0Var.purchaseId) && p005kotlin.jvm.internal.s.g(this.transitCardId, a0Var.transitCardId) && p005kotlin.jvm.internal.s.g(this.type, a0Var.type) && p005kotlin.jvm.internal.s.g(this.state, a0Var.state) && this.paymentChannel == a0Var.paymentChannel && p005kotlin.jvm.internal.s.g(this.userId, a0Var.userId) && p005kotlin.jvm.internal.s.g(this.deviceId, a0Var.deviceId) && p005kotlin.jvm.internal.s.g(this.productId, a0Var.productId) && p005kotlin.jvm.internal.s.g(this.providerId, a0Var.providerId) && p005kotlin.jvm.internal.s.g(this.totalCost, a0Var.totalCost) && p005kotlin.jvm.internal.s.g(this.totalCredit, a0Var.totalCredit) && this.createdTsEpoch == a0Var.createdTsEpoch && p005kotlin.jvm.internal.s.g(this.createdTs, a0Var.createdTs) && this.lastModifiedTsEpoch == a0Var.lastModifiedTsEpoch && p005kotlin.jvm.internal.s.g(this.lastModifiedTs, a0Var.lastModifiedTs) && p005kotlin.jvm.internal.s.g(this.appToAppContext, a0Var.appToAppContext) && p005kotlin.jvm.internal.s.g(this.credentialId, a0Var.credentialId) && p005kotlin.jvm.internal.s.g(this.extOrderNumber, a0Var.extOrderNumber) && p005kotlin.jvm.internal.s.g(this.extOrderStatus, a0Var.extOrderStatus);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCredentialId() {
        return this.credentialId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getExtOrderNumber() {
        return this.extOrderNumber;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getExtOrderStatus() {
        return this.extOrderStatus;
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.links.f51142a.hashCode() * 31, 31, this.purchaseId);
        String str = this.transitCardId;
        int iA = ds.e0.a(q6.f.e(ds.e0.a(q6.f.e((this.totalCredit.hashCode() + ((this.totalCost.hashCode() + wr.g.j(wr.g.j(wr.g.j(wr.g.j((this.paymentChannel.hashCode() + wr.g.j(wr.g.j((iJ + (str == null ? 0 : str.hashCode())) * 31, 31, this.type), 31, this.state)) * 31, 31, this.userId), 31, this.deviceId), 31, this.productId), 31, this.providerId)) * 31)) * 31, 31, this.createdTsEpoch), this.createdTs, 31), 31, this.lastModifiedTsEpoch), this.lastModifiedTs, 31);
        c cVar = this.appToAppContext;
        int iHashCode = (iA + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str2 = this.credentialId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.extOrderNumber;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.extOrderStatus;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Links getLinks() {
        return this.links;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final x getPaymentChannel() {
        return this.paymentChannel;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getPurchaseId() {
        return this.purchaseId;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final CurrencyValue getTotalCost() {
        return this.totalCost;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final CurrencyValue getTotalCredit() {
        return this.totalCredit;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getTransitCardId() {
        return this.transitCardId;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final String toString() {
        Links links = this.links;
        String str = this.purchaseId;
        String str2 = this.transitCardId;
        String str3 = this.type;
        String str4 = this.state;
        x xVar = this.paymentChannel;
        String str5 = this.userId;
        String str6 = this.deviceId;
        String str7 = this.productId;
        String str8 = this.providerId;
        CurrencyValue currencyValue = this.totalCost;
        CurrencyValue currencyValue2 = this.totalCredit;
        long j8 = this.createdTsEpoch;
        DateTime dateTime = this.createdTs;
        long j14 = this.lastModifiedTsEpoch;
        DateTime dateTime2 = this.lastModifiedTs;
        c cVar = this.appToAppContext;
        String str9 = this.credentialId;
        String str10 = this.extOrderNumber;
        String str11 = this.extOrderStatus;
        StringBuilder sb3 = new StringBuilder("Purchase(links=");
        sb3.append(links);
        sb3.append(", purchaseId=");
        sb3.append(str);
        sb3.append(", transitCardId=");
        sn.a.t(sb3, str2, ", type=", str3, ", state=");
        sb3.append(str4);
        sb3.append(", paymentChannel=");
        sb3.append(xVar);
        sb3.append(", userId=");
        sn.a.t(sb3, str5, ", deviceId=", str6, ", productId=");
        sn.a.t(sb3, str7, ", providerId=", str8, ", totalCost=");
        sb3.append(currencyValue);
        sb3.append(", totalCredit=");
        sb3.append(currencyValue2);
        sb3.append(", createdTsEpoch=");
        sb3.append(j8);
        sb3.append(", createdTs=");
        sb3.append(dateTime);
        j20.x.j(j14, ", lastModifiedTsEpoch=", ", lastModifiedTs=", sb3);
        sb3.append(dateTime2);
        sb3.append(", appToAppContext=");
        sb3.append(cVar);
        sb3.append(", credentialId=");
        sn.a.t(sb3, str9, ", extOrderNumber=", str10, ", extOrderStatus=");
        return am.j.o(str11, ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.links);
        parcel.writeString(this.purchaseId);
        parcel.writeString(this.transitCardId);
        parcel.writeString(this.type);
        parcel.writeString(this.state);
        parcel.writeString(this.paymentChannel.name());
        parcel.writeString(this.userId);
        parcel.writeString(this.deviceId);
        parcel.writeString(this.productId);
        parcel.writeString(this.providerId);
        parcel.writeSerializable(this.totalCost);
        parcel.writeSerializable(this.totalCredit);
        parcel.writeLong(this.createdTsEpoch);
        parcel.writeSerializable(this.createdTs);
        parcel.writeLong(this.lastModifiedTsEpoch);
        parcel.writeSerializable(this.lastModifiedTs);
        c cVar = this.appToAppContext;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.credentialId);
        parcel.writeString(this.extOrderNumber);
        parcel.writeString(this.extOrderStatus);
    }
}
