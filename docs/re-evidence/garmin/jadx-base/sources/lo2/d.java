package lo2;

import am.j;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Llo2/d;", "", "Llo2/e;", "aliPayTradeAppPayResponse", "", "sign", "signType", "<init>", "(Llo2/e;Ljava/lang/String;Ljava/lang/String;)V", "a", "Llo2/e;", "()Llo2/e;", "b", "Ljava/lang/String;", "getSign", "()Ljava/lang/String;", "c", "getSignType", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("alipay_trade_app_pay_response")
    private final e aliPayTradeAppPayResponse;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sign")
    private final String sign;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sign_type")
    private final String signType;

    public d(e eVar, String str, String str2) {
        eVar.getClass();
        str.getClass();
        str2.getClass();
        this.aliPayTradeAppPayResponse = eVar;
        this.sign = str;
        this.signType = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final e getAliPayTradeAppPayResponse() {
        return this.aliPayTradeAppPayResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.aliPayTradeAppPayResponse, dVar.aliPayTradeAppPayResponse) && s.g(this.sign, dVar.sign) && s.g(this.signType, dVar.signType);
    }

    public final int hashCode() {
        return this.signType.hashCode() + g.j(this.aliPayTradeAppPayResponse.hashCode() * 31, 31, this.sign);
    }

    public final String toString() {
        e eVar = this.aliPayTradeAppPayResponse;
        String str = this.sign;
        String str2 = this.signType;
        StringBuilder sb3 = new StringBuilder("AliPayResultDetail(aliPayTradeAppPayResponse=");
        sb3.append(eVar);
        sb3.append(", sign=");
        sb3.append(str);
        sb3.append(", signType=");
        return j.o(str2, ")", sb3);
    }
}
