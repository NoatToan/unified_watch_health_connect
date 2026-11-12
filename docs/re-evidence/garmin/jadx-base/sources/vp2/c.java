package vp2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.Date;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u000f\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012¨\u0006 "}, d2 = {"Lvp2/c;", "", "", TtmlNode.ATTR_ID, "transactionType", "", "amount", "currencyCode", "Lvp2/a;", "fitPayCardAuthorizationStatus", "Ljava/util/Date;", "transactionTime", "merchantName", "<init>", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Lvp2/a;Ljava/util/Date;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getTransactionType", "c", "D", "()D", "d", JWKParameterNames.RSA_EXPONENT, "Lvp2/a;", "()Lvp2/a;", "f", "Ljava/util/Date;", "()Ljava/util/Date;", "g", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("transactionId")
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("transactionType")
    private final String transactionType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("amount")
    private final double amount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("currencyCode")
    private final String currencyCode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("authorizationStatus")
    private final a fitPayCardAuthorizationStatus;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("transactionTime")
    private final Date transactionTime;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("merchantName")
    private final String merchantName;

    public /* synthetic */ c(String str, String str2, double d14, String str3, a aVar, Date date, String str4, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? null : str2, d14, (i14 & 8) != 0 ? null : str3, aVar, (i14 & 32) != 0 ? null : date, str4);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getFitPayCardAuthorizationStatus() {
        return this.fitPayCardAuthorizationStatus;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMerchantName() {
        return this.merchantName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Date getTransactionTime() {
        return this.transactionTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.id, cVar.id) && s.g(this.transactionType, cVar.transactionType) && Double.compare(this.amount, cVar.amount) == 0 && s.g(this.currencyCode, cVar.currencyCode) && this.fitPayCardAuthorizationStatus == cVar.fitPayCardAuthorizationStatus && s.g(this.transactionTime, cVar.transactionTime) && s.g(this.merchantName, cVar.merchantName);
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.transactionType;
        int iB = e.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.amount);
        String str2 = this.currencyCode;
        int iHashCode2 = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        a aVar = this.fitPayCardAuthorizationStatus;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Date date = this.transactionTime;
        return this.merchantName.hashCode() + ((iHashCode3 + (date != null ? date.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.transactionType;
        double d14 = this.amount;
        String str3 = this.currencyCode;
        a aVar = this.fitPayCardAuthorizationStatus;
        Date date = this.transactionTime;
        String str4 = this.merchantName;
        StringBuilder sbI = p6.b.i("FitPayCardTransaction(id=", str, ", transactionType=", str2, ", amount=");
        sbI.append(d14);
        sbI.append(", currencyCode=");
        sbI.append(str3);
        sbI.append(", fitPayCardAuthorizationStatus=");
        sbI.append(aVar);
        sbI.append(", transactionTime=");
        sbI.append(date);
        return e0.h(sbI, ", merchantName=", str4, ")");
    }

    public c(String str, String str2, double d14, String str3, a aVar, Date date, String str4) {
        str.getClass();
        str4.getClass();
        this.id = str;
        this.transactionType = str2;
        this.amount = d14;
        this.currencyCode = str3;
        this.fitPayCardAuthorizationStatus = aVar;
        this.transactionTime = date;
        this.merchantName = str4;
    }
}
