package defpackage;

import android.text.TextUtils;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B%\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/braintreepayments/api/VenmoConfiguration;", "", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "accessToken", "", "environment", HwPayConstant.KEY_MERCHANTID, "enrichedCustomerDataEnabled", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAccessToken", "()Ljava/lang/String;", "getEnrichedCustomerDataEnabled", "()Z", "getEnvironment", "isAccessTokenValid", "getMerchantId", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class vd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50950a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f50951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f50952c;
    private final boolean d;
    private final boolean e;
    private final String h;

    public vd(String str, String str2, String str3, boolean z) {
        zcp.c(str, "");
        zcp.c(str2, "");
        zcp.c(str3, "");
        this.f50951b = str;
        this.f50952c = str2;
        this.h = str3;
        this.e = z;
        this.d = !TextUtils.isEmpty(str);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getF50951b() {
        return this.f50951b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF50952c() {
        return this.f50952c;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getH() {
        return this.h;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getE() {
        return this.e;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public vd(JSONObject jSONObject) {
        String strE = tu.e(jSONObject, "accessToken", "");
        zcp.b((Object) strE, "");
        String strE2 = tu.e(jSONObject, "environment", "");
        zcp.b((Object) strE2, "");
        String strE3 = tu.e(jSONObject, HwPayConstant.KEY_MERCHANTID, "");
        zcp.b((Object) strE3, "");
        Boolean boolC = tu.c(jSONObject, "enrichedCustomerDataEnabled", false);
        zcp.b((Object) boolC, "");
        this(strE, strE2, strE3, boolC.booleanValue());
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getD() {
        return this.d;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/braintreepayments/api/VenmoConfiguration$Companion;", "", "()V", "ACCESS_TOKEN_KEY", "", "ECD_ENABLED_KEY", "ENVIRONMENT_KEY", "MERCHANT_ID_KEY", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(zcm zcmVar) {
            this();
        }
    }
}
