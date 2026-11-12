package fo2;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.feature.garminpay.providers.gpay.model.Links;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b \u0010\u001dR\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u001b\u001a\u0004\b$\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b2\u0010,R\u001a\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b4\u00100R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u00069"}, d2 = {"Lfo2/c0;", "Landroid/os/Parcelable;", "Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "links", "", "refundId", "transitCardId", "productId", RemoteConfigConstants.ResponseFieldKey.STATE, "operationType", "", "amount", "userId", "", "createdTsEpoch", "Lorg/joda/time/DateTime;", "createdTs", "lastModifiedTsEpoch", "lastModifiedTs", "Lfo2/d;", "cardMetaData", "<init>", "(Lcom/garmin/feature/garminpay/providers/gpay/model/Links;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;JLorg/joda/time/DateTime;JLorg/joda/time/DateTime;Lfo2/d;)V", "a", "Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "b", "()Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "getTransitCardId", "getProductId", JWKParameterNames.RSA_EXPONENT, "f", "getOperationType", "g", "D", "getAmount", "()D", "h", IntegerTokenConverter.CONVERTER_KEY, "J", "getCreatedTsEpoch", "()J", "j", "Lorg/joda/time/DateTime;", "getCreatedTs", "()Lorg/joda/time/DateTime;", JWKParameterNames.OCT_KEY_VALUE, "getLastModifiedTsEpoch", "l", "getLastModifiedTs", "m", "Lfo2/d;", "getCardMetaData", "()Lfo2/d;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c0 implements Parcelable {
    public static final Parcelable.Creator<c0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("_links")
    private final Links links;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("refundId")
    private final String refundId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("transitCardId")
    private final String transitCardId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("productId")
    private final String productId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.ResponseFieldKey.STATE)
    private final String state;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("operationType")
    private final String operationType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("amount")
    private final double amount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userId")
    private final String userId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createdTsEpoch")
    private final long createdTsEpoch;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createdTs")
    private final DateTime createdTs;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastModifiedTsEpoch")
    private final long lastModifiedTsEpoch;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastModifiedTs")
    private final DateTime lastModifiedTs;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cardMetaData")
    private final d cardMetaData;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c0> {
        @Override // android.os.Parcelable.Creator
        public final c0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c0((Links) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readLong(), (DateTime) parcel.readSerializable(), parcel.readLong(), (DateTime) parcel.readSerializable(), d.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final c0[] newArray(int i14) {
            return new c0[i14];
        }
    }

    public c0(Links links, String str, String str2, String str3, String str4, String str5, double d14, String str6, long j8, DateTime dateTime, long j14, DateTime dateTime2, d dVar) {
        links.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        dateTime.getClass();
        dateTime2.getClass();
        dVar.getClass();
        this.links = links;
        this.refundId = str;
        this.transitCardId = str2;
        this.productId = str3;
        this.state = str4;
        this.operationType = str5;
        this.amount = d14;
        this.userId = str6;
        this.createdTsEpoch = j8;
        this.createdTs = dateTime;
        this.lastModifiedTsEpoch = j14;
        this.lastModifiedTs = dateTime2;
        this.cardMetaData = dVar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Links getLinks() {
        return this.links;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRefundId() {
        return this.refundId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return p005kotlin.jvm.internal.s.g(this.links, c0Var.links) && p005kotlin.jvm.internal.s.g(this.refundId, c0Var.refundId) && p005kotlin.jvm.internal.s.g(this.transitCardId, c0Var.transitCardId) && p005kotlin.jvm.internal.s.g(this.productId, c0Var.productId) && p005kotlin.jvm.internal.s.g(this.state, c0Var.state) && p005kotlin.jvm.internal.s.g(this.operationType, c0Var.operationType) && Double.compare(this.amount, c0Var.amount) == 0 && p005kotlin.jvm.internal.s.g(this.userId, c0Var.userId) && this.createdTsEpoch == c0Var.createdTsEpoch && p005kotlin.jvm.internal.s.g(this.createdTs, c0Var.createdTs) && this.lastModifiedTsEpoch == c0Var.lastModifiedTsEpoch && p005kotlin.jvm.internal.s.g(this.lastModifiedTs, c0Var.lastModifiedTs) && p005kotlin.jvm.internal.s.g(this.cardMetaData, c0Var.cardMetaData);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        return this.cardMetaData.hashCode() + ds.e0.a(q6.f.e(ds.e0.a(q6.f.e(wr.g.j(org.apache.commons.lang3.e.b(wr.g.j(wr.g.j(wr.g.j(wr.g.j(wr.g.j(this.links.f51142a.hashCode() * 31, 31, this.refundId), 31, this.transitCardId), 31, this.productId), 31, this.state), 31, this.operationType), 31, this.amount), 31, this.userId), 31, this.createdTsEpoch), this.createdTs, 31), 31, this.lastModifiedTsEpoch), this.lastModifiedTs, 31);
    }

    public final String toString() {
        Links links = this.links;
        String str = this.refundId;
        String str2 = this.transitCardId;
        String str3 = this.productId;
        String str4 = this.state;
        String str5 = this.operationType;
        double d14 = this.amount;
        String str6 = this.userId;
        long j8 = this.createdTsEpoch;
        DateTime dateTime = this.createdTs;
        long j14 = this.lastModifiedTsEpoch;
        DateTime dateTime2 = this.lastModifiedTs;
        d dVar = this.cardMetaData;
        StringBuilder sb3 = new StringBuilder("RefundFailedDto(links=");
        sb3.append(links);
        sb3.append(", refundId=");
        sb3.append(str);
        sb3.append(", transitCardId=");
        sn.a.t(sb3, str2, ", productId=", str3, ", state=");
        sn.a.t(sb3, str4, ", operationType=", str5, ", amount=");
        sb3.append(d14);
        sb3.append(", userId=");
        sb3.append(str6);
        j20.x.j(j8, ", createdTsEpoch=", ", createdTs=", sb3);
        sb3.append(dateTime);
        sb3.append(", lastModifiedTsEpoch=");
        sb3.append(j14);
        sb3.append(", lastModifiedTs=");
        sb3.append(dateTime2);
        sb3.append(", cardMetaData=");
        sb3.append(dVar);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.links);
        parcel.writeString(this.refundId);
        parcel.writeString(this.transitCardId);
        parcel.writeString(this.productId);
        parcel.writeString(this.state);
        parcel.writeString(this.operationType);
        parcel.writeDouble(this.amount);
        parcel.writeString(this.userId);
        parcel.writeLong(this.createdTsEpoch);
        parcel.writeSerializable(this.createdTs);
        parcel.writeLong(this.lastModifiedTsEpoch);
        parcel.writeSerializable(this.lastModifiedTs);
        this.cardMetaData.writeToParcel(parcel, i14);
    }
}
