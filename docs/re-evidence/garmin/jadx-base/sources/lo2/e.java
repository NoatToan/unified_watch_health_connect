package lo2;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.feature.garminpay.providers.gpay.snowball.alipay.AliPayLocalDateTimeTypeAdapter;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0012R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u0012R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b \u0010\u0012R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b\"\u0010\u0012R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0011\u001a\u0004\b$\u0010\u0012¨\u0006%"}, d2 = {"Llo2/e;", "", "", "code", "message", RemoteConfigConstants.RequestFieldKey.APP_ID, "authAppId", "charset", "Lorg/joda/time/LocalDateTime;", "timestamp", "outTradeNo", "totalAmount", "tradeNo", "sellerId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/LocalDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "getMessage", "c", "getAppId", "d", "getAuthAppId", JWKParameterNames.RSA_EXPONENT, "getCharset", "f", "Lorg/joda/time/LocalDateTime;", "g", "getOutTradeNo", "h", "getTotalAmount", IntegerTokenConverter.CONVERTER_KEY, "getTradeNo", "j", "getSellerId", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("code")
    private final String code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("msg")
    private final String message;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("app_id")
    private final String appId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("auth_app_id")
    private final String authAppId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("charset")
    private final String charset;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timestamp")
    @JsonAdapter(AliPayLocalDateTimeTypeAdapter.class)
    private final LocalDateTime timestamp;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("out_trade_no")
    private final String outTradeNo;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("total_amount")
    private final String totalAmount;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trade_no")
    private final String tradeNo;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("seller_id")
    private final String sellerId;

    public e(String str, String str2, String str3, String str4, String str5, LocalDateTime localDateTime, String str6, String str7, String str8, String str9) {
        this.code = str;
        this.message = str2;
        this.appId = str3;
        this.authAppId = str4;
        this.charset = str5;
        this.timestamp = localDateTime;
        this.outTradeNo = str6;
        this.totalAmount = str7;
        this.tradeNo = str8;
        this.sellerId = str9;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.code, eVar.code) && s.g(this.message, eVar.message) && s.g(this.appId, eVar.appId) && s.g(this.authAppId, eVar.authAppId) && s.g(this.charset, eVar.charset) && s.g(this.timestamp, eVar.timestamp) && s.g(this.outTradeNo, eVar.outTradeNo) && s.g(this.totalAmount, eVar.totalAmount) && s.g(this.tradeNo, eVar.tradeNo) && s.g(this.sellerId, eVar.sellerId);
    }

    public final int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.appId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.authAppId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.charset;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        LocalDateTime localDateTime = this.timestamp;
        int iHashCode6 = (iHashCode5 + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        String str6 = this.outTradeNo;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.totalAmount;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.tradeNo;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.sellerId;
        return iHashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        String str = this.code;
        String str2 = this.message;
        String str3 = this.appId;
        String str4 = this.authAppId;
        String str5 = this.charset;
        LocalDateTime localDateTime = this.timestamp;
        String str6 = this.outTradeNo;
        String str7 = this.totalAmount;
        String str8 = this.tradeNo;
        String str9 = this.sellerId;
        StringBuilder sbI = p6.b.i("AliPayTradeAppPayResponse(code=", str, ", message=", str2, ", appId=");
        sn.a.t(sbI, str3, ", authAppId=", str4, ", charset=");
        sbI.append(str5);
        sbI.append(", timestamp=");
        sbI.append(localDateTime);
        sbI.append(", outTradeNo=");
        sn.a.t(sbI, str6, ", totalAmount=", str7, ", tradeNo=");
        return e5.h(sbI, str8, ", sellerId=", str9, ")");
    }
}
