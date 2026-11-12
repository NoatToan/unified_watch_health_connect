package defpackage;

import android.util.Base64;
import com.braintreepayments.api.Authorization;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/braintreepayments/api/ClientToken;", "Lcom/braintreepayments/api/Authorization;", "clientTokenString", "", "(Ljava/lang/String;)V", "authorizationFingerprint", "getAuthorizationFingerprint", "()Ljava/lang/String;", "bearer", "getBearer", "configUrl", "getConfigUrl", "customerId", "getCustomerId", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class tj extends Authorization {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f49200b = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f49201a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f49202c;
    private final String d;
    private final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj(String str) throws tw {
        super(str);
        zcp.c(str, "");
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            zcp.b((Object) bArrDecode, "");
            JSONObject jSONObject = new JSONObject(new String(bArrDecode, zel.h));
            String string = jSONObject.getString("configUrl");
            zcp.b((Object) string, "");
            this.f49201a = string;
            String string2 = jSONObject.getString("authorizationFingerprint");
            zcp.b((Object) string2, "");
            this.e = string2;
            this.d = string2;
            this.f49202c = f49200b.b(string2);
        } catch (NullPointerException unused) {
            throw new tw("Client token was invalid");
        } catch (JSONException unused2) {
            throw new tw("Client token was invalid");
        }
    }

    @Override // com.braintreepayments.api.Authorization
    /* JADX INFO: renamed from: getConfigUrl, reason: from getter */
    public String getF50627c() {
        return this.f49201a;
    }

    @Override // com.braintreepayments.api.Authorization
    /* JADX INFO: renamed from: getBearer, reason: from getter */
    public String getE() {
        return this.d;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getE() {
        return this.e;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/braintreepayments/api/ClientToken$Companion;", "", "()V", "AUTHORIZATION_FINGERPRINT_KEY", "", "BASE_64_MATCHER", "CONFIG_URL_KEY", "parseCustomerId", "authorizationFingerprint", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class c {
        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(String str) {
            if (str != null) {
                for (String str2 : zes.b((CharSequence) str, new String[]{"&"}, false, 0, 6, (Object) null)) {
                    if (zes.b((CharSequence) str2, (CharSequence) "customer_id=", false, 2, (Object) null)) {
                        List listB = zes.b((CharSequence) str2, new String[]{"="}, false, 0, 6, (Object) null);
                        if (listB.size() > 1) {
                            return (String) listB.get(1);
                        }
                    }
                }
                return null;
            }
            return null;
        }

        public /* synthetic */ c(zcm zcmVar) {
            this();
        }
    }
}
