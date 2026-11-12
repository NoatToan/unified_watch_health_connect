package uo2;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.Map;
import kg.f;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p6.b;
import vb.h;
import wr.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010\u0017R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0015\u001a\u0004\b#\u0010\u0017R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0015\u001a\u0004\b)\u0010\u0017R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0015\u001a\u0004\b+\u0010\u0017R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u0015\u001a\u0004\b-\u0010\u0017R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Luo2/a;", "", "", "refundId", RemoteConfigConstants.ResponseFieldKey.STATE, "transitCardId", "purchaseId", "providerId", "productId", "productName", "operationType", "", "refundAmount", "initiatedBy", "errorReason", "timeToCompleteMs", "", "timeToFailMs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "getState", "c", "getTransitCardId", "d", "getPurchaseId", JWKParameterNames.RSA_EXPONENT, "getProviderId", "f", "getProductId", "g", "h", "getOperationType", IntegerTokenConverter.CONVERTER_KEY, "D", "getRefundAmount", "()D", "j", "getInitiatedBy", JWKParameterNames.OCT_KEY_VALUE, "getErrorReason", "l", "getTimeToCompleteMs", "m", "Ljava/lang/Integer;", "getTimeToFailMs", "()Ljava/lang/Integer;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C3210a f172125n = new C3210a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("refundId")
    private final String refundId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.ResponseFieldKey.STATE)
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("transitCardId")
    private final String transitCardId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("purchaseId")
    private final String purchaseId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("providerId")
    private final String providerId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("productId")
    private final String productId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("productName")
    private final String productName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("operationType")
    private final String operationType;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("refundAmount")
    private final double refundAmount;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("initiatedBy")
    private final String initiatedBy;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("errorReason")
    private final String errorReason;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timeToCompleteMs")
    private final String timeToCompleteMs;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timeToFailMs")
    private final Integer timeToFailMs;

    public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, double d14, String str9, String str10, String str11, Integer num) {
        hb.a.p(str, str2, str3, str5, str6);
        f.p(str7, str8, str9, str10);
        this.refundId = str;
        this.state = str2;
        this.transitCardId = str3;
        this.purchaseId = str4;
        this.providerId = str5;
        this.productId = str6;
        this.productName = str7;
        this.operationType = str8;
        this.refundAmount = d14;
        this.initiatedBy = str9;
        this.errorReason = str10;
        this.timeToCompleteMs = str11;
        this.timeToFailMs = num;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getRefundId() {
        return this.refundId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.refundId, aVar.refundId) && s.g(this.state, aVar.state) && s.g(this.transitCardId, aVar.transitCardId) && s.g(this.purchaseId, aVar.purchaseId) && s.g(this.providerId, aVar.providerId) && s.g(this.productId, aVar.productId) && s.g(this.productName, aVar.productName) && s.g(this.operationType, aVar.operationType) && Double.compare(this.refundAmount, aVar.refundAmount) == 0 && s.g(this.initiatedBy, aVar.initiatedBy) && s.g(this.errorReason, aVar.errorReason) && s.g(this.timeToCompleteMs, aVar.timeToCompleteMs) && s.g(this.timeToFailMs, aVar.timeToFailMs);
    }

    public final int hashCode() {
        int iJ = g.j(g.j(this.refundId.hashCode() * 31, 31, this.state), 31, this.transitCardId);
        String str = this.purchaseId;
        int iJ2 = g.j(g.j(e.b(g.j(g.j(g.j(g.j((iJ + (str == null ? 0 : str.hashCode())) * 31, 31, this.providerId), 31, this.productId), 31, this.productName), 31, this.operationType), 31, this.refundAmount), 31, this.initiatedBy), 31, this.errorReason);
        String str2 = this.timeToCompleteMs;
        int iHashCode = (iJ2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.timeToFailMs;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        String str = this.refundId;
        String str2 = this.state;
        String str3 = this.transitCardId;
        String str4 = this.purchaseId;
        String str5 = this.providerId;
        String str6 = this.productId;
        String str7 = this.productName;
        String str8 = this.operationType;
        double d14 = this.refundAmount;
        String str9 = this.initiatedBy;
        String str10 = this.errorReason;
        String str11 = this.timeToCompleteMs;
        Integer num = this.timeToFailMs;
        StringBuilder sbI = b.i("RefundFailedDto(refundId=", str, ", state=", str2, ", transitCardId=");
        sn.a.t(sbI, str3, ", purchaseId=", str4, ", providerId=");
        sn.a.t(sbI, str5, ", productId=", str6, ", productName=");
        sn.a.t(sbI, str7, ", operationType=", str8, ", refundAmount=");
        sbI.append(d14);
        sbI.append(", initiatedBy=");
        sbI.append(str9);
        sn.a.t(sbI, ", errorReason=", str10, ", timeToCompleteMs=", str11);
        sbI.append(", timeToFailMs=");
        sbI.append(num);
        sbI.append(")");
        return sbI.toString();
    }

    /* JADX INFO: renamed from: uo2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luo2/a$a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3210a {
        public /* synthetic */ C3210a(j jVar) {
            this();
        }

        public static a a(Map map) {
            map.getClass();
            String str = (String) map.get(to2.a.EnumC3119a.FITPAY_PAYLOAD.f165868a);
            if (str == null || str.length() == 0) {
                h.s("FitPay payload is null or empty");
                return null;
            }
            aq2.j.f12491a.getClass();
            Object objFromJson = aq2.j.d().fromJson(str, (Class<Object>) a.class);
            objFromJson.getClass();
            return (a) objFromJson;
        }

        private C3210a() {
        }
    }
}
