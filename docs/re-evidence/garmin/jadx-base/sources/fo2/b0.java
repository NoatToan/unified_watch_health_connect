package fo2;

import com.garmin.feature.garminpay.providers.gpay.util.deserializers.EncryptedDataSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.Map;
import p005kotlin.Metadata;
import p13.t0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B?\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rB!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\u000eB1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lfo2/b0;", "", "", "deviceId", "Lfo2/x;", "paymentChannel", "", "totalCost", "totalCredit", "", "Lcom/google/gson/JsonElement;", "encryptedData", "<init>", "(Ljava/lang/String;Lfo2/x;DDLjava/util/Map;)V", "(Lfo2/x;DD)V", "phoneNumber", "(Ljava/lang/String;Lfo2/x;DDLjava/lang/String;)V", "a", "Ljava/lang/String;", "getDeviceId", "()Ljava/lang/String;", "b", "Lfo2/x;", "getPaymentChannel", "()Lfo2/x;", "c", "D", "getTotalCost", "()D", "d", "getTotalCredit", JWKParameterNames.RSA_EXPONENT, "Ljava/util/Map;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private final String deviceId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("paymentChannel")
    private final x paymentChannel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalCost")
    private final double totalCost;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalCredit")
    private final double totalCredit;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("encryptedData")
    @JsonAdapter(EncryptedDataSerializer.class)
    private final Map<String, JsonElement> encryptedData;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(String str, x xVar, double d14, double d15, String str2) {
        this(str, xVar, d14, d15, (Map<String, ? extends JsonElement>) t0.b(new o13.p("phoneNumber", new JsonPrimitive(str2))));
        str.getClass();
        xVar.getClass();
        str2.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return p005kotlin.jvm.internal.s.g(this.deviceId, b0Var.deviceId) && this.paymentChannel == b0Var.paymentChannel && Double.compare(this.totalCost, b0Var.totalCost) == 0 && Double.compare(this.totalCredit, b0Var.totalCredit) == 0 && p005kotlin.jvm.internal.s.g(this.encryptedData, b0Var.encryptedData);
    }

    public final int hashCode() {
        String str = this.deviceId;
        return this.encryptedData.hashCode() + org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b((this.paymentChannel.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.totalCost), 31, this.totalCredit);
    }

    public final String toString() {
        String str = this.deviceId;
        x xVar = this.paymentChannel;
        double d14 = this.totalCost;
        double d15 = this.totalCredit;
        Map<String, JsonElement> map = this.encryptedData;
        StringBuilder sb3 = new StringBuilder("PurchaseRequest(deviceId=");
        sb3.append(str);
        sb3.append(", paymentChannel=");
        sb3.append(xVar);
        sb3.append(", totalCost=");
        sb3.append(d14);
        am.j.x(sb3, ", totalCredit=", d15, ", encryptedData=");
        return am.j.s(sb3, map, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b0(String str, x xVar, double d14, double d15, Map<String, ? extends JsonElement> map) {
        this.deviceId = str;
        this.paymentChannel = xVar;
        this.totalCost = d14;
        this.totalCredit = d15;
        this.encryptedData = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b0(x xVar, double d14, double d15) {
        xVar.getClass();
        p13.k0 k0Var = p13.k0.f134949a;
        k0Var.getClass();
        this((String) null, xVar, d14, d15, k0Var);
    }
}
