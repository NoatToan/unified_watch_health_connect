package fo2;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.feature.garminpay.providers.gpay.model.Links;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import fo2.d;
import java.lang.String;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b/\b\u0087\b\u0018\u0000*\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u0001*\f\b\u0001\u0010\u0004 \u0001*\u0004\u0018\u00010\u00032\u00020\u0005B\u009f\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\u0006\u0010\t\u001a\u00020\u0001\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\u0006\u0010\u000b\u001a\u00020\u0001\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0001\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u0001\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001e\u001a\u00028\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\b\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\t\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u001a\u0010\n\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(R\u001a\u0010\u000b\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b.\u0010(R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u0010\u000e\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010&\u001a\u0004\b4\u0010(R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b5\u0010(R\u001a\u0010\u0010\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010&\u001a\u0004\b7\u0010(R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010&\u001a\u0004\b9\u0010(R\u001a\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010:\u001a\u0004\b8\u0010;R\u001a\u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b6\u0010>R\u001a\u0010\u0016\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b?\u0010;R\u001a\u0010\u0017\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010=\u001a\u0004\bA\u0010>R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b/\u0010CR\u001a\u0010\u001b\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\b+\u0010FR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010G\u001a\u0004\b%\u0010HR\u001a\u0010\u001e\u001a\u00028\u00018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010I\u001a\u0004\b3\u0010J¨\u0006K"}, d2 = {"Lfo2/i0;", "", "T", "Lfo2/d;", "M", "Landroid/os/Parcelable;", "Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "links", "transitCardId", "productId", "cardType", "productName", "Lfo2/j0;", RemoteConfigConstants.ResponseFieldKey.STATE, "providerName", "credentialId", "userId", "extCardReference", "", "createdTsEpoch", "Lorg/joda/time/DateTime;", "createdTs", "lastModifiedTsEpoch", "lastModifiedTs", "", "balance", "", "ageBeforeDeletableDays", "", "ableToDelete", "cardMetaData", "<init>", "(Lcom/garmin/feature/garminpay/providers/gpay/model/Links;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfo2/j0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLorg/joda/time/DateTime;JLorg/joda/time/DateTime;Ljava/lang/Double;ILjava/lang/Boolean;Lfo2/d;)V", "a", "Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "()Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "b", "Ljava/lang/String;", "z", "()Ljava/lang/String;", "c", "s", "d", "h", JWKParameterNames.RSA_EXPONENT, JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "f", "Lfo2/j0;", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "()Lfo2/j0;", "g", "u", JWKParameterNames.OCT_KEY_VALUE, IntegerTokenConverter.CONVERTER_KEY, "A", "j", "m", "J", "()J", "l", "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, JWKParameterNames.RSA_MODULUS, "o", "Ljava/lang/Double;", "()Ljava/lang/Double;", "p", "I", "()I", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Lfo2/d;", "()Lfo2/d;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i0<T extends String, M extends d> implements Parcelable {
    public static final Parcelable.Creator<i0<?, ?>> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("_links")
    private final Links links;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("transitCardId")
    private final String transitCardId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("productId")
    private final String productId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cardType")
    private final T cardType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("productName")
    private final String productName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.ResponseFieldKey.STATE)
    private final j0 state;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("providerName")
    private final String providerName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("credentialId")
    private final String credentialId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userId")
    private final String userId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("extCardReference")
    private final String extCardReference;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createdTsEpoch")
    private final long createdTsEpoch;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createdTs")
    private final DateTime createdTs;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastModifiedTsEpoch")
    private final long lastModifiedTsEpoch;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastModifiedTs")
    private final DateTime lastModifiedTs;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("balance")
    private final Double balance;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ageBeforeDeletableDays")
    private final int ageBeforeDeletableDays;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ableToDelete")
    private final Boolean ableToDelete;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cardMetaData")
    private final M cardMetaData;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<i0<?, ?>> {
        @Override // android.os.Parcelable.Creator
        public final i0<?, ?> createFromParcel(Parcel parcel) {
            Double dValueOf;
            Boolean bool;
            Boolean boolValueOf;
            parcel.getClass();
            Links links = (Links) parcel.readSerializable();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            j0 j0VarValueOf = j0.valueOf(parcel.readString());
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            long j8 = parcel.readLong();
            DateTime dateTime = (DateTime) parcel.readSerializable();
            long j14 = parcel.readLong();
            DateTime dateTime2 = (DateTime) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                dValueOf = null;
                bool = null;
            } else {
                dValueOf = Double.valueOf(parcel.readDouble());
                bool = null;
            }
            int i14 = parcel.readInt();
            if (parcel.readInt() == 0) {
                boolValueOf = bool;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new i0<>(links, string, string2, string3, string4, j0VarValueOf, string5, string6, string7, string8, j8, dateTime, j14, dateTime2, dValueOf, i14, boolValueOf, (d) (parcel.readInt() == 0 ? bool : d.CREATOR.createFromParcel(parcel)));
        }

        @Override // android.os.Parcelable.Creator
        public final i0<?, ?>[] newArray(int i14) {
            return new i0[i14];
        }
    }

    public i0(Links links, String str, String str2, T t7, String str3, j0 j0Var, String str4, String str5, String str6, String str7, long j8, DateTime dateTime, long j14, DateTime dateTime2, Double d14, int i14, Boolean bool, M m14) {
        links.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        j0Var.getClass();
        str4.getClass();
        str6.getClass();
        dateTime.getClass();
        dateTime2.getClass();
        this.links = links;
        this.transitCardId = str;
        this.productId = str2;
        this.cardType = t7;
        this.productName = str3;
        this.state = j0Var;
        this.providerName = str4;
        this.credentialId = str5;
        this.userId = str6;
        this.extCardReference = str7;
        this.createdTsEpoch = j8;
        this.createdTs = dateTime;
        this.lastModifiedTsEpoch = j14;
        this.lastModifiedTs = dateTime2;
        this.balance = d14;
        this.ageBeforeDeletableDays = i14;
        this.ableToDelete = bool;
        this.cardMetaData = m14;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getAbleToDelete() {
        return this.ableToDelete;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getAgeBeforeDeletableDays() {
        return this.ageBeforeDeletableDays;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return p005kotlin.jvm.internal.s.g(this.links, i0Var.links) && p005kotlin.jvm.internal.s.g(this.transitCardId, i0Var.transitCardId) && p005kotlin.jvm.internal.s.g(this.productId, i0Var.productId) && p005kotlin.jvm.internal.s.g(this.cardType, i0Var.cardType) && p005kotlin.jvm.internal.s.g(this.productName, i0Var.productName) && this.state == i0Var.state && p005kotlin.jvm.internal.s.g(this.providerName, i0Var.providerName) && p005kotlin.jvm.internal.s.g(this.credentialId, i0Var.credentialId) && p005kotlin.jvm.internal.s.g(this.userId, i0Var.userId) && p005kotlin.jvm.internal.s.g(this.extCardReference, i0Var.extCardReference) && this.createdTsEpoch == i0Var.createdTsEpoch && p005kotlin.jvm.internal.s.g(this.createdTs, i0Var.createdTs) && this.lastModifiedTsEpoch == i0Var.lastModifiedTsEpoch && p005kotlin.jvm.internal.s.g(this.lastModifiedTs, i0Var.lastModifiedTs) && p005kotlin.jvm.internal.s.g(this.balance, i0Var.balance) && this.ageBeforeDeletableDays == i0Var.ageBeforeDeletableDays && p005kotlin.jvm.internal.s.g(this.ableToDelete, i0Var.ableToDelete) && p005kotlin.jvm.internal.s.g(this.cardMetaData, i0Var.cardMetaData);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getBalance() {
        return this.balance;
    }

    public final M g() {
        return this.cardMetaData;
    }

    public final T h() {
        return this.cardType;
    }

    public final int hashCode() {
        int iJ = wr.g.j(wr.g.j(this.links.f51142a.hashCode() * 31, 31, this.transitCardId), 31, this.productId);
        T t7 = this.cardType;
        int iJ2 = wr.g.j((this.state.hashCode() + wr.g.j((iJ + (t7 == null ? 0 : t7.hashCode())) * 31, 31, this.productName)) * 31, 31, this.providerName);
        String str = this.credentialId;
        int iJ3 = wr.g.j((iJ2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.userId);
        String str2 = this.extCardReference;
        int iA = ds.e0.a(q6.f.e(ds.e0.a(q6.f.e((iJ3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.createdTsEpoch), this.createdTs, 31), 31, this.lastModifiedTsEpoch), this.lastModifiedTs, 31);
        Double d14 = this.balance;
        int iD = q2.d(this.ageBeforeDeletableDays, (iA + (d14 == null ? 0 : d14.hashCode())) * 31, 31);
        Boolean bool = this.ableToDelete;
        int iHashCode = (iD + (bool == null ? 0 : bool.hashCode())) * 31;
        M m14 = this.cardMetaData;
        return iHashCode + (m14 != null ? m14.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final DateTime getCreatedTs() {
        return this.createdTs;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getCreatedTsEpoch() {
        return this.createdTsEpoch;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getCredentialId() {
        return this.credentialId;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getExtCardReference() {
        return this.extCardReference;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final DateTime getLastModifiedTs() {
        return this.lastModifiedTs;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final long getLastModifiedTsEpoch() {
        return this.lastModifiedTsEpoch;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Links getLinks() {
        return this.links;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    public final String toString() {
        Links links = this.links;
        String str = this.transitCardId;
        String str2 = this.productId;
        T t7 = this.cardType;
        String str3 = this.productName;
        j0 j0Var = this.state;
        String str4 = this.providerName;
        String str5 = this.credentialId;
        String str6 = this.userId;
        String str7 = this.extCardReference;
        long j8 = this.createdTsEpoch;
        DateTime dateTime = this.createdTs;
        long j14 = this.lastModifiedTsEpoch;
        DateTime dateTime2 = this.lastModifiedTs;
        Double d14 = this.balance;
        int i14 = this.ageBeforeDeletableDays;
        Boolean bool = this.ableToDelete;
        M m14 = this.cardMetaData;
        StringBuilder sb3 = new StringBuilder("TransitCard(links=");
        sb3.append(links);
        sb3.append(", transitCardId=");
        sb3.append(str);
        sb3.append(", productId=");
        sn.a.t(sb3, str2, ", cardType=", t7, ", productName=");
        sb3.append(str3);
        sb3.append(", state=");
        sb3.append(j0Var);
        sb3.append(", providerName=");
        sn.a.t(sb3, str4, ", credentialId=", str5, ", userId=");
        sn.a.t(sb3, str6, ", extCardReference=", str7, ", createdTsEpoch=");
        sb3.append(j8);
        sb3.append(", createdTs=");
        sb3.append(dateTime);
        j20.x.j(j14, ", lastModifiedTsEpoch=", ", lastModifiedTs=", sb3);
        sb3.append(dateTime2);
        sb3.append(", balance=");
        sb3.append(d14);
        sb3.append(", ageBeforeDeletableDays=");
        sb3.append(i14);
        sb3.append(", ableToDelete=");
        sb3.append(bool);
        sb3.append(", cardMetaData=");
        sb3.append(m14);
        sb3.append(")");
        return sb3.toString();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getProviderName() {
        return this.providerName;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.links);
        parcel.writeString(this.transitCardId);
        parcel.writeString(this.productId);
        parcel.writeString(this.cardType);
        parcel.writeString(this.productName);
        parcel.writeString(this.state.name());
        parcel.writeString(this.providerName);
        parcel.writeString(this.credentialId);
        parcel.writeString(this.userId);
        parcel.writeString(this.extCardReference);
        parcel.writeLong(this.createdTsEpoch);
        parcel.writeSerializable(this.createdTs);
        parcel.writeLong(this.lastModifiedTsEpoch);
        parcel.writeSerializable(this.lastModifiedTs);
        Double d14 = this.balance;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        parcel.writeInt(this.ageBeforeDeletableDays);
        Boolean bool = this.ableToDelete;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        M m14 = this.cardMetaData;
        if (m14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            m14.writeToParcel(parcel, i14);
        }
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final j0 getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final String getTransitCardId() {
        return this.transitCardId;
    }
}
