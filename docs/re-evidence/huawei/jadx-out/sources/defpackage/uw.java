package defpackage;

import com.braintreepayments.api.Authorization;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/braintreepayments/api/TokenizationKey;", "Lcom/braintreepayments/api/Authorization;", "tokenizationKey", "", "(Ljava/lang/String;)V", "bearer", "getBearer", "()Ljava/lang/String;", "configUrl", "getConfigUrl", "environment", "getEnvironment", HwPayConstant.KEY_MERCHANTID, "getMerchantId", "url", "getUrl", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class uw extends Authorization {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f50625b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50626a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f50627c;
    private final String d;
    private final String e;
    private final String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw(String str) {
        super(str);
        zcp.c(str, "");
        this.e = getRawValue();
        List listB = zes.b((CharSequence) str, new String[]{"_"}, false, 3, 2, (Object) null);
        String str2 = (String) listB.get(0);
        this.f50626a = str2;
        String str3 = (String) listB.get(2);
        this.d = str3;
        String str4 = f50625b.c(str2) + "merchants/" + str3 + "/client_api/";
        this.f = str4;
        this.f50627c = str4 + "v1/configuration";
    }

    @Override // com.braintreepayments.api.Authorization
    /* JADX INFO: renamed from: getConfigUrl, reason: from getter */
    public String getF49201a() {
        return this.f50627c;
    }

    @Override // com.braintreepayments.api.Authorization
    /* JADX INFO: renamed from: getBearer, reason: from getter */
    public String getD() {
        return this.e;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/braintreepayments/api/TokenizationKey$Companion;", "", "()V", "CONFIG_V1", "", "DEVELOPMENT_URL", "MATCHER", "PRODUCTION_URL", "SANDBOX_URL", "getUrl", "environment", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(String str) throws tw {
            int iHashCode = str.hashCode();
            if (iHashCode != -224813765) {
                if (iHashCode != 1753018553) {
                    if (iHashCode == 1865400007 && str.equals("sandbox")) {
                        return "https://api.sandbox.braintreegateway.com/";
                    }
                } else if (str.equals("production")) {
                    return "https://api.braintreegateway.com/";
                }
            } else if (str.equals("development")) {
                return "http://10.0.2.2:3000/";
            }
            throw new tw("Tokenization Key contained invalid environment");
        }

        public /* synthetic */ a(zcm zcmVar) {
            this();
        }
    }
}
